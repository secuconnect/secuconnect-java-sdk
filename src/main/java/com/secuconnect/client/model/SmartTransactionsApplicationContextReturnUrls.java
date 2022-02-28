package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * SmartTransactionsApplicationContextReturnUrls
 */
public class SmartTransactionsApplicationContextReturnUrls {
  @SerializedName("url_success")
  private String urlSuccess = null;

  @SerializedName("url_abort")
  private String urlAbort = null;

  @SerializedName("url_error")
  private String urlError = null;

  @SerializedName("url_push")
  private String urlPush = null;

  public SmartTransactionsApplicationContextReturnUrls urlSuccess(String urlSuccess) {
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

  public SmartTransactionsApplicationContextReturnUrls urlAbort(String urlAbort) {
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

  public SmartTransactionsApplicationContextReturnUrls urlError(String urlError) {
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

  public SmartTransactionsApplicationContextReturnUrls urlPush(String urlPush) {
    this.urlPush = urlPush;
    return this;
  }

   /**
   * Push URL
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
    SmartTransactionsApplicationContextReturnUrls smartTransactionsApplicationContextReturnUrls = (SmartTransactionsApplicationContextReturnUrls) o;
    return Objects.equals(this.urlSuccess, smartTransactionsApplicationContextReturnUrls.urlSuccess) &&
        Objects.equals(this.urlAbort, smartTransactionsApplicationContextReturnUrls.urlAbort) &&
        Objects.equals(this.urlError, smartTransactionsApplicationContextReturnUrls.urlError) &&
        Objects.equals(this.urlPush, smartTransactionsApplicationContextReturnUrls.urlPush);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urlSuccess, urlAbort, urlError, urlPush);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsApplicationContextReturnUrls {\n");
    sb.append("    urlSuccess: ").append(toIndentedString(urlSuccess)).append("\n");
    sb.append("    urlAbort: ").append(toIndentedString(urlAbort)).append("\n");
    sb.append("    urlError: ").append(toIndentedString(urlError)).append("\n");
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

