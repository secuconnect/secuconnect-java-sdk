package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyCardgroupsUpdateDTO
 */
public class LoyaltyCardgroupsUpdateDTO {
  @SerializedName("display_name")
  protected String displayName = null;

  @SerializedName("picture")
  protected String picture = null;

  public LoyaltyCardgroupsUpdateDTO displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name
   * @return displayName
  **/
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public LoyaltyCardgroupsUpdateDTO picture(String picture) {
    this.picture = picture;
    return this;
  }

   /**
   * The document ID of an card group picture
   * @return picture
  **/
  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyCardgroupsUpdateDTO loyaltyCardgroupsUpdateDTO = (LoyaltyCardgroupsUpdateDTO) o;
    return Objects.equals(this.displayName, loyaltyCardgroupsUpdateDTO.displayName) &&
        Objects.equals(this.picture, loyaltyCardgroupsUpdateDTO.picture);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, picture);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyCardgroupsUpdateDTO {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
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

