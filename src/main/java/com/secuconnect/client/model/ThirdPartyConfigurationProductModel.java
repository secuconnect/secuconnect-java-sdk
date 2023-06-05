package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.ThirdPartyEnvironment;
import java.util.Objects;

/**
 * Third-Party settings
 */
public class ThirdPartyConfigurationProductModel {
  @SerializedName("paypal")
  protected ThirdPartyEnvironment paypal = null;

  @SerializedName("easycredit")
  protected ThirdPartyEnvironment easycredit = null;

  @SerializedName("saferpay")
  protected ThirdPartyEnvironment saferpay = null;

  public ThirdPartyConfigurationProductModel paypal(ThirdPartyEnvironment paypal) {
    this.paypal = paypal;
    return this;
  }

   /**
   * Get paypal
   * @return paypal
  **/
  public ThirdPartyEnvironment getPaypal() {
    return paypal;
  }

  public void setPaypal(ThirdPartyEnvironment paypal) {
    this.paypal = paypal;
  }

  public ThirdPartyConfigurationProductModel easycredit(ThirdPartyEnvironment easycredit) {
    this.easycredit = easycredit;
    return this;
  }

   /**
   * Get easycredit
   * @return easycredit
  **/
  public ThirdPartyEnvironment getEasycredit() {
    return easycredit;
  }

  public void setEasycredit(ThirdPartyEnvironment easycredit) {
    this.easycredit = easycredit;
  }

  public ThirdPartyConfigurationProductModel saferpay(ThirdPartyEnvironment saferpay) {
    this.saferpay = saferpay;
    return this;
  }

   /**
   * Get saferpay
   * @return saferpay
  **/
  public ThirdPartyEnvironment getSaferpay() {
    return saferpay;
  }

  public void setSaferpay(ThirdPartyEnvironment saferpay) {
    this.saferpay = saferpay;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThirdPartyConfigurationProductModel thirdPartyConfigurationProductModel = (ThirdPartyConfigurationProductModel) o;
    return Objects.equals(this.paypal, thirdPartyConfigurationProductModel.paypal) &&
        Objects.equals(this.easycredit, thirdPartyConfigurationProductModel.easycredit) &&
        Objects.equals(this.saferpay, thirdPartyConfigurationProductModel.saferpay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paypal, easycredit, saferpay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyConfigurationProductModel {\n");
    sb.append("    paypal: ").append(toIndentedString(paypal)).append("\n");
    sb.append("    easycredit: ").append(toIndentedString(easycredit)).append("\n");
    sb.append("    saferpay: ").append(toIndentedString(saferpay)).append("\n");
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

