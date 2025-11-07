package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Supports the merchant customizing the DBA name and city on a per-transaction basis, to allow the cardholder to recognize the business name and city on their card or bank statement
 */
public class DynamicDescriptor {
  @SerializedName("merchant_name")
  protected String merchantName = null;

  @SerializedName("merchant_city")
  protected String merchantCity = null;

  public DynamicDescriptor merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

   /**
   * Get merchantName
   * @return merchantName
  **/
  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  public DynamicDescriptor merchantCity(String merchantCity) {
    this.merchantCity = merchantCity;
    return this;
  }

   /**
   * Get merchantCity
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
    DynamicDescriptor dynamicDescriptor = (DynamicDescriptor) o;
    return Objects.equals(this.merchantName, dynamicDescriptor.merchantName) &&
        Objects.equals(this.merchantCity, dynamicDescriptor.merchantCity);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantName, merchantCity);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class DynamicDescriptor {\n");
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

