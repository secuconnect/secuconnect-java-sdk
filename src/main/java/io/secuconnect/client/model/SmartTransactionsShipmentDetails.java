package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * SmartTransactionsShipmentDetails
 */
public class SmartTransactionsShipmentDetails {
  @SerializedName("shipped_at")
  private String shippedAt = null;

  @SerializedName("shipped_by")
  private String shippedBy = null;

  @SerializedName("tracking_code")
  private String trackingCode = null;

  @SerializedName("invoice_number")
  private String invoiceNumber = null;

  public SmartTransactionsShipmentDetails shippedAt(String shippedAt) {
    this.shippedAt = shippedAt;
    return this;
  }

   /**
   * Shipment Date
   * @return shippedAt
  **/
  public String getShippedAt() {
    return shippedAt;
  }

  public void setShippedAt(String shippedAt) {
    this.shippedAt = shippedAt;
  }

  public SmartTransactionsShipmentDetails shippedBy(String shippedBy) {
    this.shippedBy = shippedBy;
    return this;
  }

   /**
   * Parcel Provider
   * @return shippedBy
  **/
  public String getShippedBy() {
    return shippedBy;
  }

  public void setShippedBy(String shippedBy) {
    this.shippedBy = shippedBy;
  }

  public SmartTransactionsShipmentDetails trackingCode(String trackingCode) {
    this.trackingCode = trackingCode;
    return this;
  }

   /**
   * Tracking Code
   * @return trackingCode
  **/
  public String getTrackingCode() {
    return trackingCode;
  }

  public void setTrackingCode(String trackingCode) {
    this.trackingCode = trackingCode;
  }

  public SmartTransactionsShipmentDetails invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Invoice Number
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
    SmartTransactionsShipmentDetails smartTransactionsShipmentDetails = (SmartTransactionsShipmentDetails) o;
    return Objects.equals(this.shippedAt, smartTransactionsShipmentDetails.shippedAt) &&
        Objects.equals(this.shippedBy, smartTransactionsShipmentDetails.shippedBy) &&
        Objects.equals(this.trackingCode, smartTransactionsShipmentDetails.trackingCode) &&
        Objects.equals(this.invoiceNumber, smartTransactionsShipmentDetails.invoiceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shippedAt, shippedBy, trackingCode, invoiceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsShipmentDetails {\n");
    
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

