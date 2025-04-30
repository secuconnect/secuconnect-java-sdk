package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.CreatedField;
import com.secuconnect.client.model.ProductInstanceUID;
import com.secuconnect.client.model.SmartRoutingsAssign;
import com.secuconnect.client.model.Store;
import com.secuconnect.client.model.UpdatedField;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Smart Routing
 */
public class SmartRoutingsProductModel extends BaseProductModel {
  @SerializedName("l")
  protected Integer l = null;

  @SerializedName("k")
  protected Integer k = null;

  @SerializedName("ks")
  protected String ks = null;

  @SerializedName("c")
  protected Integer c = null;

  @SerializedName("s")
  protected Integer s = null;

  @SerializedName("t")
  protected AggregationTimeResult t = null;

  @SerializedName("created")
  protected String created = null;

  @SerializedName("updated")
  protected String updated = null;

  @SerializedName("merchant")
  protected ProductInstanceUID merchant = null;

  @SerializedName("store")
  protected Store store = null;

  @SerializedName("description")
  protected String description = null;

  @SerializedName("assign")
  protected List<SmartRoutingsAssign> assign = null;

  public SmartRoutingsProductModel l(Integer l) {
    this.l = l;
    return this;
  }

   /**
   * lookup index
   * @return l
  **/
  public Integer getL() {
    return l;
  }

  public void setL(Integer l) {
    this.l = l;
  }

  public SmartRoutingsProductModel k(Integer k) {
    this.k = k;
    return this;
  }

   /**
   * key index
   * @return k
  **/
  public Integer getK() {
    return k;
  }

  public void setK(Integer k) {
    this.k = k;
  }

  public SmartRoutingsProductModel ks(String ks) {
    this.ks = ks;
    return this;
  }

   /**
   * key name
   * @return ks
  **/
  public String getKs() {
    return ks;
  }

  public void setKs(String ks) {
    this.ks = ks;
  }

  public SmartRoutingsProductModel c(Integer c) {
    this.c = c;
    return this;
  }

   /**
   * count (number of items)
   * @return c
  **/
  public Integer getC() {
    return c;
  }

  public void setC(Integer c) {
    this.c = c;
  }

  public SmartRoutingsProductModel s(Integer s) {
    this.s = s;
    return this;
  }

   /**
   * sum
   * @return s
  **/
  public Integer getS() {
    return s;
  }

  public void setS(Integer s) {
    this.s = s;
  }

  public SmartRoutingsProductModel t(AggregationTimeResult t) {
    this.t = t;
    return this;
  }

   /**
   * Get t
   * @return t
  **/
  public AggregationTimeResult getT() {
    return t;
  }

  public void setT(AggregationTimeResult t) {
    this.t = t;
  }

  public SmartRoutingsProductModel created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
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
   * Get updated
   * @return updated
  **/
  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  public SmartRoutingsProductModel merchant(ProductInstanceUID merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
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
   * Get store
   * @return store
  **/
  public Store getStore() {
    return store;
  }

  public void setStore(Store store) {
    this.store = store;
  }

  public SmartRoutingsProductModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Route description
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
   * Assigned devices
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
    return Objects.equals(this.l, smartRoutingsProductModel.l) &&
        Objects.equals(this.k, smartRoutingsProductModel.k) &&
        Objects.equals(this.ks, smartRoutingsProductModel.ks) &&
        Objects.equals(this.c, smartRoutingsProductModel.c) &&
        Objects.equals(this.s, smartRoutingsProductModel.s) &&
        Objects.equals(this.t, smartRoutingsProductModel.t) &&
        Objects.equals(this.created, smartRoutingsProductModel.created) &&
        Objects.equals(this.updated, smartRoutingsProductModel.updated) &&
        Objects.equals(this.merchant, smartRoutingsProductModel.merchant) &&
        Objects.equals(this.store, smartRoutingsProductModel.store) &&
        Objects.equals(this.description, smartRoutingsProductModel.description) &&
        Objects.equals(this.assign, smartRoutingsProductModel.assign) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, created, updated, merchant, store, description, assign, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartRoutingsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    l: ").append(toIndentedString(l)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    ks: ").append(toIndentedString(ks)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    store: ").append(toIndentedString(store)).append("\n");
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

