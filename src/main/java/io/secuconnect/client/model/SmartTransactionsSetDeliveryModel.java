package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.OneOfSmartTransactionsDeliveryOptionsModel;
import java.util.Objects;

/**
 * SmartTransactionsSetDeliveryModel
 */
public class SmartTransactionsSetDeliveryModel {
  @SerializedName("delivery_options")
  private OneOfSmartTransactionsDeliveryOptionsModel deliveryOptions = null;

  public SmartTransactionsSetDeliveryModel deliveryOptions(OneOfSmartTransactionsDeliveryOptionsModel deliveryOptions) {
    this.deliveryOptions = deliveryOptions;
    return this;
  }

   /**
   * Get deliveryOptions
   * @return deliveryOptions
  **/
  public OneOfSmartTransactionsDeliveryOptionsModel getDeliveryOptions() {
    return deliveryOptions;
  }

  public void setDeliveryOptions(OneOfSmartTransactionsDeliveryOptionsModel deliveryOptions) {
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

