package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.PaymentInformation;
import com.secuconnect.client.model.SecupayPayoutListItem;
import com.secuconnect.client.model.SecupayPayoutWithoutCustomerDTO;
import java.util.List;
import java.util.Objects;

/**
 * SecupayPayoutWithoutCustomerResponse
 */
public class SecupayPayoutWithoutCustomerResponse extends SecupayPayoutWithoutCustomerDTO {
  @SerializedName("trans_id")
  protected Integer transId = null;

  @SerializedName("transfer_account")
  protected PaymentInformation transferAccount = null;

   /**
   * ID of created transaction
   * @return transId
  **/
  public Integer getTransId() {
    return transId;
  }

  public SecupayPayoutWithoutCustomerResponse transferAccount(PaymentInformation transferAccount) {
    this.transferAccount = transferAccount;
    return this;
  }

   /**
   * Get transferAccount
   * @return transferAccount
  **/
  public PaymentInformation getTransferAccount() {
    return transferAccount;
  }

  public void setTransferAccount(PaymentInformation transferAccount) {
    this.transferAccount = transferAccount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayPayoutWithoutCustomerResponse secupayPayoutWithoutCustomerResponse = (SecupayPayoutWithoutCustomerResponse) o;
    return Objects.equals(this.transId, secupayPayoutWithoutCustomerResponse.transId) &&
        Objects.equals(this.transferAccount, secupayPayoutWithoutCustomerResponse.transferAccount) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transId, transferAccount, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayPayoutWithoutCustomerResponse {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
    sb.append("    transferAccount: ").append(toIndentedString(transferAccount)).append("\n");
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

