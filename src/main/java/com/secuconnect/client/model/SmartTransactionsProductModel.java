package com.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.PaymentCustomersProductModel;
import com.secuconnect.client.model.PaymentTransactionsProductModel;
import com.secuconnect.client.model.ProductInstanceUID;
import com.secuconnect.client.model.SmartTransactionsBasket;
import com.secuconnect.client.model.SmartTransactionsBasketInfo;
import com.secuconnect.client.model.SmartTransactionsCheckin;
import com.secuconnect.client.model.SmartTransactionsCheckoutLinks;
import com.secuconnect.client.model.SmartTransactionsIdent;
import com.secuconnect.client.model.SmartTransactionsMerchant;
import com.secuconnect.client.model.SmartTransactionsPickupOptions;
import com.secuconnect.client.model.SmartTransactionsReceipt;
import com.secuconnect.client.model.SmartTransactionsShipmentDetails;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SmartTransactionsProductModel
 */
public class SmartTransactionsProductModel extends BaseProductModel {
  @SerializedName("status")
  private String status = null;

  @SerializedName("merchant")
  private SmartTransactionsMerchant merchant = null;

  @SerializedName("contract")
  private ProductInstanceUID contract = null;

  @SerializedName("provider_contract")
  private ProductInstanceUID providerContract = null;

  @SerializedName("customer")
  private PaymentCustomersProductModel customer = null;

  @SerializedName("shipping_address")
  private PaymentCustomersProductModel shippingAddress = null;

  @SerializedName("container")
  private ProductInstanceUID container = null;

  @SerializedName("checkin")
  private SmartTransactionsCheckin checkin = null;

  @SerializedName("merchantRef")
  private String merchantRef = null;

  @SerializedName("transactionRef")
  private String transactionRef = null;

  @SerializedName("store")
  private ProductInstanceUID store = null;

  @SerializedName("device_source")
  private ProductInstanceUID deviceSource = null;

  @SerializedName("device_destination")
  private ProductInstanceUID deviceDestination = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("updated")
  private String updated = null;

  @SerializedName("receipt_number")
  private Integer receiptNumber = null;

  @SerializedName("receipt")
  private List<SmartTransactionsReceipt> receipt = null;

  @SerializedName("receipt_merchant")
  private List<SmartTransactionsReceipt> receiptMerchant = null;

  @SerializedName("receipt_merchant_print")
  private Boolean receiptMerchantPrint = null;

  @SerializedName("basket_info")
  private SmartTransactionsBasketInfo basketInfo = null;

  @SerializedName("basket")
  private SmartTransactionsBasket basket = null;

  @SerializedName("idents")
  private List<SmartTransactionsIdent> idents = null;

  @SerializedName("tax_rate")
  private Integer taxRate = null;

  @SerializedName("tax_amount")
  private Integer taxAmount = null;

  @SerializedName("cashier")
  private String cashier = null;

  @SerializedName("market")
  private String market = null;

  @SerializedName("order_option")
  private String orderOption = null;

  @SerializedName("pickup_options")
  private SmartTransactionsPickupOptions pickupOptions = null;

  @SerializedName("shipment_details")
  private SmartTransactionsShipmentDetails shipmentDetails = null;

  @SerializedName("product")
  private String product = null;

  @SerializedName("trans_id")
  private Integer transId = null;

  @SerializedName("payment_method")
  private String paymentMethod = null;

  @SerializedName("transactions")
  private List<PaymentTransactionsProductModel> transactions = null;

  @SerializedName("last_visited_page")
  private String lastVisitedPage = null;

  @SerializedName("is_demo")
  private Boolean isDemo = null;

  @SerializedName("checkout_links")
  private SmartTransactionsCheckoutLinks checkoutLinks = null;

  @SerializedName("iframe_url")
  private String iframeUrl = null;

