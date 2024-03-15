package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * CardPin
 */
public class CardPin {
  @SerializedName("pin")
  protected String pin = null;

  public CardPin pin(String pin) {
    this.pin = pin;
    return this;
  }

   /**
   * Card PIN (four decimal digits)  The card PIN must not be mixed with the Card Security Code (CSC) on the card.
   * @return pin
  **/
  public String getPin() {
    return pin;
  }

  public void setPin(String pin) {
    this.pin = pin;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CardPin cardPin = (CardPin) o;
    return Objects.equals(this.pin, cardPin.pin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(pin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CardPin {\n");
    sb.append("    pin: ").append(toIndentedString(pin)).append("\n");
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

