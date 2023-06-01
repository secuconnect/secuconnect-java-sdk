package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.LoyaltyMerchantcardsDTOCustomer;
import java.util.Objects;

/**
 * LoyaltyMerchantcardsDTOCreateMerchantcards
 */
public class LoyaltyMerchantcardsDTOCreateMerchantcards {
  @SerializedName("cards_amount")
  protected Integer cardsAmount = null;

  @SerializedName("customer")
  protected LoyaltyMerchantcardsDTOCustomer customer = null;

  public LoyaltyMerchantcardsDTOCreateMerchantcards cardsAmount(Integer cardsAmount) {
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

  public LoyaltyMerchantcardsDTOCreateMerchantcards customer(LoyaltyMerchantcardsDTOCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  public LoyaltyMerchantcardsDTOCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(LoyaltyMerchantcardsDTOCustomer customer) {
    this.customer = customer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyMerchantcardsDTOCreateMerchantcards loyaltyMerchantcardsDTOCreateMerchantcards = (LoyaltyMerchantcardsDTOCreateMerchantcards) o;
    return Objects.equals(this.cardsAmount, loyaltyMerchantcardsDTOCreateMerchantcards.cardsAmount) &&
        Objects.equals(this.customer, loyaltyMerchantcardsDTOCreateMerchantcards.customer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardsAmount, customer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsDTOCreateMerchantcards {\n");
    sb.append("    cardsAmount: ").append(toIndentedString(cardsAmount)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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

