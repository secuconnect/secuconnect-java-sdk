package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.DocumentUploadsDTOContent;
import com.secuconnect.client.model.DocumentUploadsProductModel;
import java.util.Objects;

/**
 * extended DocumentUploadsProductModel
 */
public class DocumentUploadsProductModelWithContent extends DocumentUploadsProductModel {
  @SerializedName("content")
  protected String content = null;

  public DocumentUploadsProductModelWithContent content(String content) {
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
    DocumentUploadsProductModelWithContent documentUploadsProductModelWithContent = (DocumentUploadsProductModelWithContent) o;
    return Objects.equals(this.content, documentUploadsProductModelWithContent.content) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(content, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentUploadsProductModelWithContent {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

