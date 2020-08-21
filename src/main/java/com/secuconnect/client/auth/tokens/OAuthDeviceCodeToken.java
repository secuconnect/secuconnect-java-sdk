package com.secuconnect.client.auth.tokens;

import com.google.gson.annotations.SerializedName;

public class OAuthDeviceCodeToken extends Token {

  @SerializedName("expires_in")
  protected Integer expiresIn;

  @SerializedName("device_code")
  protected String deviceCode;

  @SerializedName("user_code")
  protected String userCode;

  @SerializedName("verification_url")
  protected String verificationUrl;

  @SerializedName("interval")
  protected Integer interval;

  public Integer getExpiresIn() {
    return expiresIn;
  }

  public String getDeviceCode() {
    return deviceCode;
  }

  public String getUserCode() {
    return userCode;
  }

  public String getVerificationUrl() {
    return verificationUrl;
  }

  public Integer getInterval() {
    return interval;
  }
}
