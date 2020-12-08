package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * SecupayTransactionListItem
 */
public class SecupayTransactionListItem {
  @SerializedName("item_type")
  private String itemType = "transaction_payout";

  @SerializedName("reference_id")
  private String referenceId = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("transaction_hash")
  private String transactionHash = null;

  @SerializedName("transaction_id")
  private String transactionId = null;

  @SerializedName("container_id")
  private String containerId = null;

  @SerializedName("total")
  private Integer total = null;

  public SecupayTransactionListItem itemType(String itemType) {
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

  public SecupayTransactionListItem referenceId(String referenceId) {
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

  public SecupayTransactionListItem name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Item name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SecupayTransactionListItem transactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
    return this;
  }

   /**
   * Id of transaction
   * @return transactionHash
  **/
  public String getTransactionHash() {
    return transactionHash;
  }

  public void setTransactionHash(String transactionHash) {
    this.transactionHash = transactionHash;
  }

  public SecupayTransactionListItem transactionId(String transactionId) {
    this.transactionId = transactionId;
    return this;
  }

   /**
   * Id of transaction
   * @return transactionId
  **/
  public String getTransactionId() {
    return transactionId;
  }

  public void setTransactionId(String transactionId) {
    this.transactionId = transactionId;
  }

  public SecupayTransactionListItem containerId(String containerId) {
    this.containerId = containerId;
    return this;
  }

   /**
   * Payment Container ID
   * @return containerId
  **/
  public String getContainerId() {
    return containerId;
  }

  public void setContainerId(String containerId) {
    this.containerId = containerId;
  }

  public SecupayTransactionListItem total(Integer total) {
    this.total = total;
    return this;
  }

   /**
   * Get total
   * @return total
  **/
  public Integer getTotal() {
    return total;
  }

  public void setTotal(Integer total) {
    this.total = total;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayTransactionListItem secupayTransactionListItem = (SecupayTransactionListItem) o;
    return Objects.equals(this.itemType, secupayTransactionListItem.itemType) &&
        Objects.equals(this.referenceId, secupayTransactionListItem.referenceId) &&
        Objects.equals(this.name, secupayTransactionListItem.name) &&
        Objects.equals(this.transactionHash, secupayTransactionListItem.transactionHash) &&
        Objects.equals(this.transactionId, secupayTransactionListItem.transactionId) &&
        Objects.equals(this.containerId, secupayTransactionListItem.containerId) &&
        Objects.equals(this.total, secupayTransactionListItem.total);
  }

  @Override
  public int hashCode() {
    return Objects.hash(itemType, referenceId, name, transactionHash, transactionId, containerId, total);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayTransactionListItem {\n");
    sb.append("    itemType: ").append(toIndentedString(itemType)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    transactionHash: ").append(toIndentedString(transactionHash)).append("\n");
    sb.append("    transactionId: ").append(toIndentedString(transactionId)).append("\n");
    sb.append("    containerId: ").append(toIndentedString(containerId)).append("\n");
    sb.append("    total: ").append(toIndentedString(total)).append("\n");
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

