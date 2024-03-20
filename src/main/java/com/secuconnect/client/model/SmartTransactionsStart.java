package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartTransactionPaymentContainerDTO;
import com.secuconnect.client.model.SmartTransactionPaymentCustomerDTO;
import com.secuconnect.client.model.SmartTransactionsPrepare;
import com.secuconnect.client.model.SmartTransactionsPrepareCallbackUrls;
import java.util.Objects;

/**
 * SmartTransactionsStart
 */
public class SmartTransactionsStart extends SmartTransactionsPrepare {
  @SerializedName("tid")
  protected String tid = null;

  @SerializedName("trace")
  protected Integer trace = null;

  @SerializedName("cardtype")
  protected String cardtype = null;

  public SmartTransactionsStart tid(String tid) {
    this.tid = tid;
    return this;
  }

   /**
   * Terminal ID Number (TID), required for &#x27;cashless_direct&#x27; method
   * @return tid
  **/
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public SmartTransactionsStart trace(Integer trace) {
    this.trace = trace;
    return this;
  }

   /**
   * Trace number from the card processing response, required for &#x27;cashless_direct&#x27; method
   * @return trace
  **/
  public Integer getTrace() {
    return trace;
  }

  public void setTrace(Integer trace) {
    this.trace = trace;
  }

  public SmartTransactionsStart cardtype(String cardtype) {
    this.cardtype = cardtype;
    return this;
  }

   /**
   * Card Type (&#x27;visa&#x27;, &#x27;mastercard&#x27;, &#x27;mastercard_debit&#x27;, &#x27;maestro&#x27;, &#x27;vpay&#x27; or &#x27;girocard&#x27;), required for &#x27;cashless_direct&#x27; method
   * @return cardtype
  **/
  public String getCardtype() {
    return cardtype;
  }

  public void setCardtype(String cardtype) {
    this.cardtype = cardtype;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsStart smartTransactionsStart = (SmartTransactionsStart) o;
    return Objects.equals(this.tid, smartTransactionsStart.tid) &&
        Objects.equals(this.trace, smartTransactionsStart.trace) &&
        Objects.equals(this.cardtype, smartTransactionsStart.cardtype) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(tid, trace, cardtype, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsStart {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    trace: ").append(toIndentedString(trace)).append("\n");
    sb.append("    cardtype: ").append(toIndentedString(cardtype)).append("\n");
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

