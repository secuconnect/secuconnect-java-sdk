package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Store
 */
public class Store {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("name_raw")
  private String nameRaw = null;

  public Store object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of store
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public Store id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of store
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Store name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Store name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Store nameRaw(String nameRaw) {
    this.nameRaw = nameRaw;
    return this;
  }

   /**
   * Store name raw
   * @return nameRaw
  **/
  public String getNameRaw() {
    return nameRaw;
  }

  public void setNameRaw(String nameRaw) {
    this.nameRaw = nameRaw;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Store store = (Store) o;
    return Objects.equals(this.object, store.object) &&
        Objects.equals(this.id, store.id) &&
        Objects.equals(this.name, store.name) &&
        Objects.equals(this.nameRaw, store.nameRaw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, name, nameRaw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Store {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameRaw: ").append(toIndentedString(nameRaw)).append("\n");
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

