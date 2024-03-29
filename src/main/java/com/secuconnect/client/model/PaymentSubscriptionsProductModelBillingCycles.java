package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.CycleExecutions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Billing cycles
 */
public class PaymentSubscriptionsProductModelBillingCycles {
  @SerializedName("cycle_executions")
  protected List<CycleExecutions> cycleExecutions = null;

  @SerializedName("next_billing_time")
  protected String nextBillingTime = null;

  public PaymentSubscriptionsProductModelBillingCycles cycleExecutions(List<CycleExecutions> cycleExecutions) {
    this.cycleExecutions = cycleExecutions;
    return this;
  }

  public PaymentSubscriptionsProductModelBillingCycles addCycleExecutionsItem(CycleExecutions cycleExecutionsItem) {
    if (this.cycleExecutions == null) {
      this.cycleExecutions = new ArrayList<CycleExecutions>();
    }
    this.cycleExecutions.add(cycleExecutionsItem);
    return this;
  }

   /**
   * cycle executions
   * @return cycleExecutions
  **/
  public List<CycleExecutions> getCycleExecutions() {
    return cycleExecutions;
  }

  public void setCycleExecutions(List<CycleExecutions> cycleExecutions) {
    this.cycleExecutions = cycleExecutions;
  }

  public PaymentSubscriptionsProductModelBillingCycles nextBillingTime(String nextBillingTime) {
    this.nextBillingTime = nextBillingTime;
    return this;
  }

   /**
   * Next billing time (ISO 8601 date and time)
   * @return nextBillingTime
  **/
  public String getNextBillingTime() {
    return nextBillingTime;
  }

  public void setNextBillingTime(String nextBillingTime) {
    this.nextBillingTime = nextBillingTime;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentSubscriptionsProductModelBillingCycles paymentSubscriptionsProductModelBillingCycles = (PaymentSubscriptionsProductModelBillingCycles) o;
    return Objects.equals(this.cycleExecutions, paymentSubscriptionsProductModelBillingCycles.cycleExecutions) &&
        Objects.equals(this.nextBillingTime, paymentSubscriptionsProductModelBillingCycles.nextBillingTime);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cycleExecutions, nextBillingTime);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSubscriptionsProductModelBillingCycles {\n");
    sb.append("    cycleExecutions: ").append(toIndentedString(cycleExecutions)).append("\n");
    sb.append("    nextBillingTime: ").append(toIndentedString(nextBillingTime)).append("\n");
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

