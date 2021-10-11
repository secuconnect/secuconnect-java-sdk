package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.Address;
import com.secuconnect.client.model.Contact;
import com.secuconnect.client.model.IdentificationCustomData;
import java.util.Objects;

/**
 * IdentrequestPersonDTO
 */
public class IdentrequestPersonDTO extends Contact {
  @SerializedName("custom1")
  private String custom1 = null;

  @SerializedName("custom2")
  private String custom2 = null;

  @SerializedName("custom3")
  private String custom3 = null;

  @SerializedName("custom4")
  private String custom4 = null;

  @SerializedName("custom5")
  private String custom5 = null;

  public IdentrequestPersonDTO custom1(String custom1) {
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

  public IdentrequestPersonDTO custom2(String custom2) {
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

  public IdentrequestPersonDTO custom3(String custom3) {
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

  public IdentrequestPersonDTO custom4(String custom4) {
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

  public IdentrequestPersonDTO custom5(String custom5) {
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
    IdentrequestPersonDTO identrequestPersonDTO = (IdentrequestPersonDTO) o;
    return Objects.equals(this.custom1, identrequestPersonDTO.custom1) &&
        Objects.equals(this.custom2, identrequestPersonDTO.custom2) &&
        Objects.equals(this.custom3, identrequestPersonDTO.custom3) &&
        Objects.equals(this.custom4, identrequestPersonDTO.custom4) &&
        Objects.equals(this.custom5, identrequestPersonDTO.custom5) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(custom1, custom2, custom3, custom4, custom5, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentrequestPersonDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