  public SmartTransactionsProductModel status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of smart transaction
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SmartTransactionsProductModel merchant(SmartTransactionsMerchant merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  public SmartTransactionsMerchant getMerchant() {
    return merchant;
  }

  public void setMerchant(SmartTransactionsMerchant merchant) {
    this.merchant = merchant;
  }

  public SmartTransactionsProductModel contract(ProductInstanceUID contract) {
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

  public SmartTransactionsProductModel providerContract(ProductInstanceUID providerContract) {
    this.providerContract = providerContract;
    return this;
  }

   /**
   * Get providerContract
   * @return providerContract
  **/
  public ProductInstanceUID getProviderContract() {
    return providerContract;
  }

  public void setProviderContract(ProductInstanceUID providerContract) {
    this.providerContract = providerContract;
  }

  public SmartTransactionsProductModel customer(PaymentCustomersProductModel customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  public PaymentCustomersProductModel getCustomer() {
    return customer;
  }

  public void setCustomer(PaymentCustomersProductModel customer) {
    this.customer = customer;
  }

  public SmartTransactionsProductModel shippingAddress(PaymentCustomersProductModel shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  public PaymentCustomersProductModel getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(PaymentCustomersProductModel shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public SmartTransactionsProductModel container(ProductInstanceUID container) {
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  public ProductInstanceUID getContainer() {
    return container;
  }

  public void setContainer(ProductInstanceUID container) {
    this.container = container;
  }

  public SmartTransactionsProductModel checkin(SmartTransactionsCheckin checkin) {
    this.checkin = checkin;
    return this;
  }

   /**
   * Get checkin
   * @return checkin
  **/
  public SmartTransactionsCheckin getCheckin() {
    return checkin;
  }

  public void setCheckin(SmartTransactionsCheckin checkin) {
    this.checkin = checkin;
  }

  public SmartTransactionsProductModel merchantRef(String merchantRef) {
    this.merchantRef = merchantRef;
    return this;
  }

   /**
   * Merchant reference
   * @return merchantRef
  **/
  public String getMerchantRef() {
    return merchantRef;
  }

  public void setMerchantRef(String merchantRef) {
    this.merchantRef = merchantRef;
  }

  public SmartTransactionsProductModel transactionRef(String transactionRef) {
    this.transactionRef = transactionRef;
    return this;
  }

   /**
   * Transaction reference
   * @return transactionRef
  **/
  public String getTransactionRef() {
    return transactionRef;
  }

  public void setTransactionRef(String transactionRef) {
    this.transactionRef = transactionRef;
  }

  public SmartTransactionsProductModel store(ProductInstanceUID store) {
    this.store = store;
    return this;
  }

   /**
   * Get store
   * @return store
  **/
  public ProductInstanceUID getStore() {
    return store;
  }

  public void setStore(ProductInstanceUID store) {
    this.store = store;
  }

  public SmartTransactionsProductModel deviceSource(ProductInstanceUID deviceSource) {
    this.deviceSource = deviceSource;
    return this;
  }

   /**
   * Get deviceSource
   * @return deviceSource
  **/
  public ProductInstanceUID getDeviceSource() {
    return deviceSource;
  }

  public void setDeviceSource(ProductInstanceUID deviceSource) {
    this.deviceSource = deviceSource;
  }

  public SmartTransactionsProductModel deviceDestination(ProductInstanceUID deviceDestination) {
    this.deviceDestination = deviceDestination;
    return this;
  }

   /**
   * Get deviceDestination
   * @return deviceDestination
  **/
  public ProductInstanceUID getDeviceDestination() {
    return deviceDestination;
  }

  public void setDeviceDestination(ProductInstanceUID deviceDestination) {
    this.deviceDestination = deviceDestination;
  }

  public SmartTransactionsProductModel created(String created) {
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

  public SmartTransactionsProductModel updated(String updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Updated at date
   * @return updated
  **/
  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  public SmartTransactionsProductModel receiptNumber(Integer receiptNumber) {
    this.receiptNumber = receiptNumber;
    return this;
  }

   /**
   * Receipt number
   * @return receiptNumber
  **/
  public Integer getReceiptNumber() {
    return receiptNumber;
  }

  public void setReceiptNumber(Integer receiptNumber) {
    this.receiptNumber = receiptNumber;
  }

  public SmartTransactionsProductModel receipt(List<SmartTransactionsReceipt> receipt) {
    this.receipt = receipt;
    return this;
  }

  public SmartTransactionsProductModel addReceiptItem(SmartTransactionsReceipt receiptItem) {
    if (this.receipt == null) {
      this.receipt = new ArrayList<SmartTransactionsReceipt>();
    }
    this.receipt.add(receiptItem);
    return this;
  }

   /**
   * Receipt
   * @return receipt
  **/
  public List<SmartTransactionsReceipt> getReceipt() {
    return receipt;
  }

  public void setReceipt(List<SmartTransactionsReceipt> receipt) {
    this.receipt = receipt;
  }

  public SmartTransactionsProductModel receiptMerchant(List<SmartTransactionsReceipt> receiptMerchant) {
    this.receiptMerchant = receiptMerchant;
    return this;
  }

  public SmartTransactionsProductModel addReceiptMerchantItem(SmartTransactionsReceipt receiptMerchantItem) {
    if (this.receiptMerchant == null) {
      this.receiptMerchant = new ArrayList<SmartTransactionsReceipt>();
    }
    this.receiptMerchant.add(receiptMerchantItem);
    return this;
  }

   /**
   * Receipt merchant
   * @return receiptMerchant
  **/
  public List<SmartTransactionsReceipt> getReceiptMerchant() {
    return receiptMerchant;
  }

  public void setReceiptMerchant(List<SmartTransactionsReceipt> receiptMerchant) {
    this.receiptMerchant = receiptMerchant;
  }

  public SmartTransactionsProductModel receiptMerchantPrint(Boolean receiptMerchantPrint) {
    this.receiptMerchantPrint = receiptMerchantPrint;
    return this;
  }

   /**
   * Receipt merchant print
   * @return receiptMerchantPrint
  **/
  public Boolean isReceiptMerchantPrint() {
    return receiptMerchantPrint;
  }

  public void setReceiptMerchantPrint(Boolean receiptMerchantPrint) {
    this.receiptMerchantPrint = receiptMerchantPrint;
  }

  public SmartTransactionsProductModel basketInfo(SmartTransactionsBasketInfo basketInfo) {
    this.basketInfo = basketInfo;
    return this;
  }

   /**
   * Get basketInfo
   * @return basketInfo
  **/
  public SmartTransactionsBasketInfo getBasketInfo() {
    return basketInfo;
  }

  public void setBasketInfo(SmartTransactionsBasketInfo basketInfo) {
    this.basketInfo = basketInfo;
  }

  public SmartTransactionsProductModel basket(SmartTransactionsBasket basket) {
    this.basket = basket;
    return this;
  }

   /**
   * Get basket
   * @return basket
  **/
  public SmartTransactionsBasket getBasket() {
    return basket;
  }

  public void setBasket(SmartTransactionsBasket basket) {
    this.basket = basket;
  }

  public SmartTransactionsProductModel idents(List<SmartTransactionsIdent> idents) {
    this.idents = idents;
    return this;
  }

  public SmartTransactionsProductModel addIdentsItem(SmartTransactionsIdent identsItem) {
    if (this.idents == null) {
      this.idents = new ArrayList<SmartTransactionsIdent>();
    }
    this.idents.add(identsItem);
    return this;
  }

   /**
   * Idents
   * @return idents
  **/
  public List<SmartTransactionsIdent> getIdents() {
    return idents;
  }

  public void setIdents(List<SmartTransactionsIdent> idents) {
    this.idents = idents;
  }

  public SmartTransactionsProductModel taxRate(Integer taxRate) {
    this.taxRate = taxRate;
    return this;
  }

   /**
   * Tax rate
   * @return taxRate
  **/
  public Integer getTaxRate() {
    return taxRate;
  }

  public void setTaxRate(Integer taxRate) {
    this.taxRate = taxRate;
  }

  public SmartTransactionsProductModel taxAmount(Integer taxAmount) {
    this.taxAmount = taxAmount;
    return this;
  }

   /**
   * Tax amount
   * @return taxAmount
  **/
  public Integer getTaxAmount() {
    return taxAmount;
  }

  public void setTaxAmount(Integer taxAmount) {
    this.taxAmount = taxAmount;
  }

  public SmartTransactionsProductModel cashier(String cashier) {
    this.cashier = cashier;
    return this;
  }

   /**
   * Cashier
   * @return cashier
  **/
  public String getCashier() {
    return cashier;
  }

  public void setCashier(String cashier) {
    this.cashier = cashier;
  }

  public SmartTransactionsProductModel market(String market) {
    this.market = market;
    return this;
  }

   /**
   * Market
   * @return market
  **/
  public String getMarket() {
    return market;
  }

  public void setMarket(String market) {
    this.market = market;
  }

  public SmartTransactionsProductModel orderOption(String orderOption) {
    this.orderOption = orderOption;
    return this;
  }

   /**
   * Order option
   * @return orderOption
  **/
  public String getOrderOption() {
    return orderOption;
  }

  public void setOrderOption(String orderOption) {
    this.orderOption = orderOption;
  }

  public SmartTransactionsProductModel pickupOptions(SmartTransactionsPickupOptions pickupOptions) {
    this.pickupOptions = pickupOptions;
    return this;
  }

   /**
   * Get pickupOptions
   * @return pickupOptions
  **/
  public SmartTransactionsPickupOptions getPickupOptions() {
    return pickupOptions;
  }

  public void setPickupOptions(SmartTransactionsPickupOptions pickupOptions) {
    this.pickupOptions = pickupOptions;
  }

  public SmartTransactionsProductModel shipmentDetails(SmartTransactionsShipmentDetails shipmentDetails) {
    this.shipmentDetails = shipmentDetails;
    return this;
  }

   /**
   * Get shipmentDetails
   * @return shipmentDetails
  **/
  public SmartTransactionsShipmentDetails getShipmentDetails() {
    return shipmentDetails;
  }

  public void setShipmentDetails(SmartTransactionsShipmentDetails shipmentDetails) {
    this.shipmentDetails = shipmentDetails;
  }

  public SmartTransactionsProductModel product(String product) {
    this.product = product;
    return this;
  }

   /**
   * Product
   * @return product
  **/
  public String getProduct() {
    return product;
  }

  public void setProduct(String product) {
    this.product = product;
  }

  public SmartTransactionsProductModel transId(Integer transId) {
    this.transId = transId;
    return this;
  }

   /**
   * Transaction id
   * @return transId
  **/
  public Integer getTransId() {
    return transId;
  }

  public void setTransId(Integer transId) {
    this.transId = transId;
  }

  public SmartTransactionsProductModel paymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
    return this;
  }

   /**
   * Payment method
   * @return paymentMethod
  **/
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public void setPaymentMethod(String paymentMethod) {
    this.paymentMethod = paymentMethod;
  }

  public SmartTransactionsProductModel transactions(List<PaymentTransactionsProductModel> transactions) {
    this.transactions = transactions;
    return this;
  }

  public SmartTransactionsProductModel addTransactionsItem(PaymentTransactionsProductModel transactionsItem) {
    if (this.transactions == null) {
      this.transactions = new ArrayList<PaymentTransactionsProductModel>();
    }
    this.transactions.add(transactionsItem);
    return this;
  }

   /**
   * Payment Transactions
   * @return transactions
  **/
  public List<PaymentTransactionsProductModel> getTransactions() {
    return transactions;
  }

  public void setTransactions(List<PaymentTransactionsProductModel> transactions) {
    this.transactions = transactions;
  }

  public SmartTransactionsProductModel lastVisitedPage(String lastVisitedPage) {
    this.lastVisitedPage = lastVisitedPage;
    return this;
  }

   /**
   * Last visited page
   * @return lastVisitedPage
  **/
  public String getLastVisitedPage() {
    return lastVisitedPage;
  }

  public void setLastVisitedPage(String lastVisitedPage) {
    this.lastVisitedPage = lastVisitedPage;
  }

  public SmartTransactionsProductModel isDemo(Boolean isDemo) {
    this.isDemo = isDemo;
    return this;
  }

   /**
   * Demo payment
   * @return isDemo
  **/
  public Boolean isIsDemo() {
    return isDemo;
  }

  public void setIsDemo(Boolean isDemo) {
    this.isDemo = isDemo;
  }

  public SmartTransactionsProductModel checkoutLinks(SmartTransactionsCheckoutLinks checkoutLinks) {
    this.checkoutLinks = checkoutLinks;
    return this;
  }

   /**
   * Get checkoutLinks
   * @return checkoutLinks
  **/
  public SmartTransactionsCheckoutLinks getCheckoutLinks() {
    return checkoutLinks;
  }

  public void setCheckoutLinks(SmartTransactionsCheckoutLinks checkoutLinks) {
    this.checkoutLinks = checkoutLinks;
  }

  public SmartTransactionsProductModel iframeUrl(String iframeUrl) {
    this.iframeUrl = iframeUrl;
    return this;
  }

   /**
   * IFrame URL
   * @return iframeUrl
  **/
  public String getIframeUrl() {
    return iframeUrl;
  }

  public void setIframeUrl(String iframeUrl) {
    this.iframeUrl = iframeUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsProductModel smartTransactionsProductModel = (SmartTransactionsProductModel) o;
    return Objects.equals(this.status, smartTransactionsProductModel.status) &&
        Objects.equals(this.merchant, smartTransactionsProductModel.merchant) &&
        Objects.equals(this.contract, smartTransactionsProductModel.contract) &&
        Objects.equals(this.providerContract, smartTransactionsProductModel.providerContract) &&
        Objects.equals(this.customer, smartTransactionsProductModel.customer) &&
        Objects.equals(this.shippingAddress, smartTransactionsProductModel.shippingAddress) &&
        Objects.equals(this.container, smartTransactionsProductModel.container) &&
        Objects.equals(this.checkin, smartTransactionsProductModel.checkin) &&
        Objects.equals(this.merchantRef, smartTransactionsProductModel.merchantRef) &&
        Objects.equals(this.transactionRef, smartTransactionsProductModel.transactionRef) &&
        Objects.equals(this.store, smartTransactionsProductModel.store) &&
        Objects.equals(this.deviceSource, smartTransactionsProductModel.deviceSource) &&
        Objects.equals(this.deviceDestination, smartTransactionsProductModel.deviceDestination) &&
        Objects.equals(this.created, smartTransactionsProductModel.created) &&
        Objects.equals(this.updated, smartTransactionsProductModel.updated) &&
        Objects.equals(this.receiptNumber, smartTransactionsProductModel.receiptNumber) &&
        Objects.equals(this.receipt, smartTransactionsProductModel.receipt) &&
        Objects.equals(this.receiptMerchant, smartTransactionsProductModel.receiptMerchant) &&
        Objects.equals(this.receiptMerchantPrint, smartTransactionsProductModel.receiptMerchantPrint) &&
        Objects.equals(this.basketInfo, smartTransactionsProductModel.basketInfo) &&
        Objects.equals(this.basket, smartTransactionsProductModel.basket) &&
        Objects.equals(this.idents, smartTransactionsProductModel.idents) &&
        Objects.equals(this.taxRate, smartTransactionsProductModel.taxRate) &&
        Objects.equals(this.taxAmount, smartTransactionsProductModel.taxAmount) &&
        Objects.equals(this.cashier, smartTransactionsProductModel.cashier) &&
        Objects.equals(this.market, smartTransactionsProductModel.market) &&
        Objects.equals(this.orderOption, smartTransactionsProductModel.orderOption) &&
        Objects.equals(this.pickupOptions, smartTransactionsProductModel.pickupOptions) &&
        Objects.equals(this.shipmentDetails, smartTransactionsProductModel.shipmentDetails) &&
        Objects.equals(this.product, smartTransactionsProductModel.product) &&
        Objects.equals(this.transId, smartTransactionsProductModel.transId) &&
        Objects.equals(this.paymentMethod, smartTransactionsProductModel.paymentMethod) &&
        Objects.equals(this.transactions, smartTransactionsProductModel.transactions) &&
        Objects.equals(this.lastVisitedPage, smartTransactionsProductModel.lastVisitedPage) &&
        Objects.equals(this.isDemo, smartTransactionsProductModel.isDemo) &&
        Objects.equals(this.checkoutLinks, smartTransactionsProductModel.checkoutLinks) &&
        Objects.equals(this.iframeUrl, smartTransactionsProductModel.iframeUrl) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, merchant, contract, providerContract, customer, shippingAddress, container, checkin, merchantRef, transactionRef, store, deviceSource, deviceDestination, created, updated, receiptNumber, receipt, receiptMerchant, receiptMerchantPrint, basketInfo, basket, idents, taxRate, taxAmount, cashier, market, orderOption, pickupOptions, shipmentDetails, product, transId, paymentMethod, transactions, lastVisitedPage, isDemo, checkoutLinks, iframeUrl, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    providerContract: ").append(toIndentedString(providerContract)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    checkin: ").append(toIndentedString(checkin)).append("\n");
    sb.append("    merchantRef: ").append(toIndentedString(merchantRef)).append("\n");
    sb.append("    transactionRef: ").append(toIndentedString(transactionRef)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    deviceSource: ").append(toIndentedString(deviceSource)).append("\n");
    sb.append("    deviceDestination: ").append(toIndentedString(deviceDestination)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    receiptNumber: ").append(toIndentedString(receiptNumber)).append("\n");
    sb.append("    receipt: ").append(toIndentedString(receipt)).append("\n");
    sb.append("    receiptMerchant: ").append(toIndentedString(receiptMerchant)).append("\n");
    sb.append("    receiptMerchantPrint: ").append(toIndentedString(receiptMerchantPrint)).append("\n");
    sb.append("    basketInfo: ").append(toIndentedString(basketInfo)).append("\n");
    sb.append("    basket: ").append(toIndentedString(basket)).append("\n");
    sb.append("    idents: ").append(toIndentedString(idents)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    cashier: ").append(toIndentedString(cashier)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    orderOption: ").append(toIndentedString(orderOption)).append("\n");
    sb.append("    pickupOptions: ").append(toIndentedString(pickupOptions)).append("\n");
    sb.append("    shipmentDetails: ").append(toIndentedString(shipmentDetails)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    lastVisitedPage: ").append(toIndentedString(lastVisitedPage)).append("\n");
    sb.append("    isDemo: ").append(toIndentedString(isDemo)).append("\n");
    sb.append("    checkoutLinks: ").append(toIndentedString(checkoutLinks)).append("\n");
    sb.append("    iframeUrl: ").append(toIndentedString(iframeUrl)).append("\n");
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

