package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.LoyaltyCardgroupsProductModel;
import io.secuconnect.client.model.LoyaltyCardsProductModel;
import io.secuconnect.client.model.LoyaltyCustomersProductModel;
import io.secuconnect.client.model.LoyaltyMerchantcardsDTOPaymentContainer;
import io.secuconnect.client.model.ProductInstanceUID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;
import java.util.Objects;

/**
 * LoyaltyMerchantcardsProductModel
 */
public class LoyaltyMerchantcardsProductModel {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("card")
  private LoyaltyCardsProductModel card = null;

  @SerializedName("merchant")
  private ProductInstanceUID merchant = null;

  @SerializedName("created_for_merchant")
  private ProductInstanceUID createdForMerchant = null;

  @SerializedName("created_for_store")
  private ProductInstanceUID createdForStore = null;

  @SerializedName("customer")
  private LoyaltyCustomersProductModel customer = null;

  @SerializedName("cardgroup")
  private LoyaltyCardgroupsProductModel cardgroup = null;

  @SerializedName("payment_container")
  private LoyaltyMerchantcardsDTOPaymentContainer paymentContainer = null;

  @SerializedName("balance")
  private Integer balance = null;

  @SerializedName("points")
  private Integer points = null;

  @SerializedName("bonus_balance")
  private Integer bonusBalance = null;

  @SerializedName("cash_balance")
  private Integer cashBalance = null;

  @SerializedName("stock_status")
  private String stockStatus = null;

  @SerializedName("lock_status")
  private String lockStatus = null;

  @SerializedName("last_usage")
  private DateTime lastUsage = null;

  @SerializedName("last_charge")
  private DateTime lastCharge = null;

  @SerializedName("is_base_card")
  private Boolean isBaseCard = null;

  @SerializedName("passcode")
  private Integer passcode = null;

  public LoyaltyMerchantcardsProductModel object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of loyalty merchant card
   * @return object
  **/
  @ApiModelProperty(value = "Object of loyalty merchant card")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public LoyaltyMerchantcardsProductModel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of loyalty merchant card
   * @return id
  **/
  @ApiModelProperty(value = "Id of loyalty merchant card")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LoyaltyMerchantcardsProductModel card(LoyaltyCardsProductModel card) {
    this.card = card;
    return this;
  }

   /**
   * Id of loyalty store group
   * @return card
  **/
  @ApiModelProperty(value = "Id of loyalty store group")
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
   * Current merchant id
   * @return merchant
  **/
  @ApiModelProperty(value = "Current merchant id")
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
   * Merchant id, that loyalty merchant card object was created for
   * @return createdForMerchant
  **/
  @ApiModelProperty(value = "Merchant id, that loyalty merchant card object was created for")
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
   * Store id, that loyalty merchant card object was created for
   * @return createdForStore
  **/
  @ApiModelProperty(value = "Store id, that loyalty merchant card object was created for")
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
   * Loyalty merchant card customer
   * @return customer
  **/
  @ApiModelProperty(value = "Loyalty merchant card customer")
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
   * Loyalty merchant card card group
   * @return cardgroup
  **/
  @ApiModelProperty(value = "Loyalty merchant card card group")
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
   * Loyalty merchant card payment container
   * @return paymentContainer
  **/
  @ApiModelProperty(value = "Loyalty merchant card payment container")
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
   * Loyalty merchant card balance
   * @return balance
  **/
  @ApiModelProperty(value = "Loyalty merchant card balance")
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
   * Loyalty merchant card points
   * @return points
  **/
  @ApiModelProperty(value = "Loyalty merchant card points")
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
   * Loyalty merchant card bonus balance
   * @return bonusBalance
  **/
  @ApiModelProperty(value = "Loyalty merchant card bonus balance")
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
   * Loyalty merchant card cash balance
   * @return cashBalance
  **/
  @ApiModelProperty(value = "Loyalty merchant card cash balance")
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
   * Loyalty merchant card stock status
   * @return stockStatus
  **/
  @ApiModelProperty(value = "Loyalty merchant card stock status")
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
   * Loyalty merchant card lock status
   * @return lockStatus
  **/
  @ApiModelProperty(value = "Loyalty merchant card lock status")
  public String getLockStatus() {
    return lockStatus;
  }

  public void setLockStatus(String lockStatus) {
    this.lockStatus = lockStatus;
  }

  public LoyaltyMerchantcardsProductModel lastUsage(DateTime lastUsage) {
    this.lastUsage = lastUsage;
    return this;
  }

   /**
   * Loyalty merchant card last usage
   * @return lastUsage
  **/
  @ApiModelProperty(value = "Loyalty merchant card last usage")
  public DateTime getLastUsage() {
    return lastUsage;
  }

  public void setLastUsage(DateTime lastUsage) {
    this.lastUsage = lastUsage;
  }

  public LoyaltyMerchantcardsProductModel lastCharge(DateTime lastCharge) {
    this.lastCharge = lastCharge;
    return this;
  }

   /**
   * Loyalty merchant card last charge
   * @return lastCharge
  **/
  @ApiModelProperty(value = "Loyalty merchant card last charge")
  public DateTime getLastCharge() {
    return lastCharge;
  }

  public void setLastCharge(DateTime lastCharge) {
    this.lastCharge = lastCharge;
  }

  public LoyaltyMerchantcardsProductModel isBaseCard(Boolean isBaseCard) {
    this.isBaseCard = isBaseCard;
    return this;
  }

   /**
   * Information whether loyalty merchant card is base card
   * @return isBaseCard
  **/
  @ApiModelProperty(value = "Information whether loyalty merchant card is base card")
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
   * Loyalty merchant card passcode
   * @return passcode
  **/
  @ApiModelProperty(value = "Loyalty merchant card passcode")
  public Integer getPasscode() {
    return passcode;
  }

  public void setPasscode(Integer passcode) {
    this.passcode = passcode;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyMerchantcardsProductModel loyaltyMerchantcardsProductModel = (LoyaltyMerchantcardsProductModel) o;
    return Objects.equals(this.object, loyaltyMerchantcardsProductModel.object) &&
        Objects.equals(this.id, loyaltyMerchantcardsProductModel.id) &&
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
        Objects.equals(this.passcode, loyaltyMerchantcardsProductModel.passcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, card, merchant, createdForMerchant, createdForStore, customer, cardgroup, paymentContainer, balance, points, bonusBalance, cashBalance, stockStatus, lockStatus, lastUsage, lastCharge, isBaseCard, passcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsProductModel {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

