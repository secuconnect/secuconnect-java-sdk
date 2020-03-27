package io.secuconnect.client.auth.credentials;

import com.google.gson.annotations.SerializedName;

public class OAuthRefreshCredentials extends AuthenticationCredentials {

  @SerializedName("refresh_token")
  private String refreshToken;

  public OAuthRefreshCredentials(String clientId, String clientSecret, String refreshToken) {
    super(clientId, clientSecret);

    this.grantType = "refresh_token";
    this.refreshToken = refreshToken;
  }

  @Override
  public String getUniqueKey() {
    String textualKey = grantType + clientId;
    String textualKeyHash = getTextualKeyHash(textualKey);

    return textualKeyHash;
  }

  public String getRefreshToken() {
    return refreshToken;
  }

  public void setRefreshToken(String refreshToken) {
    this.refreshToken = refreshToken;
  }
}
