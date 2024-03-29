package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Options for customizing the checkout page
 */
public class SecupayTransactionProductDTOOptData {
  @SerializedName("has_accepted_disclaimer")
  protected String hasAcceptedDisclaimer = null;

  @SerializedName("language")
  protected String language = null;

  public SecupayTransactionProductDTOOptData hasAcceptedDisclaimer(String hasAcceptedDisclaimer) {
    this.hasAcceptedDisclaimer = hasAcceptedDisclaimer;
    return this;
  }

   /**
   * Customer accepted disclaimer
   * @return hasAcceptedDisclaimer
  **/
  public String getHasAcceptedDisclaimer() {
    return hasAcceptedDisclaimer;
  }

  public void setHasAcceptedDisclaimer(String hasAcceptedDisclaimer) {
    this.hasAcceptedDisclaimer = hasAcceptedDisclaimer;
  }

  public SecupayTransactionProductDTOOptData language(String language) {
    this.language = language;
    return this;
  }

   /**
   * Client language
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
    SecupayTransactionProductDTOOptData secupayTransactionProductDTOOptData = (SecupayTransactionProductDTOOptData) o;
    return Objects.equals(this.hasAcceptedDisclaimer, secupayTransactionProductDTOOptData.hasAcceptedDisclaimer) &&
        Objects.equals(this.language, secupayTransactionProductDTOOptData.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(hasAcceptedDisclaimer, language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayTransactionProductDTOOptData {\n");
    sb.append("    hasAcceptedDisclaimer: ").append(toIndentedString(hasAcceptedDisclaimer)).append("\n");
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

