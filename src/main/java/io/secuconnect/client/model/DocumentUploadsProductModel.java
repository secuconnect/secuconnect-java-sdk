package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.DocumentUploadsBaseProductModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * DocumentUploadsProductModel
 */
public class DocumentUploadsProductModel {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("size")
  private Integer size = null;

  public DocumentUploadsProductModel object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of document upload
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public DocumentUploadsProductModel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of document upload
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DocumentUploadsProductModel created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Created at date
   * @return created
  **/
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public DocumentUploadsProductModel type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type
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
   * Name
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
   * Size
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
    return Objects.equals(this.object, documentUploadsProductModel.object) &&
        Objects.equals(this.id, documentUploadsProductModel.id) &&
        Objects.equals(this.created, documentUploadsProductModel.created) &&
        Objects.equals(this.type, documentUploadsProductModel.type) &&
        Objects.equals(this.name, documentUploadsProductModel.name) &&
        Objects.equals(this.size, documentUploadsProductModel.size);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, created, type, name, size);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentUploadsProductModel {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

