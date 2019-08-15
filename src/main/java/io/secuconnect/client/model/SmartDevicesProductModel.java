package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.ProductInstanceUID;
import io.secuconnect.client.model.SmartDevicesDevice;
import io.secuconnect.client.model.SmartDevicesProducts;
import io.secuconnect.client.model.Store;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * SmartDevicesProductModel
 */
public class SmartDevicesProductModel {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("merchant")
  private ProductInstanceUID merchant = null;

  @SerializedName("store")
  private Store store = null;

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

  @SerializedName("idle_screen_register")
  private String idleScreenRegister = null;

  @SerializedName("idle_screen_terminal")
  private String idleScreenTerminal = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("online")
  private Boolean online = null;

  @SerializedName("terminal_type")
  private String terminalType = null;

  @SerializedName("base_version")
  private String baseVersion = null;

  public SmartDevicesProductModel object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of smart device
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public SmartDevicesProductModel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of smart device
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SmartDevicesProductModel merchant(ProductInstanceUID merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Merchant
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
   * Store
   * @return store
  **/
  public Store getStore() {
    return store;
  }

  public void setStore(Store store) {
    this.store = store;
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
   * Device
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
   * Routing
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
   * Products
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

  public SmartDevicesProductModel created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Created at date
   * @return created
  **/
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
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
    return Objects.equals(this.object, smartDevicesProductModel.object) &&
        Objects.equals(this.id, smartDevicesProductModel.id) &&
        Objects.equals(this.merchant, smartDevicesProductModel.merchant) &&
        Objects.equals(this.store, smartDevicesProductModel.store) &&
        Objects.equals(this.vendor, smartDevicesProductModel.vendor) &&
        Objects.equals(this.vendorUid, smartDevicesProductModel.vendorUid) &&
        Objects.equals(this.type, smartDevicesProductModel.type) &&
        Objects.equals(this.device, smartDevicesProductModel.device) &&
        Objects.equals(this.routing, smartDevicesProductModel.routing) &&
        Objects.equals(this.userPin, smartDevicesProductModel.userPin) &&
        Objects.equals(this.products, smartDevicesProductModel.products) &&
        Objects.equals(this.description, smartDevicesProductModel.description) &&
        Objects.equals(this.idleScreenRegister, smartDevicesProductModel.idleScreenRegister) &&
        Objects.equals(this.idleScreenTerminal, smartDevicesProductModel.idleScreenTerminal) &&
        Objects.equals(this.created, smartDevicesProductModel.created) &&
        Objects.equals(this.online, smartDevicesProductModel.online) &&
        Objects.equals(this.terminalType, smartDevicesProductModel.terminalType) &&
        Objects.equals(this.baseVersion, smartDevicesProductModel.baseVersion);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, merchant, store, vendor, vendorUid, type, device, routing, userPin, products, description, idleScreenRegister, idleScreenTerminal, created, online, terminalType, baseVersion);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDevicesProductModel {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    vendorUid: ").append(toIndentedString(vendorUid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    device: ").append(toIndentedString(device)).append("\n");
    sb.append("    routing: ").append(toIndentedString(routing)).append("\n");
    sb.append("    userPin: ").append(toIndentedString(userPin)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    idleScreenRegister: ").append(toIndentedString(idleScreenRegister)).append("\n");
    sb.append("    idleScreenTerminal: ").append(toIndentedString(idleScreenTerminal)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    online: ").append(toIndentedString(online)).append("\n");
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

