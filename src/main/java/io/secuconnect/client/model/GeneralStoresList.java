package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.GeneralStoresProductModel;
import java.util.ArrayList;
import java.util.List;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * GeneralStoresList
 */
public class GeneralStoresList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<GeneralStoresProductModel> data = null;

  public GeneralStoresList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of existing general stores
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public GeneralStoresList data(List<GeneralStoresProductModel> data) {
    this.data = data;
    return this;
  }

  public GeneralStoresList addDataItem(GeneralStoresProductModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<GeneralStoresProductModel>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * GeneralStoresList
   * @return data
  **/
  public List<GeneralStoresProductModel> getData() {
    return data;
  }

  public void setData(List<GeneralStoresProductModel> data) {
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
    GeneralStoresList generalStoresList = (GeneralStoresList) o;
    return Objects.equals(this.count, generalStoresList.count) &&
        Objects.equals(this.data, generalStoresList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralStoresList {\n");
    
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

