package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartTransactionsBonusProducts;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SmartTransactionsPreTransactionModel
 */
public class SmartTransactionsPreTransactionModel {
  @SerializedName("missing_sum")
  private Integer missingSum = null;

  @SerializedName("bonus_products")
  private List<SmartTransactionsBonusProducts> bonusProducts = null;

  public SmartTransactionsPreTransactionModel missingSum(Integer missingSum) {
    this.missingSum = missingSum;
    return this;
  }

   /**
   * missing sum
   * @return missingSum
  **/
  public Integer getMissingSum() {
    return missingSum;
  }

  public void setMissingSum(Integer missingSum) {
    this.missingSum = missingSum;
  }

  public SmartTransactionsPreTransactionModel bonusProducts(List<SmartTransactionsBonusProducts> bonusProducts) {
    this.bonusProducts = bonusProducts;
    return this;
  }

  public SmartTransactionsPreTransactionModel addBonusProductsItem(SmartTransactionsBonusProducts bonusProductsItem) {
    if (this.bonusProducts == null) {
      this.bonusProducts = new ArrayList<SmartTransactionsBonusProducts>();
    }
    this.bonusProducts.add(bonusProductsItem);
    return this;
  }

   /**
   * Get bonusProducts
   * @return bonusProducts
  **/
  public List<SmartTransactionsBonusProducts> getBonusProducts() {
    return bonusProducts;
  }

  public void setBonusProducts(List<SmartTransactionsBonusProducts> bonusProducts) {
    this.bonusProducts = bonusProducts;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsPreTransactionModel smartTransactionsPreTransactionModel = (SmartTransactionsPreTransactionModel) o;
    return Objects.equals(this.missingSum, smartTransactionsPreTransactionModel.missingSum) &&
        Objects.equals(this.bonusProducts, smartTransactionsPreTransactionModel.bonusProducts);
  }

  @Override
  public int hashCode() {
    return Objects.hash(missingSum, bonusProducts);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsPreTransactionModel {\n");
    sb.append("    missingSum: ").append(toIndentedString(missingSum)).append("\n");
    sb.append("    bonusProducts: ").append(toIndentedString(bonusProducts)).append("\n");
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

