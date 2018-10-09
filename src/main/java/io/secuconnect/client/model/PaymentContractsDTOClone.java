package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.PaymentInformation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/**
 * PaymentContractsDTOClone
 */
public class PaymentContractsDTOClone {
  @SerializedName("project")
  private String project = null;

  @SerializedName("payment_data")
  private PaymentInformation paymentData = null;

  @SerializedName("payin_account")
  private Boolean payinAccount = false;

  @SerializedName("allow_transactions")
  private Boolean allowTransactions = null;

  @SerializedName("url_push")
  private String urlPush = null;

  @SerializedName("debit_product_id")
  private String debitProductId = null;

  @SerializedName("prepay_product_id")
  private String prepayProductId = null;

  @SerializedName("invoice_product_id")
  private String invoiceProductId = null;

  @SerializedName("creditcard_product_id")
  private String creditcardProductId = null;

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
   * Merchants bank account for the payout
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

  public PaymentContractsDTOClone allowTransactions(Boolean allowTransactions) {
    this.allowTransactions = allowTransactions;
    return this;
  }

   /**
   * DEPRECATED: Should allow transactions for this sub-contract?
   * @return allowTransactions
  **/
  public Boolean getAllowTransactions() {
    return allowTransactions;
  }

  public void setAllowTransactions(Boolean allowTransactions) {
    this.allowTransactions = allowTransactions;
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

  public PaymentContractsDTOClone debitProductId(String debitProductId) {
    this.debitProductId = debitProductId;
    return this;
  }

   /**
   * DEPRECATED: Contract debit product id
   * @return debitProductId
  **/
  public String getDebitProductId() {
    return debitProductId;
  }

  public void setDebitProductId(String debitProductId) {
    this.debitProductId = debitProductId;
  }

  public PaymentContractsDTOClone prepayProductId(String prepayProductId) {
    this.prepayProductId = prepayProductId;
    return this;
  }

   /**
   * DEPRECATED: Contracts prepay product id
   * @return prepayProductId
  **/
  public String getPrepayProductId() {
    return prepayProductId;
  }

  public void setPrepayProductId(String prepayProductId) {
    this.prepayProductId = prepayProductId;
  }

  public PaymentContractsDTOClone invoiceProductId(String invoiceProductId) {
    this.invoiceProductId = invoiceProductId;
    return this;
  }

   /**
   * DEPRECATED: Contracts invoice product id
   * @return invoiceProductId
  **/
  public String getInvoiceProductId() {
    return invoiceProductId;
  }

  public void setInvoiceProductId(String invoiceProductId) {
    this.invoiceProductId = invoiceProductId;
  }

  public PaymentContractsDTOClone creditcardProductId(String creditcardProductId) {
    this.creditcardProductId = creditcardProductId;
    return this;
  }

   /**
   * DEPRECATED: Contracts credit card product id
   * @return creditcardProductId
  **/
  public String getCreditcardProductId() {
    return creditcardProductId;
  }

  public void setCreditcardProductId(String creditcardProductId) {
    this.creditcardProductId = creditcardProductId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContractsDTOClone paymentContractsDTOClone = (PaymentContractsDTOClone) o;
    return Objects.equals(this.project, paymentContractsDTOClone.project) &&
        Objects.equals(this.paymentData, paymentContractsDTOClone.paymentData) &&
        Objects.equals(this.payinAccount, paymentContractsDTOClone.payinAccount) &&
        Objects.equals(this.allowTransactions, paymentContractsDTOClone.allowTransactions) &&
        Objects.equals(this.urlPush, paymentContractsDTOClone.urlPush) &&
        Objects.equals(this.debitProductId, paymentContractsDTOClone.debitProductId) &&
        Objects.equals(this.prepayProductId, paymentContractsDTOClone.prepayProductId) &&
        Objects.equals(this.invoiceProductId, paymentContractsDTOClone.invoiceProductId) &&
        Objects.equals(this.creditcardProductId, paymentContractsDTOClone.creditcardProductId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(project, paymentData, payinAccount, allowTransactions, urlPush, debitProductId, prepayProductId, invoiceProductId, creditcardProductId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContractsDTOClone {\n");
    
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    paymentData: ").append(toIndentedString(paymentData)).append("\n");
    sb.append("    payinAccount: ").append(toIndentedString(payinAccount)).append("\n");
    sb.append("    allowTransactions: ").append(toIndentedString(allowTransactions)).append("\n");
    sb.append("    urlPush: ").append(toIndentedString(urlPush)).append("\n");
    sb.append("    debitProductId: ").append(toIndentedString(debitProductId)).append("\n");
    sb.append("    prepayProductId: ").append(toIndentedString(prepayProductId)).append("\n");
    sb.append("    invoiceProductId: ").append(toIndentedString(invoiceProductId)).append("\n");
    sb.append("    creditcardProductId: ").append(toIndentedString(creditcardProductId)).append("\n");
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

