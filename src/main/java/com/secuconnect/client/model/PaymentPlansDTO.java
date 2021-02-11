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
  private String description = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("paypal_plan_id")
  private String paypalPlanId = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("payment_methods")
  private List<String> paymentMethods = null;

  @SerializedName("merchant")
  private GeneralMerchantsProductModel merchant = null;

  @SerializedName("billing_cycles")
  private List<BillingCyclesItem> billingCycles = null;

  public PaymentPlansDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of payment plan
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
   * ISO currency code
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
   * Payment plan id
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
   * Payment plan status
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
      this.paymentMethods = new ArrayList<>();
    }
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }

   /**
   * Payment methods
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

  public PaymentPlansDTO billingCycles(List<BillingCyclesItem> billingCycles) {
    this.billingCycles = billingCycles;
    return this;
  }

  public PaymentPlansDTO addBillingCyclesItem(BillingCyclesItem billingCyclesItem) {
    if (this.billingCycles == null) {
      this.billingCycles = new ArrayList<>();
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
        Objects.equals(this.billingCycles, paymentPlansDTO.billingCycles);
  }

  @Override
  public int hashCode() {
    return Objects.hash(description, currency, paypalPlanId, status, paymentMethods, merchant, billingCycles);
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

