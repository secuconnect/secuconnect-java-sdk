package com.secuconnect.client.stomp.communication;

import com.secuconnect.client.stomp.communication.frame.FrameCommands;
import com.secuconnect.client.stomp.communication.frame.FrameHeaders;
import com.secuconnect.client.stomp.communication.frame.StompFrame;

import javax.net.ssl.SSLSocket;
import java.io.IOException;
import java.net.Socket;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;
import java.util.Map;

public class StompMessageSender {

    private static StompMessageSender instance;
    private Socket socket;

    private StompMessageSender(Socket socket) {
        this.socket = socket;
    }


    /**
     * @param socket the socket for communicating with stomp server
     * @return StompMessageSender object (only one per sdk is allowed)
     * @throws NullPointerException if socket is missing
     * @throws RuntimeException if this method was already invoked
     */
    public static StompMessageSender createInstance(Socket socket) {
        if (instance != null)
            throw new RuntimeException("only one class instance is allowed");
        if (socket == null)
            throw new NullPointerException("socket cannot be null");
        instance = new StompMessageSender(socket);
        return instance;
    }

    /**
     * @return StompMessageSender object (the same which was created earlier)
     * @throws RuntimeException if the createInstance() method wasn't invoked before
     */
    public static StompMessageSender getInstance() {
        if (instance == null)
            throw new RuntimeException("instance not yet created, use the createInstance method first");
        return instance;
    }

    /**
     * @param frame the frame to send
     */
    public void sendFrame(StompFrame frame) {
        try {
            socket.getOutputStream().write(frame.sendingFormat().getBytes(StandardCharsets.UTF_8));
            socket.getOutputStream().flush();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}