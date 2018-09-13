package io.secuconnect.client.auth.credentials;

import com.google.gson.annotations.SerializedName;

public class OAuthDeviceCredentials extends AuthenticationCredentials {
    @SerializedName("uuid")
    private String uuid;

    public OAuthDeviceCredentials(String clientId, String clientSecret, String uuid) {
        super(clientId, clientSecret);

        this.grantType = "device";
        this.uuid = uuid;
    }

    @Override
    public String getUniqueKey() {
        String textualKey = grantType + clientId + uuid;
        String textualKeyHash = getTextualKeyHash(textualKey);

        return textualKeyHash;
    }

    public String getUuid() {
        return uuid;
    }

    private OAuthDeviceCredentials setUuid(String uuid) {
        this.uuid = uuid;
        return this;
    }
}
