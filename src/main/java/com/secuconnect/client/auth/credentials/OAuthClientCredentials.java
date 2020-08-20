package com.secuconnect.client.auth.credentials;

public class OAuthClientCredentials extends OAuthCredentials {
  public static final String GRANT_TYPE = "client_credentials";

  public OAuthClientCredentials(String clientId, String clientSecret) {
    super(GRANT_TYPE, clientId, clientSecret);
  }

  @Override
  public String getUniqueKey() {
    // create hash without any secret or password!
    return getTextualKeyHash(grantType + clientId);
  }
}
