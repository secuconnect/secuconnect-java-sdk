package com.secuconnect.client.auth.credentials;

import com.google.gson.annotations.SerializedName;

import javax.xml.bind.DatatypeConverter;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;

public abstract class OAuthCredentials {

    @SerializedName("grant_type")
    protected final String grantType;

    @SerializedName("client_id")
    protected final String clientId;

    @SerializedName("client_secret")
    protected final String clientSecret;

    protected OAuthCredentials(String grantType, String clientId, String clientSecret) {
        this.grantType = grantType;
        this.clientId = clientId;
        this.clientSecret = clientSecret;
    }

    public String getGrantType() {
        return grantType;
    }

    public String getClientId() {
        return clientId;
    }

    public String getClientSecret() {
        return clientSecret;
    }

    /**
     * Returns the MD5 hash of the defined credentials object
     *
     * @return md5 hash
     */
    public abstract String getUniqueKey();

    protected String getTextualKeyHash(String textualKey) {
        MessageDigest md;

        try {
            md = MessageDigest.getInstance("MD5");
        } catch (NoSuchAlgorithmException e) {
            e.printStackTrace();
            return null;
        }

        // create hash without secret!
        textualKey = textualKey;

        md.update(textualKey.getBytes());
        byte[] digest = md.digest();

        return DatatypeConverter.printHexBinary(digest).toLowerCase();
    }
}
