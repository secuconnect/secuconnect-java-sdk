package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Aggregation options
 */
public class Aggregate {
  @SerializedName("timestamp_prop")
  protected String timestampProp = null;

  @SerializedName("interval")
  protected String interval = "week";

  @SerializedName("min")
  protected Integer min = null;

  @SerializedName("max")
  protected Integer max = null;

  @SerializedName("group_by_prop")
  protected String groupByProp = null;

  @SerializedName("sum_by_prop")
  protected String sumByProp = null;

  public Aggregate timestampProp(String timestampProp) {
    this.timestampProp = timestampProp;
    return this;
  }

   /**
   * The name of the field on which to perform the date aggregation.
   * @return timestampProp
  **/
  public String getTimestampProp() {
    return timestampProp;
  }

  public void setTimestampProp(String timestampProp) {
    this.timestampProp = timestampProp;
  }

  public Aggregate interval(String interval) {
    this.interval = interval;
    return this;
  }

   /**
   * The interval by which documents will be bucketed (calendar interval or fixed).
   * @return interval
  **/
  public String getInterval() {
    return interval;
  }

  public void setInterval(String interval) {
    this.interval = interval;
  }

  public Aggregate min(Integer min) {
    this.min = min;
    return this;
  }

   /**
   * Enables extending the bounds of the histogram beyond the data itself.
   * @return min
  **/
  public Integer getMin() {
    return min;
  }

  public void setMin(Integer min) {
    this.min = min;
  }

  public Aggregate max(Integer max) {
    this.max = max;
    return this;
  }

   /**
   * Enables extending the bounds of the histogram beyond the data itself.
   * @return max
  **/
  public Integer getMax() {
    return max;
  }

  public void setMax(Integer max) {
    this.max = max;
  }

  public Aggregate groupByProp(String groupByProp) {
    this.groupByProp = groupByProp;
    return this;
  }

   /**
   * The name of the field on which to perform the group aggregation.
   * @return groupByProp
  **/
  public String getGroupByProp() {
    return groupByProp;
  }

  public void setGroupByProp(String groupByProp) {
    this.groupByProp = groupByProp;
  }

  public Aggregate sumByProp(String sumByProp) {
    this.sumByProp = sumByProp;
    return this;
  }

   /**
   * The name of the field on which to perform the sum aggregation.
   * @return sumByProp
  **/
  public String getSumByProp() {
    return sumByProp;
  }

  public void setSumByProp(String sumByProp) {
    this.sumByProp = sumByProp;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Aggregate aggregate = (Aggregate) o;
    return Objects.equals(this.timestampProp, aggregate.timestampProp) &&
        Objects.equals(this.interval, aggregate.interval) &&
        Objects.equals(this.min, aggregate.min) &&
        Objects.equals(this.max, aggregate.max) &&
        Objects.equals(this.groupByProp, aggregate.groupByProp) &&
        Objects.equals(this.sumByProp, aggregate.sumByProp);
  }

  @Override
  public int hashCode() {
    return Objects.hash(timestampProp, interval, min, max, groupByProp, sumByProp);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Aggregate {\n");
    sb.append("    timestampProp: ").append(toIndentedString(timestampProp)).append("\n");
    sb.append("    interval: ").append(toIndentedString(interval)).append("\n");
    sb.append("    min: ").append(toIndentedString(min)).append("\n");
    sb.append("    max: ").append(toIndentedString(max)).append("\n");
    sb.append("    groupByProp: ").append(toIndentedString(groupByProp)).append("\n");
    sb.append("    sumByProp: ").append(toIndentedString(sumByProp)).append("\n");
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

