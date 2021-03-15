package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.BaseProductModel;
import io.secuconnect.client.model.CreatedField;
import io.secuconnect.client.model.PaymentSubscriptionsProductModelBillingCycles;
import io.secuconnect.client.model.UpdatedField;
import java.util.Objects;

/**
 * PaymentSubscriptionsProductModel
 */
public class PaymentSubscriptionsProductModel extends BaseProductModel {
  @SerializedName("created")
  private String created = null;

  @SerializedName("updated")
  private String updated = null;

  @SerializedName("smart_transaction")
  private BaseProductModel smartTransaction = null;

  @SerializedName("merchant")
  private BaseProductModel merchant = null;

  @SerializedName("contract")
  private BaseProductModel contract = null;

  @SerializedName("customer")
  private BaseProductModel customer = null;

  @SerializedName("container")
  private BaseProductModel container = null;

  @SerializedName("plan")
  private BaseProductModel plan = null;

  @SerializedName("start_at")
  private String startAt = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("paypal_subscription_id")
  private String paypalSubscriptionId = null;

  @SerializedName("billing_cycles")
  private PaymentSubscriptionsProductModelBillingCycles billingCycles = null;

  public PaymentSubscriptionsProductModel created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public PaymentSubscriptionsProductModel updated(String updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  public PaymentSubscriptionsProductModel smartTransaction(BaseProductModel smartTransaction) {
    this.smartTransaction = smartTransaction;
    return this;
  }

   /**
   * Get smartTransaction
   * @return smartTransaction
  **/
  public BaseProductModel getSmartTransaction() {
    return smartTransaction;
  }

  public void setSmartTransaction(BaseProductModel smartTransaction) {
    this.smartTransaction = smartTransaction;
  }

  public PaymentSubscriptionsProductModel merchant(BaseProductModel merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  public BaseProductModel getMerchant() {
    return merchant;
  }

  public void setMerchant(BaseProductModel merchant) {
    this.merchant = merchant;
  }

  public PaymentSubscriptionsProductModel contract(BaseProductModel contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  public BaseProductModel getContract() {
    return contract;
  }

  public void setContract(BaseProductModel contract) {
    this.contract = contract;
  }

  public PaymentSubscriptionsProductModel customer(BaseProductModel customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  public BaseProductModel getCustomer() {
    return customer;
  }

  public void setCustomer(BaseProductModel customer) {
    this.customer = customer;
  }

  public PaymentSubscriptionsProductModel container(BaseProductModel container) {
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  public BaseProductModel getContainer() {
    return container;
  }

  public void setContainer(BaseProductModel container) {
    this.container = container;
  }

  public PaymentSubscriptionsProductModel plan(BaseProductModel plan) {
    this.plan = plan;
    return this;
  }

   /**
   * Get plan
   * @return plan
  **/
  public BaseProductModel getPlan() {
    return plan;
  }

  public void setPlan(BaseProductModel plan) {
    this.plan = plan;
  }

  public PaymentSubscriptionsProductModel startAt(String startAt) {
    this.startAt = startAt;
    return this;
  }

   /**
   * start at
   * @return startAt
  **/
  public String getStartAt() {
    return startAt;
  }

  public void setStartAt(String startAt) {
    this.startAt = startAt;
  }

  public PaymentSubscriptionsProductModel status(String status) {
    this.status = status;
    return this;
  }

   /**
   * status
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PaymentSubscriptionsProductModel paypalSubscriptionId(String paypalSubscriptionId) {
    this.paypalSubscriptionId = paypalSubscriptionId;
    return this;
  }

   /**
   * paypal_subscription_id
   * @return paypalSubscriptionId
  **/
  public String getPaypalSubscriptionId() {
    return paypalSubscriptionId;
  }

  public void setPaypalSubscriptionId(String paypalSubscriptionId) {
    this.paypalSubscriptionId = paypalSubscriptionId;
  }

  public PaymentSubscriptionsProductModel billingCycles(PaymentSubscriptionsProductModelBillingCycles billingCycles) {
    this.billingCycles = billingCycles;
    return this;
  }

   /**
   * Get billingCycles
   * @return billingCycles
  **/
  public PaymentSubscriptionsProductModelBillingCycles getBillingCycles() {
    return billingCycles;
  }

  public void setBillingCycles(PaymentSubscriptionsProductModelBillingCycles billingCycles) {
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
    PaymentSubscriptionsProductModel paymentSubscriptionsProductModel = (PaymentSubscriptionsProductModel) o;
    return Objects.equals(this.created, paymentSubscriptionsProductModel.created) &&
        Objects.equals(this.updated, paymentSubscriptionsProductModel.updated) &&
        Objects.equals(this.smartTransaction, paymentSubscriptionsProductModel.smartTransaction) &&
        Objects.equals(this.merchant, paymentSubscriptionsProductModel.merchant) &&
        Objects.equals(this.contract, paymentSubscriptionsProductModel.contract) &&
        Objects.equals(this.customer, paymentSubscriptionsProductModel.customer) &&
        Objects.equals(this.container, paymentSubscriptionsProductModel.container) &&
        Objects.equals(this.plan, paymentSubscriptionsProductModel.plan) &&
        Objects.equals(this.startAt, paymentSubscriptionsProductModel.startAt) &&
        Objects.equals(this.status, paymentSubscriptionsProductModel.status) &&
        Objects.equals(this.paypalSubscriptionId, paymentSubscriptionsProductModel.paypalSubscriptionId) &&
        Objects.equals(this.billingCycles, paymentSubscriptionsProductModel.billingCycles) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, updated, smartTransaction, merchant, contract, customer, container, plan, startAt, status, paypalSubscriptionId, billingCycles, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSubscriptionsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    smartTransaction: ").append(toIndentedString(smartTransaction)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    plan: ").append(toIndentedString(plan)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    paypalSubscriptionId: ").append(toIndentedString(paypalSubscriptionId)).append("\n");
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

