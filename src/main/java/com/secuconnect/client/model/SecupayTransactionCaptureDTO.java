package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.PaymentContractsProductModel;
import com.secuconnect.client.model.SecupayTransactionSetShippingInformationDTO;
import java.util.Objects;

/**
 * SecupayTransactionCaptureDTO
 */
public class SecupayTransactionCaptureDTO {
  @SerializedName("contract")
  protected PaymentContractsProductModel contract = null;

  @SerializedName("shipping_information")
  protected SecupayTransactionSetShippingInformationDTO shippingInformation = null;

  public SecupayTransactionCaptureDTO contract(PaymentContractsProductModel contract) {
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

  public SecupayTransactionCaptureDTO shippingInformation(SecupayTransactionSetShippingInformationDTO shippingInformation) {
    this.shippingInformation = shippingInformation;
    return this;
  }

   /**
   * Get shippingInformation
   * @return shippingInformation
  **/
  public SecupayTransactionSetShippingInformationDTO getShippingInformation() {
    return shippingInformation;
  }

  public void setShippingInformation(SecupayTransactionSetShippingInformationDTO shippingInformation) {
    this.shippingInformation = shippingInformation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayTransactionCaptureDTO secupayTransactionCaptureDTO = (SecupayTransactionCaptureDTO) o;
    return Objects.equals(this.contract, secupayTransactionCaptureDTO.contract) &&
        Objects.equals(this.shippingInformation, secupayTransactionCaptureDTO.shippingInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, shippingInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayTransactionCaptureDTO {\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    shippingInformation: ").append(toIndentedString(shippingInformation)).append("\n");
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

