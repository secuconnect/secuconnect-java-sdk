package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartTemplatesAccordionItemModel;
import com.secuconnect.client.model.SmartTemplatesElementModel;
import com.secuconnect.client.model.SmartTemplatesFormElementModel;
import java.util.List;
import java.util.Objects;

/**
 * SmartTemplatesFormElementModel
 */
public class SmartTemplatesFormElementModel extends SmartTemplatesElementModel {
  @SerializedName("name")
  private String name = null;

  public SmartTemplatesFormElementModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of form element
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTemplatesFormElementModel smartTemplatesFormElementModel = (SmartTemplatesFormElementModel) o;
    return Objects.equals(this.name, smartTemplatesFormElementModel.name) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTemplatesFormElementModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

