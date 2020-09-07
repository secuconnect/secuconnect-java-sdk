package io.secuconnect.client.stomp.api.modelsForStompApiTest;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.*;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

public class SmartTransactionsProductModelForTests {
    @SerializedName("object")
    private String object = null;

    @SerializedName("id")
    private String id = null;

    @SerializedName("status")
    private String status = null;

    @SerializedName("merchant")
    private SmartTransactionsMerchant merchant = null;

    @SerializedName("contract")
    private ProductInstanceUID contract = null;

    @SerializedName("marketplace_contract")
    private ProductInstanceUID marketplaceContract = null;

    @SerializedName("customer")
    private LoyaltyCustomersProductModel customer = null;

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
    private String receiptMerchant = null;

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

    @SerializedName("product")
    private String product = null;

    @SerializedName("trans_id")
    private Integer transId = null;

    @SerializedName("payment_method")
    private String paymentMethod = null;

    @SerializedName("transactions")
    private ProductInstanceUID transactions = null;

    @SerializedName("last_visited_page")
    private String lastVisitedPage = null;

    public SmartTransactionsProductModelForTests object(String object) {
        this.object = object;
        return this;
    }

    /**
     * Object of smart transaction
     * @return object
     **/
    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public SmartTransactionsProductModelForTests id(String id) {
        this.id = id;
        return this;
    }

