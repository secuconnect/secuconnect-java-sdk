package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.CreatedField;
import com.secuconnect.client.model.ProductInstanceUID;
import com.secuconnect.client.model.ReceiptTypeValue;
import com.secuconnect.client.model.UpdatedField;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PrepaidReportsProductModel
 */
public class PrepaidReportsProductModel extends ProductInstanceUID {
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
  protected ProductInstanceUID merchant = null;

  @SerializedName("store")
  protected ProductInstanceUID store = null;

  @SerializedName("device")
  protected ProductInstanceUID device = null;

  @SerializedName("amount")
  protected Integer amount = null;

  @SerializedName("vtc_tid")
  protected Integer vtcTid = null;

  @SerializedName("report_from")
  protected String reportFrom = null;

  @SerializedName("report_to")
  protected String reportTo = null;

  @SerializedName("receipt")
  protected List<ReceiptTypeValue> receipt = null;

  @SerializedName("receipt_header")
  protected List<ReceiptTypeValue> receiptHeader = null;

  public PrepaidReportsProductModel l(Integer l) {
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

  public PrepaidReportsProductModel k(Integer k) {
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

  public PrepaidReportsProductModel ks(String ks) {
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

  public PrepaidReportsProductModel c(Integer c) {
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

  public PrepaidReportsProductModel s(Integer s) {
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

  public PrepaidReportsProductModel t(AggregationTimeResult t) {
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

  public PrepaidReportsProductModel created(String created) {
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

  public PrepaidReportsProductModel updated(String updated) {
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

  public PrepaidReportsProductModel merchant(ProductInstanceUID merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  public ProductInstanceUID getMerchant() {
    return merchant;
  }

  public void setMerchant(ProductInstanceUID merchant) {
    this.merchant = merchant;
  }

  public PrepaidReportsProductModel store(ProductInstanceUID store) {
    this.store = store;
    return this;
  }

   /**
   * Get store
   * @return store
  **/
  public ProductInstanceUID getStore() {
    return store;
  }

  public void setStore(ProductInstanceUID store) {
    this.store = store;
  }

  public PrepaidReportsProductModel device(ProductInstanceUID device) {
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  public ProductInstanceUID getDevice() {
    return device;
  }

  public void setDevice(ProductInstanceUID device) {
    this.device = device;
  }

  public PrepaidReportsProductModel amount(Integer amount) {
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

  public PrepaidReportsProductModel vtcTid(Integer vtcTid) {
    this.vtcTid = vtcTid;
    return this;
  }

   /**
   * Get vtcTid
   * @return vtcTid
  **/
  public Integer getVtcTid() {
    return vtcTid;
  }

  public void setVtcTid(Integer vtcTid) {
    this.vtcTid = vtcTid;
  }

  public PrepaidReportsProductModel reportFrom(String reportFrom) {
    this.reportFrom = reportFrom;
    return this;
  }

   /**
   * Report start date
   * @return reportFrom
  **/
  public String getReportFrom() {
    return reportFrom;
  }

  public void setReportFrom(String reportFrom) {
    this.reportFrom = reportFrom;
  }

  public PrepaidReportsProductModel reportTo(String reportTo) {
    this.reportTo = reportTo;
    return this;
  }

   /**
   * Report end date
   * @return reportTo
  **/
  public String getReportTo() {
    return reportTo;
  }

  public void setReportTo(String reportTo) {
    this.reportTo = reportTo;
  }

  public PrepaidReportsProductModel receipt(List<ReceiptTypeValue> receipt) {
    this.receipt = receipt;
    return this;
  }

  public PrepaidReportsProductModel addReceiptItem(ReceiptTypeValue receiptItem) {
    if (this.receipt == null) {
      this.receipt = new ArrayList<ReceiptTypeValue>();
    }
    this.receipt.add(receiptItem);
    return this;
  }

   /**
   * Receipt header
   * @return receipt
  **/
  public List<ReceiptTypeValue> getReceipt() {
    return receipt;
  }

  public void setReceipt(List<ReceiptTypeValue> receipt) {
    this.receipt = receipt;
  }

  public PrepaidReportsProductModel receiptHeader(List<ReceiptTypeValue> receiptHeader) {
    this.receiptHeader = receiptHeader;
    return this;
  }

  public PrepaidReportsProductModel addReceiptHeaderItem(ReceiptTypeValue receiptHeaderItem) {
    if (this.receiptHeader == null) {
      this.receiptHeader = new ArrayList<ReceiptTypeValue>();
    }
    this.receiptHeader.add(receiptHeaderItem);
    return this;
  }

   /**
   * Receipt
   * @return receiptHeader
  **/
  public List<ReceiptTypeValue> getReceiptHeader() {
    return receiptHeader;
  }

  public void setReceiptHeader(List<ReceiptTypeValue> receiptHeader) {
    this.receiptHeader = receiptHeader;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrepaidReportsProductModel prepaidReportsProductModel = (PrepaidReportsProductModel) o;
    return Objects.equals(this.l, prepaidReportsProductModel.l) &&
        Objects.equals(this.k, prepaidReportsProductModel.k) &&
        Objects.equals(this.ks, prepaidReportsProductModel.ks) &&
        Objects.equals(this.c, prepaidReportsProductModel.c) &&
        Objects.equals(this.s, prepaidReportsProductModel.s) &&
        Objects.equals(this.t, prepaidReportsProductModel.t) &&
        Objects.equals(this.created, prepaidReportsProductModel.created) &&
        Objects.equals(this.updated, prepaidReportsProductModel.updated) &&
        Objects.equals(this.merchant, prepaidReportsProductModel.merchant) &&
        Objects.equals(this.store, prepaidReportsProductModel.store) &&
        Objects.equals(this.device, prepaidReportsProductModel.device) &&
        Objects.equals(this.amount, prepaidReportsProductModel.amount) &&
        Objects.equals(this.vtcTid, prepaidReportsProductModel.vtcTid) &&
        Objects.equals(this.reportFrom, prepaidReportsProductModel.reportFrom) &&
        Objects.equals(this.reportTo, prepaidReportsProductModel.reportTo) &&
        Objects.equals(this.receipt, prepaidReportsProductModel.receipt) &&
        Objects.equals(this.receiptHeader, prepaidReportsProductModel.receiptHeader) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, created, updated, merchant, store, device, amount, vtcTid, reportFrom, reportTo, receipt, receiptHeader, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepaidReportsProductModel {\n");
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
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    vtcTid: ").append(toIndentedString(vtcTid)).append("\n");
    sb.append("    reportFrom: ").append(toIndentedString(reportFrom)).append("\n");
    sb.append("    reportTo: ").append(toIndentedString(reportTo)).append("\n");
    sb.append("    receipt: ").append(toIndentedString(receipt)).append("\n");
    sb.append("    receiptHeader: ").append(toIndentedString(receiptHeader)).append("\n");
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

