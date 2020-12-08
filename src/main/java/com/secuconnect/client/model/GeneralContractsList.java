package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.GeneralContractsProductModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GeneralContractsList
 */
public class GeneralContractsList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<GeneralContractsProductModel> data = null;

  public GeneralContractsList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of matching General Contracts
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public GeneralContractsList data(List<GeneralContractsProductModel> data) {
    this.data = data;
    return this;
  }

  public GeneralContractsList addDataItem(GeneralContractsProductModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * GeneralContractsList
   * @return data
  **/
  public List<GeneralContractsProductModel> getData() {
    return data;
  }

  public void setData(List<GeneralContractsProductModel> data) {
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
    GeneralContractsList generalContractsList = (GeneralContractsList) o;
    return Objects.equals(this.count, generalContractsList.count) &&
        Objects.equals(this.data, generalContractsList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralContractsList {\n");
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

