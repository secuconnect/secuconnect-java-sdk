package com.secuconnect.client.stomp.listeners;

import com.secuconnect.client.stomp.communication.frame.StompFrame;

public interface IErrorFrameListener extends IFrameListener {
    public void onError(StompFrame frame);
}
