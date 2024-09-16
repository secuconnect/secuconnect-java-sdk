package com.secuconnect.client.cache;

import com.secuconnect.client.ApiException;
import com.secuconnect.client.Environment;
import com.secuconnect.client.Globals;
import com.secuconnect.client.auth.credentials.OAuthRefreshCredentials;
import org.junit.Test;

import java.io.File;
import java.util.Random;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import static org.junit.Assert.*;

public class FileCacheTest {
    @Test
    public void oAuthClientCredentialsTest() {
        Environment env = Environment
            .getGlobalEnv()
            .setAuthCache(new FileCache(getRandomCacheDirName()))
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
        final String dir = getRandomCacheDirName();
        CacheItemPoolInterface cache = new FileCache(dir);
        cache.clear();

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
                cache.saveDeferred(new CacheItem(keyPrefix + finalT).set(finalT));
                latches.countDown();
            });
        }

        latch.countDown();
        latches.await();

        for (int t = 0; t < threads; ++t) {
            assertTrue("cache item #" + t + " is missing", cache.hasItem(keyPrefix + t));
            assertEquals(cache.getItem(keyPrefix + t).get(), t);
        }

        cache.clear();
    }

    @Test
    public void oAuthTestWithSwitchingDirectories() {
        String dir1 = getRandomCacheDirName();
        String dir2 = getRandomCacheDirName();
        assertNotEquals(dir1, dir2);

        // Init environment
        Environment env = Environment
            .getGlobalEnv()
            .setCredentials(Globals.O_AUTH_CLIENT_CREDENTIALS);

        // Init cache folders
        FileCache cache1 = new FileCache(dir1);
        cache1.clear();
        FileCache cache2 = new FileCache(dir2);
        cache2.clear();
        FileCache cache3 = new FileCache(dir1);
        cache3.clear();

        try {
            // get token #1
            env.setAuthCache(cache1);
            String accessToken1 = env.authenticate();
            assertFalse(accessToken1.isEmpty());

            // get token #2
            env.setAuthCache(cache2);
            String accessToken2 = env.authenticate();
            assertFalse(accessToken2.isEmpty());
            assertNotEquals(accessToken1, accessToken2);

            // get token #3
            env.setAuthCache(cache3);
            String accessToken3 = env.authenticate();
            assertFalse(accessToken3.isEmpty());
            assertNotEquals(accessToken2, accessToken3);

            // same folder -> same token
            assertEquals(accessToken3, accessToken1);
        } catch (ApiException ex) {
            ex.printStackTrace();
            fail(ex.getResponseBody());
        }

        // cleanup
        cache1.clear();
        cache2.clear();
        cache3.clear();
    }

    private String getRandomCacheDirName() {
        int leftLimit = 48; // numeral '0'
        int rightLimit = 122; // letter 'z'
        int targetStringLength = 10;
        Random random = new Random();

        String generatedString = random.ints(leftLimit, rightLimit + 1)
            .filter(i -> (i <= 57 || i >= 65) && (i <= 90 || i >= 97))
            .limit(targetStringLength)
            .collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append)
            .toString();

        return Environment.DEFAULT_AUTH_CACHE_FOLDER + File.separator + generatedString;
    }
}
