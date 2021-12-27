package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Information for a specific payment method transaction count and transaction amount
 */
public class PaymentMethodBreakdown {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("amount")
  private Integer amount = null;

  public PaymentMethodBreakdown count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Count of the transactions
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public PaymentMethodBreakdown amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Total transaction amount
   * @return amount
  **/
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMethodBreakdown paymentMethodBreakdown = (PaymentMethodBreakdown) o;
    return Objects.equals(this.count, paymentMethodBreakdown.count) &&
        Objects.equals(this.amount, paymentMethodBreakdown.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMethodBreakdown {\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

