package com.secuconnect.client.stomp.listeners;

import com.secuconnect.client.stomp.communication.frame.StompFrame;

public interface IConnectedFrameListener extends IFrameListener {
    public void onConnected(StompFrame frame);
}
