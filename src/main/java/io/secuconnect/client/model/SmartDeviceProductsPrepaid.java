package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

/**
 * SmartDeviceProductsPrepaid
 */
public class SmartDeviceProductsPrepaid {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("simulate_force")
  private Boolean simulateForce = null;

  @SerializedName("demo_force")
  private Boolean demoForce = null;

  @SerializedName("vtc_tid")
  private String vtcTid = null;

  public SmartDeviceProductsPrepaid enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Enabled
   * @return enabled
  **/
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public SmartDeviceProductsPrepaid simulateForce(Boolean simulateForce) {
    this.simulateForce = simulateForce;
    return this;
  }

   /**
   * Simulate force
   * @return simulateForce
  **/
  public Boolean getSimulateForce() {
    return simulateForce;
  }

  public void setSimulateForce(Boolean simulateForce) {
    this.simulateForce = simulateForce;
  }

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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDeviceProductsPrepaid smartDeviceProductsPrepaid = (SmartDeviceProductsPrepaid) o;
    return Objects.equals(this.enabled, smartDeviceProductsPrepaid.enabled) &&
        Objects.equals(this.simulateForce, smartDeviceProductsPrepaid.simulateForce) &&
        Objects.equals(this.demoForce, smartDeviceProductsPrepaid.demoForce) &&
        Objects.equals(this.vtcTid, smartDeviceProductsPrepaid.vtcTid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, simulateForce, demoForce, vtcTid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDeviceProductsPrepaid {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    simulateForce: ").append(toIndentedString(simulateForce)).append("\n");
    sb.append("    demoForce: ").append(toIndentedString(demoForce)).append("\n");
    sb.append("    vtcTid: ").append(toIndentedString(vtcTid)).append("\n");
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

