package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.PaymentContainerTokenStatus;
import com.secuconnect.client.model.ProductInstanceUID;
import java.util.Objects;

/**
 * Payment instrument
 */
public class SmartTransactionsContainer extends ProductInstanceUID {
  @SerializedName("type")
  protected String type = null;

  @SerializedName("token_status")
  protected PaymentContainerTokenStatus tokenStatus = null;

  public SmartTransactionsContainer type(String type) {
    this.type = type;
    return this;
  }

   /**
   * The container type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SmartTransactionsContainer tokenStatus(PaymentContainerTokenStatus tokenStatus) {
    this.tokenStatus = tokenStatus;
    return this;
  }

   /**
   * Get tokenStatus
   * @return tokenStatus
  **/
  public PaymentContainerTokenStatus getTokenStatus() {
    return tokenStatus;
  }

  public void setTokenStatus(PaymentContainerTokenStatus tokenStatus) {
    this.tokenStatus = tokenStatus;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsContainer smartTransactionsContainer = (SmartTransactionsContainer) o;
    return Objects.equals(this.type, smartTransactionsContainer.type) &&
        Objects.equals(this.tokenStatus, smartTransactionsContainer.tokenStatus) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, tokenStatus, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsContainer {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    tokenStatus: ").append(toIndentedString(tokenStatus)).append("\n");
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

