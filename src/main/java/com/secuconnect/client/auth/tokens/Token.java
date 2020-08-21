package com.secuconnect.client.auth.tokens;

import com.google.gson.annotations.SerializedName;

import java.io.Serializable;

public abstract class Token implements Serializable {

    @SerializedName("expires_in")
    protected Integer expiresIn;

    public Integer getExpiresIn() {
        return expiresIn;
    }
}
