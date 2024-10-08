package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.Contact;
import com.secuconnect.client.model.CreatedField;
import com.secuconnect.client.model.LoyaltyCustomersPaymentContainerModel;
import com.secuconnect.client.model.ProductInstanceUID;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Loyalty Customer
 */
public class LoyaltyCustomersProductModel extends BaseProductModel {
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

  @SerializedName("merchant")
  protected ProductInstanceUID merchant = null;

  @SerializedName("contact")
  protected Contact contact = null;

  @SerializedName("merchant_contact")
  protected Contact merchantContact = null;

  @SerializedName("account_contact")
  protected Contact accountContact = null;

  @SerializedName("payment_container")
  protected List<LoyaltyCustomersPaymentContainerModel> paymentContainer = null;

  @SerializedName("customernumber")
  protected String customernumber = null;

  @SerializedName("note")
  protected String note = null;

  @SerializedName("consent_for_communication")
  protected String consentForCommunication = null;

  @SerializedName("additional_data")
  protected Object additionalData = null;

  public LoyaltyCustomersProductModel l(Integer l) {
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

  public LoyaltyCustomersProductModel k(Integer k) {
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

  public LoyaltyCustomersProductModel ks(String ks) {
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

  public LoyaltyCustomersProductModel c(Integer c) {
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

  public LoyaltyCustomersProductModel s(Integer s) {
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

  public LoyaltyCustomersProductModel t(AggregationTimeResult t) {
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

  public LoyaltyCustomersProductModel created(String created) {
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

  public LoyaltyCustomersProductModel merchant(ProductInstanceUID merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  public ProductInstanceUID getMerchant() {
    return merchant;
  }

  public void setMerchant(ProductInstanceUID merchant) {
    this.merchant = merchant;
  }

  public LoyaltyCustomersProductModel contact(Contact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public LoyaltyCustomersProductModel merchantContact(Contact merchantContact) {
    this.merchantContact = merchantContact;
    return this;
  }

   /**
   * Get merchantContact
   * @return merchantContact
  **/
  public Contact getMerchantContact() {
    return merchantContact;
  }

  public void setMerchantContact(Contact merchantContact) {
    this.merchantContact = merchantContact;
  }

  public LoyaltyCustomersProductModel accountContact(Contact accountContact) {
    this.accountContact = accountContact;
    return this;
  }

   /**
   * Get accountContact
   * @return accountContact
  **/
  public Contact getAccountContact() {
    return accountContact;
  }

  public void setAccountContact(Contact accountContact) {
    this.accountContact = accountContact;
  }

  public LoyaltyCustomersProductModel paymentContainer(List<LoyaltyCustomersPaymentContainerModel> paymentContainer) {
    this.paymentContainer = paymentContainer;
    return this;
  }

  public LoyaltyCustomersProductModel addPaymentContainerItem(LoyaltyCustomersPaymentContainerModel paymentContainerItem) {
    if (this.paymentContainer == null) {
      this.paymentContainer = new ArrayList<LoyaltyCustomersPaymentContainerModel>();
    }
    this.paymentContainer.add(paymentContainerItem);
    return this;
  }

   /**
   * Loyalty Payment Container
   * @return paymentContainer
  **/
  public List<LoyaltyCustomersPaymentContainerModel> getPaymentContainer() {
    return paymentContainer;
  }

  public void setPaymentContainer(List<LoyaltyCustomersPaymentContainerModel> paymentContainer) {
    this.paymentContainer = paymentContainer;
  }

  public LoyaltyCustomersProductModel customernumber(String customernumber) {
    this.customernumber = customernumber;
    return this;
  }

   /**
   * Customer number in the merchant&#x27;s system
   * @return customernumber
  **/
  public String getCustomernumber() {
    return customernumber;
  }

  public void setCustomernumber(String customernumber) {
    this.customernumber = customernumber;
  }

  public LoyaltyCustomersProductModel note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Note from the merchant
   * @return note
  **/
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public LoyaltyCustomersProductModel consentForCommunication(String consentForCommunication) {
    this.consentForCommunication = consentForCommunication;
    return this;
  }

   /**
   * Whether the customer has given consent for communication or not:  * &#x60;\&quot;accepted\&quot;&#x60; * &#x60;\&quot;declined\&quot;&#x60; * &#x60;\&quot;not_set\&quot;&#x60;
   * @return consentForCommunication
  **/
  public String getConsentForCommunication() {
    return consentForCommunication;
  }

  public void setConsentForCommunication(String consentForCommunication) {
    this.consentForCommunication = consentForCommunication;
  }

  public LoyaltyCustomersProductModel additionalData(Object additionalData) {
    this.additionalData = additionalData;
    return this;
  }

   /**
   * Additional data properties
   * @return additionalData
  **/
  public Object getAdditionalData() {
    return additionalData;
  }

  public void setAdditionalData(Object additionalData) {
    this.additionalData = additionalData;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyCustomersProductModel loyaltyCustomersProductModel = (LoyaltyCustomersProductModel) o;
    return Objects.equals(this.l, loyaltyCustomersProductModel.l) &&
        Objects.equals(this.k, loyaltyCustomersProductModel.k) &&
        Objects.equals(this.ks, loyaltyCustomersProductModel.ks) &&
        Objects.equals(this.c, loyaltyCustomersProductModel.c) &&
        Objects.equals(this.s, loyaltyCustomersProductModel.s) &&
        Objects.equals(this.t, loyaltyCustomersProductModel.t) &&
        Objects.equals(this.created, loyaltyCustomersProductModel.created) &&
        Objects.equals(this.merchant, loyaltyCustomersProductModel.merchant) &&
        Objects.equals(this.contact, loyaltyCustomersProductModel.contact) &&
        Objects.equals(this.merchantContact, loyaltyCustomersProductModel.merchantContact) &&
        Objects.equals(this.accountContact, loyaltyCustomersProductModel.accountContact) &&
        Objects.equals(this.paymentContainer, loyaltyCustomersProductModel.paymentContainer) &&
        Objects.equals(this.customernumber, loyaltyCustomersProductModel.customernumber) &&
        Objects.equals(this.note, loyaltyCustomersProductModel.note) &&
        Objects.equals(this.consentForCommunication, loyaltyCustomersProductModel.consentForCommunication) &&
        Objects.equals(this.additionalData, loyaltyCustomersProductModel.additionalData) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, created, merchant, contact, merchantContact, accountContact, paymentContainer, customernumber, note, consentForCommunication, additionalData, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyCustomersProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    l: ").append(toIndentedString(l)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    ks: ").append(toIndentedString(ks)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    merchantContact: ").append(toIndentedString(merchantContact)).append("\n");
    sb.append("    accountContact: ").append(toIndentedString(accountContact)).append("\n");
    sb.append("    paymentContainer: ").append(toIndentedString(paymentContainer)).append("\n");
    sb.append("    customernumber: ").append(toIndentedString(customernumber)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    consentForCommunication: ").append(toIndentedString(consentForCommunication)).append("\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
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

