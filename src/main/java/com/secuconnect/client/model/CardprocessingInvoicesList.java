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
      this.data = new ArrayList<>();
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
        Objects.equals(this.data, cardprocessingInvoicesList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardprocessingInvoicesList {\n");
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

