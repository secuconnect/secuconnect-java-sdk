package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.SecupayBasketItem;
import java.util.ArrayList;
import java.util.List;

/**
 * SecupayTransactionUpdateBasketDTO
 */
public class SecupayTransactionUpdateBasketDTO {
  @SerializedName("contract")
  private Object contract = null;

  @SerializedName("basket")
  private List<SecupayBasketItem> basket = null;

  public SecupayTransactionUpdateBasketDTO contract(Object contract) {
    this.contract = contract;
    return this;
  }

   /**
   * The payment contract object
   * @return contract
  **/
  public Object getContract() {
    return contract;
  }

  public void setContract(Object contract) {
    this.contract = contract;
  }

  public SecupayTransactionUpdateBasketDTO basket(List<SecupayBasketItem> basket) {
    this.basket = basket;
    return this;
  }

  public SecupayTransactionUpdateBasketDTO addBasketItem(SecupayBasketItem basketItem) {
    if (this.basket == null) {
      this.basket = new ArrayList<SecupayBasketItem>();
    }
    this.basket.add(basketItem);
    return this;
  }

   /**
   * A list of items that are being purchased.
   * @return basket
  **/
  public List<SecupayBasketItem> getBasket() {
    return basket;
  }

  public void setBasket(List<SecupayBasketItem> basket) {
    this.basket = basket;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayTransactionUpdateBasketDTO secupayTransactionUpdateBasketDTO = (SecupayTransactionUpdateBasketDTO) o;
    return Objects.equals(this.contract, secupayTransactionUpdateBasketDTO.contract) &&
        Objects.equals(this.basket, secupayTransactionUpdateBasketDTO.basket);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, basket);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayTransactionUpdateBasketDTO {\n");
    
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    basket: ").append(toIndentedString(basket)).append("\n");
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

