package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.OneOfPaymentContainersDTOModelPrivate;
import com.secuconnect.client.model.PaymentContainersDTO;
import com.secuconnect.client.model.PaymentContainersDTOCustomer;
import com.secuconnect.client.model.ProductInstanceUID;
import java.util.Objects;

/**
 * SmartTransactionPaymentContainerDTO
 */
public class SmartTransactionPaymentContainerDTO extends ProductInstanceUID {
  @SerializedName("customer")
  private PaymentContainersDTOCustomer customer = null;

  @SerializedName("customer_id")
  private String customerId = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("private")
  private OneOfPaymentContainersDTOModelPrivate _private = null;

  public SmartTransactionPaymentContainerDTO customer(PaymentContainersDTOCustomer customer) {
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

  public SmartTransactionPaymentContainerDTO customerId(String customerId) {
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

  public SmartTransactionPaymentContainerDTO type(String type) {
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

  public SmartTransactionPaymentContainerDTO _private(OneOfPaymentContainersDTOModelPrivate _private) {
    this._private = _private;
    return this;
  }

   /**
   * Get _private
   * @return _private
  **/
  public OneOfPaymentContainersDTOModelPrivate getPrivate() {
    return _private;
  }

  public void setPrivate(OneOfPaymentContainersDTOModelPrivate _private) {
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
    SmartTransactionPaymentContainerDTO smartTransactionPaymentContainerDTO = (SmartTransactionPaymentContainerDTO) o;
    return Objects.equals(this.customer, smartTransactionPaymentContainerDTO.customer) &&
        Objects.equals(this.customerId, smartTransactionPaymentContainerDTO.customerId) &&
        Objects.equals(this.type, smartTransactionPaymentContainerDTO.type) &&
        Objects.equals(this._private, smartTransactionPaymentContainerDTO._private) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, customerId, type, _private, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionPaymentContainerDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

