package com.secuconnect.client.auth.credentials;

import com.google.gson.annotations.SerializedName;

public class OAuthRefreshCredentials extends OAuthCredentials {
    public static final String GRANT_TYPE = "refresh_token";

    @SerializedName("refresh_token")
    private final String refreshToken;

    public OAuthRefreshCredentials(String clientId, String clientSecret, String refreshToken) {
        super(GRANT_TYPE, clientId, clientSecret);
        this.refreshToken = refreshToken;
    }

    @Override
    public String getUniqueKey() {
        // create hash without any secret or password!
        // unfortunately we need to use the (hashed) refreshToken, as we do not have another unique id for differentiation
        return getTextualKeyHash(grantType + clientId + getTextualKeyHash(refreshToken));
    }
}
