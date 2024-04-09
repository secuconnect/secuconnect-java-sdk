package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyTransactionsDTOCard
 */
public class LoyaltyTransactionsDTOCard {
  @SerializedName("id")
  protected String id = null;

  @SerializedName("cardnumber")
  protected String cardnumber = null;

  public LoyaltyTransactionsDTOCard id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Loyalty Card ID
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LoyaltyTransactionsDTOCard cardnumber(String cardnumber) {
    this.cardnumber = cardnumber;
    return this;
  }

   /**
   * Card number
   * @return cardnumber
  **/
  public String getCardnumber() {
    return cardnumber;
  }

  public void setCardnumber(String cardnumber) {
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
    LoyaltyTransactionsDTOCard loyaltyTransactionsDTOCard = (LoyaltyTransactionsDTOCard) o;
    return Objects.equals(this.id, loyaltyTransactionsDTOCard.id) &&
        Objects.equals(this.cardnumber, loyaltyTransactionsDTOCard.cardnumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, cardnumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyTransactionsDTOCard {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

