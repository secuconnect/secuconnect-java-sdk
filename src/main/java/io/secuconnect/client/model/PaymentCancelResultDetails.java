package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Refund information
 */
public class PaymentCancelResultDetails {
  @SerializedName("new_trans_id")
  private Integer newTransId = null;

  @SerializedName("remaining_amount")
  private Integer remainingAmount = null;

  @SerializedName("refund_waiting_for_payment")
  private Boolean refundWaitingForPayment = false;

  public PaymentCancelResultDetails newTransId(Integer newTransId) {
    this.newTransId = newTransId;
    return this;
  }

   /**
   * The transaction ID of the refund transaction
   * @return newTransId
  **/
  public Integer getNewTransId() {
    return newTransId;
  }

  public void setNewTransId(Integer newTransId) {
    this.newTransId = newTransId;
  }

  public PaymentCancelResultDetails remainingAmount(Integer remainingAmount) {
    this.remainingAmount = remainingAmount;
    return this;
  }

   /**
   * The remaining amount in case of a partial refund/cancel
   * @return remainingAmount
  **/
  public Integer getRemainingAmount() {
    return remainingAmount;
  }

  public void setRemainingAmount(Integer remainingAmount) {
    this.remainingAmount = remainingAmount;
  }

  public PaymentCancelResultDetails refundWaitingForPayment(Boolean refundWaitingForPayment) {
    this.refundWaitingForPayment = refundWaitingForPayment;
    return this;
  }

   /**
   * If the merchant needs to transfer money back, this will be true
   * @return refundWaitingForPayment
  **/
  public Boolean getRefundWaitingForPayment() {
    return refundWaitingForPayment;
  }

  public void setRefundWaitingForPayment(Boolean refundWaitingForPayment) {
    this.refundWaitingForPayment = refundWaitingForPayment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentCancelResultDetails paymentCancelResultDetails = (PaymentCancelResultDetails) o;
    return Objects.equals(this.newTransId, paymentCancelResultDetails.newTransId) &&
        Objects.equals(this.remainingAmount, paymentCancelResultDetails.remainingAmount) &&
        Objects.equals(this.refundWaitingForPayment, paymentCancelResultDetails.refundWaitingForPayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newTransId, remainingAmount, refundWaitingForPayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCancelResultDetails {\n");
    
    sb.append("    newTransId: ").append(toIndentedString(newTransId)).append("\n");
    sb.append("    remainingAmount: ").append(toIndentedString(remainingAmount)).append("\n");
    sb.append("    refundWaitingForPayment: ").append(toIndentedString(refundWaitingForPayment)).append("\n");
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

