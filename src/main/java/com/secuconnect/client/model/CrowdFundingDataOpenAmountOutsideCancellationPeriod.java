package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Open total of transaction which outside of the cancellation period
 */
public class CrowdFundingDataOpenAmountOutsideCancellationPeriod {
  @SerializedName("total")
  protected Integer total = null;

  public CrowdFundingDataOpenAmountOutsideCancellationPeriod total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Open transaction amount
   * @return total
  **/
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CrowdFundingDataOpenAmountOutsideCancellationPeriod crowdFundingDataOpenAmountOutsideCancellationPeriod = (CrowdFundingDataOpenAmountOutsideCancellationPeriod) o;
    return Objects.equals(this.total, crowdFundingDataOpenAmountOutsideCancellationPeriod.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CrowdFundingDataOpenAmountOutsideCancellationPeriod {\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

