package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.BillingCyclesItem;
import com.secuconnect.client.model.CreatedField;
import com.secuconnect.client.model.GeneralMerchantsProductModel;
import com.secuconnect.client.model.UpdatedField;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * PaymentPlansProductModel
 */
public class PaymentPlansProductModel extends BaseProductModel {
  @SerializedName("l")
  private Integer l = null;

  @SerializedName("k")
  private Integer k = null;

  @SerializedName("ks")
  private String ks = null;

  @SerializedName("c")
  private Integer c = null;

  @SerializedName("s")
  private Integer s = null;

  @SerializedName("t")
  private AggregationTimeResult t = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("updated")
  private String updated = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("paypal_plan_id")
  private String paypalPlanId = null;

  @SerializedName("status")
  private String status = "active";

  @SerializedName("payment_methods")
  private List<String> paymentMethods = null;

  @SerializedName("merchant")
  private GeneralMerchantsProductModel merchant = null;

  @SerializedName("billing_cycles")
  private List<BillingCyclesItem> billingCycles = null;

  @SerializedName("product_type")
  private String productType = null;

  public PaymentPlansProductModel l(Integer l) {
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

  public PaymentPlansProductModel k(Integer k) {
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

  public PaymentPlansProductModel ks(String ks) {
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

  public PaymentPlansProductModel c(Integer c) {
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

  public PaymentPlansProductModel s(Integer s) {
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

  public PaymentPlansProductModel t(AggregationTimeResult t) {
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

  public PaymentPlansProductModel created(String created) {
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

  public PaymentPlansProductModel updated(String updated) {
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

  public PaymentPlansProductModel description(String description) {
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

  public PaymentPlansProductModel currency(String currency) {
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

  public PaymentPlansProductModel paypalPlanId(String paypalPlanId) {
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

  public PaymentPlansProductModel status(String status) {
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

  public PaymentPlansProductModel paymentMethods(List<String> paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

  public PaymentPlansProductModel addPaymentMethodsItem(String paymentMethodsItem) {
    if (this.paymentMethods == null) {
      this.paymentMethods = new ArrayList<String>();
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

  public PaymentPlansProductModel merchant(GeneralMerchantsProductModel merchant) {
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

  public PaymentPlansProductModel billingCycles(List<BillingCyclesItem> billingCycles) {
    this.billingCycles = billingCycles;
    return this;
  }

  public PaymentPlansProductModel addBillingCyclesItem(BillingCyclesItem billingCyclesItem) {
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

  public PaymentPlansProductModel productType(String productType) {
    this.productType = productType;
    return this;
  }

   /**
   * Product type
   * @return productType
  **/
  public String getProductType() {
    return productType;
  }

  public void setProductType(String productType) {
    this.productType = productType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentPlansProductModel paymentPlansProductModel = (PaymentPlansProductModel) o;
    return Objects.equals(this.l, paymentPlansProductModel.l) &&
        Objects.equals(this.k, paymentPlansProductModel.k) &&
        Objects.equals(this.ks, paymentPlansProductModel.ks) &&
        Objects.equals(this.c, paymentPlansProductModel.c) &&
        Objects.equals(this.s, paymentPlansProductModel.s) &&
        Objects.equals(this.t, paymentPlansProductModel.t) &&
        Objects.equals(this.created, paymentPlansProductModel.created) &&
        Objects.equals(this.updated, paymentPlansProductModel.updated) &&
        Objects.equals(this.description, paymentPlansProductModel.description) &&
        Objects.equals(this.currency, paymentPlansProductModel.currency) &&
        Objects.equals(this.paypalPlanId, paymentPlansProductModel.paypalPlanId) &&
        Objects.equals(this.status, paymentPlansProductModel.status) &&
        Objects.equals(this.paymentMethods, paymentPlansProductModel.paymentMethods) &&
        Objects.equals(this.merchant, paymentPlansProductModel.merchant) &&
        Objects.equals(this.billingCycles, paymentPlansProductModel.billingCycles) &&
        Objects.equals(this.productType, paymentPlansProductModel.productType) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, created, updated, description, currency, paypalPlanId, status, paymentMethods, merchant, billingCycles, productType, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentPlansProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    l: ").append(toIndentedString(l)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    ks: ").append(toIndentedString(ks)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    paypalPlanId: ").append(toIndentedString(paypalPlanId)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    billingCycles: ").append(toIndentedString(billingCycles)).append("\n");
    sb.append("    productType: ").append(toIndentedString(productType)).append("\n");
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

