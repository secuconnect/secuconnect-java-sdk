package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * UploadmandateDTO
 */
public class UploadmandateDTO {
  @SerializedName("document_id")
  private String documentId = null;

  public UploadmandateDTO documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Document id for assign
   * @return documentId
  **/
  public String getDocumentId() {
    return documentId;
  }

  public void setDocumentId(String documentId) {
    this.documentId = documentId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadmandateDTO uploadmandateDTO = (UploadmandateDTO) o;
    return Objects.equals(this.documentId, uploadmandateDTO.documentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadmandateDTO {\n");
    
    sb.append("    documentId: ").append(toIndentedString(documentId)).append("\n");
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

