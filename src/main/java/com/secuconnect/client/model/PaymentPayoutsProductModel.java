package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.DocumentLink;
import com.secuconnect.client.model.GeneralMerchantsProductModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PaymentPayoutsProductModel
 */
public class PaymentPayoutsProductModel extends BaseProductModel {
  @SerializedName("l")
  private Integer l = null;

  @SerializedName("k")
  private Integer k = null;

  @SerializedName("ks")
  private String ks = null;

  @SerializedName("c")
  private Integer c = null;

  @SerializedName("s")
  private Integer s = null;

  @SerializedName("t")
  private AggregationTimeResult t = null;

  @SerializedName("store_name")
  private String storeName = null;

  @SerializedName("merchant")
  private GeneralMerchantsProductModel merchant = null;

  @SerializedName("trans_id")
  private Integer transId = null;

  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("date")
  private String date = null;

  @SerializedName("simple_status_id")
  private Integer simpleStatusId = null;

  @SerializedName("simple_status_description")
  private String simpleStatusDescription = null;

  @SerializedName("receiver")
  private String receiver = null;

  @SerializedName("purpose")
  private String purpose = null;

  @SerializedName("trans_status_id")
  private Integer transStatusId = null;

  @SerializedName("documents")
  private List<DocumentLink> documents = null;

  @SerializedName("product_id")
  private Integer productId = null;

  @SerializedName("refund_amount")
  private Integer refundAmount = null;

  @SerializedName("stakeholder_amount")
  private Integer stakeholderAmount = null;

  @SerializedName("claim_amount")
  private Integer claimAmount = null;

  @SerializedName("invoice_amount")
  private Integer invoiceAmount = null;

  @SerializedName("misc_amount")
  private Integer miscAmount = null;

  @SerializedName("payout_amount")
  private Integer payoutAmount = null;

  @SerializedName("transaction_volume")
  private Integer transactionVolume = null;

