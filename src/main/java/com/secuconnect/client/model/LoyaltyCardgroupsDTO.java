package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.LoyaltyCardgroupsDTOMerchant;
import java.util.Objects;

/**
 * LoyaltyCardgroupsDTO
 */
public class LoyaltyCardgroupsDTO {
  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("display_name_raw")
  private String displayNameRaw = null;

  @SerializedName("stock_warn_limit")
  private String stockWarnLimit = null;

  @SerializedName("picture")
  private String picture = null;

  @SerializedName("merchant")
  private LoyaltyCardgroupsDTOMerchant merchant = null;

  public LoyaltyCardgroupsDTO displayName(String displayName) {
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

  public LoyaltyCardgroupsDTO displayNameRaw(String displayNameRaw) {
    this.displayNameRaw = displayNameRaw;
    return this;
  }

   /**
   * Display name raw
   * @return displayNameRaw
  **/
  public String getDisplayNameRaw() {
    return displayNameRaw;
  }

  public void setDisplayNameRaw(String displayNameRaw) {
    this.displayNameRaw = displayNameRaw;
  }

  public LoyaltyCardgroupsDTO stockWarnLimit(String stockWarnLimit) {
    this.stockWarnLimit = stockWarnLimit;
    return this;
  }

   /**
   * Stock warn limit
   * @return stockWarnLimit
  **/
  public String getStockWarnLimit() {
    return stockWarnLimit;
  }

  public void setStockWarnLimit(String stockWarnLimit) {
    this.stockWarnLimit = stockWarnLimit;
  }

  public LoyaltyCardgroupsDTO picture(String picture) {
    this.picture = picture;
    return this;
  }

   /**
   * Picture
   * @return picture
  **/
  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public LoyaltyCardgroupsDTO merchant(LoyaltyCardgroupsDTOMerchant merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  public LoyaltyCardgroupsDTOMerchant getMerchant() {
    return merchant;
  }

  public void setMerchant(LoyaltyCardgroupsDTOMerchant merchant) {
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
        Objects.equals(this.displayNameRaw, loyaltyCardgroupsDTO.displayNameRaw) &&
        Objects.equals(this.stockWarnLimit, loyaltyCardgroupsDTO.stockWarnLimit) &&
        Objects.equals(this.picture, loyaltyCardgroupsDTO.picture) &&
        Objects.equals(this.merchant, loyaltyCardgroupsDTO.merchant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(displayName, displayNameRaw, stockWarnLimit, picture, merchant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyCardgroupsDTO {\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    displayNameRaw: ").append(toIndentedString(displayNameRaw)).append("\n");
    sb.append("    stockWarnLimit: ").append(toIndentedString(stockWarnLimit)).append("\n");
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

