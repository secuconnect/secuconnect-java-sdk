package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.CreatedField;
import com.secuconnect.client.model.GeneralMerchantsProductModel;
import com.secuconnect.client.model.GeneralStoresProductModel;
import com.secuconnect.client.model.UpdatedField;
import java.util.Objects;

/**
 * CardprocessingInvoicesProductModel
 */
public class CardprocessingInvoicesProductModel extends BaseProductModel {
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

  @SerializedName("merchant")
  protected GeneralMerchantsProductModel merchant = null;

  @SerializedName("store")
  protected GeneralStoresProductModel store = null;

  @SerializedName("store_name")
  protected String storeName = null;

  @SerializedName("id_old")
  protected Integer idOld = null;

  @SerializedName("tid")
  protected String tid = null;

  @SerializedName("invoice_number")
  protected String invoiceNumber = null;

  @SerializedName("net_amount")
  protected Integer netAmount = null;

  @SerializedName("tax_amount")
  protected Integer taxAmount = null;

  @SerializedName("amount")
  protected Integer amount = null;

  @SerializedName("document_url")
  protected String documentUrl = null;

  @SerializedName("type")
  protected String type = null;

  public CardprocessingInvoicesProductModel l(Integer l) {
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

  public CardprocessingInvoicesProductModel k(Integer k) {
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

  public CardprocessingInvoicesProductModel ks(String ks) {
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

  public CardprocessingInvoicesProductModel c(Integer c) {
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

  public CardprocessingInvoicesProductModel s(Integer s) {
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

  public CardprocessingInvoicesProductModel t(AggregationTimeResult t) {
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

  public CardprocessingInvoicesProductModel created(String created) {
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

  public CardprocessingInvoicesProductModel updated(String updated) {
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

  public CardprocessingInvoicesProductModel merchant(GeneralMerchantsProductModel merchant) {
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

  public CardprocessingInvoicesProductModel store(GeneralStoresProductModel store) {
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

  public CardprocessingInvoicesProductModel storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

   /**
   * Get storeName
   * @return storeName
  **/
  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public CardprocessingInvoicesProductModel idOld(Integer idOld) {
    this.idOld = idOld;
    return this;
  }

   /**
   * Invoice ID
   * @return idOld
  **/
  public Integer getIdOld() {
    return idOld;
  }

  public void setIdOld(Integer idOld) {
    this.idOld = idOld;
  }

  public CardprocessingInvoicesProductModel tid(String tid) {
    this.tid = tid;
    return this;
  }

   /**
   * Terminal TID
   * @return tid
  **/
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public CardprocessingInvoicesProductModel invoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
    return this;
  }

   /**
   * Get invoiceNumber
   * @return invoiceNumber
  **/
  public String getInvoiceNumber() {
    return invoiceNumber;
  }

  public void setInvoiceNumber(String invoiceNumber) {
    this.invoiceNumber = invoiceNumber;
  }

  public CardprocessingInvoicesProductModel netAmount(Integer netAmount) {
    this.netAmount = netAmount;
    return this;
  }

   /**
   * Get netAmount
   * @return netAmount
  **/
  public Integer getNetAmount() {
    return netAmount;
  }

  public void setNetAmount(Integer netAmount) {
    this.netAmount = netAmount;
  }

  public CardprocessingInvoicesProductModel taxAmount(Integer taxAmount) {
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

  public CardprocessingInvoicesProductModel amount(Integer amount) {
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

  public CardprocessingInvoicesProductModel documentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
    return this;
  }

   /**
   * URL to download the invoice PDF
   * @return documentUrl
  **/
  public String getDocumentUrl() {
    return documentUrl;
  }

  public void setDocumentUrl(String documentUrl) {
    this.documentUrl = documentUrl;
  }

  public CardprocessingInvoicesProductModel type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type:  - &#x60;avis&#x60; (payment advice note)&#x60; - &#x60;invoice&#x60; - &#x60;refund&#x60; (credit note)
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardprocessingInvoicesProductModel cardprocessingInvoicesProductModel = (CardprocessingInvoicesProductModel) o;
    return Objects.equals(this.l, cardprocessingInvoicesProductModel.l) &&
        Objects.equals(this.k, cardprocessingInvoicesProductModel.k) &&
        Objects.equals(this.ks, cardprocessingInvoicesProductModel.ks) &&
        Objects.equals(this.c, cardprocessingInvoicesProductModel.c) &&
        Objects.equals(this.s, cardprocessingInvoicesProductModel.s) &&
        Objects.equals(this.t, cardprocessingInvoicesProductModel.t) &&
        Objects.equals(this.created, cardprocessingInvoicesProductModel.created) &&
        Objects.equals(this.updated, cardprocessingInvoicesProductModel.updated) &&
        Objects.equals(this.merchant, cardprocessingInvoicesProductModel.merchant) &&
        Objects.equals(this.store, cardprocessingInvoicesProductModel.store) &&
        Objects.equals(this.storeName, cardprocessingInvoicesProductModel.storeName) &&
        Objects.equals(this.idOld, cardprocessingInvoicesProductModel.idOld) &&
        Objects.equals(this.tid, cardprocessingInvoicesProductModel.tid) &&
        Objects.equals(this.invoiceNumber, cardprocessingInvoicesProductModel.invoiceNumber) &&
        Objects.equals(this.netAmount, cardprocessingInvoicesProductModel.netAmount) &&
        Objects.equals(this.taxAmount, cardprocessingInvoicesProductModel.taxAmount) &&
        Objects.equals(this.amount, cardprocessingInvoicesProductModel.amount) &&
        Objects.equals(this.documentUrl, cardprocessingInvoicesProductModel.documentUrl) &&
        Objects.equals(this.type, cardprocessingInvoicesProductModel.type) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, created, updated, merchant, store, storeName, idOld, tid, invoiceNumber, netAmount, taxAmount, amount, documentUrl, type, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardprocessingInvoicesProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    l: ").append(toIndentedString(l)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    ks: ").append(toIndentedString(ks)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    idOld: ").append(toIndentedString(idOld)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    invoiceNumber: ").append(toIndentedString(invoiceNumber)).append("\n");
    sb.append("    netAmount: ").append(toIndentedString(netAmount)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    documentUrl: ").append(toIndentedString(documentUrl)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

