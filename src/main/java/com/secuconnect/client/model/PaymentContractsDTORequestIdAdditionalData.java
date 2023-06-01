package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.PaymentContractsDTORequestIdAdditionalDataCreateCard;
import java.util.Objects;

/**
 * Additional data input
 */
public class PaymentContractsDTORequestIdAdditionalData {
  @SerializedName("create_card")
  protected PaymentContractsDTORequestIdAdditionalDataCreateCard createCard = null;

  public PaymentContractsDTORequestIdAdditionalData createCard(PaymentContractsDTORequestIdAdditionalDataCreateCard createCard) {
    this.createCard = createCard;
    return this;
  }

   /**
   * Get createCard
   * @return createCard
  **/
  public PaymentContractsDTORequestIdAdditionalDataCreateCard getCreateCard() {
    return createCard;
  }

  public void setCreateCard(PaymentContractsDTORequestIdAdditionalDataCreateCard createCard) {
    this.createCard = createCard;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContractsDTORequestIdAdditionalData paymentContractsDTORequestIdAdditionalData = (PaymentContractsDTORequestIdAdditionalData) o;
    return Objects.equals(this.createCard, paymentContractsDTORequestIdAdditionalData.createCard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(createCard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContractsDTORequestIdAdditionalData {\n");
    sb.append("    createCard: ").append(toIndentedString(createCard)).append("\n");
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

