package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.GetSmartDevicePinConfigMerchant;
import com.secuconnect.client.model.GetSmartDevicePinConfigSmartDevice;
import com.secuconnect.client.model.GetSmartDevicePinConfigStore;
import java.util.Objects;

/**
 * GetSmartDevicePinConfig
 */
public class GetSmartDevicePinConfig {
  @SerializedName("merchant")
  protected GetSmartDevicePinConfigMerchant merchant = null;

  @SerializedName("store")
  protected GetSmartDevicePinConfigStore store = null;

  @SerializedName("smart_device")
  protected GetSmartDevicePinConfigSmartDevice smartDevice = null;

  public GetSmartDevicePinConfig merchant(GetSmartDevicePinConfigMerchant merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  public GetSmartDevicePinConfigMerchant getMerchant() {
    return merchant;
  }

  public void setMerchant(GetSmartDevicePinConfigMerchant merchant) {
    this.merchant = merchant;
  }

  public GetSmartDevicePinConfig store(GetSmartDevicePinConfigStore store) {
    this.store = store;
    return this;
  }

   /**
   * Get store
   * @return store
  **/
  public GetSmartDevicePinConfigStore getStore() {
    return store;
  }

  public void setStore(GetSmartDevicePinConfigStore store) {
    this.store = store;
  }

  public GetSmartDevicePinConfig smartDevice(GetSmartDevicePinConfigSmartDevice smartDevice) {
    this.smartDevice = smartDevice;
    return this;
  }

   /**
   * Get smartDevice
   * @return smartDevice
  **/
  public GetSmartDevicePinConfigSmartDevice getSmartDevice() {
    return smartDevice;
  }

  public void setSmartDevice(GetSmartDevicePinConfigSmartDevice smartDevice) {
    this.smartDevice = smartDevice;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GetSmartDevicePinConfig getSmartDevicePinConfig = (GetSmartDevicePinConfig) o;
    return Objects.equals(this.merchant, getSmartDevicePinConfig.merchant) &&
        Objects.equals(this.store, getSmartDevicePinConfig.store) &&
        Objects.equals(this.smartDevice, getSmartDevicePinConfig.smartDevice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchant, store, smartDevice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSmartDevicePinConfig {\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    smartDevice: ").append(toIndentedString(smartDevice)).append("\n");
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

