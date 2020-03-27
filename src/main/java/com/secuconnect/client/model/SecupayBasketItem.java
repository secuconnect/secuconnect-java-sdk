package com.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.secuconnect.client.model.SecupayBaseBasketItem;
import com.secuconnect.client.model.SecupayBasketItem;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * Item describing single position in basket in transaction
 */
public class SecupayBasketItem extends SecupayBaseBasketItem {
  @SerializedName("sub_basket")
  private List<SecupayBasketItem> subBasket = null;

  public SecupayBasketItem subBasket(List<SecupayBasketItem> subBasket) {
    this.subBasket = subBasket;
    return this;
  }

  public SecupayBasketItem addSubBasketItem(SecupayBasketItem subBasketItem) {
    if (this.subBasket == null) {
      this.subBasket = new ArrayList<SecupayBasketItem>();
    }
    this.subBasket.add(subBasketItem);
    return this;
  }

   /**
   * Mixed-Basket: All basket items for one merchant.
   * @return subBasket
  **/
  public List<SecupayBasketItem> getSubBasket() {
    return subBasket;
  }

  public void setSubBasket(List<SecupayBasketItem> subBasket) {
    this.subBasket = subBasket;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayBasketItem secupayBasketItem = (SecupayBasketItem) o;
    return Objects.equals(this.subBasket, secupayBasketItem.subBasket) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subBasket, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayBasketItem {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    subBasket: ").append(toIndentedString(subBasket)).append("\n");
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

