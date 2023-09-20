package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Data restrictions for Smart Checkout
 */
public class SmartTransactionsApplicationContextLocks {
  @SerializedName("customer")
  protected Boolean customer = false;

  @SerializedName("shipping_address")
  protected Boolean shippingAddress = null;

  public SmartTransactionsApplicationContextLocks customer(Boolean customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Whether the customer data are locked; locked data must not be changed
   * @return customer
  **/
  public Boolean getCustomer() {
    return customer;
  }

  public void setCustomer(Boolean customer) {
    this.customer = customer;
  }

  public SmartTransactionsApplicationContextLocks shippingAddress(Boolean shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Whether the shipping address is locked; locked data must not be changed
   * @return shippingAddress
  **/
  public Boolean getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(Boolean shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsApplicationContextLocks smartTransactionsApplicationContextLocks = (SmartTransactionsApplicationContextLocks) o;
    return Objects.equals(this.customer, smartTransactionsApplicationContextLocks.customer) &&
        Objects.equals(this.shippingAddress, smartTransactionsApplicationContextLocks.shippingAddress);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, shippingAddress);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsApplicationContextLocks {\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
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

