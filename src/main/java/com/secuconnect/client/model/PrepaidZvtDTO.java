package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * PrepaidZvtDTO
 */
public class PrepaidZvtDTO {
  @SerializedName("amount")
  protected Integer amount = null;

  @SerializedName("product_id")
  protected Integer productId = null;

  public PrepaidZvtDTO amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public PrepaidZvtDTO productId(Integer productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Product identifier
   * @return productId
  **/
  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrepaidZvtDTO prepaidZvtDTO = (PrepaidZvtDTO) o;
    return Objects.equals(this.amount, prepaidZvtDTO.amount) &&
        Objects.equals(this.productId, prepaidZvtDTO.productId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, productId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepaidZvtDTO {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
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

