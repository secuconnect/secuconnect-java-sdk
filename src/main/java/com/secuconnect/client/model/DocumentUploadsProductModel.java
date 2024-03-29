package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.DocumentUploadsBaseProductModel;
import java.util.Objects;

/**
 * DocumentUploadsProductModel
 */
public class DocumentUploadsProductModel extends DocumentUploadsBaseProductModel {
  @SerializedName("type")
  protected String type = null;

  @SerializedName("name")
  protected String name = null;

  @SerializedName("size")
  protected Integer size = null;

  public DocumentUploadsProductModel type(String type) {
    this.type = type;
    return this;
  }

   /**
   * MIME Type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public DocumentUploadsProductModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Original filename
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public DocumentUploadsProductModel size(Integer size) {
    this.size = size;
    return this;
  }

   /**
   * Filesize
   * @return size
  **/
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentUploadsProductModel documentUploadsProductModel = (DocumentUploadsProductModel) o;
    return Objects.equals(this.type, documentUploadsProductModel.type) &&
        Objects.equals(this.name, documentUploadsProductModel.name) &&
        Objects.equals(this.size, documentUploadsProductModel.size) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, name, size, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentUploadsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    size: ").append(toIndentedString(size)).append("\n");
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

