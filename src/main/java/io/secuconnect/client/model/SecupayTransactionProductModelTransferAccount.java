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
 * The bank account the payer needs to use for his transfer
 */
@ApiModel(description = "The bank account the payer needs to use for his transfer")
public class SecupayTransactionProductModelTransferAccount {
  @SerializedName("iban")
  private String iban = null;

  @SerializedName("bic")
  private String bic = null;

  @SerializedName("accountnumber")
  private String accountnumber = null;

  @SerializedName("bankcode")
  private String bankcode = null;

  @SerializedName("account_owner")
  private String accountOwner = null;

  public SecupayTransactionProductModelTransferAccount iban(String iban) {
    this.iban = iban;
    return this;
  }

   /**
   * IBAN
   * @return iban
  **/
  @ApiModelProperty(value = "IBAN")
  public String getIban() {
    return iban;
  }

  public void setIban(String iban) {
    this.iban = iban;
  }

  public SecupayTransactionProductModelTransferAccount bic(String bic) {
    this.bic = bic;
    return this;
  }

   /**
   * BIC
   * @return bic
  **/
  @ApiModelProperty(value = "BIC")
  public String getBic() {
    return bic;
  }

  public void setBic(String bic) {
    this.bic = bic;
  }

  public SecupayTransactionProductModelTransferAccount accountnumber(String accountnumber) {
    this.accountnumber = accountnumber;
    return this;
  }

   /**
   * Bank account number
   * @return accountnumber
  **/
  @ApiModelProperty(value = "Bank account number")
  public String getAccountnumber() {
    return accountnumber;
  }

  public void setAccountnumber(String accountnumber) {
    this.accountnumber = accountnumber;
  }

  public SecupayTransactionProductModelTransferAccount bankcode(String bankcode) {
    this.bankcode = bankcode;
    return this;
  }

   /**
   * The name of the bank institute
   * @return bankcode
  **/
  @ApiModelProperty(value = "The name of the bank institute")
  public String getBankcode() {
    return bankcode;
  }

  public void setBankcode(String bankcode) {
    this.bankcode = bankcode;
  }

  public SecupayTransactionProductModelTransferAccount accountOwner(String accountOwner) {
    this.accountOwner = accountOwner;
    return this;
  }

   /**
   * The owner of bank account
   * @return accountOwner
  **/
  @ApiModelProperty(value = "The owner of bank account")
  public String getAccountOwner() {
    return accountOwner;
  }

  public void setAccountOwner(String accountOwner) {
    this.accountOwner = accountOwner;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayTransactionProductModelTransferAccount secupayTransactionProductModelTransferAccount = (SecupayTransactionProductModelTransferAccount) o;
    return Objects.equals(this.iban, secupayTransactionProductModelTransferAccount.iban) &&
        Objects.equals(this.bic, secupayTransactionProductModelTransferAccount.bic) &&
        Objects.equals(this.accountnumber, secupayTransactionProductModelTransferAccount.accountnumber) &&
        Objects.equals(this.bankcode, secupayTransactionProductModelTransferAccount.bankcode) &&
        Objects.equals(this.accountOwner, secupayTransactionProductModelTransferAccount.accountOwner);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iban, bic, accountnumber, bankcode, accountOwner);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayTransactionProductModelTransferAccount {\n");
    
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    accountnumber: ").append(toIndentedString(accountnumber)).append("\n");
    sb.append("    bankcode: ").append(toIndentedString(bankcode)).append("\n");
    sb.append("    accountOwner: ").append(toIndentedString(accountOwner)).append("\n");
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

