package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * ValueField
 */
public class ValueField {
  @SerializedName("value")
  protected String value = null;

  @SerializedName("status")
  protected String status = null;

  public ValueField value(String value) {
    this.value = value;
    return this;
  }

   /**
   * The submitted value from identification provider
   * @return value
  **/
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public ValueField status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status for value from identification provider - can be empty
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ValueField valueField = (ValueField) o;
    return Objects.equals(this.value, valueField.value) &&
        Objects.equals(this.status, valueField.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(value, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ValueField {\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

