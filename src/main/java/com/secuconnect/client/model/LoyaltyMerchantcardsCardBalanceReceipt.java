package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.ReceiptType;
import com.secuconnect.client.model.ReceiptTypeValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * LoyaltyMerchantcardsCardBalanceReceipt
 */
public class LoyaltyMerchantcardsCardBalanceReceipt {
  @SerializedName("valid")
  private Boolean valid = null;

  @SerializedName("balance")
  private Integer balance = null;

  @SerializedName("points")
  private Integer points = null;

  @SerializedName("new_passcode")
  private Boolean newPasscode = null;

  @SerializedName("receipt_header")
  private List<ReceiptType> receiptHeader = null;

  @SerializedName("receipt")
  private List<ReceiptTypeValue> receipt = null;

  @SerializedName("amount_split_enabled")
  private Boolean amountSplitEnabled = null;

  @SerializedName("limit_allowed")
  private Boolean limitAllowed = null;

  @SerializedName("limit_str")
  private String limitStr = null;

  @SerializedName("limit")
  private Integer limit = null;

  public LoyaltyMerchantcardsCardBalanceReceipt valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Result has true or false value
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public LoyaltyMerchantcardsCardBalanceReceipt balance(Integer balance) {
    this.balance = balance;
    return this;
  }

   /**
   * The total cash balance of the card
   * @return balance
  **/
  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  public LoyaltyMerchantcardsCardBalanceReceipt points(Integer points) {
    this.points = points;
    return this;
  }

   /**
   * The total points balance of the card
   * @return points
  **/
  public Integer getPoints() {
    return points;
  }

  public void setPoints(Integer points) {
    this.points = points;
  }

  public LoyaltyMerchantcardsCardBalanceReceipt newPasscode(Boolean newPasscode) {
    this.newPasscode = newPasscode;
    return this;
  }

   /**
   * Result has true or false value
   * @return newPasscode
  **/
  public Boolean getNewPasscode() {
    return newPasscode;
  }

  public void setNewPasscode(Boolean newPasscode) {
    this.newPasscode = newPasscode;
  }

  public LoyaltyMerchantcardsCardBalanceReceipt receiptHeader(List<ReceiptType> receiptHeader) {
    this.receiptHeader = receiptHeader;
    return this;
  }

  public LoyaltyMerchantcardsCardBalanceReceipt addReceiptHeaderItem(ReceiptType receiptHeaderItem) {
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

  public LoyaltyMerchantcardsCardBalanceReceipt receipt(List<ReceiptTypeValue> receipt) {
    this.receipt = receipt;
    return this;
  }

  public LoyaltyMerchantcardsCardBalanceReceipt addReceiptItem(ReceiptTypeValue receiptItem) {
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

  public LoyaltyMerchantcardsCardBalanceReceipt amountSplitEnabled(Boolean amountSplitEnabled) {
    this.amountSplitEnabled = amountSplitEnabled;
    return this;
  }

   /**
   * Result has true or false value
   * @return amountSplitEnabled
  **/
  public Boolean getAmountSplitEnabled() {
    return amountSplitEnabled;
  }

  public void setAmountSplitEnabled(Boolean amountSplitEnabled) {
    this.amountSplitEnabled = amountSplitEnabled;
  }

  public LoyaltyMerchantcardsCardBalanceReceipt limitAllowed(Boolean limitAllowed) {
    this.limitAllowed = limitAllowed;
    return this;
  }

   /**
   * Result has true or false value
   * @return limitAllowed
  **/
  public Boolean getLimitAllowed() {
    return limitAllowed;
  }

  public void setLimitAllowed(Boolean limitAllowed) {
    this.limitAllowed = limitAllowed;
  }

  public LoyaltyMerchantcardsCardBalanceReceipt limitStr(String limitStr) {
    this.limitStr = limitStr;
    return this;
  }

   /**
   * A formatted string of the limit in euro with currency code
   * @return limitStr
  **/
  public String getLimitStr() {
    return limitStr;
  }

  public void setLimitStr(String limitStr) {
    this.limitStr = limitStr;
  }

  public LoyaltyMerchantcardsCardBalanceReceipt limit(Integer limit) {
    this.limit = limit;
    return this;
  }

   /**
   * How much the card balance can be negative, zero means unlimited in case limit_allowed is true
   * @return limit
  **/
  public Integer getLimit() {
    return limit;
  }

  public void setLimit(Integer limit) {
    this.limit = limit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyMerchantcardsCardBalanceReceipt loyaltyMerchantcardsCardBalanceReceipt = (LoyaltyMerchantcardsCardBalanceReceipt) o;
    return Objects.equals(this.valid, loyaltyMerchantcardsCardBalanceReceipt.valid) &&
        Objects.equals(this.balance, loyaltyMerchantcardsCardBalanceReceipt.balance) &&
        Objects.equals(this.points, loyaltyMerchantcardsCardBalanceReceipt.points) &&
        Objects.equals(this.newPasscode, loyaltyMerchantcardsCardBalanceReceipt.newPasscode) &&
        Objects.equals(this.receiptHeader, loyaltyMerchantcardsCardBalanceReceipt.receiptHeader) &&
        Objects.equals(this.receipt, loyaltyMerchantcardsCardBalanceReceipt.receipt) &&
        Objects.equals(this.amountSplitEnabled, loyaltyMerchantcardsCardBalanceReceipt.amountSplitEnabled) &&
        Objects.equals(this.limitAllowed, loyaltyMerchantcardsCardBalanceReceipt.limitAllowed) &&
        Objects.equals(this.limitStr, loyaltyMerchantcardsCardBalanceReceipt.limitStr) &&
        Objects.equals(this.limit, loyaltyMerchantcardsCardBalanceReceipt.limit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(valid, balance, points, newPasscode, receiptHeader, receipt, amountSplitEnabled, limitAllowed, limitStr, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsCardBalanceReceipt {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    points: ").append(toIndentedString(points)).append("\n");
    sb.append("    newPasscode: ").append(toIndentedString(newPasscode)).append("\n");
    sb.append("    receiptHeader: ").append(toIndentedString(receiptHeader)).append("\n");
    sb.append("    receipt: ").append(toIndentedString(receipt)).append("\n");
    sb.append("    amountSplitEnabled: ").append(toIndentedString(amountSplitEnabled)).append("\n");
    sb.append("    limitAllowed: ").append(toIndentedString(limitAllowed)).append("\n");
    sb.append("    limitStr: ").append(toIndentedString(limitStr)).append("\n");
    sb.append("    limit: ").append(toIndentedString(limit)).append("\n");
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

