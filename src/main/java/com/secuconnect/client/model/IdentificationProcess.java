package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * IdentificationProcess
 */
public class IdentificationProcess {
  @SerializedName("status")
  protected String status = null;

  @SerializedName("identificationtime")
  protected String identificationtime = null;

  @SerializedName("transactionnumber")
  protected String transactionnumber = null;

  public IdentificationProcess status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status from identification provider
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public IdentificationProcess identificationtime(String identificationtime) {
    this.identificationtime = identificationtime;
    return this;
  }

   /**
   * Get identificationtime
   * @return identificationtime
  **/
  public String getIdentificationtime() {
    return identificationtime;
  }

  public void setIdentificationtime(String identificationtime) {
    this.identificationtime = identificationtime;
  }

  public IdentificationProcess transactionnumber(String transactionnumber) {
    this.transactionnumber = transactionnumber;
    return this;
  }

   /**
   * The person transaction_id from identrequest
   * @return transactionnumber
  **/
  public String getTransactionnumber() {
    return transactionnumber;
  }

  public void setTransactionnumber(String transactionnumber) {
    this.transactionnumber = transactionnumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentificationProcess identificationProcess = (IdentificationProcess) o;
    return Objects.equals(this.status, identificationProcess.status) &&
        Objects.equals(this.identificationtime, identificationProcess.identificationtime) &&
        Objects.equals(this.transactionnumber, identificationProcess.transactionnumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, identificationtime, transactionnumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificationProcess {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    identificationtime: ").append(toIndentedString(identificationtime)).append("\n");
    sb.append("    transactionnumber: ").append(toIndentedString(transactionnumber)).append("\n");
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

