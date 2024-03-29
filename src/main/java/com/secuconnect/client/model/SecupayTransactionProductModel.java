package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.PaymentContainerMandate;
import com.secuconnect.client.model.PaymentContainersProductModel;
import com.secuconnect.client.model.PaymentCustomersProductModel;
import com.secuconnect.client.model.PaymentInformation;
import com.secuconnect.client.model.SecupayBasketItem;
import com.secuconnect.client.model.SecupayRedirectUrl;
import com.secuconnect.client.model.SecupaySubTransactionProductModel;
import com.secuconnect.client.model.SecupayTransactionProductDTOSubscription;
import com.secuconnect.client.model.SecupayTransactionProductModelUsedPaymentInstrument;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SecupayTransactionProductModel
 */
public class SecupayTransactionProductModel extends BaseProductModel {
  @SerializedName("trans_id")
  protected Integer transId = null;

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

  @SerializedName("payment_id")
  protected String paymentId = null;

  @SerializedName("basket")
  protected List<SecupayBasketItem> basket = null;

  @SerializedName("transaction_status")
  protected String transactionStatus = null;

  @SerializedName("accrual")
  protected Boolean accrual = null;

  @SerializedName("payment_action")
  protected String paymentAction = null;

  @SerializedName("transfer_purpose")
  protected String transferPurpose = null;

  @SerializedName("transfer_account")
  protected PaymentInformation transferAccount = null;

  @SerializedName("customer")
  protected PaymentCustomersProductModel customer = null;

  @SerializedName("used_payment_instrument")
  protected SecupayTransactionProductModelUsedPaymentInstrument usedPaymentInstrument = null;

  @SerializedName("redirect_url")
  protected SecupayRedirectUrl redirectUrl = null;

  @SerializedName("subscription")
  protected SecupayTransactionProductDTOSubscription subscription = null;

  @SerializedName("iframe_url")
  protected String iframeUrl = null;

  @SerializedName("container")
  protected PaymentContainersProductModel container = null;

  @SerializedName("sub_transactions")
  protected List<SecupaySubTransactionProductModel> subTransactions = null;

  @SerializedName("mandate")
  protected PaymentContainerMandate mandate = null;

  public SecupayTransactionProductModel transId(Integer transId) {
    this.transId = transId;
    return this;
  }

   /**
   * Transaction ID (TA code)
   * @return transId
  **/
  public Integer getTransId() {
    return transId;
  }

  public void setTransId(Integer transId) {
    this.transId = transId;
  }

