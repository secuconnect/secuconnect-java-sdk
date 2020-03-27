package com.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.secuconnect.client.model.ProductInstanceUID;
import com.secuconnect.client.model.SmartTransactionsPrepareCallbackUrls;
import java.io.IOException;

/**
 * SmartTransactionsPrepare
 */
public class SmartTransactionsPrepare {
  @SerializedName("customer")
  private ProductInstanceUID customer = null;

  @SerializedName("container")
  private ProductInstanceUID container = null;

  @SerializedName("method")
  private String method = null;

  @SerializedName("callback_urls")
  private SmartTransactionsPrepareCallbackUrls callbackUrls = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("mode")
  private String mode = null;

  @SerializedName("is_paypal_basic")
  private Boolean isPaypalBasic = null;

  @SerializedName("is_demo")
  private Boolean isDemo = null;

  public SmartTransactionsPrepare customer(ProductInstanceUID customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  public ProductInstanceUID getCustomer() {
    return customer;
  }

  public void setCustomer(ProductInstanceUID customer) {
    this.customer = customer;
  }

  public SmartTransactionsPrepare container(ProductInstanceUID container) {
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  public ProductInstanceUID getContainer() {
    return container;
  }

  public void setContainer(ProductInstanceUID container) {
    this.container = container;
  }

  public SmartTransactionsPrepare method(String method) {
    this.method = method;
    return this;
  }

   /**
   * Method
   * @return method
  **/
  public String getMethod() {
    return method;
  }

  public void setMethod(String method) {
    this.method = method;
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

  public SmartTransactionsPrepare mode(String mode) {
    this.mode = mode;
    return this;
  }

   /**
   * Mode
   * @return mode
  **/
  public String getMode() {
    return mode;
  }

  public void setMode(String mode) {
    this.mode = mode;
  }

  public SmartTransactionsPrepare isPaypalBasic(Boolean isPaypalBasic) {
    this.isPaypalBasic = isPaypalBasic;
    return this;
  }

   /**
   * Is paypal basic or not
   * @return isPaypalBasic
  **/
  public Boolean isIsPaypalBasic() {
    return isPaypalBasic;
  }

  public void setIsPaypalBasic(Boolean isPaypalBasic) {
    this.isPaypalBasic = isPaypalBasic;
  }

  public SmartTransactionsPrepare isDemo(Boolean isDemo) {
    this.isDemo = isDemo;
    return this;
  }

   /**
   * Is demo or not
   * @return isDemo
  **/
  public Boolean isIsDemo() {
    return isDemo;
  }

  public void setIsDemo(Boolean isDemo) {
    this.isDemo = isDemo;
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
        Objects.equals(this.method, smartTransactionsPrepare.method) &&
        Objects.equals(this.callbackUrls, smartTransactionsPrepare.callbackUrls) &&
        Objects.equals(this.email, smartTransactionsPrepare.email) &&
        Objects.equals(this.mode, smartTransactionsPrepare.mode) &&
        Objects.equals(this.isPaypalBasic, smartTransactionsPrepare.isPaypalBasic) &&
        Objects.equals(this.isDemo, smartTransactionsPrepare.isDemo);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, container, method, callbackUrls, email, mode, isPaypalBasic, isDemo);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsPrepare {\n");
    
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    method: ").append(toIndentedString(method)).append("\n");
    sb.append("    callbackUrls: ").append(toIndentedString(callbackUrls)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    isPaypalBasic: ").append(toIndentedString(isPaypalBasic)).append("\n");
    sb.append("    isDemo: ").append(toIndentedString(isDemo)).append("\n");
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

