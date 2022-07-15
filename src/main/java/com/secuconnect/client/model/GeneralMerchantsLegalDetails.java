package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * GeneralMerchantsLegalDetails
 */
public class GeneralMerchantsLegalDetails {
  @SerializedName("url")
  private String url = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("content_type")
  private String contentType = null;

  @SerializedName("language")
  private String language = null;

  public GeneralMerchantsLegalDetails url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL
   * @return url
  **/
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public GeneralMerchantsLegalDetails type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Document type: &#x27;imprint&#x27;, &#x27;revocation&#x27; (cancellation policy), &#x27;terms&#x27; (terms of use), &#x27;policy&#x27; (privacy policy), or &#x27;logo&#x27;
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GeneralMerchantsLegalDetails contentType(String contentType) {
    this.contentType = contentType;
    return this;
  }

   /**
   * MIME type
   * @return contentType
  **/
  public String getContentType() {
    return contentType;
  }

  public void setContentType(String contentType) {
    this.contentType = contentType;
  }

  public GeneralMerchantsLegalDetails language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Language code {&#x27;de&#x27;, &#x27;en&#x27;, ...}
   * @return language
  **/
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralMerchantsLegalDetails generalMerchantsLegalDetails = (GeneralMerchantsLegalDetails) o;
    return Objects.equals(this.url, generalMerchantsLegalDetails.url) &&
        Objects.equals(this.type, generalMerchantsLegalDetails.type) &&
        Objects.equals(this.contentType, generalMerchantsLegalDetails.contentType) &&
        Objects.equals(this.language, generalMerchantsLegalDetails.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, type, contentType, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralMerchantsLegalDetails {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    contentType: ").append(toIndentedString(contentType)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

