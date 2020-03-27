package com.secuconnect.client.stomp.model;

import com.google.gson.annotations.SerializedName;

public class AuthSessionsRefresh {
    @SerializedName("refresh_interval")
    private int refreshInterval;

    public int getRefreshInterval() {
        return this.refreshInterval;
    }

    public void setRefreshInterval(int refreshInterval) {
        this.refreshInterval = refreshInterval;
    }
}