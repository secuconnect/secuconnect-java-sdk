package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * UploadMandateDTO
 */
public class UploadMandateDTO {
  @SerializedName("document_id")
  protected String documentId = null;

  public UploadMandateDTO documentId(String documentId) {
    this.documentId = documentId;
    return this;
  }

   /**
   * Document ID to assign
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
    UploadMandateDTO uploadMandateDTO = (UploadMandateDTO) o;
    return Objects.equals(this.documentId, uploadMandateDTO.documentId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(documentId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadMandateDTO {\n");
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

