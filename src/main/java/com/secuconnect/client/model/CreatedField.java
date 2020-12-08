package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * CreatedField
 */
public class CreatedField {
  @SerializedName("created")
  private String created = null;

  public CreatedField created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreatedField createdField = (CreatedField) o;
    return Objects.equals(this.created, createdField.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreatedField {\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

