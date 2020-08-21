package com.secuconnect.client.stomp.listeners;

import com.secuconnect.client.stomp.communication.frame.StompFrame;

/**
 * @deprecated will be replaced in a new major version
 */
public interface IConnectedFrameListener extends IFrameListener {
    public void onConnected(StompFrame frame);
}
