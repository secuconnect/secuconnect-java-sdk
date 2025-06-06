package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.OneOfSmartTransactionsDeliveryOptionsModel;
import com.secuconnect.client.model.PaymentContext;
import com.secuconnect.client.model.ProductInstanceID;
import com.secuconnect.client.model.ProductInstanceUID;
import com.secuconnect.client.model.SmartTransactionPaymentContainerDTO;
import com.secuconnect.client.model.SmartTransactionPaymentCustomerDTO;
import com.secuconnect.client.model.SmartTransactionsApplicationContext;
import com.secuconnect.client.model.SmartTransactionsBasket;
import com.secuconnect.client.model.SmartTransactionsBasketInfo;
import com.secuconnect.client.model.SmartTransactionsCheckin;
import com.secuconnect.client.model.SmartTransactionsCheckoutLinks;
import com.secuconnect.client.model.SmartTransactionsCommunication;
import com.secuconnect.client.model.SmartTransactionsIdent;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SmartTransactionsDTO
 */
public class SmartTransactionsDTO {
  @SerializedName("merchant")
  protected String merchant = null;

  @SerializedName("provider_contract")
  protected ProductInstanceUID providerContract = null;

  @SerializedName("transactionRef")
  protected String transactionRef = null;

  @SerializedName("merchantRef")
  protected String merchantRef = null;

  @SerializedName("basket")
  protected SmartTransactionsBasket basket = null;

  @SerializedName("basket_info")
  protected SmartTransactionsBasketInfo basketInfo = null;

  @SerializedName("idents")
  protected List<SmartTransactionsIdent> idents = null;

  @SerializedName("tax_amount")
  protected Integer taxAmount = null;

  @SerializedName("tax_rate")
  protected Integer taxRate = null;

  @SerializedName("market")
  protected String market = null;

  @SerializedName("cashier")
  protected String cashier = null;

  @SerializedName("product")
  protected String product = null;

  @SerializedName("device_source")
  protected ProductInstanceUID deviceSource = null;

  @SerializedName("trans_id")
  protected Integer transId = null;

  @SerializedName("contract")
  protected ProductInstanceID contract = null;

  @SerializedName("last_visited_page")
  protected String lastVisitedPage = null;

  @SerializedName("customer")
  protected SmartTransactionPaymentCustomerDTO customer = null;

  @SerializedName("shipping_address")
  protected SmartTransactionPaymentCustomerDTO shippingAddress = null;

  @SerializedName("container")
  protected SmartTransactionPaymentContainerDTO container = null;

  @SerializedName("checkin")
  protected SmartTransactionsCheckin checkin = null;

  @SerializedName("payment_method")
  protected String paymentMethod = null;

  @SerializedName("is_demo")
  protected Boolean isDemo = null;

  @SerializedName("intent")
  protected String intent = null;

  @SerializedName("checkout_links")
  protected SmartTransactionsCheckoutLinks checkoutLinks = null;

  @SerializedName("delivery_options")
  protected OneOfSmartTransactionsDeliveryOptionsModel deliveryOptions = null;

  @SerializedName("communications")
  protected SmartTransactionsCommunication communications = null;

  @SerializedName("application_context")
  protected SmartTransactionsApplicationContext applicationContext = null;

  @SerializedName("payment_context")
  protected PaymentContext paymentContext = null;

