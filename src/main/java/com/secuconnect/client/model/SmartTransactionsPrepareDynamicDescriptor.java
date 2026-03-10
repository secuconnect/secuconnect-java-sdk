package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * The dynamic descriptor appears on the bank statement of the card holder. This shall either be:  - Legal name and registered Address - DBA (trading name) and business location  The country is taken from the merchant&#x27;s master data. The dynamic descriptor is only useful when used together with credit card payment with secupay acquiring.
 */
public class SmartTransactionsPrepareDynamicDescriptor {
  @SerializedName("merchant_name")
  protected String merchantName = null;

  @SerializedName("merchant_city")
  protected String merchantCity = null;

  public SmartTransactionsPrepareDynamicDescriptor merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

   /**
   * Company name (legal) or DBA (trading name)  _Note: Restricted to 1 .. 22 characters A-Z, a-z, 0-9, - . ! * &#x3D; _ or space._
   * @return merchantName
  **/
  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  public SmartTransactionsPrepareDynamicDescriptor merchantCity(String merchantCity) {
    this.merchantCity = merchantCity;
    return this;
  }

   /**
   * City of registered address or business address  _Note: Restricted to 1 .. 13 characters A-Z, a-z, 0-9, - . ! * &#x3D; _ or space._
   * @return merchantCity
  **/
  public String getMerchantCity() {
    return merchantCity;
  }

  public void setMerchantCity(String merchantCity) {
    this.merchantCity = merchantCity;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsPrepareDynamicDescriptor smartTransactionsPrepareDynamicDescriptor = (SmartTransactionsPrepareDynamicDescriptor) o;
    return Objects.equals(this.merchantName, smartTransactionsPrepareDynamicDescriptor.merchantName) &&
        Objects.equals(this.merchantCity, smartTransactionsPrepareDynamicDescriptor.merchantCity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantName, merchantCity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsPrepareDynamicDescriptor {\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
    sb.append("    merchantCity: ").append(toIndentedString(merchantCity)).append("\n");
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

