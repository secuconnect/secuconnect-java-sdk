package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.CreatedField;
import com.secuconnect.client.model.OneOfSmartTransactionsDeliveryOptionsModel;
import com.secuconnect.client.model.PaymentContext;
import com.secuconnect.client.model.PaymentCustomersProductModel;
import com.secuconnect.client.model.PaymentInstructions;
import com.secuconnect.client.model.PaymentTransactionsProductModel;
import com.secuconnect.client.model.ProductInstanceUID;
import com.secuconnect.client.model.SmartTransactionsApplicationContext;
import com.secuconnect.client.model.SmartTransactionsBasket;
import com.secuconnect.client.model.SmartTransactionsBasketInfo;
import com.secuconnect.client.model.SmartTransactionsCheckin;
import com.secuconnect.client.model.SmartTransactionsCheckoutLinks;
import com.secuconnect.client.model.SmartTransactionsCommunication;
import com.secuconnect.client.model.SmartTransactionsContainer;
import com.secuconnect.client.model.SmartTransactionsIdent;
import com.secuconnect.client.model.SmartTransactionsMerchant;
import com.secuconnect.client.model.SmartTransactionsPaymentLinks;
import com.secuconnect.client.model.SmartTransactionsPrepaidSalesDetails;
import com.secuconnect.client.model.SmartTransactionsReceipt;
import com.secuconnect.client.model.UpdatedField;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SmartTransactionsProductModel
 */
public class SmartTransactionsProductModel extends BaseProductModel {
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

  @SerializedName("status")
  protected String status = null;

  @SerializedName("merchant")
  protected SmartTransactionsMerchant merchant = null;

  @SerializedName("contract")
  protected ProductInstanceUID contract = null;

  @SerializedName("provider_contract")
  protected ProductInstanceUID providerContract = null;

  @SerializedName("customer")
  protected PaymentCustomersProductModel customer = null;

  @SerializedName("shipping_address")
  protected PaymentCustomersProductModel shippingAddress = null;

  @SerializedName("container")
  protected SmartTransactionsContainer container = null;

  @SerializedName("checkin")
  protected SmartTransactionsCheckin checkin = null;

  @SerializedName("merchantRef")
  protected String merchantRef = null;

  @SerializedName("transactionRef")
  protected String transactionRef = null;

  @SerializedName("store")
  protected ProductInstanceUID store = null;

  @SerializedName("device_source")
  protected ProductInstanceUID deviceSource = null;

  @SerializedName("device_destination")
  protected ProductInstanceUID deviceDestination = null;

  @SerializedName("receipt_number")
  protected Integer receiptNumber = null;

  @SerializedName("receipt")
  protected List<SmartTransactionsReceipt> receipt = null;

  @SerializedName("receipt_merchant")
  protected List<SmartTransactionsReceipt> receiptMerchant = null;

  @SerializedName("receipt_merchant_print")
  protected Boolean receiptMerchantPrint = null;

  @SerializedName("basket_info")
  protected SmartTransactionsBasketInfo basketInfo = null;

  @SerializedName("basket")
  protected SmartTransactionsBasket basket = null;

  @SerializedName("idents")
  protected List<SmartTransactionsIdent> idents = null;

  @SerializedName("tax_rate")
  protected Integer taxRate = null;

  @SerializedName("tax_amount")
  protected Integer taxAmount = null;

  @SerializedName("cashier")
  protected String cashier = null;

  @SerializedName("market")
  protected String market = null;

  @SerializedName("delivery_options")
  protected OneOfSmartTransactionsDeliveryOptionsModel deliveryOptions = null;

  @SerializedName("product")
  protected String product = null;

  @SerializedName("trans_id")
  protected Integer transId = null;

  @SerializedName("payment_method")
  protected String paymentMethod = null;

  @SerializedName("transactions")
  protected List<PaymentTransactionsProductModel> transactions = null;

  @SerializedName("last_visited_page")
  protected String lastVisitedPage = null;

  @SerializedName("is_demo")
  protected Boolean isDemo = null;

  @SerializedName("checkout_links")
  protected SmartTransactionsCheckoutLinks checkoutLinks = null;

  @SerializedName("intent")
  protected String intent = null;

  @SerializedName("iframe_url")
  protected String iframeUrl = null;

  @SerializedName("prepaid_sales")
  protected SmartTransactionsPrepaidSalesDetails prepaidSales = null;

  @SerializedName("communications")
  protected SmartTransactionsCommunication communications = null;

  @SerializedName("payment_links")
  protected SmartTransactionsPaymentLinks paymentLinks = null;

  @SerializedName("application_context")
  protected SmartTransactionsApplicationContext applicationContext = null;

  @SerializedName("payment_instructions")
  protected PaymentInstructions paymentInstructions = null;

  @SerializedName("payment_context")
  protected PaymentContext paymentContext = null;

  @SerializedName("subscription")
  protected ProductInstanceUID subscription = null;

