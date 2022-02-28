package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * PaymentTransactionsIncreaseAmountDTO
 */
public class PaymentTransactionsIncreaseAmountDTO {
  @SerializedName("amount")
  private Integer amount = null;

  public PaymentTransactionsIncreaseAmountDTO amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * The raised amount of the transaction
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
    PaymentTransactionsIncreaseAmountDTO paymentTransactionsIncreaseAmountDTO = (PaymentTransactionsIncreaseAmountDTO) o;
    return Objects.equals(this.amount, paymentTransactionsIncreaseAmountDTO.amount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransactionsIncreaseAmountDTO {\n");
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

