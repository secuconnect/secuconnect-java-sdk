package com.secuconnect.client.printer;

import com.secuconnect.client.auth.tokens.OAuthDeviceCodeToken;

public class ImitationDevicePrinter implements Printer {

    public void printUserCode(OAuthDeviceCodeToken token) {
        if (token != null && token.getUserCode() != null && token.getUserCode().length() != 0) {
            System.out.println(
                "Your user code is: " + token.getUserCode() + System.lineSeparator() +
                "Please enter this code on: " + token.getVerificationUrl() +
                " or call +49(0)35955/7550825 to verify your device." + System.lineSeparator()
            );
        } else {
            System.out.println("Something went wrong. Please try to obtain user code again." + System.lineSeparator());
        }
    }
}
