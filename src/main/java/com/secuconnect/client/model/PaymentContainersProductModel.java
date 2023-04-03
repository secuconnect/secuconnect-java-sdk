package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.CreatedField;
import com.secuconnect.client.model.GeneralMerchantsProductModel;
import com.secuconnect.client.model.OneOfPaymentContainersDTOModelPrivate;
import com.secuconnect.client.model.PaymentContainerMandate;
import com.secuconnect.client.model.PaymentContractsProductModel;
import com.secuconnect.client.model.PaymentCustomersProductModel;
import com.secuconnect.client.model.UpdatedField;
import java.util.Objects;

/**
 * PaymentContainersProductModel
 */
public class PaymentContainersProductModel extends BaseProductModel {
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

  @SerializedName("merchant")
  private GeneralMerchantsProductModel merchant = null;

  @SerializedName("contract")
  private PaymentContractsProductModel contract = null;

  @SerializedName("customer")
  private PaymentCustomersProductModel customer = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("public")
  private OneOfPaymentContainersDTOModelPrivate _public = null;

  @SerializedName("private")
  private OneOfPaymentContainersDTOModelPrivate _private = null;

  @SerializedName("mandate")
  private PaymentContainerMandate mandate = null;

  public PaymentContainersProductModel l(Integer l) {
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

  public PaymentContainersProductModel k(Integer k) {
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

  public PaymentContainersProductModel ks(String ks) {
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

  public PaymentContainersProductModel c(Integer c) {
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

  public PaymentContainersProductModel s(Integer s) {
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

  public PaymentContainersProductModel t(AggregationTimeResult t) {
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

  public PaymentContainersProductModel created(String created) {
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

  public PaymentContainersProductModel updated(String updated) {
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

  public PaymentContainersProductModel merchant(GeneralMerchantsProductModel merchant) {
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

  public PaymentContainersProductModel contract(PaymentContractsProductModel contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  public PaymentContractsProductModel getContract() {
    return contract;
  }

  public void setContract(PaymentContractsProductModel contract) {
    this.contract = contract;
  }

  public PaymentContainersProductModel customer(PaymentCustomersProductModel customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  public PaymentCustomersProductModel getCustomer() {
    return customer;
  }

  public void setCustomer(PaymentCustomersProductModel customer) {
    this.customer = customer;
  }

  public PaymentContainersProductModel type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of payment container
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PaymentContainersProductModel _public(OneOfPaymentContainersDTOModelPrivate _public) {
    this._public = _public;
    return this;
  }

   /**
   * Get _public
   * @return _public
  **/
  public OneOfPaymentContainersDTOModelPrivate getPublic() {
    return _public;
  }

  public void setPublic(OneOfPaymentContainersDTOModelPrivate _public) {
    this._public = _public;
  }

  public PaymentContainersProductModel _private(OneOfPaymentContainersDTOModelPrivate _private) {
    this._private = _private;
    return this;
  }

   /**
   * Get _private
   * @return _private
  **/
  public OneOfPaymentContainersDTOModelPrivate getPrivate() {
    return _private;
  }

  public void setPrivate(OneOfPaymentContainersDTOModelPrivate _private) {
    this._private = _private;
  }

  public PaymentContainersProductModel mandate(PaymentContainerMandate mandate) {
    this.mandate = mandate;
    return this;
  }

   /**
   * Get mandate
   * @return mandate
  **/
  public PaymentContainerMandate getMandate() {
    return mandate;
  }

  public void setMandate(PaymentContainerMandate mandate) {
    this.mandate = mandate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContainersProductModel paymentContainersProductModel = (PaymentContainersProductModel) o;
    return Objects.equals(this.l, paymentContainersProductModel.l) &&
        Objects.equals(this.k, paymentContainersProductModel.k) &&
        Objects.equals(this.ks, paymentContainersProductModel.ks) &&
        Objects.equals(this.c, paymentContainersProductModel.c) &&
        Objects.equals(this.s, paymentContainersProductModel.s) &&
        Objects.equals(this.t, paymentContainersProductModel.t) &&
        Objects.equals(this.created, paymentContainersProductModel.created) &&
        Objects.equals(this.updated, paymentContainersProductModel.updated) &&
        Objects.equals(this.merchant, paymentContainersProductModel.merchant) &&
        Objects.equals(this.contract, paymentContainersProductModel.contract) &&
        Objects.equals(this.customer, paymentContainersProductModel.customer) &&
        Objects.equals(this.type, paymentContainersProductModel.type) &&
        Objects.equals(this._public, paymentContainersProductModel._public) &&
        Objects.equals(this._private, paymentContainersProductModel._private) &&
        Objects.equals(this.mandate, paymentContainersProductModel.mandate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, created, updated, merchant, contract, customer, type, _public, _private, mandate, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContainersProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    l: ").append(toIndentedString(l)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    ks: ").append(toIndentedString(ks)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    mandate: ").append(toIndentedString(mandate)).append("\n");
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

