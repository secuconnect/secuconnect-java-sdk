package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartTransactionsBasketProductGroup;
import com.secuconnect.client.model.SmartTransactionsSubBasketProduct;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Single item in basket
 */
public class SmartTransactionsBasketProduct {
  @SerializedName("id")
  protected Integer id = null;

  @SerializedName("parent")
  protected Integer parent = null;

  @SerializedName("item_type")
  protected String itemType = null;

  @SerializedName("desc")
  protected String desc = null;

  @SerializedName("articleNumber")
  protected String articleNumber = null;

  @SerializedName("serialNumber")
  protected String serialNumber = null;

  @SerializedName("ean")
  protected String ean = null;

  @SerializedName("quantity")
  protected Integer quantity = null;

  @SerializedName("priceOne")
  protected Integer priceOne = null;

  @SerializedName("sum")
  protected Integer sum = null;

  @SerializedName("tax")
  protected Integer tax = null;

  @SerializedName("reference_id")
  protected String referenceId = null;

  @SerializedName("contract_id")
  protected String contractId = null;

  @SerializedName("group")
  protected List<SmartTransactionsBasketProductGroup> group = null;

  @SerializedName("sub_basket")
  protected List<SmartTransactionsSubBasketProduct> subBasket = null;

  @SerializedName("plan_id")
  protected String planId = null;

  @SerializedName("start_at")
  protected String startAt = null;

  public SmartTransactionsBasketProduct id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Item ID
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SmartTransactionsBasketProduct parent(Integer parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Parent item ID
   * @return parent
  **/
  public Integer getParent() {
    return parent;
  }

  public void setParent(Integer parent) {
    this.parent = parent;
  }

  public SmartTransactionsBasketProduct itemType(String itemType) {
    this.itemType = itemType;
    return this;
  }

   /**
   * Item type:  - &#x60;\&quot;article\&quot;&#x60; - &#x60;\&quot;coupon\&quot;&#x60; - &#x60;\&quot;sub_transaction\&quot;&#x60; - &#x60;\&quot;stakeholder_payment\&quot;&#x60; - &#x60;\&quot;shipping\&quot;&#x60; - &#x60;\&quot;subscription\&quot;&#x60;  _Note: \&quot;coupon\&quot; items have the effect of reducing the amount. They are for coupons managed by the merchant, but not for secucard._
   * @return itemType
  **/
  public String getItemType() {
    return itemType;
  }

  public void setItemType(String itemType) {
    this.itemType = itemType;
  }

  public SmartTransactionsBasketProduct desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Descriptive article name
   * @return desc
  **/
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public SmartTransactionsBasketProduct articleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
    return this;
  }

   /**
   * Article number (SKU)
   * @return articleNumber
  **/
  public String getArticleNumber() {
    return articleNumber;
  }

