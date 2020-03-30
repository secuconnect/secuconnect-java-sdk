package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * SmartDevicesDevice
 */
public class SmartDevicesDevice {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("serial_number")
  private String serialNumber = null;

  public SmartDevicesDevice object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of device
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public SmartDevicesDevice id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of device
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SmartDevicesDevice serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Serial number
   * @return serialNumber
  **/
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDevicesDevice smartDevicesDevice = (SmartDevicesDevice) o;
    return Objects.equals(this.object, smartDevicesDevice.object) &&
        Objects.equals(this.id, smartDevicesDevice.id) &&
        Objects.equals(this.serialNumber, smartDevicesDevice.serialNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, serialNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDevicesDevice {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
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

