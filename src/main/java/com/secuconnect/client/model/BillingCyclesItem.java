package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.PaymentPlanInterval;
import java.util.Objects;

/**
 * BillingCyclesItem
 */
public class BillingCyclesItem {
  @SerializedName("sequence")
  protected Integer sequence = null;

  @SerializedName("interval")
  protected PaymentPlanInterval interval = null;

  @SerializedName("tenure_type")
  protected String tenureType = null;

  @SerializedName("total_cycles")
  protected Integer totalCycles = null;

  @SerializedName("price")
  protected Integer price = null;

  public BillingCyclesItem sequence(Integer sequence) {
    this.sequence = sequence;
    return this;
  }

   /**
   * sequence
   * @return sequence
  **/
  public Integer getSequence() {
    return sequence;
  }

  public void setSequence(Integer sequence) {
    this.sequence = sequence;
  }

  public BillingCyclesItem interval(PaymentPlanInterval interval) {
    this.interval = interval;
    return this;
  }

   /**
   * Get interval
   * @return interval
  **/
  public PaymentPlanInterval getInterval() {
    return interval;
  }

  public void setInterval(PaymentPlanInterval interval) {
    this.interval = interval;
  }

  public BillingCyclesItem tenureType(String tenureType) {
    this.tenureType = tenureType;
    return this;
  }

   /**
   * Tenure type
   * @return tenureType
  **/
  public String getTenureType() {
    return tenureType;
  }

  public void setTenureType(String tenureType) {
    this.tenureType = tenureType;
  }

  public BillingCyclesItem totalCycles(Integer totalCycles) {
    this.totalCycles = totalCycles;
    return this;
  }

   /**
   * Total cycles
   * @return totalCycles
  **/
  public Integer getTotalCycles() {
    return totalCycles;
  }

  public void setTotalCycles(Integer totalCycles) {
    this.totalCycles = totalCycles;
  }

  public BillingCyclesItem price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BillingCyclesItem billingCyclesItem = (BillingCyclesItem) o;
    return Objects.equals(this.sequence, billingCyclesItem.sequence) &&
        Objects.equals(this.interval, billingCyclesItem.interval) &&
        Objects.equals(this.tenureType, billingCyclesItem.tenureType) &&
        Objects.equals(this.totalCycles, billingCyclesItem.totalCycles) &&
        Objects.equals(this.price, billingCyclesItem.price);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sequence, interval, tenureType, totalCycles, price);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BillingCyclesItem {\n");
    sb.append("    sequence: ").append(toIndentedString(sequence)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    tenureType: ").append(toIndentedString(tenureType)).append("\n");
    sb.append("    totalCycles: ").append(toIndentedString(totalCycles)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
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

