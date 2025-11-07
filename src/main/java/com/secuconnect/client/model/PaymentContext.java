package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.ContainerInstructions;
import com.secuconnect.client.model.DynamicDescriptor;
import com.secuconnect.client.model.MITInstructions;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Controls some payment details
 */
public class PaymentContext {
  @SerializedName("auto_capture")
  protected Boolean autoCapture = false;

  @SerializedName("payment_methods")
  protected List<String> paymentMethods = null;

  @SerializedName("merchant_initiated")
  protected Boolean merchantInitiated = false;

  @SerializedName("creditcard_schemes")
  protected List<String> creditcardSchemes = null;

  @SerializedName("accrual")
  protected Boolean accrual = false;

  @SerializedName("dynamic_descriptor")
  protected DynamicDescriptor dynamicDescriptor = null;

  @SerializedName("container_instructions")
  protected ContainerInstructions containerInstructions = null;

  @SerializedName("mit_instructions")
  protected MITInstructions mitInstructions = null;

  public PaymentContext autoCapture(Boolean autoCapture) {
    this.autoCapture = autoCapture;
    return this;
  }

   /**
   * Whether the Smart Transation is executed automatically after successful authorisation; this can save the extra call to &#x60;/start&#x60;
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
      this.paymentMethods = new ArrayList<String>();
    }
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }

   /**
   * Wanted payment methods:  - &#x60;\&quot;creditcard\&quot;&#x60; - &#x60;\&quot;debit\&quot;&#x60; - &#x60;\&quot;easycredit\&quot;&#x60; - &#x60;\&quot;giropay\&quot;&#x60; - &#x60;\&quot;invoice\&quot;&#x60; - &#x60;\&quot;paypal\&quot;&#x60; - &#x60;\&quot;prepaid\&quot;&#x60; - &#x60;\&quot;sofort\&quot;&#x60;
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
   * Whether this is a merchant initiated transaction (MIT), created without customer interaction
   * @return merchantInitiated
  **/
  public Boolean getMerchantInitiated() {
    return merchantInitiated;
  }

  public void setMerchantInitiated(Boolean merchantInitiated) {
    this.merchantInitiated = merchantInitiated;
  }

   /**
   * Supported credit card networks of the given contract
   * @return creditcardSchemes
  **/
  public List<String> getCreditcardSchemes() {
    return creditcardSchemes;
  }

  public PaymentContext accrual(Boolean accrual) {
    this.accrual = accrual;
    return this;
  }

   /**
   * Whether to set the accrual flag, when the Payment Transaction is created. The payment will not be executed until the accrual flag of the Payment Transaction is removed.
   * @return accrual
  **/
  public Boolean getAccrual() {
    return accrual;
  }

  public void setAccrual(Boolean accrual) {
    this.accrual = accrual;
  }

  public PaymentContext dynamicDescriptor(DynamicDescriptor dynamicDescriptor) {
    this.dynamicDescriptor = dynamicDescriptor;
    return this;
  }

   /**
   * Get dynamicDescriptor
   * @return dynamicDescriptor
  **/
  public DynamicDescriptor getDynamicDescriptor() {
    return dynamicDescriptor;
  }

  public void setDynamicDescriptor(DynamicDescriptor dynamicDescriptor) {
    this.dynamicDescriptor = dynamicDescriptor;
  }

  public PaymentContext containerInstructions(ContainerInstructions containerInstructions) {
    this.containerInstructions = containerInstructions;
    return this;
  }

   /**
   * Get containerInstructions
   * @return containerInstructions
  **/
  public ContainerInstructions getContainerInstructions() {
    return containerInstructions;
  }

  public void setContainerInstructions(ContainerInstructions containerInstructions) {
    this.containerInstructions = containerInstructions;
  }

  public PaymentContext mitInstructions(MITInstructions mitInstructions) {
    this.mitInstructions = mitInstructions;
    return this;
  }

   /**
   * Get mitInstructions
   * @return mitInstructions
  **/
  public MITInstructions getMitInstructions() {
    return mitInstructions;
  }

  public void setMitInstructions(MITInstructions mitInstructions) {
    this.mitInstructions = mitInstructions;
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
        Objects.equals(this.merchantInitiated, paymentContext.merchantInitiated) &&
        Objects.equals(this.creditcardSchemes, paymentContext.creditcardSchemes) &&
        Objects.equals(this.accrual, paymentContext.accrual) &&
        Objects.equals(this.dynamicDescriptor, paymentContext.dynamicDescriptor) &&
        Objects.equals(this.containerInstructions, paymentContext.containerInstructions) &&
        Objects.equals(this.mitInstructions, paymentContext.mitInstructions);
  }

  @Override
  public int hashCode() {
    return Objects.hash(autoCapture, paymentMethods, merchantInitiated, creditcardSchemes, accrual, dynamicDescriptor, containerInstructions, mitInstructions);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContext {\n");
    sb.append("    autoCapture: ").append(toIndentedString(autoCapture)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
    sb.append("    merchantInitiated: ").append(toIndentedString(merchantInitiated)).append("\n");
    sb.append("    creditcardSchemes: ").append(toIndentedString(creditcardSchemes)).append("\n");
    sb.append("    accrual: ").append(toIndentedString(accrual)).append("\n");
    sb.append("    dynamicDescriptor: ").append(toIndentedString(dynamicDescriptor)).append("\n");
    sb.append("    containerInstructions: ").append(toIndentedString(containerInstructions)).append("\n");
    sb.append("    mitInstructions: ").append(toIndentedString(mitInstructions)).append("\n");
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

