package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyMerchantcardsDTOValidateMerchantCard
 */
public class LoyaltyMerchantcardsDTOValidateMerchantCard {
  @SerializedName("merchant")
  private String merchant = null;

  @SerializedName("cardnumber")
  private Integer cardnumber = null;

  public LoyaltyMerchantcardsDTOValidateMerchantCard merchant(String merchant) {
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

  public LoyaltyMerchantcardsDTOValidateMerchantCard cardnumber(Integer cardnumber) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyMerchantcardsDTOValidateMerchantCard loyaltyMerchantcardsDTOValidateMerchantCard = (LoyaltyMerchantcardsDTOValidateMerchantCard) o;
    return Objects.equals(this.merchant, loyaltyMerchantcardsDTOValidateMerchantCard.merchant) &&
        Objects.equals(this.cardnumber, loyaltyMerchantcardsDTOValidateMerchantCard.cardnumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchant, cardnumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsDTOValidateMerchantCard {\n");
    
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    cardnumber: ").append(toIndentedString(cardnumber)).append("\n");
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

