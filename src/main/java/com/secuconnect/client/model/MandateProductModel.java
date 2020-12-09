package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * MandateProductModel
 */
public class MandateProductModel {
  @SerializedName("mandate_url")
  private String mandateUrl = null;

  public MandateProductModel mandateUrl(String mandateUrl) {
    this.mandateUrl = mandateUrl;
    return this;
  }

   /**
   * Link to sepamandate B2B doc
   * @return mandateUrl
  **/
  public String getMandateUrl() {
    return mandateUrl;
  }

  public void setMandateUrl(String mandateUrl) {
    this.mandateUrl = mandateUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MandateProductModel mandateProductModel = (MandateProductModel) o;
    return Objects.equals(this.mandateUrl, mandateProductModel.mandateUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(mandateUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MandateProductModel {\n");
    sb.append("    mandateUrl: ").append(toIndentedString(mandateUrl)).append("\n");
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

