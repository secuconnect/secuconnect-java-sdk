package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/**
 * Item describing single position in basket in transaction
 */
@ApiModel(description = "Item describing single position in basket in transaction")
public class SecupayBasketItem {
  @SerializedName("item_type")
  private String itemType = null;

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

  public SecupayBasketItem itemType(String itemType) {
    this.itemType = itemType;
    return this;
  }

   /**
   * Category of item
   * @return itemType
  **/
  @ApiModelProperty(value = "Category of item")
  public String getItemType() {
    return itemType;
  }

  public void setItemType(String itemType) {
    this.itemType = itemType;
  }

  public SecupayBasketItem articleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
    return this;
  }

   /**
   * Article number, if item is of article category
   * @return articleNumber
  **/
  @ApiModelProperty(value = "Article number, if item is of article category")
  public String getArticleNumber() {
    return articleNumber;
  }

  public void setArticleNumber(String articleNumber) {
    this.articleNumber = articleNumber;
  }

  public SecupayBasketItem quantity(Integer quantity) {
    this.quantity = quantity;
    return this;
  }

   /**
   * Quantity of articles in item
   * @return quantity
  **/
  @ApiModelProperty(value = "Quantity of articles in item")
  public Integer getQuantity() {
    return quantity;
  }

  public void setQuantity(Integer quantity) {
    this.quantity = quantity;
  }

  public SecupayBasketItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Descriptive name of item
   * @return name
  **/
  @ApiModelProperty(value = "Descriptive name of item")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SecupayBasketItem model(String model) {
    this.model = model;
    return this;
  }

   /**
   * Model of item
   * @return model
  **/
  @ApiModelProperty(value = "Model of item")
  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public SecupayBasketItem ean(String ean) {
    this.ean = ean;
    return this;
  }

   /**
   * EAN, European Article Number
   * @return ean
  **/
  @ApiModelProperty(value = "EAN, European Article Number")
  public String getEan() {
    return ean;
  }

  public void setEan(String ean) {
    this.ean = ean;
  }

  public SecupayBasketItem tax(String tax) {
    this.tax = tax;
    return this;
  }

   /**
   * Applicable tax in percentages
   * @return tax
  **/
  @ApiModelProperty(value = "Applicable tax in percentages")
  public String getTax() {
    return tax;
  }

  public void setTax(String tax) {
    this.tax = tax;
  }

  public SecupayBasketItem total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Total price
   * @return total
  **/
  @ApiModelProperty(value = "Total price")
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  public SecupayBasketItem price(Integer price) {
    this.price = price;
    return this;
  }

   /**
   * Price of single article, if item is of article category
   * @return price
  **/
  @ApiModelProperty(value = "Price of single article, if item is of article category")
  public Integer getPrice() {
    return price;
  }

  public void setPrice(Integer price) {
    this.price = price;
  }

  public SecupayBasketItem apikey(String apikey) {
    this.apikey = apikey;
    return this;
  }

   /**
   * Special param for stakeholder payments
   * @return apikey
  **/
  @ApiModelProperty(value = "Special param for stakeholder payments")
  public String getApikey() {
    return apikey;
  }

  public void setApikey(String apikey) {
    this.apikey = apikey;
  }

  public SecupayBasketItem transactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
    return this;
  }

   /**
   * Special param for payout payments
   * @return transactionHash
  **/
  @ApiModelProperty(value = "Special param for payout payments")
  public String getTransactionHash() {
    return transactionHash;
  }

  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }

  public SecupayBasketItem contractId(String contractId) {
    this.contractId = contractId;
    return this;
  }

   /**
   * Contract id - Special param for stakeholder payments
   * @return contractId
  **/
  @ApiModelProperty(value = "Contract id - Special param for stakeholder payments")
  public String getContractId() {
    return contractId;
  }

  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayBasketItem secupayBasketItem = (SecupayBasketItem) o;
    return Objects.equals(this.itemType, secupayBasketItem.itemType) &&
        Objects.equals(this.articleNumber, secupayBasketItem.articleNumber) &&
        Objects.equals(this.quantity, secupayBasketItem.quantity) &&
        Objects.equals(this.name, secupayBasketItem.name) &&
        Objects.equals(this.model, secupayBasketItem.model) &&
        Objects.equals(this.ean, secupayBasketItem.ean) &&
        Objects.equals(this.tax, secupayBasketItem.tax) &&
        Objects.equals(this.total, secupayBasketItem.total) &&
        Objects.equals(this.price, secupayBasketItem.price) &&
        Objects.equals(this.apikey, secupayBasketItem.apikey) &&
        Objects.equals(this.transactionHash, secupayBasketItem.transactionHash) &&
        Objects.equals(this.contractId, secupayBasketItem.contractId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemType, articleNumber, quantity, name, model, ean, tax, total, price, apikey, transactionHash, contractId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayBasketItem {\n");
    
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

