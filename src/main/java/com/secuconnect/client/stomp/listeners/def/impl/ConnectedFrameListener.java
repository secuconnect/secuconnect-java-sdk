package com.secuconnect.client.stomp.listeners.def.impl;

import com.secuconnect.client.stomp.communication.frame.StompFrame;
import com.secuconnect.client.stomp.listeners.IConnectedFrameListener;

public class ConnectedFrameListener implements IConnectedFrameListener {
    @Override
    public void onConnected(StompFrame frame) {
        System.out.println(frame);
    }
}
