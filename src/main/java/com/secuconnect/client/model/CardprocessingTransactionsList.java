package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.CardprocessingTransactionsProductModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CardprocessingTransactionsList
 */
public class CardprocessingTransactionsList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<CardprocessingTransactionsProductModel> data = null;

  public CardprocessingTransactionsList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of existing cardprocessing transactions
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public CardprocessingTransactionsList data(List<CardprocessingTransactionsProductModel> data) {
    this.data = data;
    return this;
  }

  public CardprocessingTransactionsList addDataItem(CardprocessingTransactionsProductModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * List of CardprocessingTransactions
   * @return data
  **/
  public List<CardprocessingTransactionsProductModel> getData() {
    return data;
  }

  public void setData(List<CardprocessingTransactionsProductModel> data) {
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
    CardprocessingTransactionsList cardprocessingTransactionsList = (CardprocessingTransactionsList) o;
    return Objects.equals(this.count, cardprocessingTransactionsList.count) &&
        Objects.equals(this.data, cardprocessingTransactionsList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardprocessingTransactionsList {\n");
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

