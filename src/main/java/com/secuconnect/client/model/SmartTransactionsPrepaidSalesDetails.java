package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * SmartTransactionsPrepaidSalesDetails
 */
public class SmartTransactionsPrepaidSalesDetails {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("error_details")
  private String errorDetails = null;

  public SmartTransactionsPrepaidSalesDetails id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * ID
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SmartTransactionsPrepaidSalesDetails status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SmartTransactionsPrepaidSalesDetails errorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Error Details
   * @return errorDetails
  **/
  public String getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsPrepaidSalesDetails smartTransactionsPrepaidSalesDetails = (SmartTransactionsPrepaidSalesDetails) o;
    return Objects.equals(this.id, smartTransactionsPrepaidSalesDetails.id) &&
        Objects.equals(this.status, smartTransactionsPrepaidSalesDetails.status) &&
        Objects.equals(this.errorDetails, smartTransactionsPrepaidSalesDetails.errorDetails);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, status, errorDetails);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsPrepaidSalesDetails {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
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

