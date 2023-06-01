package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Document link object
 */
public class DocumentLink {
  @SerializedName("url")
  protected String url = null;

  @SerializedName("type")
  protected String type = null;

  public DocumentLink url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL to the document
   * @return url
  **/
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public DocumentLink type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Document type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentLink documentLink = (DocumentLink) o;
    return Objects.equals(this.url, documentLink.url) &&
        Objects.equals(this.type, documentLink.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentLink {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

