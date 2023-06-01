package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.CreatedField;
import com.secuconnect.client.model.ItemGroup;
import com.secuconnect.client.model.PrepaidSalesItem;
import com.secuconnect.client.model.PrepaidSalesSmartDevice;
import com.secuconnect.client.model.ProductInstanceUID;
import com.secuconnect.client.model.Store;
import java.util.Objects;

/**
 * PrepaidSalesProductModel
 */
public class PrepaidSalesProductModel extends BaseProductModel {
  @SerializedName("created")
  protected String created = null;

  @SerializedName("status")
  protected String status = null;

  @SerializedName("type")
  protected String type = null;

  @SerializedName("stock")
  protected ProductInstanceUID stock = null;

  @SerializedName("item")
  protected PrepaidSalesItem item = null;

  @SerializedName("itemgroup")
  protected ItemGroup itemgroup = null;

  @SerializedName("smart_device")
  protected PrepaidSalesSmartDevice smartDevice = null;

  @SerializedName("merchant")
  protected ProductInstanceUID merchant = null;

  @SerializedName("store")
  protected Store store = null;

  @SerializedName("contract")
  protected ProductInstanceUID contract = null;

  @SerializedName("demo")
  protected Boolean demo = null;

  @SerializedName("description")
  protected String description = null;

  @SerializedName("amount")
  protected Integer amount = null;

  @SerializedName("currency")
  protected String currency = null;

  @SerializedName("commission")
  protected Integer commission = null;

  @SerializedName("commission_currency")
  protected String commissionCurrency = null;

  @SerializedName("code")
  protected String code = null;

  @SerializedName("serial")
  protected String serial = null;

  @SerializedName("cardnumber")
  protected String cardnumber = null;

  @SerializedName("expire_date")
  protected String expireDate = null;

  @SerializedName("provider_delivery_number")
  protected String providerDeliveryNumber = null;

  @SerializedName("receipt_header")
  protected String receiptHeader = null;

  @SerializedName("receipt_customer")
  protected String receiptCustomer = null;

  @SerializedName("receipt_zvt")
  protected String receiptZvt = null;

  @SerializedName("receipt_dealer")
  protected String receiptDealer = null;

  @SerializedName("vtc_tid")
  protected String vtcTid = null;

  @SerializedName("vtc_id")
  protected String vtcId = null;

  @SerializedName("password")
  protected String password = null;