  public SmartTransactionsDTO merchant(String merchant) {
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

  public SmartTransactionsDTO providerContract(ProductInstanceUID providerContract) {
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

  public SmartTransactionsDTO transactionRef(String transactionRef) {
    this.transactionRef = transactionRef;
    return this;
  }

   /**
   * Purpose for bank statement; would usually contain shop name and order number or date
   * @return transactionRef
  **/
  public String getTransactionRef() {
    return transactionRef;
  }

  public void setTransactionRef(String transactionRef) {
    this.transactionRef = transactionRef;
  }

  public SmartTransactionsDTO merchantRef(String merchantRef) {
    this.merchantRef = merchantRef;
    return this;
  }

   /**
   * Merchant reference for secuOffice; usually shop order number or ID
   * @return merchantRef
  **/
  public String getMerchantRef() {
    return merchantRef;
  }

  public void setMerchantRef(String merchantRef) {
    this.merchantRef = merchantRef;
  }

  public SmartTransactionsDTO basket(SmartTransactionsBasket basket) {
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

  public SmartTransactionsDTO basketInfo(SmartTransactionsBasketInfo basketInfo) {
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

  public SmartTransactionsDTO idents(List<SmartTransactionsIdent> idents) {
    this.idents = idents;
    return this;
  }

  public SmartTransactionsDTO addIdentsItem(SmartTransactionsIdent identsItem) {
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

  public SmartTransactionsDTO taxAmount(Integer taxAmount) {
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

  public SmartTransactionsDTO taxRate(Integer taxRate) {
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

  public SmartTransactionsDTO market(String market) {
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

  public SmartTransactionsDTO cashier(String cashier) {
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

  public SmartTransactionsDTO product(String product) {
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

  public SmartTransactionsDTO deviceSource(ProductInstanceUID deviceSource) {
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

  public SmartTransactionsDTO transId(Integer transId) {
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

  public SmartTransactionsDTO contract(ProductInstanceID contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  public ProductInstanceID getContract() {
    return contract;
  }

  public void setContract(ProductInstanceID contract) {
    this.contract = contract;
  }

  public SmartTransactionsDTO lastVisitedPage(String lastVisitedPage) {
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

  public SmartTransactionsDTO customer(SmartTransactionPaymentCustomerDTO customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  public SmartTransactionPaymentCustomerDTO getCustomer() {
    return customer;
  }

  public void setCustomer(SmartTransactionPaymentCustomerDTO customer) {
    this.customer = customer;
  }

  public SmartTransactionsDTO shippingAddress(SmartTransactionPaymentCustomerDTO shippingAddress) {
    this.shippingAddress = shippingAddress;
    return this;
  }

   /**
   * Get shippingAddress
   * @return shippingAddress
  **/
  public SmartTransactionPaymentCustomerDTO getShippingAddress() {
    return shippingAddress;
  }

  public void setShippingAddress(SmartTransactionPaymentCustomerDTO shippingAddress) {
    this.shippingAddress = shippingAddress;
  }

  public SmartTransactionsDTO container(SmartTransactionPaymentContainerDTO container) {
    this.container = container;
    return this;
  }

   /**
   * Get container
   * @return container
  **/
  public SmartTransactionPaymentContainerDTO getContainer() {
    return container;
  }

  public void setContainer(SmartTransactionPaymentContainerDTO container) {
    this.container = container;
  }

  public SmartTransactionsDTO checkin(SmartTransactionsCheckin checkin) {
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

   /**
   * Payment method, as passed with &#x60;/prepare/{method}&#x60; or &#x60;/start/{method}&#x60;
   * @return paymentMethod
  **/
  public String getPaymentMethod() {
    return paymentMethod;
  }

  public SmartTransactionsDTO isDemo(Boolean isDemo) {
    this.isDemo = isDemo;
    return this;
  }

   /**
   * Whether the transaction is in demo mode (payment not executed)
   * @return isDemo
  **/
  public Boolean getIsDemo() {
    return isDemo;
  }

  public void setIsDemo(Boolean isDemo) {
    this.isDemo = isDemo;
  }

  public SmartTransactionsDTO intent(String intent) {
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

  public SmartTransactionsDTO checkoutLinks(SmartTransactionsCheckoutLinks checkoutLinks) {
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

  public SmartTransactionsDTO deliveryOptions(OneOfSmartTransactionsDeliveryOptionsModel deliveryOptions) {
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

  public SmartTransactionsDTO communications(SmartTransactionsCommunication communications) {
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

  public SmartTransactionsDTO applicationContext(SmartTransactionsApplicationContext applicationContext) {
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

  public SmartTransactionsDTO paymentContext(PaymentContext paymentContext) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsDTO smartTransactionsDTO = (SmartTransactionsDTO) o;
    return Objects.equals(this.merchant, smartTransactionsDTO.merchant) &&
        Objects.equals(this.providerContract, smartTransactionsDTO.providerContract) &&
        Objects.equals(this.transactionRef, smartTransactionsDTO.transactionRef) &&
        Objects.equals(this.merchantRef, smartTransactionsDTO.merchantRef) &&
        Objects.equals(this.basket, smartTransactionsDTO.basket) &&
        Objects.equals(this.basketInfo, smartTransactionsDTO.basketInfo) &&
        Objects.equals(this.idents, smartTransactionsDTO.idents) &&
        Objects.equals(this.taxAmount, smartTransactionsDTO.taxAmount) &&
        Objects.equals(this.taxRate, smartTransactionsDTO.taxRate) &&
        Objects.equals(this.market, smartTransactionsDTO.market) &&
        Objects.equals(this.cashier, smartTransactionsDTO.cashier) &&
        Objects.equals(this.product, smartTransactionsDTO.product) &&
        Objects.equals(this.deviceSource, smartTransactionsDTO.deviceSource) &&
        Objects.equals(this.transId, smartTransactionsDTO.transId) &&
        Objects.equals(this.contract, smartTransactionsDTO.contract) &&
        Objects.equals(this.lastVisitedPage, smartTransactionsDTO.lastVisitedPage) &&
        Objects.equals(this.customer, smartTransactionsDTO.customer) &&
        Objects.equals(this.shippingAddress, smartTransactionsDTO.shippingAddress) &&
        Objects.equals(this.container, smartTransactionsDTO.container) &&
        Objects.equals(this.checkin, smartTransactionsDTO.checkin) &&
        Objects.equals(this.paymentMethod, smartTransactionsDTO.paymentMethod) &&
        Objects.equals(this.isDemo, smartTransactionsDTO.isDemo) &&
        Objects.equals(this.intent, smartTransactionsDTO.intent) &&
        Objects.equals(this.checkoutLinks, smartTransactionsDTO.checkoutLinks) &&
        Objects.equals(this.deliveryOptions, smartTransactionsDTO.deliveryOptions) &&
        Objects.equals(this.communications, smartTransactionsDTO.communications) &&
        Objects.equals(this.applicationContext, smartTransactionsDTO.applicationContext) &&
        Objects.equals(this.paymentContext, smartTransactionsDTO.paymentContext);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchant, providerContract, transactionRef, merchantRef, basket, basketInfo, idents, taxAmount, taxRate, market, cashier, product, deviceSource, transId, contract, lastVisitedPage, customer, shippingAddress, container, checkin, paymentMethod, isDemo, intent, checkoutLinks, deliveryOptions, communications, applicationContext, paymentContext);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsDTO {\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    providerContract: ").append(toIndentedString(providerContract)).append("\n");
    sb.append("    transactionRef: ").append(toIndentedString(transactionRef)).append("\n");
    sb.append("    merchantRef: ").append(toIndentedString(merchantRef)).append("\n");
    sb.append("    basket: ").append(toIndentedString(basket)).append("\n");
    sb.append("    basketInfo: ").append(toIndentedString(basketInfo)).append("\n");
    sb.append("    idents: ").append(toIndentedString(idents)).append("\n");
    sb.append("    taxAmount: ").append(toIndentedString(taxAmount)).append("\n");
    sb.append("    taxRate: ").append(toIndentedString(taxRate)).append("\n");
    sb.append("    market: ").append(toIndentedString(market)).append("\n");
    sb.append("    cashier: ").append(toIndentedString(cashier)).append("\n");
    sb.append("    product: ").append(toIndentedString(product)).append("\n");
    sb.append("    deviceSource: ").append(toIndentedString(deviceSource)).append("\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    lastVisitedPage: ").append(toIndentedString(lastVisitedPage)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    shippingAddress: ").append(toIndentedString(shippingAddress)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    checkin: ").append(toIndentedString(checkin)).append("\n");
    sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
    sb.append("    isDemo: ").append(toIndentedString(isDemo)).append("\n");
    sb.append("    intent: ").append(toIndentedString(intent)).append("\n");
    sb.append("    checkoutLinks: ").append(toIndentedString(checkoutLinks)).append("\n");
    sb.append("    deliveryOptions: ").append(toIndentedString(deliveryOptions)).append("\n");
    sb.append("    communications: ").append(toIndentedString(communications)).append("\n");
    sb.append("    applicationContext: ").append(toIndentedString(applicationContext)).append("\n");
    sb.append("    paymentContext: ").append(toIndentedString(paymentContext)).append("\n");
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

