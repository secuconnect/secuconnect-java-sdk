package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.LoyaltyMerchantcardsDTOValidateMerchantCard;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * LoyaltyMerchantcardsDTONewPasscode
 */
public class LoyaltyMerchantcardsDTONewPasscode {
  @SerializedName("merchant")
  private String merchant = null;

  @SerializedName("cardnumber")
  private Integer cardnumber = null;

  @SerializedName("passcode")
  private Integer passcode = null;

  public LoyaltyMerchantcardsDTONewPasscode merchant(String merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * General Merchant id
   * @return merchant
  **/
  public String getMerchant() {
    return merchant;
  }

  public void setMerchant(String merchant) {
    this.merchant = merchant;
  }

  public LoyaltyMerchantcardsDTONewPasscode cardnumber(Integer cardnumber) {
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

  public LoyaltyMerchantcardsDTONewPasscode passcode(Integer passcode) {
    this.passcode = passcode;
    return this;
  }

   /**
   * Loyalty Card passcode
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
    LoyaltyMerchantcardsDTONewPasscode loyaltyMerchantcardsDTONewPasscode = (LoyaltyMerchantcardsDTONewPasscode) o;
    return Objects.equals(this.merchant, loyaltyMerchantcardsDTONewPasscode.merchant) &&
        Objects.equals(this.cardnumber, loyaltyMerchantcardsDTONewPasscode.cardnumber) &&
        Objects.equals(this.passcode, loyaltyMerchantcardsDTONewPasscode.passcode);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchant, cardnumber, passcode);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsDTONewPasscode {\n");
    
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
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

