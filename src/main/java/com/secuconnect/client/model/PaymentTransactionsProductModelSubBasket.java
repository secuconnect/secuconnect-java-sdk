package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Transaction Basket Items
 */
public class PaymentTransactionsProductModelSubBasket {
  @SerializedName("tax")
  protected Integer tax = null;

  @SerializedName("quantity")
  protected Integer quantity = null;

  @SerializedName("price")
  protected Integer price = null;

  @SerializedName("reference_id")
  protected String referenceId = null;

  @SerializedName("ean")
  protected String ean = null;

  @SerializedName("article_number")
  protected String articleNumber = null;

  @SerializedName("item_type")
  protected String itemType = null;

  @SerializedName("name")
  protected String name = null;

  @SerializedName("total")
  protected Integer total = null;

  public PaymentTransactionsProductModelSubBasket tax(Integer tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  public Integer getTax() {
    return tax;
  }

  public void setTax(Integer tax) {
    this.tax = tax;
  }

  public PaymentTransactionsProductModelSubBasket quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Quantity
   * @return quantity
  **/
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public PaymentTransactionsProductModelSubBasket price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * Get price
   * @return price
  **/
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public PaymentTransactionsProductModelSubBasket referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Unique line identifier, used to update the basket before the transaction is executed
   * @return referenceId
  **/
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public PaymentTransactionsProductModelSubBasket ean(String ean) {
    this.ean = ean;
    return this;
  }

   /**
   * Get ean
   * @return ean
  **/
  public String getEan() {
    return ean;
  }

  public void setEan(String ean) {
    this.ean = ean;
  }

  public PaymentTransactionsProductModelSubBasket articleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
    return this;
  }

   /**
   * Article number (SKU)
   * @return articleNumber
  **/
  public String getArticleNumber() {
    return articleNumber;
  }

  public void setArticleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
  }

  public PaymentTransactionsProductModelSubBasket itemType(String itemType) {
    this.itemType = itemType;
    return this;
  }

   /**
   * Item type:  - &#x60;\&quot;article\&quot;&#x60; - &#x60;\&quot;coupon\&quot;&#x60; - &#x60;\&quot;sub_transaction\&quot;&#x60; - &#x60;\&quot;stakeholder_payment\&quot;&#x60; - &#x60;\&quot;shipping\&quot;&#x60; - &#x60;\&quot;subscription\&quot;&#x60;  _Note: \&quot;coupon\&quot; items have the effect of reducing the amount. They are for coupons managed by the merchant, but not for secucard._
   * @return itemType
  **/
  public String getItemType() {
    return itemType;
  }

  public void setItemType(String itemType) {
    this.itemType = itemType;
  }

  public PaymentTransactionsProductModelSubBasket name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Descriptive article name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public PaymentTransactionsProductModelSubBasket total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransactionsProductModelSubBasket paymentTransactionsProductModelSubBasket = (PaymentTransactionsProductModelSubBasket) o;
    return Objects.equals(this.tax, paymentTransactionsProductModelSubBasket.tax) &&
        Objects.equals(this.quantity, paymentTransactionsProductModelSubBasket.quantity) &&
        Objects.equals(this.price, paymentTransactionsProductModelSubBasket.price) &&
        Objects.equals(this.referenceId, paymentTransactionsProductModelSubBasket.referenceId) &&
        Objects.equals(this.ean, paymentTransactionsProductModelSubBasket.ean) &&
        Objects.equals(this.articleNumber, paymentTransactionsProductModelSubBasket.articleNumber) &&
        Objects.equals(this.itemType, paymentTransactionsProductModelSubBasket.itemType) &&
        Objects.equals(this.name, paymentTransactionsProductModelSubBasket.name) &&
        Objects.equals(this.total, paymentTransactionsProductModelSubBasket.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tax, quantity, price, referenceId, ean, articleNumber, itemType, name, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransactionsProductModelSubBasket {\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
    sb.append("    articleNumber: ").append(toIndentedString(articleNumber)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

