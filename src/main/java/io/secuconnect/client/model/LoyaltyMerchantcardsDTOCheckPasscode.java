package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

/**
 * LoyaltyMerchantcardsDTOCheckPasscode
 */
public class LoyaltyMerchantcardsDTOCheckPasscode {
  @SerializedName("cardnumber")
  private Integer cardnumber = null;

  @SerializedName("pin")
  private Integer pin = null;

  public LoyaltyMerchantcardsDTOCheckPasscode cardnumber(Integer cardnumber) {
    this.cardnumber = cardnumber;
    return this;
  }

   /**
   * Loyalty Card number
   * @return cardnumber
  **/
  public Integer getCardnumber() {
    return cardnumber;
  }

  public void setCardnumber(Integer cardnumber) {
    this.cardnumber = cardnumber;
  }

  public LoyaltyMerchantcardsDTOCheckPasscode pin(Integer pin) {
    this.pin = pin;
    return this;
  }

   /**
   * Loyalty Card pin
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

