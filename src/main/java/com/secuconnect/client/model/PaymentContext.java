package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PaymentContext
 */
public class PaymentContext {
  @SerializedName("auto_capture")
  private Boolean autoCapture = false;

  @SerializedName("payment_methods")
  private List<String> paymentMethods = null;

  @SerializedName("merchant_initiated")
  private Boolean merchantInitiated = false;

  public PaymentContext autoCapture(Boolean autoCapture) {
    this.autoCapture = autoCapture;
    return this;
  }

   /**
   * auto capture the smart transaction
   * @return autoCapture
  **/
  public Boolean getAutoCapture() {
    return autoCapture;
  }

  public void setAutoCapture(Boolean autoCapture) {
    this.autoCapture = autoCapture;
  }

  public PaymentContext paymentMethods(List<String> paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

  public PaymentContext addPaymentMethodsItem(String paymentMethodsItem) {
    if (this.paymentMethods == null) {
      this.paymentMethods = new ArrayList<>();
    }
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }

   /**
   * PaymentContext
   * @return paymentMethods
  **/
  public List<String> getPaymentMethods() {
    return paymentMethods;
  }

  public void setPaymentMethods(List<String> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }

  public PaymentContext merchantInitiated(Boolean merchantInitiated) {
    this.merchantInitiated = merchantInitiated;
    return this;
  }

   /**
   * is this smart transaction created automatically by the merchant (process without customer interaction)
   * @return merchantInitiated
  **/
  public Boolean getMerchantInitiated() {
    return merchantInitiated;
  }

  public void setMerchantInitiated(Boolean merchantInitiated) {
    this.merchantInitiated = merchantInitiated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContext paymentContext = (PaymentContext) o;
    return Objects.equals(this.autoCapture, paymentContext.autoCapture) &&
        Objects.equals(this.paymentMethods, paymentContext.paymentMethods) &&
        Objects.equals(this.merchantInitiated, paymentContext.merchantInitiated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoCapture, paymentMethods, merchantInitiated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContext {\n");
    sb.append("    autoCapture: ").append(toIndentedString(autoCapture)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
    sb.append("    merchantInitiated: ").append(toIndentedString(merchantInitiated)).append("\n");
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

