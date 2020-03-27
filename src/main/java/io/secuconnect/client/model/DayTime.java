package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * Day and time
 */
public class DayTime {
  @SerializedName("day")
  private Integer day = null;

  @SerializedName("time")
  private String time = null;

  public DayTime day(Integer day) {
    this.day = day;
    return this;
  }

   /**
   * Day
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
   * Time
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

