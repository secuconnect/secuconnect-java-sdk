package com.secuconnect.client;

import com.secuconnect.client.api.GeneralContractsApi;
import com.secuconnect.client.api.PaymentTransactionsApi;
import com.secuconnect.client.auth.Authenticator;
import com.secuconnect.client.cache.CacheItemInterface;
import com.secuconnect.client.cache.CacheItemPoolInterface;
import com.secuconnect.client.cache.MemoryCache;
import com.secuconnect.client.model.GeneralContractsList;
import org.junit.Test;

import java.util.List;
import java.util.Map;

import static org.junit.Assert.*;

public class ApiClientTest {

    public static final String INVALID_ACCESS_TOKEN = "stslcq4ilt3kl4j7ke474cfn23";

    @Test
    public void RefreshTokenTest() {
        // Init cache
        CacheItemPoolInterface cache = new MemoryCache();
        cache.clear();

        try {
            // init env
            Environment env = new Environment()
                .setAuthCache(cache)
                .setCredentials(Globals.O_AUTH_CLIENT_CREDENTIALS);

            String accessToken1 = env.authenticate();
            assertFalse(accessToken1.isEmpty());
            assertEquals(accessToken1, env.authenticate());

            // run api call
            GeneralContractsApi api = new GeneralContractsApi(env.getApiClient());

            GeneralContractsList response = api.getAll(1, null, null, null, null);
            assertNotNull(response);
            assertTrue(response.getCount() > 0);

            // make access token invalid
            CacheItemInterface cacheItem = env.getAuthCache().getItem(
                Authenticator.ACCESS_TOKEN + "_"  + env.getId() + "_" + env.getCredentials().getUniqueKey()
            );
            cacheItem.set(INVALID_ACCESS_TOKEN);
            env.getAuthCache().save(cacheItem);
            String accessToken2 = env.authenticate();
            assertNotEquals(accessToken1, env.authenticate());
            assertEquals(INVALID_ACCESS_TOKEN, env.authenticate());

            // run api call again
            response = api.getAll(1, null, null, null, null);
            assertNotNull(response);
            assertTrue(response.getCount() > 0);

            // check access token
            assertNotEquals(accessToken1, env.authenticate());
            assertNotEquals(INVALID_ACCESS_TOKEN, env.authenticate());
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }

        cache.clear();
    }

    @Test
    public void AsyncRefreshTokenTest() throws InterruptedException {
        // Init cache
        CacheItemPoolInterface cache = new MemoryCache();
        cache.clear();

        try {
            // init env and api call
            Environment env = new Environment()
                .setAuthCache(cache)
                .setCredentials(Globals.O_AUTH_CLIENT_CREDENTIALS);

            final boolean[] executed = {false};

            ApiCallback<GeneralContractsList> callback = new ApiCallback<GeneralContractsList>() {
                @Override
                public void onFailure(ApiException e, int statusCode, Map<String, List<String>> responseHeaders) {
                    System.err.println("Failed with status code: " + statusCode);
                    e.printStackTrace();
                    fail(e.getResponseBody());
                    executed[0] = true;
                }

                @Override
                public void onSuccess(GeneralContractsList response, int statusCode, Map<String, List<String>> responseHeaders) {
                    assertNotNull(response);
                    assertTrue(response.getCount() > 0);
                    executed[0] = true;
                }
            };

            String accessToken1 = env.authenticate();
            assertFalse(accessToken1.isEmpty());
            assertEquals(accessToken1, env.authenticate());

            GeneralContractsApi api = new GeneralContractsApi(env.getApiClient());

            // run api call
            executed[0] = false;
            api.getAllAsync(1, null, null, null, null, callback);

            while (!executed[0]) {
                Thread.sleep(100);
            }

            // make access token invalid
            CacheItemInterface cacheItem = env.getAuthCache().getItem(
                Authenticator.ACCESS_TOKEN + "_"  + env.getId() + "_" + env.getCredentials().getUniqueKey()
            );
            cacheItem.set(INVALID_ACCESS_TOKEN);
            env.getAuthCache().save(cacheItem);
            String accessToken2 = env.authenticate();
            assertNotEquals(accessToken1, env.authenticate());
            assertEquals(INVALID_ACCESS_TOKEN, env.authenticate());

            // run api call again
            executed[0] = false;
            api.getAllAsync(1, null, null, null, null, callback);

            while (!executed[0]) {
                Thread.sleep(100);
            }

            // check access token
            assertNotEquals(accessToken1, env.authenticate());
            assertNotEquals(INVALID_ACCESS_TOKEN, env.authenticate());
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }

        cache.clear();
    }

    @Test
    public void TimeoutTest() throws InterruptedException {
        try {
            // init env and api call
            Environment env = new Environment().setCredentials(Globals.O_AUTH_CLIENT_CREDENTIALS);

            final boolean[] executed = {false};

            String accessToken1 = env.authenticate();
            assertFalse(accessToken1.isEmpty());
            assertEquals(accessToken1, env.authenticate());

            // set custom timeouts for the request
            ApiClient apiClient = env.getApiClient()
                    .setTimeouts(1, 1, 1, 1);

            PaymentTransactionsApi api = new PaymentTransactionsApi(apiClient);

            // run api call
            api.getAll(1000, null, null, null, null);

            fail("no timeout");
        } catch (ApiException ex) {
            assertEquals("java.io.InterruptedIOException: timeout", ex.getMessage());
        }
    }

    @Test
    public void SetDebugTest() throws InterruptedException {
        try {
            // init env and api call
            ApiClient apiClient = Environment.getGlobalEnv().getApiClient();

            apiClient.setDebugging(false);
            apiClient.setDebugging(true);
            apiClient.setDebugging(false);
        } catch (RuntimeException ex) {
            fail("Could not active the logging of API requests.");
        }
    }
}
