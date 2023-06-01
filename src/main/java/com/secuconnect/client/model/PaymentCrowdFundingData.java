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

  @SerializedName("paid_out")
  protected Integer paidOut = null;

  @SerializedName("open")
  protected CrowdFundingDataOpenAmount open = null;

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

  public PaymentCrowdFundingData paidOut(Integer paidOut) {
    this.paidOut = paidOut;
    return this;
  }

   /**
   * Total transaction amount of all transactions for this merchant
   * @return paidOut
  **/
  public Integer getPaidOut() {
    return paidOut;
  }

  public void setPaidOut(Integer paidOut) {
    this.paidOut = paidOut;
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
        Objects.equals(this.paidOut, paymentCrowdFundingData.paidOut) &&
        Objects.equals(this.open, paymentCrowdFundingData.open);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, paidOut, open);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCrowdFundingData {\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    paidOut: ").append(toIndentedString(paidOut)).append("\n");
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
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

