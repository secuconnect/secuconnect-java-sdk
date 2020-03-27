package com.secuconnect.client.auth.credentials;

public class OAuthClientCredentials extends AuthenticationCredentials {

  public OAuthClientCredentials(String clientId, String clientSecret) {
    super(clientId, clientSecret);

    this.grantType = "client_credentials";
  }

  @Override
  public String getUniqueKey() {
    String textualKey = grantType + clientId;
    String textualKeyHash = getTextualKeyHash(textualKey);

    return textualKeyHash;
  }
}
