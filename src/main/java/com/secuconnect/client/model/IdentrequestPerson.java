package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.IdentrequestPersonDTO;
import java.util.Objects;

/**
 * IdentrequestPerson
 */
public class IdentrequestPerson extends IdentrequestPersonDTO {
  @SerializedName("transaction_id")
  protected String transactionId = null;

  @SerializedName("redirect_url")
  protected String redirectUrl = null;

  @SerializedName("status")
  protected String status = null;

  @SerializedName("provider_id")
  protected String providerId = null;

  public IdentrequestPerson transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * An internal transaction_id to identify the person inside and identrequest
   * @return transactionId
  **/
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public IdentrequestPerson redirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * The url the person should visit to be forwarded to identification provider
   * @return redirectUrl
  **/
  public String getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(String redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  public IdentrequestPerson status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the person identification request
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public IdentrequestPerson providerId(String providerId) {
    this.providerId = providerId;
    return this;
  }

   /**
   * The generated ID of the provider for this identrequest - can be null on creation
   * @return providerId
  **/
  public String getProviderId() {
    return providerId;
  }

  public void setProviderId(String providerId) {
    this.providerId = providerId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentrequestPerson identrequestPerson = (IdentrequestPerson) o;
    return Objects.equals(this.transactionId, identrequestPerson.transactionId) &&
        Objects.equals(this.redirectUrl, identrequestPerson.redirectUrl) &&
        Objects.equals(this.status, identrequestPerson.status) &&
        Objects.equals(this.providerId, identrequestPerson.providerId) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, redirectUrl, status, providerId, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentrequestPerson {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    providerId: ").append(toIndentedString(providerId)).append("\n");
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

