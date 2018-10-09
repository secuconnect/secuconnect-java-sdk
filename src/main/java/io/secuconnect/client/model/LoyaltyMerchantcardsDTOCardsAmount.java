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
 * LoyaltyMerchantcardsDTOCardsAmount
 */
public class LoyaltyMerchantcardsDTOCardsAmount {
  @SerializedName("cards_amount")
  private Integer cardsAmount = null;

  public LoyaltyMerchantcardsDTOCardsAmount cardsAmount(Integer cardsAmount) {
    this.cardsAmount = cardsAmount;
    return this;
  }

   /**
   * Cards amount
   * @return cardsAmount
  **/
  public Integer getCardsAmount() {
    return cardsAmount;
  }

  public void setCardsAmount(Integer cardsAmount) {
    this.cardsAmount = cardsAmount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyMerchantcardsDTOCardsAmount loyaltyMerchantcardsDTOCardsAmount = (LoyaltyMerchantcardsDTOCardsAmount) o;
    return Objects.equals(this.cardsAmount, loyaltyMerchantcardsDTOCardsAmount.cardsAmount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardsAmount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsDTOCardsAmount {\n");
    
    sb.append("    cardsAmount: ").append(toIndentedString(cardsAmount)).append("\n");
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

