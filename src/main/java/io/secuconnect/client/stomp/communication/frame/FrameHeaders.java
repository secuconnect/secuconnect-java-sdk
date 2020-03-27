package io.secuconnect.client.stomp.communication.frame;

public interface FrameHeaders {
    String CONTENT_LENGTH = "content-length";
    String CONTENT_TYPE = "content-type";

    public interface Request {
        String RECEIPT = "receipt";
        String TRANSFORMATION = "transformation";
        String TRANSFORMATION_ERROR = "transformation-error";

        public interface Connect {
            String LOGIN = "login";
            String PASSCODE = "passcode";
            String CLIENT_ID = "client-id";
            String USER_ID = "user-id";
            String REQUEST_ID = "request-id";
            String ACCEPT_VERSION = "accept-version";
            String CORRELATION_ID = "correlation-id";
            String REPLY_TO = "reply-to";
            String HOST = "host";
            String HEART_BEAT = "heart-beat";
        }

        public interface Send {
            String DESTINATION = "destination";
            String TRANSACTION = "transaction";
            String CORRELATION_ID = "correlation-id";
            String EXPIRATION_TIME = "expires";
            String PRIORITY = "priority";
            String TYPE = "type";
            String PERSISTENT = "persistent";
        }

        public interface Subscribe {
            String DESTINATION = "destination";
            String ACK_MODE = "ack";
            String ID = "id";
            String SELECTOR = "selector";
            String BROWSER = "browser";

            public interface AckModeValues {
                String AUTO = "auto";
                String CLIENT = "client";
                String INDIVIDUAL = "client-individual";
            }
        }

        public interface Unsubscribe {
            String DESTINATION = "destination";
            String ID = "id";
        }

        public interface Begin {
            String TRANSACTION = "transaction";
        }

        public interface Commit {
            String TRANSACTION = "transaction";
        }

        public interface Abort {
            String TRANSACTION = "transaction";
        }

        public interface Ack {
            String MESSAGE_ID = "message-id";
            String SUBSCRIPTION = "subscription";
            String TRANSACTION = "transaction";
            String ACK_ID = "id";
        }

        public interface Nack {
            String TRANSACTION = "transaction";
        }

        public interface Disconnect {
        }
    }

    public interface Response {

        public interface Connected {
            String SESSION = "session";
            String RESPONSE_ID = "response-id";
            String SERVER = "server";
            String VERSION = "version";
            String HEART_BEAT = "heart-beat";
        }

        public interface Message {
            String MESSAGE_ID = "message-id";
            String ACK_ID = "ack";
            String DESTINATION = "destination";
            String CORRELATION_ID = "correlation-id";
            String EXPIRATION_TIME = "expires";
            String REPLY_TO = "reply-to";
            String PRORITY = "priority";
            String REDELIVERED = "redelivered";
            String TIMESTAMP = "timestamp";
            String TYPE = "type";
            String SUBSCRIPTION = "subscription";
            String BROWSER = "browser";
            String USERID = "JMSXUserID";
            String ORIGINAL_DESTINATION = "original-destination";
            String PERSISTENT = "persistent";
        }

        public interface Receipt {
            String RECEIPT_ID = "receipt-id";
        }

        public interface Error {
            String MESSAGE = "message";
        }
    }
}
