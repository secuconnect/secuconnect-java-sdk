package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Transaction details
 */
public class PaymentTransactionsProductModelDetails {
  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("cleared")
  private String cleared = null;

  @SerializedName("status")
  private Integer status = null;

  @SerializedName("status_text")
  private String statusText = null;

  @SerializedName("status_simple")
  private Integer statusSimple = null;

  @SerializedName("status_text_simple")
  private String statusTextSimple = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("description_raw")
  private String descriptionRaw = null;

  public PaymentTransactionsProductModelDetails amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public PaymentTransactionsProductModelDetails cleared(String cleared) {
    this.cleared = cleared;
    return this;
  }

   /**
   * Clearing status
   * @return cleared
  **/
  public String getCleared() {
    return cleared;
  }

  public void setCleared(String cleared) {
    this.cleared = cleared;
  }

  public PaymentTransactionsProductModelDetails status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Transaction status ID
   * @return status
  **/
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public PaymentTransactionsProductModelDetails statusText(String statusText) {
    this.statusText = statusText;
    return this;
  }

   /**
   * Transaction status description
   * @return statusText
  **/
  public String getStatusText() {
    return statusText;
  }

  public void setStatusText(String statusText) {
    this.statusText = statusText;
  }

  public PaymentTransactionsProductModelDetails statusSimple(Integer statusSimple) {
    this.statusSimple = statusSimple;
    return this;
  }

   /**
   * Transaction simple-status ID
   * @return statusSimple
  **/
  public Integer getStatusSimple() {
    return statusSimple;
  }

  public void setStatusSimple(Integer statusSimple) {
    this.statusSimple = statusSimple;
  }

  public PaymentTransactionsProductModelDetails statusTextSimple(String statusTextSimple) {
    this.statusTextSimple = statusTextSimple;
    return this;
  }

   /**
   * Transaction simple-status description
   * @return statusTextSimple
  **/
  public String getStatusTextSimple() {
    return statusTextSimple;
  }

  public void setStatusTextSimple(String statusTextSimple) {
    this.statusTextSimple = statusTextSimple;
  }

  public PaymentTransactionsProductModelDetails description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Transaction description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PaymentTransactionsProductModelDetails descriptionRaw(String descriptionRaw) {
    this.descriptionRaw = descriptionRaw;
    return this;
  }

   /**
   * Transaction description (plain text)
   * @return descriptionRaw
  **/
  public String getDescriptionRaw() {
    return descriptionRaw;
  }

  public void setDescriptionRaw(String descriptionRaw) {
    this.descriptionRaw = descriptionRaw;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransactionsProductModelDetails paymentTransactionsProductModelDetails = (PaymentTransactionsProductModelDetails) o;
    return Objects.equals(this.amount, paymentTransactionsProductModelDetails.amount) &&
        Objects.equals(this.cleared, paymentTransactionsProductModelDetails.cleared) &&
        Objects.equals(this.status, paymentTransactionsProductModelDetails.status) &&
        Objects.equals(this.statusText, paymentTransactionsProductModelDetails.statusText) &&
        Objects.equals(this.statusSimple, paymentTransactionsProductModelDetails.statusSimple) &&
        Objects.equals(this.statusTextSimple, paymentTransactionsProductModelDetails.statusTextSimple) &&
        Objects.equals(this.description, paymentTransactionsProductModelDetails.description) &&
        Objects.equals(this.descriptionRaw, paymentTransactionsProductModelDetails.descriptionRaw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, cleared, status, statusText, statusSimple, statusTextSimple, description, descriptionRaw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransactionsProductModelDetails {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    cleared: ").append(toIndentedString(cleared)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    statusText: ").append(toIndentedString(statusText)).append("\n");
    sb.append("    statusSimple: ").append(toIndentedString(statusSimple)).append("\n");
    sb.append("    statusTextSimple: ").append(toIndentedString(statusTextSimple)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    descriptionRaw: ").append(toIndentedString(descriptionRaw)).append("\n");
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

