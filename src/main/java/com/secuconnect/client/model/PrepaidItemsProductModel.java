package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.ItemGroup;
import com.secuconnect.client.model.PrepaidItemsBaseProductModel;
import java.util.List;
import java.util.Objects;

/**
 * PrepaidItemsProductModel
 */
public class PrepaidItemsProductModel extends PrepaidItemsBaseProductModel {
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

  @SerializedName("commission")
  protected Integer commission = null;

  @SerializedName("itemgroup")
  protected ItemGroup itemgroup = null;

  @SerializedName("stock_limit_max")
  protected Integer stockLimitMax = null;

  @SerializedName("stock_limit_min")
  protected Integer stockLimitMin = null;

  @SerializedName("taxable")
  protected Boolean taxable = null;

  @SerializedName("enabled")
  protected Boolean enabled = null;

  public PrepaidItemsProductModel l(Integer l) {
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

  public PrepaidItemsProductModel k(Integer k) {
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

  public PrepaidItemsProductModel ks(String ks) {
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

  public PrepaidItemsProductModel c(Integer c) {
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

  public PrepaidItemsProductModel s(Integer s) {
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

  public PrepaidItemsProductModel t(AggregationTimeResult t) {
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

  public PrepaidItemsProductModel commission(Integer commission) {
    this.commission = commission;
    return this;
  }

   /**
   * Get commission
   * @return commission
  **/
  public Integer getCommission() {
    return commission;
  }

  public void setCommission(Integer commission) {
    this.commission = commission;
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
   * Get stockLimitMax
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
   * Get stockLimitMin
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
   * Get taxable
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
   * Get enabled
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
    return Objects.equals(this.l, prepaidItemsProductModel.l) &&
        Objects.equals(this.k, prepaidItemsProductModel.k) &&
        Objects.equals(this.ks, prepaidItemsProductModel.ks) &&
        Objects.equals(this.c, prepaidItemsProductModel.c) &&
        Objects.equals(this.s, prepaidItemsProductModel.s) &&
        Objects.equals(this.t, prepaidItemsProductModel.t) &&
        Objects.equals(this.commission, prepaidItemsProductModel.commission) &&
        Objects.equals(this.itemgroup, prepaidItemsProductModel.itemgroup) &&
        Objects.equals(this.stockLimitMax, prepaidItemsProductModel.stockLimitMax) &&
        Objects.equals(this.stockLimitMin, prepaidItemsProductModel.stockLimitMin) &&
        Objects.equals(this.taxable, prepaidItemsProductModel.taxable) &&
        Objects.equals(this.enabled, prepaidItemsProductModel.enabled) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, commission, itemgroup, stockLimitMax, stockLimitMin, taxable, enabled, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepaidItemsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    l: ").append(toIndentedString(l)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    ks: ").append(toIndentedString(ks)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
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

