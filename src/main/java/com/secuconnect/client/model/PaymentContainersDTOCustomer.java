package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * The customer the Payment Container belongs to
 */
public class PaymentContainersDTOCustomer {
  @SerializedName("id")
  protected String id = null;

  public PaymentContainersDTOCustomer id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Payment Customer ID
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
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
    PaymentContainersDTOCustomer paymentContainersDTOCustomer = (PaymentContainersDTOCustomer) o;
    return Objects.equals(this.id, paymentContainersDTOCustomer.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContainersDTOCustomer {\n");
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

