package com.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * LoyaltyMerchantcardsValidateMerchantCard
 */
public class LoyaltyMerchantcardsValidateMerchantCard {
  @SerializedName("isValid")
  private Boolean isValid = null;

  @SerializedName("hasPasscode")
  private Boolean hasPasscode = null;

  @SerializedName("isLocked")
  private Boolean isLocked = null;

  public LoyaltyMerchantcardsValidateMerchantCard isValid(Boolean isValid) {
    this.isValid = isValid;
    return this;
  }

   /**
   * Result has true or false value
   * @return isValid
  **/
  public Boolean isIsValid() {
    return isValid;
  }

  public void setIsValid(Boolean isValid) {
    this.isValid = isValid;
  }

  public LoyaltyMerchantcardsValidateMerchantCard hasPasscode(Boolean hasPasscode) {
    this.hasPasscode = hasPasscode;
    return this;
  }

   /**
   * Result has true or false value
   * @return hasPasscode
  **/
  public Boolean isHasPasscode() {
    return hasPasscode;
  }

  public void setHasPasscode(Boolean hasPasscode) {
    this.hasPasscode = hasPasscode;
  }

  public LoyaltyMerchantcardsValidateMerchantCard isLocked(Boolean isLocked) {
    this.isLocked = isLocked;
    return this;
  }

   /**
   * Result has true or false value
   * @return isLocked
  **/
  public Boolean isIsLocked() {
    return isLocked;
  }

  public void setIsLocked(Boolean isLocked) {
    this.isLocked = isLocked;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyMerchantcardsValidateMerchantCard loyaltyMerchantcardsValidateMerchantCard = (LoyaltyMerchantcardsValidateMerchantCard) o;
    return Objects.equals(this.isValid, loyaltyMerchantcardsValidateMerchantCard.isValid) &&
        Objects.equals(this.hasPasscode, loyaltyMerchantcardsValidateMerchantCard.hasPasscode) &&
        Objects.equals(this.isLocked, loyaltyMerchantcardsValidateMerchantCard.isLocked);
  }

  @Override
  public int hashCode() {
    return Objects.hash(isValid, hasPasscode, isLocked);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsValidateMerchantCard {\n");
    
    sb.append("    isValid: ").append(toIndentedString(isValid)).append("\n");
    sb.append("    hasPasscode: ").append(toIndentedString(hasPasscode)).append("\n");
    sb.append("    isLocked: ").append(toIndentedString(isLocked)).append("\n");
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

