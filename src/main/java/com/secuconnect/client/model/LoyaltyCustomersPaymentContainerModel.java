package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.BankAccountDescriptor;
import java.util.Objects;

/**
 * Payment Container
 */
public class LoyaltyCustomersPaymentContainerModel {
  @SerializedName("object")
  protected String object = null;

  @SerializedName("id")
  protected String id = null;

  @SerializedName("type")
  protected String type = null;

  @SerializedName("payment_information")
  protected BankAccountDescriptor paymentInformation = null;

  @SerializedName("last_usage")
  protected String lastUsage = null;

  public LoyaltyCustomersPaymentContainerModel object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Get object
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public LoyaltyCustomersPaymentContainerModel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LoyaltyCustomersPaymentContainerModel type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public LoyaltyCustomersPaymentContainerModel paymentInformation(BankAccountDescriptor paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  public BankAccountDescriptor getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(BankAccountDescriptor paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  public LoyaltyCustomersPaymentContainerModel lastUsage(String lastUsage) {
    this.lastUsage = lastUsage;
    return this;
  }

   /**
   * Last Usage date (ISO 8601 date and time including timezone, like  \&quot;2023-02-28 T10:55:27+02:00\&quot;)
   * @return lastUsage
  **/
  public String getLastUsage() {
    return lastUsage;
  }

  public void setLastUsage(String lastUsage) {
    this.lastUsage = lastUsage;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyCustomersPaymentContainerModel loyaltyCustomersPaymentContainerModel = (LoyaltyCustomersPaymentContainerModel) o;
    return Objects.equals(this.object, loyaltyCustomersPaymentContainerModel.object) &&
        Objects.equals(this.id, loyaltyCustomersPaymentContainerModel.id) &&
        Objects.equals(this.type, loyaltyCustomersPaymentContainerModel.type) &&
        Objects.equals(this.paymentInformation, loyaltyCustomersPaymentContainerModel.paymentInformation) &&
        Objects.equals(this.lastUsage, loyaltyCustomersPaymentContainerModel.lastUsage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, type, paymentInformation, lastUsage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyCustomersPaymentContainerModel {\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
    sb.append("    lastUsage: ").append(toIndentedString(lastUsage)).append("\n");
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

