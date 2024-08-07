package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.LoyaltyCardgroupsProductModel;
import com.secuconnect.client.model.LoyaltyCardsProductModel;
import com.secuconnect.client.model.LoyaltyCustomersProductModel;
import com.secuconnect.client.model.LoyaltyMerchantcardsDTOPaymentContainer;
import com.secuconnect.client.model.ProductInstanceUID;
import java.util.Objects;

/**
 * Merchant Card
 */
public class LoyaltyMerchantcardsProductModel extends BaseProductModel {
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

  @SerializedName("card")
  protected LoyaltyCardsProductModel card = null;

  @SerializedName("merchant")
  protected ProductInstanceUID merchant = null;

  @SerializedName("created_for_merchant")
  protected ProductInstanceUID createdForMerchant = null;

  @SerializedName("created_for_store")
  protected ProductInstanceUID createdForStore = null;

  @SerializedName("customer")
  protected LoyaltyCustomersProductModel customer = null;

  @SerializedName("cardgroup")
  protected LoyaltyCardgroupsProductModel cardgroup = null;

  @SerializedName("payment_container")
  protected LoyaltyMerchantcardsDTOPaymentContainer paymentContainer = null;

  @SerializedName("balance")
  protected Integer balance = null;

  @SerializedName("points")
  protected Integer points = null;

  @SerializedName("bonus_balance")
  protected Integer bonusBalance = null;

  @SerializedName("cash_balance")
  protected Integer cashBalance = null;

  @SerializedName("stock_status")
  protected String stockStatus = null;

  @SerializedName("lock_status")
  protected String lockStatus = null;

  @SerializedName("last_usage")
  protected String lastUsage = null;

  @SerializedName("last_charge")
  protected String lastCharge = null;

  @SerializedName("is_base_card")
  protected Boolean isBaseCard = null;

  @SerializedName("passcode")
  protected Integer passcode = null;

  @SerializedName("expiry_date")
  protected String expiryDate = null;

  @SerializedName("customer_assignment_date")
  protected String customerAssignmentDate = null;

