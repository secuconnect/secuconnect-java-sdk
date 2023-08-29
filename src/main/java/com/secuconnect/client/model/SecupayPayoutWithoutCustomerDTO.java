package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SecupayPayoutListItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SecupayPayoutWithoutCustomerDTO
 */
public class SecupayPayoutWithoutCustomerDTO {
  @SerializedName("amount")
  protected Integer amount = null;

  @SerializedName("currency")
  protected String currency = null;

  @SerializedName("contract_id")
  protected String contractId = null;

  @SerializedName("payout_list")
  protected List<SecupayPayoutListItem> payoutList = null;

  @SerializedName("purpose")
  protected String purpose = null;

  @SerializedName("execution_date")
  protected String executionDate = null;

  public SecupayPayoutWithoutCustomerDTO amount(Integer amount) {
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

  public SecupayPayoutWithoutCustomerDTO currency(String currency) {
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

  public SecupayPayoutWithoutCustomerDTO contractId(String contractId) {
    this.contractId = contractId;
    return this;
  }

   /**
   * The contract ID
   * @return contractId
  **/
  public String getContractId() {
    return contractId;
  }

  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

  public SecupayPayoutWithoutCustomerDTO payoutList(List<SecupayPayoutListItem> payoutList) {
    this.payoutList = payoutList;
    return this;
  }

  public SecupayPayoutWithoutCustomerDTO addPayoutListItem(SecupayPayoutListItem payoutListItem) {
    if (this.payoutList == null) {
      this.payoutList = new ArrayList<SecupayPayoutListItem>();
    }
    this.payoutList.add(payoutListItem);
    return this;
  }

   /**
   * A list of payout items
   * @return payoutList
  **/
  public List<SecupayPayoutListItem> getPayoutList() {
    return payoutList;
  }

  public void setPayoutList(List<SecupayPayoutListItem> payoutList) {
    this.payoutList = payoutList;
  }

  public SecupayPayoutWithoutCustomerDTO purpose(String purpose) {
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

  public SecupayPayoutWithoutCustomerDTO executionDate(String executionDate) {
    this.executionDate = executionDate;
    return this;
  }

   /**
   * Date when the payout should be started
   * @return executionDate
  **/
  public String getExecutionDate() {
    return executionDate;
  }

  public void setExecutionDate(String executionDate) {
    this.executionDate = executionDate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayPayoutWithoutCustomerDTO secupayPayoutWithoutCustomerDTO = (SecupayPayoutWithoutCustomerDTO) o;
    return Objects.equals(this.amount, secupayPayoutWithoutCustomerDTO.amount) &&
        Objects.equals(this.currency, secupayPayoutWithoutCustomerDTO.currency) &&
        Objects.equals(this.contractId, secupayPayoutWithoutCustomerDTO.contractId) &&
        Objects.equals(this.payoutList, secupayPayoutWithoutCustomerDTO.payoutList) &&
        Objects.equals(this.purpose, secupayPayoutWithoutCustomerDTO.purpose) &&
        Objects.equals(this.executionDate, secupayPayoutWithoutCustomerDTO.executionDate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, contractId, payoutList, purpose, executionDate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayPayoutWithoutCustomerDTO {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    payoutList: ").append(toIndentedString(payoutList)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    executionDate: ").append(toIndentedString(executionDate)).append("\n");
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

