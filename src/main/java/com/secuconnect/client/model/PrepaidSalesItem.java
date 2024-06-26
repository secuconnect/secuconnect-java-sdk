package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * PrepaidSalesItem
 */
public class PrepaidSalesItem {
  @SerializedName("object")
  protected String object = null;

  @SerializedName("id")
  protected String id = null;

  @SerializedName("description")
  protected String description = null;

  @SerializedName("logo")
  protected String logo = null;

  @SerializedName("type")
  protected String type = null;

  public PrepaidSalesItem object(String object) {
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

  public PrepaidSalesItem id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Item ID
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PrepaidSalesItem description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Short description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PrepaidSalesItem logo(String logo) {
    this.logo = logo;
    return this;
  }

   /**
   * Logo URL
   * @return logo
  **/
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public PrepaidSalesItem type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Item type:  - &#x60;POS&#x60; - &#x60;PP&#x60;
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
    PrepaidSalesItem prepaidSalesItem = (PrepaidSalesItem) o;
    return Objects.equals(this.object, prepaidSalesItem.object) &&
        Objects.equals(this.id, prepaidSalesItem.id) &&
        Objects.equals(this.description, prepaidSalesItem.description) &&
        Objects.equals(this.logo, prepaidSalesItem.logo) &&
        Objects.equals(this.type, prepaidSalesItem.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, description, logo, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepaidSalesItem {\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
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

