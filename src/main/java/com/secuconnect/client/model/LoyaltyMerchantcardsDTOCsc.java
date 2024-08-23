package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyMerchantcardsDTOCsc
 */
public class LoyaltyMerchantcardsDTOCsc {
  @SerializedName("cardnumber")
  protected String cardnumber = null;

  @SerializedName("csc")
  protected String csc = null;

  public LoyaltyMerchantcardsDTOCsc cardnumber(String cardnumber) {
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

  public LoyaltyMerchantcardsDTOCsc csc(String csc) {
    this.csc = csc;
    return this;
  }

   /**
   * Entered Card Security Code
   * @return csc
  **/
  public String getCsc() {
    return csc;
  }

  public void setCsc(String csc) {
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

