package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.PaymentTransactionsProductModelSubBasket;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Transaction Basket Items
 */
public class PaymentTransactionsProductModelBasket extends PaymentTransactionsProductModelSubBasket {
  @SerializedName("sub_basket")
  protected List<PaymentTransactionsProductModelSubBasket> subBasket = null;

  public PaymentTransactionsProductModelBasket subBasket(List<PaymentTransactionsProductModelSubBasket> subBasket) {
    this.subBasket = subBasket;
    return this;
  }

  public PaymentTransactionsProductModelBasket addSubBasketItem(PaymentTransactionsProductModelSubBasket subBasketItem) {
    if (this.subBasket == null) {
      this.subBasket = new ArrayList<PaymentTransactionsProductModelSubBasket>();
    }
    this.subBasket.add(subBasketItem);
    return this;
  }

   /**
   * Products
   * @return subBasket
  **/
  public List<PaymentTransactionsProductModelSubBasket> getSubBasket() {
    return subBasket;
  }

  public void setSubBasket(List<PaymentTransactionsProductModelSubBasket> subBasket) {
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
    PaymentTransactionsProductModelBasket paymentTransactionsProductModelBasket = (PaymentTransactionsProductModelBasket) o;
    return Objects.equals(this.subBasket, paymentTransactionsProductModelBasket.subBasket) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(subBasket, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransactionsProductModelBasket {\n");
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

