package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.IdentrequestPersonDTO;
import java.util.Objects;

/**
 * IdentrequestPerson
 */
public class IdentrequestPerson extends IdentrequestPersonDTO {
  @SerializedName("transaction_id")
  private String transactionId = null;

  @SerializedName("redirect_url")
  private String redirectUrl = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("provider")
  private String provider = null;

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

  public IdentrequestPerson provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * The generated ID of the provider for this identrequest - can be null on creation
   * @return provider
  **/
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
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
        Objects.equals(this.provider, identrequestPerson.provider) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(transactionId, redirectUrl, status, provider, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentrequestPerson {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
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

