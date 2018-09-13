package io.secuconnect.client.cache;

import io.secuconnect.client.auth.tokens.AccessToken;
import java.util.Date;

public abstract class CacheItem {

  public boolean wasExpiring(AccessToken accessToken) {
    long expiresIn = accessToken.getExpiresIn();
    Date createdAt = accessToken.getCreatedAt();
    Date now = new Date();
    long diff = now.getTime() - createdAt.getTime();
    long difference = diff / 1000;

    return expiresIn - 30 < difference;
  }

  public abstract void set(String name, AccessToken accessToken);

  public abstract AccessToken get(String name);
}
