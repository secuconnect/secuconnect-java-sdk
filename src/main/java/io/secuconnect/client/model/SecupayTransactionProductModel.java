package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.PaymentContainersProductModel;
import io.secuconnect.client.model.PaymentCustomersProductModel;
import io.secuconnect.client.model.SecupayBasketItem;
import io.secuconnect.client.model.SecupaySubTransactionProductModel;
import io.secuconnect.client.model.SecupayTransactionProductModelRedirectUrl;
import io.secuconnect.client.model.SecupayTransactionProductModelTransferAccount;
import io.secuconnect.client.model.SecupayTransactionProductModelUsedPaymentInstrument;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SecupayTransactionProductModel
 */
public class SecupayTransactionProductModel {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("trans_id")
  private Integer transId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("purpose")
  private String purpose = null;

  @SerializedName("order_id")
  private String orderId = null;

  @SerializedName("basket")
  private List<SecupayBasketItem> basket = null;

  @SerializedName("transaction_status")
  private String transactionStatus = null;

  @SerializedName("accrual")
  private Boolean accrual = null;

  @SerializedName("payment_action")
  private String paymentAction = null;

  @SerializedName("transfer_purpose")
  private String transferPurpose = null;

  @SerializedName("transfer_account")
  private SecupayTransactionProductModelTransferAccount transferAccount = null;

  @SerializedName("customer")
  private PaymentCustomersProductModel customer = null;

  @SerializedName("used_payment_instrument")
  private SecupayTransactionProductModelUsedPaymentInstrument usedPaymentInstrument = null;

  @SerializedName("redirect_url")
  private SecupayTransactionProductModelRedirectUrl redirectUrl = null;

  @SerializedName("iframe_url")
  private String iframeUrl = null;

  @SerializedName("container")
  private PaymentContainersProductModel container = null;

  @SerializedName("sub_transactions")
  private List<SecupaySubTransactionProductModel> subTransactions = null;

  public SecupayTransactionProductModel object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Product name
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public SecupayTransactionProductModel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of instance
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SecupayTransactionProductModel transId(Integer transId) {
    this.transId = transId;
    return this;
  }

   /**
   * Transaction identifier
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
   * Total amount of payment in cents (or the smallest cash unit of the relevant currency)
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
   * ISO 4217 code of currency, eg EUR for Euro.
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
   * The purpose of the payment. This is the later assignment of the payment is for example on the account statement of the buyer.
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
   * Specifying an order number. Depending on the contract setting, this must be unique for each payment.
   * @return orderId
  **/
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
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
   * A list of items that are being purchased.
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
   * Transaction status (number)
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
   * Indicates whether the payment is locked for pay-out (TRUE) or not (FALSE). Standard value here is FALSE.
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
   * Specifies whether a pre-authorization (\&quot;authorization\&quot;) or instant payment ( \&quot;sale\&quot;) is to be performed. Standard value here is \&quot;sale\&quot;. The collection of the pre-authorized payment is made with the \&quot;capture\&quot; command.
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
   * The purpose the payer needs to use for his transfer
   * @return transferPurpose
  **/
  public String getTransferPurpose() {
    return transferPurpose;
  }

  public void setTransferPurpose(String transferPurpose) {
    this.transferPurpose = transferPurpose;
  }

  public SecupayTransactionProductModel transferAccount(SecupayTransactionProductModelTransferAccount transferAccount) {
    this.transferAccount = transferAccount;
    return this;
  }

   /**
   * Get transferAccount
   * @return transferAccount
  **/
  public SecupayTransactionProductModelTransferAccount getTransferAccount() {
    return transferAccount;
  }

  public void setTransferAccount(SecupayTransactionProductModelTransferAccount transferAccount) {
    this.transferAccount = transferAccount;
  }

  public SecupayTransactionProductModel customer(PaymentCustomersProductModel customer) {
    this.customer = customer;
    return this;
  }

   /**
   * The customer object
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

  public SecupayTransactionProductModel redirectUrl(SecupayTransactionProductModelRedirectUrl redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * Get redirectUrl
   * @return redirectUrl
  **/
  public SecupayTransactionProductModelRedirectUrl getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(SecupayTransactionProductModelRedirectUrl redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  public SecupayTransactionProductModel iframeUrl(String iframeUrl) {
    this.iframeUrl = iframeUrl;
    return this;
  }

   /**
   * The url of the payment checkout iframe
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
   * The container object
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
   * A list of sub-transactions (for mixed basket)
   * @return subTransactions
  **/
  public List<SecupaySubTransactionProductModel> getSubTransactions() {
    return subTransactions;
  }

  public void setSubTransactions(List<SecupaySubTransactionProductModel> subTransactions) {
    this.subTransactions = subTransactions;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayTransactionProductModel secupayTransactionProductModel = (SecupayTransactionProductModel) o;
    return Objects.equals(this.object, secupayTransactionProductModel.object) &&
        Objects.equals(this.id, secupayTransactionProductModel.id) &&
        Objects.equals(this.transId, secupayTransactionProductModel.transId) &&
        Objects.equals(this.status, secupayTransactionProductModel.status) &&
        Objects.equals(this.amount, secupayTransactionProductModel.amount) &&
        Objects.equals(this.currency, secupayTransactionProductModel.currency) &&
        Objects.equals(this.purpose, secupayTransactionProductModel.purpose) &&
        Objects.equals(this.orderId, secupayTransactionProductModel.orderId) &&
        Objects.equals(this.basket, secupayTransactionProductModel.basket) &&
        Objects.equals(this.transactionStatus, secupayTransactionProductModel.transactionStatus) &&
        Objects.equals(this.accrual, secupayTransactionProductModel.accrual) &&
        Objects.equals(this.paymentAction, secupayTransactionProductModel.paymentAction) &&
        Objects.equals(this.transferPurpose, secupayTransactionProductModel.transferPurpose) &&
        Objects.equals(this.transferAccount, secupayTransactionProductModel.transferAccount) &&
        Objects.equals(this.customer, secupayTransactionProductModel.customer) &&
        Objects.equals(this.usedPaymentInstrument, secupayTransactionProductModel.usedPaymentInstrument) &&
        Objects.equals(this.redirectUrl, secupayTransactionProductModel.redirectUrl) &&
        Objects.equals(this.iframeUrl, secupayTransactionProductModel.iframeUrl) &&
        Objects.equals(this.container, secupayTransactionProductModel.container) &&
        Objects.equals(this.subTransactions, secupayTransactionProductModel.subTransactions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, transId, status, amount, currency, purpose, orderId, basket, transactionStatus, accrual, paymentAction, transferPurpose, transferAccount, customer, usedPaymentInstrument, redirectUrl, iframeUrl, container, subTransactions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayTransactionProductModel {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    basket: ").append(toIndentedString(basket)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    accrual: ").append(toIndentedString(accrual)).append("\n");
    sb.append("    paymentAction: ").append(toIndentedString(paymentAction)).append("\n");
    sb.append("    transferPurpose: ").append(toIndentedString(transferPurpose)).append("\n");
    sb.append("    transferAccount: ").append(toIndentedString(transferAccount)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    usedPaymentInstrument: ").append(toIndentedString(usedPaymentInstrument)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    iframeUrl: ").append(toIndentedString(iframeUrl)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    subTransactions: ").append(toIndentedString(subTransactions)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

