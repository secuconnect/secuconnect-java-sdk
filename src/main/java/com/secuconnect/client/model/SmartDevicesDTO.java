package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.DeviceStatus;
import com.secuconnect.client.model.SmartDevicesProducts;
import java.util.Objects;

/**
 * SmartDevicesDTO
 */
public class SmartDevicesDTO {
  @SerializedName("merchant")
  protected String merchant = null;

  @SerializedName("store")
  protected String store = null;

  @SerializedName("device")
  protected String device = null;

  @SerializedName("contract")
  protected String contract = null;

  @SerializedName("vendor")
  protected String vendor = null;

  @SerializedName("vendor_uid")
  protected String vendorUid = null;

  @SerializedName("type")
  protected String type = null;

  @SerializedName("description")
  protected String description = null;

  @SerializedName("tid")
  protected String tid = null;

  @SerializedName("products")
  protected SmartDevicesProducts products = null;

  @SerializedName("terminal_type")
  protected String terminalType = null;

  @SerializedName("base_version")
  protected String baseVersion = null;

  @SerializedName("status")
  protected DeviceStatus status = null;

  public SmartDevicesDTO merchant(String merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Merchant
   * @return merchant
  **/
  public String getMerchant() {
    return merchant;
  }

  public void setMerchant(String merchant) {
    this.merchant = merchant;
  }

  public SmartDevicesDTO store(String store) {
    this.store = store;
    return this;
  }

   /**
   * Store
   * @return store
  **/
  public String getStore() {
    return store;
  }

  public void setStore(String store) {
    this.store = store;
  }

  public SmartDevicesDTO device(String device) {
    this.device = device;
    return this;
  }

   /**
   * Device
   * @return device
  **/
  public String getDevice() {
    return device;
  }

  public void setDevice(String device) {
    this.device = device;
  }

  public SmartDevicesDTO contract(String contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Contract
   * @return contract
  **/
  public String getContract() {
    return contract;
  }

  public void setContract(String contract) {
    this.contract = contract;
  }

  public SmartDevicesDTO vendor(String vendor) {
    this.vendor = vendor;
    return this;
  }

   /**
   * Vendor
   * @return vendor
  **/
  public String getVendor() {
    return vendor;
  }

  public void setVendor(String vendor) {
    this.vendor = vendor;
  }

  public SmartDevicesDTO vendorUid(String vendorUid) {
    this.vendorUid = vendorUid;
    return this;
  }

   /**
   * Vendor uid
   * @return vendorUid
  **/
  public String getVendorUid() {
    return vendorUid;
  }

  public void setVendorUid(String vendorUid) {
    this.vendorUid = vendorUid;
  }

  public SmartDevicesDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SmartDevicesDTO description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SmartDevicesDTO tid(String tid) {
    this.tid = tid;
    return this;
  }

   /**
   * TID
   * @return tid
  **/
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public SmartDevicesDTO products(SmartDevicesProducts products) {
    this.products = products;
    return this;
  }

   /**
   * Get products
   * @return products
  **/
  public SmartDevicesProducts getProducts() {
    return products;
  }

  public void setProducts(SmartDevicesProducts products) {
    this.products = products;
  }

  public SmartDevicesDTO terminalType(String terminalType) {
    this.terminalType = terminalType;
    return this;
  }

   /**
   * Terminal type
   * @return terminalType
  **/
  public String getTerminalType() {
    return terminalType;
  }

  public void setTerminalType(String terminalType) {
    this.terminalType = terminalType;
  }

  public SmartDevicesDTO baseVersion(String baseVersion) {
    this.baseVersion = baseVersion;
    return this;
  }

   /**
   * Base version
   * @return baseVersion
  **/
  public String getBaseVersion() {
    return baseVersion;
  }

  public void setBaseVersion(String baseVersion) {
    this.baseVersion = baseVersion;
  }

  public SmartDevicesDTO status(DeviceStatus status) {
    this.status = status;
    return this;
  }

   /**
   * Get status
   * @return status
  **/
  public DeviceStatus getStatus() {
    return status;
  }

  public void setStatus(DeviceStatus status) {
    this.status = status;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDevicesDTO smartDevicesDTO = (SmartDevicesDTO) o;
    return Objects.equals(this.merchant, smartDevicesDTO.merchant) &&
        Objects.equals(this.store, smartDevicesDTO.store) &&
        Objects.equals(this.device, smartDevicesDTO.device) &&
        Objects.equals(this.contract, smartDevicesDTO.contract) &&
        Objects.equals(this.vendor, smartDevicesDTO.vendor) &&
        Objects.equals(this.vendorUid, smartDevicesDTO.vendorUid) &&
        Objects.equals(this.type, smartDevicesDTO.type) &&
        Objects.equals(this.description, smartDevicesDTO.description) &&
        Objects.equals(this.tid, smartDevicesDTO.tid) &&
        Objects.equals(this.products, smartDevicesDTO.products) &&
        Objects.equals(this.terminalType, smartDevicesDTO.terminalType) &&
        Objects.equals(this.baseVersion, smartDevicesDTO.baseVersion) &&
        Objects.equals(this.status, smartDevicesDTO.status);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchant, store, device, contract, vendor, vendorUid, type, description, tid, products, terminalType, baseVersion, status);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDevicesDTO {\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    vendorUid: ").append(toIndentedString(vendorUid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    terminalType: ").append(toIndentedString(terminalType)).append("\n");
    sb.append("    baseVersion: ").append(toIndentedString(baseVersion)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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

