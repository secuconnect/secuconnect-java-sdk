package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * E-Mail object
 */
public class GeneralMerchantsUserEmail {
  @SerializedName("type")
  protected String type = null;

  @SerializedName("email_formatted")
  protected String emailFormatted = null;

  public GeneralMerchantsUserEmail type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Kind of E-Mail address
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GeneralMerchantsUserEmail emailFormatted(String emailFormatted) {
    this.emailFormatted = emailFormatted;
    return this;
  }

   /**
   * E-Mail address
   * @return emailFormatted
  **/
  public String getEmailFormatted() {
    return emailFormatted;
  }

  public void setEmailFormatted(String emailFormatted) {
    this.emailFormatted = emailFormatted;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralMerchantsUserEmail generalMerchantsUserEmail = (GeneralMerchantsUserEmail) o;
    return Objects.equals(this.type, generalMerchantsUserEmail.type) &&
        Objects.equals(this.emailFormatted, generalMerchantsUserEmail.emailFormatted);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, emailFormatted);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralMerchantsUserEmail {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    emailFormatted: ").append(toIndentedString(emailFormatted)).append("\n");
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

