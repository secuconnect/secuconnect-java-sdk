package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * GeneralContractsTransferBalanceModelBalances
 */
public class GeneralContractsTransferBalanceModelBalances {
  @SerializedName("balance")
  protected Integer balance = null;

  @SerializedName("currency")
  protected String currency = null;

  public GeneralContractsTransferBalanceModelBalances balance(Integer balance) {
    this.balance = balance;
    return this;
  }

   /**
   * Get balance
   * @return balance
  **/
  public Integer getBalance() {
    return balance;
  }

  public void setBalance(Integer balance) {
    this.balance = balance;
  }

  public GeneralContractsTransferBalanceModelBalances currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralContractsTransferBalanceModelBalances generalContractsTransferBalanceModelBalances = (GeneralContractsTransferBalanceModelBalances) o;
    return Objects.equals(this.balance, generalContractsTransferBalanceModelBalances.balance) &&
        Objects.equals(this.currency, generalContractsTransferBalanceModelBalances.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(balance, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralContractsTransferBalanceModelBalances {\n");
    sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

