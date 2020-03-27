package com.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * SmartDevicesDTOPrepaidTid
 */
public class SmartDevicesDTOPrepaidTid {
  @SerializedName("tid")
  private String tid = null;

  @SerializedName("force")
  private Boolean force = null;

  public SmartDevicesDTOPrepaidTid tid(String tid) {
    this.tid = tid;
    return this;
  }

   /**
   * Tid
   * @return tid
  **/
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public SmartDevicesDTOPrepaidTid force(Boolean force) {
    this.force = force;
    return this;
  }

   /**
   * Force
   * @return force
  **/
  public Boolean isForce() {
    return force;
  }

  public void setForce(Boolean force) {
    this.force = force;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDevicesDTOPrepaidTid smartDevicesDTOPrepaidTid = (SmartDevicesDTOPrepaidTid) o;
    return Objects.equals(this.tid, smartDevicesDTOPrepaidTid.tid) &&
        Objects.equals(this.force, smartDevicesDTOPrepaidTid.force);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tid, force);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDevicesDTOPrepaidTid {\n");
    
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    force: ").append(toIndentedString(force)).append("\n");
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

