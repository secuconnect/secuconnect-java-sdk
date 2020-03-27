package com.secuconnect.client.auth.credentials;

import com.google.gson.annotations.SerializedName;

public class OAuthDeviceCodeCredentials extends OAuthDeviceBasicCredentials {

  @SerializedName("uuid")
  private final String uuid;

  public OAuthDeviceCodeCredentials(String clientId, String clientSecret, String uuid) {
    super(clientId, clientSecret);

    this.uuid = uuid;
  }

  @Override
  public String getUniqueKey() {
    String textualKey = grantType + clientId + uuid;
    String textualKeyHash = getTextualKeyHash(textualKey);

    return textualKeyHash;
  }

  public String getUuid() {
    return this.uuid;
  }
}
