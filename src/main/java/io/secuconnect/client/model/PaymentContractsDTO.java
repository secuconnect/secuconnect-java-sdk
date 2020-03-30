package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

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

  @SerializedName("url_push")
  private String urlPush = null;

  @SerializedName("unique_order_id")
  private Boolean uniqueOrderId = null;

  @SerializedName("scoring")
  private Boolean scoring = null;

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

  @Override
  public boolean equals(Object o) {
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
        Objects.equals(this.urlPush, paymentContractsDTO.urlPush) &&
        Objects.equals(this.uniqueOrderId, paymentContractsDTO.uniqueOrderId) &&
        Objects.equals(this.scoring, paymentContractsDTO.scoring);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchant, internalReference, contractId, demo, urlPush, uniqueOrderId, scoring);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContractsDTO {\n");
    
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    internalReference: ").append(toIndentedString(internalReference)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    demo: ").append(toIndentedString(demo)).append("\n");
    sb.append("    urlPush: ").append(toIndentedString(urlPush)).append("\n");
    sb.append("    uniqueOrderId: ").append(toIndentedString(uniqueOrderId)).append("\n");
    sb.append("    scoring: ").append(toIndentedString(scoring)).append("\n");
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

