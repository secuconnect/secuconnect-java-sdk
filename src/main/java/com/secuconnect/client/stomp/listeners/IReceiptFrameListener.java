package com.secuconnect.client.stomp.listeners;

import com.secuconnect.client.stomp.communication.frame.StompFrame;

public interface IReceiptFrameListener extends IFrameListener {
    public void onReceipt(StompFrame frame);
}