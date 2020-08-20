package com.secuconnect.client.auth.credentials;

import com.google.gson.annotations.SerializedName;

public class OAuthDeviceCredentials extends OAuthCredentials {
  public static final String GRANT_TYPE = "device";

  @SerializedName("uuid")
  private final String uuid;

  public OAuthDeviceCredentials(String clientId, String clientSecret, String uuid) {
    super(GRANT_TYPE, clientId, clientSecret);
    this.uuid = uuid;
  }

  @Override
  public String getUniqueKey() {
    // create hash without any secret or password!
    return getTextualKeyHash(grantType + clientId + uuid);
  }
}
