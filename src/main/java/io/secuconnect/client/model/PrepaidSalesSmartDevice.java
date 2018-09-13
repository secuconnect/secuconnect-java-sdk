package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/**
 * PrepaidSalesSmartDevice
 */
public class PrepaidSalesSmartDevice {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("vendor_uid")
  private String vendorUid = null;

  public PrepaidSalesSmartDevice object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of smart device
   * @return object
  **/
  @ApiModelProperty(value = "Object of smart device")
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
   * Id of smart device
   * @return id
  **/
  @ApiModelProperty(value = "Id of smart device")
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
   * Smart device description
   * @return description
  **/
  @ApiModelProperty(value = "Smart device description")
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
   * Smart device vendor uid
   * @return vendorUid
  **/
  @ApiModelProperty(value = "Smart device vendor uid")
  public String getVendorUid() {
    return vendorUid;
  }

  public void setVendorUid(String vendorUid) {
    this.vendorUid = vendorUid;
  }

  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

