package io.secuconnect.client.auth;

import com.google.gson.reflect.TypeToken;
import io.secuconnect.client.ApiClient;
import io.secuconnect.client.ApiException;
import io.secuconnect.client.ApiResponse;
import io.secuconnect.client.auth.credentials.AuthenticationCredentials;
import io.secuconnect.client.auth.tokens.AccessToken;
import io.secuconnect.client.auth.tokens.OAuthApplicationUserToken;
import io.secuconnect.client.auth.tokens.OAuthClientToken;
import io.secuconnect.client.auth.tokens.OAuthDeviceToken;
import io.secuconnect.client.cache.CacheItem;

import javax.cache.Cache;
import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;

public class Authenticator {
    private AuthenticationCredentials credentials;
    private ApiClient apiClient;

    public Authenticator(AuthenticationCredentials credentials) {
        this.credentials = credentials;
        this.apiClient = new ApiClient();
        this.apiClient.setBasePath("https://connect.secucard.com/");
    }

    public com.squareup.okhttp.Call getTokenCall(AuthenticationCredentials credentials) throws ApiException {
        String localVarPath = "oauth/token";
        Map<String, String> localVarHeaderParams = new HashMap<>();
        final String[] localVarAccepts = {};
        final String[] localVarContentTypes = {};
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        String[] localVarAuthNames = new String[] {};

        if (localVarAccept != null) localVarHeaderParams.put("Accept", localVarAccept);

        return apiClient.buildCall(localVarPath, "POST", null, credentials, localVarHeaderParams, null, localVarAuthNames, null);
    }

    public AccessToken getTokenFromApi() throws ApiException {
        com.squareup.okhttp.Call call = getTokenCall(this.credentials);

        AccessToken accessToken;
        String commonPath = "io.secuconnect.client.auth.credentials.";
        String nameOfClass = this.credentials.getClass().getName();

        if (nameOfClass.equals(commonPath + "OAuthClientCredentials")) {
            Type localVarReturnType = new TypeToken<OAuthClientToken>(){}.getType();
            ApiResponse<OAuthClientToken> resp = apiClient.execute(call, localVarReturnType);
            accessToken = resp.getData();
        } else if (nameOfClass.equals(commonPath + "OAuthApplicationUserCredentials")) {
            Type localVarReturnType = new TypeToken<OAuthApplicationUserToken>(){}.getType();
            ApiResponse<OAuthApplicationUserToken> resp = apiClient.execute(call, localVarReturnType);
            accessToken = resp.getData();
        } else if (nameOfClass.equals(commonPath + "OAuthDeviceCredentials")) {
            Type localVarReturnType = new TypeToken<OAuthDeviceToken>(){}.getType();
            ApiResponse<OAuthDeviceToken> resp = apiClient.execute(call, localVarReturnType);
            accessToken = resp.getData();
        } else {
            Type localVarReturnType = new TypeToken<AccessToken>(){}.getType();
            ApiResponse<AccessToken> resp = apiClient.execute(call, localVarReturnType);
            accessToken = resp.getData();
        }

        return accessToken;
    }

    public AccessToken getToken() throws ApiException {
        AccessToken accessToken;
        String uniqueKey = credentials.getUniqueKey();

        Cache<String, CacheItem> cache = apiClient.getCache();
        CacheItem cacheItem = apiClient.getCacheItem();

        if (cacheItem == null) {
            cacheItem = apiClient.getCacheItem();
            accessToken = getTokenFromApi();
            cacheItem.set(uniqueKey, accessToken);
            cache.put(credentials.getUniqueKey(), cacheItem);
        } else {
            accessToken = cacheItem.get(uniqueKey);

            if (accessToken == null) {
                accessToken = getTokenFromApi();
                cacheItem.set(uniqueKey, accessToken);
            }
        }

        return accessToken;
    }
}
