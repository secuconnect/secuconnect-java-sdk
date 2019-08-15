package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.ItemGroup;
import io.secuconnect.client.model.PrepaidSalesItem;
import io.secuconnect.client.model.PrepaidSalesSmartDevice;
import io.secuconnect.client.model.ProductInstanceUID;
import io.secuconnect.client.model.Store;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * PrepaidSalesProductModel
 */
public class PrepaidSalesProductModel {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("stock")
  private ProductInstanceUID stock = null;

  @SerializedName("item")
  private PrepaidSalesItem item = null;

  @SerializedName("itemgroup")
  private ItemGroup itemgroup = null;

  @SerializedName("smart_device")
  private PrepaidSalesSmartDevice smartDevice = null;

  @SerializedName("merchant")
  private ProductInstanceUID merchant = null;

  @SerializedName("store")
  private Store store = null;

  @SerializedName("contract")
  private ProductInstanceUID contract = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("demo")
  private Boolean demo = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("commission")
  private Integer commission = null;

  @SerializedName("commission_currency")
  private String commissionCurrency = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("serial")
  private String serial = null;

  @SerializedName("cardnumber")
  private String cardnumber = null;

  @SerializedName("expire_date")
  private String expireDate = null;

  @SerializedName("provider_delivery_number")
  private String providerDeliveryNumber = null;

  @SerializedName("receipt_header")
  private String receiptHeader = null;

  @SerializedName("receipt_customer")
  private String receiptCustomer = null;

  @SerializedName("receipt_zvt")
  private String receiptZvt = null;

  @SerializedName("receipt_dealer")
  private String receiptDealer = null;

  @SerializedName("vtc_tid")
  private String vtcTid = null;

  public PrepaidSalesProductModel object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of prepaid sale
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public PrepaidSalesProductModel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of prepaid sale
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
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

  public PrepaidSalesProductModel stock(ProductInstanceUID stock) {
    this.stock = stock;
    return this;
  }

   /**
   * Prepaid stock
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
   * Prepaid item
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
   * Prepaid item group
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
   * Smart device
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
   * General merchant
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
   * General store
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
   * Prepaid contract
   * @return contract
  **/
  public ProductInstanceUID getContract() {
    return contract;
  }

  public void setContract(ProductInstanceUID contract) {
    this.contract = contract;
  }

  public PrepaidSalesProductModel created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Prepaid sale creation date
   * @return created
  **/
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
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
   * Amount
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
   * Currency
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrepaidSalesProductModel prepaidSalesProductModel = (PrepaidSalesProductModel) o;
    return Objects.equals(this.object, prepaidSalesProductModel.object) &&
        Objects.equals(this.id, prepaidSalesProductModel.id) &&
        Objects.equals(this.status, prepaidSalesProductModel.status) &&
        Objects.equals(this.stock, prepaidSalesProductModel.stock) &&
        Objects.equals(this.item, prepaidSalesProductModel.item) &&
        Objects.equals(this.itemgroup, prepaidSalesProductModel.itemgroup) &&
        Objects.equals(this.smartDevice, prepaidSalesProductModel.smartDevice) &&
        Objects.equals(this.merchant, prepaidSalesProductModel.merchant) &&
        Objects.equals(this.store, prepaidSalesProductModel.store) &&
        Objects.equals(this.contract, prepaidSalesProductModel.contract) &&
        Objects.equals(this.created, prepaidSalesProductModel.created) &&
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
        Objects.equals(this.vtcTid, prepaidSalesProductModel.vtcTid);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, status, stock, item, itemgroup, smartDevice, merchant, store, contract, created, demo, description, amount, currency, commission, commissionCurrency, code, serial, cardnumber, expireDate, providerDeliveryNumber, receiptHeader, receiptCustomer, receiptZvt, receiptDealer, vtcTid);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepaidSalesProductModel {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    stock: ").append(toIndentedString(stock)).append("\n");
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    itemgroup: ").append(toIndentedString(itemgroup)).append("\n");
    sb.append("    smartDevice: ").append(toIndentedString(smartDevice)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

