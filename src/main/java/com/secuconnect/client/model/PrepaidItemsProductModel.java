package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * PrepaidItemsProductModel
 */
public class PrepaidItemsProductModel extends BaseProductModel {
    @SerializedName("retail_price")
    private Integer retailPrice = null;

    @SerializedName("currency")
    private String currency = null;

    @SerializedName("description")
    private String description = null;

    @SerializedName("logo")
    private String logo = null;

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

    @SerializedName("type")
    private String type = null;

    public PrepaidItemsProductModel retailPrice(Integer retailPrice) {
        this.retailPrice = retailPrice;
        return this;
    }

    /**
     * Retail price
     *
     * @return retailPrice
     **/
    public Integer getRetailPrice() {
        return retailPrice;
    }

    public void setRetailPrice(Integer retailPrice) {
        this.retailPrice = retailPrice;
    }

    public PrepaidItemsProductModel currency(String currency) {
        this.currency = currency;
        return this;
    }

    /**
     * Currency
     *
     * @return currency
     **/
    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public PrepaidItemsProductModel description(String description) {
        this.description = description;
        return this;
    }

    /**
     * Description
     *
     * @return description
     **/
    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public PrepaidItemsProductModel logo(String logo) {
        this.logo = logo;
        return this;
    }

    /**
     * Logo
     *
     * @return logo
     **/
    public String getLogo() {
        return logo;
    }

    public void setLogo(String logo) {
        this.logo = logo;
    }

    public PrepaidItemsProductModel commission(Integer commission) {
        this.commission = commission;
        return this;
    }

    /**
     * Commission
     *
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
     *
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
     *
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
     *
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
     *
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
     *
     * @return taxable
     **/
    public Boolean isTaxable() {
        return taxable;
    }

    public void setTaxable(Boolean taxable) {
        this.taxable = taxable;
    }

    public PrepaidItemsProductModel type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Type
     *
     * @return type
     **/
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
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
        return Objects.equals(this.retailPrice, prepaidItemsProductModel.retailPrice) &&
                Objects.equals(this.currency, prepaidItemsProductModel.currency) &&
                Objects.equals(this.description, prepaidItemsProductModel.description) &&
                Objects.equals(this.logo, prepaidItemsProductModel.logo) &&
                Objects.equals(this.commission, prepaidItemsProductModel.commission) &&
                Objects.equals(this.vtcId, prepaidItemsProductModel.vtcId) &&
                Objects.equals(this.itemgroup, prepaidItemsProductModel.itemgroup) &&
                Objects.equals(this.stockLimitMax, prepaidItemsProductModel.stockLimitMax) &&
                Objects.equals(this.stockLimitMin, prepaidItemsProductModel.stockLimitMin) &&
                Objects.equals(this.taxable, prepaidItemsProductModel.taxable) &&
                Objects.equals(this.type, prepaidItemsProductModel.type) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(retailPrice, currency, description, logo, commission, vtcId, itemgroup, stockLimitMax, stockLimitMin, taxable, type, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class PrepaidItemsProductModel {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    retailPrice: ").append(toIndentedString(retailPrice)).append("\n");
        sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
        sb.append("    description: ").append(toIndentedString(description)).append("\n");
        sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
        sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
        sb.append("    vtcId: ").append(toIndentedString(vtcId)).append("\n");
        sb.append("    itemgroup: ").append(toIndentedString(itemgroup)).append("\n");
        sb.append("    stockLimitMax: ").append(toIndentedString(stockLimitMax)).append("\n");
        sb.append("    stockLimitMin: ").append(toIndentedString(stockLimitMin)).append("\n");
        sb.append("    taxable: ").append(toIndentedString(taxable)).append("\n");
        sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

