package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartTransactionsReceiptValue;
import java.util.Objects;

/**
 * SmartTransactionsReceipt
 */
public class SmartTransactionsReceipt {
  @SerializedName("type")
  protected String type = null;

  @SerializedName("value")
  protected SmartTransactionsReceiptValue value = null;

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
   * Get value
   * @return value
  **/
  public SmartTransactionsReceiptValue getValue() {
    return value;
  }

  public void setValue(SmartTransactionsReceiptValue value) {
    this.value = value;
  }

  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

