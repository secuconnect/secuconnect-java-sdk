package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyTransactionsDTOMerchant
 */
public class LoyaltyTransactionsDTOMerchant {
  @SerializedName("id")
  protected String id = null;

  public LoyaltyTransactionsDTOMerchant id(String id) {
    this.id = id;
    return this;
  }

   /**
   * General Merchant ID
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
    LoyaltyTransactionsDTOMerchant loyaltyTransactionsDTOMerchant = (LoyaltyTransactionsDTOMerchant) o;
    return Objects.equals(this.id, loyaltyTransactionsDTOMerchant.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyTransactionsDTOMerchant {\n");
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

