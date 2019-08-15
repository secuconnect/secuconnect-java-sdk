package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * SmartTransactionsCheckoutLinks
 */
public class SmartTransactionsCheckoutLinks {
  @SerializedName("url_success")
  private String urlSuccess = null;

  @SerializedName("url_failure")
  private String urlFailure = null;

  @SerializedName("url_abort")
  private String urlAbort = null;

  @SerializedName("url_error")
  private String urlError = null;

  @SerializedName("url_checkout")
  private String urlCheckout = null;

  public SmartTransactionsCheckoutLinks urlSuccess(String urlSuccess) {
    this.urlSuccess = urlSuccess;
    return this;
  }

   /**
   * Success URL
   * @return urlSuccess
  **/
  public String getUrlSuccess() {
    return urlSuccess;
  }

  public void setUrlSuccess(String urlSuccess) {
    this.urlSuccess = urlSuccess;
  }

  public SmartTransactionsCheckoutLinks urlFailure(String urlFailure) {
    this.urlFailure = urlFailure;
    return this;
  }

   /**
   * Failure URL
   * @return urlFailure
  **/
  public String getUrlFailure() {
    return urlFailure;
  }

  public void setUrlFailure(String urlFailure) {
    this.urlFailure = urlFailure;
  }

  public SmartTransactionsCheckoutLinks urlAbort(String urlAbort) {
    this.urlAbort = urlAbort;
    return this;
  }

   /**
   * Abort URL
   * @return urlAbort
  **/
  public String getUrlAbort() {
    return urlAbort;
  }

  public void setUrlAbort(String urlAbort) {
    this.urlAbort = urlAbort;
  }

  public SmartTransactionsCheckoutLinks urlError(String urlError) {
    this.urlError = urlError;
    return this;
  }

   /**
   * Error URL
   * @return urlError
  **/
  public String getUrlError() {
    return urlError;
  }

  public void setUrlError(String urlError) {
    this.urlError = urlError;
  }

  public SmartTransactionsCheckoutLinks urlCheckout(String urlCheckout) {
    this.urlCheckout = urlCheckout;
    return this;
  }

   /**
   * Smart Checkout URL
   * @return urlCheckout
  **/
  public String getUrlCheckout() {
    return urlCheckout;
  }

  public void setUrlCheckout(String urlCheckout) {
    this.urlCheckout = urlCheckout;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsCheckoutLinks smartTransactionsCheckoutLinks = (SmartTransactionsCheckoutLinks) o;
    return Objects.equals(this.urlSuccess, smartTransactionsCheckoutLinks.urlSuccess) &&
        Objects.equals(this.urlFailure, smartTransactionsCheckoutLinks.urlFailure) &&
        Objects.equals(this.urlAbort, smartTransactionsCheckoutLinks.urlAbort) &&
        Objects.equals(this.urlError, smartTransactionsCheckoutLinks.urlError) &&
        Objects.equals(this.urlCheckout, smartTransactionsCheckoutLinks.urlCheckout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urlSuccess, urlFailure, urlAbort, urlError, urlCheckout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsCheckoutLinks {\n");
    
    sb.append("    urlSuccess: ").append(toIndentedString(urlSuccess)).append("\n");
    sb.append("    urlFailure: ").append(toIndentedString(urlFailure)).append("\n");
    sb.append("    urlAbort: ").append(toIndentedString(urlAbort)).append("\n");
    sb.append("    urlError: ").append(toIndentedString(urlError)).append("\n");
    sb.append("    urlCheckout: ").append(toIndentedString(urlCheckout)).append("\n");
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

