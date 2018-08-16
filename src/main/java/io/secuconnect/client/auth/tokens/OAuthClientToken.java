package io.secuconnect.client.auth.tokens;

import com.google.gson.annotations.SerializedName;

public class OAuthClientToken extends AccessToken {
    @SerializedName("access_token")
    private String accessToken;

    @SerializedName("token_type")
    private String tokenType;

    @SerializedName("scope")
    private String scope;


    public String getAccessToken() {
        return accessToken;
    }

    public String getTokenType() {
        return tokenType;
    }

    public String getScope() {
        return scope;
    }
}
