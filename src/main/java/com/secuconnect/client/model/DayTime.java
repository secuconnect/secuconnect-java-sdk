package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Day and time
 */
public class DayTime {
  @SerializedName("day")
  protected Integer day = null;

  @SerializedName("time")
  protected String time = null;

  public DayTime day(Integer day) {
    this.day = day;
    return this;
  }

   /**
   * Day; &#x60;0&#x60; .. &#x60;6&#x60; for Sunday .. Saturday
   * @return day
  **/
  public Integer getDay() {
    return day;
  }

  public void setDay(Integer day) {
    this.day = day;
  }

  public DayTime time(String time) {
    this.time = time;
    return this;
  }

   /**
   * Time; format HHMM, e. g. &#x60;\&quot;0930\&quot;&#x60; for 9:30
   * @return time
  **/
  public String getTime() {
    return time;
  }

  public void setTime(String time) {
    this.time = time;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DayTime dayTime = (DayTime) o;
    return Objects.equals(this.day, dayTime.day) &&
        Objects.equals(this.time, dayTime.time);
  }

  @Override
  public int hashCode() {
    return Objects.hash(day, time);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DayTime {\n");
    sb.append("    day: ").append(toIndentedString(day)).append("\n");
    sb.append("    time: ").append(toIndentedString(time)).append("\n");
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

