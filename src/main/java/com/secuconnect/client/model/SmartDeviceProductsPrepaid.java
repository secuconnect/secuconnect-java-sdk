package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartDeviceProductsEnabledWithTid;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SmartDeviceProductsPrepaid
 */
public class SmartDeviceProductsPrepaid extends SmartDeviceProductsEnabledWithTid {
  @SerializedName("demo_force")
  private Boolean demoForce = null;

  @SerializedName("vtc_tid")
  private String vtcTid = null;

  @SerializedName("endofday")
  private Boolean endofday = null;

  @SerializedName("password")
  private List<String> password = null;

  @SerializedName("simulate")
  private Boolean simulate = null;

  public SmartDeviceProductsPrepaid demoForce(Boolean demoForce) {
    this.demoForce = demoForce;
    return this;
  }

   /**
   * Demo force
   * @return demoForce
  **/
  public Boolean getDemoForce() {
    return demoForce;
  }

  public void setDemoForce(Boolean demoForce) {
    this.demoForce = demoForce;
  }

  public SmartDeviceProductsPrepaid vtcTid(String vtcTid) {
    this.vtcTid = vtcTid;
    return this;
  }

   /**
   * Vtc tid
   * @return vtcTid
  **/
  public String getVtcTid() {
    return vtcTid;
  }

  public void setVtcTid(String vtcTid) {
    this.vtcTid = vtcTid;
  }

  public SmartDeviceProductsPrepaid endofday(Boolean endofday) {
    this.endofday = endofday;
    return this;
  }

   /**
   * EndOfDay
   * @return endofday
  **/
  public Boolean getEndofday() {
    return endofday;
  }

  public void setEndofday(Boolean endofday) {
    this.endofday = endofday;
  }

  public SmartDeviceProductsPrepaid password(List<String> password) {
    this.password = password;
    return this;
  }

  public SmartDeviceProductsPrepaid addPasswordItem(String passwordItem) {
    if (this.password == null) {
      this.password = new ArrayList<>();
    }
    this.password.add(passwordItem);
    return this;
  }

   /**
   * List of passwords which are allowed to run the terminal app
   * @return password
  **/
  public List<String> getPassword() {
    return password;
  }

  public void setPassword(List<String> password) {
    this.password = password;
  }

  public SmartDeviceProductsPrepaid simulate(Boolean simulate) {
    this.simulate = simulate;
    return this;
  }

   /**
   * Simulate
   * @return simulate
  **/
  public Boolean getSimulate() {
    return simulate;
  }

  public void setSimulate(Boolean simulate) {
    this.simulate = simulate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDeviceProductsPrepaid smartDeviceProductsPrepaid = (SmartDeviceProductsPrepaid) o;
    return Objects.equals(this.demoForce, smartDeviceProductsPrepaid.demoForce) &&
        Objects.equals(this.vtcTid, smartDeviceProductsPrepaid.vtcTid) &&
        Objects.equals(this.endofday, smartDeviceProductsPrepaid.endofday) &&
        Objects.equals(this.password, smartDeviceProductsPrepaid.password) &&
        Objects.equals(this.simulate, smartDeviceProductsPrepaid.simulate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(demoForce, vtcTid, endofday, password, simulate, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDeviceProductsPrepaid {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    demoForce: ").append(toIndentedString(demoForce)).append("\n");
    sb.append("    vtcTid: ").append(toIndentedString(vtcTid)).append("\n");
    sb.append("    endofday: ").append(toIndentedString(endofday)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
    sb.append("    simulate: ").append(toIndentedString(simulate)).append("\n");
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

