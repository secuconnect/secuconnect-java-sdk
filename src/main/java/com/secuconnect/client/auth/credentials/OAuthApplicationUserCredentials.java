package com.secuconnect.client.auth.credentials;

import com.google.gson.annotations.SerializedName;

public class OAuthApplicationUserCredentials extends OAuthCredentials {
  public static final String GRANT_TYPE = "appuser";

  @SerializedName("username")
  private final String username;

  @SerializedName("password")
  private final String password;

  @SerializedName("device")
  private final String device;

  @SerializedName("deviceinfo[name]")
  private final String deviceName;

  public OAuthApplicationUserCredentials (String clientId, String clientSecret, String username, String password, String device, String deviceName) {
    super(GRANT_TYPE, clientId, clientSecret);
    this.username = username;
    this.password = password;
    this.device = device;
    this.deviceName = deviceName;
  }

  public String getUniqueKey() {
    // create hash without any secret or password!
    return getTextualKeyHash(grantType + clientId + username + device + deviceName);
  }
}