  public void setArticleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
  }

  public SmartTransactionsBasketProduct serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * Serial number of the POS activation card (POSA)
   * @return serialNumber
  **/
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public SmartTransactionsBasketProduct ean(String ean) {
    this.ean = ean;
    return this;
  }

   /**
   * Get ean
   * @return ean
  **/
  public String getEan() {
    return ean;
  }

  public void setEan(String ean) {
    this.ean = ean;
  }

  public SmartTransactionsBasketProduct quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Quantity
   * @return quantity
  **/
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public SmartTransactionsBasketProduct priceOne(Integer priceOne) {
    this.priceOne = priceOne;
    return this;
  }

   /**
   * Get priceOne
   * @return priceOne
  **/
  public Integer getPriceOne() {
    return priceOne;
  }

  public void setPriceOne(Integer priceOne) {
    this.priceOne = priceOne;
  }

  public SmartTransactionsBasketProduct sum(Integer sum) {
    this.sum = sum;
    return this;
  }

   /**
   * Total amount of all items in a sub-basket; in the smallest currency unit (e. g. Euro Cent)
   * @return sum
  **/
  public Integer getSum() {
    return sum;
  }

  public void setSum(Integer sum) {
    this.sum = sum;
  }

  public SmartTransactionsBasketProduct tax(Integer tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Get tax
   * @return tax
  **/
  public Integer getTax() {
    return tax;
  }

  public void setTax(Integer tax) {
    this.tax = tax;
  }

  public SmartTransactionsBasketProduct referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Unique line identifier, used to update the basket before the transaction is executed
   * @return referenceId
  **/
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public SmartTransactionsBasketProduct contractId(String contractId) {
    this.contractId = contractId;
    return this;
  }

   /**
   * General Contract ID of the merchant (sub-basket) or payee (stakeholder share)
   * @return contractId
  **/
  public String getContractId() {
    return contractId;
  }

  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

  public SmartTransactionsBasketProduct group(List<SmartTransactionsBasketProductGroup> group) {
    this.group = group;
    return this;
  }

  public SmartTransactionsBasketProduct addGroupItem(SmartTransactionsBasketProductGroup groupItem) {
    if (this.group == null) {
      this.group = new ArrayList<SmartTransactionsBasketProductGroup>();
    }
    this.group.add(groupItem);
    return this;
  }

   /**
   * Group
   * @return group
  **/
  public List<SmartTransactionsBasketProductGroup> getGroup() {
    return group;
  }

  public void setGroup(List<SmartTransactionsBasketProductGroup> group) {
    this.group = group;
  }

  public SmartTransactionsBasketProduct subBasket(List<SmartTransactionsSubBasketProduct> subBasket) {
    this.subBasket = subBasket;
    return this;
  }

  public SmartTransactionsBasketProduct addSubBasketItem(SmartTransactionsSubBasketProduct subBasketItem) {
    if (this.subBasket == null) {
      this.subBasket = new ArrayList<SmartTransactionsSubBasketProduct>();
    }
    this.subBasket.add(subBasketItem);
    return this;
  }

   /**
   * Sub-baskets  Nest items für sub-baskets here. (Only one level.)
   * @return subBasket
  **/
  public List<SmartTransactionsSubBasketProduct> getSubBasket() {
    return subBasket;
  }

  public void setSubBasket(List<SmartTransactionsSubBasketProduct> subBasket) {
    this.subBasket = subBasket;
  }

  public SmartTransactionsBasketProduct planId(String planId) {
    this.planId = planId;
    return this;
  }

   /**
   * Subscription Plan ID
   * @return planId
  **/
  public String getPlanId() {
    return planId;
  }

  public void setPlanId(String planId) {
    this.planId = planId;
  }

  public SmartTransactionsBasketProduct startAt(String startAt) {
    this.startAt = startAt;
    return this;
  }

   /**
   * Subscription start date (ISO 8601 date and time)
   * @return startAt
  **/
  public String getStartAt() {
    return startAt;
  }

  public void setStartAt(String startAt) {
    this.startAt = startAt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsBasketProduct smartTransactionsBasketProduct = (SmartTransactionsBasketProduct) o;
    return Objects.equals(this.id, smartTransactionsBasketProduct.id) &&
        Objects.equals(this.parent, smartTransactionsBasketProduct.parent) &&
        Objects.equals(this.itemType, smartTransactionsBasketProduct.itemType) &&
        Objects.equals(this.desc, smartTransactionsBasketProduct.desc) &&
        Objects.equals(this.articleNumber, smartTransactionsBasketProduct.articleNumber) &&
        Objects.equals(this.serialNumber, smartTransactionsBasketProduct.serialNumber) &&
        Objects.equals(this.ean, smartTransactionsBasketProduct.ean) &&
        Objects.equals(this.quantity, smartTransactionsBasketProduct.quantity) &&
        Objects.equals(this.priceOne, smartTransactionsBasketProduct.priceOne) &&
        Objects.equals(this.sum, smartTransactionsBasketProduct.sum) &&
        Objects.equals(this.tax, smartTransactionsBasketProduct.tax) &&
        Objects.equals(this.referenceId, smartTransactionsBasketProduct.referenceId) &&
        Objects.equals(this.contractId, smartTransactionsBasketProduct.contractId) &&
        Objects.equals(this.group, smartTransactionsBasketProduct.group) &&
        Objects.equals(this.subBasket, smartTransactionsBasketProduct.subBasket) &&
        Objects.equals(this.planId, smartTransactionsBasketProduct.planId) &&
        Objects.equals(this.startAt, smartTransactionsBasketProduct.startAt);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parent, itemType, desc, articleNumber, serialNumber, ean, quantity, priceOne, sum, tax, referenceId, contractId, group, subBasket, planId, startAt);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsBasketProduct {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    articleNumber: ").append(toIndentedString(articleNumber)).append("\n");
    sb.append("    serialNumber: ").append(toIndentedString(serialNumber)).append("\n");
    sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    priceOne: ").append(toIndentedString(priceOne)).append("\n");
    sb.append("    sum: ").append(toIndentedString(sum)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    group: ").append(toIndentedString(group)).append("\n");
    sb.append("    subBasket: ").append(toIndentedString(subBasket)).append("\n");
    sb.append("    planId: ").append(toIndentedString(planId)).append("\n");
    sb.append("    startAt: ").append(toIndentedString(startAt)).append("\n");
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

