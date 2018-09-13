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
 * Payment information
 */
@ApiModel(description = "Payment information")
public class PaymentInformation {
  @SerializedName("owner")
  private String owner = null;

  @SerializedName("iban")
  private String iban = null;

  @SerializedName("bic")
  private String bic = null;

  public PaymentInformation owner(String owner) {
    this.owner = owner;
    return this;
  }

   /**
   * Owner
   * @return owner
  **/
  @ApiModelProperty(value = "Owner")
  public String getOwner() {
    return owner;
  }

  public void setOwner(String owner) {
    this.owner = owner;
  }

  public PaymentInformation iban(String iban) {
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

  public PaymentInformation bic(String bic) {
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
    PaymentInformation paymentInformation = (PaymentInformation) o;
    return Objects.equals(this.owner, paymentInformation.owner) &&
        Objects.equals(this.iban, paymentInformation.iban) &&
        Objects.equals(this.bic, paymentInformation.bic);
  }

  @Override
  public int hashCode() {
    return Objects.hash(owner, iban, bic);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentInformation {\n");
    
    sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
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

