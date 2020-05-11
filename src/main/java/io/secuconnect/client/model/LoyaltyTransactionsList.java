package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.LoyaltyTransactionsProductModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * LoyaltyTransactionsList
 */
public class LoyaltyTransactionsList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<LoyaltyTransactionsProductModel> data = null;

  public LoyaltyTransactionsList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of existing loyalty transactions
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public LoyaltyTransactionsList data(List<LoyaltyTransactionsProductModel> data) {
    this.data = data;
    return this;
  }

  public LoyaltyTransactionsList addDataItem(LoyaltyTransactionsProductModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<LoyaltyTransactionsProductModel>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public List<LoyaltyTransactionsProductModel> getData() {
    return data;
  }

  public void setData(List<LoyaltyTransactionsProductModel> data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyTransactionsList loyaltyTransactionsList = (LoyaltyTransactionsList) o;
    return Objects.equals(this.count, loyaltyTransactionsList.count) &&
        Objects.equals(this.data, loyaltyTransactionsList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyTransactionsList {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

