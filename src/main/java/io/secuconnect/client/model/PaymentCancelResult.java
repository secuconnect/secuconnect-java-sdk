package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * Refund information
 */
public class PaymentCancelResult {
  @SerializedName("new_trans_id")
  private Integer newTransId = null;

  @SerializedName("demo")
  private Boolean demo = false;

  @SerializedName("result")
  private Object result = null;

  public PaymentCancelResult newTransId(Integer newTransId) {
    this.newTransId = newTransId;
    return this;
  }

   /**
   * The transaction ID of the refund transaction
   * @return newTransId
  **/
  public Integer getNewTransId() {
    return newTransId;
  }

  public void setNewTransId(Integer newTransId) {
    this.newTransId = newTransId;
  }

  public PaymentCancelResult demo(Boolean demo) {
    this.demo = demo;
    return this;
  }

   /**
   * Demo
   * @return demo
  **/
  public Boolean getDemo() {
    return demo;
  }

  public void setDemo(Boolean demo) {
    this.demo = demo;
  }

  public PaymentCancelResult result(Object result) {
    this.result = result;
    return this;
  }

   /**
   * Refund information
   * @return result
  **/
  public Object getResult() {
    return result;
  }

  public void setResult(Object result) {
    this.result = result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentCancelResult paymentCancelResult = (PaymentCancelResult) o;
    return Objects.equals(this.newTransId, paymentCancelResult.newTransId) &&
        Objects.equals(this.demo, paymentCancelResult.demo) &&
        Objects.equals(this.result, paymentCancelResult.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(newTransId, demo, result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCancelResult {\n");
    
    sb.append("    newTransId: ").append(toIndentedString(newTransId)).append("\n");
    sb.append("    demo: ").append(toIndentedString(demo)).append("\n");
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

