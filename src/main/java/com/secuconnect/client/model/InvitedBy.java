package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * InvitedBy
 */
public class InvitedBy {
  @SerializedName("object")
  protected String object = null;

  @SerializedName("id")
  protected String id = null;

  @SerializedName("invited")
  protected String invited = null;

  public InvitedBy object(String object) {
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

  public InvitedBy id(String id) {
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

  public InvitedBy invited(String invited) {
    this.invited = invited;
    return this;
  }

   /**
   * Email address of the inviting person
   * @return invited
  **/
  public String getInvited() {
    return invited;
  }

  public void setInvited(String invited) {
    this.invited = invited;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    InvitedBy invitedBy = (InvitedBy) o;
    return Objects.equals(this.object, invitedBy.object) &&
        Objects.equals(this.id, invitedBy.id) &&
        Objects.equals(this.invited, invitedBy.invited);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, invited);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class InvitedBy {\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    invited: ").append(toIndentedString(invited)).append("\n");
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

