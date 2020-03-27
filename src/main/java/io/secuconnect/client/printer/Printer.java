package io.secuconnect.client.printer;

import io.secuconnect.client.auth.tokens.OAuthDeviceCodeToken;

public interface Printer {

  void printUserCode(OAuthDeviceCodeToken token);

  void printVerificationUrl(OAuthDeviceCodeToken token);
}
