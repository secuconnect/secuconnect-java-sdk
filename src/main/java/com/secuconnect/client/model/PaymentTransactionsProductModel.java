package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.CreatedField;
import com.secuconnect.client.model.GeneralMerchantsProductModel;
import com.secuconnect.client.model.GeneralStoresProductModel;
import com.secuconnect.client.model.ParentObj;
import com.secuconnect.client.model.PaymentTransactionsProductModelCustomer;
import com.secuconnect.client.model.PaymentTransactionsProductModelDetails;
import com.secuconnect.client.model.ProductInstanceUID;
import com.secuconnect.client.model.UpdatedField;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The Payment Transaction manages the payment process, from authorization till the payment is really executed.
 */
public class PaymentTransactionsProductModel extends BaseProductModel {
  @SerializedName("l")
  protected Integer l = null;

  @SerializedName("k")
  protected Integer k = null;

  @SerializedName("ks")
  protected String ks = null;

  @SerializedName("c")
  protected Integer c = null;

  @SerializedName("s")
  protected Integer s = null;

  @SerializedName("t")
  protected AggregationTimeResult t = null;

  @SerializedName("created")
  protected String created = null;

  @SerializedName("updated")
  protected String updated = null;

  @SerializedName("platform")
  protected ProductInstanceUID platform = null;

  @SerializedName("merchant")
  protected GeneralMerchantsProductModel merchant = null;

  @SerializedName("store")
  protected GeneralStoresProductModel store = null;

  @SerializedName("trans_id")
  protected Integer transId = null;

  @SerializedName("parents")
  protected List<ParentObj> parents = null;

  @SerializedName("related_transactions")
  protected List<ParentObj> relatedTransactions = null;

  @SerializedName("subscription")
  protected ProductInstanceUID subscription = null;

  @SerializedName("product_id")
  protected Integer productId = null;

  @SerializedName("product")
  protected String product = null;

  @SerializedName("product_raw")
  protected String productRaw = null;

  @SerializedName("zahlungsmittel_id")
  protected Integer zahlungsmittelId = null;

  @SerializedName("contract_id")
  protected Integer contractId = null;

  @SerializedName("amount")
  protected Integer amount = null;

  @SerializedName("currency")
  protected String currency = null;

  @SerializedName("completion_date")
  protected String completionDate = null;

  @SerializedName("status")
  protected Integer status = null;

  @SerializedName("status_text")
  protected String statusText = null;

  @SerializedName("incoming_payment_date")
  protected String incomingPaymentDate = null;

  @SerializedName("details")
  protected PaymentTransactionsProductModelDetails details = null;

  @SerializedName("customer")
  protected PaymentTransactionsProductModelCustomer customer = null;

  @SerializedName("tid")
  protected String tid = null;

  @SerializedName("payment_data")
  protected String paymentData = null;

  @SerializedName("store_name")
  protected String storeName = null;

  @SerializedName("payout_date")
  protected String payoutDate = null;

  @SerializedName("invoice_number")
  protected String invoiceNumber = null;

  @SerializedName("transaction_hash")
  protected String transactionHash = null;

  @SerializedName("reference_id")
  protected String referenceId = null;

  @SerializedName("incoming_payment_purpose")
  protected String incomingPaymentPurpose = null;

  @SerializedName("incoming_payment_iban")
  protected String incomingPaymentIban = null;

  @SerializedName("incoming_payment_bic")
  protected String incomingPaymentBic = null;

  @SerializedName("account_owner")
  protected String accountOwner = null;

  @SerializedName("accrual")
  protected Boolean accrual = null;

  @SerializedName("order_id")
  protected String orderId = null;

  public PaymentTransactionsProductModel l(Integer l) {
    this.l = l;
    return this;
  }

   /**
   * lookup index
   * @return l
  **/
  public Integer getL() {
    return l;
  }

  public void setL(Integer l) {
    this.l = l;
  }

  public PaymentTransactionsProductModel k(Integer k) {
    this.k = k;
    return this;
  }

   /**
   * key index
   * @return k
  **/
  public Integer getK() {
    return k;
  }

