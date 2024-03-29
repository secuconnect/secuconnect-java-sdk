package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * ParentModel
 */
public class ParentModel {
  @SerializedName("object")
  protected String object = null;

  @SerializedName("id")
  protected String id = null;

  @SerializedName("type")
  protected String type = null;

  public ParentModel object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Get object
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public ParentModel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ParentModel type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Parent object subtype number
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParentModel parentModel = (ParentModel) o;
    return Objects.equals(this.object, parentModel.object) &&
        Objects.equals(this.id, parentModel.id) &&
        Objects.equals(this.type, parentModel.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParentModel {\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

