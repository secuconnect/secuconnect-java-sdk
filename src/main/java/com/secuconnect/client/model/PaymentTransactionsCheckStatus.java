package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * PaymentTransactionsCheckStatus
 */
public class PaymentTransactionsCheckStatus {
  @SerializedName("status")
  private Integer status = null;

  @SerializedName("status_text")
  private String statusText = null;

  @SerializedName("status_simple")
  private Integer statusSimple = null;

  @SerializedName("status_simple_text")
  private String statusSimpleText = null;

  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("currency")
  private String currency = null;

  public PaymentTransactionsCheckStatus status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Transaction status ID
   * @return status
  **/
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public PaymentTransactionsCheckStatus statusText(String statusText) {
    this.statusText = statusText;
    return this;
  }

   /**
   * Transaction status description
   * @return statusText
  **/
  public String getStatusText() {
    return statusText;
  }

  public void setStatusText(String statusText) {
    this.statusText = statusText;
  }

  public PaymentTransactionsCheckStatus statusSimple(Integer statusSimple) {
    this.statusSimple = statusSimple;
    return this;
  }

   /**
   * Transaction simple-status ID
   * @return statusSimple
  **/
  public Integer getStatusSimple() {
    return statusSimple;
  }

  public void setStatusSimple(Integer statusSimple) {
    this.statusSimple = statusSimple;
  }

  public PaymentTransactionsCheckStatus statusSimpleText(String statusSimpleText) {
    this.statusSimpleText = statusSimpleText;
    return this;
  }

   /**
   * Transaction simple-status description
   * @return statusSimpleText
  **/
  public String getStatusSimpleText() {
    return statusSimpleText;
  }

  public void setStatusSimpleText(String statusSimpleText) {
    this.statusSimpleText = statusSimpleText;
  }

  public PaymentTransactionsCheckStatus amount(Integer amount) {
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

  public PaymentTransactionsCheckStatus currency(String currency) {
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
    PaymentTransactionsCheckStatus paymentTransactionsCheckStatus = (PaymentTransactionsCheckStatus) o;
    return Objects.equals(this.status, paymentTransactionsCheckStatus.status) &&
        Objects.equals(this.statusText, paymentTransactionsCheckStatus.statusText) &&
        Objects.equals(this.statusSimple, paymentTransactionsCheckStatus.statusSimple) &&
        Objects.equals(this.statusSimpleText, paymentTransactionsCheckStatus.statusSimpleText) &&
        Objects.equals(this.amount, paymentTransactionsCheckStatus.amount) &&
        Objects.equals(this.currency, paymentTransactionsCheckStatus.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, statusText, statusSimple, statusSimpleText, amount, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransactionsCheckStatus {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
    sb.append("    statusSimple: ").append(toIndentedString(statusSimple)).append("\n");
    sb.append("    statusSimpleText: ").append(toIndentedString(statusSimpleText)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

