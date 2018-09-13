package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.DocumentUploadsBaseProductModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;
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
  private DateTime created = null;

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
  @ApiModelProperty(value = "Object of document upload")
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
  @ApiModelProperty(value = "Id of document upload")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public DocumentUploadsProductModel created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Created at date
   * @return created
  **/
  @ApiModelProperty(value = "Created at date")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
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
  @ApiModelProperty(value = "Type")
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
  @ApiModelProperty(value = "Name")
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
  @ApiModelProperty(value = "Size")
  public Integer getSize() {
    return size;
  }

  public void setSize(Integer size) {
    this.size = size;
  }

  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

