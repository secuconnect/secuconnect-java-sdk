package io.secuconnect.client.stomp.communication.frame;

public interface FrameCommands {

    public interface Request {
        String SEND = "SEND";
        String CONNECT = "CONNECT";
        String SUBSCRIBE = "SUBSCRIBE";
        String UNSUBSCRIBE = "UNSUBSCRIBE";
        String BEGIN = "BEGIN";
        String COMMIT = "COMMIT";
        String ABORT = "ABORT";
        String ACK = "ACK";
        String NACK = "NACK";
        String DISCONNECT = "DISCONNECT";
        String KEEPALIVE = "KEEPALIVE";
    }

    public interface Response {
        String CONNECTED = "CONNECTED";
        String ERROR = "ERROR";
        String MESSAGE = "MESSAGE";
        String RECEIPT = "RECEIPT";
    }
}

