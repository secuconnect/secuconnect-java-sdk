package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * SmartTransactionsBaseProduct
 */
public class SmartTransactionsBaseProduct {
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

  public SmartTransactionsBaseProduct id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Bonus Product ID
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SmartTransactionsBaseProduct tax(Integer tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Tax
   * @return tax
  **/
  public Integer getTax() {
    return tax;
  }

  public void setTax(Integer tax) {
    this.tax = tax;
  }

  public SmartTransactionsBaseProduct priceOne(Integer priceOne) {
    this.priceOne = priceOne;
    return this;
  }

   /**
   * price of one bonus product
   * @return priceOne
  **/
  public Integer getPriceOne() {
    return priceOne;
  }

  public void setPriceOne(Integer priceOne) {
    this.priceOne = priceOne;
  }

  public SmartTransactionsBaseProduct quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * amount of bonus products
   * @return quantity
  **/
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public SmartTransactionsBaseProduct desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * description
   * @return desc
  **/
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public SmartTransactionsBaseProduct articleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
    return this;
  }

   /**
   * article Number
   * @return articleNumber
  **/
  public String getArticleNumber() {
    return articleNumber;
  }

  public void setArticleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
  }

  public SmartTransactionsBaseProduct ean(String ean) {
    this.ean = ean;
    return this;
  }

   /**
   * international article number
   * @return ean
  **/
  public String getEan() {
    return ean;
  }

  public void setEan(String ean) {
    this.ean = ean;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsBaseProduct smartTransactionsBaseProduct = (SmartTransactionsBaseProduct) o;
    return Objects.equals(this.id, smartTransactionsBaseProduct.id) &&
        Objects.equals(this.tax, smartTransactionsBaseProduct.tax) &&
        Objects.equals(this.priceOne, smartTransactionsBaseProduct.priceOne) &&
        Objects.equals(this.quantity, smartTransactionsBaseProduct.quantity) &&
        Objects.equals(this.desc, smartTransactionsBaseProduct.desc) &&
        Objects.equals(this.articleNumber, smartTransactionsBaseProduct.articleNumber) &&
        Objects.equals(this.ean, smartTransactionsBaseProduct.ean);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, tax, priceOne, quantity, desc, articleNumber, ean);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsBaseProduct {\n");
    
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

