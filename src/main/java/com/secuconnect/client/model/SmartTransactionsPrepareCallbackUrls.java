package com.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * SmartTransactionsPrepareCallbackUrls
 */
public class SmartTransactionsPrepareCallbackUrls {
  @SerializedName("success_url")
  private String successUrl = null;

  @SerializedName("failure_url")
  private String failureUrl = null;

  public SmartTransactionsPrepareCallbackUrls successUrl(String successUrl) {
    this.successUrl = successUrl;
    return this;
  }

   /**
   * Success URL
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
   * Failure URL
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

