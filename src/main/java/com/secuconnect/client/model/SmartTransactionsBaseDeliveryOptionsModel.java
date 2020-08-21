package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * SmartTransactionsBaseDeliveryOptionsModel
 */
public class SmartTransactionsBaseDeliveryOptionsModel {
  @SerializedName("type")
  private SmartTransactionsBaseDeliveryOptionsModelType type = null;

  public SmartTransactionsBaseDeliveryOptionsModel type(SmartTransactionsBaseDeliveryOptionsModelType type) {
    this.type = type;
    return this;
  }

   /**
   * SmartTransactionsBaseDeliveryOptionsModel
   * @return type
  **/
  public SmartTransactionsBaseDeliveryOptionsModelType getType() {
    return type;
  }

  public void setType(SmartTransactionsBaseDeliveryOptionsModelType type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsBaseDeliveryOptionsModel smartTransactionsBaseDeliveryOptionsModel = (SmartTransactionsBaseDeliveryOptionsModel) o;
    return Objects.equals(this.type, smartTransactionsBaseDeliveryOptionsModel.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsBaseDeliveryOptionsModel {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

