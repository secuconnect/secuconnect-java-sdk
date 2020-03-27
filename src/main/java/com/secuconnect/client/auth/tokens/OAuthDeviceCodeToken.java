package com.secuconnect.client.auth.tokens;

import com.google.gson.annotations.SerializedName;

public class OAuthDeviceCodeToken extends AccessToken {

  @SerializedName("device_code")
  private String deviceCode;

  @SerializedName("user_code")
  private String userCode;

  @SerializedName("verification_url")
  private String verificationUrl;

  @SerializedName("interval")
  private Integer interval;

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
