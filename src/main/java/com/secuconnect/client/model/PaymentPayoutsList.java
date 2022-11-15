package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.PaymentPayoutsProductModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PaymentPayoutsList
 */
public class PaymentPayoutsList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<PaymentPayoutsProductModel> data = null;

  public PaymentPayoutsList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of existing payment payouts
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PaymentPayoutsList data(List<PaymentPayoutsProductModel> data) {
    this.data = data;
    return this;
  }

  public PaymentPayoutsList addDataItem(PaymentPayoutsProductModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * List of PaymentPayouts
   * @return data
  **/
  public List<PaymentPayoutsProductModel> getData() {
    return data;
  }

  public void setData(List<PaymentPayoutsProductModel> data) {
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
    PaymentPayoutsList paymentPayoutsList = (PaymentPayoutsList) o;
    return Objects.equals(this.count, paymentPayoutsList.count) &&
        Objects.equals(this.data, paymentPayoutsList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentPayoutsList {\n");
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

