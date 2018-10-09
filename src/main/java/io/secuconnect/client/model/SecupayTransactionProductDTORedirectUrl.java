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
public class SecupayTransactionProductDTORedirectUrl {
  @SerializedName("url_success")
  private String urlSuccess = null;

  @SerializedName("url_failure")
  private String urlFailure = null;

  @SerializedName("url_push")
  private String urlPush = null;

  public SecupayTransactionProductDTORedirectUrl urlSuccess(String urlSuccess) {
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

  public SecupayTransactionProductDTORedirectUrl urlFailure(String urlFailure) {
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

  public SecupayTransactionProductDTORedirectUrl urlPush(String urlPush) {
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
    SecupayTransactionProductDTORedirectUrl secupayTransactionProductDTORedirectUrl = (SecupayTransactionProductDTORedirectUrl) o;
    return Objects.equals(this.urlSuccess, secupayTransactionProductDTORedirectUrl.urlSuccess) &&
        Objects.equals(this.urlFailure, secupayTransactionProductDTORedirectUrl.urlFailure) &&
        Objects.equals(this.urlPush, secupayTransactionProductDTORedirectUrl.urlPush);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urlSuccess, urlFailure, urlPush);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayTransactionProductDTORedirectUrl {\n");
    
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

