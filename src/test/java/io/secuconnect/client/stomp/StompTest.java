package io.secuconnect.client.stomp;

import io.secuconnect.client.ApiException;
import io.secuconnect.client.auth.Authenticator;
import io.secuconnect.client.auth.tokens.OAuthClientToken;
import io.secuconnect.client.stomp.communication.StompCommunicationManager;
import io.secuconnect.client.stomp.listeners.def.impl.ConnectedFrameListener;
import io.secuconnect.client.stomp.listeners.def.impl.ErrorFrameListener;
import io.secuconnect.client.stomp.listeners.def.impl.MessageFrameListener;
import io.secuconnect.client.stomp.listeners.def.impl.ReceiptFrameListener;
import org.junit.Test;

import static io.secuconnect.client.Globals.O_AUTH_CLIENT_CREDENTIALS;

import org.junit.Ignore;

public class StompTest {

	@Ignore
    @Test
    public void stompTest() {
        Authenticator authenticator = new Authenticator(O_AUTH_CLIENT_CREDENTIALS);
        String accessToken = null;

        try {
            OAuthClientToken token = (OAuthClientToken) authenticator.getToken();
            accessToken = token.getAccessToken();
        } catch (ApiException e) {
            e.printStackTrace();
        }

        StompCommunicationManager scm = StompCommunicationManager.createInstance(accessToken);

        scm.addFrameListener(new ConnectedFrameListener());
        scm.addFrameListener(new MessageFrameListener());
        scm.addFrameListener(new ReceiptFrameListener());
        scm.addFrameListener(new ErrorFrameListener());

        scm.connect(1000);

        scm.send("api:get:Payment.Customers", "");
        scm.send("api:get:Payment.Customers", "", "my-receipt1");

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
}
