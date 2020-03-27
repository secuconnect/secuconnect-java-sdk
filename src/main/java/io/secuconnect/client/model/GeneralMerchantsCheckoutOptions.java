package io.secuconnect.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * GeneralMerchantsCheckoutOptions
 */
public class GeneralMerchantsCheckoutOptions {
  @SerializedName("enabled")
  private Boolean enabled = null;

  @SerializedName("shipping")
  private GeneralMerchantsCheckoutOptionsShipping shipping = null;

  @SerializedName("collection")
  private GeneralMerchantsCheckoutOptionsCollection collection = null;

  public GeneralMerchantsCheckoutOptions enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Enabled
   * @return enabled
  **/
  public Boolean isEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public GeneralMerchantsCheckoutOptions shipping(GeneralMerchantsCheckoutOptionsShipping shipping) {
    this.shipping = shipping;
    return this;
  }

   /**
   * Get shipping
   * @return shipping
  **/
  public GeneralMerchantsCheckoutOptionsShipping getShipping() {
    return shipping;
  }

  public void setShipping(GeneralMerchantsCheckoutOptionsShipping shipping) {
    this.shipping = shipping;
  }

  public GeneralMerchantsCheckoutOptions collection(GeneralMerchantsCheckoutOptionsCollection collection) {
    this.collection = collection;
    return this;
  }

   /**
   * Get collection
   * @return collection
  **/
  public GeneralMerchantsCheckoutOptionsCollection getCollection() {
    return collection;
  }

  public void setCollection(GeneralMerchantsCheckoutOptionsCollection collection) {
    this.collection = collection;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralMerchantsCheckoutOptions generalMerchantsCheckoutOptions = (GeneralMerchantsCheckoutOptions) o;
    return Objects.equals(this.enabled, generalMerchantsCheckoutOptions.enabled) &&
        Objects.equals(this.shipping, generalMerchantsCheckoutOptions.shipping) &&
        Objects.equals(this.collection, generalMerchantsCheckoutOptions.collection);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, shipping, collection);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralMerchantsCheckoutOptions {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    shipping: ").append(toIndentedString(shipping)).append("\n");
    sb.append("    collection: ").append(toIndentedString(collection)).append("\n");
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