  public SecupayTransactionProductModel status(String status) {
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

  public SecupayTransactionProductModel amount(Integer amount) {
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

  public SecupayTransactionProductModel currency(String currency) {
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

  public SecupayTransactionProductModel purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * The purpose of the payment, for the account statement for example.
   * @return purpose
  **/
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public SecupayTransactionProductModel orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Your order number. If set for the contract, there must be a unique number for each payment.
   * @return orderId
  **/
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public SecupayTransactionProductModel paymentId(String paymentId) {
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

  public SecupayTransactionProductModel basket(List<SecupayBasketItem> basket) {
    this.basket = basket;
    return this;
  }

  public SecupayTransactionProductModel addBasketItem(SecupayBasketItem basketItem) {
    if (this.basket == null) {
      this.basket = new ArrayList<SecupayBasketItem>();
    }
    this.basket.add(basketItem);
    return this;
  }

   /**
   * Basket items, several sub-baskets or subscription details
   * @return basket
  **/
  public List<SecupayBasketItem> getBasket() {
    return basket;
  }

  public void setBasket(List<SecupayBasketItem> basket) {
    this.basket = basket;
  }

  public SecupayTransactionProductModel transactionStatus(String transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Transaction status code
   * @return transactionStatus
  **/
  public String getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(String transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public SecupayTransactionProductModel accrual(Boolean accrual) {
    this.accrual = accrual;
    return this;
  }

   /**
   * Whether the transaction is locked for payout.
   * @return accrual
  **/
  public Boolean getAccrual() {
    return accrual;
  }

  public void setAccrual(Boolean accrual) {
    this.accrual = accrual;
  }

  public SecupayTransactionProductModel paymentAction(String paymentAction) {
    this.paymentAction = paymentAction;
    return this;
  }

   /**
   * Specifies whether to authorize only (&#x60;\&quot;authorization\&quot;&#x60;), or to pay immediately (&#x60;\&quot;sale\&quot;&#x60;). The capture of the pre-authorized payment is made with a call to &#x60;/capture&#x60;.
   * @return paymentAction
  **/
  public String getPaymentAction() {
    return paymentAction;
  }

  public void setPaymentAction(String paymentAction) {
    this.paymentAction = paymentAction;
  }

  public SecupayTransactionProductModel transferPurpose(String transferPurpose) {
    this.transferPurpose = transferPurpose;
    return this;
  }

   /**
   * The purpose the payer needs to use for his bank transfer.
   * @return transferPurpose
  **/
  public String getTransferPurpose() {
    return transferPurpose;
  }

  public void setTransferPurpose(String transferPurpose) {
    this.transferPurpose = transferPurpose;
  }

  public SecupayTransactionProductModel transferAccount(PaymentInformation transferAccount) {
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

  public SecupayTransactionProductModel customer(PaymentCustomersProductModel customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  public PaymentCustomersProductModel getCustomer() {
    return customer;
  }

  public void setCustomer(PaymentCustomersProductModel customer) {
    this.customer = customer;
  }

  public SecupayTransactionProductModel usedPaymentInstrument(SecupayTransactionProductModelUsedPaymentInstrument usedPaymentInstrument) {
    this.usedPaymentInstrument = usedPaymentInstrument;
    return this;
  }

   /**
   * Get usedPaymentInstrument
   * @return usedPaymentInstrument
  **/
  public SecupayTransactionProductModelUsedPaymentInstrument getUsedPaymentInstrument() {
    return usedPaymentInstrument;
  }

  public void setUsedPaymentInstrument(SecupayTransactionProductModelUsedPaymentInstrument usedPaymentInstrument) {
    this.usedPaymentInstrument = usedPaymentInstrument;
  }

  public SecupayTransactionProductModel redirectUrl(SecupayRedirectUrl redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * Get redirectUrl
   * @return redirectUrl
  **/
  public SecupayRedirectUrl getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(SecupayRedirectUrl redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  public SecupayTransactionProductModel subscription(SecupayTransactionProductDTOSubscription subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  public SecupayTransactionProductDTOSubscription getSubscription() {
    return subscription;
  }

  public void setSubscription(SecupayTransactionProductDTOSubscription subscription) {
    this.subscription = subscription;
  }

  public SecupayTransactionProductModel iframeUrl(String iframeUrl) {
    this.iframeUrl = iframeUrl;
    return this;
  }

   /**
   * URL of the secupay payment iframe
   * @return iframeUrl
  **/
  public String getIframeUrl() {
    return iframeUrl;
  }

  public void setIframeUrl(String iframeUrl) {
    this.iframeUrl = iframeUrl;
  }

  public SecupayTransactionProductModel container(PaymentContainersProductModel container) {
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  public PaymentContainersProductModel getContainer() {
    return container;
  }

  public void setContainer(PaymentContainersProductModel container) {
    this.container = container;
  }

  public SecupayTransactionProductModel subTransactions(List<SecupaySubTransactionProductModel> subTransactions) {
    this.subTransactions = subTransactions;
    return this;
  }

  public SecupayTransactionProductModel addSubTransactionsItem(SecupaySubTransactionProductModel subTransactionsItem) {
    if (this.subTransactions == null) {
      this.subTransactions = new ArrayList<SecupaySubTransactionProductModel>();
    }
    this.subTransactions.add(subTransactionsItem);
    return this;
  }

   /**
   * Transactions generated for the sub-baskets of a mixed basket transaction
   * @return subTransactions
  **/
  public List<SecupaySubTransactionProductModel> getSubTransactions() {
    return subTransactions;
  }

  public void setSubTransactions(List<SecupaySubTransactionProductModel> subTransactions) {
    this.subTransactions = subTransactions;
  }

  public SecupayTransactionProductModel mandate(PaymentContainerMandate mandate) {
    this.mandate = mandate;
    return this;
  }

   /**
   * Get mandate
   * @return mandate
  **/
  public PaymentContainerMandate getMandate() {
    return mandate;
  }

  public void setMandate(PaymentContainerMandate mandate) {
    this.mandate = mandate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayTransactionProductModel secupayTransactionProductModel = (SecupayTransactionProductModel) o;
    return Objects.equals(this.transId, secupayTransactionProductModel.transId) &&
        Objects.equals(this.status, secupayTransactionProductModel.status) &&
        Objects.equals(this.amount, secupayTransactionProductModel.amount) &&
        Objects.equals(this.currency, secupayTransactionProductModel.currency) &&
        Objects.equals(this.purpose, secupayTransactionProductModel.purpose) &&
        Objects.equals(this.orderId, secupayTransactionProductModel.orderId) &&
        Objects.equals(this.paymentId, secupayTransactionProductModel.paymentId) &&
        Objects.equals(this.basket, secupayTransactionProductModel.basket) &&
        Objects.equals(this.transactionStatus, secupayTransactionProductModel.transactionStatus) &&
        Objects.equals(this.accrual, secupayTransactionProductModel.accrual) &&
        Objects.equals(this.paymentAction, secupayTransactionProductModel.paymentAction) &&
        Objects.equals(this.transferPurpose, secupayTransactionProductModel.transferPurpose) &&
        Objects.equals(this.transferAccount, secupayTransactionProductModel.transferAccount) &&
        Objects.equals(this.customer, secupayTransactionProductModel.customer) &&
        Objects.equals(this.usedPaymentInstrument, secupayTransactionProductModel.usedPaymentInstrument) &&
        Objects.equals(this.redirectUrl, secupayTransactionProductModel.redirectUrl) &&
        Objects.equals(this.subscription, secupayTransactionProductModel.subscription) &&
        Objects.equals(this.iframeUrl, secupayTransactionProductModel.iframeUrl) &&
        Objects.equals(this.container, secupayTransactionProductModel.container) &&
        Objects.equals(this.subTransactions, secupayTransactionProductModel.subTransactions) &&
        Objects.equals(this.mandate, secupayTransactionProductModel.mandate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transId, status, amount, currency, purpose, orderId, paymentId, basket, transactionStatus, accrual, paymentAction, transferPurpose, transferAccount, customer, usedPaymentInstrument, redirectUrl, subscription, iframeUrl, container, subTransactions, mandate, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayTransactionProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    basket: ").append(toIndentedString(basket)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    accrual: ").append(toIndentedString(accrual)).append("\n");
    sb.append("    paymentAction: ").append(toIndentedString(paymentAction)).append("\n");
    sb.append("    transferPurpose: ").append(toIndentedString(transferPurpose)).append("\n");
    sb.append("    transferAccount: ").append(toIndentedString(transferAccount)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    usedPaymentInstrument: ").append(toIndentedString(usedPaymentInstrument)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    iframeUrl: ").append(toIndentedString(iframeUrl)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    subTransactions: ").append(toIndentedString(subTransactions)).append("\n");
    sb.append("    mandate: ").append(toIndentedString(mandate)).append("\n");
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

