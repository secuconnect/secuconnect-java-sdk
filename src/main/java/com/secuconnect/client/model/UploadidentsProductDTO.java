package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * UploadidentsProductDTO
 */
public class UploadidentsProductDTO {
  @SerializedName("merchant_id")
  protected String merchantId = null;

  @SerializedName("payment_id")
  protected String paymentId = null;

  @SerializedName("contract_id")
  protected String contractId = null;

  @SerializedName("apikey")
  protected String apikey = null;

  @SerializedName("service_issue_id")
  protected Integer serviceIssueId = null;

  @SerializedName("document_ids")
  protected List<String> documentIds = null;

  public UploadidentsProductDTO merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Merchant ID
   * @return merchantId
  **/
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public UploadidentsProductDTO paymentId(String paymentId) {
    this.paymentId = paymentId;
    return this;
  }

   /**
   * Payment ID
   * @return paymentId
  **/
  public String getPaymentId() {
    return paymentId;
  }

  public void setPaymentId(String paymentId) {
    this.paymentId = paymentId;
  }

  public UploadidentsProductDTO contractId(String contractId) {
    this.contractId = contractId;
    return this;
  }

   /**
   * Contract ID
   * @return contractId
  **/
  public String getContractId() {
    return contractId;
  }

  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

  public UploadidentsProductDTO apikey(String apikey) {
    this.apikey = apikey;
    return this;
  }

   /**
   * Api Key
   * @return apikey
  **/
  public String getApikey() {
    return apikey;
  }

  public void setApikey(String apikey) {
    this.apikey = apikey;
  }

  public UploadidentsProductDTO serviceIssueId(Integer serviceIssueId) {
    this.serviceIssueId = serviceIssueId;
    return this;
  }

   /**
   * Service issue id
   * @return serviceIssueId
  **/
  public Integer getServiceIssueId() {
    return serviceIssueId;
  }

  public void setServiceIssueId(Integer serviceIssueId) {
    this.serviceIssueId = serviceIssueId;
  }

  public UploadidentsProductDTO documentIds(List<String> documentIds) {
    this.documentIds = documentIds;
    return this;
  }

  public UploadidentsProductDTO addDocumentIdsItem(String documentIdsItem) {
    if (this.documentIds == null) {
      this.documentIds = new ArrayList<String>();
    }
    this.documentIds.add(documentIdsItem);
    return this;
  }

   /**
   * List of documents ids
   * @return documentIds
  **/
  public List<String> getDocumentIds() {
    return documentIds;
  }

  public void setDocumentIds(List<String> documentIds) {
    this.documentIds = documentIds;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadidentsProductDTO uploadidentsProductDTO = (UploadidentsProductDTO) o;
    return Objects.equals(this.merchantId, uploadidentsProductDTO.merchantId) &&
        Objects.equals(this.paymentId, uploadidentsProductDTO.paymentId) &&
        Objects.equals(this.contractId, uploadidentsProductDTO.contractId) &&
        Objects.equals(this.apikey, uploadidentsProductDTO.apikey) &&
        Objects.equals(this.serviceIssueId, uploadidentsProductDTO.serviceIssueId) &&
        Objects.equals(this.documentIds, uploadidentsProductDTO.documentIds);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, paymentId, contractId, apikey, serviceIssueId, documentIds);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadidentsProductDTO {\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    paymentId: ").append(toIndentedString(paymentId)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    apikey: ").append(toIndentedString(apikey)).append("\n");
    sb.append("    serviceIssueId: ").append(toIndentedString(serviceIssueId)).append("\n");
    sb.append("    documentIds: ").append(toIndentedString(documentIds)).append("\n");
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

