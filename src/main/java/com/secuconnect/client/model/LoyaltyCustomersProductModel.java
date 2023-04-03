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
 * LoyaltyCustomersProductModel
 */
public class LoyaltyCustomersProductModel extends BaseProductModel {
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

  @SerializedName("merchant")
  private ProductInstanceUID merchant = null;

  @SerializedName("contact")
  private Contact contact = null;

  @SerializedName("merchant_contact")
  private Contact merchantContact = null;

  @SerializedName("account_contact")
  private Contact accountContact = null;

  @SerializedName("payment_container")
  private List<LoyaltyCustomersPaymentContainerModel> paymentContainer = null;

  @SerializedName("customernumber")
  private String customernumber = null;

  @SerializedName("note")
  private String note = null;

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
   * payment container
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
   * Customer number
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
   * Customer number
   * @return note
  **/
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
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
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, created, merchant, contact, merchantContact, accountContact, paymentContainer, customernumber, note, super.hashCode());
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

