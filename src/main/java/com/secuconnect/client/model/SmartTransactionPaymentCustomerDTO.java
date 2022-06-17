package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.Contact;
import com.secuconnect.client.model.PaymentCustomersDTO;
import com.secuconnect.client.model.ProductInstanceUID;
import java.util.Objects;

/**
 * SmartTransactionPaymentCustomerDTO
 */
public class SmartTransactionPaymentCustomerDTO extends ProductInstanceUID {
  @SerializedName("contact")
  private Contact contact = null;

  public SmartTransactionPaymentCustomerDTO contact(Contact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionPaymentCustomerDTO smartTransactionPaymentCustomerDTO = (SmartTransactionPaymentCustomerDTO) o;
    return Objects.equals(this.contact, smartTransactionPaymentCustomerDTO.contact) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contact, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionPaymentCustomerDTO {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
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

