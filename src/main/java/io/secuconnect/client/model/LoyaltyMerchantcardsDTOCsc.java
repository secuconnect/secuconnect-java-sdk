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
 * LoyaltyMerchantcardsDTOCsc
 */
public class LoyaltyMerchantcardsDTOCsc {
  @SerializedName("cardnumber")
  private Integer cardnumber = null;

  @SerializedName("csc")
  private Integer csc = null;

  public LoyaltyMerchantcardsDTOCsc cardnumber(Integer cardnumber) {
    this.cardnumber = cardnumber;
    return this;
  }

   /**
   * Card number
   * @return cardnumber
  **/
  @ApiModelProperty(value = "Card number")
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
  @ApiModelProperty(value = "Card security code")
  public Integer getCsc() {
    return csc;
  }

  public void setCsc(Integer csc) {
    this.csc = csc;
  }

  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

