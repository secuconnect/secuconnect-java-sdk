package com.secuconnect.client.auth.credentials;

import com.google.gson.annotations.SerializedName;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import javax.xml.bind.DatatypeConverter;

public abstract class AuthenticationCredentials {

  @SerializedName("grant_type")
  protected String grantType;

  @SerializedName("client_id")
  protected String clientId;

  @SerializedName("client_secret")
  protected String clientSecret;

  public AuthenticationCredentials(String clientId, String clientSecret) {
    this.clientId = clientId;
    this.clientSecret = clientSecret;
  }

  public abstract String getUniqueKey();

  protected String getTextualKeyHash(String textualKey) {
    MessageDigest md = null;
    try {
      md = MessageDigest.getInstance("MD5");
    } catch (NoSuchAlgorithmException e) {
      e.printStackTrace();
    }
    md.update(textualKey.getBytes());
    byte[] digest = md.digest();
    String textualKeyHash = DatatypeConverter.printHexBinary(digest).toLowerCase();

    return textualKeyHash;
  }

  public String getGrantType() {
    return grantType;
  }

  private AuthenticationCredentials setGrantType(String grantType) {
    this.grantType = grantType;
    return this;
  }

  public String getClientId() {
    return this.clientId;
  }

  private AuthenticationCredentials setClientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

  public String getClientSecret() {
    return this.clientSecret;
  }

  private AuthenticationCredentials setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }
}
