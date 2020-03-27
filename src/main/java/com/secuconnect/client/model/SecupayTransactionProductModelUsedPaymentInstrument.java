package com.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.secuconnect.client.model.BankAccountDescriptor;
import java.io.IOException;

/**
 * The payment data which has the payer used (like bank account, credit card, ...). This data is always masked.
 */
public class SecupayTransactionProductModelUsedPaymentInstrument {
  @SerializedName("type")
  private String type = null;

  @SerializedName("data")
  private BankAccountDescriptor data = null;

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

  public SecupayTransactionProductModelUsedPaymentInstrument data(BankAccountDescriptor data) {
    this.data = data;
    return this;
  }

   /**
   * Get data
   * @return data
  **/
  public BankAccountDescriptor getData() {
    return data;
  }

  public void setData(BankAccountDescriptor data) {
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

