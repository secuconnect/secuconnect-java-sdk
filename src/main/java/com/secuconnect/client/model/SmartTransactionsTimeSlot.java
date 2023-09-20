package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Time slot
 */
public class SmartTransactionsTimeSlot {
  @SerializedName("start_date")
  protected String startDate = null;

  @SerializedName("end_date")
  protected String endDate = null;

  public SmartTransactionsTimeSlot startDate(String startDate) {
    this.startDate = startDate;
    return this;
  }

   /**
   * Start Date (ISO 8601 date and time)
   * @return startDate
  **/
  public String getStartDate() {
    return startDate;
  }

  public void setStartDate(String startDate) {
    this.startDate = startDate;
  }

  public SmartTransactionsTimeSlot endDate(String endDate) {
    this.endDate = endDate;
    return this;
  }

   /**
   * End Date (ISO 8601 date and time)
   * @return endDate
  **/
  public String getEndDate() {
    return endDate;
  }

  public void setEndDate(String endDate) {
    this.endDate = endDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsTimeSlot smartTransactionsTimeSlot = (SmartTransactionsTimeSlot) o;
    return Objects.equals(this.startDate, smartTransactionsTimeSlot.startDate) &&
        Objects.equals(this.endDate, smartTransactionsTimeSlot.endDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(startDate, endDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsTimeSlot {\n");
    sb.append("    startDate: ").append(toIndentedString(startDate)).append("\n");
    sb.append("    endDate: ").append(toIndentedString(endDate)).append("\n");
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

