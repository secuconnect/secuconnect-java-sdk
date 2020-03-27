package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.SmartTransactionsBasketProduct;
import io.secuconnect.client.model.SmartTransactionsBasketText;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SmartTransactionsBasket
 */
public class SmartTransactionsBasket {
  @SerializedName("products")
  private List<SmartTransactionsBasketProduct> products = null;

  @SerializedName("texts")
  private List<SmartTransactionsBasketText> texts = null;

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

  public SmartTransactionsBasket texts(List<SmartTransactionsBasketText> texts) {
    this.texts = texts;
    return this;
  }

  public SmartTransactionsBasket addTextsItem(SmartTransactionsBasketText textsItem) {
    if (this.texts == null) {
      this.texts = new ArrayList<SmartTransactionsBasketText>();
    }
    this.texts.add(textsItem);
    return this;
  }

   /**
   * Texts
   * @return texts
  **/
  public List<SmartTransactionsBasketText> getTexts() {
    return texts;
  }

  public void setTexts(List<SmartTransactionsBasketText> texts) {
    this.texts = texts;
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
        Objects.equals(this.texts, smartTransactionsBasket.texts) &&
        Objects.equals(this.type, smartTransactionsBasket.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(products, texts, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsBasket {\n");
    
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    texts: ").append(toIndentedString(texts)).append("\n");
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

