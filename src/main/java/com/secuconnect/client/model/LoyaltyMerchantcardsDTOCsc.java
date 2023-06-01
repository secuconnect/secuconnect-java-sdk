package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyMerchantcardsDTOCsc
 */
public class LoyaltyMerchantcardsDTOCsc {
  @SerializedName("cardnumber")
  protected Integer cardnumber = null;

  @SerializedName("csc")
  protected Integer csc = null;

  public LoyaltyMerchantcardsDTOCsc cardnumber(Integer cardnumber) {
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

  public LoyaltyMerchantcardsDTOCsc csc(Integer csc) {
    this.csc = csc;
    return this;
  }

   /**
   * Card security code
   * @return csc
  **/
  public Integer getCsc() {
    return csc;
  }

  public void setCsc(Integer csc) {
    this.csc = csc;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyMerchantcardsDTOCsc loyaltyMerchantcardsDTOCsc = (LoyaltyMerchantcardsDTOCsc) o;
    return Objects.equals(this.cardnumber, loyaltyMerchantcardsDTOCsc.cardnumber) &&
        Objects.equals(this.csc, loyaltyMerchantcardsDTOCsc.csc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardnumber, csc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsDTOCsc {\n");
    sb.append("    cardnumber: ").append(toIndentedString(cardnumber)).append("\n");
    sb.append("    csc: ").append(toIndentedString(csc)).append("\n");
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

