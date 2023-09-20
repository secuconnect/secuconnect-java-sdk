package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * SmartTransactionsShippingModel
 */
public class SmartTransactionsShippingModel implements OneOfSmartTransactionsDeliveryOptionsModel {
  @SerializedName("type")
  protected String type = null;

  @SerializedName("shipped_at")
  protected String shippedAt = null;

  @SerializedName("shipped_by")
  protected String shippedBy = null;

  @SerializedName("tracking_code")
  protected String trackingCode = null;

  @SerializedName("invoice_number")
  protected String invoiceNumber = null;

  public SmartTransactionsShippingModel type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Delivery type:  - &#x60;\&quot;shipping\&quot;&#x60; - &#x60;\&quot;collection\&quot;&#x60;
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SmartTransactionsShippingModel shippedAt(String shippedAt) {
    this.shippedAt = shippedAt;
    return this;
  }

   /**
   * Shipping date (ISO 8601 date and time)
   * @return shippedAt
  **/
  public String getShippedAt() {
    return shippedAt;
  }

  public void setShippedAt(String shippedAt) {
    this.shippedAt = shippedAt;
  }

  public SmartTransactionsShippingModel shippedBy(String shippedBy) {
    this.shippedBy = shippedBy;
    return this;
  }

   /**
   * Shipping service provider
   * @return shippedBy
  **/
  public String getShippedBy() {
    return shippedBy;
  }

  public void setShippedBy(String shippedBy) {
    this.shippedBy = shippedBy;
  }

  public SmartTransactionsShippingModel trackingCode(String trackingCode) {
    this.trackingCode = trackingCode;
    return this;
  }

   /**
   * Tracking code
   * @return trackingCode
  **/
  public String getTrackingCode() {
    return trackingCode;
  }

  public void setTrackingCode(String trackingCode) {
    this.trackingCode = trackingCode;
  }

  public SmartTransactionsShippingModel invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Invoice number of the merchant
   * @return invoiceNumber
  **/
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsShippingModel smartTransactionsShippingModel = (SmartTransactionsShippingModel) o;
    return Objects.equals(this.type, smartTransactionsShippingModel.type) &&
        Objects.equals(this.shippedAt, smartTransactionsShippingModel.shippedAt) &&
        Objects.equals(this.shippedBy, smartTransactionsShippingModel.shippedBy) &&
        Objects.equals(this.trackingCode, smartTransactionsShippingModel.trackingCode) &&
        Objects.equals(this.invoiceNumber, smartTransactionsShippingModel.invoiceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, shippedAt, shippedBy, trackingCode, invoiceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsShippingModel {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    shippedAt: ").append(toIndentedString(shippedAt)).append("\n");
    sb.append("    shippedBy: ").append(toIndentedString(shippedBy)).append("\n");
    sb.append("    trackingCode: ").append(toIndentedString(trackingCode)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
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

