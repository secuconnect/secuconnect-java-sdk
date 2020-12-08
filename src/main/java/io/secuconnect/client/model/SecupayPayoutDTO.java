package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.PaymentCustomersProductModel;
import io.secuconnect.client.model.SecupayPayoutDTOOptData;
import io.secuconnect.client.model.SecupayRedirectUrl;
import io.secuconnect.client.model.SecupayTransactionListItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SecupayPayoutDTO
 */
public class SecupayPayoutDTO {
  @SerializedName("redirect_url")
  private SecupayRedirectUrl redirectUrl = null;

  @SerializedName("contract")
  private String contract = null;

  @SerializedName("customer")
  private PaymentCustomersProductModel customer = null;

  @SerializedName("opt_data")
  private SecupayPayoutDTOOptData optData = null;

  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("purpose")
  private String purpose = null;

  @SerializedName("order_id")
  private String orderId = null;

  @SerializedName("transaction_list")
  private List<SecupayTransactionListItem> transactionList = null;

  public SecupayPayoutDTO redirectUrl(SecupayRedirectUrl redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * Get redirectUrl
   * @return redirectUrl
  **/
  public SecupayRedirectUrl getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(SecupayRedirectUrl redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  public SecupayPayoutDTO contract(String contract) {
    this.contract = contract;
    return this;
  }

   /**
   * The contract ID
   * @return contract
  **/
  public String getContract() {
    return contract;
  }

  public void setContract(String contract) {
    this.contract = contract;
  }

  public SecupayPayoutDTO customer(PaymentCustomersProductModel customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  public PaymentCustomersProductModel getCustomer() {
    return customer;
  }

  public void setCustomer(PaymentCustomersProductModel customer) {
    this.customer = customer;
  }

  public SecupayPayoutDTO optData(SecupayPayoutDTOOptData optData) {
    this.optData = optData;
    return this;
  }

   /**
   * Get optData
   * @return optData
  **/
  public SecupayPayoutDTOOptData getOptData() {
    return optData;
  }

  public void setOptData(SecupayPayoutDTOOptData optData) {
    this.optData = optData;
  }

  public SecupayPayoutDTO amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public SecupayPayoutDTO currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public SecupayPayoutDTO purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * The purpose of the payment. This is the later assignment of the payment is for example on the account statement of the buyer.
   * @return purpose
  **/
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public SecupayPayoutDTO orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Specifying an order number. Depending on the contract setting, this must be unique for each payment.
   * @return orderId
  **/
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public SecupayPayoutDTO transactionList(List<SecupayTransactionListItem> transactionList) {
    this.transactionList = transactionList;
    return this;
  }

  public SecupayPayoutDTO addTransactionListItem(SecupayTransactionListItem transactionListItem) {
    if (this.transactionList == null) {
      this.transactionList = new ArrayList<SecupayTransactionListItem>();
    }
    this.transactionList.add(transactionListItem);
    return this;
  }

   /**
   * A list of transaction items
   * @return transactionList
  **/
  public List<SecupayTransactionListItem> getTransactionList() {
    return transactionList;
  }

  public void setTransactionList(List<SecupayTransactionListItem> transactionList) {
    this.transactionList = transactionList;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayPayoutDTO secupayPayoutDTO = (SecupayPayoutDTO) o;
    return Objects.equals(this.redirectUrl, secupayPayoutDTO.redirectUrl) &&
        Objects.equals(this.contract, secupayPayoutDTO.contract) &&
        Objects.equals(this.customer, secupayPayoutDTO.customer) &&
        Objects.equals(this.optData, secupayPayoutDTO.optData) &&
        Objects.equals(this.amount, secupayPayoutDTO.amount) &&
        Objects.equals(this.currency, secupayPayoutDTO.currency) &&
        Objects.equals(this.purpose, secupayPayoutDTO.purpose) &&
        Objects.equals(this.orderId, secupayPayoutDTO.orderId) &&
        Objects.equals(this.transactionList, secupayPayoutDTO.transactionList);
  }

  @Override
  public int hashCode() {
    return Objects.hash(redirectUrl, contract, customer, optData, amount, currency, purpose, orderId, transactionList);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayPayoutDTO {\n");
    
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    optData: ").append(toIndentedString(optData)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    transactionList: ").append(toIndentedString(transactionList)).append("\n");
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

