package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Settings for merchant initiated transaction (MIT)
 */
public class MITInstructions {
  @SerializedName("type")
  protected String type = null;

  @SerializedName("standing_instructions")
  protected String standingInstructions = null;

  @SerializedName("recurring_expiry")
  protected String recurringExpiry = null;

  @SerializedName("recurring_frequency")
  protected Integer recurringFrequency = null;

  @SerializedName("cit_reference")
  protected String citReference = null;

  public MITInstructions type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Instructions type:  - &#x60;\&quot;cit\&quot;&#x60; - &#x60;\&quot;mit\&quot;&#x60;
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public MITInstructions standingInstructions(String standingInstructions) {
    this.standingInstructions = standingInstructions;
    return this;
  }

   /**
   * Standing Instructions:  - &#x60;\&quot;ucof\&quot;&#x60; - &#x60;\&quot;recurring\&quot;&#x60;
   * @return standingInstructions
  **/
  public String getStandingInstructions() {
    return standingInstructions;
  }

  public void setStandingInstructions(String standingInstructions) {
    this.standingInstructions = standingInstructions;
  }

  public MITInstructions recurringExpiry(String recurringExpiry) {
    this.recurringExpiry = recurringExpiry;
    return this;
  }

   /**
   * The date until a recurring payment should be possible
   * @return recurringExpiry
  **/
  public String getRecurringExpiry() {
    return recurringExpiry;
  }

  public void setRecurringExpiry(String recurringExpiry) {
    this.recurringExpiry = recurringExpiry;
  }

  public MITInstructions recurringFrequency(Integer recurringFrequency) {
    this.recurringFrequency = recurringFrequency;
    return this;
  }

   /**
   * How often a recurring payment should be possible in given period
   * @return recurringFrequency
  **/
  public Integer getRecurringFrequency() {
    return recurringFrequency;
  }

  public void setRecurringFrequency(Integer recurringFrequency) {
    this.recurringFrequency = recurringFrequency;
  }

  public MITInstructions citReference(String citReference) {
    this.citReference = citReference;
    return this;
  }

   /**
   * The Payment Transactions ID from initial transaction to process a recurring payment
   * @return citReference
  **/
  public String getCitReference() {
    return citReference;
  }

  public void setCitReference(String citReference) {
    this.citReference = citReference;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MITInstructions miTInstructions = (MITInstructions) o;
    return Objects.equals(this.type, miTInstructions.type) &&
        Objects.equals(this.standingInstructions, miTInstructions.standingInstructions) &&
        Objects.equals(this.recurringExpiry, miTInstructions.recurringExpiry) &&
        Objects.equals(this.recurringFrequency, miTInstructions.recurringFrequency) &&
        Objects.equals(this.citReference, miTInstructions.citReference);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, standingInstructions, recurringExpiry, recurringFrequency, citReference);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MITInstructions {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    standingInstructions: ").append(toIndentedString(standingInstructions)).append("\n");
    sb.append("    recurringExpiry: ").append(toIndentedString(recurringExpiry)).append("\n");
    sb.append("    recurringFrequency: ").append(toIndentedString(recurringFrequency)).append("\n");
    sb.append("    citReference: ").append(toIndentedString(citReference)).append("\n");
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

