package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Pricing Input
 */
public class PaymentContractsDTORequestIdPricing {
  @SerializedName("product_id")
  protected Integer productId = null;

  @SerializedName("disagio")
  protected String disagio = null;

  @SerializedName("disagio_min")
  protected String disagioMin = null;

  @SerializedName("fix")
  protected String fix = null;

  public PaymentContractsDTORequestIdPricing productId(Integer productId) {
    this.productId = productId;
    return this;
  }

   /**
   * Product Id
   * @return productId
  **/
  public Integer getProductId() {
    return productId;
  }

  public void setProductId(Integer productId) {
    this.productId = productId;
  }

  public PaymentContractsDTORequestIdPricing disagio(String disagio) {
    this.disagio = disagio;
    return this;
  }

   /**
   * Disagio - Format 1.25
   * @return disagio
  **/
  public String getDisagio() {
    return disagio;
  }

  public void setDisagio(String disagio) {
    this.disagio = disagio;
  }

  public PaymentContractsDTORequestIdPricing disagioMin(String disagioMin) {
    this.disagioMin = disagioMin;
    return this;
  }

   /**
   * Disagio Min - Format 0.25
   * @return disagioMin
  **/
  public String getDisagioMin() {
    return disagioMin;
  }

  public void setDisagioMin(String disagioMin) {
    this.disagioMin = disagioMin;
  }

  public PaymentContractsDTORequestIdPricing fix(String fix) {
    this.fix = fix;
    return this;
  }

   /**
   * Fix - Format 0.05
   * @return fix
  **/
  public String getFix() {
    return fix;
  }

  public void setFix(String fix) {
    this.fix = fix;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContractsDTORequestIdPricing paymentContractsDTORequestIdPricing = (PaymentContractsDTORequestIdPricing) o;
    return Objects.equals(this.productId, paymentContractsDTORequestIdPricing.productId) &&
        Objects.equals(this.disagio, paymentContractsDTORequestIdPricing.disagio) &&
        Objects.equals(this.disagioMin, paymentContractsDTORequestIdPricing.disagioMin) &&
        Objects.equals(this.fix, paymentContractsDTORequestIdPricing.fix);
  }

  @Override
  public int hashCode() {
    return Objects.hash(productId, disagio, disagioMin, fix);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContractsDTORequestIdPricing {\n");
    sb.append("    productId: ").append(toIndentedString(productId)).append("\n");
    sb.append("    disagio: ").append(toIndentedString(disagio)).append("\n");
    sb.append("    disagioMin: ").append(toIndentedString(disagioMin)).append("\n");
    sb.append("    fix: ").append(toIndentedString(fix)).append("\n");
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

