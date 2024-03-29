package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * PaymentContractsDTOIFrameOpts
 */
public class PaymentContractsDTOIFrameOpts {
  @SerializedName("show_basket")
  protected Boolean showBasket = null;

  @SerializedName("basket_title")
  protected String basketTitle = null;

  @SerializedName("submit_button_title")
  protected String submitButtonTitle = null;

  @SerializedName("logo_base64")
  protected String logoBase64 = null;

  @SerializedName("cession")
  protected String cession = "personal";

  public PaymentContractsDTOIFrameOpts showBasket(Boolean showBasket) {
    this.showBasket = showBasket;
    return this;
  }

   /**
   * Display the basket items to the customer during the checkout
   * @return showBasket
  **/
  public Boolean getShowBasket() {
    return showBasket;
  }

  public void setShowBasket(Boolean showBasket) {
    this.showBasket = showBasket;
  }

  public PaymentContractsDTOIFrameOpts basketTitle(String basketTitle) {
    this.basketTitle = basketTitle;
    return this;
  }

   /**
   * Default headline of the checkout page
   * @return basketTitle
  **/
  public String getBasketTitle() {
    return basketTitle;
  }

  public void setBasketTitle(String basketTitle) {
    this.basketTitle = basketTitle;
  }

  public PaymentContractsDTOIFrameOpts submitButtonTitle(String submitButtonTitle) {
    this.submitButtonTitle = submitButtonTitle;
    return this;
  }

   /**
   * Default naming of the Submit-Button
   * @return submitButtonTitle
  **/
  public String getSubmitButtonTitle() {
    return submitButtonTitle;
  }

  public void setSubmitButtonTitle(String submitButtonTitle) {
    this.submitButtonTitle = submitButtonTitle;
  }

  public PaymentContractsDTOIFrameOpts logoBase64(String logoBase64) {
    this.logoBase64 = logoBase64;
    return this;
  }

   /**
   * Logo base64-encoded
   * @return logoBase64
  **/
  public String getLogoBase64() {
    return logoBase64;
  }

  public void setLogoBase64(String logoBase64) {
    this.logoBase64 = logoBase64;
  }

  public PaymentContractsDTOIFrameOpts cession(String cession) {
    this.cession = cession;
    return this;
  }

   /**
   * Cession (&#x60;\&quot;formal\&quot;&#x60;, &#x60;\&quot;personal\&quot;&#x60;)
   * @return cession
  **/
  public String getCession() {
    return cession;
  }

  public void setCession(String cession) {
    this.cession = cession;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContractsDTOIFrameOpts paymentContractsDTOIFrameOpts = (PaymentContractsDTOIFrameOpts) o;
    return Objects.equals(this.showBasket, paymentContractsDTOIFrameOpts.showBasket) &&
        Objects.equals(this.basketTitle, paymentContractsDTOIFrameOpts.basketTitle) &&
        Objects.equals(this.submitButtonTitle, paymentContractsDTOIFrameOpts.submitButtonTitle) &&
        Objects.equals(this.logoBase64, paymentContractsDTOIFrameOpts.logoBase64) &&
        Objects.equals(this.cession, paymentContractsDTOIFrameOpts.cession);
  }

  @Override
  public int hashCode() {
    return Objects.hash(showBasket, basketTitle, submitButtonTitle, logoBase64, cession);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContractsDTOIFrameOpts {\n");
    sb.append("    showBasket: ").append(toIndentedString(showBasket)).append("\n");
    sb.append("    basketTitle: ").append(toIndentedString(basketTitle)).append("\n");
    sb.append("    submitButtonTitle: ").append(toIndentedString(submitButtonTitle)).append("\n");
    sb.append("    logoBase64: ").append(toIndentedString(logoBase64)).append("\n");
    sb.append("    cession: ").append(toIndentedString(cession)).append("\n");
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

