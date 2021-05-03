package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.BankAccountDescriptor;
import java.util.Objects;

/**
 * PaymentInstructions
 */
public class PaymentInstructions extends BankAccountDescriptor {
  @SerializedName("girocode_url")
  private String girocodeUrl = null;

  public PaymentInstructions girocodeUrl(String girocodeUrl) {
    this.girocodeUrl = girocodeUrl;
    return this;
  }

   /**
   * Url to generated GiroCode
   * @return girocodeUrl
  **/
  public String getGirocodeUrl() {
    return girocodeUrl;
  }

  public void setGirocodeUrl(String girocodeUrl) {
    this.girocodeUrl = girocodeUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentInstructions paymentInstructions = (PaymentInstructions) o;
    return Objects.equals(this.girocodeUrl, paymentInstructions.girocodeUrl) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(girocodeUrl, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInstructions {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    girocodeUrl: ").append(toIndentedString(girocodeUrl)).append("\n");
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

