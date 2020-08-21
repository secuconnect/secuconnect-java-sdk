package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * SmartTransactionsSetDeliveryModel
 */
public class SmartTransactionsSetDeliveryModel {
  @SerializedName("delivery_options")
  private SmartTransactionsSetDeliveryModelDeliveryOptions deliveryOptions = null;

  public SmartTransactionsSetDeliveryModel deliveryOptions(SmartTransactionsSetDeliveryModelDeliveryOptions deliveryOptions) {
    this.deliveryOptions = deliveryOptions;
    return this;
  }

   /**
   * SmartTransactionsSetDeliveryModel
   * @return deliveryOptions
  **/
  public SmartTransactionsSetDeliveryModelDeliveryOptions getDeliveryOptions() {
    return deliveryOptions;
  }

  public void setDeliveryOptions(SmartTransactionsSetDeliveryModelDeliveryOptions deliveryOptions) {
    this.deliveryOptions = deliveryOptions;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsSetDeliveryModel smartTransactionsSetDeliveryModel = (SmartTransactionsSetDeliveryModel) o;
    return Objects.equals(this.deliveryOptions, smartTransactionsSetDeliveryModel.deliveryOptions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(deliveryOptions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsSetDeliveryModel {\n");
    sb.append("    deliveryOptions: ").append(toIndentedString(deliveryOptions)).append("\n");
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

