package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Object type and ID
 */
public class ProductInstanceUID {
  @SerializedName("object")
  protected String object = null;

  @SerializedName("id")
  protected String id = null;

  public ProductInstanceUID object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public ProductInstanceUID id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Object ID
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductInstanceUID productInstanceUID = (ProductInstanceUID) o;
    return Objects.equals(this.object, productInstanceUID.object) &&
        Objects.equals(this.id, productInstanceUID.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductInstanceUID {\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

