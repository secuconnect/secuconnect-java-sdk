package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyMerchantcardsDTOCheckPasscode
 */
public class LoyaltyMerchantcardsDTOCheckPasscode {
  @SerializedName("cardnumber")
  protected String cardnumber = null;

  @SerializedName("pin")
  protected Integer pin = null;

  public LoyaltyMerchantcardsDTOCheckPasscode cardnumber(String cardnumber) {
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

  public LoyaltyMerchantcardsDTOCheckPasscode pin(Integer pin) {
    this.pin = pin;
    return this;
  }

   /**
   * Entered passcode
   * @return pin
  **/
  public Integer getPin() {
    return pin;
  }

  public void setPin(Integer pin) {
    this.pin = pin;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyMerchantcardsDTOCheckPasscode loyaltyMerchantcardsDTOCheckPasscode = (LoyaltyMerchantcardsDTOCheckPasscode) o;
    return Objects.equals(this.cardnumber, loyaltyMerchantcardsDTOCheckPasscode.cardnumber) &&
        Objects.equals(this.pin, loyaltyMerchantcardsDTOCheckPasscode.pin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardnumber, pin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsDTOCheckPasscode {\n");
    sb.append("    cardnumber: ").append(toIndentedString(cardnumber)).append("\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
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

