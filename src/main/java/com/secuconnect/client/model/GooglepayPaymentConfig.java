package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GooglepayPaymentConfig
 */
public class GooglepayPaymentConfig {
  @SerializedName("api_version")
  protected Integer apiVersion = null;

  @SerializedName("api_version_minor")
  protected Integer apiVersionMinor = null;

  @SerializedName("type")
  protected String type = null;

  @SerializedName("allowed_auth_methods")
  protected List<String> allowedAuthMethods = null;

  @SerializedName("allowed_card_networks")
  protected List<String> allowedCardNetworks = null;

  @SerializedName("gateway")
  protected String gateway = null;

  @SerializedName("gateway_merchant_id")
  protected String gatewayMerchantId = null;

  @SerializedName("merchant_id")
  protected String merchantId = null;

  @SerializedName("merchant_name")
  protected String merchantName = null;

  public GooglepayPaymentConfig apiVersion(Integer apiVersion) {
    this.apiVersion = apiVersion;
    return this;
  }

   /**
   * Get apiVersion
   * @return apiVersion
  **/
  public Integer getApiVersion() {
    return apiVersion;
  }

  public void setApiVersion(Integer apiVersion) {
    this.apiVersion = apiVersion;
  }

  public GooglepayPaymentConfig apiVersionMinor(Integer apiVersionMinor) {
    this.apiVersionMinor = apiVersionMinor;
    return this;
  }

   /**
   * Get apiVersionMinor
   * @return apiVersionMinor
  **/
  public Integer getApiVersionMinor() {
    return apiVersionMinor;
  }

  public void setApiVersionMinor(Integer apiVersionMinor) {
    this.apiVersionMinor = apiVersionMinor;
  }

  public GooglepayPaymentConfig type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GooglepayPaymentConfig allowedAuthMethods(List<String> allowedAuthMethods) {
    this.allowedAuthMethods = allowedAuthMethods;
    return this;
  }

  public GooglepayPaymentConfig addAllowedAuthMethodsItem(String allowedAuthMethodsItem) {
    if (this.allowedAuthMethods == null) {
      this.allowedAuthMethods = new ArrayList<String>();
    }
    this.allowedAuthMethods.add(allowedAuthMethodsItem);
    return this;
  }

   /**
   * Get allowedAuthMethods
   * @return allowedAuthMethods
  **/
  public List<String> getAllowedAuthMethods() {
    return allowedAuthMethods;
  }

  public void setAllowedAuthMethods(List<String> allowedAuthMethods) {
    this.allowedAuthMethods = allowedAuthMethods;
  }

  public GooglepayPaymentConfig allowedCardNetworks(List<String> allowedCardNetworks) {
    this.allowedCardNetworks = allowedCardNetworks;
    return this;
  }

  public GooglepayPaymentConfig addAllowedCardNetworksItem(String allowedCardNetworksItem) {
    if (this.allowedCardNetworks == null) {
      this.allowedCardNetworks = new ArrayList<String>();
    }
    this.allowedCardNetworks.add(allowedCardNetworksItem);
    return this;
  }

   /**
   * Get allowedCardNetworks
   * @return allowedCardNetworks
  **/
  public List<String> getAllowedCardNetworks() {
    return allowedCardNetworks;
  }

  public void setAllowedCardNetworks(List<String> allowedCardNetworks) {
    this.allowedCardNetworks = allowedCardNetworks;
  }

  public GooglepayPaymentConfig gateway(String gateway) {
    this.gateway = gateway;
    return this;
  }

   /**
   * Get gateway
   * @return gateway
  **/
  public String getGateway() {
    return gateway;
  }

  public void setGateway(String gateway) {
    this.gateway = gateway;
  }

  public GooglepayPaymentConfig gatewayMerchantId(String gatewayMerchantId) {
    this.gatewayMerchantId = gatewayMerchantId;
    return this;
  }

   /**
   * Get gatewayMerchantId
   * @return gatewayMerchantId
  **/
  public String getGatewayMerchantId() {
    return gatewayMerchantId;
  }

  public void setGatewayMerchantId(String gatewayMerchantId) {
    this.gatewayMerchantId = gatewayMerchantId;
  }

  public GooglepayPaymentConfig merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Get merchantId
   * @return merchantId
  **/
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public GooglepayPaymentConfig merchantName(String merchantName) {
    this.merchantName = merchantName;
    return this;
  }

   /**
   * Get merchantName
   * @return merchantName
  **/
  public String getMerchantName() {
    return merchantName;
  }

  public void setMerchantName(String merchantName) {
    this.merchantName = merchantName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GooglepayPaymentConfig googlepayPaymentConfig = (GooglepayPaymentConfig) o;
    return Objects.equals(this.apiVersion, googlepayPaymentConfig.apiVersion) &&
        Objects.equals(this.apiVersionMinor, googlepayPaymentConfig.apiVersionMinor) &&
        Objects.equals(this.type, googlepayPaymentConfig.type) &&
        Objects.equals(this.allowedAuthMethods, googlepayPaymentConfig.allowedAuthMethods) &&
        Objects.equals(this.allowedCardNetworks, googlepayPaymentConfig.allowedCardNetworks) &&
        Objects.equals(this.gateway, googlepayPaymentConfig.gateway) &&
        Objects.equals(this.gatewayMerchantId, googlepayPaymentConfig.gatewayMerchantId) &&
        Objects.equals(this.merchantId, googlepayPaymentConfig.merchantId) &&
        Objects.equals(this.merchantName, googlepayPaymentConfig.merchantName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(apiVersion, apiVersionMinor, type, allowedAuthMethods, allowedCardNetworks, gateway, gatewayMerchantId, merchantId, merchantName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GooglepayPaymentConfig {\n");
    sb.append("    apiVersion: ").append(toIndentedString(apiVersion)).append("\n");
    sb.append("    apiVersionMinor: ").append(toIndentedString(apiVersionMinor)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    allowedAuthMethods: ").append(toIndentedString(allowedAuthMethods)).append("\n");
    sb.append("    allowedCardNetworks: ").append(toIndentedString(allowedCardNetworks)).append("\n");
    sb.append("    gateway: ").append(toIndentedString(gateway)).append("\n");
    sb.append("    gatewayMerchantId: ").append(toIndentedString(gatewayMerchantId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    merchantName: ").append(toIndentedString(merchantName)).append("\n");
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

