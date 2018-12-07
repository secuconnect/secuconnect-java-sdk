package io.secuconnect.client.stomp.listeners.def.impl;

import io.secuconnect.client.stomp.communication.frame.StompFrame;
import io.secuconnect.client.stomp.listeners.IErrorFrameListener;

public class ErrorFrameListener implements IErrorFrameListener {
    @Override
    public void onError(StompFrame frame) {
        System.out.println(frame);
    }
}
