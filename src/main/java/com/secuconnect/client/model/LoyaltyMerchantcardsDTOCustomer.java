package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.Contact;
import java.util.Objects;

/**
 * LoyaltyMerchantcardsDTOCustomer
 */
public class LoyaltyMerchantcardsDTOCustomer {
  @SerializedName("merchant_contact")
  protected Contact merchantContact = null;

  @SerializedName("customernumber")
  protected String customernumber = null;

  @SerializedName("note")
  protected String note = null;

  @SerializedName("consent_for_communication")
  protected String consentForCommunication = null;

  @SerializedName("additional_data")
  protected Object additionalData = null;

  public LoyaltyMerchantcardsDTOCustomer merchantContact(Contact merchantContact) {
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

  public LoyaltyMerchantcardsDTOCustomer customernumber(String customernumber) {
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

  public LoyaltyMerchantcardsDTOCustomer note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Note for customer
   * @return note
  **/
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  public LoyaltyMerchantcardsDTOCustomer consentForCommunication(String consentForCommunication) {
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

  public LoyaltyMerchantcardsDTOCustomer additionalData(Object additionalData) {
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
    LoyaltyMerchantcardsDTOCustomer loyaltyMerchantcardsDTOCustomer = (LoyaltyMerchantcardsDTOCustomer) o;
    return Objects.equals(this.merchantContact, loyaltyMerchantcardsDTOCustomer.merchantContact) &&
        Objects.equals(this.customernumber, loyaltyMerchantcardsDTOCustomer.customernumber) &&
        Objects.equals(this.note, loyaltyMerchantcardsDTOCustomer.note) &&
        Objects.equals(this.consentForCommunication, loyaltyMerchantcardsDTOCustomer.consentForCommunication) &&
        Objects.equals(this.additionalData, loyaltyMerchantcardsDTOCustomer.additionalData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantContact, customernumber, note, consentForCommunication, additionalData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsDTOCustomer {\n");
    sb.append("    merchantContact: ").append(toIndentedString(merchantContact)).append("\n");
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

