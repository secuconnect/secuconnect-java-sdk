package com.secuconnect.client.stomp.listeners.def.impl;

import com.secuconnect.client.stomp.communication.frame.StompFrame;
import com.secuconnect.client.stomp.listeners.IMessageFrameListener;

public class MessageFrameListener implements IMessageFrameListener {
    @Override
    public void onMessage(StompFrame frame) {
        System.out.println(frame);
    }
}
