package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.PaymentCustomersProductModel;
import com.secuconnect.client.model.SecupayBasketItem;
import com.secuconnect.client.model.SecupayRedirectUrl;
import com.secuconnect.client.model.SecupayTransactionProductDTOExperience;
import com.secuconnect.client.model.SecupayTransactionProductDTOOptData;
import com.secuconnect.client.model.SecupayTransactionProductDTOSubscription;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SecupayTransactionProductDTO
 */
public class SecupayTransactionProductDTO {
  @SerializedName("amount")
  protected Integer amount = null;

  @SerializedName("currency")
  protected String currency = null;

  @SerializedName("purpose")
  protected String purpose = null;

  @SerializedName("payment_methods")
  protected List<String> paymentMethods = null;

  @SerializedName("order_id")
  protected String orderId = null;

  @SerializedName("basket")
  protected List<SecupayBasketItem> basket = null;

  @SerializedName("accrual")
  protected Boolean accrual = null;

  @SerializedName("payment_action")
  protected String paymentAction = null;

  @SerializedName("customer")
  protected PaymentCustomersProductModel customer = null;

  @SerializedName("redirect_url")
  protected SecupayRedirectUrl redirectUrl = null;

  @SerializedName("contract")
  protected String contract = null;

  @SerializedName("container")
  protected String container = null;

  @SerializedName("opt_data")
  protected SecupayTransactionProductDTOOptData optData = null;

  @SerializedName("subscription")
  protected SecupayTransactionProductDTOSubscription subscription = null;

  @SerializedName("demo")
  protected Boolean demo = null;

  @SerializedName("experience")
  protected SecupayTransactionProductDTOExperience experience = null;

  public SecupayTransactionProductDTO amount(Integer amount) {
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

  public SecupayTransactionProductDTO currency(String currency) {
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

  public SecupayTransactionProductDTO purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * The purpose of the payment, for the account statement for example.
   * @return purpose
  **/
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public SecupayTransactionProductDTO paymentMethods(List<String> paymentMethods) {
    this.paymentMethods = paymentMethods;
    return this;
  }

  public SecupayTransactionProductDTO addPaymentMethodsItem(String paymentMethodsItem) {
    if (this.paymentMethods == null) {
      this.paymentMethods = new ArrayList<String>();
    }
    this.paymentMethods.add(paymentMethodsItem);
    return this;
  }

   /**
   * Payment methods.  - &#x60;\&quot;twint\&quot;&#x60;
   * @return paymentMethods
  **/
  public List<String> getPaymentMethods() {
    return paymentMethods;
  }

  public void setPaymentMethods(List<String> paymentMethods) {
    this.paymentMethods = paymentMethods;
  }

  public SecupayTransactionProductDTO orderId(String orderId) {
    this.orderId = orderId;
    return this;
  }

   /**
   * Your order number. If set for the contract, there must be a unique number for each payment.
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
   * Basket items, several sub-baskets or subscription details
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
   * Locks for payout, if set on &#x60;true&#x60;. Needed f.e. for crowd funding or crowd investment.
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
   * Specifies whether to authorize only (&#x60;\&quot;authorization\&quot;&#x60;), or to pay immediately (&#x60;\&quot;sale\&quot;&#x60;). The capture of the pre-authorized payment is made with a call to &#x60;/capture&#x60;.
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
   * Contract ID
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
   * Container ID
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
   * Demo mode
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
        Objects.equals(this.paymentMethods, secupayTransactionProductDTO.paymentMethods) &&
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
    return Objects.hash(amount, currency, purpose, paymentMethods, orderId, basket, accrual, paymentAction, customer, redirectUrl, contract, container, optData, subscription, demo, experience);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayTransactionProductDTO {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    paymentMethods: ").append(toIndentedString(paymentMethods)).append("\n");
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

