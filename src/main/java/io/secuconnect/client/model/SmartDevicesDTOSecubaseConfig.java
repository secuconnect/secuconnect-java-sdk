package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

/**
 * SmartDevicesDTOSecubaseConfig
 */
public class SmartDevicesDTOSecubaseConfig {
  @SerializedName("secubaseVersion")
  private String secubaseVersion = null;

  @SerializedName("baseVersion")
  private String baseVersion = null;

  @SerializedName("oaiVersion")
  private String oaiVersion = null;

  public SmartDevicesDTOSecubaseConfig secubaseVersion(String secubaseVersion) {
    this.secubaseVersion = secubaseVersion;
    return this;
  }

   /**
   * Secubase version
   * @return secubaseVersion
  **/
  public String getSecubaseVersion() {
    return secubaseVersion;
  }

  public void setSecubaseVersion(String secubaseVersion) {
    this.secubaseVersion = secubaseVersion;
  }

  public SmartDevicesDTOSecubaseConfig baseVersion(String baseVersion) {
    this.baseVersion = baseVersion;
    return this;
  }

   /**
   * Base version
   * @return baseVersion
  **/
  public String getBaseVersion() {
    return baseVersion;
  }

  public void setBaseVersion(String baseVersion) {
    this.baseVersion = baseVersion;
  }

  public SmartDevicesDTOSecubaseConfig oaiVersion(String oaiVersion) {
    this.oaiVersion = oaiVersion;
    return this;
  }

   /**
   * Oai version
   * @return oaiVersion
  **/
  public String getOaiVersion() {
    return oaiVersion;
  }

  public void setOaiVersion(String oaiVersion) {
    this.oaiVersion = oaiVersion;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDevicesDTOSecubaseConfig smartDevicesDTOSecubaseConfig = (SmartDevicesDTOSecubaseConfig) o;
    return Objects.equals(this.secubaseVersion, smartDevicesDTOSecubaseConfig.secubaseVersion) &&
        Objects.equals(this.baseVersion, smartDevicesDTOSecubaseConfig.baseVersion) &&
        Objects.equals(this.oaiVersion, smartDevicesDTOSecubaseConfig.oaiVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secubaseVersion, baseVersion, oaiVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDevicesDTOSecubaseConfig {\n");
    
    sb.append("    secubaseVersion: ").append(toIndentedString(secubaseVersion)).append("\n");
    sb.append("    baseVersion: ").append(toIndentedString(baseVersion)).append("\n");
    sb.append("    oaiVersion: ").append(toIndentedString(oaiVersion)).append("\n");
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

