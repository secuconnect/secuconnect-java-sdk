package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;
import java.util.Objects;

/**
 * DocumentUploadsBaseProductModel
 */
public class DocumentUploadsBaseProductModel {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("created")
  private DateTime created = null;

  public DocumentUploadsBaseProductModel object(String object) {
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

  public DocumentUploadsBaseProductModel id(String id) {
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

  public DocumentUploadsBaseProductModel created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Created at date
   * @return created
  **/
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    DocumentUploadsBaseProductModel documentUploadsBaseProductModel = (DocumentUploadsBaseProductModel) o;
    return Objects.equals(this.object, documentUploadsBaseProductModel.object) &&
        Objects.equals(this.id, documentUploadsBaseProductModel.id) &&
        Objects.equals(this.created, documentUploadsBaseProductModel.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentUploadsBaseProductModel {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

