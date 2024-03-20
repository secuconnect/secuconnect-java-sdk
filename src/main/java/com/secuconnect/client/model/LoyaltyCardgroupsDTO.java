package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyCardgroupsDTO
 */
public class LoyaltyCardgroupsDTO {
  @SerializedName("display_name")
  protected String displayName = null;

  @SerializedName("picture")
  protected String picture = null;

  @SerializedName("merchant")
  protected String merchant = null;

  public LoyaltyCardgroupsDTO displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Display name (programme name)
   * @return displayName
  **/
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public LoyaltyCardgroupsDTO picture(String picture) {
    this.picture = picture;
    return this;
  }

   /**
   * Document Upload ID of symbol image
   * @return picture
  **/
  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public LoyaltyCardgroupsDTO merchant(String merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * General Merchant ID
   * @return merchant
  **/
  public String getMerchant() {
    return merchant;
  }

  public void setMerchant(String merchant) {
    this.merchant = merchant;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyCardgroupsDTO loyaltyCardgroupsDTO = (LoyaltyCardgroupsDTO) o;
    return Objects.equals(this.displayName, loyaltyCardgroupsDTO.displayName) &&
        Objects.equals(this.picture, loyaltyCardgroupsDTO.picture) &&
        Objects.equals(this.merchant, loyaltyCardgroupsDTO.merchant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, picture, merchant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyCardgroupsDTO {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
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

