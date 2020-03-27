package io.secuconnect.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * Payment information
 */
public class PaymentInformation {
  @SerializedName("iban")
  private String iban = null;

  @SerializedName("bic")
  private String bic = null;

  @SerializedName("owner")
  private String owner = null;

  @SerializedName("bankname")
  private String bankname = null;

  public PaymentInformation iban(String iban) {
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

  public PaymentInformation bic(String bic) {
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

  public PaymentInformation owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Owner
   * @return owner
  **/
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public PaymentInformation bankname(String bankname) {
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
    PaymentInformation paymentInformation = (PaymentInformation) o;
    return Objects.equals(this.iban, paymentInformation.iban) &&
        Objects.equals(this.bic, paymentInformation.bic) &&
        Objects.equals(this.owner, paymentInformation.owner) &&
        Objects.equals(this.bankname, paymentInformation.bankname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iban, bic, owner, bankname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInformation {\n");
    
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

