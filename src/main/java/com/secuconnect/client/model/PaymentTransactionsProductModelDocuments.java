package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Transaction documents
 */
public class PaymentTransactionsProductModelDocuments {
  @SerializedName("url")
  protected String url = null;

  @SerializedName("type")
  protected String type = null;

  @SerializedName("document_type")
  protected String documentType = null;

  public PaymentTransactionsProductModelDocuments url(String url) {
    this.url = url;
    return this;
  }

   /**
   * URL
   * @return url
  **/
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  public PaymentTransactionsProductModelDocuments type(String type) {
    this.type = type;
    return this;
  }

   /**
   * type of the document (f.e. &#x27;pdf&#x27;)
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PaymentTransactionsProductModelDocuments documentType(String documentType) {
    this.documentType = documentType;
    return this;
  }

   /**
   * document type / label (f.e. &#x27;Zahlungsanforderung&#x27;)
   * @return documentType
  **/
  public String getDocumentType() {
    return documentType;
  }

  public void setDocumentType(String documentType) {
    this.documentType = documentType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransactionsProductModelDocuments paymentTransactionsProductModelDocuments = (PaymentTransactionsProductModelDocuments) o;
    return Objects.equals(this.url, paymentTransactionsProductModelDocuments.url) &&
        Objects.equals(this.type, paymentTransactionsProductModelDocuments.type) &&
        Objects.equals(this.documentType, paymentTransactionsProductModelDocuments.documentType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(url, type, documentType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransactionsProductModelDocuments {\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    documentType: ").append(toIndentedString(documentType)).append("\n");
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

