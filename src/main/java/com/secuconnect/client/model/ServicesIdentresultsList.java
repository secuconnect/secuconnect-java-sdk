package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.ServicesIdentresultsProductModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ServicesIdentresultsList
 */
public class ServicesIdentresultsList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<ServicesIdentresultsProductModel> data = null;

  public ServicesIdentresultsList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of existing identresults
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ServicesIdentresultsList data(List<ServicesIdentresultsProductModel> data) {
    this.data = data;
    return this;
  }

  public ServicesIdentresultsList addDataItem(ServicesIdentresultsProductModel dataItem) {
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
  public List<ServicesIdentresultsProductModel> getData() {
    return data;
  }

  public void setData(List<ServicesIdentresultsProductModel> data) {
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
    ServicesIdentresultsList servicesIdentresultsList = (ServicesIdentresultsList) o;
    return Objects.equals(this.count, servicesIdentresultsList.count) &&
        Objects.equals(this.data, servicesIdentresultsList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicesIdentresultsList {\n");
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

