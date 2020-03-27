package io.secuconnect.client.stomp.listeners;

import io.secuconnect.client.stomp.communication.frame.StompFrame;

public interface IMessageFrameListener extends IFrameListener {
    public void onMessage(StompFrame frame);
}