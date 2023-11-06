package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Shop Details
 */
public class SmartTransactionsApplicationContextShopDetails {
  @SerializedName("shop_system")
  protected String shopSystem = null;

  @SerializedName("shop_system_version")
  protected String shopSystemVersion = null;

  @SerializedName("shop_domain")
  protected String shopDomain = null;

  @SerializedName("plugin_vendor")
  protected String pluginVendor = null;

  @SerializedName("plugin_version")
  protected String pluginVersion = null;

  @SerializedName("user_agent")
  protected String userAgent = null;

  public SmartTransactionsApplicationContextShopDetails shopSystem(String shopSystem) {
    this.shopSystem = shopSystem;
    return this;
  }

   /**
   * Shop system product name with or without major version; e. g. “Shopware” or better “Shopware 6”. The major version makes sense when the module targets a specific version.
   * @return shopSystem
  **/
  public String getShopSystem() {
    return shopSystem;
  }

  public void setShopSystem(String shopSystem) {
    this.shopSystem = shopSystem;
  }

  public SmartTransactionsApplicationContextShopDetails shopSystemVersion(String shopSystemVersion) {
    this.shopSystemVersion = shopSystemVersion;
    return this;
  }

   /**
   * Full shop system version number; e. g. “6.5.5.0”. Include the major version even if it is contained in the shop system product name.
   * @return shopSystemVersion
  **/
  public String getShopSystemVersion() {
    return shopSystemVersion;
  }

  public void setShopSystemVersion(String shopSystemVersion) {
    this.shopSystemVersion = shopSystemVersion;
  }

  public SmartTransactionsApplicationContextShopDetails shopDomain(String shopDomain) {
    this.shopDomain = shopDomain;
    return this;
  }

   /**
   * Shop domain like “example.com” or perhaps “www.example.com”. Multi-shop/multi-site installations should pass the domain the customer has seen.
   * @return shopDomain
  **/
  public String getShopDomain() {
    return shopDomain;
  }

  public void setShopDomain(String shopDomain) {
    this.shopDomain = shopDomain;
  }

  public SmartTransactionsApplicationContextShopDetails pluginVendor(String pluginVendor) {
    this.pluginVendor = pluginVendor;
    return this;
  }

   /**
   * Name of payment plugin vendor, or the exact plugin product name; e. g. “Plugin-O-Rama” or “Plugin-O-Rama Payments”.
   * @return pluginVendor
  **/
  public String getPluginVendor() {
    return pluginVendor;
  }

  public void setPluginVendor(String pluginVendor) {
    this.pluginVendor = pluginVendor;
  }

  public SmartTransactionsApplicationContextShopDetails pluginVersion(String pluginVersion) {
    this.pluginVersion = pluginVersion;
    return this;
  }

   /**
   * Version number of the plugin vendor; e. g. “1.2.3”.
   * @return pluginVersion
  **/
  public String getPluginVersion() {
    return pluginVersion;
  }

  public void setPluginVersion(String pluginVersion) {
    this.pluginVersion = pluginVersion;
  }

  public SmartTransactionsApplicationContextShopDetails userAgent(String userAgent) {
    this.userAgent = userAgent;
    return this;
  }

   /**
   * HTTP user agent; e. g. “PostmanRuntime/7.29.0” or “GuzzleHttp/6.5.5 curl/7.74.0 PHP/8.0.8”. Taken from the HTTP request if not explicitly transmitted.
   * @return userAgent
  **/
  public String getUserAgent() {
    return userAgent;
  }

  public void setUserAgent(String userAgent) {
    this.userAgent = userAgent;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsApplicationContextShopDetails smartTransactionsApplicationContextShopDetails = (SmartTransactionsApplicationContextShopDetails) o;
    return Objects.equals(this.shopSystem, smartTransactionsApplicationContextShopDetails.shopSystem) &&
        Objects.equals(this.shopSystemVersion, smartTransactionsApplicationContextShopDetails.shopSystemVersion) &&
        Objects.equals(this.shopDomain, smartTransactionsApplicationContextShopDetails.shopDomain) &&
        Objects.equals(this.pluginVendor, smartTransactionsApplicationContextShopDetails.pluginVendor) &&
        Objects.equals(this.pluginVersion, smartTransactionsApplicationContextShopDetails.pluginVersion) &&
        Objects.equals(this.userAgent, smartTransactionsApplicationContextShopDetails.userAgent);
  }

  @Override
  public int hashCode() {
    return Objects.hash(shopSystem, shopSystemVersion, shopDomain, pluginVendor, pluginVersion, userAgent);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsApplicationContextShopDetails {\n");
    sb.append("    shopSystem: ").append(toIndentedString(shopSystem)).append("\n");
    sb.append("    shopSystemVersion: ").append(toIndentedString(shopSystemVersion)).append("\n");
    sb.append("    shopDomain: ").append(toIndentedString(shopDomain)).append("\n");
    sb.append("    pluginVendor: ").append(toIndentedString(pluginVendor)).append("\n");
    sb.append("    pluginVersion: ").append(toIndentedString(pluginVersion)).append("\n");
    sb.append("    userAgent: ").append(toIndentedString(userAgent)).append("\n");
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

