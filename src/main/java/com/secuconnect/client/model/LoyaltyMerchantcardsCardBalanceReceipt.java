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
  protected Boolean valid = null;

  @SerializedName("balance")
  protected Integer balance = null;

  @SerializedName("cash_balance")
  protected Integer cashBalance = null;

  @SerializedName("bonus_balance")
  protected Integer bonusBalance = null;

  @SerializedName("zvt_cardgroup")
  protected String zvtCardgroup = null;

  @SerializedName("points")
  protected Integer points = null;

  @SerializedName("new_passcode")
  protected Boolean newPasscode = null;

  @SerializedName("receipt_header")
  protected List<ReceiptType> receiptHeader = null;

  @SerializedName("receipt")
  protected List<ReceiptTypeValue> receipt = null;

  @SerializedName("amount_split_enabled")
  protected Boolean amountSplitEnabled = null;

  @SerializedName("limit_allowed")
  protected Boolean limitAllowed = null;

  @SerializedName("limit_str")
  protected String limitStr = null;

  @SerializedName("limit")
  protected Integer limit = null;

  public LoyaltyMerchantcardsCardBalanceReceipt valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Whether the card is valid
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
   * Total money balance; in the smallest currency unit (e. g. Euro Cent)
   * @return balance
  **/
  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  public LoyaltyMerchantcardsCardBalanceReceipt cashBalance(Integer cashBalance) {
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

  public LoyaltyMerchantcardsCardBalanceReceipt bonusBalance(Integer bonusBalance) {
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

  public LoyaltyMerchantcardsCardBalanceReceipt zvtCardgroup(String zvtCardgroup) {
    this.zvtCardgroup = zvtCardgroup;
    return this;
  }

   /**
   * ZVT Cardgroup
   * @return zvtCardgroup
  **/
  public String getZvtCardgroup() {
    return zvtCardgroup;
  }

  public void setZvtCardgroup(String zvtCardgroup) {
    this.zvtCardgroup = zvtCardgroup;
  }

  public LoyaltyMerchantcardsCardBalanceReceipt points(Integer points) {
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

  public LoyaltyMerchantcardsCardBalanceReceipt newPasscode(Boolean newPasscode) {
    this.newPasscode = newPasscode;
    return this;
  }

   /**
   * Whether a new passcode has been set
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
   * Whether the card can be overdrawn (&#x60;true&#x60;) or not (&#x60;false&#x60;)
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
   * Formatted overdraft limit (amount and currency unit)
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
   * Overdraft limit in the smallest currency unit (e. g. Euro Cent)
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
        Objects.equals(this.cashBalance, loyaltyMerchantcardsCardBalanceReceipt.cashBalance) &&
        Objects.equals(this.bonusBalance, loyaltyMerchantcardsCardBalanceReceipt.bonusBalance) &&
        Objects.equals(this.zvtCardgroup, loyaltyMerchantcardsCardBalanceReceipt.zvtCardgroup) &&
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
    return Objects.hash(valid, balance, cashBalance, bonusBalance, zvtCardgroup, points, newPasscode, receiptHeader, receipt, amountSplitEnabled, limitAllowed, limitStr, limit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsCardBalanceReceipt {\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    cashBalance: ").append(toIndentedString(cashBalance)).append("\n");
    sb.append("    bonusBalance: ").append(toIndentedString(bonusBalance)).append("\n");
    sb.append("    zvtCardgroup: ").append(toIndentedString(zvtCardgroup)).append("\n");
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

