package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.CardprocessingInvoicesProductModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * CardprocessingInvoicesList
 */
public class CardprocessingInvoicesList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<CardprocessingInvoicesProductModel> data = null;

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

  public CardprocessingInvoicesList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of existing cardprocessing invoices
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public CardprocessingInvoicesList data(List<CardprocessingInvoicesProductModel> data) {
    this.data = data;
    return this;
  }

  public CardprocessingInvoicesList addDataItem(CardprocessingInvoicesProductModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<CardprocessingInvoicesProductModel>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * List of CardprocessingInvoices
   * @return data
  **/
  public List<CardprocessingInvoicesProductModel> getData() {
    return data;
  }

  public void setData(List<CardprocessingInvoicesProductModel> data) {
    this.data = data;
  }

  public CardprocessingInvoicesList scrollId(String scrollId) {
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

  public CardprocessingInvoicesList result(Boolean result) {
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

  public CardprocessingInvoicesList meta(Object meta) {
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

  public CardprocessingInvoicesList type(String type) {
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

  public CardprocessingInvoicesList sum(Boolean sum) {
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

  public CardprocessingInvoicesList lookup(List<String> lookup) {
    this.lookup = lookup;
    return this;
  }

  public CardprocessingInvoicesList addLookupItem(String lookupItem) {
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
    CardprocessingInvoicesList cardprocessingInvoicesList = (CardprocessingInvoicesList) o;
    return Objects.equals(this.count, cardprocessingInvoicesList.count) &&
        Objects.equals(this.data, cardprocessingInvoicesList.data) &&
        Objects.equals(this.scrollId, cardprocessingInvoicesList.scrollId) &&
        Objects.equals(this.result, cardprocessingInvoicesList.result) &&
        Objects.equals(this.meta, cardprocessingInvoicesList.meta) &&
        Objects.equals(this.type, cardprocessingInvoicesList.type) &&
        Objects.equals(this.sum, cardprocessingInvoicesList.sum) &&
        Objects.equals(this.lookup, cardprocessingInvoicesList.lookup);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data, scrollId, result, meta, type, sum, lookup);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardprocessingInvoicesList {\n");
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

