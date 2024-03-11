package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Identification document
 */
public class IdentDocument {
  @SerializedName("type")
  protected String type = null;

  @SerializedName("url")
  protected String url = null;

  public IdentDocument type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of the ID document
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public IdentDocument url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL to ID document
   * @return url
  **/
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentDocument identDocument = (IdentDocument) o;
    return Objects.equals(this.type, identDocument.type) &&
        Objects.equals(this.url, identDocument.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentDocument {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
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

