package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

/**
 * PaymentTransactionCancelDTO
 */
public class PaymentTransactionCancelDTO {
  @SerializedName("reason")
  private String reason = null;

  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("reduce_stakeholder_payment")
  private Boolean reduceStakeholderPayment = false;

  public PaymentTransactionCancelDTO reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * The reason of this cancel or refund
   * @return reason
  **/
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public PaymentTransactionCancelDTO amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * partial or full refund amount, \&quot;0\&quot; means full refund
   * @return amount
  **/
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public PaymentTransactionCancelDTO reduceStakeholderPayment(Boolean reduceStakeholderPayment) {
    this.reduceStakeholderPayment = reduceStakeholderPayment;
    return this;
  }

   /**
   * Mixed-Basket: (percentage) reduce the stakeholder amount too
   * @return reduceStakeholderPayment
  **/
  public Boolean getReduceStakeholderPayment() {
    return reduceStakeholderPayment;
  }

  public void setReduceStakeholderPayment(Boolean reduceStakeholderPayment) {
    this.reduceStakeholderPayment = reduceStakeholderPayment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransactionCancelDTO paymentTransactionCancelDTO = (PaymentTransactionCancelDTO) o;
    return Objects.equals(this.reason, paymentTransactionCancelDTO.reason) &&
        Objects.equals(this.amount, paymentTransactionCancelDTO.amount) &&
        Objects.equals(this.reduceStakeholderPayment, paymentTransactionCancelDTO.reduceStakeholderPayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, amount, reduceStakeholderPayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransactionCancelDTO {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    reduceStakeholderPayment: ").append(toIndentedString(reduceStakeholderPayment)).append("\n");
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

