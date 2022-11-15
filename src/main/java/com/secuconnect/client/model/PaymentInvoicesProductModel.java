package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.GeneralMerchantsProductModel;
import java.util.Objects;

/**
 * PaymentInvoicesProductModel
 */
public class PaymentInvoicesProductModel extends BaseProductModel {
  @SerializedName("store_name")
  private String storeName = null;

  @SerializedName("merchant")
  private GeneralMerchantsProductModel merchant = null;

  @SerializedName("invoice_id")
  private String invoiceId = null;

  @SerializedName("date")
  private String date = null;

  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("tax_amount")
  private Integer taxAmount = null;

  @SerializedName("total_amount")
  private Integer totalAmount = null;

  @SerializedName("document_url")
  private String documentUrl = null;

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
   * Invoice Number
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
   * The url of the invoice document (PDF)
   * @return documentUrl
  **/
  public String getDocumentUrl() {
    return documentUrl;
  }

  public void setDocumentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
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
    return Objects.equals(this.storeName, paymentInvoicesProductModel.storeName) &&
        Objects.equals(this.merchant, paymentInvoicesProductModel.merchant) &&
        Objects.equals(this.invoiceId, paymentInvoicesProductModel.invoiceId) &&
        Objects.equals(this.date, paymentInvoicesProductModel.date) &&
        Objects.equals(this.amount, paymentInvoicesProductModel.amount) &&
        Objects.equals(this.taxAmount, paymentInvoicesProductModel.taxAmount) &&
        Objects.equals(this.totalAmount, paymentInvoicesProductModel.totalAmount) &&
        Objects.equals(this.documentUrl, paymentInvoicesProductModel.documentUrl) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeName, merchant, invoiceId, date, amount, taxAmount, totalAmount, documentUrl, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInvoicesProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    invoiceId: ").append(toIndentedString(invoiceId)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    totalAmount: ").append(toIndentedString(totalAmount)).append("\n");
    sb.append("    documentUrl: ").append(toIndentedString(documentUrl)).append("\n");
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

