package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * Create card input
 */
public class PaymentContractsDTORequestIdAdditionalDataCreateCard {
  /**
   * Credit card schema
   */
  @JsonAdapter(CardSchemeEnum.Adapter.class)
  public enum CardSchemeEnum {
    @SerializedName("VI")
    VI("VI"),
    @SerializedName("MC")
    MC("MC");

    private String value;

    CardSchemeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static CardSchemeEnum fromValue(String input) {
      for (CardSchemeEnum b : CardSchemeEnum.values()) {
        if (b.value.equals(input)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<CardSchemeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final CardSchemeEnum enumeration) throws IOException {
        jsonWriter.value(String.valueOf(enumeration.getValue()));
      }

      @Override
      public CardSchemeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return CardSchemeEnum.fromValue((String)(value));
      }
    }
  }  @SerializedName("card_scheme")
  protected CardSchemeEnum cardScheme = null;

  @SerializedName("app_language")
  protected String appLanguage = null;

  @SerializedName("passport_id")
  protected String passportId = null;

  public PaymentContractsDTORequestIdAdditionalDataCreateCard cardScheme(CardSchemeEnum cardScheme) {
    this.cardScheme = cardScheme;
    return this;
  }

   /**
   * Credit card schema
   * @return cardScheme
  **/
  public CardSchemeEnum getCardScheme() {
    return cardScheme;
  }

  public void setCardScheme(CardSchemeEnum cardScheme) {
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

