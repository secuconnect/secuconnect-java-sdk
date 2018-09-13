package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.BankAccountDescriptor;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/**
 * The payment data which has the payer used (like bank account, credit card, ...). This data is always masked.
 */
@ApiModel(description = "The payment data which has the payer used (like bank account, credit card, ...). This data is always masked.")
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
   * The type of the payment instrument data, like: &#39;bank_account&#39; or &#39;credit_card&#39;
   * @return type
  **/
  @ApiModelProperty(value = "The type of the payment instrument data, like: 'bank_account' or 'credit_card'")
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
   * Holds the payment instrument data
   * @return data
  **/
  @ApiModelProperty(value = "Holds the payment instrument data")
  public BankAccountDescriptor getData() {
    return data;
  }

  public void setData(BankAccountDescriptor data) {
    this.data = data;
  }

  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

