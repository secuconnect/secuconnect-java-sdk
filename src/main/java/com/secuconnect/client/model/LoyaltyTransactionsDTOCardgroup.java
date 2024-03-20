package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyTransactionsDTOCardgroup
 */
public class LoyaltyTransactionsDTOCardgroup {
  @SerializedName("id")
  protected String id = null;

  @SerializedName("display_name")
  protected String displayName = null;

  @SerializedName("stock_warn_limit")
  protected Integer stockWarnLimit = null;

  public LoyaltyTransactionsDTOCardgroup id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Card Group ID
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LoyaltyTransactionsDTOCardgroup displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Card Group name
   * @return displayName
  **/
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public LoyaltyTransactionsDTOCardgroup stockWarnLimit(Integer stockWarnLimit) {
    this.stockWarnLimit = stockWarnLimit;
    return this;
  }

   /**
   * Reorder point
   * @return stockWarnLimit
  **/
  public Integer getStockWarnLimit() {
    return stockWarnLimit;
  }

  public void setStockWarnLimit(Integer stockWarnLimit) {
    this.stockWarnLimit = stockWarnLimit;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyTransactionsDTOCardgroup loyaltyTransactionsDTOCardgroup = (LoyaltyTransactionsDTOCardgroup) o;
    return Objects.equals(this.id, loyaltyTransactionsDTOCardgroup.id) &&
        Objects.equals(this.displayName, loyaltyTransactionsDTOCardgroup.displayName) &&
        Objects.equals(this.stockWarnLimit, loyaltyTransactionsDTOCardgroup.stockWarnLimit);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, displayName, stockWarnLimit);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyTransactionsDTOCardgroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    stockWarnLimit: ").append(toIndentedString(stockWarnLimit)).append("\n");
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

