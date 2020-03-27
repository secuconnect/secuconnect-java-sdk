package io.secuconnect.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * LoyaltyCardgroupsProductModel
 */
public class LoyaltyCardgroupsProductModel extends BaseProductModel {
  @SerializedName("merchant")
  private LoyaltyCardgroupsDTOMerchant merchant = null;

  @SerializedName("display_name")
  private String displayName = null;

  @SerializedName("display_name_raw")
  private String displayNameRaw = null;

  @SerializedName("stock_warn_limit")
  private String stockWarnLimit = null;

  @SerializedName("picture")
  private String picture = null;

  public LoyaltyCardgroupsProductModel merchant(LoyaltyCardgroupsDTOMerchant merchant) {
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

  public LoyaltyCardgroupsProductModel displayName(String displayName) {
    this.displayName = displayName;
    return this;
  }

   /**
   * Loyalty card group display name
   * @return displayName
  **/
  public String getDisplayName() {
    return displayName;
  }

  public void setDisplayName(String displayName) {
    this.displayName = displayName;
  }

  public LoyaltyCardgroupsProductModel displayNameRaw(String displayNameRaw) {
    this.displayNameRaw = displayNameRaw;
    return this;
  }

   /**
   * Loyalty card group display name raw
   * @return displayNameRaw
  **/
  public String getDisplayNameRaw() {
    return displayNameRaw;
  }

  public void setDisplayNameRaw(String displayNameRaw) {
    this.displayNameRaw = displayNameRaw;
  }

  public LoyaltyCardgroupsProductModel stockWarnLimit(String stockWarnLimit) {
    this.stockWarnLimit = stockWarnLimit;
    return this;
  }

   /**
   * Loyalty card group stock warn limit
   * @return stockWarnLimit
  **/
  public String getStockWarnLimit() {
    return stockWarnLimit;
  }

  public void setStockWarnLimit(String stockWarnLimit) {
    this.stockWarnLimit = stockWarnLimit;
  }

  public LoyaltyCardgroupsProductModel picture(String picture) {
    this.picture = picture;
    return this;
  }

   /**
   * Loyalty card group picture
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
    LoyaltyCardgroupsProductModel loyaltyCardgroupsProductModel = (LoyaltyCardgroupsProductModel) o;
    return Objects.equals(this.merchant, loyaltyCardgroupsProductModel.merchant) &&
        Objects.equals(this.displayName, loyaltyCardgroupsProductModel.displayName) &&
        Objects.equals(this.displayNameRaw, loyaltyCardgroupsProductModel.displayNameRaw) &&
        Objects.equals(this.stockWarnLimit, loyaltyCardgroupsProductModel.stockWarnLimit) &&
        Objects.equals(this.picture, loyaltyCardgroupsProductModel.picture) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchant, displayName, displayNameRaw, stockWarnLimit, picture, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyCardgroupsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    displayName: ").append(toIndentedString(displayName)).append("\n");
    sb.append("    displayNameRaw: ").append(toIndentedString(displayNameRaw)).append("\n");
    sb.append("    stockWarnLimit: ").append(toIndentedString(stockWarnLimit)).append("\n");
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

