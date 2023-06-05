package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Iframe options
 */
public class IframeOptions {
  @SerializedName("payment_hint_title")
  protected String paymentHintTitle = null;

  @SerializedName("project_title")
  protected String projectTitle = null;

  @SerializedName("project_logo")
  protected String projectLogo = null;

  @SerializedName("submit_button_title")
  protected String submitButtonTitle = null;

  @SerializedName("primary_colour")
  protected String primaryColour = null;

  @SerializedName("language")
  protected String language = null;

  @SerializedName("basket_title")
  protected String basketTitle = null;

  @SerializedName("is_basket_shown")
  protected Boolean isBasketShown = null;

  @SerializedName("language_formality")
  protected String languageFormality = null;

  public IframeOptions paymentHintTitle(String paymentHintTitle) {
    this.paymentHintTitle = paymentHintTitle;
    return this;
  }

   /**
   * Payment hint title
   * @return paymentHintTitle
  **/
  public String getPaymentHintTitle() {
    return paymentHintTitle;
  }

  public void setPaymentHintTitle(String paymentHintTitle) {
    this.paymentHintTitle = paymentHintTitle;
  }

  public IframeOptions projectTitle(String projectTitle) {
    this.projectTitle = projectTitle;
    return this;
  }

   /**
   * Project title
   * @return projectTitle
  **/
  public String getProjectTitle() {
    return projectTitle;
  }

  public void setProjectTitle(String projectTitle) {
    this.projectTitle = projectTitle;
  }

  public IframeOptions projectLogo(String projectLogo) {
    this.projectLogo = projectLogo;
    return this;
  }

   /**
   * Project logo link
   * @return projectLogo
  **/
  public String getProjectLogo() {
    return projectLogo;
  }

  public void setProjectLogo(String projectLogo) {
    this.projectLogo = projectLogo;
  }

  public IframeOptions submitButtonTitle(String submitButtonTitle) {
    this.submitButtonTitle = submitButtonTitle;
    return this;
  }

   /**
   * Submit button title
   * @return submitButtonTitle
  **/
  public String getSubmitButtonTitle() {
    return submitButtonTitle;
  }

  public void setSubmitButtonTitle(String submitButtonTitle) {
    this.submitButtonTitle = submitButtonTitle;
  }

  public IframeOptions primaryColour(String primaryColour) {
    this.primaryColour = primaryColour;
    return this;
  }

   /**
   * Primary colour
   * @return primaryColour
  **/
  public String getPrimaryColour() {
    return primaryColour;
  }

  public void setPrimaryColour(String primaryColour) {
    this.primaryColour = primaryColour;
  }

  public IframeOptions language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Language
   * @return language
  **/
  public String getLanguage() {
    return language;
  }

  public void setLanguage(String language) {
    this.language = language;
  }

  public IframeOptions basketTitle(String basketTitle) {
    this.basketTitle = basketTitle;
    return this;
  }

   /**
   * Basket title
   * @return basketTitle
  **/
  public String getBasketTitle() {
    return basketTitle;
  }

  public void setBasketTitle(String basketTitle) {
    this.basketTitle = basketTitle;
  }

  public IframeOptions isBasketShown(Boolean isBasketShown) {
    this.isBasketShown = isBasketShown;
    return this;
  }

   /**
   * Is Basket Shown
   * @return isBasketShown
  **/
  public Boolean getIsBasketShown() {
    return isBasketShown;
  }

  public void setIsBasketShown(Boolean isBasketShown) {
    this.isBasketShown = isBasketShown;
  }

  public IframeOptions languageFormality(String languageFormality) {
    this.languageFormality = languageFormality;
    return this;
  }

   /**
   * Get languageFormality
   * @return languageFormality
  **/
  public String getLanguageFormality() {
    return languageFormality;
  }

  public void setLanguageFormality(String languageFormality) {
    this.languageFormality = languageFormality;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IframeOptions iframeOptions = (IframeOptions) o;
    return Objects.equals(this.paymentHintTitle, iframeOptions.paymentHintTitle) &&
        Objects.equals(this.projectTitle, iframeOptions.projectTitle) &&
        Objects.equals(this.projectLogo, iframeOptions.projectLogo) &&
        Objects.equals(this.submitButtonTitle, iframeOptions.submitButtonTitle) &&
        Objects.equals(this.primaryColour, iframeOptions.primaryColour) &&
        Objects.equals(this.language, iframeOptions.language) &&
        Objects.equals(this.basketTitle, iframeOptions.basketTitle) &&
        Objects.equals(this.isBasketShown, iframeOptions.isBasketShown) &&
        Objects.equals(this.languageFormality, iframeOptions.languageFormality);
  }

  @Override
  public int hashCode() {
    return Objects.hash(paymentHintTitle, projectTitle, projectLogo, submitButtonTitle, primaryColour, language, basketTitle, isBasketShown, languageFormality);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IframeOptions {\n");
    sb.append("    paymentHintTitle: ").append(toIndentedString(paymentHintTitle)).append("\n");
    sb.append("    projectTitle: ").append(toIndentedString(projectTitle)).append("\n");
    sb.append("    projectLogo: ").append(toIndentedString(projectLogo)).append("\n");
    sb.append("    submitButtonTitle: ").append(toIndentedString(submitButtonTitle)).append("\n");
    sb.append("    primaryColour: ").append(toIndentedString(primaryColour)).append("\n");
    sb.append("    language: ").append(toIndentedString(language)).append("\n");
    sb.append("    basketTitle: ").append(toIndentedString(basketTitle)).append("\n");
    sb.append("    isBasketShown: ").append(toIndentedString(isBasketShown)).append("\n");
    sb.append("    languageFormality: ").append(toIndentedString(languageFormality)).append("\n");
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

