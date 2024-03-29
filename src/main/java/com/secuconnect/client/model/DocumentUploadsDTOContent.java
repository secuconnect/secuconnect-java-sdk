package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * DocumentUploadsDTOContent
 */
public class DocumentUploadsDTOContent {
  @SerializedName("content")
  protected String content = null;

  public DocumentUploadsDTOContent content(String content) {
    this.content = content;
    return this;
  }

   /**
   * File content as Base64 encoded string
   * @return content
  **/
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentUploadsDTOContent documentUploadsDTOContent = (DocumentUploadsDTOContent) o;
    return Objects.equals(this.content, documentUploadsDTOContent.content);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentUploadsDTOContent {\n");
    sb.append("    content: ").append(toIndentedString(content)).append("\n");
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

