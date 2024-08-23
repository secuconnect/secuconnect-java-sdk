package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyMerchantcardsDTOCardBalanceReceipt
 */
public class LoyaltyMerchantcardsDTOCardBalanceReceipt {
  @SerializedName("cardnumber")
  protected String cardnumber = null;

  @SerializedName("terminal_id")
  protected String terminalId = null;

  public LoyaltyMerchantcardsDTOCardBalanceReceipt cardnumber(String cardnumber) {
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

  public LoyaltyMerchantcardsDTOCardBalanceReceipt terminalId(String terminalId) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyMerchantcardsDTOCardBalanceReceipt loyaltyMerchantcardsDTOCardBalanceReceipt = (LoyaltyMerchantcardsDTOCardBalanceReceipt) o;
    return Objects.equals(this.cardnumber, loyaltyMerchantcardsDTOCardBalanceReceipt.cardnumber) &&
        Objects.equals(this.terminalId, loyaltyMerchantcardsDTOCardBalanceReceipt.terminalId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardnumber, terminalId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsDTOCardBalanceReceipt {\n");
    sb.append("    cardnumber: ").append(toIndentedString(cardnumber)).append("\n");
    sb.append("    terminalId: ").append(toIndentedString(terminalId)).append("\n");
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

