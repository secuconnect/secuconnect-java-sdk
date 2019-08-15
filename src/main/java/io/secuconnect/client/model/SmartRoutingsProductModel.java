package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.ProductInstanceUID;
import io.secuconnect.client.model.SmartRoutingsAssign;
import io.secuconnect.client.model.Store;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SmartRoutingsProductModel
 */
public class SmartRoutingsProductModel {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("merchant")
  private ProductInstanceUID merchant = null;

  @SerializedName("store")
  private Store store = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("updated")
  private String updated = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("assign")
  private List<SmartRoutingsAssign> assign = null;

  public SmartRoutingsProductModel object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of smart routing
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public SmartRoutingsProductModel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of smart routing
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SmartRoutingsProductModel merchant(ProductInstanceUID merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Merchant
   * @return merchant
  **/
  public ProductInstanceUID getMerchant() {
    return merchant;
  }

  public void setMerchant(ProductInstanceUID merchant) {
    this.merchant = merchant;
  }

  public SmartRoutingsProductModel store(Store store) {
    this.store = store;
    return this;
  }

   /**
   * Store
   * @return store
  **/
  public Store getStore() {
    return store;
  }

  public void setStore(Store store) {
    this.store = store;
  }

  public SmartRoutingsProductModel created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Created at date
   * @return created
  **/
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public SmartRoutingsProductModel updated(String updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Updated at date
   * @return updated
  **/
  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  public SmartRoutingsProductModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SmartRoutingsProductModel assign(List<SmartRoutingsAssign> assign) {
    this.assign = assign;
    return this;
  }

  public SmartRoutingsProductModel addAssignItem(SmartRoutingsAssign assignItem) {
    if (this.assign == null) {
      this.assign = new ArrayList<SmartRoutingsAssign>();
    }
    this.assign.add(assignItem);
    return this;
  }

   /**
   * Assign
   * @return assign
  **/
  public List<SmartRoutingsAssign> getAssign() {
    return assign;
  }

  public void setAssign(List<SmartRoutingsAssign> assign) {
    this.assign = assign;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartRoutingsProductModel smartRoutingsProductModel = (SmartRoutingsProductModel) o;
    return Objects.equals(this.object, smartRoutingsProductModel.object) &&
        Objects.equals(this.id, smartRoutingsProductModel.id) &&
        Objects.equals(this.merchant, smartRoutingsProductModel.merchant) &&
        Objects.equals(this.store, smartRoutingsProductModel.store) &&
        Objects.equals(this.created, smartRoutingsProductModel.created) &&
        Objects.equals(this.updated, smartRoutingsProductModel.updated) &&
        Objects.equals(this.description, smartRoutingsProductModel.description) &&
        Objects.equals(this.assign, smartRoutingsProductModel.assign);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, merchant, store, created, updated, description, assign);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartRoutingsProductModel {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    assign: ").append(toIndentedString(assign)).append("\n");
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
