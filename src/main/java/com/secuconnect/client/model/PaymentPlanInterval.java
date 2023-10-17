package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * PaymentPlanInterval
 */
public class PaymentPlanInterval {
  @SerializedName("unit")
  protected String unit = null;

  @SerializedName("count")
  protected Integer count = null;

  public PaymentPlanInterval unit(String unit) {
    this.unit = unit;
    return this;
  }

   /**
   * Unit:  * &#x60;\&quot;day\&quot;&#x60; * &#x60;\&quot;week\&quot;&#x60; * &#x60;\&quot;month\&quot;&#x60; * &#x60;\&quot;year\&quot;&#x60;
   * @return unit
  **/
  public String getUnit() {
    return unit;
  }

  public void setUnit(String unit) {
    this.unit = unit;
  }

  public PaymentPlanInterval count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Count of days, weeks, months or years
   * @return count
  **/
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentPlanInterval paymentPlanInterval = (PaymentPlanInterval) o;
    return Objects.equals(this.unit, paymentPlanInterval.unit) &&
        Objects.equals(this.count, paymentPlanInterval.count);
  }

  @Override
  public int hashCode() {
    return Objects.hash(unit, count);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentPlanInterval {\n");
    sb.append("    unit: ").append(toIndentedString(unit)).append("\n");
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
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

