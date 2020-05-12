package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyTransactionsDTORelatedTransactions
 */
public class LoyaltyTransactionsDTORelatedTransactions {
  @SerializedName("id")
  private String id = null;

  @SerializedName("trans_id")
  private Integer transId = null;

  @SerializedName("ref_type_id")
  private Integer refTypeId = null;

  public LoyaltyTransactionsDTORelatedTransactions id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Loyalty Transaction id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LoyaltyTransactionsDTORelatedTransactions transId(Integer transId) {
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

  public LoyaltyTransactionsDTORelatedTransactions refTypeId(Integer refTypeId) {
    this.refTypeId = refTypeId;
    return this;
  }

   /**
   * Indicator for relation type of Loyalty Transactions
   * @return refTypeId
  **/
  public Integer getRefTypeId() {
    return refTypeId;
  }

  public void setRefTypeId(Integer refTypeId) {
    this.refTypeId = refTypeId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyTransactionsDTORelatedTransactions loyaltyTransactionsDTORelatedTransactions = (LoyaltyTransactionsDTORelatedTransactions) o;
    return Objects.equals(this.id, loyaltyTransactionsDTORelatedTransactions.id) &&
        Objects.equals(this.transId, loyaltyTransactionsDTORelatedTransactions.transId) &&
        Objects.equals(this.refTypeId, loyaltyTransactionsDTORelatedTransactions.refTypeId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, transId, refTypeId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyTransactionsDTORelatedTransactions {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
    sb.append("    refTypeId: ").append(toIndentedString(refTypeId)).append("\n");
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

