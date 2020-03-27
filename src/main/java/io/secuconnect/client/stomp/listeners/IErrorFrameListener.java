package io.secuconnect.client.stomp.listeners;

import io.secuconnect.client.stomp.communication.frame.StompFrame;

public interface IErrorFrameListener extends IFrameListener {
    public void onError(StompFrame frame);
}
