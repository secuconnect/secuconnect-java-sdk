package io.secuconnect.client.stomp.communication;

import io.secuconnect.client.stomp.communication.frame.StompFrame;
import io.secuconnect.client.stomp.listeners.IConnectedFrameListener;
import io.secuconnect.client.stomp.listeners.IFrameListener;
import io.secuconnect.client.stomp.model.AuthSessionsRefresh;
import io.secuconnect.client.stomp.model.StompRequest;
import io.secuconnect.client.stomp.communication.StompMessageSender;

import javax.net.ssl.SSLSocket;
import javax.net.ssl.SSLSocketFactory;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.util.*;

import static io.secuconnect.client.stomp.communication.frame.FrameCommands.Request.CONNECT;
import static io.secuconnect.client.stomp.communication.frame.FrameCommands.Request.SEND;
import static io.secuconnect.client.stomp.communication.frame.FrameHeaders.CONTENT_TYPE;
import static io.secuconnect.client.stomp.communication.frame.FrameHeaders.Request.Connect.*;
import static io.secuconnect.client.stomp.communication.frame.FrameHeaders.Request.RECEIPT;
import static io.secuconnect.client.stomp.communication.frame.FrameHeaders.Request.Send.DESTINATION;

public class StompCommunicationManager {
    private static final int SESSION_REFRESH_INTERVAL = 120;
    private static StompCommunicationManager instance;
    private StompMessageSender sender;
    private StompMessageReader reader;
    private Properties properties;
    private SSLSocket socket;

    private String accessToken;
    private boolean connected;

    /**
     * @param accessToken obtained from api access token
     */
    private StompCommunicationManager(String accessToken) {
        this.accessToken = accessToken;
        this.connected = false;
    }

    /**
     * @param accessToken obtained from api access token
     * @return StompCommunicationManager object (only one per sdk is allowed)
     * @throws NullPointerException if access token is missing
     * @throws RuntimeException if this method was already invoked
     */
    public static StompCommunicationManager createInstance(String accessToken) throws NullPointerException, RuntimeException {
        if (instance != null) throw new RuntimeException("only one class instance is allowed");
        if (accessToken == null) throw new NullPointerException("accessToken cannot be null");
        instance = new StompCommunicationManager(accessToken);
        return instance;
    }

    /**
     * @return StompCommunicationManager object (the same which was created earlier)
     * @throws RuntimeException if the createInstance() method wasn't invoked before
     */
    public static StompCommunicationManager getInstance() throws RuntimeException {
        if (instance == null)
            throw new RuntimeException("instance not yet created, use the createInstance method first");
        return instance;
    }

    /**
     * @param frameListener the listener for stomp messages,
     *                      IFrameListener does nothing, only interfaces that extend this one,
     *                      contain proper functions for receiving messages, see:
     *                      IConnectedFrameListener, IMessageFrameListener, IReceiptFrameListener, IErrorFrameListener
     */
    public void addFrameListener(IFrameListener frameListener) {
        this.reader.addFrameListener(frameListener);
    }

    /**
     * @param timeoutInMillis the time which this thread will wait for connection
     * @throws RuntimeException if the timeout was exceeded
     *
     * Only after a successful connection the "send()" method will be unlocked
     */
    public void connect(int timeoutInMillis) throws RuntimeException {
        this.properties = loadPropertiesFromConfigFile();
        this.socket = prepareSocket();

        this.sender = StompMessageSender.createInstance(this.socket);
        this.reader = StompMessageReader.createInstance(this.socket);

        reader.addFrameListener(new IConnectedFrameListener() {
            @Override
            public void onConnected(StompFrame frame) {
                connected = true;
            }
        });
        sender.sendFrame(StompFrame.createFromData(CONNECT, getConnectionHeaders(), ""));

        int millisWaited = 0;
        reader.start();

        while (!connected) {
            millisWaited += 10;
            if (millisWaited > timeoutInMillis) throw new RuntimeException("Could not establish a connection");
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }

        runRefreshAuthSession();
    }

