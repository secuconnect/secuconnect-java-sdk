package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.CreatedField;
import com.secuconnect.client.model.PaymentSubscriptionsProductModelBillingCycles;
import com.secuconnect.client.model.UpdatedField;
import java.util.Objects;

/**
 * PaymentSubscriptionsProductModel
 */
public class PaymentSubscriptionsProductModel extends BaseProductModel {
  @SerializedName("l")
  protected Integer l = null;

  @SerializedName("k")
  protected Integer k = null;

  @SerializedName("ks")
  protected String ks = null;

  @SerializedName("c")
  protected Integer c = null;

  @SerializedName("s")
  protected Integer s = null;

  @SerializedName("t")
  protected AggregationTimeResult t = null;

  @SerializedName("created")
  protected String created = null;

  @SerializedName("updated")
  protected String updated = null;

  @SerializedName("smart_transaction")
  protected BaseProductModel smartTransaction = null;

  @SerializedName("merchant")
  protected BaseProductModel merchant = null;

  @SerializedName("contract")
  protected BaseProductModel contract = null;

  @SerializedName("customer")
  protected BaseProductModel customer = null;

  @SerializedName("container")
  protected BaseProductModel container = null;

  @SerializedName("plan")
  protected BaseProductModel plan = null;

  @SerializedName("start_at")
  protected String startAt = null;

  @SerializedName("status")
  protected String status = null;

  @SerializedName("paypal_subscription_id")
  protected String paypalSubscriptionId = null;

  @SerializedName("billing_cycles")
  protected PaymentSubscriptionsProductModelBillingCycles billingCycles = null;

  @SerializedName("demo")
  protected Boolean demo = null;

  public PaymentSubscriptionsProductModel l(Integer l) {
    this.l = l;
    return this;
  }

   /**
   * lookup index
   * @return l
  **/
  public Integer getL() {
    return l;
  }

  public void setL(Integer l) {
    this.l = l;
  }

  public PaymentSubscriptionsProductModel k(Integer k) {
    this.k = k;
    return this;
  }

   /**
   * key index
   * @return k
  **/
  public Integer getK() {
    return k;
  }

  public void setK(Integer k) {
    this.k = k;
  }

  public PaymentSubscriptionsProductModel ks(String ks) {
    this.ks = ks;
    return this;
  }

   /**
   * key name
   * @return ks
  **/
  public String getKs() {
    return ks;
  }

  public void setKs(String ks) {
    this.ks = ks;
  }

  public PaymentSubscriptionsProductModel c(Integer c) {
    this.c = c;
    return this;
  }

   /**
   * count (number of items)
   * @return c
  **/
  public Integer getC() {
    return c;
  }

  public void setC(Integer c) {
    this.c = c;
  }

  public PaymentSubscriptionsProductModel s(Integer s) {
    this.s = s;
    return this;
  }

   /**
   * sum
   * @return s
  **/
  public Integer getS() {
    return s;
  }

  public void setS(Integer s) {
    this.s = s;
  }

  public PaymentSubscriptionsProductModel t(AggregationTimeResult t) {
    this.t = t;
    return this;
  }

   /**
   * Get t
   * @return t
  **/
  public AggregationTimeResult getT() {
    return t;
  }

  public void setT(AggregationTimeResult t) {
    this.t = t;
  }

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
   * Start date (ISO 8601 date and time)
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
   * Status:  * &#x60;\&quot;active\&quot;&#x60; * &#x60;\&quot;suspended\&quot;&#x60; * &#x60;\&quot;cancelled\&quot;&#x60; * &#x60;\&quot;completed\&quot;&#x60;
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
   * PayPal Subscription ID, if paid with PayPal
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

  public PaymentSubscriptionsProductModel demo(Boolean demo) {
    this.demo = demo;
    return this;
  }

   /**
   * Demo
   * @return demo
  **/
  public Boolean getDemo() {
    return demo;
  }

  public void setDemo(Boolean demo) {
    this.demo = demo;
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
    return Objects.equals(this.l, paymentSubscriptionsProductModel.l) &&
        Objects.equals(this.k, paymentSubscriptionsProductModel.k) &&
        Objects.equals(this.ks, paymentSubscriptionsProductModel.ks) &&
        Objects.equals(this.c, paymentSubscriptionsProductModel.c) &&
        Objects.equals(this.s, paymentSubscriptionsProductModel.s) &&
        Objects.equals(this.t, paymentSubscriptionsProductModel.t) &&
        Objects.equals(this.created, paymentSubscriptionsProductModel.created) &&
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
        Objects.equals(this.demo, paymentSubscriptionsProductModel.demo) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, created, updated, smartTransaction, merchant, contract, customer, container, plan, startAt, status, paypalSubscriptionId, billingCycles, demo, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentSubscriptionsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    l: ").append(toIndentedString(l)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    ks: ").append(toIndentedString(ks)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
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
    sb.append("    demo: ").append(toIndentedString(demo)).append("\n");
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

