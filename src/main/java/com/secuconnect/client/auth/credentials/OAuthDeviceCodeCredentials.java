package com.secuconnect.client.auth.credentials;

import com.google.gson.annotations.SerializedName;

public class OAuthDeviceCodeCredentials extends OAuthCredentials {
  public static final String GRANT_TYPE = "device";

  @SerializedName("code")
  private final String code;

  public OAuthDeviceCodeCredentials(String clientId, String clientSecret, String code) {
    super(GRANT_TYPE, clientId, clientSecret);
    this.code = code;
  }

  @Override
  public String getUniqueKey() {
    // create hash without any secret or password!
    return getTextualKeyHash(grantType + clientId);
  }
}
