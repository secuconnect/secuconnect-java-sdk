package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.CheckoutConfiguration;
import java.util.Objects;

/**
 * GeneralContractsDTO
 */
public class GeneralContractsDTO {
  @SerializedName("checkout_configuration")
  protected CheckoutConfiguration checkoutConfiguration = null;

  public GeneralContractsDTO checkoutConfiguration(CheckoutConfiguration checkoutConfiguration) {
    this.checkoutConfiguration = checkoutConfiguration;
    return this;
  }

   /**
   * Get checkoutConfiguration
   * @return checkoutConfiguration
  **/
  public CheckoutConfiguration getCheckoutConfiguration() {
    return checkoutConfiguration;
  }

  public void setCheckoutConfiguration(CheckoutConfiguration checkoutConfiguration) {
    this.checkoutConfiguration = checkoutConfiguration;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralContractsDTO generalContractsDTO = (GeneralContractsDTO) o;
    return Objects.equals(this.checkoutConfiguration, generalContractsDTO.checkoutConfiguration);
  }

  @Override
  public int hashCode() {
    return Objects.hash(checkoutConfiguration);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralContractsDTO {\n");
    sb.append("    checkoutConfiguration: ").append(toIndentedString(checkoutConfiguration)).append("\n");
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

