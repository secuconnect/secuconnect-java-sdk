package io.secuconnect.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * LoyaltyCardgroupsList
 */
public class LoyaltyCardgroupsList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<LoyaltyCardgroupsProductModel> data = null;

  public LoyaltyCardgroupsList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of existing loyalty card groups
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public LoyaltyCardgroupsList data(List<LoyaltyCardgroupsProductModel> data) {
    this.data = data;
    return this;
  }

  public LoyaltyCardgroupsList addDataItem(LoyaltyCardgroupsProductModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<LoyaltyCardgroupsProductModel>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public List<LoyaltyCardgroupsProductModel> getData() {
    return data;
  }

  public void setData(List<LoyaltyCardgroupsProductModel> data) {
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
    LoyaltyCardgroupsList loyaltyCardgroupsList = (LoyaltyCardgroupsList) o;
    return Objects.equals(this.count, loyaltyCardgroupsList.count) &&
        Objects.equals(this.data, loyaltyCardgroupsList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyCardgroupsList {\n");
    
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

