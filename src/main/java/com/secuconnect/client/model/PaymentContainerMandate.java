package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * PaymentContainerMandate
 */
public class PaymentContainerMandate {
  @SerializedName("sepa_mandate_id")
  protected String sepaMandateId = null;

  @SerializedName("iban")
  protected String iban = null;

  @SerializedName("bic")
  protected String bic = null;

  @SerializedName("type")
  protected String type = null;

  @SerializedName("status")
  protected String status = null;

  @SerializedName("identification")
  protected String identification = null;

  @SerializedName("creditor_id")
  protected String creditorId = null;

  public PaymentContainerMandate sepaMandateId(String sepaMandateId) {
    this.sepaMandateId = sepaMandateId;
    return this;
  }

   /**
   * Sepa mandate id
   * @return sepaMandateId
  **/
  public String getSepaMandateId() {
    return sepaMandateId;
  }

  public void setSepaMandateId(String sepaMandateId) {
    this.sepaMandateId = sepaMandateId;
  }

  public PaymentContainerMandate iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * IBAN
   * @return iban
  **/
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public PaymentContainerMandate bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * BIC
   * @return bic
  **/
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public PaymentContainerMandate type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PaymentContainerMandate status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Status
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public PaymentContainerMandate identification(String identification) {
    this.identification = identification;
    return this;
  }

   /**
   * Identification
   * @return identification
  **/
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public PaymentContainerMandate creditorId(String creditorId) {
    this.creditorId = creditorId;
    return this;
  }

   /**
   * Creditor ID
   * @return creditorId
  **/
  public String getCreditorId() {
    return creditorId;
  }

  public void setCreditorId(String creditorId) {
    this.creditorId = creditorId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContainerMandate paymentContainerMandate = (PaymentContainerMandate) o;
    return Objects.equals(this.sepaMandateId, paymentContainerMandate.sepaMandateId) &&
        Objects.equals(this.iban, paymentContainerMandate.iban) &&
        Objects.equals(this.bic, paymentContainerMandate.bic) &&
        Objects.equals(this.type, paymentContainerMandate.type) &&
        Objects.equals(this.status, paymentContainerMandate.status) &&
        Objects.equals(this.identification, paymentContainerMandate.identification) &&
        Objects.equals(this.creditorId, paymentContainerMandate.creditorId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(sepaMandateId, iban, bic, type, status, identification, creditorId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContainerMandate {\n");
    sb.append("    sepaMandateId: ").append(toIndentedString(sepaMandateId)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    creditorId: ").append(toIndentedString(creditorId)).append("\n");
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

