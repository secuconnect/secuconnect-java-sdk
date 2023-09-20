package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.CrowdFundingDataDetails;
import com.secuconnect.client.model.CrowdFundingDataOpenAmount;
import java.util.Objects;

/**
 * PaymentCrowdFundingData
 */
public class PaymentCrowdFundingData {
  @SerializedName("project")
  protected CrowdFundingDataDetails project = null;

  @SerializedName("deposited_amount")
  protected Integer depositedAmount = null;

  @SerializedName("paid_out")
  protected Integer paidOut = null;

  @SerializedName("deducted_amount")
  protected Integer deductedAmount = null;

  @SerializedName("open")
  protected CrowdFundingDataOpenAmount open = null;

  @SerializedName("result")
  protected Boolean result = null;

  public PaymentCrowdFundingData project(CrowdFundingDataDetails project) {
    this.project = project;
    return this;
  }

   /**
   * Get project
   * @return project
  **/
  public CrowdFundingDataDetails getProject() {
    return project;
  }

  public void setProject(CrowdFundingDataDetails project) {
    this.project = project;
  }

  public PaymentCrowdFundingData depositedAmount(Integer depositedAmount) {
    this.depositedAmount = depositedAmount;
    return this;
  }

   /**
   * Total deposited amount of all transactions for this merchant
   * @return depositedAmount
  **/
  public Integer getDepositedAmount() {
    return depositedAmount;
  }

  public void setDepositedAmount(Integer depositedAmount) {
    this.depositedAmount = depositedAmount;
  }

  public PaymentCrowdFundingData paidOut(Integer paidOut) {
    this.paidOut = paidOut;
    return this;
  }

   /**
   * Total paid out amount of all transactions for this merchant
   * @return paidOut
  **/
  public Integer getPaidOut() {
    return paidOut;
  }

  public void setPaidOut(Integer paidOut) {
    this.paidOut = paidOut;
  }

  public PaymentCrowdFundingData deductedAmount(Integer deductedAmount) {
    this.deductedAmount = deductedAmount;
    return this;
  }

   /**
   * Total deducted amount of all transactions for this merchant
   * @return deductedAmount
  **/
  public Integer getDeductedAmount() {
    return deductedAmount;
  }

  public void setDeductedAmount(Integer deductedAmount) {
    this.deductedAmount = deductedAmount;
  }

  public PaymentCrowdFundingData open(CrowdFundingDataOpenAmount open) {
    this.open = open;
    return this;
  }

   /**
   * Get open
   * @return open
  **/
  public CrowdFundingDataOpenAmount getOpen() {
    return open;
  }

  public void setOpen(CrowdFundingDataOpenAmount open) {
    this.open = open;
  }

  public PaymentCrowdFundingData result(Boolean result) {
    this.result = result;
    return this;
  }

   /**
   * This field is returned if the contract doesn&#x27;t have crowdfunding contract condition
   * @return result
  **/
  public Boolean getResult() {
    return result;
  }

  public void setResult(Boolean result) {
    this.result = result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentCrowdFundingData paymentCrowdFundingData = (PaymentCrowdFundingData) o;
    return Objects.equals(this.project, paymentCrowdFundingData.project) &&
        Objects.equals(this.depositedAmount, paymentCrowdFundingData.depositedAmount) &&
        Objects.equals(this.paidOut, paymentCrowdFundingData.paidOut) &&
        Objects.equals(this.deductedAmount, paymentCrowdFundingData.deductedAmount) &&
        Objects.equals(this.open, paymentCrowdFundingData.open) &&
        Objects.equals(this.result, paymentCrowdFundingData.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, depositedAmount, paidOut, deductedAmount, open, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCrowdFundingData {\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    depositedAmount: ").append(toIndentedString(depositedAmount)).append("\n");
    sb.append("    paidOut: ").append(toIndentedString(paidOut)).append("\n");
    sb.append("    deductedAmount: ").append(toIndentedString(deductedAmount)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

