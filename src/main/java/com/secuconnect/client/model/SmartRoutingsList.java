package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartRoutingsProductModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * List of Smart Routings
 */
public class SmartRoutingsList {
  @SerializedName("count")
  protected Integer count = null;

  @SerializedName("data")
  protected List<SmartRoutingsProductModel> data = null;

  @SerializedName("scroll_id")
  protected String scrollId = null;

  @SerializedName("result")
  protected Boolean result = null;

  @SerializedName("meta")
  protected Object meta = null;

  @SerializedName("type")
  protected String type = null;

  @SerializedName("sum")
  protected Boolean sum = null;

  @SerializedName("lookup")
  protected List<String> lookup = null;

  public SmartRoutingsList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Total number of matching Smart Routings
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
      this.data = new ArrayList<SmartRoutingsProductModel>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Smart Routings (limited number)
   * @return data
  **/
  public List<SmartRoutingsProductModel> getData() {
    return data;
  }

  public void setData(List<SmartRoutingsProductModel> data) {
    this.data = data;
  }

  public SmartRoutingsList scrollId(String scrollId) {
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

  public SmartRoutingsList result(Boolean result) {
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

  public SmartRoutingsList meta(Object meta) {
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

  public SmartRoutingsList type(String type) {
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

  public SmartRoutingsList sum(Boolean sum) {
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

  public SmartRoutingsList lookup(List<String> lookup) {
    this.lookup = lookup;
    return this;
  }

  public SmartRoutingsList addLookupItem(String lookupItem) {
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
    SmartRoutingsList smartRoutingsList = (SmartRoutingsList) o;
    return Objects.equals(this.count, smartRoutingsList.count) &&
        Objects.equals(this.data, smartRoutingsList.data) &&
        Objects.equals(this.scrollId, smartRoutingsList.scrollId) &&
        Objects.equals(this.result, smartRoutingsList.result) &&
        Objects.equals(this.meta, smartRoutingsList.meta) &&
        Objects.equals(this.type, smartRoutingsList.type) &&
        Objects.equals(this.sum, smartRoutingsList.sum) &&
        Objects.equals(this.lookup, smartRoutingsList.lookup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data, scrollId, result, meta, type, sum, lookup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartRoutingsList {\n");
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

