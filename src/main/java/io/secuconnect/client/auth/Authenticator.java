package io.secuconnect.client.auth;

import com.google.gson.reflect.TypeToken;
import io.secuconnect.client.ApiClient;
import io.secuconnect.client.ApiException;
import io.secuconnect.client.ApiResponse;
import io.secuconnect.client.Configuration;
import io.secuconnect.client.auth.credentials.AuthenticationCredentials;
import io.secuconnect.client.auth.credentials.OAuthDeviceCodeCredentials;
import io.secuconnect.client.auth.credentials.OAuthDeviceCredentials;
import io.secuconnect.client.auth.credentials.OAuthRefreshCredentials;
import io.secuconnect.client.auth.tokens.AccessToken;
import io.secuconnect.client.auth.tokens.OAuthApplicationUserToken;
import io.secuconnect.client.auth.tokens.OAuthClientToken;
import io.secuconnect.client.auth.tokens.OAuthDeviceCodeToken;
import io.secuconnect.client.auth.tokens.OAuthDeviceToken;
import io.secuconnect.client.auth.tokens.OAuthRefreshToken;
import io.secuconnect.client.cache.CacheItem;
import io.secuconnect.client.printer.Printer;

import java.lang.reflect.Type;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.TimeUnit;

public class Authenticator {
    private AuthenticationCredentials credentials;
    private ApiClient apiClient;

    public Authenticator(AuthenticationCredentials credentials) {
        this(credentials, null);
    }

    public Authenticator(AuthenticationCredentials credentials, String authHost) {
        this.credentials = credentials;

        if (null == authHost || authHost.length() <= 0) {
            authHost = Configuration.getDefaultApiClient().getAuthHost();
        }

        this.apiClient = new ApiClient();
        this.apiClient.setBasePath(authHost);
    }

    public com.squareup.okhttp.Call getTokenCall(AuthenticationCredentials credentials) throws ApiException {
        String localVarPath = "oauth/token";
        Map<String, String> localVarHeaderParams = new HashMap<>();
        final String[] localVarAccepts = {};
        final String[] localVarContentTypes = {};
        final String localVarAccept = apiClient.selectHeaderAccept(localVarAccepts);
        final String localVarContentType = apiClient.selectHeaderContentType(localVarContentTypes);
        localVarHeaderParams.put("Content-Type", localVarContentType);
        String[] localVarAuthNames = new String[]{};

        if (localVarAccept != null) {
            localVarHeaderParams.put("Accept", localVarAccept);
        }

        return apiClient.buildCall(localVarPath, "POST", null, credentials, localVarHeaderParams, null, localVarAuthNames, null);
    }

