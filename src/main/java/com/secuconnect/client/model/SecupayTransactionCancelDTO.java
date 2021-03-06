package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.PaymentContractsProductModel;
import java.util.Objects;

/**
 * SecupayTransactionCancelDTO
 */
public class SecupayTransactionCancelDTO {
  @SerializedName("contract")
  private PaymentContractsProductModel contract = null;

  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("reduce_stakeholder_payment")
  private Boolean reduceStakeholderPayment = false;

  public SecupayTransactionCancelDTO contract(PaymentContractsProductModel contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  public PaymentContractsProductModel getContract() {
    return contract;
  }

  public void setContract(PaymentContractsProductModel contract) {
    this.contract = contract;
  }

  public SecupayTransactionCancelDTO amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public SecupayTransactionCancelDTO reduceStakeholderPayment(Boolean reduceStakeholderPayment) {
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
    SecupayTransactionCancelDTO secupayTransactionCancelDTO = (SecupayTransactionCancelDTO) o;
    return Objects.equals(this.contract, secupayTransactionCancelDTO.contract) &&
        Objects.equals(this.amount, secupayTransactionCancelDTO.amount) &&
        Objects.equals(this.reduceStakeholderPayment, secupayTransactionCancelDTO.reduceStakeholderPayment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, amount, reduceStakeholderPayment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayTransactionCancelDTO {\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
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

