package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * PaymentTransactionCancelDTO
 */
public class PaymentTransactionCancelDTO {
  @SerializedName("reason")
  protected String reason = null;

  @SerializedName("amount")
  protected Integer amount = null;

  @SerializedName("reduce_amount_by")
  protected Integer reduceAmountBy = null;

  @SerializedName("reduce_stakeholder_payment")
  protected Boolean reduceStakeholderPayment = false;

  @SerializedName("container_id")
  protected String containerId = null;

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
   * Amount in smallest currency unit (e. g. Euro Cent)
   * @return amount
  **/
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public PaymentTransactionCancelDTO reduceAmountBy(Integer reduceAmountBy) {
    this.reduceAmountBy = reduceAmountBy;
    return this;
  }

   /**
   * Get reduceAmountBy
   * @return reduceAmountBy
  **/
  public Integer getReduceAmountBy() {
    return reduceAmountBy;
  }

  public void setReduceAmountBy(Integer reduceAmountBy) {
    this.reduceAmountBy = reduceAmountBy;
  }

  public PaymentTransactionCancelDTO reduceStakeholderPayment(Boolean reduceStakeholderPayment) {
    this.reduceStakeholderPayment = reduceStakeholderPayment;
    return this;
  }

   /**
   * Only for the mixed basket. Reduces stakeholder shares proportionately.
   * @return reduceStakeholderPayment
  **/
  public Boolean getReduceStakeholderPayment() {
    return reduceStakeholderPayment;
  }

  public void setReduceStakeholderPayment(Boolean reduceStakeholderPayment) {
    this.reduceStakeholderPayment = reduceStakeholderPayment;
  }

  public PaymentTransactionCancelDTO containerId(String containerId) {
    this.containerId = containerId;
    return this;
  }

   /**
   * Payment Container ID
   * @return containerId
  **/
  public String getContainerId() {
    return containerId;
  }

  public void setContainerId(String containerId) {
    this.containerId = containerId;
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
        Objects.equals(this.reduceAmountBy, paymentTransactionCancelDTO.reduceAmountBy) &&
        Objects.equals(this.reduceStakeholderPayment, paymentTransactionCancelDTO.reduceStakeholderPayment) &&
        Objects.equals(this.containerId, paymentTransactionCancelDTO.containerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, amount, reduceAmountBy, reduceStakeholderPayment, containerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransactionCancelDTO {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    reduceAmountBy: ").append(toIndentedString(reduceAmountBy)).append("\n");
    sb.append("    reduceStakeholderPayment: ").append(toIndentedString(reduceStakeholderPayment)).append("\n");
    sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
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

