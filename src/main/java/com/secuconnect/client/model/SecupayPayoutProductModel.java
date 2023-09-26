package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.PaymentInformation;
import com.secuconnect.client.model.SecupayTransactionListItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SecupayPayoutProductModel
 */
public class SecupayPayoutProductModel extends BaseProductModel {
  @SerializedName("trans_id")
  protected Integer transId = null;

  @SerializedName("payment_id")
  protected String paymentId = null;

  @SerializedName("status")
  protected String status = null;

  @SerializedName("amount")
  protected Integer amount = null;

  @SerializedName("currency")
  protected String currency = null;

  @SerializedName("purpose")
  protected String purpose = null;

  @SerializedName("order_id")
  protected String orderId = null;

  @SerializedName("transaction_status")
  protected String transactionStatus = null;

  @SerializedName("transaction_list")
  protected List<SecupayTransactionListItem> transactionList = null;

  @SerializedName("transfer_purpose")
  protected String transferPurpose = null;

  @SerializedName("transfer_account")
  protected PaymentInformation transferAccount = null;

  public SecupayPayoutProductModel transId(Integer transId) {
    this.transId = transId;
    return this;
  }

   /**
   * ID of transaction
   * @return transId
  **/
  public Integer getTransId() {
    return transId;
  }

  public void setTransId(Integer transId) {
    this.transId = transId;
  }

  public SecupayPayoutProductModel paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

   /**
   * Payment ID
   * @return paymentId
  **/
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public SecupayPayoutProductModel status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Transaction status
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SecupayPayoutProductModel amount(Integer amount) {
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

  public SecupayPayoutProductModel currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public SecupayPayoutProductModel purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * The purpose of the payment. It appears at the bank statement of the payee.
   * @return purpose
  **/
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public SecupayPayoutProductModel orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Order number. Depending on the contract setting, it must be unique for each payment.
   * @return orderId
  **/
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public SecupayPayoutProductModel transactionStatus(String transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Transaction status (number)
   * @return transactionStatus
  **/
  public String getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(String transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public SecupayPayoutProductModel transactionList(List<SecupayTransactionListItem> transactionList) {
    this.transactionList = transactionList;
    return this;
  }

  public SecupayPayoutProductModel addTransactionListItem(SecupayTransactionListItem transactionListItem) {
    if (this.transactionList == null) {
      this.transactionList = new ArrayList<SecupayTransactionListItem>();
    }
    this.transactionList.add(transactionListItem);
    return this;
  }

   /**
   * Payout items
   * @return transactionList
  **/
  public List<SecupayTransactionListItem> getTransactionList() {
    return transactionList;
  }

  public void setTransactionList(List<SecupayTransactionListItem> transactionList) {
    this.transactionList = transactionList;
  }

  public SecupayPayoutProductModel transferPurpose(String transferPurpose) {
    this.transferPurpose = transferPurpose;
    return this;
  }

   /**
   * The purpose the payer needs to use for his transfer (pay in)
   * @return transferPurpose
  **/
  public String getTransferPurpose() {
    return transferPurpose;
  }

  public void setTransferPurpose(String transferPurpose) {
    this.transferPurpose = transferPurpose;
  }

  public SecupayPayoutProductModel transferAccount(PaymentInformation transferAccount) {
    this.transferAccount = transferAccount;
    return this;
  }

   /**
   * Get transferAccount
   * @return transferAccount
  **/
  public PaymentInformation getTransferAccount() {
    return transferAccount;
  }

  public void setTransferAccount(PaymentInformation transferAccount) {
    this.transferAccount = transferAccount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayPayoutProductModel secupayPayoutProductModel = (SecupayPayoutProductModel) o;
    return Objects.equals(this.transId, secupayPayoutProductModel.transId) &&
        Objects.equals(this.paymentId, secupayPayoutProductModel.paymentId) &&
        Objects.equals(this.status, secupayPayoutProductModel.status) &&
        Objects.equals(this.amount, secupayPayoutProductModel.amount) &&
        Objects.equals(this.currency, secupayPayoutProductModel.currency) &&
        Objects.equals(this.purpose, secupayPayoutProductModel.purpose) &&
        Objects.equals(this.orderId, secupayPayoutProductModel.orderId) &&
        Objects.equals(this.transactionStatus, secupayPayoutProductModel.transactionStatus) &&
        Objects.equals(this.transactionList, secupayPayoutProductModel.transactionList) &&
        Objects.equals(this.transferPurpose, secupayPayoutProductModel.transferPurpose) &&
        Objects.equals(this.transferAccount, secupayPayoutProductModel.transferAccount) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transId, paymentId, status, amount, currency, purpose, orderId, transactionStatus, transactionList, transferPurpose, transferAccount, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayPayoutProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    transactionList: ").append(toIndentedString(transactionList)).append("\n");
    sb.append("    transferPurpose: ").append(toIndentedString(transferPurpose)).append("\n");
    sb.append("    transferAccount: ").append(toIndentedString(transferAccount)).append("\n");
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

