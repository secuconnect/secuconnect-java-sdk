package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Total amount within the cancellation period, in the smallest currency unit (e. g. Euro Cent)
 */
public class CrowdFundingDataOpenAmountInsideCancelPeriod {
  @SerializedName("total")
  protected Integer total = null;

  @SerializedName("debit")
  protected Integer debit = null;

  @SerializedName("credit_card")
  protected Integer creditCard = null;

  @SerializedName("prepay")
  protected Integer prepay = null;

  @SerializedName("sofort")
  protected Integer sofort = null;

  @SerializedName("twint")
  protected Integer twint = null;

  @SerializedName("aiia")
  protected Integer aiia = null;

  public CrowdFundingDataOpenAmountInsideCancelPeriod total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total amount in the smallest currency unit (e. g. Euro Cent)
   * @return total
  **/
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public CrowdFundingDataOpenAmountInsideCancelPeriod debit(Integer debit) {
    this.debit = debit;
    return this;
  }

   /**
   * Total amount for debit transactions, in the smallest currency unit (e. g. Euro Cent)
   * @return debit
  **/
  public Integer getDebit() {
    return debit;
  }

  public void setDebit(Integer debit) {
    this.debit = debit;
  }

  public CrowdFundingDataOpenAmountInsideCancelPeriod creditCard(Integer creditCard) {
    this.creditCard = creditCard;
    return this;
  }

   /**
   * Total amount for credit card transactions, in the smallest currency unit (e. g. Euro Cent)
   * @return creditCard
  **/
  public Integer getCreditCard() {
    return creditCard;
  }

  public void setCreditCard(Integer creditCard) {
    this.creditCard = creditCard;
  }

  public CrowdFundingDataOpenAmountInsideCancelPeriod prepay(Integer prepay) {
    this.prepay = prepay;
    return this;
  }

   /**
   * Total amount for prepayment transactions, in the smallest currency unit (e. g. Euro Cent)
   * @return prepay
  **/
  public Integer getPrepay() {
    return prepay;
  }

  public void setPrepay(Integer prepay) {
    this.prepay = prepay;
  }

  public CrowdFundingDataOpenAmountInsideCancelPeriod sofort(Integer sofort) {
    this.sofort = sofort;
    return this;
  }

   /**
   * Total amount for klarna Sofort transactions, in the smallest currency unit (e. g. Euro Cent)
   * @return sofort
  **/
  public Integer getSofort() {
    return sofort;
  }

  public void setSofort(Integer sofort) {
    this.sofort = sofort;
  }

  public CrowdFundingDataOpenAmountInsideCancelPeriod twint(Integer twint) {
    this.twint = twint;
    return this;
  }

   /**
   * Total amount for Twint transactions, in the smallest currency unit (e. g. Euro Cent)
   * @return twint
  **/
  public Integer getTwint() {
    return twint;
  }

  public void setTwint(Integer twint) {
    this.twint = twint;
  }

  public CrowdFundingDataOpenAmountInsideCancelPeriod aiia(Integer aiia) {
    this.aiia = aiia;
    return this;
  }

   /**
   * Total amount for Aiia transactions, in the smallest currency unit (e. g. Euro Cent)
   * @return aiia
  **/
  public Integer getAiia() {
    return aiia;
  }

  public void setAiia(Integer aiia) {
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
    CrowdFundingDataOpenAmountInsideCancelPeriod crowdFundingDataOpenAmountInsideCancelPeriod = (CrowdFundingDataOpenAmountInsideCancelPeriod) o;
    return Objects.equals(this.total, crowdFundingDataOpenAmountInsideCancelPeriod.total) &&
        Objects.equals(this.debit, crowdFundingDataOpenAmountInsideCancelPeriod.debit) &&
        Objects.equals(this.creditCard, crowdFundingDataOpenAmountInsideCancelPeriod.creditCard) &&
        Objects.equals(this.prepay, crowdFundingDataOpenAmountInsideCancelPeriod.prepay) &&
        Objects.equals(this.sofort, crowdFundingDataOpenAmountInsideCancelPeriod.sofort) &&
        Objects.equals(this.twint, crowdFundingDataOpenAmountInsideCancelPeriod.twint) &&
        Objects.equals(this.aiia, crowdFundingDataOpenAmountInsideCancelPeriod.aiia);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, debit, creditCard, prepay, sofort, twint, aiia);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrowdFundingDataOpenAmountInsideCancelPeriod {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

