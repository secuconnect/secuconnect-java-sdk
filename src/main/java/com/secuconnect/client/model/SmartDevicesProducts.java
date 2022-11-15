package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartDeviceProductsCollect;
import com.secuconnect.client.model.SmartDeviceProductsEasycredit;
import com.secuconnect.client.model.SmartDeviceProductsEnabled;
import com.secuconnect.client.model.SmartDeviceProductsEnabledWithTid;
import com.secuconnect.client.model.SmartDeviceProductsLoyalty;
import com.secuconnect.client.model.SmartDeviceProductsPrepaid;
import com.secuconnect.client.model.SmartDeviceProductsVtm;
import java.util.Objects;

/**
 * SmartDevicesProducts
 */
public class SmartDevicesProducts {
  @SerializedName("loyalty")
  private SmartDeviceProductsLoyalty loyalty = null;

  @SerializedName("smart")
  private SmartDeviceProductsEnabledWithTid smart = null;

  @SerializedName("cashreg")
  private SmartDeviceProductsEnabledWithTid cashreg = null;

  @SerializedName("collect")
  private SmartDeviceProductsCollect collect = null;

  @SerializedName("vtm")
  private SmartDeviceProductsVtm vtm = null;

  @SerializedName("prepaid")
  private SmartDeviceProductsPrepaid prepaid = null;

  @SerializedName("support")
  private SmartDeviceProductsEnabled support = null;

  @SerializedName("bonroll")
  private SmartDeviceProductsEnabledWithTid bonroll = null;

  @SerializedName("bvb")
  private SmartDeviceProductsEnabled bvb = null;

  @SerializedName("easycredit")
  private SmartDeviceProductsEasycredit easycredit = null;

  public SmartDevicesProducts loyalty(SmartDeviceProductsLoyalty loyalty) {
    this.loyalty = loyalty;
    return this;
  }

   /**
   * Get loyalty
   * @return loyalty
  **/
  public SmartDeviceProductsLoyalty getLoyalty() {
    return loyalty;
  }

  public void setLoyalty(SmartDeviceProductsLoyalty loyalty) {
    this.loyalty = loyalty;
  }

  public SmartDevicesProducts smart(SmartDeviceProductsEnabledWithTid smart) {
    this.smart = smart;
    return this;
  }

   /**
   * Get smart
   * @return smart
  **/
  public SmartDeviceProductsEnabledWithTid getSmart() {
    return smart;
  }

  public void setSmart(SmartDeviceProductsEnabledWithTid smart) {
    this.smart = smart;
  }

  public SmartDevicesProducts cashreg(SmartDeviceProductsEnabledWithTid cashreg) {
    this.cashreg = cashreg;
    return this;
  }

   /**
   * Get cashreg
   * @return cashreg
  **/
  public SmartDeviceProductsEnabledWithTid getCashreg() {
    return cashreg;
  }

  public void setCashreg(SmartDeviceProductsEnabledWithTid cashreg) {
    this.cashreg = cashreg;
  }

  public SmartDevicesProducts collect(SmartDeviceProductsCollect collect) {
    this.collect = collect;
    return this;
  }

   /**
   * Get collect
   * @return collect
  **/
  public SmartDeviceProductsCollect getCollect() {
    return collect;
  }

  public void setCollect(SmartDeviceProductsCollect collect) {
    this.collect = collect;
  }

  public SmartDevicesProducts vtm(SmartDeviceProductsVtm vtm) {
    this.vtm = vtm;
    return this;
  }

   /**
   * Get vtm
   * @return vtm
  **/
  public SmartDeviceProductsVtm getVtm() {
    return vtm;
  }

  public void setVtm(SmartDeviceProductsVtm vtm) {
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

  public SmartDevicesProducts support(SmartDeviceProductsEnabled support) {
    this.support = support;
    return this;
  }

   /**
   * Get support
   * @return support
  **/
  public SmartDeviceProductsEnabled getSupport() {
    return support;
  }

  public void setSupport(SmartDeviceProductsEnabled support) {
    this.support = support;
  }

  public SmartDevicesProducts bonroll(SmartDeviceProductsEnabledWithTid bonroll) {
    this.bonroll = bonroll;
    return this;
  }

   /**
   * Get bonroll
   * @return bonroll
  **/
  public SmartDeviceProductsEnabledWithTid getBonroll() {
    return bonroll;
  }

  public void setBonroll(SmartDeviceProductsEnabledWithTid bonroll) {
    this.bonroll = bonroll;
  }

  public SmartDevicesProducts bvb(SmartDeviceProductsEnabled bvb) {
    this.bvb = bvb;
    return this;
  }

   /**
   * Get bvb
   * @return bvb
  **/
  public SmartDeviceProductsEnabled getBvb() {
    return bvb;
  }

  public void setBvb(SmartDeviceProductsEnabled bvb) {
    this.bvb = bvb;
  }

  public SmartDevicesProducts easycredit(SmartDeviceProductsEasycredit easycredit) {
    this.easycredit = easycredit;
    return this;
  }

   /**
   * Get easycredit
   * @return easycredit
  **/
  public SmartDeviceProductsEasycredit getEasycredit() {
    return easycredit;
  }

  public void setEasycredit(SmartDeviceProductsEasycredit easycredit) {
    this.easycredit = easycredit;
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
        Objects.equals(this.vtm, smartDevicesProducts.vtm) &&
        Objects.equals(this.prepaid, smartDevicesProducts.prepaid) &&
        Objects.equals(this.support, smartDevicesProducts.support) &&
        Objects.equals(this.bonroll, smartDevicesProducts.bonroll) &&
        Objects.equals(this.bvb, smartDevicesProducts.bvb) &&
        Objects.equals(this.easycredit, smartDevicesProducts.easycredit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(loyalty, smart, cashreg, collect, vtm, prepaid, support, bonroll, bvb, easycredit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDevicesProducts {\n");
    sb.append("    loyalty: ").append(toIndentedString(loyalty)).append("\n");
    sb.append("    smart: ").append(toIndentedString(smart)).append("\n");
    sb.append("    cashreg: ").append(toIndentedString(cashreg)).append("\n");
    sb.append("    collect: ").append(toIndentedString(collect)).append("\n");
    sb.append("    vtm: ").append(toIndentedString(vtm)).append("\n");
    sb.append("    prepaid: ").append(toIndentedString(prepaid)).append("\n");
    sb.append("    support: ").append(toIndentedString(support)).append("\n");
    sb.append("    bonroll: ").append(toIndentedString(bonroll)).append("\n");
    sb.append("    bvb: ").append(toIndentedString(bvb)).append("\n");
    sb.append("    easycredit: ").append(toIndentedString(easycredit)).append("\n");
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

