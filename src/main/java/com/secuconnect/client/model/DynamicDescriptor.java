package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * DBA (“doing business as”) name and local address instead of the legal name and registration address  A DBA can be a trademark or store name that is better understandable by the card holders when checking their card or bank statements, and can lead to fewer chargebacks. This works only with credit card payment together with the new acquiring by secupay.  _Please note that you must only use DBA names and addresses to which you have a legitimate claim._
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
   * DBA (“doing business as”)
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

