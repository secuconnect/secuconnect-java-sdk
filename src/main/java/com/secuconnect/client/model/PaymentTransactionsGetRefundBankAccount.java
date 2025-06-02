package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.PaymentInformation;
import java.util.Objects;

/**
 * PaymentTransactionsGetRefundBankAccount
 */
public class PaymentTransactionsGetRefundBankAccount {
  @SerializedName("trans_id")
  protected Integer transId = null;

  @SerializedName("bank_account")
  protected PaymentInformation bankAccount = null;

  public PaymentTransactionsGetRefundBankAccount transId(Integer transId) {
    this.transId = transId;
    return this;
  }

   /**
   * Transaction ID
   * @return transId
  **/
  public Integer getTransId() {
    return transId;
  }

  public void setTransId(Integer transId) {
    this.transId = transId;
  }

  public PaymentTransactionsGetRefundBankAccount bankAccount(PaymentInformation bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  public PaymentInformation getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(PaymentInformation bankAccount) {
    this.bankAccount = bankAccount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransactionsGetRefundBankAccount paymentTransactionsGetRefundBankAccount = (PaymentTransactionsGetRefundBankAccount) o;
    return Objects.equals(this.transId, paymentTransactionsGetRefundBankAccount.transId) &&
        Objects.equals(this.bankAccount, paymentTransactionsGetRefundBankAccount.bankAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transId, bankAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransactionsGetRefundBankAccount {\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
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

