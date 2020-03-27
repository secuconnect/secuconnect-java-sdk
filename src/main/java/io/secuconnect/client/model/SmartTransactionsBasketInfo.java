package io.secuconnect.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * SmartTransactionsBasketInfo
 */
public class SmartTransactionsBasketInfo {
  @SerializedName("sum")
  private Integer sum = null;

  @SerializedName("gratuity")
  private Integer gratuity = null;

  @SerializedName("currency")
  private String currency = null;

  public SmartTransactionsBasketInfo sum(Integer sum) {
    this.sum = sum;
    return this;
  }

   /**
   * Sum
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
   * Gratuity
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
   * Currency
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

