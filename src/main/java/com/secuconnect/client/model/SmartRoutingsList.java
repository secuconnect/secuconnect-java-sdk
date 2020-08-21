package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartRoutingsProductModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SmartRoutingsList
 */
public class SmartRoutingsList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<SmartRoutingsProductModel> data = null;

  public SmartRoutingsList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of existing smart routings
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public SmartRoutingsList data(List<SmartRoutingsProductModel> data) {
    this.data = data;
    return this;
  }

  public SmartRoutingsList addDataItem(SmartRoutingsProductModel dataItem) {
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
  public List<SmartRoutingsProductModel> getData() {
    return data;
  }

  public void setData(List<SmartRoutingsProductModel> data) {
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
    SmartRoutingsList smartRoutingsList = (SmartRoutingsList) o;
    return Objects.equals(this.count, smartRoutingsList.count) &&
        Objects.equals(this.data, smartRoutingsList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartRoutingsList {\n");
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

