package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

/**
 * SecupayTransactionCaptureDTO
 */
public class SecupayTransactionCaptureDTO {
  @SerializedName("contract")
  private Object contract = null;

  public SecupayTransactionCaptureDTO contract(Object contract) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayTransactionCaptureDTO secupayTransactionCaptureDTO = (SecupayTransactionCaptureDTO) o;
    return Objects.equals(this.contract, secupayTransactionCaptureDTO.contract);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayTransactionCaptureDTO {\n");
    
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
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

