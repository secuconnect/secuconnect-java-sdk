package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.BankAccountDescriptor;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.CheckoutConfiguration;
import com.secuconnect.client.model.GeneralMerchantsProductModel;
import com.secuconnect.client.model.ParentModel;
import com.secuconnect.client.model.PaymentLinkOptions;
import com.secuconnect.client.model.ThirdPartyEnvironment;
import java.util.Objects;

/**
 * GeneralContractsProductModel
 */
public class GeneralContractsProductModel extends BaseProductModel {
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

  @SerializedName("description")
  protected String description = null;

  @SerializedName("id_old")
  protected Integer idOld = null;

  @SerializedName("parent")
  protected ParentModel parent = null;

  @SerializedName("merchant")
  protected GeneralMerchantsProductModel merchant = null;

  @SerializedName("pay_in_advance_account")
  protected BankAccountDescriptor payInAdvanceAccount = null;

  @SerializedName("paypal_configuration")
  protected ThirdPartyEnvironment paypalConfiguration = null;

  @SerializedName("easycredit_configuration")
  protected ThirdPartyEnvironment easycreditConfiguration = null;

  @SerializedName("checkout_configuration")
  protected CheckoutConfiguration checkoutConfiguration = null;

  @SerializedName("payment_link_options")
  protected PaymentLinkOptions paymentLinkOptions = null;

  @SerializedName("approved")
  protected Boolean approved = null;

  public GeneralContractsProductModel l(Integer l) {
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

  public GeneralContractsProductModel k(Integer k) {
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

  public GeneralContractsProductModel ks(String ks) {
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

  public GeneralContractsProductModel c(Integer c) {
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

  public GeneralContractsProductModel s(Integer s) {
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

  public GeneralContractsProductModel t(AggregationTimeResult t) {
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

  public GeneralContractsProductModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Get description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

   /**
   * ID in secupay Frontend
   * @return idOld
  **/
  public Integer getIdOld() {
    return idOld;
  }

  public GeneralContractsProductModel parent(ParentModel parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  public ParentModel getParent() {
    return parent;
  }

  public void setParent(ParentModel parent) {
    this.parent = parent;
  }

  public GeneralContractsProductModel merchant(GeneralMerchantsProductModel merchant) {
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

  public GeneralContractsProductModel payInAdvanceAccount(BankAccountDescriptor payInAdvanceAccount) {
    this.payInAdvanceAccount = payInAdvanceAccount;
    return this;
  }

   /**
   * Get payInAdvanceAccount
   * @return payInAdvanceAccount
  **/
  public BankAccountDescriptor getPayInAdvanceAccount() {
    return payInAdvanceAccount;
  }

  public void setPayInAdvanceAccount(BankAccountDescriptor payInAdvanceAccount) {
    this.payInAdvanceAccount = payInAdvanceAccount;
  }

  public GeneralContractsProductModel paypalConfiguration(ThirdPartyEnvironment paypalConfiguration) {
    this.paypalConfiguration = paypalConfiguration;
    return this;
  }

   /**
   * Get paypalConfiguration
   * @return paypalConfiguration
  **/
  public ThirdPartyEnvironment getPaypalConfiguration() {
    return paypalConfiguration;
  }

  public void setPaypalConfiguration(ThirdPartyEnvironment paypalConfiguration) {
    this.paypalConfiguration = paypalConfiguration;
  }

  public GeneralContractsProductModel easycreditConfiguration(ThirdPartyEnvironment easycreditConfiguration) {
    this.easycreditConfiguration = easycreditConfiguration;
    return this;
  }

   /**
   * Get easycreditConfiguration
   * @return easycreditConfiguration
  **/
  public ThirdPartyEnvironment getEasycreditConfiguration() {
    return easycreditConfiguration;
  }

  public void setEasycreditConfiguration(ThirdPartyEnvironment easycreditConfiguration) {
    this.easycreditConfiguration = easycreditConfiguration;
  }

  public GeneralContractsProductModel checkoutConfiguration(CheckoutConfiguration checkoutConfiguration) {
    this.checkoutConfiguration = checkoutConfiguration;
    return this;
  }

   /**
   * Get checkoutConfiguration
   * @return checkoutConfiguration
  **/
  public CheckoutConfiguration getCheckoutConfiguration() {
    return checkoutConfiguration;
  }

  public void setCheckoutConfiguration(CheckoutConfiguration checkoutConfiguration) {
    this.checkoutConfiguration = checkoutConfiguration;
  }

  public GeneralContractsProductModel paymentLinkOptions(PaymentLinkOptions paymentLinkOptions) {
    this.paymentLinkOptions = paymentLinkOptions;
    return this;
  }

   /**
   * Get paymentLinkOptions
   * @return paymentLinkOptions
  **/
  public PaymentLinkOptions getPaymentLinkOptions() {
    return paymentLinkOptions;
  }

  public void setPaymentLinkOptions(PaymentLinkOptions paymentLinkOptions) {
    this.paymentLinkOptions = paymentLinkOptions;
  }

  public GeneralContractsProductModel approved(Boolean approved) {
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
    GeneralContractsProductModel generalContractsProductModel = (GeneralContractsProductModel) o;
    return Objects.equals(this.l, generalContractsProductModel.l) &&
        Objects.equals(this.k, generalContractsProductModel.k) &&
        Objects.equals(this.ks, generalContractsProductModel.ks) &&
        Objects.equals(this.c, generalContractsProductModel.c) &&
        Objects.equals(this.s, generalContractsProductModel.s) &&
        Objects.equals(this.t, generalContractsProductModel.t) &&
        Objects.equals(this.description, generalContractsProductModel.description) &&
        Objects.equals(this.idOld, generalContractsProductModel.idOld) &&
        Objects.equals(this.parent, generalContractsProductModel.parent) &&
        Objects.equals(this.merchant, generalContractsProductModel.merchant) &&
        Objects.equals(this.payInAdvanceAccount, generalContractsProductModel.payInAdvanceAccount) &&
        Objects.equals(this.paypalConfiguration, generalContractsProductModel.paypalConfiguration) &&
        Objects.equals(this.easycreditConfiguration, generalContractsProductModel.easycreditConfiguration) &&
        Objects.equals(this.checkoutConfiguration, generalContractsProductModel.checkoutConfiguration) &&
        Objects.equals(this.paymentLinkOptions, generalContractsProductModel.paymentLinkOptions) &&
        Objects.equals(this.approved, generalContractsProductModel.approved) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, description, idOld, parent, merchant, payInAdvanceAccount, paypalConfiguration, easycreditConfiguration, checkoutConfiguration, paymentLinkOptions, approved, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralContractsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    l: ").append(toIndentedString(l)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    ks: ").append(toIndentedString(ks)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    idOld: ").append(toIndentedString(idOld)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    payInAdvanceAccount: ").append(toIndentedString(payInAdvanceAccount)).append("\n");
    sb.append("    paypalConfiguration: ").append(toIndentedString(paypalConfiguration)).append("\n");
    sb.append("    easycreditConfiguration: ").append(toIndentedString(easycreditConfiguration)).append("\n");
    sb.append("    checkoutConfiguration: ").append(toIndentedString(checkoutConfiguration)).append("\n");
    sb.append("    paymentLinkOptions: ").append(toIndentedString(paymentLinkOptions)).append("\n");
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

