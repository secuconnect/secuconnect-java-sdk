package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.LoyaltyCardgroupsProductModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * LoyaltyCardgroupsList
 */
public class LoyaltyCardgroupsList {
  @SerializedName("count")
  protected Integer count = null;

  @SerializedName("data")
  protected List<LoyaltyCardgroupsProductModel> data = null;

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

  public LoyaltyCardgroupsList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of matching Loyalty Card Groups
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public LoyaltyCardgroupsList data(List<LoyaltyCardgroupsProductModel> data) {
    this.data = data;
    return this;
  }

  public LoyaltyCardgroupsList addDataItem(LoyaltyCardgroupsProductModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<LoyaltyCardgroupsProductModel>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Loyalty Card Groups (limited number)
   * @return data
  **/
  public List<LoyaltyCardgroupsProductModel> getData() {
    return data;
  }

  public void setData(List<LoyaltyCardgroupsProductModel> data) {
    this.data = data;
  }

  public LoyaltyCardgroupsList scrollId(String scrollId) {
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

  public LoyaltyCardgroupsList result(Boolean result) {
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

  public LoyaltyCardgroupsList meta(Object meta) {
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

  public LoyaltyCardgroupsList type(String type) {
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

  public LoyaltyCardgroupsList sum(Boolean sum) {
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

  public LoyaltyCardgroupsList lookup(List<String> lookup) {
    this.lookup = lookup;
    return this;
  }

  public LoyaltyCardgroupsList addLookupItem(String lookupItem) {
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
    LoyaltyCardgroupsList loyaltyCardgroupsList = (LoyaltyCardgroupsList) o;
    return Objects.equals(this.count, loyaltyCardgroupsList.count) &&
        Objects.equals(this.data, loyaltyCardgroupsList.data) &&
        Objects.equals(this.scrollId, loyaltyCardgroupsList.scrollId) &&
        Objects.equals(this.result, loyaltyCardgroupsList.result) &&
        Objects.equals(this.meta, loyaltyCardgroupsList.meta) &&
        Objects.equals(this.type, loyaltyCardgroupsList.type) &&
        Objects.equals(this.sum, loyaltyCardgroupsList.sum) &&
        Objects.equals(this.lookup, loyaltyCardgroupsList.lookup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data, scrollId, result, meta, type, sum, lookup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyCardgroupsList {\n");
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

