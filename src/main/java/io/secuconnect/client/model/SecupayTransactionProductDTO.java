package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.PaymentCustomersProductModel;
import io.secuconnect.client.model.SecupayBasketItem;
import io.secuconnect.client.model.SecupayRedirectUrl;
import io.secuconnect.client.model.SecupayTransactionProductDTOExperience;
import io.secuconnect.client.model.SecupayTransactionProductDTOOptData;
import io.secuconnect.client.model.SecupayTransactionProductDTOSubscription;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

/**
 * SecupayTransactionProductDTO
 */
public class SecupayTransactionProductDTO {
  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("currency")
  private String currency = null;

  @SerializedName("purpose")
  private String purpose = null;

  @SerializedName("order_id")
  private String orderId = null;

  @SerializedName("basket")
  private List<SecupayBasketItem> basket = null;

  @SerializedName("accrual")
  private Boolean accrual = null;

  @SerializedName("payment_action")
  private String paymentAction = null;

  @SerializedName("customer")
  private PaymentCustomersProductModel customer = null;

  @SerializedName("redirect_url")
  private SecupayRedirectUrl redirectUrl = null;

  @SerializedName("contract")
  private String contract = null;

  @SerializedName("container")
  private String container = null;

  @SerializedName("opt_data")
  private SecupayTransactionProductDTOOptData optData = null;

  @SerializedName("subscription")
  private SecupayTransactionProductDTOSubscription subscription = null;

  @SerializedName("demo")
  private Boolean demo = null;

  @SerializedName("experience")
  private SecupayTransactionProductDTOExperience experience = null;

