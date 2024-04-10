package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.PaymentInformation;
import java.util.Objects;

/**
 * LoyaltyMerchantcardsDTOPaymentContainer
 */
public class LoyaltyMerchantcardsDTOPaymentContainer {
  @SerializedName("object")
  protected String object = null;

  @SerializedName("id")
  protected String id = null;

  @SerializedName("type")
  protected String type = null;

  @SerializedName("payment_information")
  protected PaymentInformation paymentInformation = null;

  public LoyaltyMerchantcardsDTOPaymentContainer object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type, always &#x60;loyalty.paymentcontainers&#x60;
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public LoyaltyMerchantcardsDTOPaymentContainer id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Loyalty Payment Container ID
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LoyaltyMerchantcardsDTOPaymentContainer type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Payment container type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public LoyaltyMerchantcardsDTOPaymentContainer paymentInformation(PaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
    return this;
  }

   /**
   * Get paymentInformation
   * @return paymentInformation
  **/
  public PaymentInformation getPaymentInformation() {
    return paymentInformation;
  }

  public void setPaymentInformation(PaymentInformation paymentInformation) {
    this.paymentInformation = paymentInformation;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyMerchantcardsDTOPaymentContainer loyaltyMerchantcardsDTOPaymentContainer = (LoyaltyMerchantcardsDTOPaymentContainer) o;
    return Objects.equals(this.object, loyaltyMerchantcardsDTOPaymentContainer.object) &&
        Objects.equals(this.id, loyaltyMerchantcardsDTOPaymentContainer.id) &&
        Objects.equals(this.type, loyaltyMerchantcardsDTOPaymentContainer.type) &&
        Objects.equals(this.paymentInformation, loyaltyMerchantcardsDTOPaymentContainer.paymentInformation);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, type, paymentInformation);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsDTOPaymentContainer {\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    paymentInformation: ").append(toIndentedString(paymentInformation)).append("\n");
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

