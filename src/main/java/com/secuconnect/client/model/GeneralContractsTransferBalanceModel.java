package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.GeneralContractsTransferBalanceModelBalances;
import com.secuconnect.client.model.ProductInstanceID;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GeneralContractsTransferBalanceModel
 */
public class GeneralContractsTransferBalanceModel extends ProductInstanceID {
  @SerializedName("balances")
  protected List<GeneralContractsTransferBalanceModelBalances> balances = null;

  public GeneralContractsTransferBalanceModel balances(List<GeneralContractsTransferBalanceModelBalances> balances) {
    this.balances = balances;
    return this;
  }

  public GeneralContractsTransferBalanceModel addBalancesItem(GeneralContractsTransferBalanceModelBalances balancesItem) {
    if (this.balances == null) {
      this.balances = new ArrayList<GeneralContractsTransferBalanceModelBalances>();
    }
    this.balances.add(balancesItem);
    return this;
  }

   /**
   * Get balances
   * @return balances
  **/
  public List<GeneralContractsTransferBalanceModelBalances> getBalances() {
    return balances;
  }

  public void setBalances(List<GeneralContractsTransferBalanceModelBalances> balances) {
    this.balances = balances;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralContractsTransferBalanceModel generalContractsTransferBalanceModel = (GeneralContractsTransferBalanceModel) o;
    return Objects.equals(this.balances, generalContractsTransferBalanceModel.balances) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balances, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralContractsTransferBalanceModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    balances: ").append(toIndentedString(balances)).append("\n");
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

