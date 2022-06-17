package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartTransactionPaymentContainerDTO;
import com.secuconnect.client.model.SmartTransactionPaymentCustomerDTO;
import com.secuconnect.client.model.SmartTransactionsPrepareCallbackUrls;
import java.util.Objects;

/**
 * SmartTransactionsPrepare
 */
public class SmartTransactionsPrepare {
  @SerializedName("customer")
  private SmartTransactionPaymentCustomerDTO customer = null;

  @SerializedName("container")
  private SmartTransactionPaymentContainerDTO container = null;

  @SerializedName("callback_urls")
  private SmartTransactionsPrepareCallbackUrls callbackUrls = null;

  @SerializedName("email")
  private String email = null;

  public SmartTransactionsPrepare customer(SmartTransactionPaymentCustomerDTO customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  public SmartTransactionPaymentCustomerDTO getCustomer() {
    return customer;
  }

  public void setCustomer(SmartTransactionPaymentCustomerDTO customer) {
    this.customer = customer;
  }

  public SmartTransactionsPrepare container(SmartTransactionPaymentContainerDTO container) {
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  public SmartTransactionPaymentContainerDTO getContainer() {
    return container;
  }

  public void setContainer(SmartTransactionPaymentContainerDTO container) {
    this.container = container;
  }

  public SmartTransactionsPrepare callbackUrls(SmartTransactionsPrepareCallbackUrls callbackUrls) {
    this.callbackUrls = callbackUrls;
    return this;
  }

   /**
   * Get callbackUrls
   * @return callbackUrls
  **/
  public SmartTransactionsPrepareCallbackUrls getCallbackUrls() {
    return callbackUrls;
  }

  public void setCallbackUrls(SmartTransactionsPrepareCallbackUrls callbackUrls) {
    this.callbackUrls = callbackUrls;
  }

  public SmartTransactionsPrepare email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email
   * @return email
  **/
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsPrepare smartTransactionsPrepare = (SmartTransactionsPrepare) o;
    return Objects.equals(this.customer, smartTransactionsPrepare.customer) &&
        Objects.equals(this.container, smartTransactionsPrepare.container) &&
        Objects.equals(this.callbackUrls, smartTransactionsPrepare.callbackUrls) &&
        Objects.equals(this.email, smartTransactionsPrepare.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, container, callbackUrls, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsPrepare {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    callbackUrls: ").append(toIndentedString(callbackUrls)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

