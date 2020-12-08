package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Bank details for money transfers
 */
public class BankAccountDescriptor implements OneOfPaymentContainersDTOModelPrivate {
  @SerializedName("iban")
  private String iban = null;

  @SerializedName("bic")
  private String bic = null;

  @SerializedName("owner")
  private String owner = null;

  @SerializedName("bankname")
  private String bankname = null;

  @SerializedName("purpose")
  private String purpose = null;

  public BankAccountDescriptor iban(String iban) {
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

  public BankAccountDescriptor bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * Bank Identifier Code (BIC), or formerly SWIFT code
   * @return bic
  **/
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public BankAccountDescriptor owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Account owner name
   * @return owner
  **/
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public BankAccountDescriptor bankname(String bankname) {
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

  public BankAccountDescriptor purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * Purpose to use
   * @return purpose
  **/
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccountDescriptor bankAccountDescriptor = (BankAccountDescriptor) o;
    return Objects.equals(this.iban, bankAccountDescriptor.iban) &&
        Objects.equals(this.bic, bankAccountDescriptor.bic) &&
        Objects.equals(this.owner, bankAccountDescriptor.owner) &&
        Objects.equals(this.bankname, bankAccountDescriptor.bankname) &&
        Objects.equals(this.purpose, bankAccountDescriptor.purpose);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iban, bic, owner, bankname, purpose);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccountDescriptor {\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    bankname: ").append(toIndentedString(bankname)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
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

