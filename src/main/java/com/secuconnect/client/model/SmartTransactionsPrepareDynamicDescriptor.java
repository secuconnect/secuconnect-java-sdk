package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Dynamic Descriptor to allow the cardholder to recognize the business name and city on their card or bank statement.
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
   * Merchant Name to recognition on card or bank statement.  _Note: [1 - 22] characters_
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
   * Merchant City to recognition on card or bank statement.  _Note: [1 - 13] characters_
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

