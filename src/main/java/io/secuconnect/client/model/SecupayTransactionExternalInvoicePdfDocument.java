package io.secuconnect.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Information about the saved document
 */
public class SecupayTransactionExternalInvoicePdfDocument {
  @SerializedName("id")
  private String id = null;

  @SerializedName("mime_type")
  private String mimeType = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("size")
  private Integer size = null;

  @SerializedName("url")
  private String url = null;

  public SecupayTransactionExternalInvoicePdfDocument id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The Document File ID
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SecupayTransactionExternalInvoicePdfDocument mimeType(String mimeType) {
    this.mimeType = mimeType;
    return this;
  }

   /**
   * The MIME Type
   * @return mimeType
  **/
  public String getMimeType() {
    return mimeType;
  }

  public void setMimeType(String mimeType) {
    this.mimeType = mimeType;
  }

  public SecupayTransactionExternalInvoicePdfDocument name(String name) {
    this.name = name;
    return this;
  }

   /**
   * The file name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SecupayTransactionExternalInvoicePdfDocument size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * The size of the file in bytes
   * @return size
  **/
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  public SecupayTransactionExternalInvoicePdfDocument url(String url) {
    this.url = url;
    return this;
  }

   /**
   * The download-url to this file
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
    SecupayTransactionExternalInvoicePdfDocument secupayTransactionExternalInvoicePdfDocument = (SecupayTransactionExternalInvoicePdfDocument) o;
    return Objects.equals(this.id, secupayTransactionExternalInvoicePdfDocument.id) &&
        Objects.equals(this.mimeType, secupayTransactionExternalInvoicePdfDocument.mimeType) &&
        Objects.equals(this.name, secupayTransactionExternalInvoicePdfDocument.name) &&
        Objects.equals(this.size, secupayTransactionExternalInvoicePdfDocument.size) &&
        Objects.equals(this.url, secupayTransactionExternalInvoicePdfDocument.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, mimeType, name, size, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayTransactionExternalInvoicePdfDocument {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    mimeType: ").append(toIndentedString(mimeType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

