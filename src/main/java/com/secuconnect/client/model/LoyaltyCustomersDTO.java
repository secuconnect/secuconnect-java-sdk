package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.Contact;
import java.util.Objects;

/**
 * Loyalty Customer
 */
public class LoyaltyCustomersDTO {
  @SerializedName("merchant")
  protected String merchant = null;

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

  @SerializedName("anonymize")
  protected Boolean anonymize = null;

  public LoyaltyCustomersDTO merchant(String merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Merchant ID
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

  public LoyaltyCustomersDTO customernumber(String customernumber) {
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

  public LoyaltyCustomersDTO note(String note) {
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

  public LoyaltyCustomersDTO consentForCommunication(String consentForCommunication) {
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

  public LoyaltyCustomersDTO additionalData(Object additionalData) {
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

  public LoyaltyCustomersDTO anonymize(Boolean anonymize) {
    this.anonymize = anonymize;
    return this;
  }

   /**
   * Anonymize customer data (only valid on update requests)
   * @return anonymize
  **/
  public Boolean getAnonymize() {
    return anonymize;
  }

  public void setAnonymize(Boolean anonymize) {
    this.anonymize = anonymize;
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
        Objects.equals(this.customernumber, loyaltyCustomersDTO.customernumber) &&
        Objects.equals(this.note, loyaltyCustomersDTO.note) &&
        Objects.equals(this.consentForCommunication, loyaltyCustomersDTO.consentForCommunication) &&
        Objects.equals(this.additionalData, loyaltyCustomersDTO.additionalData) &&
        Objects.equals(this.anonymize, loyaltyCustomersDTO.anonymize);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchant, merchantContact, customernumber, note, consentForCommunication, additionalData, anonymize);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyCustomersDTO {\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    merchantContact: ").append(toIndentedString(merchantContact)).append("\n");
    sb.append("    customernumber: ").append(toIndentedString(customernumber)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    consentForCommunication: ").append(toIndentedString(consentForCommunication)).append("\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    anonymize: ").append(toIndentedString(anonymize)).append("\n");
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

