package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * PrepaidSalesProductDTO
 */
public class PrepaidSalesProductDTO {
  @SerializedName("item")
  protected String item = null;

  public PrepaidSalesProductDTO item(String item) {
    this.item = item;
    return this;
  }

   /**
   * Prepaid Sales Transaction ID
   * @return item
  **/
  public String getItem() {
    return item;
  }

  public void setItem(String item) {
    this.item = item;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrepaidSalesProductDTO prepaidSalesProductDTO = (PrepaidSalesProductDTO) o;
    return Objects.equals(this.item, prepaidSalesProductDTO.item);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepaidSalesProductDTO {\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
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

