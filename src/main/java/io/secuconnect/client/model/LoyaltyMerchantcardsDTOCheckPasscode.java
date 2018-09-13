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
  @ApiModelProperty(value = "Loyalty Card number")
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
  @ApiModelProperty(value = "Loyalty Card pin")
  public Integer getPin() {
    return pin;
  }

  public void setPin(Integer pin) {
    this.pin = pin;
  }

  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

