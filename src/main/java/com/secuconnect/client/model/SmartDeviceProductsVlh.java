package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartDeviceProductsEnabled;
import java.util.Objects;

/**
 * SmartDeviceProductsVlh
 */
public class SmartDeviceProductsVlh extends SmartDeviceProductsEnabled {
  @SerializedName("contract_id")
  protected String contractId = null;

  public SmartDeviceProductsVlh contractId(String contractId) {
    this.contractId = contractId;
    return this;
  }

   /**
   * General Contract ID
   * @return contractId
  **/
  public String getContractId() {
    return contractId;
  }

  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDeviceProductsVlh smartDeviceProductsVlh = (SmartDeviceProductsVlh) o;
    return Objects.equals(this.contractId, smartDeviceProductsVlh.contractId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDeviceProductsVlh {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
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

