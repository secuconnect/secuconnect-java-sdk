package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.PaymentCustomersProductModel;
import java.util.ArrayList;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * PaymentCustomersList
 */
public class PaymentCustomersList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<PaymentCustomersProductModel> data = null;

  public PaymentCustomersList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of existing payment customers
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PaymentCustomersList data(List<PaymentCustomersProductModel> data) {
    this.data = data;
    return this;
  }

  public PaymentCustomersList addDataItem(PaymentCustomersProductModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<PaymentCustomersProductModel>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public List<PaymentCustomersProductModel> getData() {
    return data;
  }

  public void setData(List<PaymentCustomersProductModel> data) {
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
    PaymentCustomersList paymentCustomersList = (PaymentCustomersList) o;
    return Objects.equals(this.count, paymentCustomersList.count) &&
        Objects.equals(this.data, paymentCustomersList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCustomersList {\n");
    
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

