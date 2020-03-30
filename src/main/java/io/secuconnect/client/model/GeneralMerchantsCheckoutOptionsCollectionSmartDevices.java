package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.Store;

/**
 * GeneralMerchantsCheckoutOptionsCollectionSmartDevices
 */
public class GeneralMerchantsCheckoutOptionsCollectionSmartDevices {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("store")
  private Store store = null;

  public GeneralMerchantsCheckoutOptionsCollectionSmartDevices object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of smart device
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public GeneralMerchantsCheckoutOptionsCollectionSmartDevices id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of smart device
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GeneralMerchantsCheckoutOptionsCollectionSmartDevices description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of smart device
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public GeneralMerchantsCheckoutOptionsCollectionSmartDevices store(Store store) {
    this.store = store;
    return this;
  }

   /**
   * Get store
   * @return store
  **/
  public Store getStore() {
    return store;
  }

  public void setStore(Store store) {
    this.store = store;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralMerchantsCheckoutOptionsCollectionSmartDevices generalMerchantsCheckoutOptionsCollectionSmartDevices = (GeneralMerchantsCheckoutOptionsCollectionSmartDevices) o;
    return Objects.equals(this.object, generalMerchantsCheckoutOptionsCollectionSmartDevices.object) &&
        Objects.equals(this.id, generalMerchantsCheckoutOptionsCollectionSmartDevices.id) &&
        Objects.equals(this.description, generalMerchantsCheckoutOptionsCollectionSmartDevices.description) &&
        Objects.equals(this.store, generalMerchantsCheckoutOptionsCollectionSmartDevices.store);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, description, store);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralMerchantsCheckoutOptionsCollectionSmartDevices {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
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

