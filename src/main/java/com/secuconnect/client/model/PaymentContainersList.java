package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.PaymentContainersProductModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PaymentContainersList
 */
public class PaymentContainersList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<PaymentContainersProductModel> data = null;

  public PaymentContainersList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of existing payment containers
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PaymentContainersList data(List<PaymentContainersProductModel> data) {
    this.data = data;
    return this;
  }

  public PaymentContainersList addDataItem(PaymentContainersProductModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * PaymentContainersList
   * @return data
  **/
  public List<PaymentContainersProductModel> getData() {
    return data;
  }

  public void setData(List<PaymentContainersProductModel> data) {
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
    PaymentContainersList paymentContainersList = (PaymentContainersList) o;
    return Objects.equals(this.count, paymentContainersList.count) &&
        Objects.equals(this.data, paymentContainersList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContainersList {\n");
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

