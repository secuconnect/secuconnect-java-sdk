package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.GeneralMerchantsProductModel;
import java.util.Objects;

/**
 * PaymentInvoicesProductModel
 */
public class PaymentInvoicesProductModel extends BaseProductModel {
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

  @SerializedName("store_name")
  protected String storeName = null;

  @SerializedName("merchant")
  protected GeneralMerchantsProductModel merchant = null;

  @SerializedName("invoice_id")
  protected String invoiceId = null;

  @SerializedName("date")
  protected String date = null;

  @SerializedName("amount")
  protected Integer amount = null;

  @SerializedName("currency")
  protected String currency = null;

  @SerializedName("tax_amount")
  protected Integer taxAmount = null;

  @SerializedName("total_amount")
  protected Integer totalAmount = null;

  @SerializedName("document_url")
  protected String documentUrl = null;

  @SerializedName("document_url_xml")
  protected String documentUrlXml = null;

  public PaymentInvoicesProductModel l(Integer l) {
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

  public PaymentInvoicesProductModel k(Integer k) {
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

  public PaymentInvoicesProductModel ks(String ks) {
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

  public PaymentInvoicesProductModel c(Integer c) {
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

  public PaymentInvoicesProductModel s(Integer s) {
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

  public PaymentInvoicesProductModel t(AggregationTimeResult t) {
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

  public PaymentInvoicesProductModel storeName(String storeName) {
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

  public PaymentInvoicesProductModel merchant(GeneralMerchantsProductModel merchant) {
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

  public PaymentInvoicesProductModel invoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
    return this;
  }

   /**
   * Invoice number
   * @return invoiceId
  **/
  public String getInvoiceId() {
    return invoiceId;
  }

  public void setInvoiceId(String invoiceId) {
    this.invoiceId = invoiceId;
  }

  public PaymentInvoicesProductModel date(String date) {
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

  public PaymentInvoicesProductModel amount(Integer amount) {
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

  public PaymentInvoicesProductModel currency(String currency) {
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

  public PaymentInvoicesProductModel taxAmount(Integer taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Get taxAmount
   * @return taxAmount
  **/
  public Integer getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Integer taxAmount) {
    this.taxAmount = taxAmount;
  }

  public PaymentInvoicesProductModel totalAmount(Integer totalAmount) {
    this.totalAmount = totalAmount;
    return this;
  }

   /**
   * Get totalAmount
   * @return totalAmount
  **/
  public Integer getTotalAmount() {
    return totalAmount;
  }

  public void setTotalAmount(Integer totalAmount) {
    this.totalAmount = totalAmount;
  }

  public PaymentInvoicesProductModel documentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
    return this;
  }

   /**
   * Download URL for PDF document
   * @return documentUrl
  **/
  public String getDocumentUrl() {
    return documentUrl;
  }

  public void setDocumentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
  }

  public PaymentInvoicesProductModel documentUrlXml(String documentUrlXml) {
    this.documentUrlXml = documentUrlXml;
    return this;
  }

   /**
   * Download URL for XML document
   * @return documentUrlXml
  **/
  public String getDocumentUrlXml() {
    return documentUrlXml;
  }

  public void setDocumentUrlXml(String documentUrlXml) {
    this.documentUrlXml = documentUrlXml;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInvoicesProductModel paymentInvoicesProductModel = (PaymentInvoicesProductModel) o;
    return Objects.equals(this.l, paymentInvoicesProductModel.l) &&
        Objects.equals(this.k, paymentInvoicesProductModel.k) &&
        Objects.equals(this.ks, paymentInvoicesProductModel.ks) &&
        Objects.equals(this.c, paymentInvoicesProductModel.c) &&
        Objects.equals(this.s, paymentInvoicesProductModel.s) &&
        Objects.equals(this.t, paymentInvoicesProductModel.t) &&
        Objects.equals(this.storeName, paymentInvoicesProductModel.storeName) &&
        Objects.equals(this.merchant, paymentInvoicesProductModel.merchant) &&
        Objects.equals(this.invoiceId, paymentInvoicesProductModel.invoiceId) &&
        Objects.equals(this.date, paymentInvoicesProductModel.date) &&
        Objects.equals(this.amount, paymentInvoicesProductModel.amount) &&
        Objects.equals(this.currency, paymentInvoicesProductModel.currency) &&
        Objects.equals(this.taxAmount, paymentInvoicesProductModel.taxAmount) &&
        Objects.equals(this.totalAmount, paymentInvoicesProductModel.totalAmount) &&
        Objects.equals(this.documentUrl, paymentInvoicesProductModel.documentUrl) &&
        Objects.equals(this.documentUrlXml, paymentInvoicesProductModel.documentUrlXml) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, storeName, merchant, invoiceId, date, amount, currency, taxAmount, totalAmount, documentUrl, documentUrlXml, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInvoicesProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    l: ").append(toIndentedString(l)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    ks: ").append(toIndentedString(ks)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    documentUrl: ").append(toIndentedString(documentUrl)).append("\n");
    sb.append("    documentUrlXml: ").append(toIndentedString(documentUrlXml)).append("\n");
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

