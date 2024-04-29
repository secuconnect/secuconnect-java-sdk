package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * PrepaidReportsDTO
 */
public class PrepaidReportsDTO {
  @SerializedName("merchant")
  protected String merchant = null;

  @SerializedName("store")
  protected String store = null;

  @SerializedName("smart_device")
  protected String smartDevice = null;

  @SerializedName("vtc_tid")
  protected Integer vtcTid = null;

  @SerializedName("report_from")
  protected String reportFrom = null;

  @SerializedName("report_to")
  protected String reportTo = null;

  public PrepaidReportsDTO merchant(String merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * General Merchant ID
   * @return merchant
  **/
  public String getMerchant() {
    return merchant;
  }

  public void setMerchant(String merchant) {
    this.merchant = merchant;
  }

  public PrepaidReportsDTO store(String store) {
    this.store = store;
    return this;
  }

   /**
   * General Store ID
   * @return store
  **/
  public String getStore() {
    return store;
  }

  public void setStore(String store) {
    this.store = store;
  }

  public PrepaidReportsDTO smartDevice(String smartDevice) {
    this.smartDevice = smartDevice;
    return this;
  }

   /**
   * Smart Device ID
   * @return smartDevice
  **/
  public String getSmartDevice() {
    return smartDevice;
  }

  public void setSmartDevice(String smartDevice) {
    this.smartDevice = smartDevice;
  }

  public PrepaidReportsDTO vtcTid(Integer vtcTid) {
    this.vtcTid = vtcTid;
    return this;
  }

   /**
   * Terminal ID for VTC Virtual Terminal Client (received during onboarding)
   * @return vtcTid
  **/
  public Integer getVtcTid() {
    return vtcTid;
  }

  public void setVtcTid(Integer vtcTid) {
    this.vtcTid = vtcTid;
  }

  public PrepaidReportsDTO reportFrom(String reportFrom) {
    this.reportFrom = reportFrom;
    return this;
  }

   /**
   * Report start date (ISO-8601 formatted date and time, incl. timezone)
   * @return reportFrom
  **/
  public String getReportFrom() {
    return reportFrom;
  }

  public void setReportFrom(String reportFrom) {
    this.reportFrom = reportFrom;
  }

  public PrepaidReportsDTO reportTo(String reportTo) {
    this.reportTo = reportTo;
    return this;
  }

   /**
   * Report end date (ISO-8601 formatted date and time, incl. timezone)
   * @return reportTo
  **/
  public String getReportTo() {
    return reportTo;
  }

  public void setReportTo(String reportTo) {
    this.reportTo = reportTo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrepaidReportsDTO prepaidReportsDTO = (PrepaidReportsDTO) o;
    return Objects.equals(this.merchant, prepaidReportsDTO.merchant) &&
        Objects.equals(this.store, prepaidReportsDTO.store) &&
        Objects.equals(this.smartDevice, prepaidReportsDTO.smartDevice) &&
        Objects.equals(this.vtcTid, prepaidReportsDTO.vtcTid) &&
        Objects.equals(this.reportFrom, prepaidReportsDTO.reportFrom) &&
        Objects.equals(this.reportTo, prepaidReportsDTO.reportTo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchant, store, smartDevice, vtcTid, reportFrom, reportTo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepaidReportsDTO {\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    smartDevice: ").append(toIndentedString(smartDevice)).append("\n");
    sb.append("    vtcTid: ").append(toIndentedString(vtcTid)).append("\n");
    sb.append("    reportFrom: ").append(toIndentedString(reportFrom)).append("\n");
    sb.append("    reportTo: ").append(toIndentedString(reportTo)).append("\n");
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

