package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.PaymentInvoicesProductModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PaymentInvoicesList
 */
public class PaymentInvoicesList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<PaymentInvoicesProductModel> data = null;

  public PaymentInvoicesList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of existing payment invoices
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PaymentInvoicesList data(List<PaymentInvoicesProductModel> data) {
    this.data = data;
    return this;
  }

  public PaymentInvoicesList addDataItem(PaymentInvoicesProductModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * List of PaymentInvoices
   * @return data
  **/
  public List<PaymentInvoicesProductModel> getData() {
    return data;
  }

  public void setData(List<PaymentInvoicesProductModel> data) {
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
    PaymentInvoicesList paymentInvoicesList = (PaymentInvoicesList) o;
    return Objects.equals(this.count, paymentInvoicesList.count) &&
        Objects.equals(this.data, paymentInvoicesList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInvoicesList {\n");
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

