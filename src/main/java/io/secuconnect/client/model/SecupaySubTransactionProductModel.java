package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

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

  @SerializedName("amount")
  private Integer amount = null;

  @SerializedName("transaction_status")
  private String transactionStatus = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("currency")
  private String currency = null;

  public SecupaySubTransactionProductModel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * The payment id of the sub-transaction
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
   * Transaction identifier
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
   * Reference id - which was used in the mixed basket
   * @return referenceId
  **/
  public String getReferenceId() {
    return referenceId;
  }

  public void setReferenceId(String referenceId) {
    this.referenceId = referenceId;
  }

  public SecupaySubTransactionProductModel amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Total amount of payment in cents (or the smallest cash unit of the relevant currency)
   * @return amount
  **/
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
  }

  public SecupaySubTransactionProductModel transactionStatus(String transactionStatus) {
    this.transactionStatus = transactionStatus;
    return this;
  }

   /**
   * Transaction status (number)
   * @return transactionStatus
  **/
  public String getTransactionStatus() {
    return transactionStatus;
  }

  public void setTransactionStatus(String transactionStatus) {
    this.transactionStatus = transactionStatus;
  }

  public SecupaySubTransactionProductModel status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Transaction status
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public SecupaySubTransactionProductModel currency(String currency) {
    this.currency = currency;
    return this;
  }

   /**
   * ISO 4217 code of currency, eg EUR for Euro.
   * @return currency
  **/
  public String getCurrency() {
    return currency;
  }

  public void setCurrency(String currency) {
    this.currency = currency;
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
        Objects.equals(this.referenceId, secupaySubTransactionProductModel.referenceId) &&
        Objects.equals(this.amount, secupaySubTransactionProductModel.amount) &&
        Objects.equals(this.transactionStatus, secupaySubTransactionProductModel.transactionStatus) &&
        Objects.equals(this.status, secupaySubTransactionProductModel.status) &&
        Objects.equals(this.currency, secupaySubTransactionProductModel.currency);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, transId, referenceId, amount, transactionStatus, status, currency);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupaySubTransactionProductModel {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
    sb.append("    referenceId: ").append(toIndentedString(referenceId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    transactionStatus: ").append(toIndentedString(transactionStatus)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    currency: ").append(toIndentedString(currency)).append("\n");
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

