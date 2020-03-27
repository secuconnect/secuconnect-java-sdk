package io.secuconnect.client.auth;

import io.secuconnect.client.ApiException;
import io.secuconnect.client.auth.tokens.OAuthApplicationUserToken;
import io.secuconnect.client.auth.tokens.OAuthClientToken;
import org.junit.Ignore;
import org.junit.Test;

import static io.secuconnect.client.Globals.O_AUTH_APPLICATION_USER_CREDENTIALS;
import static io.secuconnect.client.Globals.O_AUTH_CLIENT_CREDENTIALS;
import static io.secuconnect.client.Globals.O_AUTH_DEVICE_CREDENTIALS;
import static junit.framework.TestCase.assertNotNull;
import static junit.framework.TestCase.assertTrue;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertNull;

public class AuthenticatorTest {
    @Test
    public void oAuthClientCredentialsTest() throws ApiException {
        Authenticator authenticator = new Authenticator(O_AUTH_CLIENT_CREDENTIALS);
        OAuthClientToken accessToken = (OAuthClientToken) authenticator.getToken();

        assertNotNull(accessToken.getAccessToken());
        assertTrue(accessToken.getExpiresIn()  > 0);
        assertEquals("bearer", accessToken.getTokenType());
        assertNotNull(accessToken.getScope());
        assertNotNull(accessToken.getCreatedAt());
    }

    @Ignore
    @Test
    public void oAuthApplicationUserCredentialsTest() throws ApiException {
        Authenticator authenticator = new Authenticator(O_AUTH_APPLICATION_USER_CREDENTIALS);
        OAuthApplicationUserToken accessToken = (OAuthApplicationUserToken) authenticator.getToken();

        assertNotNull(accessToken.getAccessToken());
        assertTrue(accessToken.getExpiresIn()  > 0);
        assertEquals("bearer", accessToken.getTokenType());
        assertNull(accessToken.getScope());
        assertNotNull(accessToken.getRefreshToken());
        assertNotNull(accessToken.getCreatedAt());
    }

    @Ignore
    @Test
    public void oAuthDeviceCredentialsTest() {
        Authenticator authenticator = new Authenticator(O_AUTH_DEVICE_CREDENTIALS);
        String accessToken = authenticator.getDeviceAccessToken(O_AUTH_DEVICE_CREDENTIALS.getClientId(), O_AUTH_DEVICE_CREDENTIALS.getClientSecret(), O_AUTH_DEVICE_CREDENTIALS.getUuid());

        assertNotNull(accessToken);
        assertFalse(accessToken.isEmpty());
    }
}
