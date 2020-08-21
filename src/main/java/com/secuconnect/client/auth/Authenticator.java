package com.secuconnect.client.auth;

import com.google.gson.reflect.TypeToken;
import com.secuconnect.client.ApiClient;
import com.secuconnect.client.ApiException;
import com.secuconnect.client.ApiResponse;
import com.secuconnect.client.ExceptionBody;
import com.secuconnect.client.auth.credentials.*;
import com.secuconnect.client.auth.tokens.*;
import com.secuconnect.client.cache.CacheItem;
import com.secuconnect.client.cache.CacheItemInterface;
import com.secuconnect.client.cache.InvalidArgumentException;
import okhttp3.Call;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Authenticator {

    private static final int EXPECTED_LENGTH_OF_REQUEST = 10; // Some buffer for the expiration time
    private static final int REFRESH_TOKEN_EXPIRE_TIME = 15768000;
    public static final String REFRESH_TOKEN = "refreshToken";
    public static final String ACCESS_TOKEN = "accessToken";

    private final ApiClient apiClient;

    public Authenticator(ApiClient apiClient) {
        this.apiClient = apiClient;
    }

    /**
     * Function to authenticate by OAuthCredentials object.
     */
    public String authenticate() throws ApiException {
        return startAuthenticationProcess();
    }

    /**
     * Function to run the authenticate process a second time
     */
    public String reauthenticate() {
        try {
            String key = concatKey(ACCESS_TOKEN);
            deleteCacheItem(key);

            return startAuthenticationProcess();
        } catch (InvalidArgumentException | ApiException ignore) {
        }

        return null;
    }

    /**
     * Starts the authentication process and returns the access token if it was successful.
     */
    private String startAuthenticationProcess() throws ApiException {
        String accessToken = tryToGetAccessTokenFromCache();

        if (accessToken == null || accessToken.isEmpty()) {
            accessToken = tryToGetAccessTokenViaCachedRefreshToken();
        }

        if (accessToken == null || accessToken.isEmpty()) {
            accessToken = tryToGetAccessTokenViaAPI(apiClient.getEnv().getCredentials());
        }

        if (accessToken == null || accessToken.isEmpty()) {
            String errorBody = "{\"error\": \"invalid_token\", \"error_description\": \"The access token is invalid\"}";
            throw new ApiException("Access token value error", 400, null, errorBody);
        }

        return accessToken;
    }

    /**
     * Check if the access token is stored into cache
     */
    private String tryToGetAccessTokenFromCache() {
        CacheItemInterface cacheItem = getCacheItem(concatKey(ACCESS_TOKEN));

        if (!cacheItem.isHit()) {
            return null;
        }

        return (String) cacheItem.get();
    }

    /**
     * Check if a refresh token is stored into cache. If so then get a new access token via API
     */
    private String tryToGetAccessTokenViaCachedRefreshToken() {
        // Avoid loops
        OAuthCredentials credentials = apiClient.getEnv().getCredentials();
        if (credentials instanceof OAuthRefreshCredentials) {
            return null;
        }

        try {
            CacheItemInterface cacheItem = getCacheItem(concatKey(REFRESH_TOKEN));

            if (!cacheItem.isHit()) {
                return null;
            }

            String refreshToken = (String) cacheItem.get();

            return tryToGetAccessTokenViaAPI(
                new OAuthRefreshCredentials(credentials.getClientId(), credentials.getClientSecret(), refreshToken)
            );
        } catch (ApiException e) {
            return null;
        }
    }

    /**
     * Function to get access token from API.
     */
    private String tryToGetAccessTokenViaAPI(OAuthCredentials authenticationCredentials) throws ApiException {
        // Get new token via API
        Token newToken = getTokenFromApi(authenticationCredentials);
        OAuthCredentials credentials = apiClient.getEnv().getCredentials();

        if (newToken instanceof OAuthDeviceCodeToken) {
            newToken = authenticateFirstTime(
                credentials.getClientId(),
                credentials.getClientSecret(),
                (OAuthDeviceCodeToken) newToken
            );
        }

        if (!(newToken instanceof AccessToken) || "".equals(((AccessToken) newToken).getAccessToken())) {
            return null;
        }

        storeNewTokenInCache((AccessToken) newToken);

        return ((AccessToken) newToken).getAccessToken();
    }

    /**
     * Function to get access token from API.
     */
    private Token getTokenFromApi(OAuthCredentials authenticationCredentials) throws ApiException {
        Call call = getTokenCall(authenticationCredentials);

        Token accessToken;

        if (authenticationCredentials instanceof OAuthClientCredentials) {
            Type localVarReturnType = new TypeToken<OAuthClientToken>() {
            }.getType();
            ApiResponse<OAuthClientToken> resp = apiClient.execute(call, localVarReturnType);
            accessToken = resp.getData();
        } else if (authenticationCredentials instanceof OAuthApplicationUserCredentials) {
            Type localVarReturnType = new TypeToken<OAuthApplicationUserToken>() {
            }.getType();
            ApiResponse<OAuthApplicationUserToken> resp = apiClient.execute(call, localVarReturnType);
            accessToken = resp.getData();
        } else if (authenticationCredentials instanceof OAuthDeviceCredentials) {
            Type localVarReturnType = new TypeToken<OAuthDeviceToken>() {
            }.getType();
            ApiResponse<OAuthDeviceToken> resp = apiClient.execute(call, localVarReturnType);
            accessToken = resp.getData();
        } else if (authenticationCredentials instanceof OAuthDeviceCodeCredentials) {
            Type localVarReturnType = new TypeToken<OAuthDeviceCodeToken>() {
            }.getType();
            ApiResponse<OAuthDeviceCodeToken> resp = apiClient.execute(call, localVarReturnType);
            accessToken = resp.getData();
        } else if (authenticationCredentials instanceof OAuthRefreshCredentials) {
            Type localVarReturnType = new TypeToken<OAuthRefreshToken>() {
            }.getType();
            ApiResponse<OAuthRefreshToken> resp = apiClient.execute(call, localVarReturnType);
            accessToken = resp.getData();
        } else {
            Type localVarReturnType = new TypeToken<AccessToken>() {
            }.getType();
            ApiResponse<AccessToken> resp = apiClient.execute(call, localVarReturnType);
            accessToken = resp.getData();
        }

        return accessToken;
    }

    private Call getTokenCall(OAuthCredentials credentials) throws ApiException {
        Map<String, String> headerParams = new HashMap<>();
        headerParams.put("Content-Type", "application/json");
        headerParams.put("Accept", "application/json");

        return apiClient.buildCall(
            apiClient.getEnv().getAuthPath(),
            "POST",
            null,
            null,
            credentials,
            headerParams,
            null,
            null
        );
    }

    /**
     * Store new access token (and refresh token) in cache
     */
    private void storeNewTokenInCache(AccessToken newToken) {
        if (newToken.getAccessToken() != null && newToken.getAccessToken().length() > 0) {
            CacheItemInterface cacheItem = getCacheItem(concatKey(ACCESS_TOKEN));

            saveTokenToCache(cacheItem, newToken.getAccessToken(), newToken.getExpiresIn());
        }

        if (newToken.getRefreshToken() != null && newToken.getAccessToken().length() > 0) {
            CacheItemInterface cacheItem = getCacheItem(concatKey(REFRESH_TOKEN));

            saveTokenToCache(cacheItem, newToken.getRefreshToken(), REFRESH_TOKEN_EXPIRE_TIME);
        }
    }

    /**
     * Function to authenticate the first time for a device.
     * It is when doesn't exist token for a device in a cache.
     */
    private AccessToken authenticateFirstTime(String clientId, String clientSecret, OAuthDeviceCodeToken token) throws ApiException {
        apiClient.getPrinter().printUserCode(token);

        int expiresIn = token.getExpiresIn();
        int interval = token.getInterval();

        while (expiresIn > 0) {
            try {
                TimeUnit.SECONDS.sleep(interval);
                return (AccessToken) getTokenFromApi(new OAuthDeviceCredentials(clientId, clientSecret, token.getDeviceCode()));
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ApiException e) {
                ExceptionBody response = e.getExceptionBody();

                if (!"authorization_pending".equals(response.getError())) {
                    throw e;
                }

                // authorization_pending . try again
                expiresIn -= interval;
            }
        }

        return null;
    }

    /**
     * Function to save token to cache memory.
     */
    private void saveTokenToCache(CacheItemInterface cacheItem, String token, int expiresIn) {
        cacheItem.set(token);
        expiresIn -= EXPECTED_LENGTH_OF_REQUEST;
        cacheItem.expiresAfter(expiresIn);
        apiClient.getEnv().getAuthCache().save(cacheItem);
    }

    /**
     * Get a cache item
     */
    private CacheItemInterface getCacheItem(String key) {
        try {
            return apiClient.getEnv().getAuthCache().getItem(key);
        } catch (InvalidArgumentException e) {
            return new CacheItem(key);
        }
    }

    /**
     * Deletes a cache item
     */
    private void deleteCacheItem(String key) {
        if (apiClient.getEnv().getAuthCache().hasItem(key)) {
            try {
                apiClient.getEnv().getAuthCache().deleteItem(key);
            } catch (InvalidArgumentException ignore) {
            }
        }
    }

    private String concatKey(String type) {
        return type + "_"  + apiClient.getEnv().getId() + "_" + apiClient.getEnv().getCredentials().getUniqueKey();
    }
}
