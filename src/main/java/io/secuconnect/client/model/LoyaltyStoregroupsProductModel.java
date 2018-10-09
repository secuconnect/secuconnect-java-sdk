package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.LoyaltyDTOMerchant;
import io.secuconnect.client.model.LoyaltyDTOStore;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.joda.time.DateTime;
import java.util.Objects;

/**
 * LoyaltyStoregroupsProductModel
 */
public class LoyaltyStoregroupsProductModel {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("merchant")
  private LoyaltyDTOMerchant merchant = null;

  @SerializedName("stores")
  private List<LoyaltyDTOStore> stores = null;

  @SerializedName("created")
  private DateTime created = null;

  @SerializedName("updated")
  private DateTime updated = null;

  public LoyaltyStoregroupsProductModel object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of loyalty store group
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public LoyaltyStoregroupsProductModel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of loyalty store group
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LoyaltyStoregroupsProductModel merchant(LoyaltyDTOMerchant merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Merchant data for loyalty
   * @return merchant
  **/
  public LoyaltyDTOMerchant getMerchant() {
    return merchant;
  }

  public void setMerchant(LoyaltyDTOMerchant merchant) {
    this.merchant = merchant;
  }

  public LoyaltyStoregroupsProductModel stores(List<LoyaltyDTOStore> stores) {
    this.stores = stores;
    return this;
  }

  public LoyaltyStoregroupsProductModel addStoresItem(LoyaltyDTOStore storesItem) {
    if (this.stores == null) {
      this.stores = new ArrayList<LoyaltyDTOStore>();
    }
    this.stores.add(storesItem);
    return this;
  }

   /**
   * LoyaltyStoregroupsProductModel
   * @return stores
  **/
  public List<LoyaltyDTOStore> getStores() {
    return stores;
  }

  public void setStores(List<LoyaltyDTOStore> stores) {
    this.stores = stores;
  }

  public LoyaltyStoregroupsProductModel created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Creation date
   * @return created
  **/
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public LoyaltyStoregroupsProductModel updated(DateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Update date
   * @return updated
  **/
  public DateTime getUpdated() {
    return updated;
  }

  public void setUpdated(DateTime updated) {
    this.updated = updated;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyStoregroupsProductModel loyaltyStoregroupsProductModel = (LoyaltyStoregroupsProductModel) o;
    return Objects.equals(this.object, loyaltyStoregroupsProductModel.object) &&
        Objects.equals(this.id, loyaltyStoregroupsProductModel.id) &&
        Objects.equals(this.merchant, loyaltyStoregroupsProductModel.merchant) &&
        Objects.equals(this.stores, loyaltyStoregroupsProductModel.stores) &&
        Objects.equals(this.created, loyaltyStoregroupsProductModel.created) &&
        Objects.equals(this.updated, loyaltyStoregroupsProductModel.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, merchant, stores, created, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyStoregroupsProductModel {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    stores: ").append(toIndentedString(stores)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

