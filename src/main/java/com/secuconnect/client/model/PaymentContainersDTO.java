package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.OneOfPaymentContainersDTOModelPrivate;
import com.secuconnect.client.model.PaymentContainersDTOCustomer;
import java.util.Objects;

/**
 * Payment instrument
 */
public class PaymentContainersDTO {
  @SerializedName("merchant_id")
  protected String merchantId = null;

  @SerializedName("customer")
  protected PaymentContainersDTOCustomer customer = null;

  @SerializedName("customer_id")
  protected String customerId = null;

  @SerializedName("type")
  protected String type = null;

  @SerializedName("request_token")
  protected Boolean requestToken = false;

  @SerializedName("notification_url")
  protected String notificationUrl = null;

  @SerializedName("private")
  protected OneOfPaymentContainersDTOModelPrivate _private = null;

  public PaymentContainersDTO merchantId(String merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * General Merchant ID
   * @return merchantId
  **/
  public String getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(String merchantId) {
    this.merchantId = merchantId;
  }

  public PaymentContainersDTO customer(PaymentContainersDTOCustomer customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  public PaymentContainersDTOCustomer getCustomer() {
    return customer;
  }

  public void setCustomer(PaymentContainersDTOCustomer customer) {
    this.customer = customer;
  }

  public PaymentContainersDTO customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Payment Customer ID
   * @return customerId
  **/
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public PaymentContainersDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Container type:  - &#x60;\&quot;bank_account\&quot;&#x60; - &#x60;\&quot;credit_card\&quot;&#x60; (read-only) - &#x60;\&quot;googlepay\&quot;&#x60; - &#x60;\&quot;applepay\&quot;&#x60; - &#x60;\&quot;paypal\&quot;&#x60; (read-only)
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PaymentContainersDTO requestToken(Boolean requestToken) {
    this.requestToken = requestToken;
    return this;
  }

   /**
   * Request Token
   * @return requestToken
  **/
  public Boolean getRequestToken() {
    return requestToken;
  }

  public void setRequestToken(Boolean requestToken) {
    this.requestToken = requestToken;
  }

  public PaymentContainersDTO notificationUrl(String notificationUrl) {
    this.notificationUrl = notificationUrl;
    return this;
  }

   /**
   * Shop URL for failed external authorization or payment
   * @return notificationUrl
  **/
  public String getNotificationUrl() {
    return notificationUrl;
  }

  public void setNotificationUrl(String notificationUrl) {
    this.notificationUrl = notificationUrl;
  }

  public PaymentContainersDTO _private(OneOfPaymentContainersDTOModelPrivate _private) {
    this._private = _private;
    return this;
  }

   /**
   * Get _private
   * @return _private
  **/
  public OneOfPaymentContainersDTOModelPrivate getPrivate() {
    return _private;
  }

  public void setPrivate(OneOfPaymentContainersDTOModelPrivate _private) {
    this._private = _private;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContainersDTO paymentContainersDTO = (PaymentContainersDTO) o;
    return Objects.equals(this.merchantId, paymentContainersDTO.merchantId) &&
        Objects.equals(this.customer, paymentContainersDTO.customer) &&
        Objects.equals(this.customerId, paymentContainersDTO.customerId) &&
        Objects.equals(this.type, paymentContainersDTO.type) &&
        Objects.equals(this.requestToken, paymentContainersDTO.requestToken) &&
        Objects.equals(this.notificationUrl, paymentContainersDTO.notificationUrl) &&
        Objects.equals(this._private, paymentContainersDTO._private);
  }

  @Override
  public int hashCode() {
    return Objects.hash(merchantId, customer, customerId, type, requestToken, notificationUrl, _private);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContainersDTO {\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    requestToken: ").append(toIndentedString(requestToken)).append("\n");
    sb.append("    notificationUrl: ").append(toIndentedString(notificationUrl)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
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

