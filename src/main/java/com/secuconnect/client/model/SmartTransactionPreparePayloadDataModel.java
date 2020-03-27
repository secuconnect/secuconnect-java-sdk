package com.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SmartTransactionPreparePayloadDataModel
 */
public class SmartTransactionPreparePayloadDataModel {
  @SerializedName("callback_urls")
  private List<String> callbackUrls = null;

  @SerializedName("email")
  private String email = null;

  @SerializedName("mode")
  private String mode = null;

  @SerializedName("is_paypal_basic")
  private Boolean isPaypalBasic = null;

  public SmartTransactionPreparePayloadDataModel callbackUrls(List<String> callbackUrls) {
    this.callbackUrls = callbackUrls;
    return this;
  }

  public SmartTransactionPreparePayloadDataModel addCallbackUrlsItem(String callbackUrlsItem) {
    if (this.callbackUrls == null) {
      this.callbackUrls = new ArrayList<String>();
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

  public SmartTransactionPreparePayloadDataModel mode(String mode) {
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

  public SmartTransactionPreparePayloadDataModel isPaypalBasic(Boolean isPaypalBasic) {
    this.isPaypalBasic = isPaypalBasic;
    return this;
  }

   /**
   * Information whether a smart transaction is PayPal basic or not
   * @return isPaypalBasic
  **/
  public Boolean isIsPaypalBasic() {
    return isPaypalBasic;
  }

  public void setIsPaypalBasic(Boolean isPaypalBasic) {
    this.isPaypalBasic = isPaypalBasic;
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
        Objects.equals(this.mode, smartTransactionPreparePayloadDataModel.mode) &&
        Objects.equals(this.isPaypalBasic, smartTransactionPreparePayloadDataModel.isPaypalBasic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(callbackUrls, email, mode, isPaypalBasic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionPreparePayloadDataModel {\n");
    
    sb.append("    callbackUrls: ").append(toIndentedString(callbackUrls)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    mode: ").append(toIndentedString(mode)).append("\n");
    sb.append("    isPaypalBasic: ").append(toIndentedString(isPaypalBasic)).append("\n");
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

