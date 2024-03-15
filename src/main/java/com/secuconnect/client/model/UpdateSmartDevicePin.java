package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * UpdateSmartDevicePin
 */
public class UpdateSmartDevicePin {
  @SerializedName("store_id")
  protected String storeId = null;

  @SerializedName("merchant_id")
  protected String merchantId = null;

  @SerializedName("pin")
  protected String pin = null;

  public UpdateSmartDevicePin storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * General Stores ID
   * @return storeId
  **/
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public UpdateSmartDevicePin merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * General Merchants ID
   * @return merchantId
  **/
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public UpdateSmartDevicePin pin(String pin) {
    this.pin = pin;
    return this;
  }

   /**
   * The pin to store
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
    UpdateSmartDevicePin updateSmartDevicePin = (UpdateSmartDevicePin) o;
    return Objects.equals(this.storeId, updateSmartDevicePin.storeId) &&
        Objects.equals(this.merchantId, updateSmartDevicePin.merchantId) &&
        Objects.equals(this.pin, updateSmartDevicePin.pin);
  }

  @Override
  public int hashCode() {
    return Objects.hash(storeId, merchantId, pin);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UpdateSmartDevicePin {\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
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

