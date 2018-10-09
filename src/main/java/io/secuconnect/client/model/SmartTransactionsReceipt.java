package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.SmartTransactionsReceiptValue;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/**
 * SmartTransactionsReceipt
 */
public class SmartTransactionsReceipt {
  @SerializedName("type")
  private String type = null;

  @SerializedName("value")
  private SmartTransactionsReceiptValue value = null;

  public SmartTransactionsReceipt type(String type) {
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

  public SmartTransactionsReceipt value(SmartTransactionsReceiptValue value) {
    this.value = value;
    return this;
  }

   /**
   * Value
   * @return value
  **/
  public SmartTransactionsReceiptValue getValue() {
    return value;
  }

  public void setValue(SmartTransactionsReceiptValue value) {
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
    SmartTransactionsReceipt smartTransactionsReceipt = (SmartTransactionsReceipt) o;
    return Objects.equals(this.type, smartTransactionsReceipt.type) &&
        Objects.equals(this.value, smartTransactionsReceipt.value);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, value);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsReceipt {\n");
    
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

