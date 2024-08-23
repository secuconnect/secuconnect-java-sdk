package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.PaymentMethodBreakdown;
import java.util.Objects;

/**
 * Details of the project transaction count and total amount per payment method
 */
public class CrowdFundingDataDetails {
  @SerializedName("currency")
  protected String currency = null;

  @SerializedName("debit")
  protected PaymentMethodBreakdown debit = null;

  @SerializedName("credit_card")
  protected PaymentMethodBreakdown creditCard = null;

  @SerializedName("prepay")
  protected PaymentMethodBreakdown prepay = null;

  @SerializedName("sofort")
  protected PaymentMethodBreakdown sofort = null;

  @SerializedName("twint")
  protected PaymentMethodBreakdown twint = null;

  @SerializedName("aiia")
  protected PaymentMethodBreakdown aiia = null;

  public CrowdFundingDataDetails currency(String currency) {
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

  public CrowdFundingDataDetails debit(PaymentMethodBreakdown debit) {
    this.debit = debit;
    return this;
  }

   /**
   * Get debit
   * @return debit
  **/
  public PaymentMethodBreakdown getDebit() {
    return debit;
  }

  public void setDebit(PaymentMethodBreakdown debit) {
    this.debit = debit;
  }

  public CrowdFundingDataDetails creditCard(PaymentMethodBreakdown creditCard) {
    this.creditCard = creditCard;
    return this;
  }

   /**
   * Get creditCard
   * @return creditCard
  **/
  public PaymentMethodBreakdown getCreditCard() {
    return creditCard;
  }

  public void setCreditCard(PaymentMethodBreakdown creditCard) {
    this.creditCard = creditCard;
  }

  public CrowdFundingDataDetails prepay(PaymentMethodBreakdown prepay) {
    this.prepay = prepay;
    return this;
  }

   /**
   * Get prepay
   * @return prepay
  **/
  public PaymentMethodBreakdown getPrepay() {
    return prepay;
  }

  public void setPrepay(PaymentMethodBreakdown prepay) {
    this.prepay = prepay;
  }

  public CrowdFundingDataDetails sofort(PaymentMethodBreakdown sofort) {
    this.sofort = sofort;
    return this;
  }

   /**
   * Get sofort
   * @return sofort
  **/
  public PaymentMethodBreakdown getSofort() {
    return sofort;
  }

  public void setSofort(PaymentMethodBreakdown sofort) {
    this.sofort = sofort;
  }

  public CrowdFundingDataDetails twint(PaymentMethodBreakdown twint) {
    this.twint = twint;
    return this;
  }

   /**
   * Get twint
   * @return twint
  **/
  public PaymentMethodBreakdown getTwint() {
    return twint;
  }

  public void setTwint(PaymentMethodBreakdown twint) {
    this.twint = twint;
  }

  public CrowdFundingDataDetails aiia(PaymentMethodBreakdown aiia) {
    this.aiia = aiia;
    return this;
  }

   /**
   * Get aiia
   * @return aiia
  **/
  public PaymentMethodBreakdown getAiia() {
    return aiia;
  }

  public void setAiia(PaymentMethodBreakdown aiia) {
    this.aiia = aiia;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrowdFundingDataDetails crowdFundingDataDetails = (CrowdFundingDataDetails) o;
    return Objects.equals(this.currency, crowdFundingDataDetails.currency) &&
        Objects.equals(this.debit, crowdFundingDataDetails.debit) &&
        Objects.equals(this.creditCard, crowdFundingDataDetails.creditCard) &&
        Objects.equals(this.prepay, crowdFundingDataDetails.prepay) &&
        Objects.equals(this.sofort, crowdFundingDataDetails.sofort) &&
        Objects.equals(this.twint, crowdFundingDataDetails.twint) &&
        Objects.equals(this.aiia, crowdFundingDataDetails.aiia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, debit, creditCard, prepay, sofort, twint, aiia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrowdFundingDataDetails {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    debit: ").append(toIndentedString(debit)).append("\n");
    sb.append("    creditCard: ").append(toIndentedString(creditCard)).append("\n");
    sb.append("    prepay: ").append(toIndentedString(prepay)).append("\n");
    sb.append("    sofort: ").append(toIndentedString(sofort)).append("\n");
    sb.append("    twint: ").append(toIndentedString(twint)).append("\n");
    sb.append("    aiia: ").append(toIndentedString(aiia)).append("\n");
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

