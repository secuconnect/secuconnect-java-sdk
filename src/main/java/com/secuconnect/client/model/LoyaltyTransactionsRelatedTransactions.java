package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyTransactionsRelatedTransactions
 */
public class LoyaltyTransactionsRelatedTransactions {
  @SerializedName("object")
  protected String object = null;

  @SerializedName("id")
  protected String id = null;

  @SerializedName("trans_id")
  protected Integer transId = null;

  @SerializedName("ref_type_id")
  protected Integer refTypeId = null;

  @SerializedName("relation_type")
  protected String relationType = null;

  public LoyaltyTransactionsRelatedTransactions object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public LoyaltyTransactionsRelatedTransactions id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Loyalty Transaction ID
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LoyaltyTransactionsRelatedTransactions transId(Integer transId) {
    this.transId = transId;
    return this;
  }

   /**
   * Loyalty Transaction trans_id
   * @return transId
  **/
  public Integer getTransId() {
    return transId;
  }

  public void setTransId(Integer transId) {
    this.transId = transId;
  }

  public LoyaltyTransactionsRelatedTransactions refTypeId(Integer refTypeId) {
    this.refTypeId = refTypeId;
    return this;
  }

   /**
   * Reference type id
   * @return refTypeId
  **/
  public Integer getRefTypeId() {
    return refTypeId;
  }

  public void setRefTypeId(Integer refTypeId) {
    this.refTypeId = refTypeId;
  }

  public LoyaltyTransactionsRelatedTransactions relationType(String relationType) {
    this.relationType = relationType;
    return this;
  }

   /**
   * Relation type
   * @return relationType
  **/
  public String getRelationType() {
    return relationType;
  }

  public void setRelationType(String relationType) {
    this.relationType = relationType;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyTransactionsRelatedTransactions loyaltyTransactionsRelatedTransactions = (LoyaltyTransactionsRelatedTransactions) o;
    return Objects.equals(this.object, loyaltyTransactionsRelatedTransactions.object) &&
        Objects.equals(this.id, loyaltyTransactionsRelatedTransactions.id) &&
        Objects.equals(this.transId, loyaltyTransactionsRelatedTransactions.transId) &&
        Objects.equals(this.refTypeId, loyaltyTransactionsRelatedTransactions.refTypeId) &&
        Objects.equals(this.relationType, loyaltyTransactionsRelatedTransactions.relationType);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, transId, refTypeId, relationType);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyTransactionsRelatedTransactions {\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
    sb.append("    refTypeId: ").append(toIndentedString(refTypeId)).append("\n");
    sb.append("    relationType: ").append(toIndentedString(relationType)).append("\n");
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

