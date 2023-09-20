package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Basket information
 */
public class SmartTransactionsBasketInfo {
  @SerializedName("sum")
  protected Integer sum = null;

  @SerializedName("gratuity")
  protected Integer gratuity = null;

  @SerializedName("currency")
  protected String currency = null;

  public SmartTransactionsBasketInfo sum(Integer sum) {
    this.sum = sum;
    return this;
  }

   /**
   * Amount in the smallest currency unit (e. g. Euro Cent)  If there is a basket, it must equal the basket total.
   * @return sum
  **/
  public Integer getSum() {
    return sum;
  }

  public void setSum(Integer sum) {
    this.sum = sum;
  }

  public SmartTransactionsBasketInfo gratuity(Integer gratuity) {
    this.gratuity = gratuity;
    return this;
  }

   /**
   * Tips included in the smallest currency unit (e.g. Euro Cent)
   * @return gratuity
  **/
  public Integer getGratuity() {
    return gratuity;
  }

  public void setGratuity(Integer gratuity) {
    this.gratuity = gratuity;
  }

  public SmartTransactionsBasketInfo currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsBasketInfo smartTransactionsBasketInfo = (SmartTransactionsBasketInfo) o;
    return Objects.equals(this.sum, smartTransactionsBasketInfo.sum) &&
        Objects.equals(this.gratuity, smartTransactionsBasketInfo.gratuity) &&
        Objects.equals(this.currency, smartTransactionsBasketInfo.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sum, gratuity, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsBasketInfo {\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    gratuity: ").append(toIndentedString(gratuity)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

