package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartDeviceProductsEnabled;
import java.util.Objects;

/**
 * SmartDeviceProductsVtm
 */
public class SmartDeviceProductsVtm extends SmartDeviceProductsEnabled {
  @SerializedName("demo_force")
  protected Boolean demoForce = null;

  public SmartDeviceProductsVtm demoForce(Boolean demoForce) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDeviceProductsVtm smartDeviceProductsVtm = (SmartDeviceProductsVtm) o;
    return Objects.equals(this.demoForce, smartDeviceProductsVtm.demoForce) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(demoForce, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDeviceProductsVtm {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    demoForce: ").append(toIndentedString(demoForce)).append("\n");
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

