package com.secuconnect.client.stomp.listeners.def.impl;

import com.secuconnect.client.stomp.communication.frame.StompFrame;
import com.secuconnect.client.stomp.listeners.IReceiptFrameListener;

public class ReceiptFrameListener implements IReceiptFrameListener {
    @Override
    public void onReceipt(StompFrame frame) {
        System.out.println(frame);
    }
}
