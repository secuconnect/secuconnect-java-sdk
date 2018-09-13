package io.secuconnect.client.auth.credentials;

import com.google.gson.annotations.SerializedName;

public class OAuthApplicationUserCredentials extends AuthenticationCredentials {
    @SerializedName("username")
    private String username;

    @SerializedName("password")
    private String password;

    @SerializedName("device")
    private String device;

    @SerializedName("deviceinfo[name]")
    private String deviceName;

    public OAuthApplicationUserCredentials(String clientId, String clientSecret, String username, String password, String device, String deviceName) {
        super(clientId, clientSecret);

        this.grantType = "appuser";
        this.username = username;
        this.password = password;
        this.device = device;
        this.deviceName = deviceName;
    }

    @Override
    public String getUniqueKey() {
        String textualKey = grantType + clientId + username + device + deviceName;
        String textualKeyHash = getTextualKeyHash(textualKey);

        return textualKeyHash;
    }
}
