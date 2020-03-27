package io.secuconnect.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * SmartTransactionsBonusProducts
 */
public class SmartTransactionsBonusProducts extends SmartTransactionsBaseProduct {
  @SerializedName("serialNumber")
  private String serialNumber = null;

  public SmartTransactionsBonusProducts serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * The serialnumber of the scanned posa card
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

