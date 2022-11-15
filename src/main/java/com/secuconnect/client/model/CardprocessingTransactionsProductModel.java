package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.CreatedField;
import com.secuconnect.client.model.GeneralMerchantsProductModel;
import com.secuconnect.client.model.GeneralStoresProductModel;
import com.secuconnect.client.model.ParentObj;
import com.secuconnect.client.model.UpdatedField;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CardprocessingTransactionsProductModel
 */
public class CardprocessingTransactionsProductModel extends BaseProductModel {
  @SerializedName("created")
  private String created = null;

  @SerializedName("updated")
  private String updated = null;

  @SerializedName("merchant")
  private GeneralMerchantsProductModel merchant = null;

  @SerializedName("related_transactions")
  private List<ParentObj> relatedTransactions = null;

  @SerializedName("store")
  private GeneralStoresProductModel store = null;

  @SerializedName("store_name")
  private String storeName = null;

  @SerializedName("trans_id")
  private Integer transId = null;

  @SerializedName("tid")
  private String tid = null;

  @SerializedName("end_of_day_date")
  private String endOfDayDate = null;

  @SerializedName("end_of_day_id")
  private String endOfDayId = null;

  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("trace")
  private Integer trace = null;

  @SerializedName("receipt_number")
  private String receiptNumber = null;

  @SerializedName("product")
  private String product = null;

  @SerializedName("ref_report_id")
  private Integer refReportId = null;

  @SerializedName("ref_report_type")
  private Integer refReportType = null;

  public CardprocessingTransactionsProductModel created(String created) {
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

  public CardprocessingTransactionsProductModel updated(String updated) {
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

  public CardprocessingTransactionsProductModel merchant(GeneralMerchantsProductModel merchant) {
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

  public CardprocessingTransactionsProductModel relatedTransactions(List<ParentObj> relatedTransactions) {
    this.relatedTransactions = relatedTransactions;
    return this;
  }

  public CardprocessingTransactionsProductModel addRelatedTransactionsItem(ParentObj relatedTransactionsItem) {
    if (this.relatedTransactions == null) {
      this.relatedTransactions = new ArrayList<>();
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

  public CardprocessingTransactionsProductModel store(GeneralStoresProductModel store) {
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

  public CardprocessingTransactionsProductModel storeName(String storeName) {
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

  public CardprocessingTransactionsProductModel transId(Integer transId) {
    this.transId = transId;
    return this;
  }

   /**
   * Transaction Number
   * @return transId
  **/
  public Integer getTransId() {
    return transId;
  }

  public void setTransId(Integer transId) {
    this.transId = transId;
  }

  public CardprocessingTransactionsProductModel tid(String tid) {
    this.tid = tid;
    return this;
  }

   /**
   * TID
   * @return tid
  **/
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public CardprocessingTransactionsProductModel endOfDayDate(String endOfDayDate) {
    this.endOfDayDate = endOfDayDate;
    return this;
  }

   /**
   * Get endOfDayDate
   * @return endOfDayDate
  **/
  public String getEndOfDayDate() {
    return endOfDayDate;
  }

  public void setEndOfDayDate(String endOfDayDate) {
    this.endOfDayDate = endOfDayDate;
  }

  public CardprocessingTransactionsProductModel endOfDayId(String endOfDayId) {
    this.endOfDayId = endOfDayId;
    return this;
  }

   /**
   * End of day ID
   * @return endOfDayId
  **/
  public String getEndOfDayId() {
    return endOfDayId;
  }

  public void setEndOfDayId(String endOfDayId) {
    this.endOfDayId = endOfDayId;
  }

  public CardprocessingTransactionsProductModel amount(Integer amount) {
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

  public CardprocessingTransactionsProductModel trace(Integer trace) {
    this.trace = trace;
    return this;
  }

   /**
   * Trace
   * @return trace
  **/
  public Integer getTrace() {
    return trace;
  }

  public void setTrace(Integer trace) {
    this.trace = trace;
  }

  public CardprocessingTransactionsProductModel receiptNumber(String receiptNumber) {
    this.receiptNumber = receiptNumber;
    return this;
  }

   /**
   * Receipt number
   * @return receiptNumber
  **/
  public String getReceiptNumber() {
    return receiptNumber;
  }

  public void setReceiptNumber(String receiptNumber) {
    this.receiptNumber = receiptNumber;
  }

  public CardprocessingTransactionsProductModel product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Product
   * @return product
  **/
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public CardprocessingTransactionsProductModel refReportId(Integer refReportId) {
    this.refReportId = refReportId;
    return this;
  }

   /**
   * Report ID
   * @return refReportId
  **/
  public Integer getRefReportId() {
    return refReportId;
  }

  public void setRefReportId(Integer refReportId) {
    this.refReportId = refReportId;
  }

  public CardprocessingTransactionsProductModel refReportType(Integer refReportType) {
    this.refReportType = refReportType;
    return this;
  }

   /**
   * Report Type
   * @return refReportType
  **/
  public Integer getRefReportType() {
    return refReportType;
  }

  public void setRefReportType(Integer refReportType) {
    this.refReportType = refReportType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardprocessingTransactionsProductModel cardprocessingTransactionsProductModel = (CardprocessingTransactionsProductModel) o;
    return Objects.equals(this.created, cardprocessingTransactionsProductModel.created) &&
        Objects.equals(this.updated, cardprocessingTransactionsProductModel.updated) &&
        Objects.equals(this.merchant, cardprocessingTransactionsProductModel.merchant) &&
        Objects.equals(this.relatedTransactions, cardprocessingTransactionsProductModel.relatedTransactions) &&
        Objects.equals(this.store, cardprocessingTransactionsProductModel.store) &&
        Objects.equals(this.storeName, cardprocessingTransactionsProductModel.storeName) &&
        Objects.equals(this.transId, cardprocessingTransactionsProductModel.transId) &&
        Objects.equals(this.tid, cardprocessingTransactionsProductModel.tid) &&
        Objects.equals(this.endOfDayDate, cardprocessingTransactionsProductModel.endOfDayDate) &&
        Objects.equals(this.endOfDayId, cardprocessingTransactionsProductModel.endOfDayId) &&
        Objects.equals(this.amount, cardprocessingTransactionsProductModel.amount) &&
        Objects.equals(this.trace, cardprocessingTransactionsProductModel.trace) &&
        Objects.equals(this.receiptNumber, cardprocessingTransactionsProductModel.receiptNumber) &&
        Objects.equals(this.product, cardprocessingTransactionsProductModel.product) &&
        Objects.equals(this.refReportId, cardprocessingTransactionsProductModel.refReportId) &&
        Objects.equals(this.refReportType, cardprocessingTransactionsProductModel.refReportType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, updated, merchant, relatedTransactions, store, storeName, transId, tid, endOfDayDate, endOfDayId, amount, trace, receiptNumber, product, refReportId, refReportType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardprocessingTransactionsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    relatedTransactions: ").append(toIndentedString(relatedTransactions)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    endOfDayDate: ").append(toIndentedString(endOfDayDate)).append("\n");
    sb.append("    endOfDayId: ").append(toIndentedString(endOfDayId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    trace: ").append(toIndentedString(trace)).append("\n");
    sb.append("    receiptNumber: ").append(toIndentedString(receiptNumber)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    refReportId: ").append(toIndentedString(refReportId)).append("\n");
    sb.append("    refReportType: ").append(toIndentedString(refReportType)).append("\n");
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

