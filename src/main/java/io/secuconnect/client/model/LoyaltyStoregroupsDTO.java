package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;

/**
 * LoyaltyStoregroupsDTO
 */
public class LoyaltyStoregroupsDTO {
  @SerializedName("name")
  private String name = null;

  @SerializedName("merchant")
  private String merchant = null;

  @SerializedName("stores")
  private List<String> stores = null;

  public LoyaltyStoregroupsDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Loyalty store group name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LoyaltyStoregroupsDTO merchant(String merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Loyalty store group merchant id
   * @return merchant
  **/
  public String getMerchant() {
    return merchant;
  }

  public void setMerchant(String merchant) {
    this.merchant = merchant;
  }

  public LoyaltyStoregroupsDTO stores(List<String> stores) {
    this.stores = stores;
    return this;
  }

  public LoyaltyStoregroupsDTO addStoresItem(String storesItem) {
    if (this.stores == null) {
      this.stores = new ArrayList<String>();
    }
    this.stores.add(storesItem);
    return this;
  }

   /**
   * List of loyalty stores ids
   * @return stores
  **/
  public List<String> getStores() {
    return stores;
  }

  public void setStores(List<String> stores) {
    this.stores = stores;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyStoregroupsDTO loyaltyStoregroupsDTO = (LoyaltyStoregroupsDTO) o;
    return Objects.equals(this.name, loyaltyStoregroupsDTO.name) &&
        Objects.equals(this.merchant, loyaltyStoregroupsDTO.merchant) &&
        Objects.equals(this.stores, loyaltyStoregroupsDTO.stores);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, merchant, stores);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyStoregroupsDTO {\n");
    
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    stores: ").append(toIndentedString(stores)).append("\n");
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

