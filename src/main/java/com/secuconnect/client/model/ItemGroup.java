package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * E-goods product category, usually all cards of a trade mark
 */
public class ItemGroup {
  @SerializedName("object")
  protected String object = null;

  @SerializedName("id")
  protected String id = null;

  @SerializedName("description")
  protected String description = null;

  @SerializedName("logo")
  protected String logo = null;

  @SerializedName("enabled")
  protected Boolean enabled = null;

  public ItemGroup object(String object) {
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

  public ItemGroup id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Prepaid Item ID
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ItemGroup description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Short name, usually a trade mark
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public ItemGroup logo(String logo) {
    this.logo = logo;
    return this;
  }

   /**
   * Document upload ID to set logo image
   * @return logo
  **/
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public ItemGroup enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Whether the category is available
   * @return enabled
  **/
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ItemGroup itemGroup = (ItemGroup) o;
    return Objects.equals(this.object, itemGroup.object) &&
        Objects.equals(this.id, itemGroup.id) &&
        Objects.equals(this.description, itemGroup.description) &&
        Objects.equals(this.logo, itemGroup.logo) &&
        Objects.equals(this.enabled, itemGroup.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, description, logo, enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ItemGroup {\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

