package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.SmartTransactionsReceipt;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SmartTransactionsApplicationContextIframeOpts
 */
public class SmartTransactionsApplicationContextIframeOpts {
  @SerializedName("payment_hint_title")
  private String paymentHintTitle = null;

  @SerializedName("payment_hint")
  private List<SmartTransactionsReceipt> paymentHint = null;

  @SerializedName("project_title")
  private String projectTitle = null;

  @SerializedName("submit_button_title")
  private String submitButtonTitle = null;

  @SerializedName("cancel_button_title")
  private String cancelButtonTitle = null;

  @SerializedName("language")
  private String language = "de_DE";

  @SerializedName("basket_title")
  private String basketTitle = null;

  @SerializedName("hide_disclaimer")
  private Boolean hideDisclaimer = false;

  @SerializedName("has_accepted_disclaimer")
  private Boolean hasAcceptedDisclaimer = false;

  public SmartTransactionsApplicationContextIframeOpts paymentHintTitle(String paymentHintTitle) {
    this.paymentHintTitle = paymentHintTitle;
    return this;
  }

   /**
   * payment hint title
   * @return paymentHintTitle
  **/
  public String getPaymentHintTitle() {
    return paymentHintTitle;
  }

  public void setPaymentHintTitle(String paymentHintTitle) {
    this.paymentHintTitle = paymentHintTitle;
  }

  public SmartTransactionsApplicationContextIframeOpts paymentHint(List<SmartTransactionsReceipt> paymentHint) {
    this.paymentHint = paymentHint;
    return this;
  }

  public SmartTransactionsApplicationContextIframeOpts addPaymentHintItem(SmartTransactionsReceipt paymentHintItem) {
    if (this.paymentHint == null) {
      this.paymentHint = new ArrayList<SmartTransactionsReceipt>();
    }
    this.paymentHint.add(paymentHintItem);
    return this;
  }

   /**
   * payment hint
   * @return paymentHint
  **/
  public List<SmartTransactionsReceipt> getPaymentHint() {
    return paymentHint;
  }

  public void setPaymentHint(List<SmartTransactionsReceipt> paymentHint) {
    this.paymentHint = paymentHint;
  }

  public SmartTransactionsApplicationContextIframeOpts projectTitle(String projectTitle) {
    this.projectTitle = projectTitle;
    return this;
  }

   /**
   * project name
   * @return projectTitle
  **/
  public String getProjectTitle() {
    return projectTitle;
  }

  public void setProjectTitle(String projectTitle) {
    this.projectTitle = projectTitle;
  }

  public SmartTransactionsApplicationContextIframeOpts submitButtonTitle(String submitButtonTitle) {
    this.submitButtonTitle = submitButtonTitle;
    return this;
  }

   /**
   * title of the submit button
   * @return submitButtonTitle
  **/
  public String getSubmitButtonTitle() {
    return submitButtonTitle;
  }

  public void setSubmitButtonTitle(String submitButtonTitle) {
    this.submitButtonTitle = submitButtonTitle;
  }

  public SmartTransactionsApplicationContextIframeOpts cancelButtonTitle(String cancelButtonTitle) {
    this.cancelButtonTitle = cancelButtonTitle;
    return this;
  }

   /**
   * title of the cancel button
   * @return cancelButtonTitle
  **/
  public String getCancelButtonTitle() {
    return cancelButtonTitle;
  }

  public void setCancelButtonTitle(String cancelButtonTitle) {
    this.cancelButtonTitle = cancelButtonTitle;
  }

  public SmartTransactionsApplicationContextIframeOpts language(String language) {
    this.language = language;
    return this;
  }

   /**
   * language
   * @return language
  **/
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public SmartTransactionsApplicationContextIframeOpts basketTitle(String basketTitle) {
    this.basketTitle = basketTitle;
    return this;
  }

   /**
   * basket title
   * @return basketTitle
  **/
  public String getBasketTitle() {
    return basketTitle;
  }

  public void setBasketTitle(String basketTitle) {
    this.basketTitle = basketTitle;
  }

  public SmartTransactionsApplicationContextIframeOpts hideDisclaimer(Boolean hideDisclaimer) {
    this.hideDisclaimer = hideDisclaimer;
    return this;
  }

   /**
   * hide disclaimer
   * @return hideDisclaimer
  **/
  public Boolean getHideDisclaimer() {
    return hideDisclaimer;
  }

  public void setHideDisclaimer(Boolean hideDisclaimer) {
    this.hideDisclaimer = hideDisclaimer;
  }

  public SmartTransactionsApplicationContextIframeOpts hasAcceptedDisclaimer(Boolean hasAcceptedDisclaimer) {
    this.hasAcceptedDisclaimer = hasAcceptedDisclaimer;
    return this;
  }

   /**
   * has accepted disclaimer
   * @return hasAcceptedDisclaimer
  **/
  public Boolean getHasAcceptedDisclaimer() {
    return hasAcceptedDisclaimer;
  }

  public void setHasAcceptedDisclaimer(Boolean hasAcceptedDisclaimer) {
    this.hasAcceptedDisclaimer = hasAcceptedDisclaimer;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsApplicationContextIframeOpts smartTransactionsApplicationContextIframeOpts = (SmartTransactionsApplicationContextIframeOpts) o;
    return Objects.equals(this.paymentHintTitle, smartTransactionsApplicationContextIframeOpts.paymentHintTitle) &&
        Objects.equals(this.paymentHint, smartTransactionsApplicationContextIframeOpts.paymentHint) &&
        Objects.equals(this.projectTitle, smartTransactionsApplicationContextIframeOpts.projectTitle) &&
        Objects.equals(this.submitButtonTitle, smartTransactionsApplicationContextIframeOpts.submitButtonTitle) &&
        Objects.equals(this.cancelButtonTitle, smartTransactionsApplicationContextIframeOpts.cancelButtonTitle) &&
        Objects.equals(this.language, smartTransactionsApplicationContextIframeOpts.language) &&
        Objects.equals(this.basketTitle, smartTransactionsApplicationContextIframeOpts.basketTitle) &&
        Objects.equals(this.hideDisclaimer, smartTransactionsApplicationContextIframeOpts.hideDisclaimer) &&
        Objects.equals(this.hasAcceptedDisclaimer, smartTransactionsApplicationContextIframeOpts.hasAcceptedDisclaimer);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentHintTitle, paymentHint, projectTitle, submitButtonTitle, cancelButtonTitle, language, basketTitle, hideDisclaimer, hasAcceptedDisclaimer);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsApplicationContextIframeOpts {\n");
    
    sb.append("    paymentHintTitle: ").append(toIndentedString(paymentHintTitle)).append("\n");
    sb.append("    paymentHint: ").append(toIndentedString(paymentHint)).append("\n");
    sb.append("    projectTitle: ").append(toIndentedString(projectTitle)).append("\n");
    sb.append("    submitButtonTitle: ").append(toIndentedString(submitButtonTitle)).append("\n");
    sb.append("    cancelButtonTitle: ").append(toIndentedString(cancelButtonTitle)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    basketTitle: ").append(toIndentedString(basketTitle)).append("\n");
    sb.append("    hideDisclaimer: ").append(toIndentedString(hideDisclaimer)).append("\n");
    sb.append("    hasAcceptedDisclaimer: ").append(toIndentedString(hasAcceptedDisclaimer)).append("\n");
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

