package io.secuconnect.client;

import io.secuconnect.client.auth.credentials.OAuthApplicationUserCredentials;
import io.secuconnect.client.auth.credentials.OAuthClientCredentials;
import io.secuconnect.client.auth.credentials.OAuthDeviceCodeCredentials;

public class Globals {
    public static final OAuthClientCredentials O_AUTH_CLIENT_CREDENTIALS = new OAuthClientCredentials(
            "09ae83af7c37121b2de929b211bad944",
            "9c5f250b69f6436cb38fd780349bc00810d8d5051d3dcf821e428f65a32724bd"
    );

    public static final OAuthClientCredentials O_AUTH_CLIENT_CREDENTIALS_FOR_PAYMENT_CONTRACTS = new OAuthClientCredentials(
            "61c4e67fca435d864436fc174a0c309d",
            "0ecfb081e6af8c5bae90923ec8fa384b83bb7097c21ee1457fad0ab994a81617"
    );

    public static final OAuthApplicationUserCredentials O_AUTH_APPLICATION_USER_CREDENTIALS = new OAuthApplicationUserCredentials(
            "app.main.secucard",
            "not set",
            "testing@secupay-ag.de",
            "Test12345!",
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
