package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Recurring payments
 */
public class SecupayTransactionProductDTOSubscription {
  @SerializedName("purpose")
  protected String purpose = null;

  @SerializedName("id")
  protected Integer id = null;

  public SecupayTransactionProductDTOSubscription purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * Purpose of the recurring payment; needs to be present at the first time
   * @return purpose
  **/
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public SecupayTransactionProductDTOSubscription id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Recurring payments ID; is generated at the first time, and needs to be passed with all subsequent payments
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayTransactionProductDTOSubscription secupayTransactionProductDTOSubscription = (SecupayTransactionProductDTOSubscription) o;
    return Objects.equals(this.purpose, secupayTransactionProductDTOSubscription.purpose) &&
        Objects.equals(this.id, secupayTransactionProductDTOSubscription.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purpose, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayTransactionProductDTOSubscription {\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

