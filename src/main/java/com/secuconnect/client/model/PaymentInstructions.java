package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.BankAccountDescriptor;
import java.util.Objects;

/**
 * PaymentInstructions
 */
public class PaymentInstructions extends BankAccountDescriptor {
  @SerializedName("girocode_url")
  private String girocodeUrl = null;

  @SerializedName("interest")
  private Integer interest = null;

  @SerializedName("total_value")
  private Integer totalValue = null;

  @SerializedName("number_of_installments")
  private Integer numberOfInstallments = null;

  @SerializedName("installment")
  private Integer installment = null;

  @SerializedName("last_installment")
  private Integer lastInstallment = null;

  public PaymentInstructions girocodeUrl(String girocodeUrl) {
    this.girocodeUrl = girocodeUrl;
    return this;
  }

   /**
   * Url to generated GiroCode
   * @return girocodeUrl
  **/
  public String getGirocodeUrl() {
    return girocodeUrl;
  }

  public void setGirocodeUrl(String girocodeUrl) {
    this.girocodeUrl = girocodeUrl;
  }

  public PaymentInstructions interest(Integer interest) {
    this.interest = interest;
    return this;
  }

   /**
   * Total amount of interest for easyCredit transaction
   * @return interest
  **/
  public Integer getInterest() {
    return interest;
  }

  public void setInterest(Integer interest) {
    this.interest = interest;
  }

  public PaymentInstructions totalValue(Integer totalValue) {
    this.totalValue = totalValue;
    return this;
  }

   /**
   * Total amount of basket &amp; interest for easyCredit transaction
   * @return totalValue
  **/
  public Integer getTotalValue() {
    return totalValue;
  }

  public void setTotalValue(Integer totalValue) {
    this.totalValue = totalValue;
  }

  public PaymentInstructions numberOfInstallments(Integer numberOfInstallments) {
    this.numberOfInstallments = numberOfInstallments;
    return this;
  }

   /**
   * Number of installments for easyCredit transaction
   * @return numberOfInstallments
  **/
  public Integer getNumberOfInstallments() {
    return numberOfInstallments;
  }

  public void setNumberOfInstallments(Integer numberOfInstallments) {
    this.numberOfInstallments = numberOfInstallments;
  }

  public PaymentInstructions installment(Integer installment) {
    this.installment = installment;
    return this;
  }

   /**
   * The monthly payment for easyCredit transaction
   * @return installment
  **/
  public Integer getInstallment() {
    return installment;
  }

  public void setInstallment(Integer installment) {
    this.installment = installment;
  }

  public PaymentInstructions lastInstallment(Integer lastInstallment) {
    this.lastInstallment = lastInstallment;
    return this;
  }

   /**
   * The last installment payment for easyCredit transaction
   * @return lastInstallment
  **/
  public Integer getLastInstallment() {
    return lastInstallment;
  }

  public void setLastInstallment(Integer lastInstallment) {
    this.lastInstallment = lastInstallment;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstructions paymentInstructions = (PaymentInstructions) o;
    return Objects.equals(this.girocodeUrl, paymentInstructions.girocodeUrl) &&
        Objects.equals(this.interest, paymentInstructions.interest) &&
        Objects.equals(this.totalValue, paymentInstructions.totalValue) &&
        Objects.equals(this.numberOfInstallments, paymentInstructions.numberOfInstallments) &&
        Objects.equals(this.installment, paymentInstructions.installment) &&
        Objects.equals(this.lastInstallment, paymentInstructions.lastInstallment) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(girocodeUrl, interest, totalValue, numberOfInstallments, installment, lastInstallment, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstructions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    girocodeUrl: ").append(toIndentedString(girocodeUrl)).append("\n");
    sb.append("    interest: ").append(toIndentedString(interest)).append("\n");
    sb.append("    totalValue: ").append(toIndentedString(totalValue)).append("\n");
    sb.append("    numberOfInstallments: ").append(toIndentedString(numberOfInstallments)).append("\n");
    sb.append("    installment: ").append(toIndentedString(installment)).append("\n");
    sb.append("    lastInstallment: ").append(toIndentedString(lastInstallment)).append("\n");
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

