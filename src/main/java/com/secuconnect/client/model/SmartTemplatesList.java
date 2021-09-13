package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartTemplatesProductModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SmartTemplatesList
 */
public class SmartTemplatesList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<SmartTemplatesProductModel> data = null;

  public SmartTemplatesList count(Integer count) {
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

  public SmartTemplatesList data(List<SmartTemplatesProductModel> data) {
    this.data = data;
    return this;
  }

  public SmartTemplatesList addDataItem(SmartTemplatesProductModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * List of SmartTemplates
   * @return data
  **/
  public List<SmartTemplatesProductModel> getData() {
    return data;
  }

  public void setData(List<SmartTemplatesProductModel> data) {
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
    SmartTemplatesList smartTemplatesList = (SmartTemplatesList) o;
    return Objects.equals(this.count, smartTemplatesList.count) &&
        Objects.equals(this.data, smartTemplatesList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTemplatesList {\n");
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

