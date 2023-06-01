package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyTransactionsDTOMerchantcard
 */
public class LoyaltyTransactionsDTOMerchantcard {
  @SerializedName("id")
  protected String id = null;

  public LoyaltyTransactionsDTOMerchantcard id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Merchantcard id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyTransactionsDTOMerchantcard loyaltyTransactionsDTOMerchantcard = (LoyaltyTransactionsDTOMerchantcard) o;
    return Objects.equals(this.id, loyaltyTransactionsDTOMerchantcard.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyTransactionsDTOMerchantcard {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

