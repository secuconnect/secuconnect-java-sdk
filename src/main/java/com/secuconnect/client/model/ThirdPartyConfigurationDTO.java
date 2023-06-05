package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.ThirdPartyEnvironmentDTO;
import java.util.Objects;

/**
 * Third-Party settings
 */
public class ThirdPartyConfigurationDTO {
  @SerializedName("paypal")
  protected ThirdPartyEnvironmentDTO paypal = null;

  @SerializedName("easycredit")
  protected ThirdPartyEnvironmentDTO easycredit = null;

  @SerializedName("saferpay")
  protected ThirdPartyEnvironmentDTO saferpay = null;

  public ThirdPartyConfigurationDTO paypal(ThirdPartyEnvironmentDTO paypal) {
    this.paypal = paypal;
    return this;
  }

   /**
   * Get paypal
   * @return paypal
  **/
  public ThirdPartyEnvironmentDTO getPaypal() {
    return paypal;
  }

  public void setPaypal(ThirdPartyEnvironmentDTO paypal) {
    this.paypal = paypal;
  }

  public ThirdPartyConfigurationDTO easycredit(ThirdPartyEnvironmentDTO easycredit) {
    this.easycredit = easycredit;
    return this;
  }

   /**
   * Get easycredit
   * @return easycredit
  **/
  public ThirdPartyEnvironmentDTO getEasycredit() {
    return easycredit;
  }

  public void setEasycredit(ThirdPartyEnvironmentDTO easycredit) {
    this.easycredit = easycredit;
  }

  public ThirdPartyConfigurationDTO saferpay(ThirdPartyEnvironmentDTO saferpay) {
    this.saferpay = saferpay;
    return this;
  }

   /**
   * Get saferpay
   * @return saferpay
  **/
  public ThirdPartyEnvironmentDTO getSaferpay() {
    return saferpay;
  }

  public void setSaferpay(ThirdPartyEnvironmentDTO saferpay) {
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
    ThirdPartyConfigurationDTO thirdPartyConfigurationDTO = (ThirdPartyConfigurationDTO) o;
    return Objects.equals(this.paypal, thirdPartyConfigurationDTO.paypal) &&
        Objects.equals(this.easycredit, thirdPartyConfigurationDTO.easycredit) &&
        Objects.equals(this.saferpay, thirdPartyConfigurationDTO.saferpay);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paypal, easycredit, saferpay);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyConfigurationDTO {\n");
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

