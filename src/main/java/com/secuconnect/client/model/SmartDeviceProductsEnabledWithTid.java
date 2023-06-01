package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartDeviceProductsEnabled;
import java.util.Objects;

/**
 * SmartDeviceProductsEnabledWithTid
 */
public class SmartDeviceProductsEnabledWithTid extends SmartDeviceProductsEnabled {
  @SerializedName("tid")
  protected String tid = null;

  public SmartDeviceProductsEnabledWithTid tid(String tid) {
    this.tid = tid;
    return this;
  }

   /**
   * TID
   * @return tid
  **/
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDeviceProductsEnabledWithTid smartDeviceProductsEnabledWithTid = (SmartDeviceProductsEnabledWithTid) o;
    return Objects.equals(this.tid, smartDeviceProductsEnabledWithTid.tid) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tid, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDeviceProductsEnabledWithTid {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
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

