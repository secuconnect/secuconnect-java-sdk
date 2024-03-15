package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * GetSmartDevicePinConfigStore
 */
public class GetSmartDevicePinConfigStore {
  @SerializedName("id")
  protected String id = null;

  @SerializedName("auth_password_set")
  protected Boolean authPasswordSet = null;

  public GetSmartDevicePinConfigStore id(String id) {
    this.id = id;
    return this;
  }

   /**
   * General Stores ID
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GetSmartDevicePinConfigStore authPasswordSet(Boolean authPasswordSet) {
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
    GetSmartDevicePinConfigStore getSmartDevicePinConfigStore = (GetSmartDevicePinConfigStore) o;
    return Objects.equals(this.id, getSmartDevicePinConfigStore.id) &&
        Objects.equals(this.authPasswordSet, getSmartDevicePinConfigStore.authPasswordSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, authPasswordSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSmartDevicePinConfigStore {\n");
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

