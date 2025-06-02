package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * ValidateSingleIban
 */
public class PaymentContainersValidateSingleIban {
  @SerializedName("id")
  protected Integer id = null;

  @SerializedName("valid")
  protected Boolean valid = null;

  @SerializedName("iban")
  protected String iban = null;

  @SerializedName("bic")
  protected String bic = null;

  @SerializedName("bankname")
  protected String bankname = null;

  public PaymentContainersValidateSingleIban id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Batch reference ID from request
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PaymentContainersValidateSingleIban valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * If checked IBAN is valid or not
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public PaymentContainersValidateSingleIban iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * International Bank Account Number (IBAN)
   * @return iban
  **/
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public PaymentContainersValidateSingleIban bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * Bank Identifier Code (BIC)
   * @return bic
  **/
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public PaymentContainersValidateSingleIban bankname(String bankname) {
    this.bankname = bankname;
    return this;
  }

   /**
   * Bank name
   * @return bankname
  **/
  public String getBankname() {
    return bankname;
  }

  public void setBankname(String bankname) {
    this.bankname = bankname;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContainersValidateSingleIban paymentContainersValidateSingleIban = (PaymentContainersValidateSingleIban) o;
    return Objects.equals(this.id, paymentContainersValidateSingleIban.id) &&
        Objects.equals(this.valid, paymentContainersValidateSingleIban.valid) &&
        Objects.equals(this.iban, paymentContainersValidateSingleIban.iban) &&
        Objects.equals(this.bic, paymentContainersValidateSingleIban.bic) &&
        Objects.equals(this.bankname, paymentContainersValidateSingleIban.bankname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, valid, iban, bic, bankname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContainersValidateSingleIban {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    bankname: ").append(toIndentedString(bankname)).append("\n");
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

