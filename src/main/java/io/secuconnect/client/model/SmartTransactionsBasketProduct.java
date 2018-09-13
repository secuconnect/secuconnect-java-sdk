package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.SmartTransactionsBasketProductGroup;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/**
 * SmartTransactionsBasketProduct
 */
public class SmartTransactionsBasketProduct {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("parent")
  private Integer parent = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("articleNumber")
  private String articleNumber = null;

  @SerializedName("ean")
  private String ean = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("priceOne")
  private Integer priceOne = null;

  @SerializedName("tax")
  private Integer tax = null;

  @SerializedName("group")
  private SmartTransactionsBasketProductGroup group = null;

  public SmartTransactionsBasketProduct id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Product id
   * @return id
  **/
  @ApiModelProperty(value = "Product id")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SmartTransactionsBasketProduct parent(Integer parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Parent
   * @return parent
  **/
  @ApiModelProperty(value = "Parent")
  public Integer getParent() {
    return parent;
  }

  public void setParent(Integer parent) {
    this.parent = parent;
  }

  public SmartTransactionsBasketProduct desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Desc
   * @return desc
  **/
  @ApiModelProperty(value = "Desc")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public SmartTransactionsBasketProduct articleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
    return this;
  }

   /**
   * Article number
   * @return articleNumber
  **/
  @ApiModelProperty(value = "Article number")
  public String getArticleNumber() {
    return articleNumber;
  }

  public void setArticleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
  }

  public SmartTransactionsBasketProduct ean(String ean) {
    this.ean = ean;
    return this;
  }

   /**
   * Ean
   * @return ean
  **/
  @ApiModelProperty(value = "Ean")
  public String getEan() {
    return ean;
  }

  public void setEan(String ean) {
    this.ean = ean;
  }

  public SmartTransactionsBasketProduct quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Quantity
   * @return quantity
  **/
  @ApiModelProperty(value = "Quantity")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public SmartTransactionsBasketProduct priceOne(Integer priceOne) {
    this.priceOne = priceOne;
    return this;
  }

   /**
   * Price one
   * @return priceOne
  **/
  @ApiModelProperty(value = "Price one")
  public Integer getPriceOne() {
    return priceOne;
  }

  public void setPriceOne(Integer priceOne) {
    this.priceOne = priceOne;
  }

  public SmartTransactionsBasketProduct tax(Integer tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Tax
   * @return tax
  **/
  @ApiModelProperty(value = "Tax")
  public Integer getTax() {
    return tax;
  }

  public void setTax(Integer tax) {
    this.tax = tax;
  }

  public SmartTransactionsBasketProduct group(SmartTransactionsBasketProductGroup group) {
    this.group = group;
    return this;
  }

   /**
   * Group
   * @return group
  **/
  @ApiModelProperty(value = "Group")
  public SmartTransactionsBasketProductGroup getGroup() {
    return group;
  }

  public void setGroup(SmartTransactionsBasketProductGroup group) {
    this.group = group;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsBasketProduct smartTransactionsBasketProduct = (SmartTransactionsBasketProduct) o;
    return Objects.equals(this.id, smartTransactionsBasketProduct.id) &&
        Objects.equals(this.parent, smartTransactionsBasketProduct.parent) &&
        Objects.equals(this.desc, smartTransactionsBasketProduct.desc) &&
        Objects.equals(this.articleNumber, smartTransactionsBasketProduct.articleNumber) &&
        Objects.equals(this.ean, smartTransactionsBasketProduct.ean) &&
        Objects.equals(this.quantity, smartTransactionsBasketProduct.quantity) &&
        Objects.equals(this.priceOne, smartTransactionsBasketProduct.priceOne) &&
        Objects.equals(this.tax, smartTransactionsBasketProduct.tax) &&
        Objects.equals(this.group, smartTransactionsBasketProduct.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parent, desc, articleNumber, ean, quantity, priceOne, tax, group);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsBasketProduct {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    articleNumber: ").append(toIndentedString(articleNumber)).append("\n");
    sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    priceOne: ").append(toIndentedString(priceOne)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

