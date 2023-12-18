package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SecupayTransactionSetShippingInformationDTO;
import java.util.Objects;

/**
 * PaymentTransactionsCaptureDTO
 */
public class PaymentTransactionsCaptureDTO {
  @SerializedName("amount")
  protected Integer amount = null;

  @SerializedName("shipping_information")
  protected SecupayTransactionSetShippingInformationDTO shippingInformation = null;

  public PaymentTransactionsCaptureDTO amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Optional parameter for MoTo Transactions to capture a new amount which has to be equal or less than the authorized amount of the transaction.
   * @return amount
  **/
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public PaymentTransactionsCaptureDTO shippingInformation(SecupayTransactionSetShippingInformationDTO shippingInformation) {
    this.shippingInformation = shippingInformation;
    return this;
  }

   /**
   * Get shippingInformation
   * @return shippingInformation
  **/
  public SecupayTransactionSetShippingInformationDTO getShippingInformation() {
    return shippingInformation;
  }

  public void setShippingInformation(SecupayTransactionSetShippingInformationDTO shippingInformation) {
    this.shippingInformation = shippingInformation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransactionsCaptureDTO paymentTransactionsCaptureDTO = (PaymentTransactionsCaptureDTO) o;
    return Objects.equals(this.amount, paymentTransactionsCaptureDTO.amount) &&
        Objects.equals(this.shippingInformation, paymentTransactionsCaptureDTO.shippingInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, shippingInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransactionsCaptureDTO {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    shippingInformation: ").append(toIndentedString(shippingInformation)).append("\n");
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

