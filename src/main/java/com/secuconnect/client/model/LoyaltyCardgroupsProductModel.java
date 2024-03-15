package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.GeneralMerchantsProductModel;
import java.util.Objects;

/**
 * LoyaltyCardgroupsProductModel
 */
public class LoyaltyCardgroupsProductModel extends BaseProductModel {
  @SerializedName("l")
  protected Integer l = null;

  @SerializedName("k")
  protected Integer k = null;

  @SerializedName("ks")
  protected String ks = null;

  @SerializedName("c")
  protected Integer c = null;

  @SerializedName("s")
  protected Integer s = null;

  @SerializedName("t")
  protected AggregationTimeResult t = null;

  @SerializedName("merchant")
  protected GeneralMerchantsProductModel merchant = null;

  @SerializedName("display_name")
  protected String displayName = null;

  @SerializedName("display_name_raw")
  protected String displayNameRaw = null;

  @SerializedName("stock_warn_limit")
  protected Integer stockWarnLimit = null;

  @SerializedName("picture")
  protected String picture = null;

  @SerializedName("balance_limit")
  protected Integer balanceLimit = null;

  @SerializedName("balance_expiry")
  protected Boolean balanceExpiry = null;

  @SerializedName("cancel_selected")
  protected Boolean cancelSelected = null;

  @SerializedName("description")
  protected String description = null;

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

  public LoyaltyCardgroupsProductModel merchant(GeneralMerchantsProductModel merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  public GeneralMerchantsProductModel getMerchant() {
    return merchant;
  }

  public void setMerchant(GeneralMerchantsProductModel merchant) {
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

  public LoyaltyCardgroupsProductModel stockWarnLimit(Integer stockWarnLimit) {
    this.stockWarnLimit = stockWarnLimit;
    return this;
  }

   /**
   * Loyalty card group stock warn limit
   * @return stockWarnLimit
  **/
  public Integer getStockWarnLimit() {
    return stockWarnLimit;
  }

  public void setStockWarnLimit(Integer stockWarnLimit) {
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

  public LoyaltyCardgroupsProductModel balanceLimit(Integer balanceLimit) {
    this.balanceLimit = balanceLimit;
    return this;
  }

   /**
   * Loyalty card group balance limit
   * @return balanceLimit
  **/
  public Integer getBalanceLimit() {
    return balanceLimit;
  }

  public void setBalanceLimit(Integer balanceLimit) {
    this.balanceLimit = balanceLimit;
  }

  public LoyaltyCardgroupsProductModel balanceExpiry(Boolean balanceExpiry) {
    this.balanceExpiry = balanceExpiry;
    return this;
  }

   /**
   * The card group allows to set an expiry date for a card.
   * @return balanceExpiry
  **/
  public Boolean getBalanceExpiry() {
    return balanceExpiry;
  }

  public void setBalanceExpiry(Boolean balanceExpiry) {
    this.balanceExpiry = balanceExpiry;
  }

  public LoyaltyCardgroupsProductModel cancelSelected(Boolean cancelSelected) {
    this.cancelSelected = cancelSelected;
    return this;
  }

   /**
   * The card group allows to cancel specific transactions.
   * @return cancelSelected
  **/
  public Boolean getCancelSelected() {
    return cancelSelected;
  }

  public void setCancelSelected(Boolean cancelSelected) {
    this.cancelSelected = cancelSelected;
  }

  public LoyaltyCardgroupsProductModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Loyalty card group description
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
        Objects.equals(this.balanceLimit, loyaltyCardgroupsProductModel.balanceLimit) &&
        Objects.equals(this.balanceExpiry, loyaltyCardgroupsProductModel.balanceExpiry) &&
        Objects.equals(this.cancelSelected, loyaltyCardgroupsProductModel.cancelSelected) &&
        Objects.equals(this.description, loyaltyCardgroupsProductModel.description) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, merchant, displayName, displayNameRaw, stockWarnLimit, picture, balanceLimit, balanceExpiry, cancelSelected, description, super.hashCode());
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
    sb.append("    balanceLimit: ").append(toIndentedString(balanceLimit)).append("\n");
    sb.append("    balanceExpiry: ").append(toIndentedString(balanceExpiry)).append("\n");
    sb.append("    cancelSelected: ").append(toIndentedString(cancelSelected)).append("\n");
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

