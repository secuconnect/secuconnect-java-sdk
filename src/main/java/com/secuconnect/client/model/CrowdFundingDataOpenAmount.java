package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.CrowdFundingDataOpenAmountInsideCancelPeriod;
import com.secuconnect.client.model.CrowdFundingDataOpenAmountOutsideCancellationPeriod;
import java.util.Objects;

/**
 * Information about the open amount which is not yet paid out
 */
public class CrowdFundingDataOpenAmount {
  @SerializedName("total")
  protected Integer total = null;

  @SerializedName("outside_cancellation_period")
  protected CrowdFundingDataOpenAmountOutsideCancellationPeriod outsideCancellationPeriod = null;

  @SerializedName("inside_cancellation_period")
  protected CrowdFundingDataOpenAmountInsideCancelPeriod insideCancellationPeriod = null;

  public CrowdFundingDataOpenAmount total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total of all open transactions amounts
   * @return total
  **/
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public CrowdFundingDataOpenAmount outsideCancellationPeriod(CrowdFundingDataOpenAmountOutsideCancellationPeriod outsideCancellationPeriod) {
    this.outsideCancellationPeriod = outsideCancellationPeriod;
    return this;
  }

   /**
   * Get outsideCancellationPeriod
   * @return outsideCancellationPeriod
  **/
  public CrowdFundingDataOpenAmountOutsideCancellationPeriod getOutsideCancellationPeriod() {
    return outsideCancellationPeriod;
  }

  public void setOutsideCancellationPeriod(CrowdFundingDataOpenAmountOutsideCancellationPeriod outsideCancellationPeriod) {
    this.outsideCancellationPeriod = outsideCancellationPeriod;
  }

  public CrowdFundingDataOpenAmount insideCancellationPeriod(CrowdFundingDataOpenAmountInsideCancelPeriod insideCancellationPeriod) {
    this.insideCancellationPeriod = insideCancellationPeriod;
    return this;
  }

   /**
   * Get insideCancellationPeriod
   * @return insideCancellationPeriod
  **/
  public CrowdFundingDataOpenAmountInsideCancelPeriod getInsideCancellationPeriod() {
    return insideCancellationPeriod;
  }

  public void setInsideCancellationPeriod(CrowdFundingDataOpenAmountInsideCancelPeriod insideCancellationPeriod) {
    this.insideCancellationPeriod = insideCancellationPeriod;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrowdFundingDataOpenAmount crowdFundingDataOpenAmount = (CrowdFundingDataOpenAmount) o;
    return Objects.equals(this.total, crowdFundingDataOpenAmount.total) &&
        Objects.equals(this.outsideCancellationPeriod, crowdFundingDataOpenAmount.outsideCancellationPeriod) &&
        Objects.equals(this.insideCancellationPeriod, crowdFundingDataOpenAmount.insideCancellationPeriod);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total, outsideCancellationPeriod, insideCancellationPeriod);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrowdFundingDataOpenAmount {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    outsideCancellationPeriod: ").append(toIndentedString(outsideCancellationPeriod)).append("\n");
    sb.append("    insideCancellationPeriod: ").append(toIndentedString(insideCancellationPeriod)).append("\n");
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

