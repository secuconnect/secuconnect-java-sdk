package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.SmartDeviceProductsEnabled;
import io.secuconnect.client.model.SmartDeviceProductsPrepaid;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * SmartDevicesProducts
 */
public class SmartDevicesProducts {
  @SerializedName("loyalty")
  private SmartDeviceProductsEnabled loyalty = null;

  @SerializedName("smart")
  private SmartDeviceProductsEnabled smart = null;

  @SerializedName("cashreg")
  private SmartDeviceProductsEnabled cashreg = null;

  @SerializedName("collect")
  private SmartDeviceProductsEnabled collect = null;

  @SerializedName("showcase")
  private SmartDeviceProductsEnabled showcase = null;

  @SerializedName("vtm")
  private SmartDeviceProductsEnabled vtm = null;

  @SerializedName("prepaid")
  private SmartDeviceProductsPrepaid prepaid = null;

  public SmartDevicesProducts loyalty(SmartDeviceProductsEnabled loyalty) {
    this.loyalty = loyalty;
    return this;
  }

   /**
   * Get loyalty
   * @return loyalty
  **/
  public SmartDeviceProductsEnabled getLoyalty() {
    return loyalty;
  }

  public void setLoyalty(SmartDeviceProductsEnabled loyalty) {
    this.loyalty = loyalty;
  }

  public SmartDevicesProducts smart(SmartDeviceProductsEnabled smart) {
    this.smart = smart;
    return this;
  }

   /**
   * Get smart
   * @return smart
  **/
  public SmartDeviceProductsEnabled getSmart() {
    return smart;
  }

  public void setSmart(SmartDeviceProductsEnabled smart) {
    this.smart = smart;
  }

  public SmartDevicesProducts cashreg(SmartDeviceProductsEnabled cashreg) {
    this.cashreg = cashreg;
    return this;
  }

   /**
   * Get cashreg
   * @return cashreg
  **/
  public SmartDeviceProductsEnabled getCashreg() {
    return cashreg;
  }

  public void setCashreg(SmartDeviceProductsEnabled cashreg) {
    this.cashreg = cashreg;
  }

  public SmartDevicesProducts collect(SmartDeviceProductsEnabled collect) {
    this.collect = collect;
    return this;
  }

   /**
   * Get collect
   * @return collect
  **/
  public SmartDeviceProductsEnabled getCollect() {
    return collect;
  }

  public void setCollect(SmartDeviceProductsEnabled collect) {
    this.collect = collect;
  }

  public SmartDevicesProducts showcase(SmartDeviceProductsEnabled showcase) {
    this.showcase = showcase;
    return this;
  }

   /**
   * Get showcase
   * @return showcase
  **/
  public SmartDeviceProductsEnabled getShowcase() {
    return showcase;
  }

  public void setShowcase(SmartDeviceProductsEnabled showcase) {
    this.showcase = showcase;
  }

  public SmartDevicesProducts vtm(SmartDeviceProductsEnabled vtm) {
    this.vtm = vtm;
    return this;
  }

   /**
   * Get vtm
   * @return vtm
  **/
  public SmartDeviceProductsEnabled getVtm() {
    return vtm;
  }

  public void setVtm(SmartDeviceProductsEnabled vtm) {
    this.vtm = vtm;
  }

  public SmartDevicesProducts prepaid(SmartDeviceProductsPrepaid prepaid) {
    this.prepaid = prepaid;
    return this;
  }

   /**
   * Get prepaid
   * @return prepaid
  **/
  public SmartDeviceProductsPrepaid getPrepaid() {
    return prepaid;
  }

  public void setPrepaid(SmartDeviceProductsPrepaid prepaid) {
    this.prepaid = prepaid;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDevicesProducts smartDevicesProducts = (SmartDevicesProducts) o;
    return Objects.equals(this.loyalty, smartDevicesProducts.loyalty) &&
        Objects.equals(this.smart, smartDevicesProducts.smart) &&
        Objects.equals(this.cashreg, smartDevicesProducts.cashreg) &&
        Objects.equals(this.collect, smartDevicesProducts.collect) &&
        Objects.equals(this.showcase, smartDevicesProducts.showcase) &&
        Objects.equals(this.vtm, smartDevicesProducts.vtm) &&
        Objects.equals(this.prepaid, smartDevicesProducts.prepaid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loyalty, smart, cashreg, collect, showcase, vtm, prepaid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDevicesProducts {\n");
    
    sb.append("    loyalty: ").append(toIndentedString(loyalty)).append("\n");
    sb.append("    smart: ").append(toIndentedString(smart)).append("\n");
    sb.append("    cashreg: ").append(toIndentedString(cashreg)).append("\n");
    sb.append("    collect: ").append(toIndentedString(collect)).append("\n");
    sb.append("    showcase: ").append(toIndentedString(showcase)).append("\n");
    sb.append("    vtm: ").append(toIndentedString(vtm)).append("\n");
    sb.append("    prepaid: ").append(toIndentedString(prepaid)).append("\n");
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

