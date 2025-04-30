package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * PaymentTransactionsGetRefundBankAccountDTO
 */
public class PaymentTransactionsGetRefundBankAccountDTO {
  @SerializedName("trans_id")
  protected Integer transId = null;

  public PaymentTransactionsGetRefundBankAccountDTO transId(Integer transId) {
    this.transId = transId;
    return this;
  }

   /**
   * Transaction ID
   * @return transId
  **/
  public Integer getTransId() {
    return transId;
  }

  public void setTransId(Integer transId) {
    this.transId = transId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransactionsGetRefundBankAccountDTO paymentTransactionsGetRefundBankAccountDTO = (PaymentTransactionsGetRefundBankAccountDTO) o;
    return Objects.equals(this.transId, paymentTransactionsGetRefundBankAccountDTO.transId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransactionsGetRefundBankAccountDTO {\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
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

