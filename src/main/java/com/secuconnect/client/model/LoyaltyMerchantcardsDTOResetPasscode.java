package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyMerchantcardsDTOResetPasscode
 */
public class LoyaltyMerchantcardsDTOResetPasscode {
  @SerializedName("cardnumber")
  protected Integer cardnumber = null;

  @SerializedName("passcode")
  protected Integer passcode = null;

  public LoyaltyMerchantcardsDTOResetPasscode cardnumber(Integer cardnumber) {
    this.cardnumber = cardnumber;
    return this;
  }

   /**
   * Number on card
   * @return cardnumber
  **/
  public Integer getCardnumber() {
    return cardnumber;
  }

  public void setCardnumber(Integer cardnumber) {
    this.cardnumber = cardnumber;
  }

  public LoyaltyMerchantcardsDTOResetPasscode passcode(Integer passcode) {
    this.passcode = passcode;
    return this;
  }

   /**
   * Old passcode
   * @return passcode
  **/
  public Integer getPasscode() {
    return passcode;
  }

  public void setPasscode(Integer passcode) {
    this.passcode = passcode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyMerchantcardsDTOResetPasscode loyaltyMerchantcardsDTOResetPasscode = (LoyaltyMerchantcardsDTOResetPasscode) o;
    return Objects.equals(this.cardnumber, loyaltyMerchantcardsDTOResetPasscode.cardnumber) &&
        Objects.equals(this.passcode, loyaltyMerchantcardsDTOResetPasscode.passcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardnumber, passcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsDTOResetPasscode {\n");
    sb.append("    cardnumber: ").append(toIndentedString(cardnumber)).append("\n");
    sb.append("    passcode: ").append(toIndentedString(passcode)).append("\n");
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

