package io.secuconnect.client.auth.tokens;

import com.google.gson.annotations.SerializedName;

public class OAuthApplicationUserToken extends AccessToken {

  @SerializedName("refresh_token")
  protected String refreshToken;

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

  public String getRefreshToken() {
    return refreshToken;
  }
}
