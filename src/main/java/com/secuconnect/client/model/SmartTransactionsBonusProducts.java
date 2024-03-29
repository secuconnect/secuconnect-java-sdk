package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartTransactionsBaseProduct;
import java.util.Objects;

/**
 * Basket item for bonus
 */
public class SmartTransactionsBonusProducts extends SmartTransactionsBaseProduct {
  @SerializedName("serialNumber")
  protected String serialNumber = null;

  public SmartTransactionsBonusProducts serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Serial number of the POS activation card (POSA)
   * @return serialNumber
  **/
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsBonusProducts smartTransactionsBonusProducts = (SmartTransactionsBonusProducts) o;
    return Objects.equals(this.serialNumber, smartTransactionsBonusProducts.serialNumber) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serialNumber, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsBonusProducts {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
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

