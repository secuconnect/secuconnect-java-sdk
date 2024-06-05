package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Create card input
 */
public class PaymentContractsDTORequestIdAdditionalDataCreateCard {
  @SerializedName("card_scheme")
  protected String cardScheme = null;

  @SerializedName("app_language")
  protected String appLanguage = null;

  @SerializedName("passport_id")
  protected String passportId = null;

  public PaymentContractsDTORequestIdAdditionalDataCreateCard cardScheme(String cardScheme) {
    this.cardScheme = cardScheme;
    return this;
  }

   /**
   * Credit card schema
   * @return cardScheme
  **/
  public String getCardScheme() {
    return cardScheme;
  }

  public void setCardScheme(String cardScheme) {
    this.cardScheme = cardScheme;
  }

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

  public PaymentContractsDTORequestIdAdditionalDataCreateCard passportId(String passportId) {
    this.passportId = passportId;
    return this;
  }

   /**
   * Passport ID
   * @return passportId
  **/
  public String getPassportId() {
    return passportId;
  }

  public void setPassportId(String passportId) {
    this.passportId = passportId;
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
    return Objects.equals(this.cardScheme, paymentContractsDTORequestIdAdditionalDataCreateCard.cardScheme) &&
        Objects.equals(this.appLanguage, paymentContractsDTORequestIdAdditionalDataCreateCard.appLanguage) &&
        Objects.equals(this.passportId, paymentContractsDTORequestIdAdditionalDataCreateCard.passportId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(cardScheme, appLanguage, passportId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContractsDTORequestIdAdditionalDataCreateCard {\n");
    sb.append("    cardScheme: ").append(toIndentedString(cardScheme)).append("\n");
    sb.append("    appLanguage: ").append(toIndentedString(appLanguage)).append("\n");
    sb.append("    passportId: ").append(toIndentedString(passportId)).append("\n");
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

