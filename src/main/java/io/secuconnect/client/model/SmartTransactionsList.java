package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.SmartTransactionsProductModel;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SmartTransactionsList
 */
public class SmartTransactionsList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<SmartTransactionsProductModel> data = null;

  public SmartTransactionsList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of existing smart transactions
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public SmartTransactionsList data(List<SmartTransactionsProductModel> data) {
    this.data = data;
    return this;
  }

  public SmartTransactionsList addDataItem(SmartTransactionsProductModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<SmartTransactionsProductModel>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * SmartTransactionsList
   * @return data
  **/
  public List<SmartTransactionsProductModel> getData() {
    return data;
  }

  public void setData(List<SmartTransactionsProductModel> data) {
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
    SmartTransactionsList smartTransactionsList = (SmartTransactionsList) o;
    return Objects.equals(this.count, smartTransactionsList.count) &&
        Objects.equals(this.data, smartTransactionsList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsList {\n");
    
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

