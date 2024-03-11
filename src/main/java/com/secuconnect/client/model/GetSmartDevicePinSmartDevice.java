package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SDV_ID;
import java.util.Objects;

/**
 * GetSmartDevicePinSmartDevice
 */
public class GetSmartDevicePinSmartDevice {
  @SerializedName("id")
  protected SDV_ID id = null;

  @SerializedName("auth_password_set")
  protected Boolean authPasswordSet = null;

  public GetSmartDevicePinSmartDevice id(SDV_ID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public SDV_ID getId() {
    return id;
  }

  public void setId(SDV_ID id) {
    this.id = id;
  }

  public GetSmartDevicePinSmartDevice authPasswordSet(Boolean authPasswordSet) {
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
    GetSmartDevicePinSmartDevice getSmartDevicePinSmartDevice = (GetSmartDevicePinSmartDevice) o;
    return Objects.equals(this.id, getSmartDevicePinSmartDevice.id) &&
        Objects.equals(this.authPasswordSet, getSmartDevicePinSmartDevice.authPasswordSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, authPasswordSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSmartDevicePinSmartDevice {\n");
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

