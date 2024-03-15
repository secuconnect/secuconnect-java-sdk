package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * GetSmartDevicePinConfigSmartDevice
 */
public class GetSmartDevicePinConfigSmartDevice {
  @SerializedName("id")
  protected String id = null;

  @SerializedName("auth_password_set")
  protected Boolean authPasswordSet = null;

  public GetSmartDevicePinConfigSmartDevice id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Smart Devices ID
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GetSmartDevicePinConfigSmartDevice authPasswordSet(Boolean authPasswordSet) {
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
    GetSmartDevicePinConfigSmartDevice getSmartDevicePinConfigSmartDevice = (GetSmartDevicePinConfigSmartDevice) o;
    return Objects.equals(this.id, getSmartDevicePinConfigSmartDevice.id) &&
        Objects.equals(this.authPasswordSet, getSmartDevicePinConfigSmartDevice.authPasswordSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, authPasswordSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSmartDevicePinConfigSmartDevice {\n");
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

