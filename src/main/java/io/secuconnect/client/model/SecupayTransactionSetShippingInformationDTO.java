package io.secuconnect.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

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
        Objects.equals(this.invoiceNumber, secupayTransactionSetShippingInformationDTO.invoiceNumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(carrier, trackingId, invoiceNumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayTransactionSetShippingInformationDTO {\n");
    
    sb.append("    carrier: ").append(toIndentedString(carrier)).append("\n");
    sb.append("    trackingId: ").append(toIndentedString(trackingId)).append("\n");
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

