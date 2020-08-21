package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.BankAccountDescriptor;
import java.util.Objects;

/**
 * PaymentTransactionsInstructions
 */
public class PaymentTransactionsInstructions {
  @SerializedName("lang")
  private String lang = null;

  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("payment")
  private BankAccountDescriptor payment = null;

  public PaymentTransactionsInstructions lang(String lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Language
   * @return lang
  **/
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public PaymentTransactionsInstructions amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Amount
   * @return amount
  **/
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public PaymentTransactionsInstructions currency(String currency) {
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

  public PaymentTransactionsInstructions payment(BankAccountDescriptor payment) {
    this.payment = payment;
    return this;
  }

   /**
   * Get payment
   * @return payment
  **/
  public BankAccountDescriptor getPayment() {
    return payment;
  }

  public void setPayment(BankAccountDescriptor payment) {
    this.payment = payment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransactionsInstructions paymentTransactionsInstructions = (PaymentTransactionsInstructions) o;
    return Objects.equals(this.lang, paymentTransactionsInstructions.lang) &&
        Objects.equals(this.amount, paymentTransactionsInstructions.amount) &&
        Objects.equals(this.currency, paymentTransactionsInstructions.currency) &&
        Objects.equals(this.payment, paymentTransactionsInstructions.payment);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lang, amount, currency, payment);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransactionsInstructions {\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    payment: ").append(toIndentedString(payment)).append("\n");
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

