package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyMerchantcardsDTO
 */
public class LoyaltyMerchantcardsDTO {
  @SerializedName("merchant")
  protected String merchant = null;

  @SerializedName("card")
  protected String card = null;

  @SerializedName("payment_container")
  protected String paymentContainer = null;

  @SerializedName("created_by_merchant")
  protected Boolean createdByMerchant = null;

  @SerializedName("used_by_merchant")
  protected Boolean usedByMerchant = null;

  public LoyaltyMerchantcardsDTO merchant(String merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * General merchant id
   * @return merchant
  **/
  public String getMerchant() {
    return merchant;
  }

  public void setMerchant(String merchant) {
    this.merchant = merchant;
  }

  public LoyaltyMerchantcardsDTO card(String card) {
    this.card = card;
    return this;
  }

   /**
   * Loyalty card id
   * @return card
  **/
  public String getCard() {
    return card;
  }

  public void setCard(String card) {
    this.card = card;
  }

  public LoyaltyMerchantcardsDTO paymentContainer(String paymentContainer) {
    this.paymentContainer = paymentContainer;
    return this;
  }

   /**
   * Loyalty payment container id
   * @return paymentContainer
  **/
  public String getPaymentContainer() {
    return paymentContainer;
  }

  public void setPaymentContainer(String paymentContainer) {
    this.paymentContainer = paymentContainer;
  }

  public LoyaltyMerchantcardsDTO createdByMerchant(Boolean createdByMerchant) {
    this.createdByMerchant = createdByMerchant;
    return this;
  }

   /**
   * Created by general merchant or not
   * @return createdByMerchant
  **/
  public Boolean getCreatedByMerchant() {
    return createdByMerchant;
  }

  public void setCreatedByMerchant(Boolean createdByMerchant) {
    this.createdByMerchant = createdByMerchant;
  }

  public LoyaltyMerchantcardsDTO usedByMerchant(Boolean usedByMerchant) {
    this.usedByMerchant = usedByMerchant;
    return this;
  }

   /**
   * Used by general merchant or not
   * @return usedByMerchant
  **/
  public Boolean getUsedByMerchant() {
    return usedByMerchant;
  }

  public void setUsedByMerchant(Boolean usedByMerchant) {
    this.usedByMerchant = usedByMerchant;
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
    return Objects.equals(this.merchant, loyaltyMerchantcardsDTO.merchant) &&
        Objects.equals(this.card, loyaltyMerchantcardsDTO.card) &&
        Objects.equals(this.paymentContainer, loyaltyMerchantcardsDTO.paymentContainer) &&
        Objects.equals(this.createdByMerchant, loyaltyMerchantcardsDTO.createdByMerchant) &&
        Objects.equals(this.usedByMerchant, loyaltyMerchantcardsDTO.usedByMerchant);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchant, card, paymentContainer, createdByMerchant, usedByMerchant);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsDTO {\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    card: ").append(toIndentedString(card)).append("\n");
    sb.append("    paymentContainer: ").append(toIndentedString(paymentContainer)).append("\n");
    sb.append("    createdByMerchant: ").append(toIndentedString(createdByMerchant)).append("\n");
    sb.append("    usedByMerchant: ").append(toIndentedString(usedByMerchant)).append("\n");
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

