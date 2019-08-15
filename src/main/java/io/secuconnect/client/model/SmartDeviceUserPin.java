package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * SmartDeviceUserPin
 */
public class SmartDeviceUserPin {
  @SerializedName("user_pin")
  private String userPin = null;

  public SmartDeviceUserPin userPin(String userPin) {
    this.userPin = userPin;
    return this;
  }

   /**
   * user code from authentication response
   * @return userPin
  **/
  public String getUserPin() {
    return userPin;
  }

  public void setUserPin(String userPin) {
    this.userPin = userPin;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDeviceUserPin smartDeviceUserPin = (SmartDeviceUserPin) o;
    return Objects.equals(this.userPin, smartDeviceUserPin.userPin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(userPin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDeviceUserPin {\n");
    
    sb.append("    userPin: ").append(toIndentedString(userPin)).append("\n");
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

