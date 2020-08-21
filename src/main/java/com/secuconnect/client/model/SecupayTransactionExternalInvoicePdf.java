package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SecupayTransactionExternalInvoicePdfDocument;
import java.util.Objects;

/**
 * SecupayTransactionExternalInvoicePdf
 */
public class SecupayTransactionExternalInvoicePdf {
  @SerializedName("document")
  private SecupayTransactionExternalInvoicePdfDocument document = null;

  public SecupayTransactionExternalInvoicePdf document(SecupayTransactionExternalInvoicePdfDocument document) {
    this.document = document;
    return this;
  }

   /**
   * Get document
   * @return document
  **/
  public SecupayTransactionExternalInvoicePdfDocument getDocument() {
    return document;
  }

  public void setDocument(SecupayTransactionExternalInvoicePdfDocument document) {
    this.document = document;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayTransactionExternalInvoicePdf secupayTransactionExternalInvoicePdf = (SecupayTransactionExternalInvoicePdf) o;
    return Objects.equals(this.document, secupayTransactionExternalInvoicePdf.document);
  }

  @Override
  public int hashCode() {
    return Objects.hash(document);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayTransactionExternalInvoicePdf {\n");
    sb.append("    document: ").append(toIndentedString(document)).append("\n");
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

