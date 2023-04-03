package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.LoyaltyCardgroupsDTOMerchant;
import java.util.Objects;

/**
 * LoyaltyCardgroupsProductModel
 */
public class LoyaltyCardgroupsProductModel extends BaseProductModel {
  @SerializedName("l")
  private Integer l = null;

  @SerializedName("k")
  private Integer k = null;

  @SerializedName("ks")
  private String ks = null;

  @SerializedName("c")
  private Integer c = null;

  @SerializedName("s")
  private Integer s = null;

  @SerializedName("t")
  private AggregationTimeResult t = null;

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

  public LoyaltyCardgroupsProductModel l(Integer l) {
    this.l = l;
    return this;
  }

   /**
   * lookup index
   * @return l
  **/
  public Integer getL() {
    return l;
  }

  public void setL(Integer l) {
    this.l = l;
  }

  public LoyaltyCardgroupsProductModel k(Integer k) {
    this.k = k;
    return this;
  }

   /**
   * key index
   * @return k
  **/
  public Integer getK() {
    return k;
  }

  public void setK(Integer k) {
    this.k = k;
  }

  public LoyaltyCardgroupsProductModel ks(String ks) {
    this.ks = ks;
    return this;
  }

   /**
   * key name
   * @return ks
  **/
  public String getKs() {
    return ks;
  }

  public void setKs(String ks) {
    this.ks = ks;
  }

  public LoyaltyCardgroupsProductModel c(Integer c) {
    this.c = c;
    return this;
  }

   /**
   * count (number of items)
   * @return c
  **/
  public Integer getC() {
    return c;
  }

  public void setC(Integer c) {
    this.c = c;
  }

  public LoyaltyCardgroupsProductModel s(Integer s) {
    this.s = s;
    return this;
  }

   /**
   * sum
   * @return s
  **/
  public Integer getS() {
    return s;
  }

  public void setS(Integer s) {
    this.s = s;
  }

  public LoyaltyCardgroupsProductModel t(AggregationTimeResult t) {
    this.t = t;
    return this;
  }

   /**
   * Get t
   * @return t
  **/
  public AggregationTimeResult getT() {
    return t;
  }

  public void setT(AggregationTimeResult t) {
    this.t = t;
  }

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
    return Objects.equals(this.l, loyaltyCardgroupsProductModel.l) &&
        Objects.equals(this.k, loyaltyCardgroupsProductModel.k) &&
        Objects.equals(this.ks, loyaltyCardgroupsProductModel.ks) &&
        Objects.equals(this.c, loyaltyCardgroupsProductModel.c) &&
        Objects.equals(this.s, loyaltyCardgroupsProductModel.s) &&
        Objects.equals(this.t, loyaltyCardgroupsProductModel.t) &&
        Objects.equals(this.merchant, loyaltyCardgroupsProductModel.merchant) &&
        Objects.equals(this.displayName, loyaltyCardgroupsProductModel.displayName) &&
        Objects.equals(this.displayNameRaw, loyaltyCardgroupsProductModel.displayNameRaw) &&
        Objects.equals(this.stockWarnLimit, loyaltyCardgroupsProductModel.stockWarnLimit) &&
        Objects.equals(this.picture, loyaltyCardgroupsProductModel.picture) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, merchant, displayName, displayNameRaw, stockWarnLimit, picture, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyCardgroupsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    l: ").append(toIndentedString(l)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    ks: ").append(toIndentedString(ks)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
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

