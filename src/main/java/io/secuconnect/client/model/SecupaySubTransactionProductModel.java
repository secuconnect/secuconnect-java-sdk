package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;

/**
 * SecupaySubTransactionProductModel
 */
public class SecupaySubTransactionProductModel {
  @SerializedName("id")
  private String id = null;

  @SerializedName("trans_id")
  private Integer transId = null;

  @SerializedName("reference_id")
  private String referenceId = null;

  public SecupaySubTransactionProductModel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SecupaySubTransactionProductModel transId(Integer transId) {
    this.transId = transId;
    return this;
  }

   /**
   * trans_id
   * @return transId
  **/
  public Integer getTransId() {
    return transId;
  }

  public void setTransId(Integer transId) {
    this.transId = transId;
  }

  public SecupaySubTransactionProductModel referenceId(String referenceId) {
    this.referenceId = referenceId;
    return this;
  }

   /**
   * reference_id
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
    SecupaySubTransactionProductModel secupaySubTransactionProductModel = (SecupaySubTransactionProductModel) o;
    return Objects.equals(this.id, secupaySubTransactionProductModel.id) &&
        Objects.equals(this.transId, secupaySubTransactionProductModel.transId) &&
        Objects.equals(this.referenceId, secupaySubTransactionProductModel.referenceId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, transId, referenceId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupaySubTransactionProductModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
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

