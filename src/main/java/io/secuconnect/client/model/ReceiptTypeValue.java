package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.ReceiptType;
import io.secuconnect.client.model.ReceiptValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/**
 * ReceiptTypeValue
 */
public class ReceiptTypeValue {
  @SerializedName("type")
  private String type = null;

  @SerializedName("value")
  private ReceiptValue value = null;

  public ReceiptTypeValue type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ReceiptTypeValue value(ReceiptValue value) {
    this.value = value;
    return this;
  }

   /**
   * Value object
   * @return value
  **/
  public ReceiptValue getValue() {
    return value;
  }

  public void setValue(ReceiptValue value) {
    this.value = value;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ReceiptTypeValue receiptTypeValue = (ReceiptTypeValue) o;
    return Objects.equals(this.type, receiptTypeValue.type) &&
        Objects.equals(this.value, receiptTypeValue.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ReceiptTypeValue {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

