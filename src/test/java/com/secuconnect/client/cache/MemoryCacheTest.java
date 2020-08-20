package com.secuconnect.client.cache;

import com.secuconnect.client.ApiException;
import com.secuconnect.client.Environment;
import com.secuconnect.client.Globals;
import org.junit.Test;

import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.Assert.*;

public class MemoryCacheTest {
    @Test
    public void oAuthClientCredentialsTest() {
        Environment env = Environment
            .getGlobalEnv()
            .setAuthCache(new MemoryCache())
            .setCredentials(Globals.O_AUTH_CLIENT_CREDENTIALS);

        try {
            String accessToken1 = env.authenticate();
            String accessToken2 = env.authenticate();

            assertEquals(accessToken1, accessToken2);

            String accessToken3 = env.reauthenticate();

            assertNotEquals(accessToken1, accessToken3);
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }

        env.getAuthCache().clear();
    }

    @Test
    public void testForThreadClash() throws InterruptedException {
        final String keyPrefix = "test";
        new MemoryCache().clear();

        int threads = 10000;
        ExecutorService service = Executors.newFixedThreadPool(threads);
        CountDownLatch latches = new CountDownLatch(threads);
        CountDownLatch latch = new CountDownLatch(1);

        for (int t = 0; t < threads; ++t) {
            int finalT = t;
            service.submit(() -> {
                try {
                    latch.await();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                CacheItemPoolInterface cache = new MemoryCache();
                cache.save(new CacheItem(keyPrefix + finalT).set(finalT));
                latches.countDown();
            });
        }

        latch.countDown();
        latches.await();

        for (int t = 0; t < threads; ++t) {
            CacheItemPoolInterface cache = new MemoryCache();
            assertTrue("cache item #" + t + " is missing", cache.hasItem(keyPrefix + t));
            assertEquals(cache.getItem(keyPrefix + t).get(), t);
        }

        new MemoryCache().clear();
    }
}
