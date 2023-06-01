package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * ContactData
 */
public class ContactData {
  @SerializedName("mobile")
  protected String mobile = null;

  @SerializedName("email")
  protected String email = null;

  public ContactData mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

   /**
   * Mobile phone number
   * @return mobile
  **/
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public ContactData email(String email) {
    this.email = email;
    return this;
  }

   /**
   * E-mail address
   * @return email
  **/
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContactData contactData = (ContactData) o;
    return Objects.equals(this.mobile, contactData.mobile) &&
        Objects.equals(this.email, contactData.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mobile, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContactData {\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

