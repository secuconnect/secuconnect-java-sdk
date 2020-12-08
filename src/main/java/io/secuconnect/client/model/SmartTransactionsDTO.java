package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.OneOfSmartTransactionsDeliveryOptionsModel;
import io.secuconnect.client.model.PaymentCustomersProductModel;
import io.secuconnect.client.model.ProductInstanceID;
import io.secuconnect.client.model.ProductInstanceUID;
import io.secuconnect.client.model.SmartTransactionsBasket;
import io.secuconnect.client.model.SmartTransactionsBasketInfo;
import io.secuconnect.client.model.SmartTransactionsCheckin;
import io.secuconnect.client.model.SmartTransactionsCheckoutLinks;
import io.secuconnect.client.model.SmartTransactionsCommunication;
import io.secuconnect.client.model.SmartTransactionsIdent;
import io.secuconnect.client.model.SmartTransactionsReceipt;
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

  @SerializedName("status")
  private String status = null;

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

  @SerializedName("receipt")
  private List<SmartTransactionsReceipt> receipt = null;

  @SerializedName("receipt_number")
  private Integer receiptNumber = null;

  @SerializedName("device_source")
  private ProductInstanceUID deviceSource = null;

  @SerializedName("trans_id")
  private Integer transId = null;

  @SerializedName("contract")
  private ProductInstanceID contract = null;

  @SerializedName("last_visited_page")
  private String lastVisitedPage = null;

  @SerializedName("customer")
  private PaymentCustomersProductModel customer = null;

  @SerializedName("shipping_address")
  private PaymentCustomersProductModel shippingAddress = null;

  @SerializedName("container")
  private ProductInstanceUID container = null;

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

  public SmartTransactionsDTO status(String status) {
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

  public SmartTransactionsDTO transactionRef(String transactionRef) {
    this.transactionRef = transactionRef;
    return this;
  }

   /**
   * Transaction ref
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
   * Merchant ref
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
   * Tax amount
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
   * Tax rate
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

  public SmartTransactionsDTO receipt(List<SmartTransactionsReceipt> receipt) {
    this.receipt = receipt;
    return this;
  }

  public SmartTransactionsDTO addReceiptItem(SmartTransactionsReceipt receiptItem) {
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

  public SmartTransactionsDTO receiptNumber(Integer receiptNumber) {
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

  public SmartTransactionsDTO customer(PaymentCustomersProductModel customer) {
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

  public SmartTransactionsDTO container(ProductInstanceUID container) {
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
        Objects.equals(this.status, smartTransactionsDTO.status) &&
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
        Objects.equals(this.receipt, smartTransactionsDTO.receipt) &&
        Objects.equals(this.receiptNumber, smartTransactionsDTO.receiptNumber) &&
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
        Objects.equals(this.communications, smartTransactionsDTO.communications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchant, providerContract, status, transactionRef, merchantRef, basket, basketInfo, idents, taxAmount, taxRate, market, cashier, product, receipt, receiptNumber, deviceSource, transId, contract, lastVisitedPage, customer, shippingAddress, container, checkin, paymentMethod, isDemo, intent, checkoutLinks, deliveryOptions, communications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsDTO {\n");
    
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    providerContract: ").append(toIndentedString(providerContract)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
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
    sb.append("    receipt: ").append(toIndentedString(receipt)).append("\n");
    sb.append("    receiptNumber: ").append(toIndentedString(receiptNumber)).append("\n");
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

