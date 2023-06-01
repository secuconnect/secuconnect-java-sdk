package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.CreatedField;
import com.secuconnect.client.model.PaymentInformation;
import com.secuconnect.client.model.ProductInstanceUID;
import com.secuconnect.client.model.UpdatedField;
import java.util.Objects;

/**
 * PaymentContractsProductModel
 */
public class PaymentContractsProductModel extends BaseProductModel {
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

  @SerializedName("parent")
  protected ProductInstanceUID parent = null;

  @SerializedName("pay_in_account")
  protected PaymentInformation payInAccount = null;

  @SerializedName("demo")
  protected Boolean demo = null;

  @SerializedName("approved")
  protected Boolean approved = null;

  public PaymentContractsProductModel l(Integer l) {
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

  public PaymentContractsProductModel k(Integer k) {
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

  public PaymentContractsProductModel ks(String ks) {
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

  public PaymentContractsProductModel c(Integer c) {
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

  public PaymentContractsProductModel s(Integer s) {
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

  public PaymentContractsProductModel t(AggregationTimeResult t) {
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

  public PaymentContractsProductModel created(String created) {
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

  public PaymentContractsProductModel updated(String updated) {
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

  public PaymentContractsProductModel parent(ProductInstanceUID parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  public ProductInstanceUID getParent() {
    return parent;
  }

  public void setParent(ProductInstanceUID parent) {
    this.parent = parent;
  }

  public PaymentContractsProductModel payInAccount(PaymentInformation payInAccount) {
    this.payInAccount = payInAccount;
    return this;
  }

   /**
   * Get payInAccount
   * @return payInAccount
  **/
  public PaymentInformation getPayInAccount() {
    return payInAccount;
  }

  public void setPayInAccount(PaymentInformation payInAccount) {
    this.payInAccount = payInAccount;
  }

  public PaymentContractsProductModel demo(Boolean demo) {
    this.demo = demo;
    return this;
  }

   /**
   * Is this a demo contract
   * @return demo
  **/
  public Boolean getDemo() {
    return demo;
  }

  public void setDemo(Boolean demo) {
    this.demo = demo;
  }

  public PaymentContractsProductModel approved(Boolean approved) {
    this.approved = approved;
    return this;
  }

   /**
   * Indicates if the payout lock was removed
   * @return approved
  **/
  public Boolean getApproved() {
    return approved;
  }

  public void setApproved(Boolean approved) {
    this.approved = approved;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContractsProductModel paymentContractsProductModel = (PaymentContractsProductModel) o;
    return Objects.equals(this.l, paymentContractsProductModel.l) &&
        Objects.equals(this.k, paymentContractsProductModel.k) &&
        Objects.equals(this.ks, paymentContractsProductModel.ks) &&
        Objects.equals(this.c, paymentContractsProductModel.c) &&
        Objects.equals(this.s, paymentContractsProductModel.s) &&
        Objects.equals(this.t, paymentContractsProductModel.t) &&
        Objects.equals(this.created, paymentContractsProductModel.created) &&
        Objects.equals(this.updated, paymentContractsProductModel.updated) &&
        Objects.equals(this.parent, paymentContractsProductModel.parent) &&
        Objects.equals(this.payInAccount, paymentContractsProductModel.payInAccount) &&
        Objects.equals(this.demo, paymentContractsProductModel.demo) &&
        Objects.equals(this.approved, paymentContractsProductModel.approved) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, created, updated, parent, payInAccount, demo, approved, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContractsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    l: ").append(toIndentedString(l)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    ks: ").append(toIndentedString(ks)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    payInAccount: ").append(toIndentedString(payInAccount)).append("\n");
    sb.append("    demo: ").append(toIndentedString(demo)).append("\n");
    sb.append("    approved: ").append(toIndentedString(approved)).append("\n");
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

