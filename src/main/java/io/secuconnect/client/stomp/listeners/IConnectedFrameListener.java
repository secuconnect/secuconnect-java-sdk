package io.secuconnect.client.stomp.listeners;

import io.secuconnect.client.stomp.communication.frame.StompFrame;

public interface IConnectedFrameListener extends IFrameListener {
    public void onConnected(StompFrame frame);
}
