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

  @SerializedName("scroll_id")
  private String scrollId = null;

  @SerializedName("result")
  private Boolean result = null;

  @SerializedName("meta")
  private Object meta = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("sum")
  private Boolean sum = null;

  @SerializedName("lookup")
  private List<String> lookup = null;

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
      this.data = new ArrayList<SmartTemplatesProductModel>();
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

  public SmartTemplatesList scrollId(String scrollId) {
    this.scrollId = scrollId;
    return this;
  }

   /**
   * Identifier of a previous search context
   * @return scrollId
  **/
  public String getScrollId() {
    return scrollId;
  }

  public void setScrollId(String scrollId) {
    this.scrollId = scrollId;
  }

  public SmartTemplatesList result(Boolean result) {
    this.result = result;
    return this;
  }

   /**
   * In case the product model function returns only scalar value (f.e. for the query validation)
   * @return result
  **/
  public Boolean getResult() {
    return result;
  }

  public void setResult(Boolean result) {
    this.result = result;
  }

  public SmartTemplatesList meta(Object meta) {
    this.meta = meta;
    return this;
  }

   /**
   * Meta definition of the product model
   * @return meta
  **/
  public Object getMeta() {
    return meta;
  }

  public void setMeta(Object meta) {
    this.meta = meta;
  }

  public SmartTemplatesList type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Aggregation type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SmartTemplatesList sum(Boolean sum) {
    this.sum = sum;
    return this;
  }

   /**
   * Aggregation result is summarized?
   * @return sum
  **/
  public Boolean getSum() {
    return sum;
  }

  public void setSum(Boolean sum) {
    this.sum = sum;
  }

  public SmartTemplatesList lookup(List<String> lookup) {
    this.lookup = lookup;
    return this;
  }

  public SmartTemplatesList addLookupItem(String lookupItem) {
    if (this.lookup == null) {
      this.lookup = new ArrayList<String>();
    }
    this.lookup.add(lookupItem);
    return this;
  }

   /**
   * Aggregation lookup table
   * @return lookup
  **/
  public List<String> getLookup() {
    return lookup;
  }

  public void setLookup(List<String> lookup) {
    this.lookup = lookup;
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
        Objects.equals(this.data, smartTemplatesList.data) &&
        Objects.equals(this.scrollId, smartTemplatesList.scrollId) &&
        Objects.equals(this.result, smartTemplatesList.result) &&
        Objects.equals(this.meta, smartTemplatesList.meta) &&
        Objects.equals(this.type, smartTemplatesList.type) &&
        Objects.equals(this.sum, smartTemplatesList.sum) &&
        Objects.equals(this.lookup, smartTemplatesList.lookup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data, scrollId, result, meta, type, sum, lookup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTemplatesList {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
    sb.append("    scrollId: ").append(toIndentedString(scrollId)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
    sb.append("    meta: ").append(toIndentedString(meta)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    lookup: ").append(toIndentedString(lookup)).append("\n");
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

