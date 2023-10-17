package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Legal details for merchant
 */
public class GeneralMerchantsLegalDetailsDTO {
  @SerializedName("content")
  protected String content = null;

  @SerializedName("type")
  protected String type = null;

  @SerializedName("language")
  protected String language = null;

  public GeneralMerchantsLegalDetailsDTO content(String content) {
    this.content = content;
    return this;
  }

   /**
   * HTML Content or DUP Id
   * @return content
  **/
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  public GeneralMerchantsLegalDetailsDTO type(String type) {
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

  public GeneralMerchantsLegalDetailsDTO language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Language code {&#x27;de&#x27;, &#x27;en&#x27;}
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
    GeneralMerchantsLegalDetailsDTO generalMerchantsLegalDetailsDTO = (GeneralMerchantsLegalDetailsDTO) o;
    return Objects.equals(this.content, generalMerchantsLegalDetailsDTO.content) &&
        Objects.equals(this.type, generalMerchantsLegalDetailsDTO.type) &&
        Objects.equals(this.language, generalMerchantsLegalDetailsDTO.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, type, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralMerchantsLegalDetailsDTO {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

