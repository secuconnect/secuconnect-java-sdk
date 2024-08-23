package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartDevicesProductModel;
import java.util.Objects;

/**
 * SmartDevicesGetSecubaseConfigDTO
 */
public class SmartDevicesGetSecubaseConfigDTO {
  @SerializedName("secubase_version")
  protected String secubaseVersion = null;

  @SerializedName("secudroid_version")
  protected String secudroidVersion = null;

  @SerializedName("base_version")
  protected String baseVersion = null;

  @SerializedName("terminal_type")
  protected String terminalType = null;

  @SerializedName("terminal_id")
  protected String terminalId = null;

  @SerializedName("smart_device")
  protected SmartDevicesProductModel smartDevice = null;

  public SmartDevicesGetSecubaseConfigDTO secubaseVersion(String secubaseVersion) {
    this.secubaseVersion = secubaseVersion;
    return this;
  }

   /**
   * secubase version for ingenico (c part)
   * @return secubaseVersion
  **/
  public String getSecubaseVersion() {
    return secubaseVersion;
  }

  public void setSecubaseVersion(String secubaseVersion) {
    this.secubaseVersion = secubaseVersion;
  }

  public SmartDevicesGetSecubaseConfigDTO secudroidVersion(String secudroidVersion) {
    this.secudroidVersion = secudroidVersion;
    return this;
  }

   /**
   * version of the android app (java part)
   * @return secudroidVersion
  **/
  public String getSecudroidVersion() {
    return secudroidVersion;
  }

  public void setSecudroidVersion(String secudroidVersion) {
    this.secudroidVersion = secudroidVersion;
  }

  public SmartDevicesGetSecubaseConfigDTO baseVersion(String baseVersion) {
    this.baseVersion = baseVersion;
    return this;
  }

   /**
   * lua base-app version
   * @return baseVersion
  **/
  public String getBaseVersion() {
    return baseVersion;
  }

  public void setBaseVersion(String baseVersion) {
    this.baseVersion = baseVersion;
  }

  public SmartDevicesGetSecubaseConfigDTO terminalType(String terminalType) {
    this.terminalType = terminalType;
    return this;
  }

   /**
   * type of the terminal
   * @return terminalType
  **/
  public String getTerminalType() {
    return terminalType;
  }

  public void setTerminalType(String terminalType) {
    this.terminalType = terminalType;
  }

  public SmartDevicesGetSecubaseConfigDTO terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

   /**
   * terminal id to represent the local device configuration
   * @return terminalId
  **/
  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  public SmartDevicesGetSecubaseConfigDTO smartDevice(SmartDevicesProductModel smartDevice) {
    this.smartDevice = smartDevice;
    return this;
  }

   /**
   * Get smartDevice
   * @return smartDevice
  **/
  public SmartDevicesProductModel getSmartDevice() {
    return smartDevice;
  }

  public void setSmartDevice(SmartDevicesProductModel smartDevice) {
    this.smartDevice = smartDevice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDevicesGetSecubaseConfigDTO smartDevicesGetSecubaseConfigDTO = (SmartDevicesGetSecubaseConfigDTO) o;
    return Objects.equals(this.secubaseVersion, smartDevicesGetSecubaseConfigDTO.secubaseVersion) &&
        Objects.equals(this.secudroidVersion, smartDevicesGetSecubaseConfigDTO.secudroidVersion) &&
        Objects.equals(this.baseVersion, smartDevicesGetSecubaseConfigDTO.baseVersion) &&
        Objects.equals(this.terminalType, smartDevicesGetSecubaseConfigDTO.terminalType) &&
        Objects.equals(this.terminalId, smartDevicesGetSecubaseConfigDTO.terminalId) &&
        Objects.equals(this.smartDevice, smartDevicesGetSecubaseConfigDTO.smartDevice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secubaseVersion, secudroidVersion, baseVersion, terminalType, terminalId, smartDevice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDevicesGetSecubaseConfigDTO {\n");
    sb.append("    secubaseVersion: ").append(toIndentedString(secubaseVersion)).append("\n");
    sb.append("    secudroidVersion: ").append(toIndentedString(secudroidVersion)).append("\n");
    sb.append("    baseVersion: ").append(toIndentedString(baseVersion)).append("\n");
    sb.append("    terminalType: ").append(toIndentedString(terminalType)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    smartDevice: ").append(toIndentedString(smartDevice)).append("\n");
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

