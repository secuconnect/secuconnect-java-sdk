package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Event Details
 */
public class GeneralContractsEventDetails {
  @SerializedName("event_date")
  protected String eventDate = null;

  @SerializedName("event_description")
  protected String eventDescription = null;

  public GeneralContractsEventDetails eventDate(String eventDate) {
    this.eventDate = eventDate;
    return this;
  }

   /**
   * Date of the Event (format: YYYY-MM-DD)
   * @return eventDate
  **/
  public String getEventDate() {
    return eventDate;
  }

  public void setEventDate(String eventDate) {
    this.eventDate = eventDate;
  }

  public GeneralContractsEventDetails eventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
    return this;
  }

   /**
   * Name of the Event
   * @return eventDescription
  **/
  public String getEventDescription() {
    return eventDescription;
  }

  public void setEventDescription(String eventDescription) {
    this.eventDescription = eventDescription;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralContractsEventDetails generalContractsEventDetails = (GeneralContractsEventDetails) o;
    return Objects.equals(this.eventDate, generalContractsEventDetails.eventDate) &&
        Objects.equals(this.eventDescription, generalContractsEventDetails.eventDescription);
  }

  @Override
  public int hashCode() {
    return Objects.hash(eventDate, eventDescription);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralContractsEventDetails {\n");
    sb.append("    eventDate: ").append(toIndentedString(eventDate)).append("\n");
    sb.append("    eventDescription: ").append(toIndentedString(eventDescription)).append("\n");
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

