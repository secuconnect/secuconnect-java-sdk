package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.OneOfSmartTransactionsDeliveryOptionsModel;
import com.secuconnect.client.model.PaymentContext;
import com.secuconnect.client.model.PaymentCustomersProductModel;
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
  private String merchant = null;

  @SerializedName("provider_contract")
  private ProductInstanceUID providerContract = null;

  @SerializedName("transactionRef")
  private String transactionRef = null;

  @SerializedName("merchantRef")
  private String merchantRef = null;

  @SerializedName("basket")
  private SmartTransactionsBasket basket = null;

  @SerializedName("basket_info")
  private SmartTransactionsBasketInfo basketInfo = null;

  @SerializedName("idents")
  private List<SmartTransactionsIdent> idents = null;

  @SerializedName("tax_amount")
  private Integer taxAmount = null;

  @SerializedName("tax_rate")
  private Integer taxRate = null;

  @SerializedName("market")
  private String market = null;

  @SerializedName("cashier")
  private String cashier = null;

  @SerializedName("product")
  private String product = null;

  @SerializedName("device_source")
  private ProductInstanceUID deviceSource = null;

  @SerializedName("trans_id")
  private Integer transId = null;

  @SerializedName("contract")
  private ProductInstanceID contract = null;

  @SerializedName("last_visited_page")
  private String lastVisitedPage = null;

  @SerializedName("customer")
  private SmartTransactionPaymentCustomerDTO customer = null;

  @SerializedName("shipping_address")
  private PaymentCustomersProductModel shippingAddress = null;

  @SerializedName("container")
  private SmartTransactionPaymentContainerDTO container = null;

  @SerializedName("checkin")
  private SmartTransactionsCheckin checkin = null;

  @SerializedName("payment_method")
  private String paymentMethod = null;

  @SerializedName("is_demo")
  private Boolean isDemo = null;

  @SerializedName("intent")
  private String intent = null;

  @SerializedName("checkout_links")
  private SmartTransactionsCheckoutLinks checkoutLinks = null;

  @SerializedName("delivery_options")
  private OneOfSmartTransactionsDeliveryOptionsModel deliveryOptions = null;

  @SerializedName("communications")
  private SmartTransactionsCommunication communications = null;

  @SerializedName("application_context")
  private SmartTransactionsApplicationContext applicationContext = null;

  @SerializedName("payment_context")
  private PaymentContext paymentContext = null;

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
   * Transaction reference
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
   * Merchant reference
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
      this.idents = new ArrayList<>();
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
   * Transaction id
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

  public SmartTransactionsDTO shippingAddress(PaymentCustomersProductModel shippingAddress) {
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

  public SmartTransactionsDTO paymentMethod(String paymentMethod) {
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

  public SmartTransactionsDTO isDemo(Boolean isDemo) {
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

  public SmartTransactionsDTO intent(String intent) {
    this.intent = intent;
    return this;
  }

   /**
   * intent of transaction
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

