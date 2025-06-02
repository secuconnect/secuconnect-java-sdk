package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * ValidateSingleIbanDTO
 */
public class PaymentContainersValidateSingleIbanDTO {
  @SerializedName("id")
  protected Integer id = null;

  @SerializedName("iban")
  protected String iban = null;

  public PaymentContainersValidateSingleIbanDTO id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Batch reference ID
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public PaymentContainersValidateSingleIbanDTO iban(String iban) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContainersValidateSingleIbanDTO paymentContainersValidateSingleIbanDTO = (PaymentContainersValidateSingleIbanDTO) o;
    return Objects.equals(this.id, paymentContainersValidateSingleIbanDTO.id) &&
        Objects.equals(this.iban, paymentContainersValidateSingleIbanDTO.iban);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, iban);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContainersValidateSingleIbanDTO {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
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

