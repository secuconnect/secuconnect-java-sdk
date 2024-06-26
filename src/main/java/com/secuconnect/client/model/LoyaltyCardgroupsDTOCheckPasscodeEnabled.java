package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyCardgroupsDTOCheckPasscodeEnabled
 */
public class LoyaltyCardgroupsDTOCheckPasscodeEnabled {
  @SerializedName("action")
  protected String action = null;

  @SerializedName("cardnumber")
  protected String cardnumber = null;

  public LoyaltyCardgroupsDTOCheckPasscodeEnabled action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Action type:  - &#x60;\&quot;charge\&quot;&#x60; - &#x60;\&quot;discharge\&quot;&#x60; - &#x60;\&quot;sale_revenue\&quot;&#x60; - &#x60;\&quot;charge_points\&quot;&#x60; - &#x60;\&quot;discharge_points\&quot;&#x60; - &#x60;\&quot;cashreport\&quot;&#x60;
   * @return action
  **/
  public String getAction() {
    return action;
  }

  public void setAction(String action) {
    this.action = action;
  }

  public LoyaltyCardgroupsDTOCheckPasscodeEnabled cardnumber(String cardnumber) {
    this.cardnumber = cardnumber;
    return this;
  }

   /**
   * Loyalty card number
   * @return cardnumber
  **/
  public String getCardnumber() {
    return cardnumber;
  }

  public void setCardnumber(String cardnumber) {
    this.cardnumber = cardnumber;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyCardgroupsDTOCheckPasscodeEnabled loyaltyCardgroupsDTOCheckPasscodeEnabled = (LoyaltyCardgroupsDTOCheckPasscodeEnabled) o;
    return Objects.equals(this.action, loyaltyCardgroupsDTOCheckPasscodeEnabled.action) &&
        Objects.equals(this.cardnumber, loyaltyCardgroupsDTOCheckPasscodeEnabled.cardnumber);
  }

  @Override
  public int hashCode() {
    return Objects.hash(action, cardnumber);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyCardgroupsDTOCheckPasscodeEnabled {\n");
    sb.append("    action: ").append(toIndentedString(action)).append("\n");
    sb.append("    cardnumber: ").append(toIndentedString(cardnumber)).append("\n");
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

