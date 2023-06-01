package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * IdentificationCustomData
 */
public class IdentificationCustomData {
  @SerializedName("custom1")
  protected String custom1 = null;

  @SerializedName("custom2")
  protected String custom2 = null;

  @SerializedName("custom3")
  protected String custom3 = null;

  @SerializedName("custom4")
  protected String custom4 = null;

  @SerializedName("custom5")
  protected String custom5 = null;

  public IdentificationCustomData custom1(String custom1) {
    this.custom1 = custom1;
    return this;
  }

   /**
   * Some custom fields which can be individually used to store information
   * @return custom1
  **/
  public String getCustom1() {
    return custom1;
  }

  public void setCustom1(String custom1) {
    this.custom1 = custom1;
  }

  public IdentificationCustomData custom2(String custom2) {
    this.custom2 = custom2;
    return this;
  }

   /**
   * Some custom fields which can be individually used to store information
   * @return custom2
  **/
  public String getCustom2() {
    return custom2;
  }

  public void setCustom2(String custom2) {
    this.custom2 = custom2;
  }

  public IdentificationCustomData custom3(String custom3) {
    this.custom3 = custom3;
    return this;
  }

   /**
   * Some custom fields which can be individually used to store information
   * @return custom3
  **/
  public String getCustom3() {
    return custom3;
  }

  public void setCustom3(String custom3) {
    this.custom3 = custom3;
  }

  public IdentificationCustomData custom4(String custom4) {
    this.custom4 = custom4;
    return this;
  }

   /**
   * Some custom fields which can be individually used to store information
   * @return custom4
  **/
  public String getCustom4() {
    return custom4;
  }

  public void setCustom4(String custom4) {
    this.custom4 = custom4;
  }

  public IdentificationCustomData custom5(String custom5) {
    this.custom5 = custom5;
    return this;
  }

   /**
   * Some custom fields which can be individually used to store information
   * @return custom5
  **/
  public String getCustom5() {
    return custom5;
  }

  public void setCustom5(String custom5) {
    this.custom5 = custom5;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentificationCustomData identificationCustomData = (IdentificationCustomData) o;
    return Objects.equals(this.custom1, identificationCustomData.custom1) &&
        Objects.equals(this.custom2, identificationCustomData.custom2) &&
        Objects.equals(this.custom3, identificationCustomData.custom3) &&
        Objects.equals(this.custom4, identificationCustomData.custom4) &&
        Objects.equals(this.custom5, identificationCustomData.custom5);
  }

  @Override
  public int hashCode() {
    return Objects.hash(custom1, custom2, custom3, custom4, custom5);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificationCustomData {\n");
    sb.append("    custom1: ").append(toIndentedString(custom1)).append("\n");
    sb.append("    custom2: ").append(toIndentedString(custom2)).append("\n");
    sb.append("    custom3: ").append(toIndentedString(custom3)).append("\n");
    sb.append("    custom4: ").append(toIndentedString(custom4)).append("\n");
    sb.append("    custom5: ").append(toIndentedString(custom5)).append("\n");
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

