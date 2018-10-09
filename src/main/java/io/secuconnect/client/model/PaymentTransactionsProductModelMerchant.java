package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/**
 * Merchant information
 */
@ApiModel(description = "Merchant information")
public class PaymentTransactionsProductModelMerchant {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("type")
  private String type = null;

  public PaymentTransactionsProductModelMerchant object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Type of product
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public PaymentTransactionsProductModelMerchant id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Identifier of product
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PaymentTransactionsProductModelMerchant type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of merchant
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransactionsProductModelMerchant paymentTransactionsProductModelMerchant = (PaymentTransactionsProductModelMerchant) o;
    return Objects.equals(this.object, paymentTransactionsProductModelMerchant.object) &&
        Objects.equals(this.id, paymentTransactionsProductModelMerchant.id) &&
        Objects.equals(this.type, paymentTransactionsProductModelMerchant.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransactionsProductModelMerchant {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