  public SmartTransactionsProductModel l(Integer l) {
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

  public SmartTransactionsProductModel k(Integer k) {
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

  public SmartTransactionsProductModel ks(String ks) {
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

  public SmartTransactionsProductModel c(Integer c) {
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

  public SmartTransactionsProductModel s(Integer s) {
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

  public SmartTransactionsProductModel t(AggregationTimeResult t) {
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

  public SmartTransactionsProductModel created(String created) {
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

  public SmartTransactionsProductModel updated(String updated) {
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

  public SmartTransactionsProductModel status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status of the Smart Transaction
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

  public SmartTransactionsProductModel container(SmartTransactionsContainer container) {
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  public SmartTransactionsContainer getContainer() {
    return container;
  }

  public void setContainer(SmartTransactionsContainer container) {
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
   * Merchant reference, e.g. merchant customer ID
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
   * Merchant reference, e.g. merchant customer ID
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
   * Receipt for both, the customer and the merchant
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
   * Receipt for the merchant
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
   * Whether the receipt for the merchant was printed
   * @return receiptMerchantPrint
  **/
  public Boolean getReceiptMerchantPrint() {
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
   * secucard customer card or voucher, or request to create it
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
   * Get taxRate
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
   * Get taxAmount
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

  public SmartTransactionsProductModel deliveryOptions(OneOfSmartTransactionsDeliveryOptionsModel deliveryOptions) {
    this.deliveryOptions = deliveryOptions;
    return this;
  }

   /**
   * Get deliveryOptions
   * @return deliveryOptions
  **/
  public OneOfSmartTransactionsDeliveryOptionsModel getDeliveryOptions() {
    return deliveryOptions;
  }

  public void setDeliveryOptions(OneOfSmartTransactionsDeliveryOptionsModel deliveryOptions) {
    this.deliveryOptions = deliveryOptions;
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
   * Transaction ID (TA code)
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
   * Payment method, as passed with &#x60;/prepare/{method}&#x60; or &#x60;/start/{method}&#x60;
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
  public Boolean getIsDemo() {
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

  public SmartTransactionsProductModel intent(String intent) {
    this.intent = intent;
    return this;
  }

   /**
   * Intent:  - &#x60;\&quot;sale\&quot;&#x60; - &#x60;\&quot;order\&quot;&#x60;
   * @return intent
  **/
  public String getIntent() {
    return intent;
  }

  public void setIntent(String intent) {
    this.intent = intent;
  }

  public SmartTransactionsProductModel iframeUrl(String iframeUrl) {
    this.iframeUrl = iframeUrl;
    return this;
  }

   /**
   * URL for external authorization (credit with card 3-D Secure, PayPal, Sofort, etc.)
   * @return iframeUrl
  **/
  public String getIframeUrl() {
    return iframeUrl;
  }

  public void setIframeUrl(String iframeUrl) {
    this.iframeUrl = iframeUrl;
  }

  public SmartTransactionsProductModel prepaidSales(SmartTransactionsPrepaidSalesDetails prepaidSales) {
    this.prepaidSales = prepaidSales;
    return this;
  }

   /**
   * Get prepaidSales
   * @return prepaidSales
  **/
  public SmartTransactionsPrepaidSalesDetails getPrepaidSales() {
    return prepaidSales;
  }

  public void setPrepaidSales(SmartTransactionsPrepaidSalesDetails prepaidSales) {
    this.prepaidSales = prepaidSales;
  }

  public SmartTransactionsProductModel communications(SmartTransactionsCommunication communications) {
    this.communications = communications;
    return this;
  }

   /**
   * Get communications
   * @return communications
  **/
  public SmartTransactionsCommunication getCommunications() {
    return communications;
  }

  public void setCommunications(SmartTransactionsCommunication communications) {
    this.communications = communications;
  }

  public SmartTransactionsProductModel paymentLinks(SmartTransactionsPaymentLinks paymentLinks) {
    this.paymentLinks = paymentLinks;
    return this;
  }

   /**
   * Get paymentLinks
   * @return paymentLinks
  **/
  public SmartTransactionsPaymentLinks getPaymentLinks() {
    return paymentLinks;
  }

  public void setPaymentLinks(SmartTransactionsPaymentLinks paymentLinks) {
    this.paymentLinks = paymentLinks;
  }

  public SmartTransactionsProductModel applicationContext(SmartTransactionsApplicationContext applicationContext) {
    this.applicationContext = applicationContext;
    return this;
  }

   /**
   * Get applicationContext
   * @return applicationContext
  **/
  public SmartTransactionsApplicationContext getApplicationContext() {
    return applicationContext;
  }

  public void setApplicationContext(SmartTransactionsApplicationContext applicationContext) {
    this.applicationContext = applicationContext;
  }

  public SmartTransactionsProductModel paymentInstructions(PaymentInstructions paymentInstructions) {
    this.paymentInstructions = paymentInstructions;
    return this;
  }

   /**
   * Get paymentInstructions
   * @return paymentInstructions
  **/
  public PaymentInstructions getPaymentInstructions() {
    return paymentInstructions;
  }

  public void setPaymentInstructions(PaymentInstructions paymentInstructions) {
    this.paymentInstructions = paymentInstructions;
  }

  public SmartTransactionsProductModel paymentContext(PaymentContext paymentContext) {
    this.paymentContext = paymentContext;
    return this;
  }

   /**
   * Get paymentContext
   * @return paymentContext
  **/
  public PaymentContext getPaymentContext() {
    return paymentContext;
  }

  public void setPaymentContext(PaymentContext paymentContext) {
    this.paymentContext = paymentContext;
  }

  public SmartTransactionsProductModel subscription(ProductInstanceUID subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  public ProductInstanceUID getSubscription() {
    return subscription;
  }

  public void setSubscription(ProductInstanceUID subscription) {
    this.subscription = subscription;
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
    return Objects.equals(this.l, smartTransactionsProductModel.l) &&
        Objects.equals(this.k, smartTransactionsProductModel.k) &&
        Objects.equals(this.ks, smartTransactionsProductModel.ks) &&
        Objects.equals(this.c, smartTransactionsProductModel.c) &&
        Objects.equals(this.s, smartTransactionsProductModel.s) &&
        Objects.equals(this.t, smartTransactionsProductModel.t) &&
        Objects.equals(this.created, smartTransactionsProductModel.created) &&
        Objects.equals(this.updated, smartTransactionsProductModel.updated) &&
        Objects.equals(this.status, smartTransactionsProductModel.status) &&
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
        Objects.equals(this.deliveryOptions, smartTransactionsProductModel.deliveryOptions) &&
        Objects.equals(this.product, smartTransactionsProductModel.product) &&
        Objects.equals(this.transId, smartTransactionsProductModel.transId) &&
        Objects.equals(this.paymentMethod, smartTransactionsProductModel.paymentMethod) &&
        Objects.equals(this.transactions, smartTransactionsProductModel.transactions) &&
        Objects.equals(this.lastVisitedPage, smartTransactionsProductModel.lastVisitedPage) &&
        Objects.equals(this.isDemo, smartTransactionsProductModel.isDemo) &&
        Objects.equals(this.checkoutLinks, smartTransactionsProductModel.checkoutLinks) &&
        Objects.equals(this.intent, smartTransactionsProductModel.intent) &&
        Objects.equals(this.iframeUrl, smartTransactionsProductModel.iframeUrl) &&
        Objects.equals(this.prepaidSales, smartTransactionsProductModel.prepaidSales) &&
        Objects.equals(this.communications, smartTransactionsProductModel.communications) &&
        Objects.equals(this.paymentLinks, smartTransactionsProductModel.paymentLinks) &&
        Objects.equals(this.applicationContext, smartTransactionsProductModel.applicationContext) &&
        Objects.equals(this.paymentInstructions, smartTransactionsProductModel.paymentInstructions) &&
        Objects.equals(this.paymentContext, smartTransactionsProductModel.paymentContext) &&
        Objects.equals(this.subscription, smartTransactionsProductModel.subscription) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, created, updated, status, merchant, contract, providerContract, customer, shippingAddress, container, checkin, merchantRef, transactionRef, store, deviceSource, deviceDestination, receiptNumber, receipt, receiptMerchant, receiptMerchantPrint, basketInfo, basket, idents, taxRate, taxAmount, cashier, market, deliveryOptions, product, transId, paymentMethod, transactions, lastVisitedPage, isDemo, checkoutLinks, intent, iframeUrl, prepaidSales, communications, paymentLinks, applicationContext, paymentInstructions, paymentContext, subscription, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    l: ").append(toIndentedString(l)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    ks: ").append(toIndentedString(ks)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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
    sb.append("    deliveryOptions: ").append(toIndentedString(deliveryOptions)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
    sb.append("    lastVisitedPage: ").append(toIndentedString(lastVisitedPage)).append("\n");
    sb.append("    isDemo: ").append(toIndentedString(isDemo)).append("\n");
    sb.append("    checkoutLinks: ").append(toIndentedString(checkoutLinks)).append("\n");
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    iframeUrl: ").append(toIndentedString(iframeUrl)).append("\n");
    sb.append("    prepaidSales: ").append(toIndentedString(prepaidSales)).append("\n");
    sb.append("    communications: ").append(toIndentedString(communications)).append("\n");
    sb.append("    paymentLinks: ").append(toIndentedString(paymentLinks)).append("\n");
    sb.append("    applicationContext: ").append(toIndentedString(applicationContext)).append("\n");
    sb.append("    paymentInstructions: ").append(toIndentedString(paymentInstructions)).append("\n");
    sb.append("    paymentContext: ").append(toIndentedString(paymentContext)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
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

