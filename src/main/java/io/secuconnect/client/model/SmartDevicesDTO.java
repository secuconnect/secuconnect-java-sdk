package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SmartDevicesDTO
 */
public class SmartDevicesDTO {
  @SerializedName("contract")
  private String contract = null;

  @SerializedName("merchant")
  private String merchant = null;

  @SerializedName("store")
  private String store = null;

  @SerializedName("terminal")
  private String terminal = null;

  @SerializedName("vendor")
  private String vendor = null;

  @SerializedName("vendor_uid")
  private String vendorUid = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("products")
  private List<String> products = null;

  @SerializedName("base_version")
  private String baseVersion = null;

  @SerializedName("terminal_type")
  private String terminalType = null;

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

  public SmartDevicesDTO terminal(String terminal) {
    this.terminal = terminal;
    return this;
  }

   /**
   * Terminal
   * @return terminal
  **/
  public String getTerminal() {
    return terminal;
  }

  public void setTerminal(String terminal) {
    this.terminal = terminal;
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

  public SmartDevicesDTO products(List<String> products) {
    this.products = products;
    return this;
  }

  public SmartDevicesDTO addProductsItem(String productsItem) {
    if (this.products == null) {
      this.products = new ArrayList<String>();
    }
    this.products.add(productsItem);
    return this;
  }

   /**
   * Products
   * @return products
  **/
  public List<String> getProducts() {
    return products;
  }

  public void setProducts(List<String> products) {
    this.products = products;
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDevicesDTO smartDevicesDTO = (SmartDevicesDTO) o;
    return Objects.equals(this.contract, smartDevicesDTO.contract) &&
        Objects.equals(this.merchant, smartDevicesDTO.merchant) &&
        Objects.equals(this.store, smartDevicesDTO.store) &&
        Objects.equals(this.terminal, smartDevicesDTO.terminal) &&
        Objects.equals(this.vendor, smartDevicesDTO.vendor) &&
        Objects.equals(this.vendorUid, smartDevicesDTO.vendorUid) &&
        Objects.equals(this.type, smartDevicesDTO.type) &&
        Objects.equals(this.description, smartDevicesDTO.description) &&
        Objects.equals(this.products, smartDevicesDTO.products) &&
        Objects.equals(this.baseVersion, smartDevicesDTO.baseVersion) &&
        Objects.equals(this.terminalType, smartDevicesDTO.terminalType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contract, merchant, store, terminal, vendor, vendorUid, type, description, products, baseVersion, terminalType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDevicesDTO {\n");
    
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    terminal: ").append(toIndentedString(terminal)).append("\n");
    sb.append("    vendor: ").append(toIndentedString(vendor)).append("\n");
    sb.append("    vendorUid: ").append(toIndentedString(vendorUid)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    products: ").append(toIndentedString(products)).append("\n");
    sb.append("    baseVersion: ").append(toIndentedString(baseVersion)).append("\n");
    sb.append("    terminalType: ").append(toIndentedString(terminalType)).append("\n");
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

