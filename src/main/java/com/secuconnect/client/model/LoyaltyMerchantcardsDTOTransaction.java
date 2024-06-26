package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyMerchantcardsDTOTransaction
 */
public class LoyaltyMerchantcardsDTOTransaction {
  @SerializedName("action")
  protected String action = null;

  @SerializedName("terminal_id")
  protected String terminalId = null;

  @SerializedName("amount")
  protected Integer amount = null;

  @SerializedName("tid")
  protected String tid = null;

  @SerializedName("store")
  protected String store = null;

  @SerializedName("cardnumber")
  protected String cardnumber = null;

  @SerializedName("bonus_amount")
  protected Integer bonusAmount = null;

  @SerializedName("amount_split_allowed")
  protected String amountSplitAllowed = null;

  @SerializedName("merchant_id")
  protected String merchantId = null;

  @SerializedName("additional_data")
  protected Object additionalData = null;

  public LoyaltyMerchantcardsDTOTransaction action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Action:  - &#x60;\&quot;charge\&quot;&#x60; - &#x60;\&quot;discharge\&quot;&#x60; - &#x60;\&quot;sale_revenue\&quot;&#x60; - &#x60;\&quot;charge_points\&quot;&#x60; - &#x60;\&quot;discharge_points\&quot;&#x60; - &#x60;\&quot;cancel_last\&quot;&#x60; - &#x60;\&quot;immediate_bonus\&quot;&#x60;
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
   * Terminal ID
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
   * Get amount
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
   * Terminal TID
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
   * General Store ID
   * @return store
  **/
  public String getStore() {
    return store;
  }

  public void setStore(String store) {
    this.store = store;
  }

  public LoyaltyMerchantcardsDTOTransaction cardnumber(String cardnumber) {
    this.cardnumber = cardnumber;
    return this;
  }

   /**
   * Number on card
   * @return cardnumber
  **/
  public String getCardnumber() {
    return cardnumber;
  }

  public void setCardnumber(String cardnumber) {
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
   * Whether amount split is allowed
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
   * General Merchant ID
   * @return merchantId
  **/
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public LoyaltyMerchantcardsDTOTransaction additionalData(Object additionalData) {
    this.additionalData = additionalData;
    return this;
  }

   /**
   * Get additionalData
   * @return additionalData
  **/
  public Object getAdditionalData() {
    return additionalData;
  }

  public void setAdditionalData(Object additionalData) {
    this.additionalData = additionalData;
  }

  @Override
  public boolean equals(Object o) {
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
        Objects.equals(this.merchantId, loyaltyMerchantcardsDTOTransaction.merchantId) &&
        Objects.equals(this.additionalData, loyaltyMerchantcardsDTOTransaction.additionalData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, terminalId, amount, tid, store, cardnumber, bonusAmount, amountSplitAllowed, merchantId, additionalData);
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
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
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

