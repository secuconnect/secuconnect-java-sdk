package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartTransactionsApplicationContextIframeOpts;
import com.secuconnect.client.model.SmartTransactionsApplicationContextLocks;
import com.secuconnect.client.model.SmartTransactionsApplicationContextReturnUrls;
import java.util.Objects;

/**
 * SmartTransactionsApplicationContext
 */
public class SmartTransactionsApplicationContext {
  @SerializedName("locks")
  private SmartTransactionsApplicationContextLocks locks = null;

  @SerializedName("return_urls")
  private SmartTransactionsApplicationContextReturnUrls returnUrls = null;

  @SerializedName("iframe_opts")
  private SmartTransactionsApplicationContextIframeOpts iframeOpts = null;

  @SerializedName("checkout_template")
  private String checkoutTemplate = null;

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
   * Smart Checkout Template ID
   * @return checkoutTemplate
  **/
  public String getCheckoutTemplate() {
    return checkoutTemplate;
  }

  public void setCheckoutTemplate(String checkoutTemplate) {
    this.checkoutTemplate = checkoutTemplate;
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
        Objects.equals(this.checkoutTemplate, smartTransactionsApplicationContext.checkoutTemplate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(locks, returnUrls, iframeOpts, checkoutTemplate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsApplicationContext {\n");
    sb.append("    locks: ").append(toIndentedString(locks)).append("\n");
    sb.append("    returnUrls: ").append(toIndentedString(returnUrls)).append("\n");
    sb.append("    iframeOpts: ").append(toIndentedString(iframeOpts)).append("\n");
    sb.append("    checkoutTemplate: ").append(toIndentedString(checkoutTemplate)).append("\n");
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

