package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/**
 * LoyaltyCardgroupsDTOCheckPasscodeEnabled
 */
public class LoyaltyCardgroupsDTOCheckPasscodeEnabled {
  @SerializedName("action")
  private String action = null;

  @SerializedName("cardnumber")
  private String cardnumber = null;

  public LoyaltyCardgroupsDTOCheckPasscodeEnabled action(String action) {
    this.action = action;
    return this;
  }

   /**
   * Action type
   * @return action
  **/
  @ApiModelProperty(value = "Action type")
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
   * Secucard number
   * @return cardnumber
  **/
  @ApiModelProperty(value = "Secucard number")
  public String getCardnumber() {
    return cardnumber;
  }

  public void setCardnumber(String cardnumber) {
    this.cardnumber = cardnumber;
  }

  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

