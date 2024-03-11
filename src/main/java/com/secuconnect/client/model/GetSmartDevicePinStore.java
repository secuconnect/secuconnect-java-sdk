package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.STO_ID;
import java.util.Objects;

/**
 * GetSmartDevicePinStore
 */
public class GetSmartDevicePinStore {
  @SerializedName("id")
  protected STO_ID id = null;

  @SerializedName("auth_password_set")
  protected Boolean authPasswordSet = null;

  public GetSmartDevicePinStore id(STO_ID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public STO_ID getId() {
    return id;
  }

  public void setId(STO_ID id) {
    this.id = id;
  }

  public GetSmartDevicePinStore authPasswordSet(Boolean authPasswordSet) {
    this.authPasswordSet = authPasswordSet;
    return this;
  }

   /**
   * Get authPasswordSet
   * @return authPasswordSet
  **/
  public Boolean getAuthPasswordSet() {
    return authPasswordSet;
  }

  public void setAuthPasswordSet(Boolean authPasswordSet) {
    this.authPasswordSet = authPasswordSet;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSmartDevicePinStore getSmartDevicePinStore = (GetSmartDevicePinStore) o;
    return Objects.equals(this.id, getSmartDevicePinStore.id) &&
        Objects.equals(this.authPasswordSet, getSmartDevicePinStore.authPasswordSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, authPasswordSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSmartDevicePinStore {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    authPasswordSet: ").append(toIndentedString(authPasswordSet)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

