package com.secuconnect.client.stomp.communication;

import com.secuconnect.client.stomp.communication.frame.FrameCommands;
import com.secuconnect.client.stomp.communication.frame.StompFrame;
import com.secuconnect.client.stomp.listeners.*;

import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

/**
 * @deprecated will be replaced in a new major version
 */
public class StompMessageReader extends Thread {

    private static StompMessageReader instance;
    private Socket socket;

    private final List<IFrameListener> listeners;

    /**
     * @param socket the socket for communicating with stomp server
     */
    private StompMessageReader(Socket socket) {
        this.socket = socket;

        this.listeners = new ArrayList<>();
    }

    /**
     * @param socket the socket for communicating with stomp server
     * @return StompMessageReader object (only one per sdk is allowed)
     * @throws NullPointerException if socket is missing
     * @throws RuntimeException if this method was already invoked
     */
    public static StompMessageReader createInstance(Socket socket) {
        if (instance != null) throw new RuntimeException("only one class instance is allowed");
        if (socket == null) throw new NullPointerException("socket cannot be null");
        instance = new StompMessageReader(socket);
        return instance;
    }

    /**
     * @return StompMessageReader object (the same which was created earlier)
     * @throws RuntimeException if the createInstance() method wasn't invoked before
     */
    public static StompMessageReader getInstance() {
        if (instance == null)
            throw new RuntimeException("instance not yet created, use the createInstance method first");
        return instance;
    }

    /**
     * @param listener the listener for stomp messages,
     *                      IFrameListener does nothing, only interfaces that extend this one,
     *                      contain proper functions for receiving messages, see:
     *                      IConnectedFrameListener, IMessageFrameListener, IReceiptFrameListener, IErrorFrameListener
     */
    public void addFrameListener(IFrameListener listener) {
        this.listeners.add(listener);
    }

    /**
     * the loop for receiving data from stomp server
     */
    @Override
    public void run() {
        try {
            ByteArrayOutputStream inputBuffer = new ByteArrayOutputStream();
            InputStream inputStream = socket.getInputStream();
            int byteOfData = inputStream.read();
            while (byteOfData >= 0) {
                if (byteOfData == 0) {
                    byteOfData = inputStream.read();
                    if (byteOfData == '\n') {
                        byte[] ba = inputBuffer.toByteArray();
                        inputBuffer.reset();
                        triggerListeners(StompFrame.parseFromString(new String(ba, StandardCharsets.UTF_8)));
                    } else {
                        inputBuffer.write(0);
                    }
                }

                inputBuffer.write(byteOfData);
                byteOfData = inputStream.read();
            }
            throw new IOException("socket closed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    /**
     * @param frame the received frame (it will be passed to the right listeners)
     */
    private void triggerListeners(StompFrame frame) {
        if (FrameCommands.Response.CONNECTED.equals(frame.getCommand())) {
            for (IFrameListener listener : listeners) {
                if (listener instanceof IConnectedFrameListener) {
                    ((IConnectedFrameListener) listener).onConnected(frame);
                }
            }
        } else if (FrameCommands.Response.MESSAGE.equals(frame.getCommand())) {
            for (IFrameListener listener : listeners) {
                if (listener instanceof IMessageFrameListener) {
                    ((IMessageFrameListener) listener).onMessage(frame);
                }
            }
        } else if (FrameCommands.Response.RECEIPT.equals(frame.getCommand())) {
            for (IFrameListener listener : listeners) {
                if (listener instanceof IReceiptFrameListener) {
                    ((IReceiptFrameListener) listener).onReceipt(frame);
                }
            }
        } else if (FrameCommands.Response.ERROR.equals(frame.getCommand())) {
            for (IFrameListener listener : listeners) {
                if (listener instanceof IErrorFrameListener) {
                    ((IErrorFrameListener) listener).onError(frame);
                }
            }
        }
    }
}


