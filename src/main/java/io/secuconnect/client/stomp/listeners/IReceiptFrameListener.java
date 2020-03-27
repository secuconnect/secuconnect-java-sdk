package io.secuconnect.client.stomp.listeners;

import io.secuconnect.client.stomp.communication.frame.StompFrame;

public interface IReceiptFrameListener extends IFrameListener {
    public void onReceipt(StompFrame frame);
}
