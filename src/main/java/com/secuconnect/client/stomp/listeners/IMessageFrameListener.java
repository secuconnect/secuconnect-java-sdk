package com.secuconnect.client.stomp.listeners;

import com.secuconnect.client.stomp.communication.frame.StompFrame;

public interface IMessageFrameListener extends IFrameListener {
    public void onMessage(StompFrame frame);
}
