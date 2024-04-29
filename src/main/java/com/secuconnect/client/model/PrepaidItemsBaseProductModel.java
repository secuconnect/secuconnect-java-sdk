package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.BaseProductModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PrepaidItemsBaseProductModel
 */
public class PrepaidItemsBaseProductModel extends BaseProductModel {
  @SerializedName("retail_price")
  protected Integer retailPrice = null;

  @SerializedName("currency")
  protected String currency = null;

  @SerializedName("description")
  protected String description = null;

  @SerializedName("displaytext")
  protected String displaytext = null;

  @SerializedName("logo")
  protected String logo = null;

  @SerializedName("vtc_config")
  protected List<String> vtcConfig = null;

  @SerializedName("vtc_id")
  protected String vtcId = null;

  @SerializedName("type")
  protected String type = null;

  public PrepaidItemsBaseProductModel retailPrice(Integer retailPrice) {
    this.retailPrice = retailPrice;
    return this;
  }

   /**
   * Retail price in the smallest currency unit (e. g. Euro Cent)
   * @return retailPrice
  **/
  public Integer getRetailPrice() {
    return retailPrice;
  }

  public void setRetailPrice(Integer retailPrice) {
    this.retailPrice = retailPrice;
  }

  public PrepaidItemsBaseProductModel currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PrepaidItemsBaseProductModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Short item name, usually trade mark with amount
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PrepaidItemsBaseProductModel displaytext(String displaytext) {
    this.displaytext = displaytext;
    return this;
  }

   /**
   * Display text to within the Item Group, usually the amount. At the POS terminal you will firstly select the group by its name, then the exact item by this very text.
   * @return displaytext
  **/
  public String getDisplaytext() {
    return displaytext;
  }

  public void setDisplaytext(String displaytext) {
    this.displaytext = displaytext;
  }

  public PrepaidItemsBaseProductModel logo(String logo) {
    this.logo = logo;
    return this;
  }

   /**
   * Logo URL
   * @return logo
  **/
  public String getLogo() {
    return logo;
  }

  public void setLogo(String logo) {
    this.logo = logo;
  }

  public PrepaidItemsBaseProductModel vtcConfig(List<String> vtcConfig) {
    this.vtcConfig = vtcConfig;
    return this;
  }

  public PrepaidItemsBaseProductModel addVtcConfigItem(String vtcConfigItem) {
    if (this.vtcConfig == null) {
      this.vtcConfig = new ArrayList<String>();
    }
    this.vtcConfig.add(vtcConfigItem);
    return this;
  }

   /**
   * Article numbers for adding this item to a Smart Transaction; needed to recognise the item as e-goods article.
   * @return vtcConfig
  **/
  public List<String> getVtcConfig() {
    return vtcConfig;
  }

  public void setVtcConfig(List<String> vtcConfig) {
    this.vtcConfig = vtcConfig;
  }

  public PrepaidItemsBaseProductModel vtcId(String vtcId) {
    this.vtcId = vtcId;
    return this;
  }

   /**
   * VTC ID
   * @return vtcId
  **/
  public String getVtcId() {
    return vtcId;
  }

  public void setVtcId(String vtcId) {
    this.vtcId = vtcId;
  }

  public PrepaidItemsBaseProductModel type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type:  - &#x60;POSA&#x60; for point of sale activation cars - &#x60;PP&#x60; for pin-printing
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
    PrepaidItemsBaseProductModel prepaidItemsBaseProductModel = (PrepaidItemsBaseProductModel) o;
    return Objects.equals(this.retailPrice, prepaidItemsBaseProductModel.retailPrice) &&
        Objects.equals(this.currency, prepaidItemsBaseProductModel.currency) &&
        Objects.equals(this.description, prepaidItemsBaseProductModel.description) &&
        Objects.equals(this.displaytext, prepaidItemsBaseProductModel.displaytext) &&
        Objects.equals(this.logo, prepaidItemsBaseProductModel.logo) &&
        Objects.equals(this.vtcConfig, prepaidItemsBaseProductModel.vtcConfig) &&
        Objects.equals(this.vtcId, prepaidItemsBaseProductModel.vtcId) &&
        Objects.equals(this.type, prepaidItemsBaseProductModel.type) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(retailPrice, currency, description, displaytext, logo, vtcConfig, vtcId, type, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepaidItemsBaseProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    retailPrice: ").append(toIndentedString(retailPrice)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    displaytext: ").append(toIndentedString(displaytext)).append("\n");
    sb.append("    logo: ").append(toIndentedString(logo)).append("\n");
    sb.append("    vtcConfig: ").append(toIndentedString(vtcConfig)).append("\n");
    sb.append("    vtcId: ").append(toIndentedString(vtcId)).append("\n");
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

