package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.Contact;
import io.secuconnect.client.model.LoyaltyCustomersPaymentContainerModel;
import io.secuconnect.client.model.ProductInstanceUID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import java.util.Objects;

/**
 * LoyaltyCustomersProductModel
 */
public class LoyaltyCustomersProductModel {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

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

  @SerializedName("age")
  private Integer age = null;

  @SerializedName("days_until_birthday")
  private Integer daysUntilBirthday = null;

  @SerializedName("customernumber")
  private String customernumber = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("created")
  private DateTime created = null;

  public LoyaltyCustomersProductModel object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of loyalty customer
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public LoyaltyCustomersProductModel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of loyalty customer
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LoyaltyCustomersProductModel merchant(ProductInstanceUID merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * merchant
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
   * Contact
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
   * merchant contact
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
   * merchant contact
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

  public LoyaltyCustomersProductModel age(Integer age) {
    this.age = age;
    return this;
  }

   /**
   * Age
   * @return age
  **/
  public Integer getAge() {
    return age;
  }

  public void setAge(Integer age) {
    this.age = age;
  }

  public LoyaltyCustomersProductModel daysUntilBirthday(Integer daysUntilBirthday) {
    this.daysUntilBirthday = daysUntilBirthday;
    return this;
  }

   /**
   * Number of days until birthday
   * @return daysUntilBirthday
  **/
  public Integer getDaysUntilBirthday() {
    return daysUntilBirthday;
  }

  public void setDaysUntilBirthday(Integer daysUntilBirthday) {
    this.daysUntilBirthday = daysUntilBirthday;
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

  public LoyaltyCustomersProductModel created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Creation date
   * @return created
  **/
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyCustomersProductModel loyaltyCustomersProductModel = (LoyaltyCustomersProductModel) o;
    return Objects.equals(this.object, loyaltyCustomersProductModel.object) &&
        Objects.equals(this.id, loyaltyCustomersProductModel.id) &&
        Objects.equals(this.merchant, loyaltyCustomersProductModel.merchant) &&
        Objects.equals(this.contact, loyaltyCustomersProductModel.contact) &&
        Objects.equals(this.merchantContact, loyaltyCustomersProductModel.merchantContact) &&
        Objects.equals(this.accountContact, loyaltyCustomersProductModel.accountContact) &&
        Objects.equals(this.paymentContainer, loyaltyCustomersProductModel.paymentContainer) &&
        Objects.equals(this.age, loyaltyCustomersProductModel.age) &&
        Objects.equals(this.daysUntilBirthday, loyaltyCustomersProductModel.daysUntilBirthday) &&
        Objects.equals(this.customernumber, loyaltyCustomersProductModel.customernumber) &&
        Objects.equals(this.note, loyaltyCustomersProductModel.note) &&
        Objects.equals(this.created, loyaltyCustomersProductModel.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, merchant, contact, merchantContact, accountContact, paymentContainer, age, daysUntilBirthday, customernumber, note, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyCustomersProductModel {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    merchantContact: ").append(toIndentedString(merchantContact)).append("\n");
    sb.append("    accountContact: ").append(toIndentedString(accountContact)).append("\n");
    sb.append("    paymentContainer: ").append(toIndentedString(paymentContainer)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    daysUntilBirthday: ").append(toIndentedString(daysUntilBirthday)).append("\n");
    sb.append("    customernumber: ").append(toIndentedString(customernumber)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

