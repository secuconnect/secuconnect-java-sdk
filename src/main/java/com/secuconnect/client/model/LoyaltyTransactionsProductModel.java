package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.CreatedField;
import com.secuconnect.client.model.GeneralMerchantsProductModel;
import com.secuconnect.client.model.GeneralStoresProductModel;
import com.secuconnect.client.model.LoyaltyCardgroupsProductModel;
import com.secuconnect.client.model.LoyaltyCardsProductModel;
import com.secuconnect.client.model.LoyaltyMerchantcardsProductModel;
import com.secuconnect.client.model.LoyaltyTransactionsProductModelClearingInformation;
import com.secuconnect.client.model.LoyaltyTransactionsRelatedTransactions;
import com.secuconnect.client.model.ReceiptTypeValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * LoyaltyTransactionsProductModel
 */
public class LoyaltyTransactionsProductModel extends BaseProductModel {
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

  @SerializedName("merchant")
  protected GeneralMerchantsProductModel merchant = null;

  @SerializedName("cardgroup")
  protected LoyaltyCardgroupsProductModel cardgroup = null;

  @SerializedName("store")
  protected GeneralStoresProductModel store = null;

  @SerializedName("merchantcard")
  protected LoyaltyMerchantcardsProductModel merchantcard = null;

  @SerializedName("card")
  protected LoyaltyCardsProductModel card = null;

  @SerializedName("parents")
  protected List<LoyaltyTransactionsRelatedTransactions> parents = null;

  @SerializedName("children")
  protected List<LoyaltyTransactionsRelatedTransactions> children = null;

  @SerializedName("cleared")
  protected Boolean cleared = null;

  @SerializedName("clearing_information")
  protected List<LoyaltyTransactionsProductModelClearingInformation> clearingInformation = null;

  @SerializedName("trans_id")
  protected Integer transId = null;

  @SerializedName("tid")
  protected String tid = null;

  @SerializedName("status")
  protected String status = null;

  @SerializedName("amount")
  protected Integer amount = null;

  @SerializedName("currency")
  protected String currency = null;

  @SerializedName("balance")
  protected Integer balance = null;

  @SerializedName("description")
  protected String description = null;

  @SerializedName("purpose")
  protected String purpose = null;

  @SerializedName("additional_data")
  protected Object additionalData = null;

  @SerializedName("last_change")
  protected String lastChange = null;

  @SerializedName("receipt")
  protected List<ReceiptTypeValue> receipt = null;

  @SerializedName("is_cancelling")
  protected Integer isCancelling = null;

