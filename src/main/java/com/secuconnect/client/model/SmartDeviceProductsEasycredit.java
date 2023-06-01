package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartDeviceProductsEnabledWithTid;
import java.util.Objects;

/**
 * SmartDeviceProductsEasycredit
 */
public class SmartDeviceProductsEasycredit extends SmartDeviceProductsEnabledWithTid {
  @SerializedName("vu")
  protected String vu = null;

  public SmartDeviceProductsEasycredit vu(String vu) {
    this.vu = vu;
    return this;
  }

   /**
   * VU
   * @return vu
  **/
  public String getVu() {
    return vu;
  }

  public void setVu(String vu) {
    this.vu = vu;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDeviceProductsEasycredit smartDeviceProductsEasycredit = (SmartDeviceProductsEasycredit) o;
    return Objects.equals(this.vu, smartDeviceProductsEasycredit.vu) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(vu, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDeviceProductsEasycredit {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    vu: ").append(toIndentedString(vu)).append("\n");
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

