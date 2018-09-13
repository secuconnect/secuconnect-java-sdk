package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.PaymentContainersDTOCustomer;
import io.secuconnect.client.model.PaymentContainersDTOPrivate;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/**
 * PaymentContainersDTO
 */
public class PaymentContainersDTO {
  @SerializedName("customer")
  private PaymentContainersDTOCustomer customer = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("private")
  private PaymentContainersDTOPrivate _private = null;

  public PaymentContainersDTO customer(PaymentContainersDTOCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  @ApiModelProperty(value = "")
  public PaymentContainersDTOCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(PaymentContainersDTOCustomer customer) {
    this.customer = customer;
  }

  public PaymentContainersDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of Payment Containers
   * @return type
  **/
  @ApiModelProperty(value = "Type of Payment Containers")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PaymentContainersDTO _private(PaymentContainersDTOPrivate _private) {
    this._private = _private;
    return this;
  }

   /**
   * Get _private
   * @return _private
  **/
  @ApiModelProperty(value = "")
  public PaymentContainersDTOPrivate getPrivate() {
    return _private;
  }

  public void setPrivate(PaymentContainersDTOPrivate _private) {
    this._private = _private;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContainersDTO paymentContainersDTO = (PaymentContainersDTO) o;
    return Objects.equals(this.customer, paymentContainersDTO.customer) &&
        Objects.equals(this.type, paymentContainersDTO.type) &&
        Objects.equals(this._private, paymentContainersDTO._private);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, type, _private);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContainersDTO {\n");
    
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
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

