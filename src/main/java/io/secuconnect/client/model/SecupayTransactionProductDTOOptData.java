package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * Options for customizing the checkout page
 */
public class SecupayTransactionProductDTOOptData {
  @SerializedName("has_accepted_disclaimer")
  private String hasAcceptedDisclaimer = null;

  @SerializedName("language")
  private String language = null;

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

