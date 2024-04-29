package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * PrepaidSalesSmartDevice
 */
public class PrepaidSalesSmartDevice {
  @SerializedName("object")
  protected String object = null;

  @SerializedName("id")
  protected String id = null;

  @SerializedName("description")
  protected String description = null;

  @SerializedName("vendor_uid")
  protected String vendorUid = null;

  public PrepaidSalesSmartDevice object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public PrepaidSalesSmartDevice id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Smart Device ID
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PrepaidSalesSmartDevice description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Short description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PrepaidSalesSmartDevice vendorUid(String vendorUid) {
    this.vendorUid = vendorUid;
    return this;
  }

   /**
   * Smart Device vendor UID
   * @return vendorUid
  **/
  public String getVendorUid() {
    return vendorUid;
  }

  public void setVendorUid(String vendorUid) {
    this.vendorUid = vendorUid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrepaidSalesSmartDevice prepaidSalesSmartDevice = (PrepaidSalesSmartDevice) o;
    return Objects.equals(this.object, prepaidSalesSmartDevice.object) &&
        Objects.equals(this.id, prepaidSalesSmartDevice.id) &&
        Objects.equals(this.description, prepaidSalesSmartDevice.description) &&
        Objects.equals(this.vendorUid, prepaidSalesSmartDevice.vendorUid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, description, vendorUid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepaidSalesSmartDevice {\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    vendorUid: ").append(toIndentedString(vendorUid)).append("\n");
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

