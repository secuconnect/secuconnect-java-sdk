package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.CreatedField;
import com.secuconnect.client.model.ProductInstanceUID;
import com.secuconnect.client.model.SmartDevicesDevice;
import com.secuconnect.client.model.SmartDevicesProducts;
import com.secuconnect.client.model.Store;
import java.util.Objects;

/**
 * SmartDevicesProductModel
 */
public class SmartDevicesProductModel extends BaseProductModel {
  @SerializedName("created")
  private String created = null;

  @SerializedName("merchant")
  private ProductInstanceUID merchant = null;

  @SerializedName("store")
  private Store store = null;

  @SerializedName("contract")
  private ProductInstanceUID contract = null;

  @SerializedName("vendor")
  private String vendor = null;

  @SerializedName("vendor_uid")
  private String vendorUid = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("device")
  private SmartDevicesDevice device = null;

  @SerializedName("routing")
  private ProductInstanceUID routing = null;

  @SerializedName("user_pin")
  private String userPin = null;

  @SerializedName("products")
  private SmartDevicesProducts products = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("tid")
  private String tid = null;

  @SerializedName("idle_screen_register")
  private String idleScreenRegister = null;

  @SerializedName("idle_screen_terminal")
  private String idleScreenTerminal = null;

  @SerializedName("online")
  private Boolean online = null;

  @SerializedName("refresh")
  private Integer refresh = null;

  @SerializedName("terminal_type")
  private String terminalType = null;

  @SerializedName("base_version")
  private String baseVersion = null;

  public SmartDevicesProductModel created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public SmartDevicesProductModel merchant(ProductInstanceUID merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  public ProductInstanceUID getMerchant() {
    return merchant;
  }

  public void setMerchant(ProductInstanceUID merchant) {
    this.merchant = merchant;
  }

  public SmartDevicesProductModel store(Store store) {
    this.store = store;
    return this;
  }

   /**
   * Get store
   * @return store
  **/
  public Store getStore() {
    return store;
  }

  public void setStore(Store store) {
    this.store = store;
  }

  public SmartDevicesProductModel contract(ProductInstanceUID contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  public ProductInstanceUID getContract() {
    return contract;
  }

  public void setContract(ProductInstanceUID contract) {
    this.contract = contract;
  }

  public SmartDevicesProductModel vendor(String vendor) {
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

  public SmartDevicesProductModel vendorUid(String vendorUid) {
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

  public SmartDevicesProductModel type(String type) {
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

  public SmartDevicesProductModel device(SmartDevicesDevice device) {
    this.device = device;
    return this;
  }

   /**
   * Get device
   * @return device
  **/
  public SmartDevicesDevice getDevice() {
    return device;
  }

  public void setDevice(SmartDevicesDevice device) {
    this.device = device;
  }

  public SmartDevicesProductModel routing(ProductInstanceUID routing) {
    this.routing = routing;
    return this;
  }

   /**
   * Get routing
   * @return routing
  **/
  public ProductInstanceUID getRouting() {
    return routing;
  }

  public void setRouting(ProductInstanceUID routing) {
    this.routing = routing;
  }

  public SmartDevicesProductModel userPin(String userPin) {
    this.userPin = userPin;
    return this;
  }

   /**
   * User pin
   * @return userPin
  **/
  public String getUserPin() {
    return userPin;
  }

  public void setUserPin(String userPin) {
    this.userPin = userPin;
  }

  public SmartDevicesProductModel products(SmartDevicesProducts products) {
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

  public SmartDevicesProductModel description(String description) {
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

  public SmartDevicesProductModel tid(String tid) {
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

  public SmartDevicesProductModel idleScreenRegister(String idleScreenRegister) {
    this.idleScreenRegister = idleScreenRegister;
    return this;
  }

   /**
   * Idle screen register
   * @return idleScreenRegister
  **/
  public String getIdleScreenRegister() {
    return idleScreenRegister;
  }

  public void setIdleScreenRegister(String idleScreenRegister) {
    this.idleScreenRegister = idleScreenRegister;
  }

  public SmartDevicesProductModel idleScreenTerminal(String idleScreenTerminal) {
    this.idleScreenTerminal = idleScreenTerminal;
    return this;
  }

   /**
   * Idle screen terminal
   * @return idleScreenTerminal
  **/
  public String getIdleScreenTerminal() {
    return idleScreenTerminal;
  }

  public void setIdleScreenTerminal(String idleScreenTerminal) {
    this.idleScreenTerminal = idleScreenTerminal;
  }

  public SmartDevicesProductModel online(Boolean online) {
    this.online = online;
    return this;
  }

   /**
   * Online
   * @return online
  **/
  public Boolean getOnline() {
    return online;
  }

  public void setOnline(Boolean online) {
    this.online = online;
  }

  public SmartDevicesProductModel refresh(Integer refresh) {
    this.refresh = refresh;
    return this;
  }

   /**
   * Last refresh timestamp
   * @return refresh
  **/
  public Integer getRefresh() {
    return refresh;
  }

  public void setRefresh(Integer refresh) {
    this.refresh = refresh;
  }

  public SmartDevicesProductModel terminalType(String terminalType) {
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

  public SmartDevicesProductModel baseVersion(String baseVersion) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDevicesProductModel smartDevicesProductModel = (SmartDevicesProductModel) o;
    return Objects.equals(this.created, smartDevicesProductModel.created) &&
        Objects.equals(this.merchant, smartDevicesProductModel.merchant) &&
        Objects.equals(this.store, smartDevicesProductModel.store) &&
        Objects.equals(this.contract, smartDevicesProductModel.contract) &&
        Objects.equals(this.vendor, smartDevicesProductModel.vendor) &&
        Objects.equals(this.vendorUid, smartDevicesProductModel.vendorUid) &&
        Objects.equals(this.type, smartDevicesProductModel.type) &&
        Objects.equals(this.device, smartDevicesProductModel.device) &&
        Objects.equals(this.routing, smartDevicesProductModel.routing) &&
        Objects.equals(this.userPin, smartDevicesProductModel.userPin) &&
        Objects.equals(this.products, smartDevicesProductModel.products) &&
        Objects.equals(this.description, smartDevicesProductModel.description) &&
        Objects.equals(this.tid, smartDevicesProductModel.tid) &&
        Objects.equals(this.idleScreenRegister, smartDevicesProductModel.idleScreenRegister) &&
        Objects.equals(this.idleScreenTerminal, smartDevicesProductModel.idleScreenTerminal) &&
        Objects.equals(this.online, smartDevicesProductModel.online) &&
        Objects.equals(this.refresh, smartDevicesProductModel.refresh) &&
        Objects.equals(this.terminalType, smartDevicesProductModel.terminalType) &&
        Objects.equals(this.baseVersion, smartDevicesProductModel.baseVersion) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, merchant, store, contract, vendor, vendorUid, type, device, routing, userPin, products, description, tid, idleScreenRegister, idleScreenTerminal, online, refresh, terminalType, baseVersion, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDevicesProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    vendorUid: ").append(toIndentedString(vendorUid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    routing: ").append(toIndentedString(routing)).append("\n");
    sb.append("    userPin: ").append(toIndentedString(userPin)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    idleScreenRegister: ").append(toIndentedString(idleScreenRegister)).append("\n");
    sb.append("    idleScreenTerminal: ").append(toIndentedString(idleScreenTerminal)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
    sb.append("    refresh: ").append(toIndentedString(refresh)).append("\n");
    sb.append("    terminalType: ").append(toIndentedString(terminalType)).append("\n");
    sb.append("    baseVersion: ").append(toIndentedString(baseVersion)).append("\n");
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

