package com.secuconnect.client.printer;

import com.secuconnect.client.auth.tokens.OAuthDeviceCodeToken;

public interface Printer {

  void printUserCode(OAuthDeviceCodeToken token);

  void printVerificationUrl(OAuthDeviceCodeToken token);
}
