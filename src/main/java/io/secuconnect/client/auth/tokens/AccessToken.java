package io.secuconnect.client.auth.tokens;

import com.google.gson.annotations.SerializedName;
import java.io.Serializable;
import java.util.Date;

public abstract class AccessToken implements Serializable {

  @SerializedName("expires_in")
  protected Integer expiresIn;

  protected final Date createdAt = new Date();

  public Integer getExpiresIn() {
    return expiresIn;
  }

  public Date getCreatedAt() {
    return createdAt;
  }
}