    /**
     * Id of smart transaction
     * @return id
     **/
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public SmartTransactionsProductModelForTests status(String status) {
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

    public SmartTransactionsProductModelForTests merchant(SmartTransactionsMerchant merchant) {
        this.merchant = merchant;
        return this;
    }

    /**
     * Merchant
     * @return merchant
     **/
    public SmartTransactionsMerchant getMerchant() {
        return merchant;
    }

    public void setMerchant(SmartTransactionsMerchant merchant) {
        this.merchant = merchant;
    }

    public SmartTransactionsProductModelForTests contract(ProductInstanceUID contract) {
        this.contract = contract;
        return this;
    }

    /**
     * Contract
     * @return contract
     **/
    public ProductInstanceUID getContract() {
        return contract;
    }

    public void setContract(ProductInstanceUID contract) {
        this.contract = contract;
    }

    public SmartTransactionsProductModelForTests marketplaceContract(ProductInstanceUID marketplaceContract) {
        this.marketplaceContract = marketplaceContract;
        return this;
    }

    /**
     * Marketplace contract
     * @return marketplaceContract
     **/
    public ProductInstanceUID getMarketplaceContract() {
        return marketplaceContract;
    }

    public void setMarketplaceContract(ProductInstanceUID marketplaceContract) {
        this.marketplaceContract = marketplaceContract;
    }

    public SmartTransactionsProductModelForTests customer(LoyaltyCustomersProductModel customer) {
        this.customer = customer;
        return this;
    }

    /**
     * Customer
     * @return customer
     **/
    public LoyaltyCustomersProductModel getCustomer() {
        return customer;
    }

    public void setCustomer(LoyaltyCustomersProductModel customer) {
        this.customer = customer;
    }

    public SmartTransactionsProductModelForTests checkin(SmartTransactionsCheckin checkin) {
        this.checkin = checkin;
        return this;
    }

    /**
     * Check in
     * @return checkin
     **/
    public SmartTransactionsCheckin getCheckin() {
        return checkin;
    }

    public void setCheckin(SmartTransactionsCheckin checkin) {
        this.checkin = checkin;
    }

    public SmartTransactionsProductModelForTests merchantRef(String merchantRef) {
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

    public SmartTransactionsProductModelForTests transactionRef(String transactionRef) {
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

    public SmartTransactionsProductModelForTests store(ProductInstanceUID store) {
        this.store = store;
        return this;
    }

    /**
     * Store
     * @return store
     **/
    public ProductInstanceUID getStore() {
        return store;
    }

    public void setStore(ProductInstanceUID store) {
        this.store = store;
    }

    public SmartTransactionsProductModelForTests deviceSource(ProductInstanceUID deviceSource) {
        this.deviceSource = deviceSource;
        return this;
    }

    /**
     * Device source
     * @return deviceSource
     **/
    public ProductInstanceUID getDeviceSource() {
        return deviceSource;
    }

    public void setDeviceSource(ProductInstanceUID deviceSource) {
        this.deviceSource = deviceSource;
    }

    public SmartTransactionsProductModelForTests deviceDestination(ProductInstanceUID deviceDestination) {
        this.deviceDestination = deviceDestination;
        return this;
    }

    /**
     * Device destination
     * @return deviceDestination
     **/
    public ProductInstanceUID getDeviceDestination() {
        return deviceDestination;
    }

    public void setDeviceDestination(ProductInstanceUID deviceDestination) {
        this.deviceDestination = deviceDestination;
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

    public SmartTransactionsProductModelForTests updated(String updated) {
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

    public SmartTransactionsProductModelForTests receiptNumber(Integer receiptNumber) {
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

    public SmartTransactionsProductModelForTests receipt(List<SmartTransactionsReceipt> receipt) {
        this.receipt = receipt;
        return this;
    }

    public SmartTransactionsProductModelForTests addReceiptItem(SmartTransactionsReceipt receiptItem) {
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

    public SmartTransactionsProductModelForTests receiptMerchant(String receiptMerchant) {
        this.receiptMerchant = receiptMerchant;
        return this;
    }

    /**
     * Receipt merchant
     * @return receiptMerchant
     **/
    public String getReceiptMerchant() {
        return receiptMerchant;
    }

    public void setReceiptMerchant(String receiptMerchant) {
        this.receiptMerchant = receiptMerchant;
    }

    public SmartTransactionsProductModelForTests receiptMerchantPrint(Boolean receiptMerchantPrint) {
        this.receiptMerchantPrint = receiptMerchantPrint;
        return this;
    }

    /**
     * Receipt merchant print
     * @return receiptMerchantPrint
     **/
    public Boolean getReceiptMerchantPrint() {
        return receiptMerchantPrint;
    }

    public void setReceiptMerchantPrint(Boolean receiptMerchantPrint) {
        this.receiptMerchantPrint = receiptMerchantPrint;
    }

    public SmartTransactionsProductModelForTests basketInfo(SmartTransactionsBasketInfo basketInfo) {
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

    public SmartTransactionsProductModelForTests basket(SmartTransactionsBasket basket) {
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

    public SmartTransactionsProductModelForTests idents(List<SmartTransactionsIdent> idents) {
        this.idents = idents;
        return this;
    }

    public SmartTransactionsProductModelForTests addIdentsItem(SmartTransactionsIdent identsItem) {
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

    public SmartTransactionsProductModelForTests taxRate(Integer taxRate) {
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

    public SmartTransactionsProductModelForTests taxAmount(Integer taxAmount) {
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

    public SmartTransactionsProductModelForTests cashier(String cashier) {
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

    public SmartTransactionsProductModelForTests market(String market) {
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

    public SmartTransactionsProductModelForTests orderOption(String orderOption) {
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

    public SmartTransactionsProductModelForTests transId(Integer transId) {
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

    public SmartTransactionsProductModelForTests paymentMethod(String paymentMethod) {
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

    public SmartTransactionsProductModelForTests transactions(ProductInstanceUID transactions) {
        this.transactions = transactions;
        return this;
    }

    /**
     * Transactions
     * @return transactions
     **/
    public ProductInstanceUID getTransactions() {
        return transactions;
    }

    public void setTransactions(ProductInstanceUID transactions) {
        this.transactions = transactions;
    }

    public SmartTransactionsProductModelForTests lastVisitedPage(String lastVisitedPage) {
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
        SmartTransactionsProductModelForTests smartTransactionsProductModel = (SmartTransactionsProductModelForTests) o;
        return Objects.equals(this.object, smartTransactionsProductModel.object) &&
                Objects.equals(this.id, smartTransactionsProductModel.id) &&
                Objects.equals(this.status, smartTransactionsProductModel.status) &&
                Objects.equals(this.merchant, smartTransactionsProductModel.merchant) &&
                Objects.equals(this.contract, smartTransactionsProductModel.contract) &&
                Objects.equals(this.marketplaceContract, smartTransactionsProductModel.marketplaceContract) &&
                Objects.equals(this.customer, smartTransactionsProductModel.customer) &&
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
                Objects.equals(this.product, smartTransactionsProductModel.product) &&
                Objects.equals(this.transId, smartTransactionsProductModel.transId) &&
                Objects.equals(this.paymentMethod, smartTransactionsProductModel.paymentMethod) &&
                Objects.equals(this.transactions, smartTransactionsProductModel.transactions) &&
                Objects.equals(this.lastVisitedPage, smartTransactionsProductModel.lastVisitedPage);
    }

    @Override
    public int hashCode() {
        return Objects.hash(object, id, status, merchant, contract, marketplaceContract, customer, checkin, merchantRef, transactionRef, store, deviceSource, deviceDestination, created, updated, receiptNumber, receipt, receiptMerchant, receiptMerchantPrint, basketInfo, basket, idents, taxRate, taxAmount, cashier, market, orderOption, product, transId, paymentMethod, transactions, lastVisitedPage);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class SmartTransactionsProductModelForTests {\n");

        sb.append("    object: ").append(toIndentedString(object)).append("\n");
        sb.append("    id: ").append(toIndentedString(id)).append("\n");
        sb.append("    status: ").append(toIndentedString(status)).append("\n");
        sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
        sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
        sb.append("    marketplaceContract: ").append(toIndentedString(marketplaceContract)).append("\n");
        sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
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
        sb.append("    product: ").append(toIndentedString(product)).append("\n");
        sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
        sb.append("    paymentMethod: ").append(toIndentedString(paymentMethod)).append("\n");
        sb.append("    transactions: ").append(toIndentedString(transactions)).append("\n");
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
