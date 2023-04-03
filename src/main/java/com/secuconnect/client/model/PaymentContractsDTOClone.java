package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.PaymentInformation;
import java.util.Objects;

/**
 * PaymentContractsDTOClone
 */
public class PaymentContractsDTOClone {
  @SerializedName("contract_id")
  private String contractId = null;

  @SerializedName("project")
  private String project = null;

  @SerializedName("payment_data")
  private PaymentInformation paymentData = null;

  @SerializedName("payin_account")
  private Boolean payinAccount = false;

  @SerializedName("url_push")
  private String urlPush = null;

  public PaymentContractsDTOClone contractId(String contractId) {
    this.contractId = contractId;
    return this;
  }

   /**
   * Parent General Contract ID
   * @return contractId
  **/
  public String getContractId() {
    return contractId;
  }

  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

  public PaymentContractsDTOClone project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Name of the project (must be unique)
   * @return project
  **/
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public PaymentContractsDTOClone paymentData(PaymentInformation paymentData) {
    this.paymentData = paymentData;
    return this;
  }

   /**
   * Get paymentData
   * @return paymentData
  **/
  public PaymentInformation getPaymentData() {
    return paymentData;
  }

  public void setPaymentData(PaymentInformation paymentData) {
    this.paymentData = paymentData;
  }

  public PaymentContractsDTOClone payinAccount(Boolean payinAccount) {
    this.payinAccount = payinAccount;
    return this;
  }

   /**
   * Pay in account
   * @return payinAccount
  **/
  public Boolean getPayinAccount() {
    return payinAccount;
  }

  public void setPayinAccount(Boolean payinAccount) {
    this.payinAccount = payinAccount;
  }

  public PaymentContractsDTOClone urlPush(String urlPush) {
    this.urlPush = urlPush;
    return this;
  }

   /**
   * The default URL where your service listen for push notifications of the secuconnect service
   * @return urlPush
  **/
  public String getUrlPush() {
    return urlPush;
  }

  public void setUrlPush(String urlPush) {
    this.urlPush = urlPush;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContractsDTOClone paymentContractsDTOClone = (PaymentContractsDTOClone) o;
    return Objects.equals(this.contractId, paymentContractsDTOClone.contractId) &&
        Objects.equals(this.project, paymentContractsDTOClone.project) &&
        Objects.equals(this.paymentData, paymentContractsDTOClone.paymentData) &&
        Objects.equals(this.payinAccount, paymentContractsDTOClone.payinAccount) &&
        Objects.equals(this.urlPush, paymentContractsDTOClone.urlPush);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, project, paymentData, payinAccount, urlPush);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContractsDTOClone {\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    paymentData: ").append(toIndentedString(paymentData)).append("\n");
    sb.append("    payinAccount: ").append(toIndentedString(payinAccount)).append("\n");
    sb.append("    urlPush: ").append(toIndentedString(urlPush)).append("\n");
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

