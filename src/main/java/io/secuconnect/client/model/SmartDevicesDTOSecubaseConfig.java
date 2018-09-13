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
  @ApiModelProperty(value = "Secubase version")
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
  @ApiModelProperty(value = "Base version")
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
  @ApiModelProperty(value = "Oai version")
  public String getOaiVersion() {
    return oaiVersion;
  }

  public void setOaiVersion(String oaiVersion) {
    this.oaiVersion = oaiVersion;
  }

  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

