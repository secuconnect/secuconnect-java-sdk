package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.SmartDevicesSecubaseConfigLogging;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SmartDevicesSecubaseConfig
 */
public class SmartDevicesSecubaseConfig {
  @SerializedName("apps")
  private List<String> apps = null;

  @SerializedName("logging")
  private SmartDevicesSecubaseConfigLogging logging = null;

  public SmartDevicesSecubaseConfig apps(List<String> apps) {
    this.apps = apps;
    return this;
  }

  public SmartDevicesSecubaseConfig addAppsItem(String appsItem) {
    if (this.apps == null) {
      this.apps = new ArrayList<String>();
    }
    this.apps.add(appsItem);
    return this;
  }

   /**
   * Apps
   * @return apps
  **/
  @ApiModelProperty(value = "Apps")
  public List<String> getApps() {
    return apps;
  }

  public void setApps(List<String> apps) {
    this.apps = apps;
  }

  public SmartDevicesSecubaseConfig logging(SmartDevicesSecubaseConfigLogging logging) {
    this.logging = logging;
    return this;
  }

   /**
   * Logging
   * @return logging
  **/
  @ApiModelProperty(value = "Logging")
  public SmartDevicesSecubaseConfigLogging getLogging() {
    return logging;
  }

  public void setLogging(SmartDevicesSecubaseConfigLogging logging) {
    this.logging = logging;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDevicesSecubaseConfig smartDevicesSecubaseConfig = (SmartDevicesSecubaseConfig) o;
    return Objects.equals(this.apps, smartDevicesSecubaseConfig.apps) &&
        Objects.equals(this.logging, smartDevicesSecubaseConfig.logging);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apps, logging);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDevicesSecubaseConfig {\n");
    
    sb.append("    apps: ").append(toIndentedString(apps)).append("\n");
    sb.append("    logging: ").append(toIndentedString(logging)).append("\n");
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

