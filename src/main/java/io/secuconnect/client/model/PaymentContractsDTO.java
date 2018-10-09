package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/**
 * PaymentContractsDTO
 */
public class PaymentContractsDTO {
  @SerializedName("merchant")
  private String merchant = null;

  @SerializedName("internal_reference")
  private String internalReference = null;

  @SerializedName("contract_id")
  private String contractId = null;

  @SerializedName("demo")
  private String demo = null;

  @SerializedName("debit_product_id")
  private String debitProductId = null;

  @SerializedName("prepay_product_id")
  private String prepayProductId = null;

  @SerializedName("invoice_product_id")
  private String invoiceProductId = null;

  @SerializedName("creditcard_product_id")
  private String creditcardProductId = null;

  @SerializedName("url_push")
  private String urlPush = null;

  @SerializedName("allow_transactions")
  private Boolean allowTransactions = null;

  @SerializedName("allow_cloning")
  private Boolean allowCloning = null;

  @SerializedName("unique_order_id")
  private Boolean uniqueOrderId = null;

  @SerializedName("scoring")
  private Boolean scoring = null;

  @SerializedName("sepa_mandate_inform")
  private String sepaMandateInform = null;

  public PaymentContractsDTO merchant(String merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Contracts Merchant
   * @return merchant
  **/
  public String getMerchant() {
    return merchant;
  }

  public void setMerchant(String merchant) {
    this.merchant = merchant;
  }

  public PaymentContractsDTO internalReference(String internalReference) {
    this.internalReference = internalReference;
    return this;
  }

   /**
   * The internal user id
   * @return internalReference
  **/
  public String getInternalReference() {
    return internalReference;
  }

  public void setInternalReference(String internalReference) {
    this.internalReference = internalReference;
  }

  public PaymentContractsDTO contractId(String contractId) {
    this.contractId = contractId;
    return this;
  }

   /**
   * Contracts id
   * @return contractId
  **/
  public String getContractId() {
    return contractId;
  }

  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

  public PaymentContractsDTO demo(String demo) {
    this.demo = demo;
    return this;
  }

   /**
   * Is this a demo contract
   * @return demo
  **/
  public String getDemo() {
    return demo;
  }

  public void setDemo(String demo) {
    this.demo = demo;
  }

  public PaymentContractsDTO debitProductId(String debitProductId) {
    this.debitProductId = debitProductId;
    return this;
  }

   /**
   * Contract debit product id
   * @return debitProductId
  **/
  public String getDebitProductId() {
    return debitProductId;
  }

  public void setDebitProductId(String debitProductId) {
    this.debitProductId = debitProductId;
  }

  public PaymentContractsDTO prepayProductId(String prepayProductId) {
    this.prepayProductId = prepayProductId;
    return this;
  }

   /**
   * Contracts prepay product id
   * @return prepayProductId
  **/
  public String getPrepayProductId() {
    return prepayProductId;
  }

  public void setPrepayProductId(String prepayProductId) {
    this.prepayProductId = prepayProductId;
  }

  public PaymentContractsDTO invoiceProductId(String invoiceProductId) {
    this.invoiceProductId = invoiceProductId;
    return this;
  }

   /**
   * Contracts invoice product id
   * @return invoiceProductId
  **/
  public String getInvoiceProductId() {
    return invoiceProductId;
  }

  public void setInvoiceProductId(String invoiceProductId) {
    this.invoiceProductId = invoiceProductId;
  }

  public PaymentContractsDTO creditcardProductId(String creditcardProductId) {
    this.creditcardProductId = creditcardProductId;
    return this;
  }

   /**
   * Contracts credit card product id
   * @return creditcardProductId
  **/
  public String getCreditcardProductId() {
    return creditcardProductId;
  }

  public void setCreditcardProductId(String creditcardProductId) {
    this.creditcardProductId = creditcardProductId;
  }

  public PaymentContractsDTO urlPush(String urlPush) {
    this.urlPush = urlPush;
    return this;
  }

   /**
   * An URL where your service listen for push notifications of the secuconnect service
   * @return urlPush
  **/
  public String getUrlPush() {
    return urlPush;
  }

  public void setUrlPush(String urlPush) {
    this.urlPush = urlPush;
  }

  public PaymentContractsDTO allowTransactions(Boolean allowTransactions) {
    this.allowTransactions = allowTransactions;
    return this;
  }

   /**
   * Should allow transactions?
   * @return allowTransactions
  **/
  public Boolean getAllowTransactions() {
    return allowTransactions;
  }

  public void setAllowTransactions(Boolean allowTransactions) {
    this.allowTransactions = allowTransactions;
  }

  public PaymentContractsDTO allowCloning(Boolean allowCloning) {
    this.allowCloning = allowCloning;
    return this;
  }

   /**
   * Should allow cloning?
   * @return allowCloning
  **/
  public Boolean getAllowCloning() {
    return allowCloning;
  }

  public void setAllowCloning(Boolean allowCloning) {
    this.allowCloning = allowCloning;
  }

  public PaymentContractsDTO uniqueOrderId(Boolean uniqueOrderId) {
    this.uniqueOrderId = uniqueOrderId;
    return this;
  }

   /**
   * Bool, default FALSE. If TRUE, an error message will be thrown if you try to create a new payment transaction with the same order_id of an previous transaction.
   * @return uniqueOrderId
  **/
  public Boolean getUniqueOrderId() {
    return uniqueOrderId;
  }

  public void setUniqueOrderId(Boolean uniqueOrderId) {
    this.uniqueOrderId = uniqueOrderId;
  }

  public PaymentContractsDTO scoring(Boolean scoring) {
    this.scoring = scoring;
    return this;
  }

   /**
   * Bool, default TRUE. If FALSE, the customer scoring is disabled for your payment contract
   * @return scoring
  **/
  public Boolean getScoring() {
    return scoring;
  }

  public void setScoring(Boolean scoring) {
    this.scoring = scoring;
  }

  public PaymentContractsDTO sepaMandateInform(String sepaMandateInform) {
    this.sepaMandateInform = sepaMandateInform;
    return this;
  }

   /**
   * Enum [on_transaction, on_container, never], default “never” Option to send automatically an information to the customer when a new SEPA-mandate was created.
   * @return sepaMandateInform
  **/
  public String getSepaMandateInform() {
    return sepaMandateInform;
  }

  public void setSepaMandateInform(String sepaMandateInform) {
    this.sepaMandateInform = sepaMandateInform;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContractsDTO paymentContractsDTO = (PaymentContractsDTO) o;
    return Objects.equals(this.merchant, paymentContractsDTO.merchant) &&
        Objects.equals(this.internalReference, paymentContractsDTO.internalReference) &&
        Objects.equals(this.contractId, paymentContractsDTO.contractId) &&
        Objects.equals(this.demo, paymentContractsDTO.demo) &&
        Objects.equals(this.debitProductId, paymentContractsDTO.debitProductId) &&
        Objects.equals(this.prepayProductId, paymentContractsDTO.prepayProductId) &&
        Objects.equals(this.invoiceProductId, paymentContractsDTO.invoiceProductId) &&
        Objects.equals(this.creditcardProductId, paymentContractsDTO.creditcardProductId) &&
        Objects.equals(this.urlPush, paymentContractsDTO.urlPush) &&
        Objects.equals(this.allowTransactions, paymentContractsDTO.allowTransactions) &&
        Objects.equals(this.allowCloning, paymentContractsDTO.allowCloning) &&
        Objects.equals(this.uniqueOrderId, paymentContractsDTO.uniqueOrderId) &&
        Objects.equals(this.scoring, paymentContractsDTO.scoring) &&
        Objects.equals(this.sepaMandateInform, paymentContractsDTO.sepaMandateInform);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchant, internalReference, contractId, demo, debitProductId, prepayProductId, invoiceProductId, creditcardProductId, urlPush, allowTransactions, allowCloning, uniqueOrderId, scoring, sepaMandateInform);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContractsDTO {\n");
    
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    internalReference: ").append(toIndentedString(internalReference)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    demo: ").append(toIndentedString(demo)).append("\n");
    sb.append("    debitProductId: ").append(toIndentedString(debitProductId)).append("\n");
    sb.append("    prepayProductId: ").append(toIndentedString(prepayProductId)).append("\n");
    sb.append("    invoiceProductId: ").append(toIndentedString(invoiceProductId)).append("\n");
    sb.append("    creditcardProductId: ").append(toIndentedString(creditcardProductId)).append("\n");
    sb.append("    urlPush: ").append(toIndentedString(urlPush)).append("\n");
    sb.append("    allowTransactions: ").append(toIndentedString(allowTransactions)).append("\n");
    sb.append("    allowCloning: ").append(toIndentedString(allowCloning)).append("\n");
    sb.append("    uniqueOrderId: ").append(toIndentedString(uniqueOrderId)).append("\n");
    sb.append("    scoring: ").append(toIndentedString(scoring)).append("\n");
    sb.append("    sepaMandateInform: ").append(toIndentedString(sepaMandateInform)).append("\n");
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

