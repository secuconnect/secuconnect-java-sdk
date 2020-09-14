package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.BaseProductModel;
import io.secuconnect.client.model.GeneralMerchantsProductModel;
import io.secuconnect.client.model.GeneralStoresProductModel;
import io.secuconnect.client.model.ParentObj;
import io.secuconnect.client.model.PaymentTransactionsProductModelCustomer;
import io.secuconnect.client.model.PaymentTransactionsProductModelDetails;
import io.secuconnect.client.model.ProductInstanceUID;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * The Payment Transaction manages the payment process, from authorization till the payment is really executed.
 */
public class PaymentTransactionsProductModel extends BaseProductModel {
  @SerializedName("platform")
  private ProductInstanceUID platform = null;

  @SerializedName("merchant")
  private GeneralMerchantsProductModel merchant = null;

  @SerializedName("store")
  private GeneralStoresProductModel store = null;

  @SerializedName("trans_id")
  private Integer transId = null;

  @SerializedName("parents")
  private List<ParentObj> parents = null;

  @SerializedName("product_id")
  private Integer productId = null;

  @SerializedName("product")
  private String product = null;

  @SerializedName("product_raw")
  private String productRaw = null;

  @SerializedName("zahlungsmittel_id")
  private Integer zahlungsmittelId = null;

  @SerializedName("contract_id")
  private Integer contractId = null;

  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("updated")
  private String updated = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("status_text")
  private String statusText = null;

  @SerializedName("incoming_payment_date")
  private String incomingPaymentDate = null;

  @SerializedName("details")
  private PaymentTransactionsProductModelDetails details = null;

  @SerializedName("customer")
  private PaymentTransactionsProductModelCustomer customer = null;

  @SerializedName("tid")
  private String tid = null;

  @SerializedName("payment_data")
  private String paymentData = null;

  @SerializedName("store_name")
  private String storeName = null;

  @SerializedName("payout_date")
  private String payoutDate = null;

  @SerializedName("invoice_number")
  private String invoiceNumber = null;

  @SerializedName("transaction_hash")
  private String transactionHash = null;

  @SerializedName("reference_id")
  private String referenceId = null;

  @SerializedName("account_owner")
  private String accountOwner = null;

  @SerializedName("accrual")
  private Boolean accrual = null;

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
   * Transaction ID in secupay Frontend
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
   * Total amount to payment in the minor currency unit (e. g. Euro Cents)
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
   * ISO 4217 three-letter currency (e. g. EUR for Euro)
   * @return currency
  **/
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PaymentTransactionsProductModel created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Created at date
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
   * Updated at date
   * @return updated
  **/
  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransactionsProductModel paymentTransactionsProductModel = (PaymentTransactionsProductModel) o;
    return Objects.equals(this.platform, paymentTransactionsProductModel.platform) &&
        Objects.equals(this.merchant, paymentTransactionsProductModel.merchant) &&
        Objects.equals(this.store, paymentTransactionsProductModel.store) &&
        Objects.equals(this.transId, paymentTransactionsProductModel.transId) &&
        Objects.equals(this.parents, paymentTransactionsProductModel.parents) &&
        Objects.equals(this.productId, paymentTransactionsProductModel.productId) &&
        Objects.equals(this.product, paymentTransactionsProductModel.product) &&
        Objects.equals(this.productRaw, paymentTransactionsProductModel.productRaw) &&
        Objects.equals(this.zahlungsmittelId, paymentTransactionsProductModel.zahlungsmittelId) &&
        Objects.equals(this.contractId, paymentTransactionsProductModel.contractId) &&
        Objects.equals(this.amount, paymentTransactionsProductModel.amount) &&
        Objects.equals(this.currency, paymentTransactionsProductModel.currency) &&
        Objects.equals(this.created, paymentTransactionsProductModel.created) &&
        Objects.equals(this.updated, paymentTransactionsProductModel.updated) &&
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
        Objects.equals(this.accountOwner, paymentTransactionsProductModel.accountOwner) &&
        Objects.equals(this.accrual, paymentTransactionsProductModel.accrual) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(platform, merchant, store, transId, parents, productId, product, productRaw, zahlungsmittelId, contractId, amount, currency, created, updated, status, statusText, incomingPaymentDate, details, customer, tid, paymentData, storeName, payoutDate, invoiceNumber, transactionHash, referenceId, accountOwner, accrual, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransactionsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    platform: ").append(toIndentedString(platform)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
    sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    productRaw: ").append(toIndentedString(productRaw)).append("\n");
    sb.append("    zahlungsmittelId: ").append(toIndentedString(zahlungsmittelId)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
    sb.append("    accountOwner: ").append(toIndentedString(accountOwner)).append("\n");
    sb.append("    accrual: ").append(toIndentedString(accrual)).append("\n");
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

