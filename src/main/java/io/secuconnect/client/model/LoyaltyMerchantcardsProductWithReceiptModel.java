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
import io.secuconnect.client.model.LoyaltyMerchantcardsProductModel;
import io.secuconnect.client.model.ProductInstanceUID;
import io.secuconnect.client.model.ReceiptType;
import io.secuconnect.client.model.ReceiptTypeValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import java.util.Objects;

/**
 * LoyaltyMerchantcardsProductWithReceiptModel
 */
public class LoyaltyMerchantcardsProductWithReceiptModel {
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

  @SerializedName("receipt_header")
  private List<ReceiptType> receiptHeader = null;

  @SerializedName("receipt")
  private List<ReceiptTypeValue> receipt = null;

  public LoyaltyMerchantcardsProductWithReceiptModel object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of loyalty merchant card
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of loyalty merchant card
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel card(LoyaltyCardsProductModel card) {
    this.card = card;
    return this;
  }

   /**
   * Id of loyalty store group
   * @return card
  **/
  public LoyaltyCardsProductModel getCard() {
    return card;
  }

  public void setCard(LoyaltyCardsProductModel card) {
    this.card = card;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel merchant(ProductInstanceUID merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Current merchant id
   * @return merchant
  **/
  public ProductInstanceUID getMerchant() {
    return merchant;
  }

  public void setMerchant(ProductInstanceUID merchant) {
    this.merchant = merchant;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel createdForMerchant(ProductInstanceUID createdForMerchant) {
    this.createdForMerchant = createdForMerchant;
    return this;
  }

   /**
   * Merchant id, that loyalty merchant card object was created for
   * @return createdForMerchant
  **/
  public ProductInstanceUID getCreatedForMerchant() {
    return createdForMerchant;
  }

  public void setCreatedForMerchant(ProductInstanceUID createdForMerchant) {
    this.createdForMerchant = createdForMerchant;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel createdForStore(ProductInstanceUID createdForStore) {
    this.createdForStore = createdForStore;
    return this;
  }

   /**
   * Store id, that loyalty merchant card object was created for
   * @return createdForStore
  **/
  public ProductInstanceUID getCreatedForStore() {
    return createdForStore;
  }

  public void setCreatedForStore(ProductInstanceUID createdForStore) {
    this.createdForStore = createdForStore;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel customer(LoyaltyCustomersProductModel customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Loyalty merchant card customer
   * @return customer
  **/
  public LoyaltyCustomersProductModel getCustomer() {
    return customer;
  }

  public void setCustomer(LoyaltyCustomersProductModel customer) {
    this.customer = customer;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel cardgroup(LoyaltyCardgroupsProductModel cardgroup) {
    this.cardgroup = cardgroup;
    return this;
  }

   /**
   * Loyalty merchant card card group
   * @return cardgroup
  **/
  public LoyaltyCardgroupsProductModel getCardgroup() {
    return cardgroup;
  }

  public void setCardgroup(LoyaltyCardgroupsProductModel cardgroup) {
    this.cardgroup = cardgroup;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel paymentContainer(LoyaltyMerchantcardsDTOPaymentContainer paymentContainer) {
    this.paymentContainer = paymentContainer;
    return this;
  }

   /**
   * Loyalty merchant card payment container
   * @return paymentContainer
  **/
  public LoyaltyMerchantcardsDTOPaymentContainer getPaymentContainer() {
    return paymentContainer;
  }

  public void setPaymentContainer(LoyaltyMerchantcardsDTOPaymentContainer paymentContainer) {
    this.paymentContainer = paymentContainer;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel balance(Integer balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Loyalty merchant card balance
   * @return balance
  **/
  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel points(Integer points) {
    this.points = points;
    return this;
  }

   /**
   * Loyalty merchant card points
   * @return points
  **/
  public Integer getPoints() {
    return points;
  }

  public void setPoints(Integer points) {
    this.points = points;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel bonusBalance(Integer bonusBalance) {
    this.bonusBalance = bonusBalance;
    return this;
  }

   /**
   * Loyalty merchant card bonus balance
   * @return bonusBalance
  **/
  public Integer getBonusBalance() {
    return bonusBalance;
  }

  public void setBonusBalance(Integer bonusBalance) {
    this.bonusBalance = bonusBalance;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel cashBalance(Integer cashBalance) {
    this.cashBalance = cashBalance;
    return this;
  }

   /**
   * Loyalty merchant card cash balance
   * @return cashBalance
  **/
  public Integer getCashBalance() {
    return cashBalance;
  }

  public void setCashBalance(Integer cashBalance) {
    this.cashBalance = cashBalance;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel stockStatus(String stockStatus) {
    this.stockStatus = stockStatus;
    return this;
  }

   /**
   * Loyalty merchant card stock status
   * @return stockStatus
  **/
  public String getStockStatus() {
    return stockStatus;
  }

  public void setStockStatus(String stockStatus) {
    this.stockStatus = stockStatus;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel lockStatus(String lockStatus) {
    this.lockStatus = lockStatus;
    return this;
  }

   /**
   * Loyalty merchant card lock status
   * @return lockStatus
  **/
  public String getLockStatus() {
    return lockStatus;
  }

  public void setLockStatus(String lockStatus) {
    this.lockStatus = lockStatus;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel lastUsage(DateTime lastUsage) {
    this.lastUsage = lastUsage;
    return this;
  }

   /**
   * Loyalty merchant card last usage
   * @return lastUsage
  **/
  public DateTime getLastUsage() {
    return lastUsage;
  }

  public void setLastUsage(DateTime lastUsage) {
    this.lastUsage = lastUsage;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel lastCharge(DateTime lastCharge) {
    this.lastCharge = lastCharge;
    return this;
  }

   /**
   * Loyalty merchant card last charge
   * @return lastCharge
  **/
  public DateTime getLastCharge() {
    return lastCharge;
  }

  public void setLastCharge(DateTime lastCharge) {
    this.lastCharge = lastCharge;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel isBaseCard(Boolean isBaseCard) {
    this.isBaseCard = isBaseCard;
    return this;
  }

   /**
   * Information whether loyalty merchant card is base card
   * @return isBaseCard
  **/
  public Boolean getIsBaseCard() {
    return isBaseCard;
  }

  public void setIsBaseCard(Boolean isBaseCard) {
    this.isBaseCard = isBaseCard;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel passcode(Integer passcode) {
    this.passcode = passcode;
    return this;
  }

   /**
   * Loyalty merchant card passcode
   * @return passcode
  **/
  public Integer getPasscode() {
    return passcode;
  }

  public void setPasscode(Integer passcode) {
    this.passcode = passcode;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel receiptHeader(List<ReceiptType> receiptHeader) {
    this.receiptHeader = receiptHeader;
    return this;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel addReceiptHeaderItem(ReceiptType receiptHeaderItem) {
    if (this.receiptHeader == null) {
      this.receiptHeader = new ArrayList<ReceiptType>();
    }
    this.receiptHeader.add(receiptHeaderItem);
    return this;
  }

   /**
   * Receipt header
   * @return receiptHeader
  **/
  public List<ReceiptType> getReceiptHeader() {
    return receiptHeader;
  }

  public void setReceiptHeader(List<ReceiptType> receiptHeader) {
    this.receiptHeader = receiptHeader;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel receipt(List<ReceiptTypeValue> receipt) {
    this.receipt = receipt;
    return this;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel addReceiptItem(ReceiptTypeValue receiptItem) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyMerchantcardsProductWithReceiptModel loyaltyMerchantcardsProductWithReceiptModel = (LoyaltyMerchantcardsProductWithReceiptModel) o;
    return Objects.equals(this.object, loyaltyMerchantcardsProductWithReceiptModel.object) &&
        Objects.equals(this.id, loyaltyMerchantcardsProductWithReceiptModel.id) &&
        Objects.equals(this.card, loyaltyMerchantcardsProductWithReceiptModel.card) &&
        Objects.equals(this.merchant, loyaltyMerchantcardsProductWithReceiptModel.merchant) &&
        Objects.equals(this.createdForMerchant, loyaltyMerchantcardsProductWithReceiptModel.createdForMerchant) &&
        Objects.equals(this.createdForStore, loyaltyMerchantcardsProductWithReceiptModel.createdForStore) &&
        Objects.equals(this.customer, loyaltyMerchantcardsProductWithReceiptModel.customer) &&
        Objects.equals(this.cardgroup, loyaltyMerchantcardsProductWithReceiptModel.cardgroup) &&
        Objects.equals(this.paymentContainer, loyaltyMerchantcardsProductWithReceiptModel.paymentContainer) &&
        Objects.equals(this.balance, loyaltyMerchantcardsProductWithReceiptModel.balance) &&
        Objects.equals(this.points, loyaltyMerchantcardsProductWithReceiptModel.points) &&
        Objects.equals(this.bonusBalance, loyaltyMerchantcardsProductWithReceiptModel.bonusBalance) &&
        Objects.equals(this.cashBalance, loyaltyMerchantcardsProductWithReceiptModel.cashBalance) &&
        Objects.equals(this.stockStatus, loyaltyMerchantcardsProductWithReceiptModel.stockStatus) &&
        Objects.equals(this.lockStatus, loyaltyMerchantcardsProductWithReceiptModel.lockStatus) &&
        Objects.equals(this.lastUsage, loyaltyMerchantcardsProductWithReceiptModel.lastUsage) &&
        Objects.equals(this.lastCharge, loyaltyMerchantcardsProductWithReceiptModel.lastCharge) &&
        Objects.equals(this.isBaseCard, loyaltyMerchantcardsProductWithReceiptModel.isBaseCard) &&
        Objects.equals(this.passcode, loyaltyMerchantcardsProductWithReceiptModel.passcode) &&
        Objects.equals(this.receiptHeader, loyaltyMerchantcardsProductWithReceiptModel.receiptHeader) &&
        Objects.equals(this.receipt, loyaltyMerchantcardsProductWithReceiptModel.receipt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, card, merchant, createdForMerchant, createdForStore, customer, cardgroup, paymentContainer, balance, points, bonusBalance, cashBalance, stockStatus, lockStatus, lastUsage, lastCharge, isBaseCard, passcode, receiptHeader, receipt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsProductWithReceiptModel {\n");
    
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
    sb.append("    receiptHeader: ").append(toIndentedString(receiptHeader)).append("\n");
    sb.append("    receipt: ").append(toIndentedString(receipt)).append("\n");
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

