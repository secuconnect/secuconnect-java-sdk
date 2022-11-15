package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * SmartDeviceProductsWebterminalConfigAllowedActions
 */
public class SmartDeviceProductsWebterminalConfigAllowedActions {
  @SerializedName("balance_check")
  private Boolean balanceCheck = null;

  @SerializedName("cancel_last")
  private Boolean cancelLast = null;

  @SerializedName("cashreport")
  private Boolean cashreport = null;

  @SerializedName("charge")
  private Boolean charge = null;

  @SerializedName("charge_points")
  private Boolean chargePoints = null;

  @SerializedName("discharge")
  private Boolean discharge = null;

  @SerializedName("discharge_points")
  private Boolean dischargePoints = null;

  @SerializedName("immediate_bonus")
  private Boolean immediateBonus = null;

  @SerializedName("sale_revenue")
  private Boolean saleRevenue = null;

  public SmartDeviceProductsWebterminalConfigAllowedActions balanceCheck(Boolean balanceCheck) {
    this.balanceCheck = balanceCheck;
    return this;
  }

   /**
   * Option enabled or disabled
   * @return balanceCheck
  **/
  public Boolean getBalanceCheck() {
    return balanceCheck;
  }

  public void setBalanceCheck(Boolean balanceCheck) {
    this.balanceCheck = balanceCheck;
  }

  public SmartDeviceProductsWebterminalConfigAllowedActions cancelLast(Boolean cancelLast) {
    this.cancelLast = cancelLast;
    return this;
  }

   /**
   * Option enabled or disabled
   * @return cancelLast
  **/
  public Boolean getCancelLast() {
    return cancelLast;
  }

  public void setCancelLast(Boolean cancelLast) {
    this.cancelLast = cancelLast;
  }

  public SmartDeviceProductsWebterminalConfigAllowedActions cashreport(Boolean cashreport) {
    this.cashreport = cashreport;
    return this;
  }

   /**
   * Option enabled or disabled
   * @return cashreport
  **/
  public Boolean getCashreport() {
    return cashreport;
  }

  public void setCashreport(Boolean cashreport) {
    this.cashreport = cashreport;
  }

  public SmartDeviceProductsWebterminalConfigAllowedActions charge(Boolean charge) {
    this.charge = charge;
    return this;
  }

   /**
   * Option enabled or disabled
   * @return charge
  **/
  public Boolean getCharge() {
    return charge;
  }

  public void setCharge(Boolean charge) {
    this.charge = charge;
  }

  public SmartDeviceProductsWebterminalConfigAllowedActions chargePoints(Boolean chargePoints) {
    this.chargePoints = chargePoints;
    return this;
  }

   /**
   * Option enabled or disabled
   * @return chargePoints
  **/
  public Boolean getChargePoints() {
    return chargePoints;
  }

  public void setChargePoints(Boolean chargePoints) {
    this.chargePoints = chargePoints;
  }

  public SmartDeviceProductsWebterminalConfigAllowedActions discharge(Boolean discharge) {
    this.discharge = discharge;
    return this;
  }

   /**
   * Option enabled or disabled
   * @return discharge
  **/
  public Boolean getDischarge() {
    return discharge;
  }

  public void setDischarge(Boolean discharge) {
    this.discharge = discharge;
  }

  public SmartDeviceProductsWebterminalConfigAllowedActions dischargePoints(Boolean dischargePoints) {
    this.dischargePoints = dischargePoints;
    return this;
  }

   /**
   * Option enabled or disabled
   * @return dischargePoints
  **/
  public Boolean getDischargePoints() {
    return dischargePoints;
  }

  public void setDischargePoints(Boolean dischargePoints) {
    this.dischargePoints = dischargePoints;
  }

  public SmartDeviceProductsWebterminalConfigAllowedActions immediateBonus(Boolean immediateBonus) {
    this.immediateBonus = immediateBonus;
    return this;
  }

   /**
   * Option enabled or disabled
   * @return immediateBonus
  **/
  public Boolean getImmediateBonus() {
    return immediateBonus;
  }

  public void setImmediateBonus(Boolean immediateBonus) {
    this.immediateBonus = immediateBonus;
  }

  public SmartDeviceProductsWebterminalConfigAllowedActions saleRevenue(Boolean saleRevenue) {
    this.saleRevenue = saleRevenue;
    return this;
  }

   /**
   * Option enabled or disabled
   * @return saleRevenue
  **/
  public Boolean getSaleRevenue() {
    return saleRevenue;
  }

  public void setSaleRevenue(Boolean saleRevenue) {
    this.saleRevenue = saleRevenue;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDeviceProductsWebterminalConfigAllowedActions smartDeviceProductsWebterminalConfigAllowedActions = (SmartDeviceProductsWebterminalConfigAllowedActions) o;
    return Objects.equals(this.balanceCheck, smartDeviceProductsWebterminalConfigAllowedActions.balanceCheck) &&
        Objects.equals(this.cancelLast, smartDeviceProductsWebterminalConfigAllowedActions.cancelLast) &&
        Objects.equals(this.cashreport, smartDeviceProductsWebterminalConfigAllowedActions.cashreport) &&
        Objects.equals(this.charge, smartDeviceProductsWebterminalConfigAllowedActions.charge) &&
        Objects.equals(this.chargePoints, smartDeviceProductsWebterminalConfigAllowedActions.chargePoints) &&
        Objects.equals(this.discharge, smartDeviceProductsWebterminalConfigAllowedActions.discharge) &&
        Objects.equals(this.dischargePoints, smartDeviceProductsWebterminalConfigAllowedActions.dischargePoints) &&
        Objects.equals(this.immediateBonus, smartDeviceProductsWebterminalConfigAllowedActions.immediateBonus) &&
        Objects.equals(this.saleRevenue, smartDeviceProductsWebterminalConfigAllowedActions.saleRevenue);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balanceCheck, cancelLast, cashreport, charge, chargePoints, discharge, dischargePoints, immediateBonus, saleRevenue);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDeviceProductsWebterminalConfigAllowedActions {\n");
    sb.append("    balanceCheck: ").append(toIndentedString(balanceCheck)).append("\n");
    sb.append("    cancelLast: ").append(toIndentedString(cancelLast)).append("\n");
    sb.append("    cashreport: ").append(toIndentedString(cashreport)).append("\n");
    sb.append("    charge: ").append(toIndentedString(charge)).append("\n");
    sb.append("    chargePoints: ").append(toIndentedString(chargePoints)).append("\n");
    sb.append("    discharge: ").append(toIndentedString(discharge)).append("\n");
    sb.append("    dischargePoints: ").append(toIndentedString(dischargePoints)).append("\n");
    sb.append("    immediateBonus: ").append(toIndentedString(immediateBonus)).append("\n");
    sb.append("    saleRevenue: ").append(toIndentedString(saleRevenue)).append("\n");
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

