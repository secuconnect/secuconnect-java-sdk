package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.BaseProductModel;
import java.util.Objects;

/**
 * General Merchants Object
 */
public class MRC_Object extends BaseProductModel {
  @SerializedName("object")
  private String object = "general.merchants";

  @SerializedName("id")
  private String id = null;

  public MRC_Object object(String object) {
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

  public MRC_Object id(String id) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MRC_Object mrCObject = (MRC_Object) o;
    return Objects.equals(this.object, mrCObject.object) &&
        Objects.equals(this.id, mrCObject.id) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MRC_Object {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

