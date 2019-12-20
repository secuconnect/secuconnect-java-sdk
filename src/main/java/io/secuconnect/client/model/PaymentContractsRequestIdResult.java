package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.PaymentContractsProductModel;
import io.secuconnect.client.model.PaymentInformation;
import io.secuconnect.client.model.ProductInstanceUID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * PaymentContractsRequestIdResult
 */
public class PaymentContractsRequestIdResult {
  @SerializedName("contract")
  private PaymentContractsProductModel contract = null;

  @SerializedName("merchant")
  private ProductInstanceUID merchant = null;

  @SerializedName("store")
  private ProductInstanceUID store = null;

  @SerializedName("apikey")
  private String apikey = null;

  @SerializedName("payin_account")
  private PaymentInformation payinAccount = null;

  public PaymentContractsRequestIdResult contract(PaymentContractsProductModel contract) {
    this.contract = contract;
    return this;
  }

   /**
   * The payment contract object
   * @return contract
  **/
  public PaymentContractsProductModel getContract() {
    return contract;
  }

  public void setContract(PaymentContractsProductModel contract) {
    this.contract = contract;
  }

  public PaymentContractsRequestIdResult merchant(ProductInstanceUID merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  public ProductInstanceUID getMerchant() {
    return merchant;
  }

  public void setMerchant(ProductInstanceUID merchant) {
    this.merchant = merchant;
  }

  public PaymentContractsRequestIdResult store(ProductInstanceUID store) {
    this.store = store;
    return this;
  }

   /**
   * Get store
   * @return store
  **/
  public ProductInstanceUID getStore() {
    return store;
  }

  public void setStore(ProductInstanceUID store) {
    this.store = store;
  }

  public PaymentContractsRequestIdResult apikey(String apikey) {
    this.apikey = apikey;
    return this;
  }

   /**
   * Returns the apikey of the created merchant
   * @return apikey
  **/
  public String getApikey() {
    return apikey;
  }

  public void setApikey(String apikey) {
    this.apikey = apikey;
  }

  public PaymentContractsRequestIdResult payinAccount(PaymentInformation payinAccount) {
    this.payinAccount = payinAccount;
    return this;
  }

   /**
   * The bank account you can use for pay in.
   * @return payinAccount
  **/
  public PaymentInformation getPayinAccount() {
    return payinAccount;
  }

  public void setPayinAccount(PaymentInformation payinAccount) {
    this.payinAccount = payinAccount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContractsRequestIdResult paymentContractsRequestIdResult = (PaymentContractsRequestIdResult) o;
    return Objects.equals(this.contract, paymentContractsRequestIdResult.contract) &&
        Objects.equals(this.merchant, paymentContractsRequestIdResult.merchant) &&
        Objects.equals(this.store, paymentContractsRequestIdResult.store) &&
        Objects.equals(this.apikey, paymentContractsRequestIdResult.apikey) &&
        Objects.equals(this.payinAccount, paymentContractsRequestIdResult.payinAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, merchant, store, apikey, payinAccount);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContractsRequestIdResult {\n");
    
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    apikey: ").append(toIndentedString(apikey)).append("\n");
    sb.append("    payinAccount: ").append(toIndentedString(payinAccount)).append("\n");
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

