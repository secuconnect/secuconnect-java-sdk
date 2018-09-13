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
 * DocumentUploadsDTOContent
 */
public class DocumentUploadsDTOContent {
  @SerializedName("content")
  private String content = null;

  public DocumentUploadsDTOContent content(String content) {
    this.content = content;
    return this;
  }

   /**
   * Content
   * @return content
  **/
  @ApiModelProperty(value = "Content")
  public String getContent() {
    return content;
  }

  public void setContent(String content) {
    this.content = content;
  }

  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

