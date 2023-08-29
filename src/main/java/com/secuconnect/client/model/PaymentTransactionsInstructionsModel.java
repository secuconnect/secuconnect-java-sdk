package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.BankAccountDescriptor;
import java.util.Objects;

/**
 * PaymentTransactionsInstructionsModel
 */
public class PaymentTransactionsInstructionsModel {
  @SerializedName("lang")
  protected String lang = "de_DE";

  @SerializedName("amount")
  protected String amount = null;

  @SerializedName("currency")
  protected String currency = null;

  @SerializedName("payment_instructions")
  protected BankAccountDescriptor paymentInstructions = null;

  public PaymentTransactionsInstructionsModel lang(String lang) {
    this.lang = lang;
    return this;
  }

   /**
   * Language code
   * @return lang
  **/
  public String getLang() {
    return lang;
  }

  public void setLang(String lang) {
    this.lang = lang;
  }

  public PaymentTransactionsInstructionsModel amount(String amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Money amount (formatted)
   * @return amount
  **/
  public String getAmount() {
    return amount;
  }

  public void setAmount(String amount) {
    this.amount = amount;
  }

  public PaymentTransactionsInstructionsModel currency(String currency) {
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

  public PaymentTransactionsInstructionsModel paymentInstructions(BankAccountDescriptor paymentInstructions) {
    this.paymentInstructions = paymentInstructions;
    return this;
  }

   /**
   * Get paymentInstructions
   * @return paymentInstructions
  **/
  public BankAccountDescriptor getPaymentInstructions() {
    return paymentInstructions;
  }

  public void setPaymentInstructions(BankAccountDescriptor paymentInstructions) {
    this.paymentInstructions = paymentInstructions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransactionsInstructionsModel paymentTransactionsInstructionsModel = (PaymentTransactionsInstructionsModel) o;
    return Objects.equals(this.lang, paymentTransactionsInstructionsModel.lang) &&
        Objects.equals(this.amount, paymentTransactionsInstructionsModel.amount) &&
        Objects.equals(this.currency, paymentTransactionsInstructionsModel.currency) &&
        Objects.equals(this.paymentInstructions, paymentTransactionsInstructionsModel.paymentInstructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lang, amount, currency, paymentInstructions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransactionsInstructionsModel {\n");
    sb.append("    lang: ").append(toIndentedString(lang)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paymentInstructions: ").append(toIndentedString(paymentInstructions)).append("\n");
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

