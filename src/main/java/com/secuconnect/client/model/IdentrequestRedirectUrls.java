package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * IdentrequestRedirectUrls
 */
public class IdentrequestRedirectUrls {
  @SerializedName("url_success")
  protected String urlSuccess = null;

  @SerializedName("url_failure")
  protected String urlFailure = null;

  public IdentrequestRedirectUrls urlSuccess(String urlSuccess) {
    this.urlSuccess = urlSuccess;
    return this;
  }

   /**
   * After successfully identification of the person is returned to this page.
   * @return urlSuccess
  **/
  public String getUrlSuccess() {
    return urlSuccess;
  }

  public void setUrlSuccess(String urlSuccess) {
    this.urlSuccess = urlSuccess;
  }

  public IdentrequestRedirectUrls urlFailure(String urlFailure) {
    this.urlFailure = urlFailure;
    return this;
  }

   /**
   * After canceling or on errors the person to be identified will be redirected to this page.
   * @return urlFailure
  **/
  public String getUrlFailure() {
    return urlFailure;
  }

  public void setUrlFailure(String urlFailure) {
    this.urlFailure = urlFailure;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentrequestRedirectUrls identrequestRedirectUrls = (IdentrequestRedirectUrls) o;
    return Objects.equals(this.urlSuccess, identrequestRedirectUrls.urlSuccess) &&
        Objects.equals(this.urlFailure, identrequestRedirectUrls.urlFailure);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urlSuccess, urlFailure);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentrequestRedirectUrls {\n");
    sb.append("    urlSuccess: ").append(toIndentedString(urlSuccess)).append("\n");
    sb.append("    urlFailure: ").append(toIndentedString(urlFailure)).append("\n");
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

