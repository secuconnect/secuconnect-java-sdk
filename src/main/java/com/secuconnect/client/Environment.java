package com.secuconnect.client;

import com.secuconnect.client.auth.credentials.OAuthCredentials;
import com.secuconnect.client.cache.CacheItemPoolInterface;
import com.secuconnect.client.cache.FileCache;

@SuppressWarnings({"unused", "UnusedReturnValue"})
public class Environment {

    public static final String ENV_ID_LIVE = "LIVE";
    public static final String ENV_ID_TESTING = "TESTING";

    public static final String BASE_PATH_LIVE = "https://connect.secucard.com/api/v2";
    public static final String BASE_PATH_TESTING = "https://connect-testing.secuconnect.com/api/v2";

    public static final String AUTH_PATH_LIVE = "https://connect.secucard.com/oauth/token";
    public static final String AUTH_PATH_TESTING = "https://connect-testing.secuconnect.com/oauth/token";

    public static final String DEFAULT_AUTH_CACHE_FOLDER = ".auth";

    private static Environment globalEnvironment;

    static {
        globalEnvironment = new Environment();
        globalEnvironment.useTestingPaths();
    }

    private String id = ENV_ID_TESTING;
    private String basePath = BASE_PATH_TESTING;
    private String authPath = AUTH_PATH_TESTING;
    private OAuthCredentials credentials;
    private CacheItemPoolInterface authCache = new FileCache(DEFAULT_AUTH_CACHE_FOLDER);
    private ApiClient apiClient = new ApiClient().setEnv(this);

    public static Environment getGlobalEnv() {
        return globalEnvironment;
    }

    public static void setGlobalEnv(Environment defaultEnvironment) {
        Environment.globalEnvironment = defaultEnvironment;
    }

    public Environment useLivePaths() {
        this.id = ENV_ID_LIVE;
        this.basePath = BASE_PATH_LIVE;
        this.authPath = AUTH_PATH_LIVE;
        return this;
    }

    public Environment useTestingPaths() {
        this.id = ENV_ID_TESTING;
        this.basePath = BASE_PATH_TESTING;
        this.authPath = AUTH_PATH_TESTING;
        return this;
    }

    public Environment useCustomPaths(String envId, String basePath, String authPath) {
        if (envId.length() > 8) {
            envId = envId.substring(0, 7);
        }

        basePath = basePath.replaceFirst("/$", "");

        this.id = envId;
        this.basePath = basePath;
        this.authPath = authPath;
        return this;
    }

    public String getId() {
        return id;
    }

    public String getBasePath() {
        return basePath;
    }

    public String getAuthPath() {
        return authPath;
    }

    public OAuthCredentials getCredentials() {
        return credentials;
    }

    public Environment setCredentials(OAuthCredentials credentials) {
        this.credentials = credentials;
        return this;
    }

    public ApiClient getApiClient() {
        return apiClient;
    }

    public Environment setApiClient(ApiClient apiClient) {
        this.apiClient = apiClient;
        return this;
    }

    public CacheItemPoolInterface getAuthCache() {
        return authCache;
    }

    public Environment setAuthCache(CacheItemPoolInterface cache) {
        this.authCache = cache;
        return this;
    }

    public String authenticate() throws ApiException {
        return apiClient.authenticate();
    }

    public String reauthenticate() throws ApiException {
        return apiClient.reauthenticate();
    }
}