  public void setK(Integer k) {
    this.k = k;
  }

  public PaymentTransactionsProductModel ks(String ks) {
    this.ks = ks;
    return this;
  }

   /**
   * key name
   * @return ks
  **/
  public String getKs() {
    return ks;
  }

  public void setKs(String ks) {
    this.ks = ks;
  }

  public PaymentTransactionsProductModel c(Integer c) {
    this.c = c;
    return this;
  }

   /**
   * count (number of items)
   * @return c
  **/
  public Integer getC() {
    return c;
  }

  public void setC(Integer c) {
    this.c = c;
  }

  public PaymentTransactionsProductModel s(Integer s) {
    this.s = s;
    return this;
  }

   /**
   * sum
   * @return s
  **/
  public Integer getS() {
    return s;
  }

  public void setS(Integer s) {
    this.s = s;
  }

  public PaymentTransactionsProductModel t(AggregationTimeResult t) {
    this.t = t;
    return this;
  }

   /**
   * Get t
   * @return t
  **/
  public AggregationTimeResult getT() {
    return t;
  }

  public void setT(AggregationTimeResult t) {
    this.t = t;
  }

  public PaymentTransactionsProductModel created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public PaymentTransactionsProductModel updated(String updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  public PaymentTransactionsProductModel platform(ProductInstanceUID platform) {
    this.platform = platform;
    return this;
  }

   /**
   * Get platform
   * @return platform
  **/
  public ProductInstanceUID getPlatform() {
    return platform;
  }

  public void setPlatform(ProductInstanceUID platform) {
    this.platform = platform;
  }

  public PaymentTransactionsProductModel merchant(GeneralMerchantsProductModel merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  public GeneralMerchantsProductModel getMerchant() {
    return merchant;
  }

  public void setMerchant(GeneralMerchantsProductModel merchant) {
    this.merchant = merchant;
  }

  public PaymentTransactionsProductModel store(GeneralStoresProductModel store) {
    this.store = store;
    return this;
  }

   /**
   * Get store
   * @return store
  **/
  public GeneralStoresProductModel getStore() {
    return store;
  }

  public void setStore(GeneralStoresProductModel store) {
    this.store = store;
  }

  public PaymentTransactionsProductModel transId(Integer transId) {
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

  public PaymentTransactionsProductModel parents(List<ParentObj> parents) {
    this.parents = parents;
    return this;
  }

  public PaymentTransactionsProductModel addParentsItem(ParentObj parentsItem) {
    if (this.parents == null) {
      this.parents = new ArrayList<ParentObj>();
    }
    this.parents.add(parentsItem);
    return this;
  }

   /**
   * Parent transactions
   * @return parents
  **/
  public List<ParentObj> getParents() {
    return parents;
  }

  public void setParents(List<ParentObj> parents) {
    this.parents = parents;
  }

  public PaymentTransactionsProductModel relatedTransactions(List<ParentObj> relatedTransactions) {
    this.relatedTransactions = relatedTransactions;
    return this;
  }

  public PaymentTransactionsProductModel addRelatedTransactionsItem(ParentObj relatedTransactionsItem) {
    if (this.relatedTransactions == null) {
      this.relatedTransactions = new ArrayList<ParentObj>();
    }
    this.relatedTransactions.add(relatedTransactionsItem);
    return this;
  }

   /**
   * Related transactions
   * @return relatedTransactions
  **/
  public List<ParentObj> getRelatedTransactions() {
    return relatedTransactions;
  }

  public void setRelatedTransactions(List<ParentObj> relatedTransactions) {
    this.relatedTransactions = relatedTransactions;
  }

  public PaymentTransactionsProductModel subscription(ProductInstanceUID subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  public ProductInstanceUID getSubscription() {
    return subscription;
  }

  public void setSubscription(ProductInstanceUID subscription) {
    this.subscription = subscription;
  }

  public PaymentTransactionsProductModel productId(Integer productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Payment product ID
   * @return productId
  **/
  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public PaymentTransactionsProductModel product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Payment product type
   * @return product
  **/
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public PaymentTransactionsProductModel productRaw(String productRaw) {
    this.productRaw = productRaw;
    return this;
  }

   /**
   * Payment product name
   * @return productRaw
  **/
  public String getProductRaw() {
    return productRaw;
  }

  public void setProductRaw(String productRaw) {
    this.productRaw = productRaw;
  }

  public PaymentTransactionsProductModel zahlungsmittelId(Integer zahlungsmittelId) {
    this.zahlungsmittelId = zahlungsmittelId;
    return this;
  }

   /**
   * Internal ID of the payment instrument
   * @return zahlungsmittelId
  **/
  public Integer getZahlungsmittelId() {
    return zahlungsmittelId;
  }

  public void setZahlungsmittelId(Integer zahlungsmittelId) {
    this.zahlungsmittelId = zahlungsmittelId;
  }

  public PaymentTransactionsProductModel contractId(Integer contractId) {
    this.contractId = contractId;
    return this;
  }

   /**
   * Merchant&#x27;s contract ID
   * @return contractId
  **/
  public Integer getContractId() {
    return contractId;
  }

  public void setContractId(Integer contractId) {
    this.contractId = contractId;
  }

  public PaymentTransactionsProductModel amount(Integer amount) {
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

  public PaymentTransactionsProductModel currency(String currency) {
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

  public PaymentTransactionsProductModel completionDate(String completionDate) {
    this.completionDate = completionDate;
    return this;
  }

   /**
   * Get completionDate
   * @return completionDate
  **/
  public String getCompletionDate() {
    return completionDate;
  }

  public void setCompletionDate(String completionDate) {
    this.completionDate = completionDate;
  }

  public PaymentTransactionsProductModel status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Transaction status ID
   * @return status
  **/
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public PaymentTransactionsProductModel statusText(String statusText) {
    this.statusText = statusText;
    return this;
  }

   /**
   * Transaction status description
   * @return statusText
  **/
  public String getStatusText() {
    return statusText;
  }

  public void setStatusText(String statusText) {
    this.statusText = statusText;
  }

  public PaymentTransactionsProductModel incomingPaymentDate(String incomingPaymentDate) {
    this.incomingPaymentDate = incomingPaymentDate;
    return this;
  }

   /**
   * Date when the payment was received
   * @return incomingPaymentDate
  **/
  public String getIncomingPaymentDate() {
    return incomingPaymentDate;
  }

  public void setIncomingPaymentDate(String incomingPaymentDate) {
    this.incomingPaymentDate = incomingPaymentDate;
  }

  public PaymentTransactionsProductModel details(PaymentTransactionsProductModelDetails details) {
    this.details = details;
    return this;
  }

   /**
   * Get details
   * @return details
  **/
  public PaymentTransactionsProductModelDetails getDetails() {
    return details;
  }

  public void setDetails(PaymentTransactionsProductModelDetails details) {
    this.details = details;
  }

  public PaymentTransactionsProductModel customer(PaymentTransactionsProductModelCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  public PaymentTransactionsProductModelCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(PaymentTransactionsProductModelCustomer customer) {
    this.customer = customer;
  }

  public PaymentTransactionsProductModel tid(String tid) {
    this.tid = tid;
    return this;
  }

   /**
   * Terminal-ID
   * @return tid
  **/
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public PaymentTransactionsProductModel paymentData(String paymentData) {
    this.paymentData = paymentData;
    return this;
  }

   /**
   * Data of the used payment instrument
   * @return paymentData
  **/
  public String getPaymentData() {
    return paymentData;
  }

  public void setPaymentData(String paymentData) {
    this.paymentData = paymentData;
  }

  public PaymentTransactionsProductModel storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

   /**
   * Store name
   * @return storeName
  **/
  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public PaymentTransactionsProductModel payoutDate(String payoutDate) {
    this.payoutDate = payoutDate;
    return this;
  }

   /**
   * Date when the payout was created
   * @return payoutDate
  **/
  public String getPayoutDate() {
    return payoutDate;
  }

  public void setPayoutDate(String payoutDate) {
    this.payoutDate = payoutDate;
  }

  public PaymentTransactionsProductModel invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Invoice number (from merchant)
   * @return invoiceNumber
  **/
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public PaymentTransactionsProductModel transactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
    return this;
  }

   /**
   * Payment-ID
   * @return transactionHash
  **/
  public String getTransactionHash() {
    return transactionHash;
  }

  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }

  public PaymentTransactionsProductModel referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Reference ID
   * @return referenceId
  **/
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public PaymentTransactionsProductModel incomingPaymentPurpose(String incomingPaymentPurpose) {
    this.incomingPaymentPurpose = incomingPaymentPurpose;
    return this;
  }

   /**
   * Purpose from the received payment
   * @return incomingPaymentPurpose
  **/
  public String getIncomingPaymentPurpose() {
    return incomingPaymentPurpose;
  }

  public void setIncomingPaymentPurpose(String incomingPaymentPurpose) {
    this.incomingPaymentPurpose = incomingPaymentPurpose;
  }

  public PaymentTransactionsProductModel incomingPaymentIban(String incomingPaymentIban) {
    this.incomingPaymentIban = incomingPaymentIban;
    return this;
  }

   /**
   * IBAN from the received payment
   * @return incomingPaymentIban
  **/
  public String getIncomingPaymentIban() {
    return incomingPaymentIban;
  }

  public void setIncomingPaymentIban(String incomingPaymentIban) {
    this.incomingPaymentIban = incomingPaymentIban;
  }

  public PaymentTransactionsProductModel incomingPaymentBic(String incomingPaymentBic) {
    this.incomingPaymentBic = incomingPaymentBic;
    return this;
  }

   /**
   * BIC from the received payment
   * @return incomingPaymentBic
  **/
  public String getIncomingPaymentBic() {
    return incomingPaymentBic;
  }

  public void setIncomingPaymentBic(String incomingPaymentBic) {
    this.incomingPaymentBic = incomingPaymentBic;
  }

  public PaymentTransactionsProductModel accountOwner(String accountOwner) {
    this.accountOwner = accountOwner;
    return this;
  }

   /**
   * Name of the bank account owner
   * @return accountOwner
  **/
  public String getAccountOwner() {
    return accountOwner;
  }

  public void setAccountOwner(String accountOwner) {
    this.accountOwner = accountOwner;
  }

  public PaymentTransactionsProductModel accrual(Boolean accrual) {
    this.accrual = accrual;
    return this;
  }

   /**
   * Accrual Flag
   * @return accrual
  **/
  public Boolean getAccrual() {
    return accrual;
  }

  public void setAccrual(Boolean accrual) {
    this.accrual = accrual;
  }

  public PaymentTransactionsProductModel orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Order ID
   * @return orderId
  **/
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransactionsProductModel paymentTransactionsProductModel = (PaymentTransactionsProductModel) o;
    return Objects.equals(this.l, paymentTransactionsProductModel.l) &&
        Objects.equals(this.k, paymentTransactionsProductModel.k) &&
        Objects.equals(this.ks, paymentTransactionsProductModel.ks) &&
        Objects.equals(this.c, paymentTransactionsProductModel.c) &&
        Objects.equals(this.s, paymentTransactionsProductModel.s) &&
        Objects.equals(this.t, paymentTransactionsProductModel.t) &&
        Objects.equals(this.created, paymentTransactionsProductModel.created) &&
        Objects.equals(this.updated, paymentTransactionsProductModel.updated) &&
        Objects.equals(this.platform, paymentTransactionsProductModel.platform) &&
        Objects.equals(this.merchant, paymentTransactionsProductModel.merchant) &&
        Objects.equals(this.store, paymentTransactionsProductModel.store) &&
        Objects.equals(this.transId, paymentTransactionsProductModel.transId) &&
        Objects.equals(this.parents, paymentTransactionsProductModel.parents) &&
        Objects.equals(this.relatedTransactions, paymentTransactionsProductModel.relatedTransactions) &&
        Objects.equals(this.subscription, paymentTransactionsProductModel.subscription) &&
        Objects.equals(this.productId, paymentTransactionsProductModel.productId) &&
        Objects.equals(this.product, paymentTransactionsProductModel.product) &&
        Objects.equals(this.productRaw, paymentTransactionsProductModel.productRaw) &&
        Objects.equals(this.zahlungsmittelId, paymentTransactionsProductModel.zahlungsmittelId) &&
        Objects.equals(this.contractId, paymentTransactionsProductModel.contractId) &&
        Objects.equals(this.amount, paymentTransactionsProductModel.amount) &&
        Objects.equals(this.currency, paymentTransactionsProductModel.currency) &&
        Objects.equals(this.completionDate, paymentTransactionsProductModel.completionDate) &&
        Objects.equals(this.status, paymentTransactionsProductModel.status) &&
        Objects.equals(this.statusText, paymentTransactionsProductModel.statusText) &&
        Objects.equals(this.incomingPaymentDate, paymentTransactionsProductModel.incomingPaymentDate) &&
        Objects.equals(this.details, paymentTransactionsProductModel.details) &&
        Objects.equals(this.customer, paymentTransactionsProductModel.customer) &&
        Objects.equals(this.tid, paymentTransactionsProductModel.tid) &&
        Objects.equals(this.paymentData, paymentTransactionsProductModel.paymentData) &&
        Objects.equals(this.storeName, paymentTransactionsProductModel.storeName) &&
        Objects.equals(this.payoutDate, paymentTransactionsProductModel.payoutDate) &&
        Objects.equals(this.invoiceNumber, paymentTransactionsProductModel.invoiceNumber) &&
        Objects.equals(this.transactionHash, paymentTransactionsProductModel.transactionHash) &&
        Objects.equals(this.referenceId, paymentTransactionsProductModel.referenceId) &&
        Objects.equals(this.incomingPaymentPurpose, paymentTransactionsProductModel.incomingPaymentPurpose) &&
        Objects.equals(this.incomingPaymentIban, paymentTransactionsProductModel.incomingPaymentIban) &&
        Objects.equals(this.incomingPaymentBic, paymentTransactionsProductModel.incomingPaymentBic) &&
        Objects.equals(this.accountOwner, paymentTransactionsProductModel.accountOwner) &&
        Objects.equals(this.accrual, paymentTransactionsProductModel.accrual) &&
        Objects.equals(this.orderId, paymentTransactionsProductModel.orderId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, created, updated, platform, merchant, store, transId, parents, relatedTransactions, subscription, productId, product, productRaw, zahlungsmittelId, contractId, amount, currency, completionDate, status, statusText, incomingPaymentDate, details, customer, tid, paymentData, storeName, payoutDate, invoiceNumber, transactionHash, referenceId, incomingPaymentPurpose, incomingPaymentIban, incomingPaymentBic, accountOwner, accrual, orderId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransactionsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    l: ").append(toIndentedString(l)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    ks: ").append(toIndentedString(ks)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
    sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
    sb.append("    relatedTransactions: ").append(toIndentedString(relatedTransactions)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productRaw: ").append(toIndentedString(productRaw)).append("\n");
    sb.append("    zahlungsmittelId: ").append(toIndentedString(zahlungsmittelId)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    completionDate: ").append(toIndentedString(completionDate)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
    sb.append("    incomingPaymentDate: ").append(toIndentedString(incomingPaymentDate)).append("\n");
    sb.append("    details: ").append(toIndentedString(details)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    paymentData: ").append(toIndentedString(paymentData)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    payoutDate: ").append(toIndentedString(payoutDate)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    incomingPaymentPurpose: ").append(toIndentedString(incomingPaymentPurpose)).append("\n");
    sb.append("    incomingPaymentIban: ").append(toIndentedString(incomingPaymentIban)).append("\n");
    sb.append("    incomingPaymentBic: ").append(toIndentedString(incomingPaymentBic)).append("\n");
    sb.append("    accountOwner: ").append(toIndentedString(accountOwner)).append("\n");
    sb.append("    accrual: ").append(toIndentedString(accrual)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
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

