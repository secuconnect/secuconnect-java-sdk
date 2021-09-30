package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * IdentificationProcess
 */
public class IdentificationProcess {
  @SerializedName("status")
  private String status = null;

  @SerializedName("identificatontime")
  private String identificatontime = null;

  @SerializedName("transactionnumber")
  private String transactionnumber = null;

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

  public IdentificationProcess identificatontime(String identificatontime) {
    this.identificatontime = identificatontime;
    return this;
  }

   /**
   * Get identificatontime
   * @return identificatontime
  **/
  public String getIdentificatontime() {
    return identificatontime;
  }

  public void setIdentificatontime(String identificatontime) {
    this.identificatontime = identificatontime;
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
        Objects.equals(this.identificatontime, identificationProcess.identificatontime) &&
        Objects.equals(this.transactionnumber, identificationProcess.transactionnumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, identificatontime, transactionnumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentificationProcess {\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    identificatontime: ").append(toIndentedString(identificatontime)).append("\n");
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

