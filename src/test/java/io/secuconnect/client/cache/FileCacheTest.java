package io.secuconnect.client.cache;

import io.secuconnect.client.ApiException;
import io.secuconnect.client.auth.Authenticator;
import io.secuconnect.client.auth.tokens.OAuthApplicationUserToken;
import io.secuconnect.client.auth.tokens.OAuthClientToken;
import io.secuconnect.client.auth.tokens.OAuthDeviceToken;
import org.junit.Test;

import static io.secuconnect.client.Globals.O_AUTH_APPLICATION_USER_CREDENTIALS;
import static io.secuconnect.client.Globals.O_AUTH_CLIENT_CREDENTIALS;
import static io.secuconnect.client.Globals.O_AUTH_DEVICE_CREDENTIALS;
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

    @Test
    public void oAuthApplicationUserCredentialsTest() throws ApiException {
        Authenticator authenticator = new Authenticator(O_AUTH_APPLICATION_USER_CREDENTIALS);
        OAuthApplicationUserToken token1 = (OAuthApplicationUserToken) authenticator.getToken();
        OAuthApplicationUserToken token2 = (OAuthApplicationUserToken) authenticator.getToken();

        assertEquals(token1.getAccessToken(), token2.getAccessToken());
        assertEquals(token1.getExpiresIn(), token2.getExpiresIn());
        assertEquals(token1.getTokenType(), token2.getTokenType());
        assertEquals(token1.getScope(), token2.getScope());
        assertEquals(token1.getRefreshToken(), token2.getRefreshToken());
        assertEquals(token1.getCreatedAt(), token2.getCreatedAt());
    }

    @Test
    public void oAuthDeviceCredentialsTest() throws ApiException {
        Authenticator authenticator = new Authenticator(O_AUTH_DEVICE_CREDENTIALS);
        OAuthDeviceToken token1 = (OAuthDeviceToken) authenticator.getToken();
        OAuthDeviceToken token2 = (OAuthDeviceToken) authenticator.getToken();

        assertEquals(token1.getDeviceCode(), token2.getDeviceCode());
        assertEquals(token1.getUserCode(), token2.getUserCode());
        assertEquals(token1.getVerificationUrl(), token2.getVerificationUrl());
        assertEquals(token1.getExpiresIn(), token2.getExpiresIn());
        assertEquals(token1.getInterval(), token2.getInterval());
        assertEquals(token1.getCreatedAt(), token2.getCreatedAt());
    }
}
