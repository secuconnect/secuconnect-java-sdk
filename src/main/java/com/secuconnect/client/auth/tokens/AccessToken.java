package com.secuconnect.client.auth.tokens;

import com.google.gson.annotations.SerializedName;

import java.util.Date;

public abstract class AccessToken extends Token {

  @SerializedName("access_token")
  protected String accessToken;

  @SerializedName("refresh_token")
  protected String refreshToken;

  @SerializedName("token_type")
  protected String tokenType;

  @SerializedName("scope")
  protected String scope;

  protected final Date createdAt = new Date();

  public String getAccessToken() {
    return accessToken;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public String getTokenType() {
    return tokenType;
  }

  public String getScope() {
    return scope;
  }

  public Date getCreatedAt() {
    return createdAt;
  }
}
