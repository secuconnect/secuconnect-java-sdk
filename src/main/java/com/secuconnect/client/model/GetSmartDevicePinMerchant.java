package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.MRC_ID;
import java.util.Objects;

/**
 * GetSmartDevicePinMerchant
 */
public class GetSmartDevicePinMerchant {
  @SerializedName("id")
  protected MRC_ID id = null;

  @SerializedName("auth_password_set")
  protected Boolean authPasswordSet = null;

  public GetSmartDevicePinMerchant id(MRC_ID id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public MRC_ID getId() {
    return id;
  }

  public void setId(MRC_ID id) {
    this.id = id;
  }

  public GetSmartDevicePinMerchant authPasswordSet(Boolean authPasswordSet) {
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
    GetSmartDevicePinMerchant getSmartDevicePinMerchant = (GetSmartDevicePinMerchant) o;
    return Objects.equals(this.id, getSmartDevicePinMerchant.id) &&
        Objects.equals(this.authPasswordSet, getSmartDevicePinMerchant.authPasswordSet);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, authPasswordSet);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSmartDevicePinMerchant {\n");
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