  public LoyaltyMerchantcardsProductModel l(Integer l) {
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

  public LoyaltyMerchantcardsProductModel k(Integer k) {
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

  public LoyaltyMerchantcardsProductModel ks(String ks) {
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

  public LoyaltyMerchantcardsProductModel c(Integer c) {
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

  public LoyaltyMerchantcardsProductModel s(Integer s) {
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

  public LoyaltyMerchantcardsProductModel t(AggregationTimeResult t) {
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

  public LoyaltyMerchantcardsProductModel card(LoyaltyCardsProductModel card) {
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

  public LoyaltyMerchantcardsProductModel merchant(ProductInstanceUID merchant) {
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

  public LoyaltyMerchantcardsProductModel createdForMerchant(ProductInstanceUID createdForMerchant) {
    this.createdForMerchant = createdForMerchant;
    return this;
  }

   /**
   * Get createdForMerchant
   * @return createdForMerchant
  **/
  public ProductInstanceUID getCreatedForMerchant() {
    return createdForMerchant;
  }

  public void setCreatedForMerchant(ProductInstanceUID createdForMerchant) {
    this.createdForMerchant = createdForMerchant;
  }

  public LoyaltyMerchantcardsProductModel createdForStore(ProductInstanceUID createdForStore) {
    this.createdForStore = createdForStore;
    return this;
  }

   /**
   * Get createdForStore
   * @return createdForStore
  **/
  public ProductInstanceUID getCreatedForStore() {
    return createdForStore;
  }

  public void setCreatedForStore(ProductInstanceUID createdForStore) {
    this.createdForStore = createdForStore;
  }

  public LoyaltyMerchantcardsProductModel customer(LoyaltyCustomersProductModel customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  public LoyaltyCustomersProductModel getCustomer() {
    return customer;
  }

  public void setCustomer(LoyaltyCustomersProductModel customer) {
    this.customer = customer;
  }

  public LoyaltyMerchantcardsProductModel cardgroup(LoyaltyCardgroupsProductModel cardgroup) {
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

  public LoyaltyMerchantcardsProductModel paymentContainer(LoyaltyMerchantcardsDTOPaymentContainer paymentContainer) {
    this.paymentContainer = paymentContainer;
    return this;
  }

   /**
   * Get paymentContainer
   * @return paymentContainer
  **/
  public LoyaltyMerchantcardsDTOPaymentContainer getPaymentContainer() {
    return paymentContainer;
  }

  public void setPaymentContainer(LoyaltyMerchantcardsDTOPaymentContainer paymentContainer) {
    this.paymentContainer = paymentContainer;
  }

  public LoyaltyMerchantcardsProductModel balance(Integer balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Total money balance; in the smallest currency unit (e. g. Euro Cent)
   * @return balance
  **/
  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  public LoyaltyMerchantcardsProductModel points(Integer points) {
    this.points = points;
    return this;
  }

   /**
   * Points balance
   * @return points
  **/
  public Integer getPoints() {
    return points;
  }

  public void setPoints(Integer points) {
    this.points = points;
  }

  public LoyaltyMerchantcardsProductModel bonusBalance(Integer bonusBalance) {
    this.bonusBalance = bonusBalance;
    return this;
  }

   /**
   * Money balance collected as bonus for former transactions; in the smallest currency unit (e. g. Euro Cent)
   * @return bonusBalance
  **/
  public Integer getBonusBalance() {
    return bonusBalance;
  }

  public void setBonusBalance(Integer bonusBalance) {
    this.bonusBalance = bonusBalance;
  }

  public LoyaltyMerchantcardsProductModel cashBalance(Integer cashBalance) {
    this.cashBalance = cashBalance;
    return this;
  }

   /**
   * Money balance loaded with money; in the smallest currency unit (e. g. Euro Cent)
   * @return cashBalance
  **/
  public Integer getCashBalance() {
    return cashBalance;
  }

  public void setCashBalance(Integer cashBalance) {
    this.cashBalance = cashBalance;
  }

  public LoyaltyMerchantcardsProductModel stockStatus(String stockStatus) {
    this.stockStatus = stockStatus;
    return this;
  }

   /**
   * Stock status:  - &#x60;\&quot;active\&quot;&#x60; - &#x60;\&quot;inactive\&quot;&#x60; - &#x60;\&quot;stored\&quot;&#x60;
   * @return stockStatus
  **/
  public String getStockStatus() {
    return stockStatus;
  }

  public void setStockStatus(String stockStatus) {
    this.stockStatus = stockStatus;
  }

  public LoyaltyMerchantcardsProductModel lockStatus(String lockStatus) {
    this.lockStatus = lockStatus;
    return this;
  }

   /**
   * Lock status:  - &#x60;\&quot;locked\&quot;&#x60; - &#x60;\&quot;unlocked\&quot;&#x60;
   * @return lockStatus
  **/
  public String getLockStatus() {
    return lockStatus;
  }

  public void setLockStatus(String lockStatus) {
    this.lockStatus = lockStatus;
  }

  public LoyaltyMerchantcardsProductModel lastUsage(String lastUsage) {
    this.lastUsage = lastUsage;
    return this;
  }

   /**
   * Last used at (ISO 8601 date and time)
   * @return lastUsage
  **/
  public String getLastUsage() {
    return lastUsage;
  }

  public void setLastUsage(String lastUsage) {
    this.lastUsage = lastUsage;
  }

  public LoyaltyMerchantcardsProductModel lastCharge(String lastCharge) {
    this.lastCharge = lastCharge;
    return this;
  }

   /**
   * Last loaded at (ISO 8601 date and time)
   * @return lastCharge
  **/
  public String getLastCharge() {
    return lastCharge;
  }

  public void setLastCharge(String lastCharge) {
    this.lastCharge = lastCharge;
  }

  public LoyaltyMerchantcardsProductModel isBaseCard(Boolean isBaseCard) {
    this.isBaseCard = isBaseCard;
    return this;
  }

   /**
   * Whether the card is a base card (&#x60;true&#x60;) or not (&#x60;false&#x60;)
   * @return isBaseCard
  **/
  public Boolean getIsBaseCard() {
    return isBaseCard;
  }

  public void setIsBaseCard(Boolean isBaseCard) {
    this.isBaseCard = isBaseCard;
  }

  public LoyaltyMerchantcardsProductModel passcode(Integer passcode) {
    this.passcode = passcode;
    return this;
  }

   /**
   * Whether the card has a passcode set (&#x60;1&#x60;) or not (&#x60;0&#x60;)
   * @return passcode
  **/
  public Integer getPasscode() {
    return passcode;
  }

  public void setPasscode(Integer passcode) {
    this.passcode = passcode;
  }

  public LoyaltyMerchantcardsProductModel expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Get expiryDate
   * @return expiryDate
  **/
  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public LoyaltyMerchantcardsProductModel customerAssignmentDate(String customerAssignmentDate) {
    this.customerAssignmentDate = customerAssignmentDate;
    return this;
  }

   /**
   * Get customerAssignmentDate
   * @return customerAssignmentDate
  **/
  public String getCustomerAssignmentDate() {
    return customerAssignmentDate;
  }

  public void setCustomerAssignmentDate(String customerAssignmentDate) {
    this.customerAssignmentDate = customerAssignmentDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyMerchantcardsProductModel loyaltyMerchantcardsProductModel = (LoyaltyMerchantcardsProductModel) o;
    return Objects.equals(this.l, loyaltyMerchantcardsProductModel.l) &&
        Objects.equals(this.k, loyaltyMerchantcardsProductModel.k) &&
        Objects.equals(this.ks, loyaltyMerchantcardsProductModel.ks) &&
        Objects.equals(this.c, loyaltyMerchantcardsProductModel.c) &&
        Objects.equals(this.s, loyaltyMerchantcardsProductModel.s) &&
        Objects.equals(this.t, loyaltyMerchantcardsProductModel.t) &&
        Objects.equals(this.card, loyaltyMerchantcardsProductModel.card) &&
        Objects.equals(this.merchant, loyaltyMerchantcardsProductModel.merchant) &&
        Objects.equals(this.createdForMerchant, loyaltyMerchantcardsProductModel.createdForMerchant) &&
        Objects.equals(this.createdForStore, loyaltyMerchantcardsProductModel.createdForStore) &&
        Objects.equals(this.customer, loyaltyMerchantcardsProductModel.customer) &&
        Objects.equals(this.cardgroup, loyaltyMerchantcardsProductModel.cardgroup) &&
        Objects.equals(this.paymentContainer, loyaltyMerchantcardsProductModel.paymentContainer) &&
        Objects.equals(this.balance, loyaltyMerchantcardsProductModel.balance) &&
        Objects.equals(this.points, loyaltyMerchantcardsProductModel.points) &&
        Objects.equals(this.bonusBalance, loyaltyMerchantcardsProductModel.bonusBalance) &&
        Objects.equals(this.cashBalance, loyaltyMerchantcardsProductModel.cashBalance) &&
        Objects.equals(this.stockStatus, loyaltyMerchantcardsProductModel.stockStatus) &&
        Objects.equals(this.lockStatus, loyaltyMerchantcardsProductModel.lockStatus) &&
        Objects.equals(this.lastUsage, loyaltyMerchantcardsProductModel.lastUsage) &&
        Objects.equals(this.lastCharge, loyaltyMerchantcardsProductModel.lastCharge) &&
        Objects.equals(this.isBaseCard, loyaltyMerchantcardsProductModel.isBaseCard) &&
        Objects.equals(this.passcode, loyaltyMerchantcardsProductModel.passcode) &&
        Objects.equals(this.expiryDate, loyaltyMerchantcardsProductModel.expiryDate) &&
        Objects.equals(this.customerAssignmentDate, loyaltyMerchantcardsProductModel.customerAssignmentDate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, card, merchant, createdForMerchant, createdForStore, customer, cardgroup, paymentContainer, balance, points, bonusBalance, cashBalance, stockStatus, lockStatus, lastUsage, lastCharge, isBaseCard, passcode, expiryDate, customerAssignmentDate, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    l: ").append(toIndentedString(l)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    ks: ").append(toIndentedString(ks)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    createdForMerchant: ").append(toIndentedString(createdForMerchant)).append("\n");
    sb.append("    createdForStore: ").append(toIndentedString(createdForStore)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    cardgroup: ").append(toIndentedString(cardgroup)).append("\n");
    sb.append("    paymentContainer: ").append(toIndentedString(paymentContainer)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    bonusBalance: ").append(toIndentedString(bonusBalance)).append("\n");
    sb.append("    cashBalance: ").append(toIndentedString(cashBalance)).append("\n");
    sb.append("    stockStatus: ").append(toIndentedString(stockStatus)).append("\n");
    sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
    sb.append("    lastUsage: ").append(toIndentedString(lastUsage)).append("\n");
    sb.append("    lastCharge: ").append(toIndentedString(lastCharge)).append("\n");
    sb.append("    isBaseCard: ").append(toIndentedString(isBaseCard)).append("\n");
    sb.append("    passcode: ").append(toIndentedString(passcode)).append("\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    customerAssignmentDate: ").append(toIndentedString(customerAssignmentDate)).append("\n");
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

