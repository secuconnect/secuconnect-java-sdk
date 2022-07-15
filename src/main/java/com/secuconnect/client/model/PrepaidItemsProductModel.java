package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.ItemGroup;
import com.secuconnect.client.model.PrepaidItemsBaseProductModel;
import java.util.List;
import java.util.Objects;

/**
 * PrepaidItemsProductModel
 */
public class PrepaidItemsProductModel extends PrepaidItemsBaseProductModel {
  @SerializedName("commission")
  private Integer commission = null;

  @SerializedName("vtc_id")
  private String vtcId = null;

  @SerializedName("itemgroup")
  private ItemGroup itemgroup = null;

  @SerializedName("stock_limit_max")
  private Integer stockLimitMax = null;

  @SerializedName("stock_limit_min")
  private Integer stockLimitMin = null;

  @SerializedName("taxable")
  private Boolean taxable = null;

  @SerializedName("enabled")
  private Boolean enabled = null;

  public PrepaidItemsProductModel commission(Integer commission) {
    this.commission = commission;
    return this;
  }

   /**
   * Commission
   * @return commission
  **/
  public Integer getCommission() {
    return commission;
  }

  public void setCommission(Integer commission) {
    this.commission = commission;
  }

  public PrepaidItemsProductModel vtcId(String vtcId) {
    this.vtcId = vtcId;
    return this;
  }

   /**
   * Vtc id
   * @return vtcId
  **/
  public String getVtcId() {
    return vtcId;
  }

  public void setVtcId(String vtcId) {
    this.vtcId = vtcId;
  }

  public PrepaidItemsProductModel itemgroup(ItemGroup itemgroup) {
    this.itemgroup = itemgroup;
    return this;
  }

   /**
   * Get itemgroup
   * @return itemgroup
  **/
  public ItemGroup getItemgroup() {
    return itemgroup;
  }

  public void setItemgroup(ItemGroup itemgroup) {
    this.itemgroup = itemgroup;
  }

  public PrepaidItemsProductModel stockLimitMax(Integer stockLimitMax) {
    this.stockLimitMax = stockLimitMax;
    return this;
  }

   /**
   * Stock limit max
   * @return stockLimitMax
  **/
  public Integer getStockLimitMax() {
    return stockLimitMax;
  }

  public void setStockLimitMax(Integer stockLimitMax) {
    this.stockLimitMax = stockLimitMax;
  }

  public PrepaidItemsProductModel stockLimitMin(Integer stockLimitMin) {
    this.stockLimitMin = stockLimitMin;
    return this;
  }

   /**
   * Stock limit min
   * @return stockLimitMin
  **/
  public Integer getStockLimitMin() {
    return stockLimitMin;
  }

  public void setStockLimitMin(Integer stockLimitMin) {
    this.stockLimitMin = stockLimitMin;
  }

  public PrepaidItemsProductModel taxable(Boolean taxable) {
    this.taxable = taxable;
    return this;
  }

   /**
   * Taxable
   * @return taxable
  **/
  public Boolean getTaxable() {
    return taxable;
  }

  public void setTaxable(Boolean taxable) {
    this.taxable = taxable;
  }

  public PrepaidItemsProductModel enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * enabled
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
    PrepaidItemsProductModel prepaidItemsProductModel = (PrepaidItemsProductModel) o;
    return Objects.equals(this.commission, prepaidItemsProductModel.commission) &&
        Objects.equals(this.vtcId, prepaidItemsProductModel.vtcId) &&
        Objects.equals(this.itemgroup, prepaidItemsProductModel.itemgroup) &&
        Objects.equals(this.stockLimitMax, prepaidItemsProductModel.stockLimitMax) &&
        Objects.equals(this.stockLimitMin, prepaidItemsProductModel.stockLimitMin) &&
        Objects.equals(this.taxable, prepaidItemsProductModel.taxable) &&
        Objects.equals(this.enabled, prepaidItemsProductModel.enabled) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(commission, vtcId, itemgroup, stockLimitMax, stockLimitMin, taxable, enabled, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepaidItemsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    vtcId: ").append(toIndentedString(vtcId)).append("\n");
    sb.append("    itemgroup: ").append(toIndentedString(itemgroup)).append("\n");
    sb.append("    stockLimitMax: ").append(toIndentedString(stockLimitMax)).append("\n");
    sb.append("    stockLimitMin: ").append(toIndentedString(stockLimitMin)).append("\n");
    sb.append("    taxable: ").append(toIndentedString(taxable)).append("\n");
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

