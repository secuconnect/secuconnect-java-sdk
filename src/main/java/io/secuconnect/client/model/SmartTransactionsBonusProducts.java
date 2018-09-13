package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/**
 * SmartTransactionsBonusProducts
 */
public class SmartTransactionsBonusProducts {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("tax")
  private Integer tax = null;

  @SerializedName("priceOne")
  private Integer priceOne = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("articleNumber")
  private String articleNumber = null;

  @SerializedName("ean")
  private String ean = null;

  public SmartTransactionsBonusProducts id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Bonus Product ID
   * @return id
  **/
  @ApiModelProperty(value = "Bonus Product ID")
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SmartTransactionsBonusProducts tax(Integer tax) {
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

  public SmartTransactionsBonusProducts priceOne(Integer priceOne) {
    this.priceOne = priceOne;
    return this;
  }

   /**
   * price of one bonus product
   * @return priceOne
  **/
  @ApiModelProperty(value = "price of one bonus product")
  public Integer getPriceOne() {
    return priceOne;
  }

  public void setPriceOne(Integer priceOne) {
    this.priceOne = priceOne;
  }

  public SmartTransactionsBonusProducts quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * amount of bonus products
   * @return quantity
  **/
  @ApiModelProperty(value = "amount of bonus products")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public SmartTransactionsBonusProducts desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * description
   * @return desc
  **/
  @ApiModelProperty(value = "description")
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public SmartTransactionsBonusProducts articleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
    return this;
  }

   /**
   * article Number
   * @return articleNumber
  **/
  @ApiModelProperty(value = "article Number")
  public String getArticleNumber() {
    return articleNumber;
  }

  public void setArticleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
  }

  public SmartTransactionsBonusProducts ean(String ean) {
    this.ean = ean;
    return this;
  }

   /**
   * ean
   * @return ean
  **/
  @ApiModelProperty(value = "ean")
  public String getEan() {
    return ean;
  }

  public void setEan(String ean) {
    this.ean = ean;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsBonusProducts smartTransactionsBonusProducts = (SmartTransactionsBonusProducts) o;
    return Objects.equals(this.id, smartTransactionsBonusProducts.id) &&
        Objects.equals(this.tax, smartTransactionsBonusProducts.tax) &&
        Objects.equals(this.priceOne, smartTransactionsBonusProducts.priceOne) &&
        Objects.equals(this.quantity, smartTransactionsBonusProducts.quantity) &&
        Objects.equals(this.desc, smartTransactionsBonusProducts.desc) &&
        Objects.equals(this.articleNumber, smartTransactionsBonusProducts.articleNumber) &&
        Objects.equals(this.ean, smartTransactionsBonusProducts.ean);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tax, priceOne, quantity, desc, articleNumber, ean);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsBonusProducts {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    priceOne: ").append(toIndentedString(priceOne)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    articleNumber: ").append(toIndentedString(articleNumber)).append("\n");
    sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
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

