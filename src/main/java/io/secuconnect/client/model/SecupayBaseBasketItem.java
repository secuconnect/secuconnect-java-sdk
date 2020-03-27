package io.secuconnect.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Item describing single position in basket in transaction
 */
public class SecupayBaseBasketItem {
  @SerializedName("item_type")
  private String itemType = "article";

  @SerializedName("article_number")
  private String articleNumber = null;

  @SerializedName("quantity")
  private Integer quantity = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("model")
  private String model = null;

  @SerializedName("ean")
  private String ean = null;

  @SerializedName("tax")
  private String tax = null;

  @SerializedName("total")
  private Integer total = null;

  @SerializedName("price")
  private Integer price = null;

  @SerializedName("apikey")
  private String apikey = null;

  @SerializedName("transaction_hash")
  private String transactionHash = null;

  @SerializedName("contract_id")
  private String contractId = null;

  @SerializedName("reference_id")
  private String referenceId = null;

  public SecupayBaseBasketItem itemType(String itemType) {
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

  public SecupayBaseBasketItem articleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
    return this;
  }

   /**
   * Article number of item
   * @return articleNumber
  **/
  public String getArticleNumber() {
    return articleNumber;
  }

  public void setArticleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
  }

  public SecupayBaseBasketItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Quantity of articles in item
   * @return quantity
  **/
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public SecupayBaseBasketItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Descriptive name of item
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SecupayBaseBasketItem model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Model of item
   * @return model
  **/
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public SecupayBaseBasketItem ean(String ean) {
    this.ean = ean;
    return this;
  }

   /**
   * EAN, European Article Number
   * @return ean
  **/
  public String getEan() {
    return ean;
  }

  public void setEan(String ean) {
    this.ean = ean;
  }

  public SecupayBaseBasketItem tax(String tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Applicable tax in percentages
   * @return tax
  **/
  public String getTax() {
    return tax;
  }

  public void setTax(String tax) {
    this.tax = tax;
  }

  public SecupayBaseBasketItem total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total price
   * @return total
  **/
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public SecupayBaseBasketItem price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * Price of single article, if item is of article category
   * @return price
  **/
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public SecupayBaseBasketItem apikey(String apikey) {
    this.apikey = apikey;
    return this;
  }

   /**
   * Special param for stakeholder payments
   * @return apikey
  **/
  public String getApikey() {
    return apikey;
  }

  public void setApikey(String apikey) {
    this.apikey = apikey;
  }

  public SecupayBaseBasketItem transactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
    return this;
  }

   /**
   * Special param for payout payments
   * @return transactionHash
  **/
  public String getTransactionHash() {
    return transactionHash;
  }

  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }

  public SecupayBaseBasketItem contractId(String contractId) {
    this.contractId = contractId;
    return this;
  }

   /**
   * Contract id - Special param for stakeholder payments
   * @return contractId
  **/
  public String getContractId() {
    return contractId;
  }

  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

  public SecupayBaseBasketItem referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * Reference id - must be unique for the entire basket
   * @return referenceId
  **/
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayBaseBasketItem secupayBaseBasketItem = (SecupayBaseBasketItem) o;
    return Objects.equals(this.itemType, secupayBaseBasketItem.itemType) &&
        Objects.equals(this.articleNumber, secupayBaseBasketItem.articleNumber) &&
        Objects.equals(this.quantity, secupayBaseBasketItem.quantity) &&
        Objects.equals(this.name, secupayBaseBasketItem.name) &&
        Objects.equals(this.model, secupayBaseBasketItem.model) &&
        Objects.equals(this.ean, secupayBaseBasketItem.ean) &&
        Objects.equals(this.tax, secupayBaseBasketItem.tax) &&
        Objects.equals(this.total, secupayBaseBasketItem.total) &&
        Objects.equals(this.price, secupayBaseBasketItem.price) &&
        Objects.equals(this.apikey, secupayBaseBasketItem.apikey) &&
        Objects.equals(this.transactionHash, secupayBaseBasketItem.transactionHash) &&
        Objects.equals(this.contractId, secupayBaseBasketItem.contractId) &&
        Objects.equals(this.referenceId, secupayBaseBasketItem.referenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemType, articleNumber, quantity, name, model, ean, tax, total, price, apikey, transactionHash, contractId, referenceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayBaseBasketItem {\n");
    
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    articleNumber: ").append(toIndentedString(articleNumber)).append("\n");
    sb.append("    quantity: ").append(toIndentedString(quantity)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    model: ").append(toIndentedString(model)).append("\n");
    sb.append("    ean: ").append(toIndentedString(ean)).append("\n");
    sb.append("    tax: ").append(toIndentedString(tax)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
    sb.append("    price: ").append(toIndentedString(price)).append("\n");
    sb.append("    apikey: ").append(toIndentedString(apikey)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
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
