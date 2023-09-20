package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Check-in
 */
public class SmartTransactionsCheckin {
  @SerializedName("object")
  protected String object = null;

  @SerializedName("id")
  protected String id = null;

  @SerializedName("email")
  protected String email = null;

  public SmartTransactionsCheckin object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public SmartTransactionsCheckin id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Object ID
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SmartTransactionsCheckin email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address
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
    SmartTransactionsCheckin smartTransactionsCheckin = (SmartTransactionsCheckin) o;
    return Objects.equals(this.object, smartTransactionsCheckin.object) &&
        Objects.equals(this.id, smartTransactionsCheckin.id) &&
        Objects.equals(this.email, smartTransactionsCheckin.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsCheckin {\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

