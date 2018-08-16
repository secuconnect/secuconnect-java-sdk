package io.secuconnect.client;

import io.secuconnect.client.auth.credentials.OAuthApplicationUserCredentials;
import io.secuconnect.client.auth.credentials.OAuthClientCredentials;
import io.secuconnect.client.auth.credentials.OAuthDeviceCredentials;

public class Globals {
    public static final OAuthClientCredentials O_AUTH_CLIENT_CREDENTIALS = new OAuthClientCredentials(
            "",
            ""
    );

    public static final OAuthApplicationUserCredentials O_AUTH_APPLICATION_USER_CREDENTIALS = new OAuthApplicationUserCredentials(
            "app.main.secucard",
            "not set",
            "",
            "",
            "XYZ",
            "value"
    );
    public static final OAuthDeviceCredentials O_AUTH_DEVICE_CREDENTIALS;

    static {
        O_AUTH_DEVICE_CREDENTIALS = new OAuthDeviceCredentials(
                "",
                "",
                ""
        );
    }
}
