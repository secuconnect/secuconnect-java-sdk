package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.LoyaltyMerchantcardsDTOValidateMerchantCard;
import java.util.Objects;

/**
 * LoyaltyMerchantcardsDTONewPasscode
 */
public class LoyaltyMerchantcardsDTONewPasscode extends LoyaltyMerchantcardsDTOValidateMerchantCard {
  @SerializedName("passcode")
  protected Integer passcode = null;

  public LoyaltyMerchantcardsDTONewPasscode passcode(Integer passcode) {
    this.passcode = passcode;
    return this;
  }

   /**
   * Loyalty Card passcode
   * @return passcode
  **/
  public Integer getPasscode() {
    return passcode;
  }

  public void setPasscode(Integer passcode) {
    this.passcode = passcode;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyMerchantcardsDTONewPasscode loyaltyMerchantcardsDTONewPasscode = (LoyaltyMerchantcardsDTONewPasscode) o;
    return Objects.equals(this.passcode, loyaltyMerchantcardsDTONewPasscode.passcode) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(passcode, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsDTONewPasscode {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    passcode: ").append(toIndentedString(passcode)).append("\n");
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

