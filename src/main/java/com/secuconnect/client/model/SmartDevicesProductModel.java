package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.CreatedField;
import com.secuconnect.client.model.DeviceStatus;
import com.secuconnect.client.model.ProductInstanceUID;
import com.secuconnect.client.model.SmartDevicesDevice;
import com.secuconnect.client.model.SmartDevicesProducts;
import com.secuconnect.client.model.Store;
import com.secuconnect.client.model.UpdatedField;
import java.util.Objects;

/**
 * Smart Device
 */
public class SmartDevicesProductModel extends BaseProductModel {
  @SerializedName("l")
  protected Integer l = null;

  @SerializedName("k")
  protected Integer k = null;

  @SerializedName("ks")
  protected String ks = null;

  @SerializedName("c")
  protected Integer c = null;

  @SerializedName("s")
  protected Integer s = null;

  @SerializedName("t")
  protected AggregationTimeResult t = null;

  @SerializedName("created")
  protected String created = null;

  @SerializedName("updated")
  protected String updated = null;

  @SerializedName("merchant")
  protected ProductInstanceUID merchant = null;

  @SerializedName("store")
  protected Store store = null;

  @SerializedName("contract")
  protected ProductInstanceUID contract = null;

  @SerializedName("vendor")
  protected String vendor = null;

  @SerializedName("vendor_uid")
  protected String vendorUid = null;

  @SerializedName("type")
  protected String type = null;

  @SerializedName("device")
  protected SmartDevicesDevice device = null;

  @SerializedName("routing")
  protected ProductInstanceUID routing = null;

  @SerializedName("user_pin")
  protected String userPin = null;

  @SerializedName("products")
  protected SmartDevicesProducts products = null;

  @SerializedName("description")
  protected String description = null;

  @SerializedName("tid")
  protected String tid = null;

  @SerializedName("idle_screen_register")
  protected String idleScreenRegister = null;

  @SerializedName("idle_screen_terminal")
  protected String idleScreenTerminal = null;

  @SerializedName("online")
  protected Boolean online = null;

  @SerializedName("refresh")
  protected Integer refresh = null;

  @SerializedName("connection_type")
  protected String connectionType = null;

  @SerializedName("terminal_type")
  protected String terminalType = null;

  @SerializedName("base_version")
  protected String baseVersion = null;

  @SerializedName("status")
  protected DeviceStatus status = null;

  public SmartDevicesProductModel l(Integer l) {
    this.l = l;
    return this;
  }

   /**
   * lookup index
   * @return l
  **/
  public Integer getL() {
    return l;
  }

  public void setL(Integer l) {
    this.l = l;
  }

  public SmartDevicesProductModel k(Integer k) {
    this.k = k;
    return this;
  }

   /**
   * key index
   * @return k
  **/
  public Integer getK() {
    return k;
  }

  public void setK(Integer k) {
    this.k = k;
  }

  public SmartDevicesProductModel ks(String ks) {
    this.ks = ks;
    return this;
  }

   /**
   * key name
   * @return ks
  **/
  public String getKs() {
    return ks;
  }

  public void setKs(String ks) {
    this.ks = ks;
  }

  public SmartDevicesProductModel c(Integer c) {
    this.c = c;
    return this;
  }

   /**
   * count (number of items)
   * @return c
  **/
  public Integer getC() {
    return c;
  }

  public void setC(Integer c) {
    this.c = c;
  }

  public SmartDevicesProductModel s(Integer s) {
    this.s = s;
    return this;
  }

   /**
   * sum
   * @return s
  **/
  public Integer getS() {
    return s;
  }

  public void setS(Integer s) {
    this.s = s;
  }

  public SmartDevicesProductModel t(AggregationTimeResult t) {
    this.t = t;
    return this;
  }

   /**
   * Get t
   * @return t
  **/
  public AggregationTimeResult getT() {
    return t;
  }

  public void setT(AggregationTimeResult t) {
    this.t = t;
  }

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

  public SmartDevicesProductModel updated(String updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
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
   * Vendor, examples:  - &#x60;ingenico&#x60; - &#x60;nodis&#x60; - &#x60;ccv&#x60; - &#x60;3pos&#x60; - &#x60;flour&#x60; - &#x60;pios&#x60; - &#x60;shopware&#x60; - &#x60;loyalty_webterminal&#x60; - &#x60;android&#x60;
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
   * Vendor UID
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
   * Type:  - &#x60;cashier&#x60; - &#x60;zvt&#x60; - &#x60;shopmodule&#x60; - &#x60;webterminal&#x60;
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
   * PIN / user code
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
   * Device description
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
   * Whether the device is online
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

  public SmartDevicesProductModel connectionType(String connectionType) {
    this.connectionType = connectionType;
    return this;
  }

   /**
   * Connection type:  - &#x60;https&#x60; - &#x60;stomp&#x60;
   * @return connectionType
  **/
  public String getConnectionType() {
    return connectionType;
  }

  public void setConnectionType(String connectionType) {
    this.connectionType = connectionType;
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

  public SmartDevicesProductModel status(DeviceStatus status) {
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
    SmartDevicesProductModel smartDevicesProductModel = (SmartDevicesProductModel) o;
    return Objects.equals(this.l, smartDevicesProductModel.l) &&
        Objects.equals(this.k, smartDevicesProductModel.k) &&
        Objects.equals(this.ks, smartDevicesProductModel.ks) &&
        Objects.equals(this.c, smartDevicesProductModel.c) &&
        Objects.equals(this.s, smartDevicesProductModel.s) &&
        Objects.equals(this.t, smartDevicesProductModel.t) &&
        Objects.equals(this.created, smartDevicesProductModel.created) &&
        Objects.equals(this.updated, smartDevicesProductModel.updated) &&
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
        Objects.equals(this.connectionType, smartDevicesProductModel.connectionType) &&
        Objects.equals(this.terminalType, smartDevicesProductModel.terminalType) &&
        Objects.equals(this.baseVersion, smartDevicesProductModel.baseVersion) &&
        Objects.equals(this.status, smartDevicesProductModel.status) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, created, updated, merchant, store, contract, vendor, vendorUid, type, device, routing, userPin, products, description, tid, idleScreenRegister, idleScreenTerminal, online, refresh, connectionType, terminalType, baseVersion, status, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDevicesProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    l: ").append(toIndentedString(l)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    ks: ").append(toIndentedString(ks)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
    sb.append("    connectionType: ").append(toIndentedString(connectionType)).append("\n");
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

