package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartTransactionPaymentContainerDTO;
import com.secuconnect.client.model.SmartTransactionPaymentCustomerDTO;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SmartTransactionPreparePayloadDataModel
 */
public class SmartTransactionPreparePayloadDataModel {
  @SerializedName("callback_urls")
  private List<String> callbackUrls = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("customer")
  private SmartTransactionPaymentCustomerDTO customer = null;

  @SerializedName("container")
  private SmartTransactionPaymentContainerDTO container = null;

  public SmartTransactionPreparePayloadDataModel callbackUrls(List<String> callbackUrls) {
    this.callbackUrls = callbackUrls;
    return this;
  }

  public SmartTransactionPreparePayloadDataModel addCallbackUrlsItem(String callbackUrlsItem) {
    if (this.callbackUrls == null) {
      this.callbackUrls = new ArrayList<>();
    }
    this.callbackUrls.add(callbackUrlsItem);
    return this;
  }

   /**
   * Callback urls
   * @return callbackUrls
  **/
  public List<String> getCallbackUrls() {
    return callbackUrls;
  }

  public void setCallbackUrls(List<String> callbackUrls) {
    this.callbackUrls = callbackUrls;
  }

  public SmartTransactionPreparePayloadDataModel email(String email) {
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

  public SmartTransactionPreparePayloadDataModel customer(SmartTransactionPaymentCustomerDTO customer) {
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

  public SmartTransactionPreparePayloadDataModel container(SmartTransactionPaymentContainerDTO container) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionPreparePayloadDataModel smartTransactionPreparePayloadDataModel = (SmartTransactionPreparePayloadDataModel) o;
    return Objects.equals(this.callbackUrls, smartTransactionPreparePayloadDataModel.callbackUrls) &&
        Objects.equals(this.email, smartTransactionPreparePayloadDataModel.email) &&
        Objects.equals(this.customer, smartTransactionPreparePayloadDataModel.customer) &&
        Objects.equals(this.container, smartTransactionPreparePayloadDataModel.container);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrls, email, customer, container);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionPreparePayloadDataModel {\n");
    sb.append("    callbackUrls: ").append(toIndentedString(callbackUrls)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
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

