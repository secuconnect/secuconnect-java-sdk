package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.SmartDevicesSecubaseConfigLoggingFileNet;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * SmartDevicesSecubaseConfigLogging
 */
public class SmartDevicesSecubaseConfigLogging {
  @SerializedName("secubase")
  private SmartDevicesSecubaseConfigLoggingFileNet secubase = null;

  @SerializedName("app")
  private SmartDevicesSecubaseConfigLoggingFileNet app = null;

  public SmartDevicesSecubaseConfigLogging secubase(SmartDevicesSecubaseConfigLoggingFileNet secubase) {
    this.secubase = secubase;
    return this;
  }

   /**
   * Secubase
   * @return secubase
  **/
  public SmartDevicesSecubaseConfigLoggingFileNet getSecubase() {
    return secubase;
  }

  public void setSecubase(SmartDevicesSecubaseConfigLoggingFileNet secubase) {
    this.secubase = secubase;
  }

  public SmartDevicesSecubaseConfigLogging app(SmartDevicesSecubaseConfigLoggingFileNet app) {
    this.app = app;
    return this;
  }

   /**
   * App
   * @return app
  **/
  public SmartDevicesSecubaseConfigLoggingFileNet getApp() {
    return app;
  }

  public void setApp(SmartDevicesSecubaseConfigLoggingFileNet app) {
    this.app = app;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDevicesSecubaseConfigLogging smartDevicesSecubaseConfigLogging = (SmartDevicesSecubaseConfigLogging) o;
    return Objects.equals(this.secubase, smartDevicesSecubaseConfigLogging.secubase) &&
        Objects.equals(this.app, smartDevicesSecubaseConfigLogging.app);
  }

  @Override
  public int hashCode() {
    return Objects.hash(secubase, app);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDevicesSecubaseConfigLogging {\n");
    
    sb.append("    secubase: ").append(toIndentedString(secubase)).append("\n");
    sb.append("    app: ").append(toIndentedString(app)).append("\n");
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

