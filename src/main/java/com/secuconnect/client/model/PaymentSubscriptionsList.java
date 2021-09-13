package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.PaymentSubscriptionsProductModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PaymentSubscriptionsList
 */
public class PaymentSubscriptionsList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<PaymentSubscriptionsProductModel> data = null;

  public PaymentSubscriptionsList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of existing subscriptions
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PaymentSubscriptionsList data(List<PaymentSubscriptionsProductModel> data) {
    this.data = data;
    return this;
  }

  public PaymentSubscriptionsList addDataItem(PaymentSubscriptionsProductModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * List of PaymentSubscriptions
   * @return data
  **/
  public List<PaymentSubscriptionsProductModel> getData() {
    return data;
  }

  public void setData(List<PaymentSubscriptionsProductModel> data) {
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
    PaymentSubscriptionsList paymentSubscriptionsList = (PaymentSubscriptionsList) o;
    return Objects.equals(this.count, paymentSubscriptionsList.count) &&
        Objects.equals(this.data, paymentSubscriptionsList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSubscriptionsList {\n");
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

