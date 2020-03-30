package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * AssignedBy
 */
public class AssignedBy {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("owner")
  private Boolean owner = null;

  public AssignedBy object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of assigned by
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public AssignedBy id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of assigned by
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public AssignedBy owner(Boolean owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Owner
   * @return owner
  **/
  public Boolean getOwner() {
    return owner;
  }

  public void setOwner(Boolean owner) {
    this.owner = owner;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AssignedBy assignedBy = (AssignedBy) o;
    return Objects.equals(this.object, assignedBy.object) &&
        Objects.equals(this.id, assignedBy.id) &&
        Objects.equals(this.owner, assignedBy.owner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, owner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AssignedBy {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

