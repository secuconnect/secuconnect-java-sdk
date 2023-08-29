package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * MerchantCategoryDataModel
 */
public class MerchantCategoryDataModel {
  @SerializedName("id")
  protected Integer id = null;

  @SerializedName("description")
  protected String description = null;

  public MerchantCategoryDataModel id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * The ID of Merchant Category
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public MerchantCategoryDataModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of Merchant Category
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MerchantCategoryDataModel merchantCategoryDataModel = (MerchantCategoryDataModel) o;
    return Objects.equals(this.id, merchantCategoryDataModel.id) &&
        Objects.equals(this.description, merchantCategoryDataModel.description);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, description);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MerchantCategoryDataModel {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
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

