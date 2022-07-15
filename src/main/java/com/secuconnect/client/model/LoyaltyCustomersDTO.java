package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.Contact;
import java.util.Objects;

/**
 * LoyaltyCustomersDTO
 */
public class LoyaltyCustomersDTO {
  @SerializedName("merchant")
  private String merchant = null;

  @SerializedName("merchant_contact")
  private Contact merchantContact = null;

  @SerializedName("age")
  private Integer age = null;

  @SerializedName("days_until_birthday")
  private Integer daysUntilBirthday = null;

  @SerializedName("customernumber")
  private String customernumber = null;

  @SerializedName("note")
  private String note = null;

  @SerializedName("consent_for_communication")
  private String consentForCommunication = null;

  @SerializedName("additional_data")
  private Object additionalData = null;

  public LoyaltyCustomersDTO merchant(String merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * merchant
   * @return merchant
  **/
  public String getMerchant() {
    return merchant;
  }

  public void setMerchant(String merchant) {
    this.merchant = merchant;
  }

  public LoyaltyCustomersDTO merchantContact(Contact merchantContact) {
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

  public LoyaltyCustomersDTO age(Integer age) {
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

  public LoyaltyCustomersDTO daysUntilBirthday(Integer daysUntilBirthday) {
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

  public LoyaltyCustomersDTO customernumber(String customernumber) {
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

  public LoyaltyCustomersDTO note(String note) {
    this.note = note;
    return this;
  }

   /**
   * note
   * @return note
  **/
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public LoyaltyCustomersDTO consentForCommunication(String consentForCommunication) {
    this.consentForCommunication = consentForCommunication;
    return this;
  }

   /**
   * Consent for communication setting
   * @return consentForCommunication
  **/
  public String getConsentForCommunication() {
    return consentForCommunication;
  }

  public void setConsentForCommunication(String consentForCommunication) {
    this.consentForCommunication = consentForCommunication;
  }

  public LoyaltyCustomersDTO additionalData(Object additionalData) {
    this.additionalData = additionalData;
    return this;
  }

   /**
   * additional data properties
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
    LoyaltyCustomersDTO loyaltyCustomersDTO = (LoyaltyCustomersDTO) o;
    return Objects.equals(this.merchant, loyaltyCustomersDTO.merchant) &&
        Objects.equals(this.merchantContact, loyaltyCustomersDTO.merchantContact) &&
        Objects.equals(this.age, loyaltyCustomersDTO.age) &&
        Objects.equals(this.daysUntilBirthday, loyaltyCustomersDTO.daysUntilBirthday) &&
        Objects.equals(this.customernumber, loyaltyCustomersDTO.customernumber) &&
        Objects.equals(this.note, loyaltyCustomersDTO.note) &&
        Objects.equals(this.consentForCommunication, loyaltyCustomersDTO.consentForCommunication) &&
        Objects.equals(this.additionalData, loyaltyCustomersDTO.additionalData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchant, merchantContact, age, daysUntilBirthday, customernumber, note, consentForCommunication, additionalData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyCustomersDTO {\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    merchantContact: ").append(toIndentedString(merchantContact)).append("\n");
    sb.append("    age: ").append(toIndentedString(age)).append("\n");
    sb.append("    daysUntilBirthday: ").append(toIndentedString(daysUntilBirthday)).append("\n");
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

