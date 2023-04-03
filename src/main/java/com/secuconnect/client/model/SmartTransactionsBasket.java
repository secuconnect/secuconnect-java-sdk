package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartTransactionsBasketProduct;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SmartTransactionsBasket
 */
public class SmartTransactionsBasket {
  @SerializedName("products")
  private List<SmartTransactionsBasketProduct> products = null;

  @SerializedName("type")
  private String type = null;

  public SmartTransactionsBasket products(List<SmartTransactionsBasketProduct> products) {
    this.products = products;
    return this;
  }

  public SmartTransactionsBasket addProductsItem(SmartTransactionsBasketProduct productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<SmartTransactionsBasketProduct>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Products
   * @return products
  **/
  public List<SmartTransactionsBasketProduct> getProducts() {
    return products;
  }

  public void setProducts(List<SmartTransactionsBasketProduct> products) {
    this.products = products;
  }

  public SmartTransactionsBasket type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Basket Type
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
    SmartTransactionsBasket smartTransactionsBasket = (SmartTransactionsBasket) o;
    return Objects.equals(this.products, smartTransactionsBasket.products) &&
        Objects.equals(this.type, smartTransactionsBasket.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(products, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsBasket {\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
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