  public PaymentPayoutsProductModel l(Integer l) {
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

  public PaymentPayoutsProductModel k(Integer k) {
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

  public PaymentPayoutsProductModel ks(String ks) {
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

  public PaymentPayoutsProductModel c(Integer c) {
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

  public PaymentPayoutsProductModel s(Integer s) {
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

  public PaymentPayoutsProductModel t(AggregationTimeResult t) {
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

  public PaymentPayoutsProductModel storeName(String storeName) {
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

  public PaymentPayoutsProductModel merchant(GeneralMerchantsProductModel merchant) {
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

  public PaymentPayoutsProductModel transId(Integer transId) {
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

  public PaymentPayoutsProductModel amount(Integer amount) {
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

  public PaymentPayoutsProductModel currency(String currency) {
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

  public PaymentPayoutsProductModel date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  public PaymentPayoutsProductModel simpleStatusId(Integer simpleStatusId) {
    this.simpleStatusId = simpleStatusId;
    return this;
  }

   /**
   * Transaction simple-status ID
   * @return simpleStatusId
  **/
  public Integer getSimpleStatusId() {
    return simpleStatusId;
  }

  public void setSimpleStatusId(Integer simpleStatusId) {
    this.simpleStatusId = simpleStatusId;
  }

  public PaymentPayoutsProductModel simpleStatusDescription(String simpleStatusDescription) {
    this.simpleStatusDescription = simpleStatusDescription;
    return this;
  }

   /**
   * Transaction simple-status description
   * @return simpleStatusDescription
  **/
  public String getSimpleStatusDescription() {
    return simpleStatusDescription;
  }

  public void setSimpleStatusDescription(String simpleStatusDescription) {
    this.simpleStatusDescription = simpleStatusDescription;
  }

  public PaymentPayoutsProductModel receiver(String receiver) {
    this.receiver = receiver;
    return this;
  }

   /**
   * Store name
   * @return receiver
  **/
  public String getReceiver() {
    return receiver;
  }

  public void setReceiver(String receiver) {
    this.receiver = receiver;
  }

  public PaymentPayoutsProductModel purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * Store name
   * @return purpose
  **/
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public PaymentPayoutsProductModel transStatusId(Integer transStatusId) {
    this.transStatusId = transStatusId;
    return this;
  }

   /**
   * Transaction status ID
   * @return transStatusId
  **/
  public Integer getTransStatusId() {
    return transStatusId;
  }

  public void setTransStatusId(Integer transStatusId) {
    this.transStatusId = transStatusId;
  }

  public PaymentPayoutsProductModel documents(List<DocumentLink> documents) {
    this.documents = documents;
    return this;
  }

  public PaymentPayoutsProductModel addDocumentsItem(DocumentLink documentsItem) {
    if (this.documents == null) {
      this.documents = new ArrayList<DocumentLink>();
    }
    this.documents.add(documentsItem);
    return this;
  }

   /**
   * Get documents
   * @return documents
  **/
  public List<DocumentLink> getDocuments() {
    return documents;
  }

  public void setDocuments(List<DocumentLink> documents) {
    this.documents = documents;
  }

  public PaymentPayoutsProductModel productId(Integer productId) {
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

  public PaymentPayoutsProductModel refundAmount(Integer refundAmount) {
    this.refundAmount = refundAmount;
    return this;
  }

   /**
   * Get refundAmount
   * @return refundAmount
  **/
  public Integer getRefundAmount() {
    return refundAmount;
  }

  public void setRefundAmount(Integer refundAmount) {
    this.refundAmount = refundAmount;
  }

  public PaymentPayoutsProductModel stakeholderAmount(Integer stakeholderAmount) {
    this.stakeholderAmount = stakeholderAmount;
    return this;
  }

   /**
   * Get stakeholderAmount
   * @return stakeholderAmount
  **/
  public Integer getStakeholderAmount() {
    return stakeholderAmount;
  }

  public void setStakeholderAmount(Integer stakeholderAmount) {
    this.stakeholderAmount = stakeholderAmount;
  }

  public PaymentPayoutsProductModel claimAmount(Integer claimAmount) {
    this.claimAmount = claimAmount;
    return this;
  }

   /**
   * Get claimAmount
   * @return claimAmount
  **/
  public Integer getClaimAmount() {
    return claimAmount;
  }

  public void setClaimAmount(Integer claimAmount) {
    this.claimAmount = claimAmount;
  }

  public PaymentPayoutsProductModel invoiceAmount(Integer invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
    return this;
  }

   /**
   * Get invoiceAmount
   * @return invoiceAmount
  **/
  public Integer getInvoiceAmount() {
    return invoiceAmount;
  }

  public void setInvoiceAmount(Integer invoiceAmount) {
    this.invoiceAmount = invoiceAmount;
  }

  public PaymentPayoutsProductModel miscAmount(Integer miscAmount) {
    this.miscAmount = miscAmount;
    return this;
  }

   /**
   * Get miscAmount
   * @return miscAmount
  **/
  public Integer getMiscAmount() {
    return miscAmount;
  }

  public void setMiscAmount(Integer miscAmount) {
    this.miscAmount = miscAmount;
  }

  public PaymentPayoutsProductModel payoutAmount(Integer payoutAmount) {
    this.payoutAmount = payoutAmount;
    return this;
  }

   /**
   * Get payoutAmount
   * @return payoutAmount
  **/
  public Integer getPayoutAmount() {
    return payoutAmount;
  }

  public void setPayoutAmount(Integer payoutAmount) {
    this.payoutAmount = payoutAmount;
  }

  public PaymentPayoutsProductModel transactionVolume(Integer transactionVolume) {
    this.transactionVolume = transactionVolume;
    return this;
  }

   /**
   * Get transactionVolume
   * @return transactionVolume
  **/
  public Integer getTransactionVolume() {
    return transactionVolume;
  }

  public void setTransactionVolume(Integer transactionVolume) {
    this.transactionVolume = transactionVolume;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentPayoutsProductModel paymentPayoutsProductModel = (PaymentPayoutsProductModel) o;
    return Objects.equals(this.l, paymentPayoutsProductModel.l) &&
        Objects.equals(this.k, paymentPayoutsProductModel.k) &&
        Objects.equals(this.ks, paymentPayoutsProductModel.ks) &&
        Objects.equals(this.c, paymentPayoutsProductModel.c) &&
        Objects.equals(this.s, paymentPayoutsProductModel.s) &&
        Objects.equals(this.t, paymentPayoutsProductModel.t) &&
        Objects.equals(this.storeName, paymentPayoutsProductModel.storeName) &&
        Objects.equals(this.merchant, paymentPayoutsProductModel.merchant) &&
        Objects.equals(this.transId, paymentPayoutsProductModel.transId) &&
        Objects.equals(this.amount, paymentPayoutsProductModel.amount) &&
        Objects.equals(this.currency, paymentPayoutsProductModel.currency) &&
        Objects.equals(this.date, paymentPayoutsProductModel.date) &&
        Objects.equals(this.simpleStatusId, paymentPayoutsProductModel.simpleStatusId) &&
        Objects.equals(this.simpleStatusDescription, paymentPayoutsProductModel.simpleStatusDescription) &&
        Objects.equals(this.receiver, paymentPayoutsProductModel.receiver) &&
        Objects.equals(this.purpose, paymentPayoutsProductModel.purpose) &&
        Objects.equals(this.transStatusId, paymentPayoutsProductModel.transStatusId) &&
        Objects.equals(this.documents, paymentPayoutsProductModel.documents) &&
        Objects.equals(this.productId, paymentPayoutsProductModel.productId) &&
        Objects.equals(this.refundAmount, paymentPayoutsProductModel.refundAmount) &&
        Objects.equals(this.stakeholderAmount, paymentPayoutsProductModel.stakeholderAmount) &&
        Objects.equals(this.claimAmount, paymentPayoutsProductModel.claimAmount) &&
        Objects.equals(this.invoiceAmount, paymentPayoutsProductModel.invoiceAmount) &&
        Objects.equals(this.miscAmount, paymentPayoutsProductModel.miscAmount) &&
        Objects.equals(this.payoutAmount, paymentPayoutsProductModel.payoutAmount) &&
        Objects.equals(this.transactionVolume, paymentPayoutsProductModel.transactionVolume) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, storeName, merchant, transId, amount, currency, date, simpleStatusId, simpleStatusDescription, receiver, purpose, transStatusId, documents, productId, refundAmount, stakeholderAmount, claimAmount, invoiceAmount, miscAmount, payoutAmount, transactionVolume, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentPayoutsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    l: ").append(toIndentedString(l)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    ks: ").append(toIndentedString(ks)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    simpleStatusId: ").append(toIndentedString(simpleStatusId)).append("\n");
    sb.append("    simpleStatusDescription: ").append(toIndentedString(simpleStatusDescription)).append("\n");
    sb.append("    receiver: ").append(toIndentedString(receiver)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    transStatusId: ").append(toIndentedString(transStatusId)).append("\n");
    sb.append("    documents: ").append(toIndentedString(documents)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    refundAmount: ").append(toIndentedString(refundAmount)).append("\n");
    sb.append("    stakeholderAmount: ").append(toIndentedString(stakeholderAmount)).append("\n");
    sb.append("    claimAmount: ").append(toIndentedString(claimAmount)).append("\n");
    sb.append("    invoiceAmount: ").append(toIndentedString(invoiceAmount)).append("\n");
    sb.append("    miscAmount: ").append(toIndentedString(miscAmount)).append("\n");
    sb.append("    payoutAmount: ").append(toIndentedString(payoutAmount)).append("\n");
    sb.append("    transactionVolume: ").append(toIndentedString(transactionVolume)).append("\n");
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

