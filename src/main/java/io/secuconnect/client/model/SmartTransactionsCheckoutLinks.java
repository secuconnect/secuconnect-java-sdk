package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * SmartTransactionsCheckoutLinks
 */
public class SmartTransactionsCheckoutLinks {
  @SerializedName("url_checkout")
  private String urlCheckout = null;

  public SmartTransactionsCheckoutLinks urlCheckout(String urlCheckout) {
    this.urlCheckout = urlCheckout;
    return this;
  }

   /**
   * Smart Checkout URL
   * @return urlCheckout
  **/
  public String getUrlCheckout() {
    return urlCheckout;
  }

  public void setUrlCheckout(String urlCheckout) {
    this.urlCheckout = urlCheckout;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsCheckoutLinks smartTransactionsCheckoutLinks = (SmartTransactionsCheckoutLinks) o;
    return Objects.equals(this.urlCheckout, smartTransactionsCheckoutLinks.urlCheckout);
  }

  @Override
  public int hashCode() {
    return Objects.hash(urlCheckout);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsCheckoutLinks {\n");
    
    sb.append("    urlCheckout: ").append(toIndentedString(urlCheckout)).append("\n");
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

