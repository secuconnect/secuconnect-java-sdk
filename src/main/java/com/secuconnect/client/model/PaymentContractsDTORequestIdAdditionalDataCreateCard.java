package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Create card input
 */
public class PaymentContractsDTORequestIdAdditionalDataCreateCard {
  @SerializedName("app_language")
  protected String appLanguage = null;

  @SerializedName("card_type")
  protected String cardType = null;

  @SerializedName("identifier")
  protected String identifier = null;

  public PaymentContractsDTORequestIdAdditionalDataCreateCard appLanguage(String appLanguage) {
    this.appLanguage = appLanguage;
    return this;
  }

   /**
   * Get appLanguage
   * @return appLanguage
  **/
  public String getAppLanguage() {
    return appLanguage;
  }

  public void setAppLanguage(String appLanguage) {
    this.appLanguage = appLanguage;
  }

  public PaymentContractsDTORequestIdAdditionalDataCreateCard cardType(String cardType) {
    this.cardType = cardType;
    return this;
  }

   /**
   * Card Type
   * @return cardType
  **/
  public String getCardType() {
    return cardType;
  }

  public void setCardType(String cardType) {
    this.cardType = cardType;
  }

  public PaymentContractsDTORequestIdAdditionalDataCreateCard identifier(String identifier) {
    this.identifier = identifier;
    return this;
  }

   /**
   * Identifier - required if card_type is &#x27;plastic&#x27;
   * @return identifier
  **/
  public String getIdentifier() {
    return identifier;
  }

  public void setIdentifier(String identifier) {
    this.identifier = identifier;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContractsDTORequestIdAdditionalDataCreateCard paymentContractsDTORequestIdAdditionalDataCreateCard = (PaymentContractsDTORequestIdAdditionalDataCreateCard) o;
    return Objects.equals(this.appLanguage, paymentContractsDTORequestIdAdditionalDataCreateCard.appLanguage) &&
        Objects.equals(this.cardType, paymentContractsDTORequestIdAdditionalDataCreateCard.cardType) &&
        Objects.equals(this.identifier, paymentContractsDTORequestIdAdditionalDataCreateCard.identifier);
  }

  @Override
  public int hashCode() {
    return Objects.hash(appLanguage, cardType, identifier);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContractsDTORequestIdAdditionalDataCreateCard {\n");
    sb.append("    appLanguage: ").append(toIndentedString(appLanguage)).append("\n");
    sb.append("    cardType: ").append(toIndentedString(cardType)).append("\n");
    sb.append("    identifier: ").append(toIndentedString(identifier)).append("\n");
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

