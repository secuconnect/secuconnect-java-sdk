package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartTransactionsApplicationContextIframeOpts;
import com.secuconnect.client.model.SmartTransactionsApplicationContextLocks;
import com.secuconnect.client.model.SmartTransactionsApplicationContextReturnUrls;
import java.util.Objects;

/**
 * Controls the integration between Smart Checkout and the shop.
 */
public class SmartTransactionsApplicationContext {
  @SerializedName("locks")
  protected SmartTransactionsApplicationContextLocks locks = null;

  @SerializedName("return_urls")
  protected SmartTransactionsApplicationContextReturnUrls returnUrls = null;

  @SerializedName("iframe_opts")
  protected SmartTransactionsApplicationContextIframeOpts iframeOpts = null;

  @SerializedName("checkout_template")
  protected String checkoutTemplate = null;

  @SerializedName("language")
  protected String language = null;

  public SmartTransactionsApplicationContext locks(SmartTransactionsApplicationContextLocks locks) {
    this.locks = locks;
    return this;
  }

   /**
   * Get locks
   * @return locks
  **/
  public SmartTransactionsApplicationContextLocks getLocks() {
    return locks;
  }

  public void setLocks(SmartTransactionsApplicationContextLocks locks) {
    this.locks = locks;
  }

  public SmartTransactionsApplicationContext returnUrls(SmartTransactionsApplicationContextReturnUrls returnUrls) {
    this.returnUrls = returnUrls;
    return this;
  }

   /**
   * Get returnUrls
   * @return returnUrls
  **/
  public SmartTransactionsApplicationContextReturnUrls getReturnUrls() {
    return returnUrls;
  }

  public void setReturnUrls(SmartTransactionsApplicationContextReturnUrls returnUrls) {
    this.returnUrls = returnUrls;
  }

  public SmartTransactionsApplicationContext iframeOpts(SmartTransactionsApplicationContextIframeOpts iframeOpts) {
    this.iframeOpts = iframeOpts;
    return this;
  }

   /**
   * Get iframeOpts
   * @return iframeOpts
  **/
  public SmartTransactionsApplicationContextIframeOpts getIframeOpts() {
    return iframeOpts;
  }

  public void setIframeOpts(SmartTransactionsApplicationContextIframeOpts iframeOpts) {
    this.iframeOpts = iframeOpts;
  }

  public SmartTransactionsApplicationContext checkoutTemplate(String checkoutTemplate) {
    this.checkoutTemplate = checkoutTemplate;
    return this;
  }

   /**
   * Smart Checkout Template ID  Default templates:  - &#x60;\&quot;COT_WD0DE66HN2XWJHW8JM88003YG0NEA2\&quot;&#x60; for checkout - &#x60;\&quot;COT_QV85D3F542XWFFJYCSWG00W400YWAT\&quot;&#x60; for subscriptions
   * @return checkoutTemplate
  **/
  public String getCheckoutTemplate() {
    return checkoutTemplate;
  }

  public void setCheckoutTemplate(String checkoutTemplate) {
    this.checkoutTemplate = checkoutTemplate;
  }

  public SmartTransactionsApplicationContext language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Language Smart Checkout is starting with:  - &#x60;\&quot;de\&quot;&#x60; - &#x60;\&quot;en\&quot;&#x60;
   * @return language
  **/
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsApplicationContext smartTransactionsApplicationContext = (SmartTransactionsApplicationContext) o;
    return Objects.equals(this.locks, smartTransactionsApplicationContext.locks) &&
        Objects.equals(this.returnUrls, smartTransactionsApplicationContext.returnUrls) &&
        Objects.equals(this.iframeOpts, smartTransactionsApplicationContext.iframeOpts) &&
        Objects.equals(this.checkoutTemplate, smartTransactionsApplicationContext.checkoutTemplate) &&
        Objects.equals(this.language, smartTransactionsApplicationContext.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locks, returnUrls, iframeOpts, checkoutTemplate, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsApplicationContext {\n");
    sb.append("    locks: ").append(toIndentedString(locks)).append("\n");
    sb.append("    returnUrls: ").append(toIndentedString(returnUrls)).append("\n");
    sb.append("    iframeOpts: ").append(toIndentedString(iframeOpts)).append("\n");
    sb.append("    checkoutTemplate: ").append(toIndentedString(checkoutTemplate)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
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

