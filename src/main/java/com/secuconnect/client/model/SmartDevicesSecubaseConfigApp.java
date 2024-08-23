package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * SmartDevicesSecubaseConfigApp
 */
public class SmartDevicesSecubaseConfigApp {
  @SerializedName("app_id")
  protected String appId = null;

  @SerializedName("app_name")
  protected String appName = null;

  @SerializedName("version")
  protected String version = null;

  @SerializedName("url")
  protected String url = null;

  @SerializedName("etag")
  protected String etag = null;

  @SerializedName("prio")
  protected Integer prio = null;

  public SmartDevicesSecubaseConfigApp appId(String appId) {
    this.appId = appId;
    return this;
  }

   /**
   * General Apps ID
   * @return appId
  **/
  public String getAppId() {
    return appId;
  }

  public void setAppId(String appId) {
    this.appId = appId;
  }

  public SmartDevicesSecubaseConfigApp appName(String appName) {
    this.appName = appName;
    return this;
  }

   /**
   * Name of the app
   * @return appName
  **/
  public String getAppName() {
    return appName;
  }

  public void setAppName(String appName) {
    this.appName = appName;
  }

  public SmartDevicesSecubaseConfigApp version(String version) {
    this.version = version;
    return this;
  }

   /**
   * the app version code as &#x27;major.minor.patch&#x27;
   * @return version
  **/
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  public SmartDevicesSecubaseConfigApp url(String url) {
    this.url = url;
    return this;
  }

   /**
   * url
   * @return url
  **/
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public SmartDevicesSecubaseConfigApp etag(String etag) {
    this.etag = etag;
    return this;
  }

   /**
   * etag of the app package
   * @return etag
  **/
  public String getEtag() {
    return etag;
  }

  public void setEtag(String etag) {
    this.etag = etag;
  }

  public SmartDevicesSecubaseConfigApp prio(Integer prio) {
    this.prio = prio;
    return this;
  }

   /**
   * the app priority
   * @return prio
  **/
  public Integer getPrio() {
    return prio;
  }

  public void setPrio(Integer prio) {
    this.prio = prio;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDevicesSecubaseConfigApp smartDevicesSecubaseConfigApp = (SmartDevicesSecubaseConfigApp) o;
    return Objects.equals(this.appId, smartDevicesSecubaseConfigApp.appId) &&
        Objects.equals(this.appName, smartDevicesSecubaseConfigApp.appName) &&
        Objects.equals(this.version, smartDevicesSecubaseConfigApp.version) &&
        Objects.equals(this.url, smartDevicesSecubaseConfigApp.url) &&
        Objects.equals(this.etag, smartDevicesSecubaseConfigApp.etag) &&
        Objects.equals(this.prio, smartDevicesSecubaseConfigApp.prio);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appId, appName, version, url, etag, prio);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDevicesSecubaseConfigApp {\n");
    sb.append("    appId: ").append(toIndentedString(appId)).append("\n");
    sb.append("    appName: ").append(toIndentedString(appName)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    etag: ").append(toIndentedString(etag)).append("\n");
    sb.append("    prio: ").append(toIndentedString(prio)).append("\n");
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

