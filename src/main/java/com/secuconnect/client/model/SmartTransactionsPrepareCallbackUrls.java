package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Return URLs for external payment authorization.  _Note: Please don&#x27;t mix them up with the return URLs for Smart Checkout. These here are intended for custom checkout implementations to catch the user when he returns from 3-D Secure, PayPal, Sofort, and the like._
 */
public class SmartTransactionsPrepareCallbackUrls {
  @SerializedName("success_url")
  protected String successUrl = null;

  @SerializedName("failure_url")
  protected String failureUrl = null;

  public SmartTransactionsPrepareCallbackUrls successUrl(String successUrl) {
    this.successUrl = successUrl;
    return this;
  }

   /**
   * Shop URL for successful external authorization or payment
   * @return successUrl
  **/
  public String getSuccessUrl() {
    return successUrl;
  }

  public void setSuccessUrl(String successUrl) {
    this.successUrl = successUrl;
  }

  public SmartTransactionsPrepareCallbackUrls failureUrl(String failureUrl) {
    this.failureUrl = failureUrl;
    return this;
  }

   /**
   * Shop URL for failed external authorization or payment
   * @return failureUrl
  **/
  public String getFailureUrl() {
    return failureUrl;
  }

  public void setFailureUrl(String failureUrl) {
    this.failureUrl = failureUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsPrepareCallbackUrls smartTransactionsPrepareCallbackUrls = (SmartTransactionsPrepareCallbackUrls) o;
    return Objects.equals(this.successUrl, smartTransactionsPrepareCallbackUrls.successUrl) &&
        Objects.equals(this.failureUrl, smartTransactionsPrepareCallbackUrls.failureUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(successUrl, failureUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsPrepareCallbackUrls {\n");
    sb.append("    successUrl: ").append(toIndentedString(successUrl)).append("\n");
    sb.append("    failureUrl: ").append(toIndentedString(failureUrl)).append("\n");
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

