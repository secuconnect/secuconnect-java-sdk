package com.secuconnect.client;

import com.secuconnect.client.auth.credentials.OAuthApplicationUserCredentials;
import com.secuconnect.client.auth.credentials.OAuthClientCredentials;
import com.secuconnect.client.auth.credentials.OAuthDeviceCodeCredentials;

public class Globals {
    public static final OAuthClientCredentials O_AUTH_CLIENT_CREDENTIALS = new OAuthClientCredentials(
            "09ae83af7c37121b2de929b211bad944",
            "9c5f250b69f6436cb38fd780349bc00810d8d5051d3dcf821e428f65a32724bd"
    );

    public static final OAuthApplicationUserCredentials O_AUTH_APPLICATION_USER_CREDENTIALS = new OAuthApplicationUserCredentials(
            "app.main.secucard",
            "not set",
            "testing@secupay-ag.de",
            "...",
            "XYZ",
            "value"
    );
    public static final OAuthDeviceCodeCredentials O_AUTH_DEVICE_CREDENTIALS;

    static {
        O_AUTH_DEVICE_CREDENTIALS = new OAuthDeviceCodeCredentials(
                "611c00ec6b2be6c77c2338774f50040b",
                "dc1f422dde755f0b1c4ac04e7efbd6c4c78870691fe783266d7d6c89439925eb",
                "/vendor/unknown/cashier/dotnettest1"
        );
    }
}
