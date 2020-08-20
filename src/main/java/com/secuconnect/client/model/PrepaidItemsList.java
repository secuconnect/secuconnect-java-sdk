package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.PrepaidItemsProductModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PrepaidItemsList
 */
public class PrepaidItemsList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<PrepaidItemsProductModel> data = null;

  public PrepaidItemsList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of existing prepaid items
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PrepaidItemsList data(List<PrepaidItemsProductModel> data) {
    this.data = data;
    return this;
  }

  public PrepaidItemsList addDataItem(PrepaidItemsProductModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public List<PrepaidItemsProductModel> getData() {
    return data;
  }

  public void setData(List<PrepaidItemsProductModel> data) {
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
    PrepaidItemsList prepaidItemsList = (PrepaidItemsList) o;
    return Objects.equals(this.count, prepaidItemsList.count) &&
        Objects.equals(this.data, prepaidItemsList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepaidItemsList {\n");
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

