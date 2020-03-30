package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.LoyaltyCardsProductModel;
import java.util.ArrayList;
import java.util.List;

/**
 * LoyaltyCardsList
 */
public class LoyaltyCardsList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<LoyaltyCardsProductModel> data = null;

  public LoyaltyCardsList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of existing loyalty cards
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public LoyaltyCardsList data(List<LoyaltyCardsProductModel> data) {
    this.data = data;
    return this;
  }

  public LoyaltyCardsList addDataItem(LoyaltyCardsProductModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<LoyaltyCardsProductModel>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public List<LoyaltyCardsProductModel> getData() {
    return data;
  }

  public void setData(List<LoyaltyCardsProductModel> data) {
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
    LoyaltyCardsList loyaltyCardsList = (LoyaltyCardsList) o;
    return Objects.equals(this.count, loyaltyCardsList.count) &&
        Objects.equals(this.data, loyaltyCardsList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyCardsList {\n");
    
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

