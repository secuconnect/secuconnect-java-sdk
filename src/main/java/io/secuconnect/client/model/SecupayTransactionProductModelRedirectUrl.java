package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/**
 * A list of redirect urls used for the payment checkout page
 */
@ApiModel(description = "A list of redirect urls used for the payment checkout page")
public class SecupayTransactionProductModelRedirectUrl {
  @SerializedName("iframe_url")
  private String iframeUrl = null;

  @SerializedName("url_success")
  private String urlSuccess = null;

  @SerializedName("url_failure")
  private String urlFailure = null;

  @SerializedName("url_push")
  private String urlPush = null;

  public SecupayTransactionProductModelRedirectUrl iframeUrl(String iframeUrl) {
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

  public SecupayTransactionProductModelRedirectUrl urlSuccess(String urlSuccess) {
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

  public SecupayTransactionProductModelRedirectUrl urlFailure(String urlFailure) {
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

  public SecupayTransactionProductModelRedirectUrl urlPush(String urlPush) {
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
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayTransactionProductModelRedirectUrl secupayTransactionProductModelRedirectUrl = (SecupayTransactionProductModelRedirectUrl) o;
    return Objects.equals(this.iframeUrl, secupayTransactionProductModelRedirectUrl.iframeUrl) &&
        Objects.equals(this.urlSuccess, secupayTransactionProductModelRedirectUrl.urlSuccess) &&
        Objects.equals(this.urlFailure, secupayTransactionProductModelRedirectUrl.urlFailure) &&
        Objects.equals(this.urlPush, secupayTransactionProductModelRedirectUrl.urlPush);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iframeUrl, urlSuccess, urlFailure, urlPush);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayTransactionProductModelRedirectUrl {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

