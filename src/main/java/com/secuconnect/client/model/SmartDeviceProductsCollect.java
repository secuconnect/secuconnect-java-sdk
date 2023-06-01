package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartDeviceProductsEnabled;
import java.util.Objects;

/**
 * SmartDeviceProductsCollect
 */
public class SmartDeviceProductsCollect extends SmartDeviceProductsEnabled {
  @SerializedName("print_collection_receipt")
  protected Boolean printCollectionReceipt = null;

  public SmartDeviceProductsCollect printCollectionReceipt(Boolean printCollectionReceipt) {
    this.printCollectionReceipt = printCollectionReceipt;
    return this;
  }

   /**
   * Option enabled or disabled
   * @return printCollectionReceipt
  **/
  public Boolean getPrintCollectionReceipt() {
    return printCollectionReceipt;
  }

  public void setPrintCollectionReceipt(Boolean printCollectionReceipt) {
    this.printCollectionReceipt = printCollectionReceipt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDeviceProductsCollect smartDeviceProductsCollect = (SmartDeviceProductsCollect) o;
    return Objects.equals(this.printCollectionReceipt, smartDeviceProductsCollect.printCollectionReceipt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(printCollectionReceipt, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDeviceProductsCollect {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    printCollectionReceipt: ").append(toIndentedString(printCollectionReceipt)).append("\n");
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

