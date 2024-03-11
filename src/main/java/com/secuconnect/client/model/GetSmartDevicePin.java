package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.GetSmartDevicePinMerchant;
import com.secuconnect.client.model.GetSmartDevicePinSmartDevice;
import com.secuconnect.client.model.GetSmartDevicePinStore;
import java.util.Objects;

/**
 * GetSmartDevicePin
 */
public class GetSmartDevicePin {
  @SerializedName("merchant")
  protected GetSmartDevicePinMerchant merchant = null;

  @SerializedName("store")
  protected GetSmartDevicePinStore store = null;

  @SerializedName("smart_device")
  protected GetSmartDevicePinSmartDevice smartDevice = null;

  public GetSmartDevicePin merchant(GetSmartDevicePinMerchant merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  public GetSmartDevicePinMerchant getMerchant() {
    return merchant;
  }

  public void setMerchant(GetSmartDevicePinMerchant merchant) {
    this.merchant = merchant;
  }

  public GetSmartDevicePin store(GetSmartDevicePinStore store) {
    this.store = store;
    return this;
  }

   /**
   * Get store
   * @return store
  **/
  public GetSmartDevicePinStore getStore() {
    return store;
  }

  public void setStore(GetSmartDevicePinStore store) {
    this.store = store;
  }

  public GetSmartDevicePin smartDevice(GetSmartDevicePinSmartDevice smartDevice) {
    this.smartDevice = smartDevice;
    return this;
  }

   /**
   * Get smartDevice
   * @return smartDevice
  **/
  public GetSmartDevicePinSmartDevice getSmartDevice() {
    return smartDevice;
  }

  public void setSmartDevice(GetSmartDevicePinSmartDevice smartDevice) {
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
    GetSmartDevicePin getSmartDevicePin = (GetSmartDevicePin) o;
    return Objects.equals(this.merchant, getSmartDevicePin.merchant) &&
        Objects.equals(this.store, getSmartDevicePin.store) &&
        Objects.equals(this.smartDevice, getSmartDevicePin.smartDevice);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchant, store, smartDevice);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GetSmartDevicePin {\n");
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

