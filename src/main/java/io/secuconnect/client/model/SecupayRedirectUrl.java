package io.secuconnect.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * SecupayRedirectUrl
 */
public class SecupayRedirectUrl {
  @SerializedName("iframe_url")
  private String iframeUrl = null;

  @SerializedName("url_success")
  private String urlSuccess = null;

  @SerializedName("url_failure")
  private String urlFailure = null;

  @SerializedName("url_push")
  private String urlPush = null;

  public SecupayRedirectUrl iframeUrl(String iframeUrl) {
    this.iframeUrl = iframeUrl;
    return this;
  }

   /**
   * The url of the payment checkout iframe
   * @return iframeUrl
  **/
  public String getIframeUrl() {
    return iframeUrl;
  }

  public void setIframeUrl(String iframeUrl) {
    this.iframeUrl = iframeUrl;
  }

  public SecupayRedirectUrl urlSuccess(String urlSuccess) {
    this.urlSuccess = urlSuccess;
    return this;
  }

   /**
   * After successfully entering the cash data of the payer is returned to this page.
   * @return urlSuccess
  **/
  public String getUrlSuccess() {
    return urlSuccess;
  }

  public void setUrlSuccess(String urlSuccess) {
    this.urlSuccess = urlSuccess;
  }

  public SecupayRedirectUrl urlFailure(String urlFailure) {
    this.urlFailure = urlFailure;
    return this;
  }

   /**
   * After canceling or on errors the payer will be redirected to this page and can select there an another payment method.
   * @return urlFailure
  **/
  public String getUrlFailure() {
    return urlFailure;
  }

  public void setUrlFailure(String urlFailure) {
    this.urlFailure = urlFailure;
  }

  public SecupayRedirectUrl urlPush(String urlPush) {
    this.urlPush = urlPush;
    return this;
  }

   /**
   * The secupay system will be send status change notifications to this URL.
   * @return urlPush
  **/
  public String getUrlPush() {
    return urlPush;
  }

  public void setUrlPush(String urlPush) {
    this.urlPush = urlPush;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayRedirectUrl secupayRedirectUrl = (SecupayRedirectUrl) o;
    return Objects.equals(this.iframeUrl, secupayRedirectUrl.iframeUrl) &&
        Objects.equals(this.urlSuccess, secupayRedirectUrl.urlSuccess) &&
        Objects.equals(this.urlFailure, secupayRedirectUrl.urlFailure) &&
        Objects.equals(this.urlPush, secupayRedirectUrl.urlPush);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iframeUrl, urlSuccess, urlFailure, urlPush);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayRedirectUrl {\n");
    
    sb.append("    iframeUrl: ").append(toIndentedString(iframeUrl)).append("\n");
    sb.append("    urlSuccess: ").append(toIndentedString(urlSuccess)).append("\n");
    sb.append("    urlFailure: ").append(toIndentedString(urlFailure)).append("\n");
    sb.append("    urlPush: ").append(toIndentedString(urlPush)).append("\n");
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

