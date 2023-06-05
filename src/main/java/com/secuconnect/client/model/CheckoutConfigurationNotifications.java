package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Checkout notification settings
 */
public class CheckoutConfigurationNotifications {
  @SerializedName("merchant_order_mail")
  protected Boolean merchantOrderMail = true;

  @SerializedName("customer_order_mail")
  protected Boolean customerOrderMail = true;

  public CheckoutConfigurationNotifications merchantOrderMail(Boolean merchantOrderMail) {
    this.merchantOrderMail = merchantOrderMail;
    return this;
  }

   /**
   * If enabled an order confirmation mail will be send to the seller
   * @return merchantOrderMail
  **/
  public Boolean getMerchantOrderMail() {
    return merchantOrderMail;
  }

  public void setMerchantOrderMail(Boolean merchantOrderMail) {
    this.merchantOrderMail = merchantOrderMail;
  }

  public CheckoutConfigurationNotifications customerOrderMail(Boolean customerOrderMail) {
    this.customerOrderMail = customerOrderMail;
    return this;
  }

   /**
   * If enabled an order confirmation mail will be send to the payer
   * @return customerOrderMail
  **/
  public Boolean getCustomerOrderMail() {
    return customerOrderMail;
  }

  public void setCustomerOrderMail(Boolean customerOrderMail) {
    this.customerOrderMail = customerOrderMail;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutConfigurationNotifications checkoutConfigurationNotifications = (CheckoutConfigurationNotifications) o;
    return Objects.equals(this.merchantOrderMail, checkoutConfigurationNotifications.merchantOrderMail) &&
        Objects.equals(this.customerOrderMail, checkoutConfigurationNotifications.customerOrderMail);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantOrderMail, customerOrderMail);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutConfigurationNotifications {\n");
    sb.append("    merchantOrderMail: ").append(toIndentedString(merchantOrderMail)).append("\n");
    sb.append("    customerOrderMail: ").append(toIndentedString(customerOrderMail)).append("\n");
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

