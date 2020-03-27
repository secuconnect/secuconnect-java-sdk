package io.secuconnect.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * PaymentContainersDTO
 */
public class PaymentContainersDTO {
  @SerializedName("customer")
  private PaymentContainersDTOCustomer customer = null;

  @SerializedName("customer_id")
  private String customerId = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("private")
  private AnyOfPaymentContainersDTOModelPrivate _private = null;

  public PaymentContainersDTO customer(PaymentContainersDTOCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  public PaymentContainersDTOCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(PaymentContainersDTOCustomer customer) {
    this.customer = customer;
  }

  public PaymentContainersDTO customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Payment-Customer-ID
   * @return customerId
  **/
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public PaymentContainersDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of Payment Containers
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PaymentContainersDTO _private(AnyOfPaymentContainersDTOModelPrivate _private) {
    this._private = _private;
    return this;
  }

   /**
   * Get _private
   * @return _private
  **/
  public AnyOfPaymentContainersDTOModelPrivate getPrivate() {
    return _private;
  }

  public void setPrivate(AnyOfPaymentContainersDTOModelPrivate _private) {
    this._private = _private;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContainersDTO paymentContainersDTO = (PaymentContainersDTO) o;
    return Objects.equals(this.customer, paymentContainersDTO.customer) &&
        Objects.equals(this.customerId, paymentContainersDTO.customerId) &&
        Objects.equals(this.type, paymentContainersDTO.type) &&
        Objects.equals(this._private, paymentContainersDTO._private);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, customerId, type, _private);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContainersDTO {\n");
    
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
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