    public AccessToken getTokenFromApi() throws ApiException {
        com.squareup.okhttp.Call call = getTokenCall(this.credentials);

        AccessToken accessToken;
        String commonPath = "io.secuconnect.client.auth.credentials.";
        String nameOfClass = this.credentials.getClass().getName();

        if (nameOfClass.equals(commonPath + "OAuthClientCredentials")) {
            Type localVarReturnType = new TypeToken<OAuthClientToken>() {
            }.getType();
            ApiResponse<OAuthClientToken> resp = apiClient.execute(call, localVarReturnType);
            accessToken = resp.getData();
        } else if (nameOfClass.equals(commonPath + "OAuthApplicationUserCredentials")) {
            Type localVarReturnType = new TypeToken<OAuthApplicationUserToken>() {
            }.getType();
            ApiResponse<OAuthApplicationUserToken> resp = apiClient.execute(call, localVarReturnType);
            accessToken = resp.getData();
        } else if (nameOfClass.equals(commonPath + "OAuthDeviceCredentials")) {
            Type localVarReturnType = new TypeToken<OAuthDeviceToken>() {
            }.getType();
            ApiResponse<OAuthDeviceToken> resp = apiClient.execute(call, localVarReturnType);
            accessToken = resp.getData();
        } else if (nameOfClass.equals(commonPath + "OAuthDeviceCodeCredentials")) {
            Type localVarReturnType = new TypeToken<OAuthDeviceCodeToken>() {
            }.getType();
            ApiResponse<OAuthDeviceCodeToken> resp = apiClient.execute(call, localVarReturnType);
            accessToken = resp.getData();
        } else if (nameOfClass.equals(commonPath + "OAuthRefreshCredentials")) {
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

    public AccessToken getToken() throws ApiException {
        AccessToken accessToken;
        String uniqueKey = credentials.getUniqueKey();
        CacheItem cacheItem = apiClient.getCacheItem();

        if (cacheItem == null) {
            accessToken = getTokenFromApi();
            saveTokenInCache(accessToken);
        } else {
            accessToken = cacheItem.get(uniqueKey);

            if (accessToken == null) {
                accessToken = getTokenFromApi();
                saveTokenInCache(accessToken);
            }
        }

        return accessToken;
    }

    public String getDeviceAccessToken(String clientId, String clientSecret, String uuid) {
        String deviceAccessToken = null;

        if (clientId.isEmpty() || clientSecret.isEmpty() || uuid.isEmpty()) {
            System.out.println("Incomplete credentials data.");
        } else {
            OAuthDeviceCodeToken codeToken = obtainCodeToken(clientId, clientSecret, uuid);

            if (codeToken != null) {
                String deviceCode = codeToken.getDeviceCode();

                if (!deviceCode.isEmpty()) {
                    OAuthDeviceCredentials oAuthDeviceCredentials = new OAuthDeviceCredentials(clientId, clientSecret, deviceCode);
                    setCredentials(oAuthDeviceCredentials);
                    String uniqueKey = credentials.getUniqueKey();
                    CacheItem cacheItem = apiClient.getCacheItem();
                    OAuthDeviceToken deviceToken = (OAuthDeviceToken) cacheItem.get(uniqueKey);

                    if (deviceToken != null) {
                        boolean tokenExpired = cacheItem.wasExpiring(deviceToken);

                        if (tokenExpired) {
                            String refreshToken = deviceToken.getRefreshToken();

                            if (!refreshToken.isEmpty()) {
                                deviceAccessToken = obtainNewDeviceAccessTokenUsingRefresh(refreshToken);
                            }
                        } else {
                            deviceAccessToken = deviceToken.getAccessToken();
                        }
                    } else {
                        deviceAccessToken = getDeviceAccessTokenFirstTime(codeToken);
                    }
                }
            }
        }

        return deviceAccessToken;
    }

    private OAuthDeviceCodeToken obtainCodeToken(String clientId, String clientSecret, String uuid) {
        OAuthDeviceCodeCredentials codeCredentials = new OAuthDeviceCodeCredentials(clientId, clientSecret, uuid);
        Authenticator codeAuth = new Authenticator(codeCredentials);
        OAuthDeviceCodeToken codeToken = null;

        try {
            codeToken = (OAuthDeviceCodeToken) codeAuth.getToken();
        } catch (ApiException e) {
            e.printStackTrace();
        }

        return codeToken;
    }

    private String obtainNewDeviceAccessTokenUsingRefresh(String refreshToken) {
        String clientId = credentials.getClientId();
        String clientSecret = credentials.getClientSecret();
        String deviceAccessToken = null;

        if (!clientId.isEmpty() && !clientSecret.isEmpty()) {
            if (!refreshToken.isEmpty()) {
                OAuthRefreshCredentials oAuthRefreshCredentials = new OAuthRefreshCredentials(clientId, clientSecret, refreshToken);
                Authenticator authenticator = new Authenticator(oAuthRefreshCredentials);

                try {
                    OAuthRefreshToken oAuthRefreshToken = (OAuthRefreshToken) authenticator.getToken();
                    deviceAccessToken = oAuthRefreshToken.getAccessToken();
                } catch (ApiException e) {
                    e.printStackTrace();
                }
            }
        }

        return deviceAccessToken;
    }

    private String getDeviceAccessTokenFirstTime(OAuthDeviceCodeToken codeToken) {
        String deviceAccessToken = null;

        if (codeToken == null) {
            System.out.println("Code token is null.");
        } else {
            String deviceCode = codeToken.getDeviceCode();

            if (deviceCode != null && !deviceCode.isEmpty()) {
                Printer printer = apiClient.getPrinter();
                printer.printUserCode(codeToken);
                printer.printVerificationUrl(codeToken);

                OAuthDeviceToken deviceToken = getDeviceToken(codeToken);

                if (deviceToken == null) {
                    System.out.println("Unfortunately, the access token could not be obtained.");
                } else {
                    deviceAccessToken = deviceToken.getAccessToken();
                }
            } else {
                System.out.println("Device code is null or empty.");
            }
        }

        return deviceAccessToken;
    }

    private OAuthDeviceToken getDeviceToken(OAuthDeviceCodeToken codeToken) {
        Integer expiresIn = codeToken.getExpiresIn();
        Integer interval = codeToken.getInterval();
        OAuthDeviceToken accessToken = null;

        String clientId = credentials.getClientId();
        String clientSecret = credentials.getClientSecret();
        String deviceCode = codeToken.getDeviceCode();

        OAuthDeviceCredentials deviceCredentials = new OAuthDeviceCredentials(clientId, clientSecret, deviceCode);
        setCredentials(deviceCredentials);

        try {
            accessToken = (OAuthDeviceToken) getToken();
        } catch (ApiException e) {
            String error = e.getExceptionBody().getError();
            if (error.equals("authorization_pending")) {
                accessToken = tryObtainTokenForDevice(expiresIn, interval);
                saveTokenInCache(accessToken);
            }
        }

        return accessToken;
    }

    private OAuthDeviceToken tryObtainTokenForDevice(Integer expiresIn, Integer interval) {
        OAuthDeviceToken accessToken = null;

        while (accessToken == null && expiresIn > 0) {
            try {
                TimeUnit.SECONDS.sleep(interval);
                accessToken = (OAuthDeviceToken) getTokenFromApi();
            } catch (InterruptedException e) {
                e.printStackTrace();
            } catch (ApiException e) {
                expiresIn = expiresIn - interval;
            }
        }

        return accessToken;
    }

    private void saveTokenInCache(AccessToken accessToken) {
        String uniqueKey = credentials.getUniqueKey();
        CacheItem cacheItem = apiClient.getCacheItem();
        cacheItem.set(uniqueKey, accessToken);
    }

    public AuthenticationCredentials getCredentials() {
        return credentials;
    }

    public void setCredentials(AuthenticationCredentials credentials) {
        this.credentials = credentials;
    }
}
