package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/**
 * LoyaltyMerchantcardsDTOTransaction
 */
public class LoyaltyMerchantcardsDTOTransaction {
  @SerializedName("action")
  private String action = null;

  @SerializedName("terminal_id")
  private String terminalId = null;

  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("tid")
  private String tid = null;

  @SerializedName("store")
  private String store = null;

  @SerializedName("cardnumber")
  private Integer cardnumber = null;

  @SerializedName("bonus_amount")
  private Integer bonusAmount = null;

  @SerializedName("amount_split_allowed")
  private String amountSplitAllowed = null;

  @SerializedName("merchant_id")
  private String merchantId = null;

  public LoyaltyMerchantcardsDTOTransaction action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Action
   * @return action
  **/
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public LoyaltyMerchantcardsDTOTransaction terminalId(String terminalId) {
    this.terminalId = terminalId;
    return this;
  }

   /**
   * Terminal id
   * @return terminalId
  **/
  public String getTerminalId() {
    return terminalId;
  }

  public void setTerminalId(String terminalId) {
    this.terminalId = terminalId;
  }

  public LoyaltyMerchantcardsDTOTransaction amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount
   * @return amount
  **/
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public LoyaltyMerchantcardsDTOTransaction tid(String tid) {
    this.tid = tid;
    return this;
  }

   /**
   * Tid
   * @return tid
  **/
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public LoyaltyMerchantcardsDTOTransaction store(String store) {
    this.store = store;
    return this;
  }

   /**
   * Store id
   * @return store
  **/
  public String getStore() {
    return store;
  }

  public void setStore(String store) {
    this.store = store;
  }

  public LoyaltyMerchantcardsDTOTransaction cardnumber(Integer cardnumber) {
    this.cardnumber = cardnumber;
    return this;
  }

   /**
   * Card number
   * @return cardnumber
  **/
  public Integer getCardnumber() {
    return cardnumber;
  }

  public void setCardnumber(Integer cardnumber) {
    this.cardnumber = cardnumber;
  }

  public LoyaltyMerchantcardsDTOTransaction bonusAmount(Integer bonusAmount) {
    this.bonusAmount = bonusAmount;
    return this;
  }

   /**
   * Bonus amount
   * @return bonusAmount
  **/
  public Integer getBonusAmount() {
    return bonusAmount;
  }

  public void setBonusAmount(Integer bonusAmount) {
    this.bonusAmount = bonusAmount;
  }

  public LoyaltyMerchantcardsDTOTransaction amountSplitAllowed(String amountSplitAllowed) {
    this.amountSplitAllowed = amountSplitAllowed;
    return this;
  }

   /**
   * Amount split allowed
   * @return amountSplitAllowed
  **/
  public String getAmountSplitAllowed() {
    return amountSplitAllowed;
  }

  public void setAmountSplitAllowed(String amountSplitAllowed) {
    this.amountSplitAllowed = amountSplitAllowed;
  }

  public LoyaltyMerchantcardsDTOTransaction merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Merchant id
   * @return merchantId
  **/
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyMerchantcardsDTOTransaction loyaltyMerchantcardsDTOTransaction = (LoyaltyMerchantcardsDTOTransaction) o;
    return Objects.equals(this.action, loyaltyMerchantcardsDTOTransaction.action) &&
        Objects.equals(this.terminalId, loyaltyMerchantcardsDTOTransaction.terminalId) &&
        Objects.equals(this.amount, loyaltyMerchantcardsDTOTransaction.amount) &&
        Objects.equals(this.tid, loyaltyMerchantcardsDTOTransaction.tid) &&
        Objects.equals(this.store, loyaltyMerchantcardsDTOTransaction.store) &&
        Objects.equals(this.cardnumber, loyaltyMerchantcardsDTOTransaction.cardnumber) &&
        Objects.equals(this.bonusAmount, loyaltyMerchantcardsDTOTransaction.bonusAmount) &&
        Objects.equals(this.amountSplitAllowed, loyaltyMerchantcardsDTOTransaction.amountSplitAllowed) &&
        Objects.equals(this.merchantId, loyaltyMerchantcardsDTOTransaction.merchantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, terminalId, amount, tid, store, cardnumber, bonusAmount, amountSplitAllowed, merchantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsDTOTransaction {\n");
    
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    cardnumber: ").append(toIndentedString(cardnumber)).append("\n");
    sb.append("    bonusAmount: ").append(toIndentedString(bonusAmount)).append("\n");
    sb.append("    amountSplitAllowed: ").append(toIndentedString(amountSplitAllowed)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
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

