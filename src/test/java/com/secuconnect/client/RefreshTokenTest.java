package com.secuconnect.client;

import com.secuconnect.client.api.GeneralContractsApi;
import com.secuconnect.client.auth.credentials.OAuthRefreshCredentials;
import com.secuconnect.client.cache.CacheItemPoolInterface;
import com.secuconnect.client.cache.FileCache;
import com.secuconnect.client.cache.MemoryCache;
import com.secuconnect.client.model.GeneralContractsList;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.*;

public class RefreshTokenTest {
    @Test
    public void twoInstancesTest() {
        try {
            // Init two environments (with same default/file cache)
            Environment env1 = new Environment()
                .setCredentials(Globals.O_AUTH_DEVICE_CREDENTIALS_REFRESH_TOKEN_1);

            Environment env2 = new Environment()
                .setCredentials(Globals.O_AUTH_DEVICE_CREDENTIALS_REFRESH_TOKEN_2);

            // get two tokens
            String accessToken1 = env1.authenticate();
            assertFalse(accessToken1.isEmpty());

            String accessToken2 = env2.authenticate();
            assertFalse(accessToken2.isEmpty());

            // compare
            assertNotEquals(accessToken1, accessToken2);

            // check the cache too
            assertNotEquals(env1.authenticate(), env2.authenticate());

            // get two new tokens
            String accessToken2_2 = env2.reauthenticate();
            assertFalse(accessToken2_2.isEmpty());
            assertNotEquals(accessToken2, accessToken2_2);

            String accessToken1_1 = env1.reauthenticate();
            assertFalse(accessToken1_1.isEmpty());
            assertNotEquals(accessToken1, accessToken1_1);

            // compare
            assertNotEquals(accessToken1_1, accessToken2_2);

            // check the cache too
            assertEquals(accessToken1_1, env1.authenticate());
            assertEquals(accessToken2_2, env2.authenticate());

            assertNotEquals(env1.authenticate(), env2.authenticate());
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }
    }

    @Test
    public void oneInstancesTest() {
        try {
            // Init environment
            Environment env = new Environment();

            // get token #1
            env.setCredentials(Globals.O_AUTH_DEVICE_CREDENTIALS_REFRESH_TOKEN_1);
            String accessToken1 = env.authenticate();
            assertFalse(accessToken1.isEmpty());

            // get token #2
            env.setCredentials(Globals.O_AUTH_DEVICE_CREDENTIALS_REFRESH_TOKEN_2);
            String accessToken2 = env.authenticate();
            assertFalse(accessToken2.isEmpty());
            assertNotEquals(accessToken1, accessToken2);

            // get token #3
            env.setCredentials(Globals.O_AUTH_DEVICE_CREDENTIALS_REFRESH_TOKEN_1);
            String accessToken3 = env.authenticate();
            assertFalse(accessToken3.isEmpty());
            assertNotEquals(accessToken2, accessToken3);

            // same cache identifier -> same token
            assertEquals(accessToken3, accessToken1);
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }
    }
}
