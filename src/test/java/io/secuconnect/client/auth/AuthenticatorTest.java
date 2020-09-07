package io.secuconnect.client.auth;

import io.secuconnect.client.ApiException;
import io.secuconnect.client.auth.tokens.OAuthClientToken;
import org.junit.Test;

import static io.secuconnect.client.Globals.O_AUTH_CLIENT_CREDENTIALS;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;

public class AuthenticatorTest {
    @Test
    public void oAuthClientCredentialsTest() throws ApiException {
        Authenticator authenticator = new Authenticator(O_AUTH_CLIENT_CREDENTIALS);
        OAuthClientToken accessToken = (OAuthClientToken) authenticator.getToken();

        assertNotNull(accessToken.getAccessToken());
        assertTrue(accessToken.getExpiresIn() > 0);
        assertEquals("bearer", accessToken.getTokenType());
        assertNotNull(accessToken.getScope());
        assertNotNull(accessToken.getCreatedAt());
    }
}
