package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * GetAvailablePaymentMethodsDTO
 */
public class GetAvailablePaymentMethodsDTO {
  @SerializedName("currency")
  protected String currency = null;

  @SerializedName("is_demo")
  protected Boolean isDemo = null;

  @SerializedName("apiv2_products")
  protected Boolean apiv2Products = null;

  public GetAvailablePaymentMethodsDTO currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public GetAvailablePaymentMethodsDTO isDemo(Boolean isDemo) {
    this.isDemo = isDemo;
    return this;
  }

   /**
   * Demo mode. Such transactions are not actually processed.
   * @return isDemo
  **/
  public Boolean getIsDemo() {
    return isDemo;
  }

  public void setIsDemo(Boolean isDemo) {
    this.isDemo = isDemo;
  }

  public GetAvailablePaymentMethodsDTO apiv2Products(Boolean apiv2Products) {
    this.apiv2Products = apiv2Products;
    return this;
  }

   /**
   * If TRUE, the response will use the flex.API/APIv2 product names, and the other parameters will be ignored.
   * @return apiv2Products
  **/
  public Boolean getApiv2Products() {
    return apiv2Products;
  }

  public void setApiv2Products(Boolean apiv2Products) {
    this.apiv2Products = apiv2Products;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetAvailablePaymentMethodsDTO getAvailablePaymentMethodsDTO = (GetAvailablePaymentMethodsDTO) o;
    return Objects.equals(this.currency, getAvailablePaymentMethodsDTO.currency) &&
        Objects.equals(this.isDemo, getAvailablePaymentMethodsDTO.isDemo) &&
        Objects.equals(this.apiv2Products, getAvailablePaymentMethodsDTO.apiv2Products);
  }

  @Override
  public int hashCode() {
    return Objects.hash(currency, isDemo, apiv2Products);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetAvailablePaymentMethodsDTO {\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    isDemo: ").append(toIndentedString(isDemo)).append("\n");
    sb.append("    apiv2Products: ").append(toIndentedString(apiv2Products)).append("\n");
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

