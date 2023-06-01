package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.PaymentContractsProductModel;
import com.secuconnect.client.model.SecupayBasketItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SecupayTransactionUpdateBasketDTO
 */
public class SecupayTransactionUpdateBasketDTO {
  @SerializedName("contract")
  protected PaymentContractsProductModel contract = null;

  @SerializedName("basket")
  protected List<SecupayBasketItem> basket = null;

  public SecupayTransactionUpdateBasketDTO contract(PaymentContractsProductModel contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  public PaymentContractsProductModel getContract() {
    return contract;
  }

  public void setContract(PaymentContractsProductModel contract) {
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

