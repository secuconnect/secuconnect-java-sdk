package io.secuconnect.client.stomp.listeners.def.impl;

import io.secuconnect.client.stomp.communication.frame.StompFrame;
import io.secuconnect.client.stomp.listeners.IReceiptFrameListener;

public class ReceiptFrameListener implements IReceiptFrameListener {
    @Override
    public void onReceipt(StompFrame frame) {
        System.out.println(frame);
    }
}
