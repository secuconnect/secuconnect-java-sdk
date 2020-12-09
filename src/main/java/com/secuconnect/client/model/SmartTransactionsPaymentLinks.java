package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * SmartTransactionsPaymentLinks
 */
public class SmartTransactionsPaymentLinks {
  @SerializedName("prepaid")
  private String prepaid = null;

  @SerializedName("debit")
  private String debit = null;

  @SerializedName("creditcard")
  private String creditcard = null;

  @SerializedName("invoice")
  private String invoice = null;

  @SerializedName("general")
  private String general = null;

  public SmartTransactionsPaymentLinks prepaid(String prepaid) {
    this.prepaid = prepaid;
    return this;
  }

   /**
   * prepaid link
   * @return prepaid
  **/
  public String getPrepaid() {
    return prepaid;
  }

  public void setPrepaid(String prepaid) {
    this.prepaid = prepaid;
  }

  public SmartTransactionsPaymentLinks debit(String debit) {
    this.debit = debit;
    return this;
  }

   /**
   * debit link
   * @return debit
  **/
  public String getDebit() {
    return debit;
  }

  public void setDebit(String debit) {
    this.debit = debit;
  }

  public SmartTransactionsPaymentLinks creditcard(String creditcard) {
    this.creditcard = creditcard;
    return this;
  }

   /**
   * creditcard link
   * @return creditcard
  **/
  public String getCreditcard() {
    return creditcard;
  }

  public void setCreditcard(String creditcard) {
    this.creditcard = creditcard;
  }

  public SmartTransactionsPaymentLinks invoice(String invoice) {
    this.invoice = invoice;
    return this;
  }

   /**
   * invoice link
   * @return invoice
  **/
  public String getInvoice() {
    return invoice;
  }

  public void setInvoice(String invoice) {
    this.invoice = invoice;
  }

  public SmartTransactionsPaymentLinks general(String general) {
    this.general = general;
    return this;
  }

   /**
   * general link
   * @return general
  **/
  public String getGeneral() {
    return general;
  }

  public void setGeneral(String general) {
    this.general = general;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsPaymentLinks smartTransactionsPaymentLinks = (SmartTransactionsPaymentLinks) o;
    return Objects.equals(this.prepaid, smartTransactionsPaymentLinks.prepaid) &&
        Objects.equals(this.debit, smartTransactionsPaymentLinks.debit) &&
        Objects.equals(this.creditcard, smartTransactionsPaymentLinks.creditcard) &&
        Objects.equals(this.invoice, smartTransactionsPaymentLinks.invoice) &&
        Objects.equals(this.general, smartTransactionsPaymentLinks.general);
  }

  @Override
  public int hashCode() {
    return Objects.hash(prepaid, debit, creditcard, invoice, general);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsPaymentLinks {\n");
    
    sb.append("    prepaid: ").append(toIndentedString(prepaid)).append("\n");
    sb.append("    debit: ").append(toIndentedString(debit)).append("\n");
    sb.append("    creditcard: ").append(toIndentedString(creditcard)).append("\n");
    sb.append("    invoice: ").append(toIndentedString(invoice)).append("\n");
    sb.append("    general: ").append(toIndentedString(general)).append("\n");
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

