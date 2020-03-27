package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.BaseProductModel;
import io.secuconnect.client.model.Contact;
import io.secuconnect.client.model.LoyaltyCustomersPaymentContainerModel;
import io.secuconnect.client.model.ProductInstanceUID;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * LoyaltyCustomersProductModel
 */
public class LoyaltyCustomersProductModel extends BaseProductModel {
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

  @SerializedName("created")
  private String created = null;

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

  public LoyaltyCustomersProductModel created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Creation date
   * @return created
  **/
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
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
    return Objects.equals(this.merchant, loyaltyCustomersProductModel.merchant) &&
        Objects.equals(this.contact, loyaltyCustomersProductModel.contact) &&
        Objects.equals(this.merchantContact, loyaltyCustomersProductModel.merchantContact) &&
        Objects.equals(this.accountContact, loyaltyCustomersProductModel.accountContact) &&
        Objects.equals(this.paymentContainer, loyaltyCustomersProductModel.paymentContainer) &&
        Objects.equals(this.customernumber, loyaltyCustomersProductModel.customernumber) &&
        Objects.equals(this.note, loyaltyCustomersProductModel.note) &&
        Objects.equals(this.created, loyaltyCustomersProductModel.created) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchant, contact, merchantContact, accountContact, paymentContainer, customernumber, note, created, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyCustomersProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    merchantContact: ").append(toIndentedString(merchantContact)).append("\n");
    sb.append("    accountContact: ").append(toIndentedString(accountContact)).append("\n");
    sb.append("    paymentContainer: ").append(toIndentedString(paymentContainer)).append("\n");
    sb.append("    customernumber: ").append(toIndentedString(customernumber)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