  public LoyaltyTransactionsProductModel l(Integer l) {
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

  public LoyaltyTransactionsProductModel k(Integer k) {
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

  public LoyaltyTransactionsProductModel ks(String ks) {
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

  public LoyaltyTransactionsProductModel c(Integer c) {
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

  public LoyaltyTransactionsProductModel s(Integer s) {
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

  public LoyaltyTransactionsProductModel t(AggregationTimeResult t) {
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

  public LoyaltyTransactionsProductModel created(String created) {
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

  public LoyaltyTransactionsProductModel merchant(GeneralMerchantsProductModel merchant) {
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

  public LoyaltyTransactionsProductModel cardgroup(LoyaltyCardgroupsProductModel cardgroup) {
    this.cardgroup = cardgroup;
    return this;
  }

   /**
   * Get cardgroup
   * @return cardgroup
  **/
  public LoyaltyCardgroupsProductModel getCardgroup() {
    return cardgroup;
  }

  public void setCardgroup(LoyaltyCardgroupsProductModel cardgroup) {
    this.cardgroup = cardgroup;
  }

  public LoyaltyTransactionsProductModel store(GeneralStoresProductModel store) {
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

  public LoyaltyTransactionsProductModel merchantcard(LoyaltyMerchantcardsProductModel merchantcard) {
    this.merchantcard = merchantcard;
    return this;
  }

   /**
   * Get merchantcard
   * @return merchantcard
  **/
  public LoyaltyMerchantcardsProductModel getMerchantcard() {
    return merchantcard;
  }

  public void setMerchantcard(LoyaltyMerchantcardsProductModel merchantcard) {
    this.merchantcard = merchantcard;
  }

  public LoyaltyTransactionsProductModel card(LoyaltyCardsProductModel card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  public LoyaltyCardsProductModel getCard() {
    return card;
  }

  public void setCard(LoyaltyCardsProductModel card) {
    this.card = card;
  }

  public LoyaltyTransactionsProductModel parents(List<LoyaltyTransactionsRelatedTransactions> parents) {
    this.parents = parents;
    return this;
  }

  public LoyaltyTransactionsProductModel addParentsItem(LoyaltyTransactionsRelatedTransactions parentsItem) {
    if (this.parents == null) {
      this.parents = new ArrayList<LoyaltyTransactionsRelatedTransactions>();
    }
    this.parents.add(parentsItem);
    return this;
  }

   /**
   * Get parents
   * @return parents
  **/
  public List<LoyaltyTransactionsRelatedTransactions> getParents() {
    return parents;
  }

  public void setParents(List<LoyaltyTransactionsRelatedTransactions> parents) {
    this.parents = parents;
  }

  public LoyaltyTransactionsProductModel children(List<LoyaltyTransactionsRelatedTransactions> children) {
    this.children = children;
    return this;
  }

  public LoyaltyTransactionsProductModel addChildrenItem(LoyaltyTransactionsRelatedTransactions childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<LoyaltyTransactionsRelatedTransactions>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  public List<LoyaltyTransactionsRelatedTransactions> getChildren() {
    return children;
  }

  public void setChildren(List<LoyaltyTransactionsRelatedTransactions> children) {
    this.children = children;
  }

  public LoyaltyTransactionsProductModel cleared(Boolean cleared) {
    this.cleared = cleared;
    return this;
  }

   /**
   * Boolean if Transaction is cleared or not
   * @return cleared
  **/
  public Boolean getCleared() {
    return cleared;
  }

  public void setCleared(Boolean cleared) {
    this.cleared = cleared;
  }

  public LoyaltyTransactionsProductModel clearingInformation(List<LoyaltyTransactionsProductModelClearingInformation> clearingInformation) {
    this.clearingInformation = clearingInformation;
    return this;
  }

  public LoyaltyTransactionsProductModel addClearingInformationItem(LoyaltyTransactionsProductModelClearingInformation clearingInformationItem) {
    if (this.clearingInformation == null) {
      this.clearingInformation = new ArrayList<LoyaltyTransactionsProductModelClearingInformation>();
    }
    this.clearingInformation.add(clearingInformationItem);
    return this;
  }

   /**
   * Clearing Information
   * @return clearingInformation
  **/
  public List<LoyaltyTransactionsProductModelClearingInformation> getClearingInformation() {
    return clearingInformation;
  }

  public void setClearingInformation(List<LoyaltyTransactionsProductModelClearingInformation> clearingInformation) {
    this.clearingInformation = clearingInformation;
  }

  public LoyaltyTransactionsProductModel transId(Integer transId) {
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

  public LoyaltyTransactionsProductModel tid(String tid) {
    this.tid = tid;
    return this;
  }

   /**
   * Terminal ID of the Smart Device that processed this transaction
   * @return tid
  **/
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public LoyaltyTransactionsProductModel status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the Loyalty Transaction
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public LoyaltyTransactionsProductModel amount(Integer amount) {
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

  public LoyaltyTransactionsProductModel currency(String currency) {
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

  public LoyaltyTransactionsProductModel balance(Integer balance) {
    this.balance = balance;
    return this;
  }

   /**
   * New card balance of the Merchant Card after this transaction
   * @return balance
  **/
  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  public LoyaltyTransactionsProductModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Loyalty Transaction type, e. g. &#x60;\&quot;Aufladung\&quot;&#x60;
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LoyaltyTransactionsProductModel purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * The purpose of the transaction.
   * @return purpose
  **/
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public LoyaltyTransactionsProductModel additionalData(Object additionalData) {
    this.additionalData = additionalData;
    return this;
  }

   /**
   * Custom additional data
   * @return additionalData
  **/
  public Object getAdditionalData() {
    return additionalData;
  }

  public void setAdditionalData(Object additionalData) {
    this.additionalData = additionalData;
  }

  public LoyaltyTransactionsProductModel lastChange(String lastChange) {
    this.lastChange = lastChange;
    return this;
  }

   /**
   * Last change of this transaction (most likely a status change)
   * @return lastChange
  **/
  public String getLastChange() {
    return lastChange;
  }

  public void setLastChange(String lastChange) {
    this.lastChange = lastChange;
  }

  public LoyaltyTransactionsProductModel receipt(List<ReceiptTypeValue> receipt) {
    this.receipt = receipt;
    return this;
  }

  public LoyaltyTransactionsProductModel addReceiptItem(ReceiptTypeValue receiptItem) {
    if (this.receipt == null) {
      this.receipt = new ArrayList<ReceiptTypeValue>();
    }
    this.receipt.add(receiptItem);
    return this;
  }

   /**
   * Receipt
   * @return receipt
  **/
  public List<ReceiptTypeValue> getReceipt() {
    return receipt;
  }

  public void setReceipt(List<ReceiptTypeValue> receipt) {
    this.receipt = receipt;
  }

  public LoyaltyTransactionsProductModel isCancelling(Integer isCancelling) {
    this.isCancelling = isCancelling;
    return this;
  }

   /**
   * Indicates when the transaction is just about to be cancelled:  - &#x60;0&#x60; &#x3D; no - &#x60;1&#x60; &#x3D; full cancellation - &#x60;3&#x60; &#x3D; partial cancellation
   * @return isCancelling
  **/
  public Integer getIsCancelling() {
    return isCancelling;
  }

  public void setIsCancelling(Integer isCancelling) {
    this.isCancelling = isCancelling;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyTransactionsProductModel loyaltyTransactionsProductModel = (LoyaltyTransactionsProductModel) o;
    return Objects.equals(this.l, loyaltyTransactionsProductModel.l) &&
        Objects.equals(this.k, loyaltyTransactionsProductModel.k) &&
        Objects.equals(this.ks, loyaltyTransactionsProductModel.ks) &&
        Objects.equals(this.c, loyaltyTransactionsProductModel.c) &&
        Objects.equals(this.s, loyaltyTransactionsProductModel.s) &&
        Objects.equals(this.t, loyaltyTransactionsProductModel.t) &&
        Objects.equals(this.created, loyaltyTransactionsProductModel.created) &&
        Objects.equals(this.merchant, loyaltyTransactionsProductModel.merchant) &&
        Objects.equals(this.cardgroup, loyaltyTransactionsProductModel.cardgroup) &&
        Objects.equals(this.store, loyaltyTransactionsProductModel.store) &&
        Objects.equals(this.merchantcard, loyaltyTransactionsProductModel.merchantcard) &&
        Objects.equals(this.card, loyaltyTransactionsProductModel.card) &&
        Objects.equals(this.parents, loyaltyTransactionsProductModel.parents) &&
        Objects.equals(this.children, loyaltyTransactionsProductModel.children) &&
        Objects.equals(this.cleared, loyaltyTransactionsProductModel.cleared) &&
        Objects.equals(this.clearingInformation, loyaltyTransactionsProductModel.clearingInformation) &&
        Objects.equals(this.transId, loyaltyTransactionsProductModel.transId) &&
        Objects.equals(this.tid, loyaltyTransactionsProductModel.tid) &&
        Objects.equals(this.status, loyaltyTransactionsProductModel.status) &&
        Objects.equals(this.amount, loyaltyTransactionsProductModel.amount) &&
        Objects.equals(this.currency, loyaltyTransactionsProductModel.currency) &&
        Objects.equals(this.balance, loyaltyTransactionsProductModel.balance) &&
        Objects.equals(this.description, loyaltyTransactionsProductModel.description) &&
        Objects.equals(this.purpose, loyaltyTransactionsProductModel.purpose) &&
        Objects.equals(this.additionalData, loyaltyTransactionsProductModel.additionalData) &&
        Objects.equals(this.lastChange, loyaltyTransactionsProductModel.lastChange) &&
        Objects.equals(this.receipt, loyaltyTransactionsProductModel.receipt) &&
        Objects.equals(this.isCancelling, loyaltyTransactionsProductModel.isCancelling) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, created, merchant, cardgroup, store, merchantcard, card, parents, children, cleared, clearingInformation, transId, tid, status, amount, currency, balance, description, purpose, additionalData, lastChange, receipt, isCancelling, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyTransactionsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    l: ").append(toIndentedString(l)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    ks: ").append(toIndentedString(ks)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    cardgroup: ").append(toIndentedString(cardgroup)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    merchantcard: ").append(toIndentedString(merchantcard)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    parents: ").append(toIndentedString(parents)).append("\n");
    sb.append("    children: ").append(toIndentedString(children)).append("\n");
    sb.append("    cleared: ").append(toIndentedString(cleared)).append("\n");
    sb.append("    clearingInformation: ").append(toIndentedString(clearingInformation)).append("\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    lastChange: ").append(toIndentedString(lastChange)).append("\n");
    sb.append("    receipt: ").append(toIndentedString(receipt)).append("\n");
    sb.append("    isCancelling: ").append(toIndentedString(isCancelling)).append("\n");
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

