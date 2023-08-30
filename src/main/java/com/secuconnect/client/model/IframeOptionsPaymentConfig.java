package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.ApplepayPaymentConfig;
import com.secuconnect.client.model.GooglepayPaymentConfig;
import java.util.Objects;

/**
 * IframeOptionsPaymentConfig
 */
public class IframeOptionsPaymentConfig {
  @SerializedName("Googlepay")
  protected GooglepayPaymentConfig googlepay = null;

  @SerializedName("Applepay")
  protected ApplepayPaymentConfig applepay = null;

  public IframeOptionsPaymentConfig googlepay(GooglepayPaymentConfig googlepay) {
    this.googlepay = googlepay;
    return this;
  }

   /**
   * Get googlepay
   * @return googlepay
  **/
  public GooglepayPaymentConfig getGooglepay() {
    return googlepay;
  }

  public void setGooglepay(GooglepayPaymentConfig googlepay) {
    this.googlepay = googlepay;
  }

  public IframeOptionsPaymentConfig applepay(ApplepayPaymentConfig applepay) {
    this.applepay = applepay;
    return this;
  }

   /**
   * Get applepay
   * @return applepay
  **/
  public ApplepayPaymentConfig getApplepay() {
    return applepay;
  }

  public void setApplepay(ApplepayPaymentConfig applepay) {
    this.applepay = applepay;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IframeOptionsPaymentConfig iframeOptionsPaymentConfig = (IframeOptionsPaymentConfig) o;
    return Objects.equals(this.googlepay, iframeOptionsPaymentConfig.googlepay) &&
        Objects.equals(this.applepay, iframeOptionsPaymentConfig.applepay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(googlepay, applepay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IframeOptionsPaymentConfig {\n");
    sb.append("    googlepay: ").append(toIndentedString(googlepay)).append("\n");
    sb.append("    applepay: ").append(toIndentedString(applepay)).append("\n");
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

