package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.PaymentTransactionsProductModel;
import java.util.ArrayList;
import java.util.List;

/**
 * PaymentTransactionsCancelList1
 */
public class PaymentTransactionsCancelList1 {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<PaymentTransactionsProductModel> data = null;

  public PaymentTransactionsCancelList1 count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Count of returned payment contracts
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PaymentTransactionsCancelList1 data(List<PaymentTransactionsProductModel> data) {
    this.data = data;
    return this;
  }

  public PaymentTransactionsCancelList1 addDataItem(PaymentTransactionsProductModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<PaymentTransactionsProductModel>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public List<PaymentTransactionsProductModel> getData() {
    return data;
  }

  public void setData(List<PaymentTransactionsProductModel> data) {
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
    PaymentTransactionsCancelList1 paymentTransactionsCancelList1 = (PaymentTransactionsCancelList1) o;
    return Objects.equals(this.count, paymentTransactionsCancelList1.count) &&
        Objects.equals(this.data, paymentTransactionsCancelList1.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransactionsCancelList1 {\n");
    
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

