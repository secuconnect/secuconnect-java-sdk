package io.secuconnect.client.stomp;

import io.secuconnect.client.ApiException;
import io.secuconnect.client.auth.Authenticator;
import io.secuconnect.client.auth.tokens.OAuthClientToken;
import org.apache.activemq.transport.stomp.StompConnection;
import org.apache.activemq.transport.stomp.StompFrame;
import org.junit.Test;

import java.util.HashMap;

import static io.secuconnect.client.Globals.O_AUTH_CLIENT_CREDENTIALS;
import static io.secuconnect.client.Globals.O_AUTH_DEVICE_CREDENTIALS;
import static junit.framework.TestCase.assertTrue;

public class StompTest {
    Authenticator authenticator;
    String accessToken = null;
    StompClient stompClient = new StompClient();

    @Test
    public void stompTest() {
//        authenticator = new Authenticator(O_AUTH_DEVICE_CREDENTIALS);
//        accessToken = authenticator.getDeviceAccessToken(O_AUTH_DEVICE_CREDENTIALS.getClientId(), O_AUTH_DEVICE_CREDENTIALS.getClientSecret(), O_AUTH_DEVICE_CREDENTIALS.getUuid());

        authenticator = new Authenticator(O_AUTH_CLIENT_CREDENTIALS);

        try {
            OAuthClientToken token = (OAuthClientToken) authenticator.getToken();
            accessToken = token.getAccessToken();
        } catch (ApiException e) {
            e.printStackTrace();
        }

        stompClient.setAccessToken(accessToken);
        stompClient.completeHeaders();

        stompClient.connect(accessToken, accessToken);

        String destination = stompClient.destinationOf("api:get:Payment.Customers");
//        HashMap<String, String> headers = stompClient.getHeaders();
        String msg = "";

//        connection.send(destination, msg, null, headers);
        stompClient.send(destination, msg, null);

//        StompFrame message = stompClient.receive();
//        String messageBody = message.getBody();

        String message = stompClient.receive();

        assertTrue("status is missing in messageBody", message.contains("status"));
        assertTrue("data is missing in messageBody", message.contains("data"));

        stompClient.disconnect();
        stompClient.close();
    }
}