  public SecupayTransactionProductDTO amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Total amount of payment in cents (or the smallest cash unit of the relevant currency)
   * @return amount
  **/
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public SecupayTransactionProductDTO currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * ISO 4217 code of currency, eg EUR for Euro.
   * @return currency
  **/
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
  }

  public SecupayTransactionProductDTO purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * The purpose of the payment. This is the later assignment of the payment is for example on the account statement of the buyer.
   * @return purpose
  **/
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public SecupayTransactionProductDTO orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Specifying an order number. Depending on the contract setting, this must be unique for each payment.
   * @return orderId
  **/
  public String getOrderId() {
    return orderId;
  }

  public void setOrderId(String orderId) {
    this.orderId = orderId;
  }

  public SecupayTransactionProductDTO basket(List<SecupayBasketItem> basket) {
    this.basket = basket;
    return this;
  }

  public SecupayTransactionProductDTO addBasketItem(SecupayBasketItem basketItem) {
    if (this.basket == null) {
      this.basket = new ArrayList<SecupayBasketItem>();
    }
    this.basket.add(basketItem);
    return this;
  }

   /**
   * A list of items that are being purchased.
   * @return basket
  **/
  public List<SecupayBasketItem> getBasket() {
    return basket;
  }

  public void setBasket(List<SecupayBasketItem> basket) {
    this.basket = basket;
  }

  public SecupayTransactionProductDTO accrual(Boolean accrual) {
    this.accrual = accrual;
    return this;
  }

   /**
   * Indicates whether the payment is locked for pay-out (TRUE) or not (FALSE). Standard value here is FALSE.
   * @return accrual
  **/
  public Boolean getAccrual() {
    return accrual;
  }

  public void setAccrual(Boolean accrual) {
    this.accrual = accrual;
  }

  public SecupayTransactionProductDTO paymentAction(String paymentAction) {
    this.paymentAction = paymentAction;
    return this;
  }

   /**
   * Specifies whether a pre-authorization (\&quot;authorization\&quot;) or instant payment (\&quot;sale\&quot;) is to be performed. Standard value here is \&quot;sale\&quot;. The collection of the pre-authorized payment is made with the \&quot;capture\&quot; command.
   * @return paymentAction
  **/
  public String getPaymentAction() {
    return paymentAction;
  }

  public void setPaymentAction(String paymentAction) {
    this.paymentAction = paymentAction;
  }

  public SecupayTransactionProductDTO customer(PaymentCustomersProductModel customer) {
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

  public SecupayTransactionProductDTO redirectUrl(SecupayRedirectUrl redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * Get redirectUrl
   * @return redirectUrl
  **/
  public SecupayRedirectUrl getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(SecupayRedirectUrl redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  public SecupayTransactionProductDTO contract(String contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Contract id
   * @return contract
  **/
  public String getContract() {
    return contract;
  }

  public void setContract(String contract) {
    this.contract = contract;
  }

  public SecupayTransactionProductDTO container(String container) {
    this.container = container;
    return this;
  }

   /**
   * Container id
   * @return container
  **/
  public String getContainer() {
    return container;
  }

  public void setContainer(String container) {
    this.container = container;
  }

  public SecupayTransactionProductDTO optData(SecupayTransactionProductDTOOptData optData) {
    this.optData = optData;
    return this;
  }

   /**
   * Get optData
   * @return optData
  **/
  public SecupayTransactionProductDTOOptData getOptData() {
    return optData;
  }

  public void setOptData(SecupayTransactionProductDTOOptData optData) {
    this.optData = optData;
  }

  public SecupayTransactionProductDTO subscription(SecupayTransactionProductDTOSubscription subscription) {
    this.subscription = subscription;
    return this;
  }

   /**
   * Get subscription
   * @return subscription
  **/
  public SecupayTransactionProductDTOSubscription getSubscription() {
    return subscription;
  }

  public void setSubscription(SecupayTransactionProductDTOSubscription subscription) {
    this.subscription = subscription;
  }

  public SecupayTransactionProductDTO demo(Boolean demo) {
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

  public SecupayTransactionProductDTO experience(SecupayTransactionProductDTOExperience experience) {
    this.experience = experience;
    return this;
  }

   /**
   * Get experience
   * @return experience
  **/
  public SecupayTransactionProductDTOExperience getExperience() {
    return experience;
  }

  public void setExperience(SecupayTransactionProductDTOExperience experience) {
    this.experience = experience;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayTransactionProductDTO secupayTransactionProductDTO = (SecupayTransactionProductDTO) o;
    return Objects.equals(this.amount, secupayTransactionProductDTO.amount) &&
        Objects.equals(this.currency, secupayTransactionProductDTO.currency) &&
        Objects.equals(this.purpose, secupayTransactionProductDTO.purpose) &&
        Objects.equals(this.orderId, secupayTransactionProductDTO.orderId) &&
        Objects.equals(this.basket, secupayTransactionProductDTO.basket) &&
        Objects.equals(this.accrual, secupayTransactionProductDTO.accrual) &&
        Objects.equals(this.paymentAction, secupayTransactionProductDTO.paymentAction) &&
        Objects.equals(this.customer, secupayTransactionProductDTO.customer) &&
        Objects.equals(this.redirectUrl, secupayTransactionProductDTO.redirectUrl) &&
        Objects.equals(this.contract, secupayTransactionProductDTO.contract) &&
        Objects.equals(this.container, secupayTransactionProductDTO.container) &&
        Objects.equals(this.optData, secupayTransactionProductDTO.optData) &&
        Objects.equals(this.subscription, secupayTransactionProductDTO.subscription) &&
        Objects.equals(this.demo, secupayTransactionProductDTO.demo) &&
        Objects.equals(this.experience, secupayTransactionProductDTO.experience);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, currency, purpose, orderId, basket, accrual, paymentAction, customer, redirectUrl, contract, container, optData, subscription, demo, experience);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayTransactionProductDTO {\n");
    
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    orderId: ").append(toIndentedString(orderId)).append("\n");
    sb.append("    basket: ").append(toIndentedString(basket)).append("\n");
    sb.append("    accrual: ").append(toIndentedString(accrual)).append("\n");
    sb.append("    paymentAction: ").append(toIndentedString(paymentAction)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
    sb.append("    optData: ").append(toIndentedString(optData)).append("\n");
    sb.append("    subscription: ").append(toIndentedString(subscription)).append("\n");
    sb.append("    demo: ").append(toIndentedString(demo)).append("\n");
    sb.append("    experience: ").append(toIndentedString(experience)).append("\n");
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

