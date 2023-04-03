package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.CreatedField;
import com.secuconnect.client.model.LoyaltyTransactionsDTOCard;
import com.secuconnect.client.model.LoyaltyTransactionsDTOCardgroup;
import com.secuconnect.client.model.LoyaltyTransactionsDTOMerchant;
import com.secuconnect.client.model.LoyaltyTransactionsDTOMerchantcard;
import com.secuconnect.client.model.LoyaltyTransactionsDTORelatedTransactions;
import com.secuconnect.client.model.LoyaltyTransactionsDTOStore;
import com.secuconnect.client.model.ReceiptTypeValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * LoyaltyTransactionsProductModel
 */
public class LoyaltyTransactionsProductModel extends BaseProductModel {
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

  @SerializedName("created")
  private String created = null;

  @SerializedName("merchant")
  private LoyaltyTransactionsDTOMerchant merchant = null;

  @SerializedName("cardgroup")
  private LoyaltyTransactionsDTOCardgroup cardgroup = null;

  @SerializedName("store")
  private LoyaltyTransactionsDTOStore store = null;

  @SerializedName("merchantcard")
  private LoyaltyTransactionsDTOMerchantcard merchantcard = null;

  @SerializedName("card")
  private LoyaltyTransactionsDTOCard card = null;

  @SerializedName("parents")
  private List<LoyaltyTransactionsDTORelatedTransactions> parents = null;

  @SerializedName("children")
  private List<LoyaltyTransactionsDTORelatedTransactions> children = null;

  @SerializedName("tid")
  private String tid = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("balance")
  private Integer balance = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("last_change")
  private String lastChange = null;

  @SerializedName("receipt")
  private List<ReceiptTypeValue> receipt = null;

  @SerializedName("is_cancelling")
  private Integer isCancelling = null;

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

  public LoyaltyTransactionsProductModel merchant(LoyaltyTransactionsDTOMerchant merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  public LoyaltyTransactionsDTOMerchant getMerchant() {
    return merchant;
  }

  public void setMerchant(LoyaltyTransactionsDTOMerchant merchant) {
    this.merchant = merchant;
  }

  public LoyaltyTransactionsProductModel cardgroup(LoyaltyTransactionsDTOCardgroup cardgroup) {
    this.cardgroup = cardgroup;
    return this;
  }

   /**
   * Get cardgroup
   * @return cardgroup
  **/
  public LoyaltyTransactionsDTOCardgroup getCardgroup() {
    return cardgroup;
  }

  public void setCardgroup(LoyaltyTransactionsDTOCardgroup cardgroup) {
    this.cardgroup = cardgroup;
  }

  public LoyaltyTransactionsProductModel store(LoyaltyTransactionsDTOStore store) {
    this.store = store;
    return this;
  }

   /**
   * Get store
   * @return store
  **/
  public LoyaltyTransactionsDTOStore getStore() {
    return store;
  }

  public void setStore(LoyaltyTransactionsDTOStore store) {
    this.store = store;
  }

  public LoyaltyTransactionsProductModel merchantcard(LoyaltyTransactionsDTOMerchantcard merchantcard) {
    this.merchantcard = merchantcard;
    return this;
  }

   /**
   * Get merchantcard
   * @return merchantcard
  **/
  public LoyaltyTransactionsDTOMerchantcard getMerchantcard() {
    return merchantcard;
  }

  public void setMerchantcard(LoyaltyTransactionsDTOMerchantcard merchantcard) {
    this.merchantcard = merchantcard;
  }

  public LoyaltyTransactionsProductModel card(LoyaltyTransactionsDTOCard card) {
    this.card = card;
    return this;
  }

   /**
   * Get card
   * @return card
  **/
  public LoyaltyTransactionsDTOCard getCard() {
    return card;
  }

  public void setCard(LoyaltyTransactionsDTOCard card) {
    this.card = card;
  }

  public LoyaltyTransactionsProductModel parents(List<LoyaltyTransactionsDTORelatedTransactions> parents) {
    this.parents = parents;
    return this;
  }

  public LoyaltyTransactionsProductModel addParentsItem(LoyaltyTransactionsDTORelatedTransactions parentsItem) {
    if (this.parents == null) {
      this.parents = new ArrayList<LoyaltyTransactionsDTORelatedTransactions>();
    }
    this.parents.add(parentsItem);
    return this;
  }

   /**
   * Get parents
   * @return parents
  **/
  public List<LoyaltyTransactionsDTORelatedTransactions> getParents() {
    return parents;
  }

  public void setParents(List<LoyaltyTransactionsDTORelatedTransactions> parents) {
    this.parents = parents;
  }

  public LoyaltyTransactionsProductModel children(List<LoyaltyTransactionsDTORelatedTransactions> children) {
    this.children = children;
    return this;
  }

  public LoyaltyTransactionsProductModel addChildrenItem(LoyaltyTransactionsDTORelatedTransactions childrenItem) {
    if (this.children == null) {
      this.children = new ArrayList<LoyaltyTransactionsDTORelatedTransactions>();
    }
    this.children.add(childrenItem);
    return this;
  }

   /**
   * Get children
   * @return children
  **/
  public List<LoyaltyTransactionsDTORelatedTransactions> getChildren() {
    return children;
  }

  public void setChildren(List<LoyaltyTransactionsDTORelatedTransactions> children) {
    this.children = children;
  }

  public LoyaltyTransactionsProductModel tid(String tid) {
    this.tid = tid;
    return this;
  }

   /**
   * The TID of the processed Smart Device
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
   * The status text of the Loyalty Transaction
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
   * The balance of the merchantcard after this Loyalty Transaction
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
   * Loyalty Transaction type
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public LoyaltyTransactionsProductModel lastChange(String lastChange) {
    this.lastChange = lastChange;
    return this;
  }

   /**
   * Last change oif this transaction, most like a status change
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
   * Indicator for a cancelling transaction (1 &#x3D; full-cancel, 3 &#x3D; partial-cancel)
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
        Objects.equals(this.tid, loyaltyTransactionsProductModel.tid) &&
        Objects.equals(this.status, loyaltyTransactionsProductModel.status) &&
        Objects.equals(this.amount, loyaltyTransactionsProductModel.amount) &&
        Objects.equals(this.currency, loyaltyTransactionsProductModel.currency) &&
        Objects.equals(this.balance, loyaltyTransactionsProductModel.balance) &&
        Objects.equals(this.description, loyaltyTransactionsProductModel.description) &&
        Objects.equals(this.lastChange, loyaltyTransactionsProductModel.lastChange) &&
        Objects.equals(this.receipt, loyaltyTransactionsProductModel.receipt) &&
        Objects.equals(this.isCancelling, loyaltyTransactionsProductModel.isCancelling) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, created, merchant, cardgroup, store, merchantcard, card, parents, children, tid, status, amount, currency, balance, description, lastChange, receipt, isCancelling, super.hashCode());
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
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

