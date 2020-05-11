package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.OneOfPaymentContainersDTOModelPrivate;
import java.util.Objects;

/**
 * The payment data which has the payer used (like bank account, credit card, ...). This data is always masked.
 */
public class SecupayTransactionProductModelUsedPaymentInstrument {
  @SerializedName("type")
  private String type = null;

  @SerializedName("data")
  private OneOfPaymentContainersDTOModelPrivate data = null;

  public SecupayTransactionProductModelUsedPaymentInstrument type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The type of the payment instrument data, like: &#x27;bank_account&#x27; or &#x27;credit_card&#x27;
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SecupayTransactionProductModelUsedPaymentInstrument data(OneOfPaymentContainersDTOModelPrivate data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public OneOfPaymentContainersDTOModelPrivate getData() {
    return data;
  }

  public void setData(OneOfPaymentContainersDTOModelPrivate data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayTransactionProductModelUsedPaymentInstrument secupayTransactionProductModelUsedPaymentInstrument = (SecupayTransactionProductModelUsedPaymentInstrument) o;
    return Objects.equals(this.type, secupayTransactionProductModelUsedPaymentInstrument.type) &&
        Objects.equals(this.data, secupayTransactionProductModelUsedPaymentInstrument.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayTransactionProductModelUsedPaymentInstrument {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

