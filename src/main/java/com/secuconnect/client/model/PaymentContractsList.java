package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.PaymentContractsProductModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PaymentContractsList
 */
public class PaymentContractsList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<PaymentContractsProductModel> data = null;

  public PaymentContractsList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of existing payment contracts
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PaymentContractsList data(List<PaymentContractsProductModel> data) {
    this.data = data;
    return this;
  }

  public PaymentContractsList addDataItem(PaymentContractsProductModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public List<PaymentContractsProductModel> getData() {
    return data;
  }

  public void setData(List<PaymentContractsProductModel> data) {
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
    PaymentContractsList paymentContractsList = (PaymentContractsList) o;
    return Objects.equals(this.count, paymentContractsList.count) &&
        Objects.equals(this.data, paymentContractsList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContractsList {\n");
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

