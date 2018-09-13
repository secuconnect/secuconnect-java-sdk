package io.secuconnect.client.cache;

import io.secuconnect.client.auth.tokens.AccessToken;

import java.util.Date;

public abstract class CacheItem {
    protected boolean wasExpiring(AccessToken accessToken) {
        long expiresIn = accessToken.getExpiresIn();
        Date createdAt = accessToken.getCreatedAt();
        Date now = new Date();
        long diff = now.getTime() - createdAt.getTime();
        long difference = diff/1000;

        if (expiresIn-30 >= difference) {
            return false;
        } else {
            return true;
        }
    }

    public abstract void set(String name, AccessToken accessToken);
    public abstract AccessToken get(String name);
}
