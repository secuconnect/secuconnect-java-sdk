package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.BillingCyclesItem;
import com.secuconnect.client.model.GeneralMerchantsProductModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PaymentPlansDTO
 */
public class PaymentPlansDTO {
  @SerializedName("description")
  protected String description = null;

  @SerializedName("currency")
  protected String currency = null;

  @SerializedName("paypal_plan_id")
  protected String paypalPlanId = null;

  @SerializedName("status")
  protected String status = null;

  @SerializedName("payment_methods")
  protected List<String> paymentMethods = null;

  @SerializedName("merchant")
  protected GeneralMerchantsProductModel merchant = null;

  @SerializedName("merchant_id")
  protected String merchantId = null;

  @SerializedName("billing_cycles")
  protected List<BillingCyclesItem> billingCycles = null;

  public PaymentPlansDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Short description of the subscription plan
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public PaymentPlansDTO currency(String currency) {
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

  public PaymentPlansDTO paypalPlanId(String paypalPlanId) {
    this.paypalPlanId = paypalPlanId;
    return this;
  }

   /**
   * PayPal Subscription Plan ID; needed for PayPal payment
   * @return paypalPlanId
  **/
  public String getPaypalPlanId() {
    return paypalPlanId;
  }

  public void setPaypalPlanId(String paypalPlanId) {
    this.paypalPlanId = paypalPlanId;
  }

  public PaymentPlansDTO status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status:  * &#x60;\&quot;created\&quot;&#x60; * &#x60;\&quot;active\&quot;&#x60; * &#x60;\&quot;inactive\&quot;&#x60;
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PaymentPlansDTO paymentMethods(List<String> paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

  public PaymentPlansDTO addPaymentMethodsItem(String paymentMethodsItem) {
    if (this.paymentMethods == null) {
      this.paymentMethods = new ArrayList<String>();
    }
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }

   /**
   * Payment methods:  * &#x60;\&quot;creditcard\&quot;&#x60; * &#x60;\&quot;debit\&quot;&#x60; * &#x60;\&quot;paypal\&quot;&#x60;
   * @return paymentMethods
  **/
  public List<String> getPaymentMethods() {
    return paymentMethods;
  }

  public void setPaymentMethods(List<String> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }

  public PaymentPlansDTO merchant(GeneralMerchantsProductModel merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  public GeneralMerchantsProductModel getMerchant() {
    return merchant;
  }

  public void setMerchant(GeneralMerchantsProductModel merchant) {
    this.merchant = merchant;
  }

  public PaymentPlansDTO merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * General Merchant ID
   * @return merchantId
  **/
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public PaymentPlansDTO billingCycles(List<BillingCyclesItem> billingCycles) {
    this.billingCycles = billingCycles;
    return this;
  }

  public PaymentPlansDTO addBillingCyclesItem(BillingCyclesItem billingCyclesItem) {
    if (this.billingCycles == null) {
      this.billingCycles = new ArrayList<BillingCyclesItem>();
    }
    this.billingCycles.add(billingCyclesItem);
    return this;
  }

   /**
   * Billing cycles
   * @return billingCycles
  **/
  public List<BillingCyclesItem> getBillingCycles() {
    return billingCycles;
  }

  public void setBillingCycles(List<BillingCyclesItem> billingCycles) {
    this.billingCycles = billingCycles;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentPlansDTO paymentPlansDTO = (PaymentPlansDTO) o;
    return Objects.equals(this.description, paymentPlansDTO.description) &&
        Objects.equals(this.currency, paymentPlansDTO.currency) &&
        Objects.equals(this.paypalPlanId, paymentPlansDTO.paypalPlanId) &&
        Objects.equals(this.status, paymentPlansDTO.status) &&
        Objects.equals(this.paymentMethods, paymentPlansDTO.paymentMethods) &&
        Objects.equals(this.merchant, paymentPlansDTO.merchant) &&
        Objects.equals(this.merchantId, paymentPlansDTO.merchantId) &&
        Objects.equals(this.billingCycles, paymentPlansDTO.billingCycles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, currency, paypalPlanId, status, paymentMethods, merchant, merchantId, billingCycles);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentPlansDTO {\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paypalPlanId: ").append(toIndentedString(paypalPlanId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    billingCycles: ").append(toIndentedString(billingCycles)).append("\n");
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

