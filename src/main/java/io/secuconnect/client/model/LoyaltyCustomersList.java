package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.LoyaltyCustomersProductModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * LoyaltyCustomersList
 */
public class LoyaltyCustomersList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<LoyaltyCustomersProductModel> data = null;

  public LoyaltyCustomersList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of existing loyalty customers
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public LoyaltyCustomersList data(List<LoyaltyCustomersProductModel> data) {
    this.data = data;
    return this;
  }

  public LoyaltyCustomersList addDataItem(LoyaltyCustomersProductModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<LoyaltyCustomersProductModel>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * GET Loyalty/Customers
   * @return data
  **/
  public List<LoyaltyCustomersProductModel> getData() {
    return data;
  }

  public void setData(List<LoyaltyCustomersProductModel> data) {
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
    LoyaltyCustomersList loyaltyCustomersList = (LoyaltyCustomersList) o;
    return Objects.equals(this.count, loyaltyCustomersList.count) &&
        Objects.equals(this.data, loyaltyCustomersList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyCustomersList {\n");
    
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

