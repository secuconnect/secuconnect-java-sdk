package io.secuconnect.client.cache;

import io.secuconnect.client.ApiException;
import io.secuconnect.client.auth.Authenticator;
import io.secuconnect.client.auth.tokens.OAuthClientToken;
import org.junit.Test;

import static io.secuconnect.client.Globals.O_AUTH_CLIENT_CREDENTIALS;
import static org.junit.Assert.assertEquals;

public class FileCacheTest {
    @Test
    public void oAuthClientCredentialsTest() throws ApiException {
        Authenticator authenticator = new Authenticator(O_AUTH_CLIENT_CREDENTIALS);
        OAuthClientToken accessToken1 = (OAuthClientToken) authenticator.getToken();
        OAuthClientToken accessToken2 = (OAuthClientToken) authenticator.getToken();

        assertEquals(accessToken1.getAccessToken(), accessToken2.getAccessToken());
        assertEquals(accessToken1.getExpiresIn(), accessToken2.getExpiresIn());
        assertEquals(accessToken1.getTokenType(), accessToken2.getTokenType());
        assertEquals(accessToken1.getScope(), accessToken2.getScope());
        assertEquals(accessToken1.getCreatedAt(), accessToken2.getCreatedAt());
    }
}
