package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Open total of transaction which inside of the cancellation period
 */
public class CrowdFundingDataOpenAmountInsideCancelPeriod {
  @SerializedName("total")
  private Integer total = null;

  @SerializedName("debit")
  private Integer debit = null;

  @SerializedName("credit_card")
  private Integer creditCard = null;

  @SerializedName("prepay")
  private Integer prepay = null;

  @SerializedName("sofort")
  private Integer sofort = null;

  @SerializedName("twint")
  private Integer twint = null;

  public CrowdFundingDataOpenAmountInsideCancelPeriod total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total of all open amounts
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
   * Total of debit open amounts
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
   * Total of credit card open amounts
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
   * Total of prepay open amounts
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
   * Total of sofort open amounts
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
   * Total of twint open amounts
   * @return twint
  **/
  public Integer getTwint() {
    return twint;
  }

  public void setTwint(Integer twint) {
    this.twint = twint;
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
        Objects.equals(this.twint, crowdFundingDataOpenAmountInsideCancelPeriod.twint);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, debit, creditCard, prepay, sofort, twint);
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

