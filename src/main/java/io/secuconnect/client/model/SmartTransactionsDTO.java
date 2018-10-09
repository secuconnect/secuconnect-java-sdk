package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.ProductInstanceID;
import io.secuconnect.client.model.SmartTransactionsBasket;
import io.secuconnect.client.model.SmartTransactionsBasketInfo;
import io.secuconnect.client.model.SmartTransactionsIdent;
import io.secuconnect.client.model.SmartTransactionsPickupOptions;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SmartTransactionsDTO
 */
public class SmartTransactionsDTO {
  @SerializedName("merchant")
  private String merchant = null;

  @SerializedName("marketplace_contract")
  private ProductInstanceID marketplaceContract = null;

  @SerializedName("order_option")
  private String orderOption = null;

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
  private String receipt = null;

  @SerializedName("receipt_number")
  private Integer receiptNumber = null;

  @SerializedName("device_source")
  private String deviceSource = null;

  @SerializedName("trans_id")
  private Integer transId = null;

  @SerializedName("contract")
  private ProductInstanceID contract = null;

  @SerializedName("pickup_options")
  private SmartTransactionsPickupOptions pickupOptions = null;

  @SerializedName("last_visited_page")
  private String lastVisitedPage = null;

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

  public SmartTransactionsDTO marketplaceContract(ProductInstanceID marketplaceContract) {
    this.marketplaceContract = marketplaceContract;
    return this;
  }

   /**
   * Marketplace contract
   * @return marketplaceContract
  **/
  public ProductInstanceID getMarketplaceContract() {
    return marketplaceContract;
  }

  public void setMarketplaceContract(ProductInstanceID marketplaceContract) {
    this.marketplaceContract = marketplaceContract;
  }

  public SmartTransactionsDTO orderOption(String orderOption) {
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
   * Basket
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
   * Basket info
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

  public SmartTransactionsDTO receipt(String receipt) {
    this.receipt = receipt;
    return this;
  }

   /**
   * Receipt
   * @return receipt
  **/
  public String getReceipt() {
    return receipt;
  }

  public void setReceipt(String receipt) {
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

  public SmartTransactionsDTO deviceSource(String deviceSource) {
    this.deviceSource = deviceSource;
    return this;
  }

   /**
   * Device source
   * @return deviceSource
  **/
  public String getDeviceSource() {
    return deviceSource;
  }

  public void setDeviceSource(String deviceSource) {
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
   * Contract
   * @return contract
  **/
  public ProductInstanceID getContract() {
    return contract;
  }

  public void setContract(ProductInstanceID contract) {
    this.contract = contract;
  }

  public SmartTransactionsDTO pickupOptions(SmartTransactionsPickupOptions pickupOptions) {
    this.pickupOptions = pickupOptions;
    return this;
  }

   /**
   * Pickup options
   * @return pickupOptions
  **/
  public SmartTransactionsPickupOptions getPickupOptions() {
    return pickupOptions;
  }

  public void setPickupOptions(SmartTransactionsPickupOptions pickupOptions) {
    this.pickupOptions = pickupOptions;
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsDTO smartTransactionsDTO = (SmartTransactionsDTO) o;
    return Objects.equals(this.merchant, smartTransactionsDTO.merchant) &&
        Objects.equals(this.marketplaceContract, smartTransactionsDTO.marketplaceContract) &&
        Objects.equals(this.orderOption, smartTransactionsDTO.orderOption) &&
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
        Objects.equals(this.pickupOptions, smartTransactionsDTO.pickupOptions) &&
        Objects.equals(this.lastVisitedPage, smartTransactionsDTO.lastVisitedPage);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchant, marketplaceContract, orderOption, status, transactionRef, merchantRef, basket, basketInfo, idents, taxAmount, taxRate, market, cashier, product, receipt, receiptNumber, deviceSource, transId, contract, pickupOptions, lastVisitedPage);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsDTO {\n");
    
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    marketplaceContract: ").append(toIndentedString(marketplaceContract)).append("\n");
    sb.append("    orderOption: ").append(toIndentedString(orderOption)).append("\n");
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
    sb.append("    pickupOptions: ").append(toIndentedString(pickupOptions)).append("\n");
    sb.append("    lastVisitedPage: ").append(toIndentedString(lastVisitedPage)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