    /**
     * Function to refreshing authentication session.
     */
    public void refreshAuthSession() {
        String path = "Auth.Sessions.refresh";
        String destination = "api:add:" + path;

        AuthSessionsRefresh authSessionsRefresh = new AuthSessionsRefresh();
        authSessionsRefresh.setRefreshInterval(SESSION_REFRESH_INTERVAL);

        StompRequest stompRequest = new StompRequest();
        stompRequest.setMethod(path);
        stompRequest.setAction("exec");
        stompRequest.setPid("me");
        stompRequest.setActionId(UUID.randomUUID().toString());

        String stompRequestToSend = stompRequest.toJson();

        while (connected) {
            this.send(destination, stompRequestToSend);

            try {
                Thread.sleep(SESSION_REFRESH_INTERVAL * 1000);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
    }

    /**
     * Function to running refreshAuthSession() method in the separate thread.
     */
    public void runRefreshAuthSession() {
        Thread refreshAuthSessionThread = new Thread(new Runnable() {
            public void run() {
                refreshAuthSession();
            }
        });
        refreshAuthSessionThread.start();
    }

    /**
     * @param destination where to send the message
     * @param body the actual message
     * @throws RuntimeException when not connected
     */
    public void send(String destination, String body) throws RuntimeException {
        if (!this.connected) throw new RuntimeException("Cannot send messages before connecting, use the \"connect()\" method");
        send(destination, body, null);
    }

    /**
     * @param destination where to send the message
     * @param body the actual message
     * @param receipt unique id or String that will be send back to confirm that the message was received by the server
     * @throws RuntimeException when not connected
     */
    public void send(String destination, String body, String receipt) throws RuntimeException {
        if (!this.connected) throw new RuntimeException("Cannot send messages before connecting, use the \"connect()\" method");
        Map<String, String> headers = getSendHeaders();
        headers.put(DESTINATION, properties.getProperty("base-destination") + destination);
        if (receipt != null) headers.put(RECEIPT, receipt);

        if (body == null) {
            body = "";
        }

        sender.sendFrame(StompFrame.createFromData(SEND, headers, body));
    }

    /**
     * @return Map<String, String> which is a list of proper headers for sending the CONNECT message to server
     */
    private Map<String, String> getConnectionHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put(REPLY_TO, properties.getProperty("reply-to"));
        headers.put(CONTENT_TYPE, properties.getProperty("content-type"));
        headers.put(CORRELATION_ID, properties.getProperty("correlation-id"));
        headers.put(CLIENT_ID, accessToken);
        headers.put(USER_ID, accessToken);
        headers.put(LOGIN, accessToken);
        headers.put(PASSCODE, accessToken);
        return headers;
    }

    /**
     * @return Map<String, String> which is a list of proper headers for sending the SEND message to server
     */
    private Map<String, String> getSendHeaders() {
        Map<String, String> headers = new HashMap<>();
        headers.put(REPLY_TO, properties.getProperty("reply-to"));
        headers.put(CONTENT_TYPE, properties.getProperty("content-type"));
        headers.put(CORRELATION_ID, properties.getProperty("correlation-id"));
        headers.put(CLIENT_ID, accessToken);
        headers.put(USER_ID, accessToken);
        return headers;
    }

    /**
     * @return SSLSocket the socket for communicating with stomp server
     */
    private SSLSocket prepareSocket() {
        SSLSocket socket = null;

        try {
            socket = (SSLSocket) SSLSocketFactory.getDefault().createSocket(
                    properties.getProperty("host"),
                    Integer.parseInt(properties.getProperty("port"))
            );
            socket.setEnabledProtocols(properties.getProperty("supported-protocols").split(","));
        } catch (Exception e) {
            e.printStackTrace();
        }

        return socket;
    }

    /**
     * @return Properties all the data necessary to communicate with stomp server
     */
    private Properties loadPropertiesFromConfigFile() {
        Properties properties = new Properties();
        InputStream input = null;

        try {
            input = new FileInputStream("./src/main/config.properties");
            properties.load(input);
        } catch (IOException ex) {
            ex.printStackTrace();
        } finally {
            if (input != null) {
                try {
                    input.close();
                    properties.put("correlation-id", UUID.randomUUID().toString());
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }

        return properties;
    }
}
