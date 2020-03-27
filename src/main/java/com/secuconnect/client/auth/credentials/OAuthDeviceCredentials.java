package com.secuconnect.client.auth.credentials;

import com.google.gson.annotations.SerializedName;

public class OAuthDeviceCredentials extends OAuthDeviceBasicCredentials {

  @SerializedName("code")
  private final String code;

  public OAuthDeviceCredentials(String clientId, String clientSecret, String code) {
    super(clientId, clientSecret);

    this.code = code;
  }

  @Override
  public String getUniqueKey() {
    String textualKey = grantType + clientId;
    String textualKeyHash = getTextualKeyHash(textualKey);

    return textualKeyHash;
  }
}
