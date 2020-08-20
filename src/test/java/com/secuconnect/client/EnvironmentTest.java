package com.secuconnect.client;

import com.secuconnect.client.api.GeneralContractsApi;
import com.secuconnect.client.cache.CacheItemPoolInterface;
import com.secuconnect.client.cache.MemoryCache;
import com.secuconnect.client.model.GeneralContractsList;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;

import static org.junit.Assert.*;

public class EnvironmentTest {
    @Test
    public void twoInstancesTest() {
        // Init cache
        CacheItemPoolInterface cache = new MemoryCache();
        cache.clear();

        try {

            // Init tow environments
            Environment env1 = new Environment()
                .setAuthCache(cache)
                .useCustomPaths("X1", Environment.BASE_PATH_TESTING, Environment.AUTH_PATH_TESTING)
                .setCredentials(Globals.O_AUTH_CLIENT_CREDENTIALS);

            Environment env2 = new Environment()
                .setAuthCache(cache)
                .useCustomPaths("X2", Environment.BASE_PATH_TESTING, Environment.AUTH_PATH_TESTING)
                .setCredentials(Globals.O_AUTH_CLIENT_CREDENTIALS);

            // get two tokens
            String accessToken1 = env1.authenticate();
            assertFalse(accessToken1.isEmpty());

            String accessToken2 = env2.authenticate();
            assertFalse(accessToken2.isEmpty());

            assertNotEquals(accessToken1, accessToken2);

            // init two api calls
            GeneralContractsApi contractsApi1 = new GeneralContractsApi(env1.getApiClient());
            GeneralContractsApi contractsApi2 = new GeneralContractsApi(env2.getApiClient());

            // run the api calls
            GeneralContractsList response2 = contractsApi2.getAll(null, null, null, null, null);
            assertNotNull(response2);
            assertTrue(response2.getCount() > 0);

            GeneralContractsList response1 = contractsApi1.getAll(null, null, null, null, null);
            assertNotNull(response1);
            assertTrue(response1.getCount() > 0);

            // be sure that the first one is still working after the second call
            contractsApi2 = new GeneralContractsApi(env2.getApiClient());
            response2 = contractsApi2.getAll(null, null, null, null, null);
            assertNotNull(response2);
            assertTrue(response2.getCount() > 0);

            // check the cache too
            assertNotEquals(env1.authenticate(), env2.authenticate());
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }

        cache.clear();
    }

    @Test
    public void twoThreadsWithSameEnvTest() throws InterruptedException {
        CacheItemPoolInterface cache = new MemoryCache();
        cache.clear();

        try {
            // Init environment

            Environment env = new Environment()
                .setAuthCache(cache)
                .setCredentials(Globals.O_AUTH_CLIENT_CREDENTIALS);
            String accessToken1 = env.authenticate();

            // validate that the token will not change in a new thread
            final CountDownLatch latch1 = new CountDownLatch(1);
            final String[] accessToken2 = new String[1];
            new Thread() {
                public void run() {
                    try {
                        accessToken2[0] = env.authenticate();
                        latch1.countDown();
                    } catch (ApiException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
            latch1.await();

            assertEquals(accessToken1, accessToken2[0]);

            // validate that the token will change in the main thread too
            final CountDownLatch latch2 = new CountDownLatch(1);
            final String[] accessToken3 = new String[1];
            new Thread() {
                public void run() {
                    try {
                        accessToken3[0] = env.reauthenticate();
                        latch2.countDown();
                    } catch (ApiException e) {
                        e.printStackTrace();
                    }
                }
            }.start();
            latch2.await();

            assertNotEquals(accessToken1, accessToken3[0]);
            assertEquals(env.authenticate(), accessToken3[0]);
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }

        cache.clear();
    }
}
