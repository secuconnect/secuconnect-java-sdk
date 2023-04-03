package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.PaymentPlansProductModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PaymentPlansList
 */
public class PaymentPlansList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<PaymentPlansProductModel> data = null;

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

  public PaymentPlansList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of existing plans
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PaymentPlansList data(List<PaymentPlansProductModel> data) {
    this.data = data;
    return this;
  }

  public PaymentPlansList addDataItem(PaymentPlansProductModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<PaymentPlansProductModel>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * List of PaymentPlans
   * @return data
  **/
  public List<PaymentPlansProductModel> getData() {
    return data;
  }

  public void setData(List<PaymentPlansProductModel> data) {
    this.data = data;
  }

  public PaymentPlansList scrollId(String scrollId) {
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

  public PaymentPlansList result(Boolean result) {
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

  public PaymentPlansList meta(Object meta) {
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

  public PaymentPlansList type(String type) {
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

  public PaymentPlansList sum(Boolean sum) {
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

  public PaymentPlansList lookup(List<String> lookup) {
    this.lookup = lookup;
    return this;
  }

  public PaymentPlansList addLookupItem(String lookupItem) {
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
    PaymentPlansList paymentPlansList = (PaymentPlansList) o;
    return Objects.equals(this.count, paymentPlansList.count) &&
        Objects.equals(this.data, paymentPlansList.data) &&
        Objects.equals(this.scrollId, paymentPlansList.scrollId) &&
        Objects.equals(this.result, paymentPlansList.result) &&
        Objects.equals(this.meta, paymentPlansList.meta) &&
        Objects.equals(this.type, paymentPlansList.type) &&
        Objects.equals(this.sum, paymentPlansList.sum) &&
        Objects.equals(this.lookup, paymentPlansList.lookup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data, scrollId, result, meta, type, sum, lookup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentPlansList {\n");
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

