package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartTransactionsBasketProductGroup;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SmartTransactionsSubBasketProduct
 */
public class SmartTransactionsSubBasketProduct {
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

  public SmartTransactionsSubBasketProduct id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Product id
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SmartTransactionsSubBasketProduct parent(Integer parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Parent
   * @return parent
  **/
  public Integer getParent() {
    return parent;
  }

  public void setParent(Integer parent) {
    this.parent = parent;
  }

  public SmartTransactionsSubBasketProduct itemType(String itemType) {
    this.itemType = itemType;
    return this;
  }

   /**
   * Category of item
   * @return itemType
  **/
  public String getItemType() {
    return itemType;
  }

  public void setItemType(String itemType) {
    this.itemType = itemType;
  }

  public SmartTransactionsSubBasketProduct desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Description of the sub-basket product
   * @return desc
  **/
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public SmartTransactionsSubBasketProduct articleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
    return this;
  }

   /**
   * Article number
   * @return articleNumber
  **/
  public String getArticleNumber() {
    return articleNumber;
  }

  public void setArticleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
  }

  public SmartTransactionsSubBasketProduct serialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
    return this;
  }

   /**
   * The serialnumber of the scanned posa card
   * @return serialNumber
  **/
  public String getSerialNumber() {
    return serialNumber;
  }

  public void setSerialNumber(String serialNumber) {
    this.serialNumber = serialNumber;
  }

  public SmartTransactionsSubBasketProduct ean(String ean) {
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

  public SmartTransactionsSubBasketProduct quantity(Integer quantity) {
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

  public SmartTransactionsSubBasketProduct priceOne(Integer priceOne) {
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

  public SmartTransactionsSubBasketProduct sum(Integer sum) {
    this.sum = sum;
    return this;
  }

   /**
   * Get sum
   * @return sum
  **/
  public Integer getSum() {
    return sum;
  }

  public void setSum(Integer sum) {
    this.sum = sum;
  }

  public SmartTransactionsSubBasketProduct tax(Integer tax) {
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

  public SmartTransactionsSubBasketProduct referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * The reference_id must be unique, it&#x27;s Referring to the reference_id of SmartTransactionsBasketProduct [example: SmartTransactionsBasketProduct-&gt;reference_id is 1000 then all SmartTransactionsSubBasketProduct must have unique reference_id like 1000.1, 1000.2 etc.]
   * @return referenceId
  **/
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public SmartTransactionsSubBasketProduct contractId(String contractId) {
    this.contractId = contractId;
    return this;
  }

   /**
   * contract id
   * @return contractId
  **/
  public String getContractId() {
    return contractId;
  }

  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

  public SmartTransactionsSubBasketProduct group(List<SmartTransactionsBasketProductGroup> group) {
    this.group = group;
    return this;
  }

  public SmartTransactionsSubBasketProduct addGroupItem(SmartTransactionsBasketProductGroup groupItem) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsSubBasketProduct smartTransactionsSubBasketProduct = (SmartTransactionsSubBasketProduct) o;
    return Objects.equals(this.id, smartTransactionsSubBasketProduct.id) &&
        Objects.equals(this.parent, smartTransactionsSubBasketProduct.parent) &&
        Objects.equals(this.itemType, smartTransactionsSubBasketProduct.itemType) &&
        Objects.equals(this.desc, smartTransactionsSubBasketProduct.desc) &&
        Objects.equals(this.articleNumber, smartTransactionsSubBasketProduct.articleNumber) &&
        Objects.equals(this.serialNumber, smartTransactionsSubBasketProduct.serialNumber) &&
        Objects.equals(this.ean, smartTransactionsSubBasketProduct.ean) &&
        Objects.equals(this.quantity, smartTransactionsSubBasketProduct.quantity) &&
        Objects.equals(this.priceOne, smartTransactionsSubBasketProduct.priceOne) &&
        Objects.equals(this.sum, smartTransactionsSubBasketProduct.sum) &&
        Objects.equals(this.tax, smartTransactionsSubBasketProduct.tax) &&
        Objects.equals(this.referenceId, smartTransactionsSubBasketProduct.referenceId) &&
        Objects.equals(this.contractId, smartTransactionsSubBasketProduct.contractId) &&
        Objects.equals(this.group, smartTransactionsSubBasketProduct.group);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parent, itemType, desc, articleNumber, serialNumber, ean, quantity, priceOne, sum, tax, referenceId, contractId, group);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsSubBasketProduct {\n");
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

