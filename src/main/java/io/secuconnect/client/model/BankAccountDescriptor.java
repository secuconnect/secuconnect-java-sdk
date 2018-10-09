package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/**
 * Bank account data like owner, iban, bic and bank name
 */
@ApiModel(description = "Bank account data like owner, iban, bic and bank name")
public class BankAccountDescriptor {
  @SerializedName("owner")
  private String owner = null;

  @SerializedName("iban")
  private String iban = null;

  @SerializedName("bic")
  private String bic = null;

  @SerializedName("bankname")
  private String bankname = null;

  public BankAccountDescriptor owner(String owner) {
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

  public BankAccountDescriptor iban(String iban) {
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

  public BankAccountDescriptor bic(String bic) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BankAccountDescriptor bankAccountDescriptor = (BankAccountDescriptor) o;
    return Objects.equals(this.owner, bankAccountDescriptor.owner) &&
        Objects.equals(this.iban, bankAccountDescriptor.iban) &&
        Objects.equals(this.bic, bankAccountDescriptor.bic) &&
        Objects.equals(this.bankname, bankAccountDescriptor.bankname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, iban, bic, bankname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BankAccountDescriptor {\n");
    
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    bankname: ").append(toIndentedString(bankname)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

