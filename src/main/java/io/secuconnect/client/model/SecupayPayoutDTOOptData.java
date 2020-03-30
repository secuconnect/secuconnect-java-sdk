package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

/**
 * Options for customizing the checkout page
 */
public class SecupayPayoutDTOOptData {
  @SerializedName("language")
  private String language = null;

  public SecupayPayoutDTOOptData language(String language) {
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
    SecupayPayoutDTOOptData secupayPayoutDTOOptData = (SecupayPayoutDTOOptData) o;
    return Objects.equals(this.language, secupayPayoutDTOOptData.language);
  }

  @Override
  public int hashCode() {
    return Objects.hash(language);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayPayoutDTOOptData {\n");
    
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

