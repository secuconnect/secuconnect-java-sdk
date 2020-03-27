package com.secuconnect.client.auth.credentials;

public abstract class OAuthDeviceBasicCredentials extends AuthenticationCredentials {

  public OAuthDeviceBasicCredentials(String clientId, String clientSecret) {
    super(clientId, clientSecret);

    this.grantType = "device";
  }

  @Override
  public String getUniqueKey() {
    String textualKey = grantType + clientId;
    String textualKeyHash = getTextualKeyHash(textualKey);

    return textualKeyHash;
  }
}
