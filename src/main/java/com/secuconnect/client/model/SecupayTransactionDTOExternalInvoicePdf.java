package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * SecupayTransactionDTOExternalInvoicePdf
 */
public class SecupayTransactionDTOExternalInvoicePdf {
  @SerializedName("update_existing")
  protected Boolean updateExisting = null;

  public SecupayTransactionDTOExternalInvoicePdf updateExisting(Boolean updateExisting) {
    this.updateExisting = updateExisting;
    return this;
  }

   /**
   * Update existing invoice PDF
   * @return updateExisting
  **/
  public Boolean getUpdateExisting() {
    return updateExisting;
  }

  public void setUpdateExisting(Boolean updateExisting) {
    this.updateExisting = updateExisting;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayTransactionDTOExternalInvoicePdf secupayTransactionDTOExternalInvoicePdf = (SecupayTransactionDTOExternalInvoicePdf) o;
    return Objects.equals(this.updateExisting, secupayTransactionDTOExternalInvoicePdf.updateExisting);
  }

  @Override
  public int hashCode() {
    return Objects.hash(updateExisting);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayTransactionDTOExternalInvoicePdf {\n");
    sb.append("    updateExisting: ").append(toIndentedString(updateExisting)).append("\n");
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

