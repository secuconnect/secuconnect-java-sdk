package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.ServicesIdentrequestsProductModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ServicesIdentrequestsList
 */
public class ServicesIdentrequestsList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<ServicesIdentrequestsProductModel> data = null;

  public ServicesIdentrequestsList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of existing identrequests
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public ServicesIdentrequestsList data(List<ServicesIdentrequestsProductModel> data) {
    this.data = data;
    return this;
  }

  public ServicesIdentrequestsList addDataItem(ServicesIdentrequestsProductModel dataItem) {
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
  public List<ServicesIdentrequestsProductModel> getData() {
    return data;
  }

  public void setData(List<ServicesIdentrequestsProductModel> data) {
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
    ServicesIdentrequestsList servicesIdentrequestsList = (ServicesIdentrequestsList) o;
    return Objects.equals(this.count, servicesIdentrequestsList.count) &&
        Objects.equals(this.data, servicesIdentrequestsList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicesIdentrequestsList {\n");
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

