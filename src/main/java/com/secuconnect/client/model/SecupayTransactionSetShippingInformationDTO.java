package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * SecupayTransactionSetShippingInformationDTO
 */
public class SecupayTransactionSetShippingInformationDTO {
  @SerializedName("carrier")
  private String carrier = null;

  @SerializedName("tracking_id")
  private String trackingId = null;

  @SerializedName("invoice_number")
  private String invoiceNumber = null;

  @SerializedName("shipped_at")
  private String shippedAt = null;

  @SerializedName("order_id")
  private String orderId = null;

  public SecupayTransactionSetShippingInformationDTO carrier(String carrier) {
    this.carrier = carrier;
    return this;
  }

   /**
   * Shipping provider name
   * @return carrier
  **/
  public String getCarrier() {
    return carrier;
  }

  public void setCarrier(String carrier) {
    this.carrier = carrier;
  }

  public SecupayTransactionSetShippingInformationDTO trackingId(String trackingId) {
    this.trackingId = trackingId;
    return this;
  }

   /**
   * Tracking-ID
   * @return trackingId
  **/
  public String getTrackingId() {
    return trackingId;
  }

  public void setTrackingId(String trackingId) {
    this.trackingId = trackingId;
  }

  public SecupayTransactionSetShippingInformationDTO invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Merchants invoice number
   * @return invoiceNumber
  **/
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public SecupayTransactionSetShippingInformationDTO shippedAt(String shippedAt) {
    this.shippedAt = shippedAt;
    return this;
  }

   /**
   * Timestamp of the shipping date
   * @return shippedAt
  **/
  public String getShippedAt() {
    return shippedAt;
  }

  public void setShippedAt(String shippedAt) {
    this.shippedAt = shippedAt;
  }

  public SecupayTransactionSetShippingInformationDTO orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Order-ID
   * @return orderId
  **/
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayTransactionSetShippingInformationDTO secupayTransactionSetShippingInformationDTO = (SecupayTransactionSetShippingInformationDTO) o;
    return Objects.equals(this.carrier, secupayTransactionSetShippingInformationDTO.carrier) &&
        Objects.equals(this.trackingId, secupayTransactionSetShippingInformationDTO.trackingId) &&
        Objects.equals(this.invoiceNumber, secupayTransactionSetShippingInformationDTO.invoiceNumber) &&
        Objects.equals(this.shippedAt, secupayTransactionSetShippingInformationDTO.shippedAt) &&
        Objects.equals(this.orderId, secupayTransactionSetShippingInformationDTO.orderId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrier, trackingId, invoiceNumber, shippedAt, orderId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayTransactionSetShippingInformationDTO {\n");
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    shippedAt: ").append(toIndentedString(shippedAt)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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

