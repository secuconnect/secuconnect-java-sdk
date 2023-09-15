package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ApplepayPaymentConfig
 */
public class ApplepayPaymentConfig {
  @SerializedName("label")
  protected String label = null;

  @SerializedName("supported_networks")
  protected List<String> supportedNetworks = null;

  @SerializedName("merchant_capabilities")
  protected List<String> merchantCapabilities = null;

  public ApplepayPaymentConfig label(String label) {
    this.label = label;
    return this;
  }

   /**
   * Get label
   * @return label
  **/
  public String getLabel() {
    return label;
  }

  public void setLabel(String label) {
    this.label = label;
  }

  public ApplepayPaymentConfig supportedNetworks(List<String> supportedNetworks) {
    this.supportedNetworks = supportedNetworks;
    return this;
  }

  public ApplepayPaymentConfig addSupportedNetworksItem(String supportedNetworksItem) {
    if (this.supportedNetworks == null) {
      this.supportedNetworks = new ArrayList<String>();
    }
    this.supportedNetworks.add(supportedNetworksItem);
    return this;
  }

   /**
   * Get supportedNetworks
   * @return supportedNetworks
  **/
  public List<String> getSupportedNetworks() {
    return supportedNetworks;
  }

  public void setSupportedNetworks(List<String> supportedNetworks) {
    this.supportedNetworks = supportedNetworks;
  }

  public ApplepayPaymentConfig merchantCapabilities(List<String> merchantCapabilities) {
    this.merchantCapabilities = merchantCapabilities;
    return this;
  }

  public ApplepayPaymentConfig addMerchantCapabilitiesItem(String merchantCapabilitiesItem) {
    if (this.merchantCapabilities == null) {
      this.merchantCapabilities = new ArrayList<String>();
    }
    this.merchantCapabilities.add(merchantCapabilitiesItem);
    return this;
  }

   /**
   * Get merchantCapabilities
   * @return merchantCapabilities
  **/
  public List<String> getMerchantCapabilities() {
    return merchantCapabilities;
  }

  public void setMerchantCapabilities(List<String> merchantCapabilities) {
    this.merchantCapabilities = merchantCapabilities;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ApplepayPaymentConfig applepayPaymentConfig = (ApplepayPaymentConfig) o;
    return Objects.equals(this.label, applepayPaymentConfig.label) &&
        Objects.equals(this.supportedNetworks, applepayPaymentConfig.supportedNetworks) &&
        Objects.equals(this.merchantCapabilities, applepayPaymentConfig.merchantCapabilities);
  }

  @Override
  public int hashCode() {
    return Objects.hash(label, supportedNetworks, merchantCapabilities);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ApplepayPaymentConfig {\n");
    sb.append("    label: ").append(toIndentedString(label)).append("\n");
    sb.append("    supportedNetworks: ").append(toIndentedString(supportedNetworks)).append("\n");
    sb.append("    merchantCapabilities: ").append(toIndentedString(merchantCapabilities)).append("\n");
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

