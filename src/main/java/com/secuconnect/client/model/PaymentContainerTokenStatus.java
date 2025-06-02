package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * PaymentContainerTokenStatus
 */
public class PaymentContainerTokenStatus {
  @SerializedName("status")
  protected String status = null;

  @SerializedName("created")
  protected String created = null;

  @SerializedName("last_modified")
  protected String lastModified = null;

  @SerializedName("version")
  protected String version = null;

  public PaymentContainerTokenStatus status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the Token
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PaymentContainerTokenStatus created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Date when the Token was created
   * @return created
  **/
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public PaymentContainerTokenStatus lastModified(String lastModified) {
    this.lastModified = lastModified;
    return this;
  }

   /**
   * Date when the Token was modified last
   * @return lastModified
  **/
  public String getLastModified() {
    return lastModified;
  }

  public void setLastModified(String lastModified) {
    this.lastModified = lastModified;
  }

  public PaymentContainerTokenStatus version(String version) {
    this.version = version;
    return this;
  }

   /**
   * Version
   * @return version
  **/
  public String getVersion() {
    return version;
  }

  public void setVersion(String version) {
    this.version = version;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContainerTokenStatus paymentContainerTokenStatus = (PaymentContainerTokenStatus) o;
    return Objects.equals(this.status, paymentContainerTokenStatus.status) &&
        Objects.equals(this.created, paymentContainerTokenStatus.created) &&
        Objects.equals(this.lastModified, paymentContainerTokenStatus.lastModified) &&
        Objects.equals(this.version, paymentContainerTokenStatus.version);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, created, lastModified, version);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContainerTokenStatus {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    lastModified: ").append(toIndentedString(lastModified)).append("\n");
    sb.append("    version: ").append(toIndentedString(version)).append("\n");
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

