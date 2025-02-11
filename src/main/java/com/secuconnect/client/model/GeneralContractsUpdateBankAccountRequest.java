package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Bank details
 */
public class GeneralContractsUpdateBankAccountRequest {
  @SerializedName("iban")
  protected String iban = null;

  @SerializedName("bic")
  protected String bic = null;

  @SerializedName("owner")
  protected String owner = null;

  @SerializedName("bankname")
  protected String bankname = null;

  @SerializedName("verification_document")
  protected String verificationDocument = null;

  public GeneralContractsUpdateBankAccountRequest iban(String iban) {
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

  public GeneralContractsUpdateBankAccountRequest bic(String bic) {
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

  public GeneralContractsUpdateBankAccountRequest owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Account owner name (personal name or company name)
   * @return owner
  **/
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public GeneralContractsUpdateBankAccountRequest bankname(String bankname) {
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

  public GeneralContractsUpdateBankAccountRequest verificationDocument(String verificationDocument) {
    this.verificationDocument = verificationDocument;
    return this;
  }

   /**
   * Document Uploads ID of verification document
   * @return verificationDocument
  **/
  public String getVerificationDocument() {
    return verificationDocument;
  }

  public void setVerificationDocument(String verificationDocument) {
    this.verificationDocument = verificationDocument;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralContractsUpdateBankAccountRequest generalContractsUpdateBankAccountRequest = (GeneralContractsUpdateBankAccountRequest) o;
    return Objects.equals(this.iban, generalContractsUpdateBankAccountRequest.iban) &&
        Objects.equals(this.bic, generalContractsUpdateBankAccountRequest.bic) &&
        Objects.equals(this.owner, generalContractsUpdateBankAccountRequest.owner) &&
        Objects.equals(this.bankname, generalContractsUpdateBankAccountRequest.bankname) &&
        Objects.equals(this.verificationDocument, generalContractsUpdateBankAccountRequest.verificationDocument);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iban, bic, owner, bankname, verificationDocument);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralContractsUpdateBankAccountRequest {\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    bankname: ").append(toIndentedString(bankname)).append("\n");
    sb.append("    verificationDocument: ").append(toIndentedString(verificationDocument)).append("\n");
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

