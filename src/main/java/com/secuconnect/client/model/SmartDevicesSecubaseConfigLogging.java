package com.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.secuconnect.client.model.SmartDevicesSecubaseConfigLoggingFileNet;
import java.io.IOException;

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
   * Get secubase
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
   * Get app
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

