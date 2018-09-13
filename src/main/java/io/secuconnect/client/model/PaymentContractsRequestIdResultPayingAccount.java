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
 * The bank account you can use for pay in.
 */
@ApiModel(description = "The bank account you can use for pay in.")
public class PaymentContractsRequestIdResultPayingAccount {
  @SerializedName("accountowner")
  private String accountowner = null;

  @SerializedName("iban")
  private String iban = null;

  @SerializedName("bic")
  private String bic = null;

  public PaymentContractsRequestIdResultPayingAccount accountowner(String accountowner) {
    this.accountowner = accountowner;
    return this;
  }

   /**
   * The bank account owner
   * @return accountowner
  **/
  @ApiModelProperty(value = "The bank account owner")
  public String getAccountowner() {
    return accountowner;
  }

  public void setAccountowner(String accountowner) {
    this.accountowner = accountowner;
  }

  public PaymentContractsRequestIdResultPayingAccount iban(String iban) {
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

  public PaymentContractsRequestIdResultPayingAccount bic(String bic) {
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

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContractsRequestIdResultPayingAccount paymentContractsRequestIdResultPayingAccount = (PaymentContractsRequestIdResultPayingAccount) o;
    return Objects.equals(this.accountowner, paymentContractsRequestIdResultPayingAccount.accountowner) &&
        Objects.equals(this.iban, paymentContractsRequestIdResultPayingAccount.iban) &&
        Objects.equals(this.bic, paymentContractsRequestIdResultPayingAccount.bic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(accountowner, iban, bic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContractsRequestIdResultPayingAccount {\n");
    
    sb.append("    accountowner: ").append(toIndentedString(accountowner)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
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

