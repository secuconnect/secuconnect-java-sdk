package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.BackgroundImageOption;
import java.util.Objects;

/**
 * PaymentLinkOptions
 */
public class PaymentLinkOptions {
  @SerializedName("background")
  protected BackgroundImageOption background = null;

  public PaymentLinkOptions background(BackgroundImageOption background) {
    this.background = background;
    return this;
  }

   /**
   * Get background
   * @return background
  **/
  public BackgroundImageOption getBackground() {
    return background;
  }

  public void setBackground(BackgroundImageOption background) {
    this.background = background;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentLinkOptions paymentLinkOptions = (PaymentLinkOptions) o;
    return Objects.equals(this.background, paymentLinkOptions.background);
  }

  @Override
  public int hashCode() {
    return Objects.hash(background);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentLinkOptions {\n");
    sb.append("    background: ").append(toIndentedString(background)).append("\n");
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

