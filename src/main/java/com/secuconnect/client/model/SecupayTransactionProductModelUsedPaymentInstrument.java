package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.OneOfPaymentContainersDTOModelPrivate;
import java.util.Objects;

/**
 * Payment data the payer has used (bank account, credit card, etc.). The data are always masked.
 */
public class SecupayTransactionProductModelUsedPaymentInstrument {
  @SerializedName("type")
  protected String type = null;

  @SerializedName("data")
  protected OneOfPaymentContainersDTOModelPrivate data = null;

  public SecupayTransactionProductModelUsedPaymentInstrument type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of payment instrument, like: &#x60;\&quot;bank_account\&quot;&#x60; or &#x60;\&quot;credit_card\&quot;&#x60;
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

