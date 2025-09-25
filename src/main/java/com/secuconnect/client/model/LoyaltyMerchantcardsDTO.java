package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyMerchantcardsDTO
 */
public class LoyaltyMerchantcardsDTO {
  @SerializedName("expiry_date")
  protected String expiryDate = null;

  @SerializedName("payment_container")
  protected String paymentContainer = null;

  @SerializedName("additional_data")
  protected Object additionalData = null;

  public LoyaltyMerchantcardsDTO expiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
    return this;
  }

   /**
   * Card expiry date in ISO 8601 format
   * @return expiryDate
  **/
  public String getExpiryDate() {
    return expiryDate;
  }

  public void setExpiryDate(String expiryDate) {
    this.expiryDate = expiryDate;
  }

  public LoyaltyMerchantcardsDTO paymentContainer(String paymentContainer) {
    this.paymentContainer = paymentContainer;
    return this;
  }

   /**
   * Loyalty Payment Container ID
   * @return paymentContainer
  **/
  public String getPaymentContainer() {
    return paymentContainer;
  }

  public void setPaymentContainer(String paymentContainer) {
    this.paymentContainer = paymentContainer;
  }

  public LoyaltyMerchantcardsDTO additionalData(Object additionalData) {
    this.additionalData = additionalData;
    return this;
  }

   /**
   * Custom additional data
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
    LoyaltyMerchantcardsDTO loyaltyMerchantcardsDTO = (LoyaltyMerchantcardsDTO) o;
    return Objects.equals(this.expiryDate, loyaltyMerchantcardsDTO.expiryDate) &&
        Objects.equals(this.paymentContainer, loyaltyMerchantcardsDTO.paymentContainer) &&
        Objects.equals(this.additionalData, loyaltyMerchantcardsDTO.additionalData);
  }

  @Override
  public int hashCode() {
    return Objects.hash(expiryDate, paymentContainer, additionalData);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsDTO {\n");
    sb.append("    expiryDate: ").append(toIndentedString(expiryDate)).append("\n");
    sb.append("    paymentContainer: ").append(toIndentedString(paymentContainer)).append("\n");
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

