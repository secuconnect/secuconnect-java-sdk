package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.CreatedField;
import java.util.Objects;

/**
 * DocumentUploadsBaseProductModel
 */
public class DocumentUploadsBaseProductModel extends BaseProductModel {
  @SerializedName("created")
  protected String created = null;

  public DocumentUploadsBaseProductModel created(String created) {
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
    DocumentUploadsBaseProductModel documentUploadsBaseProductModel = (DocumentUploadsBaseProductModel) o;
    return Objects.equals(this.created, documentUploadsBaseProductModel.created) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DocumentUploadsBaseProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

