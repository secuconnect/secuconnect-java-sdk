package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * PayPal account details
 */
public class PayPalDescriptor implements OneOfPaymentContainersDTOModelPrivate {
  @SerializedName("email")
  protected String email = null;

  @SerializedName("payer_id")
  protected String payerId = null;

  public PayPalDescriptor email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Account owner email
   * @return email
  **/
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public PayPalDescriptor payerId(String payerId) {
    this.payerId = payerId;
    return this;
  }

   /**
   * Account ID
   * @return payerId
  **/
  public String getPayerId() {
    return payerId;
  }

  public void setPayerId(String payerId) {
    this.payerId = payerId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PayPalDescriptor payPalDescriptor = (PayPalDescriptor) o;
    return Objects.equals(this.email, payPalDescriptor.email) &&
        Objects.equals(this.payerId, payPalDescriptor.payerId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(email, payerId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PayPalDescriptor {\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    payerId: ").append(toIndentedString(payerId)).append("\n");
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

