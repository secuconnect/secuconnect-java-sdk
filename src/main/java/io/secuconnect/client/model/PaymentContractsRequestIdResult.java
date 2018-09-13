package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.PaymentContractsProductModel;
import io.secuconnect.client.model.PaymentContractsRequestIdResultPayingAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/**
 * PaymentContractsRequestIdResult
 */
public class PaymentContractsRequestIdResult {
  @SerializedName("contract")
  private PaymentContractsProductModel contract = null;

  @SerializedName("apikey")
  private String apikey = null;

  @SerializedName("paying_account")
  private PaymentContractsRequestIdResultPayingAccount payingAccount = null;

  public PaymentContractsRequestIdResult contract(PaymentContractsProductModel contract) {
    this.contract = contract;
    return this;
  }

   /**
   * The payment contract object
   * @return contract
  **/
  @ApiModelProperty(value = "The payment contract object")
  public PaymentContractsProductModel getContract() {
    return contract;
  }

  public void setContract(PaymentContractsProductModel contract) {
    this.contract = contract;
  }

  public PaymentContractsRequestIdResult apikey(String apikey) {
    this.apikey = apikey;
    return this;
  }

   /**
   * Returns the apikey of the created merchant
   * @return apikey
  **/
  @ApiModelProperty(value = "Returns the apikey of the created merchant")
  public String getApikey() {
    return apikey;
  }

  public void setApikey(String apikey) {
    this.apikey = apikey;
  }

  public PaymentContractsRequestIdResult payingAccount(PaymentContractsRequestIdResultPayingAccount payingAccount) {
    this.payingAccount = payingAccount;
    return this;
  }

   /**
   * Get payingAccount
   * @return payingAccount
  **/
  @ApiModelProperty(value = "")
  public PaymentContractsRequestIdResultPayingAccount getPayingAccount() {
    return payingAccount;
  }

  public void setPayingAccount(PaymentContractsRequestIdResultPayingAccount payingAccount) {
    this.payingAccount = payingAccount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContractsRequestIdResult paymentContractsRequestIdResult = (PaymentContractsRequestIdResult) o;
    return Objects.equals(this.contract, paymentContractsRequestIdResult.contract) &&
        Objects.equals(this.apikey, paymentContractsRequestIdResult.apikey) &&
        Objects.equals(this.payingAccount, paymentContractsRequestIdResult.payingAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, apikey, payingAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContractsRequestIdResult {\n");
    
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    apikey: ").append(toIndentedString(apikey)).append("\n");
    sb.append("    payingAccount: ").append(toIndentedString(payingAccount)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

