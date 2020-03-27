package io.secuconnect.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;

/**
 * GeneralMerchantsList
 */
public class GeneralMerchantsList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<GeneralMerchantsProductModel> data = null;

  public GeneralMerchantsList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of existing general merchants
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public GeneralMerchantsList data(List<GeneralMerchantsProductModel> data) {
    this.data = data;
    return this;
  }

  public GeneralMerchantsList addDataItem(GeneralMerchantsProductModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<GeneralMerchantsProductModel>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * GeneralMerchantsList
   * @return data
  **/
  public List<GeneralMerchantsProductModel> getData() {
    return data;
  }

  public void setData(List<GeneralMerchantsProductModel> data) {
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
    GeneralMerchantsList generalMerchantsList = (GeneralMerchantsList) o;
    return Objects.equals(this.count, generalMerchantsList.count) &&
        Objects.equals(this.data, generalMerchantsList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralMerchantsList {\n");
    
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

