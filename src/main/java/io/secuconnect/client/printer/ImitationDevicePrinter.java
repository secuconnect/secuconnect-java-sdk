package io.secuconnect.client.printer;

import io.secuconnect.client.auth.tokens.OAuthDeviceCodeToken;

public class ImitationDevicePrinter implements Printer {

  public void printUserCode(OAuthDeviceCodeToken token) {
    System.out.println("Your user code is: " + token.getUserCode());
  }

  public void printVerificationUrl(OAuthDeviceCodeToken token) {
    System.out.println("Your verification url is: " + token.getVerificationUrl());
  }
}