  public PrepaidSalesProductModel created(String created) {
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

  public PrepaidSalesProductModel status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PrepaidSalesProductModel type(String type) {
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

  public PrepaidSalesProductModel stock(ProductInstanceUID stock) {
    this.stock = stock;
    return this;
  }

   /**
   * Get stock
   * @return stock
  **/
  public ProductInstanceUID getStock() {
    return stock;
  }

  public void setStock(ProductInstanceUID stock) {
    this.stock = stock;
  }

  public PrepaidSalesProductModel item(PrepaidSalesItem item) {
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  public PrepaidSalesItem getItem() {
    return item;
  }

  public void setItem(PrepaidSalesItem item) {
    this.item = item;
  }

  public PrepaidSalesProductModel itemgroup(ItemGroup itemgroup) {
    this.itemgroup = itemgroup;
    return this;
  }

   /**
   * Get itemgroup
   * @return itemgroup
  **/
  public ItemGroup getItemgroup() {
    return itemgroup;
  }

  public void setItemgroup(ItemGroup itemgroup) {
    this.itemgroup = itemgroup;
  }

  public PrepaidSalesProductModel smartDevice(PrepaidSalesSmartDevice smartDevice) {
    this.smartDevice = smartDevice;
    return this;
  }

   /**
   * Get smartDevice
   * @return smartDevice
  **/
  public PrepaidSalesSmartDevice getSmartDevice() {
    return smartDevice;
  }

  public void setSmartDevice(PrepaidSalesSmartDevice smartDevice) {
    this.smartDevice = smartDevice;
  }

  public PrepaidSalesProductModel merchant(ProductInstanceUID merchant) {
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

  public PrepaidSalesProductModel store(Store store) {
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

  public PrepaidSalesProductModel contract(ProductInstanceUID contract) {
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

  public PrepaidSalesProductModel demo(Boolean demo) {
    this.demo = demo;
    return this;
  }

   /**
   * Demo
   * @return demo
  **/
  public Boolean getDemo() {
    return demo;
  }

  public void setDemo(Boolean demo) {
    this.demo = demo;
  }

  public PrepaidSalesProductModel description(String description) {
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

  public PrepaidSalesProductModel amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public PrepaidSalesProductModel currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * Get currency
   * @return currency
  **/
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public PrepaidSalesProductModel commission(Integer commission) {
    this.commission = commission;
    return this;
  }

   /**
   * Commission
   * @return commission
  **/
  public Integer getCommission() {
    return commission;
  }

  public void setCommission(Integer commission) {
    this.commission = commission;
  }

  public PrepaidSalesProductModel commissionCurrency(String commissionCurrency) {
    this.commissionCurrency = commissionCurrency;
    return this;
  }

   /**
   * Commission currency
   * @return commissionCurrency
  **/
  public String getCommissionCurrency() {
    return commissionCurrency;
  }

  public void setCommissionCurrency(String commissionCurrency) {
    this.commissionCurrency = commissionCurrency;
  }

  public PrepaidSalesProductModel code(String code) {
    this.code = code;
    return this;
  }

   /**
   * Code
   * @return code
  **/
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public PrepaidSalesProductModel serial(String serial) {
    this.serial = serial;
    return this;
  }

   /**
   * Serial
   * @return serial
  **/
  public String getSerial() {
    return serial;
  }

  public void setSerial(String serial) {
    this.serial = serial;
  }

  public PrepaidSalesProductModel cardnumber(String cardnumber) {
    this.cardnumber = cardnumber;
    return this;
  }

   /**
   * Card number
   * @return cardnumber
  **/
  public String getCardnumber() {
    return cardnumber;
  }

  public void setCardnumber(String cardnumber) {
    this.cardnumber = cardnumber;
  }

  public PrepaidSalesProductModel expireDate(String expireDate) {
    this.expireDate = expireDate;
    return this;
  }

   /**
   * Expire date
   * @return expireDate
  **/
  public String getExpireDate() {
    return expireDate;
  }

  public void setExpireDate(String expireDate) {
    this.expireDate = expireDate;
  }

  public PrepaidSalesProductModel providerDeliveryNumber(String providerDeliveryNumber) {
    this.providerDeliveryNumber = providerDeliveryNumber;
    return this;
  }

   /**
   * Provider delivery number
   * @return providerDeliveryNumber
  **/
  public String getProviderDeliveryNumber() {
    return providerDeliveryNumber;
  }

  public void setProviderDeliveryNumber(String providerDeliveryNumber) {
    this.providerDeliveryNumber = providerDeliveryNumber;
  }

  public PrepaidSalesProductModel receiptHeader(String receiptHeader) {
    this.receiptHeader = receiptHeader;
    return this;
  }

   /**
   * Receipt header
   * @return receiptHeader
  **/
  public String getReceiptHeader() {
    return receiptHeader;
  }

  public void setReceiptHeader(String receiptHeader) {
    this.receiptHeader = receiptHeader;
  }

  public PrepaidSalesProductModel receiptCustomer(String receiptCustomer) {
    this.receiptCustomer = receiptCustomer;
    return this;
  }

   /**
   * Receipt customer
   * @return receiptCustomer
  **/
  public String getReceiptCustomer() {
    return receiptCustomer;
  }

  public void setReceiptCustomer(String receiptCustomer) {
    this.receiptCustomer = receiptCustomer;
  }

  public PrepaidSalesProductModel receiptZvt(String receiptZvt) {
    this.receiptZvt = receiptZvt;
    return this;
  }

   /**
   * Receipt zvt
   * @return receiptZvt
  **/
  public String getReceiptZvt() {
    return receiptZvt;
  }

  public void setReceiptZvt(String receiptZvt) {
    this.receiptZvt = receiptZvt;
  }

  public PrepaidSalesProductModel receiptDealer(String receiptDealer) {
    this.receiptDealer = receiptDealer;
    return this;
  }

   /**
   * Receipt dealer
   * @return receiptDealer
  **/
  public String getReceiptDealer() {
    return receiptDealer;
  }

  public void setReceiptDealer(String receiptDealer) {
    this.receiptDealer = receiptDealer;
  }

  public PrepaidSalesProductModel vtcTid(String vtcTid) {
    this.vtcTid = vtcTid;
    return this;
  }

   /**
   * Vtc tid
   * @return vtcTid
  **/
  public String getVtcTid() {
    return vtcTid;
  }

  public void setVtcTid(String vtcTid) {
    this.vtcTid = vtcTid;
  }

  public PrepaidSalesProductModel vtcId(String vtcId) {
    this.vtcId = vtcId;
    return this;
  }

   /**
   * Vtc id
   * @return vtcId
  **/
  public String getVtcId() {
    return vtcId;
  }

  public void setVtcId(String vtcId) {
    this.vtcId = vtcId;
  }

  public PrepaidSalesProductModel password(String password) {
    this.password = password;
    return this;
  }

   /**
   * Password
   * @return password
  **/
  public String getPassword() {
    return password;
  }

  public void setPassword(String password) {
    this.password = password;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrepaidSalesProductModel prepaidSalesProductModel = (PrepaidSalesProductModel) o;
    return Objects.equals(this.created, prepaidSalesProductModel.created) &&
        Objects.equals(this.status, prepaidSalesProductModel.status) &&
        Objects.equals(this.type, prepaidSalesProductModel.type) &&
        Objects.equals(this.stock, prepaidSalesProductModel.stock) &&
        Objects.equals(this.item, prepaidSalesProductModel.item) &&
        Objects.equals(this.itemgroup, prepaidSalesProductModel.itemgroup) &&
        Objects.equals(this.smartDevice, prepaidSalesProductModel.smartDevice) &&
        Objects.equals(this.merchant, prepaidSalesProductModel.merchant) &&
        Objects.equals(this.store, prepaidSalesProductModel.store) &&
        Objects.equals(this.contract, prepaidSalesProductModel.contract) &&
        Objects.equals(this.demo, prepaidSalesProductModel.demo) &&
        Objects.equals(this.description, prepaidSalesProductModel.description) &&
        Objects.equals(this.amount, prepaidSalesProductModel.amount) &&
        Objects.equals(this.currency, prepaidSalesProductModel.currency) &&
        Objects.equals(this.commission, prepaidSalesProductModel.commission) &&
        Objects.equals(this.commissionCurrency, prepaidSalesProductModel.commissionCurrency) &&
        Objects.equals(this.code, prepaidSalesProductModel.code) &&
        Objects.equals(this.serial, prepaidSalesProductModel.serial) &&
        Objects.equals(this.cardnumber, prepaidSalesProductModel.cardnumber) &&
        Objects.equals(this.expireDate, prepaidSalesProductModel.expireDate) &&
        Objects.equals(this.providerDeliveryNumber, prepaidSalesProductModel.providerDeliveryNumber) &&
        Objects.equals(this.receiptHeader, prepaidSalesProductModel.receiptHeader) &&
        Objects.equals(this.receiptCustomer, prepaidSalesProductModel.receiptCustomer) &&
        Objects.equals(this.receiptZvt, prepaidSalesProductModel.receiptZvt) &&
        Objects.equals(this.receiptDealer, prepaidSalesProductModel.receiptDealer) &&
        Objects.equals(this.vtcTid, prepaidSalesProductModel.vtcTid) &&
        Objects.equals(this.vtcId, prepaidSalesProductModel.vtcId) &&
        Objects.equals(this.password, prepaidSalesProductModel.password) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, status, type, stock, item, itemgroup, smartDevice, merchant, store, contract, demo, description, amount, currency, commission, commissionCurrency, code, serial, cardnumber, expireDate, providerDeliveryNumber, receiptHeader, receiptCustomer, receiptZvt, receiptDealer, vtcTid, vtcId, password, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepaidSalesProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    itemgroup: ").append(toIndentedString(itemgroup)).append("\n");
    sb.append("    smartDevice: ").append(toIndentedString(smartDevice)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    demo: ").append(toIndentedString(demo)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    commission: ").append(toIndentedString(commission)).append("\n");
    sb.append("    commissionCurrency: ").append(toIndentedString(commissionCurrency)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    serial: ").append(toIndentedString(serial)).append("\n");
    sb.append("    cardnumber: ").append(toIndentedString(cardnumber)).append("\n");
    sb.append("    expireDate: ").append(toIndentedString(expireDate)).append("\n");
    sb.append("    providerDeliveryNumber: ").append(toIndentedString(providerDeliveryNumber)).append("\n");
    sb.append("    receiptHeader: ").append(toIndentedString(receiptHeader)).append("\n");
    sb.append("    receiptCustomer: ").append(toIndentedString(receiptCustomer)).append("\n");
    sb.append("    receiptZvt: ").append(toIndentedString(receiptZvt)).append("\n");
    sb.append("    receiptDealer: ").append(toIndentedString(receiptDealer)).append("\n");
    sb.append("    vtcTid: ").append(toIndentedString(vtcTid)).append("\n");
    sb.append("    vtcId: ").append(toIndentedString(vtcId)).append("\n");
    sb.append("    password: ").append(toIndentedString(password)).append("\n");
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

