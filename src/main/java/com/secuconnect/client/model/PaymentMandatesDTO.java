package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.ProductInstanceID;
import java.util.Objects;

/**
 * PaymentMandatesDTO
 */
public class PaymentMandatesDTO {
  @SerializedName("iban")
  protected String iban = null;

  @SerializedName("bic")
  protected String bic = null;

  @SerializedName("type")
  protected String type = null;

  @SerializedName("date_of_signature")
  protected String dateOfSignature = null;

  @SerializedName("identification")
  protected String identification = null;

  @SerializedName("merchant_id")
  protected ProductInstanceID merchantId = null;

  public PaymentMandatesDTO iban(String iban) {
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

  public PaymentMandatesDTO bic(String bic) {
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

  public PaymentMandatesDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * SEPA mandate type: &#x60;COR1&#x60;, &#x60;CORE&#x60;, &#x60;B2B&#x60;
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PaymentMandatesDTO dateOfSignature(String dateOfSignature) {
    this.dateOfSignature = dateOfSignature;
    return this;
  }

   /**
   * Get dateOfSignature
   * @return dateOfSignature
  **/
  public String getDateOfSignature() {
    return dateOfSignature;
  }

  public void setDateOfSignature(String dateOfSignature) {
    this.dateOfSignature = dateOfSignature;
  }

  public PaymentMandatesDTO identification(String identification) {
    this.identification = identification;
    return this;
  }

   /**
   * SEPA Payment Identification
   * @return identification
  **/
  public String getIdentification() {
    return identification;
  }

  public void setIdentification(String identification) {
    this.identification = identification;
  }

  public PaymentMandatesDTO merchantId(ProductInstanceID merchantId) {
    this.merchantId = merchantId;
    return this;
  }

   /**
   * Get merchantId
   * @return merchantId
  **/
  public ProductInstanceID getMerchantId() {
    return merchantId;
  }

  public void setMerchantId(ProductInstanceID merchantId) {
    this.merchantId = merchantId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMandatesDTO paymentMandatesDTO = (PaymentMandatesDTO) o;
    return Objects.equals(this.iban, paymentMandatesDTO.iban) &&
        Objects.equals(this.bic, paymentMandatesDTO.bic) &&
        Objects.equals(this.type, paymentMandatesDTO.type) &&
        Objects.equals(this.dateOfSignature, paymentMandatesDTO.dateOfSignature) &&
        Objects.equals(this.identification, paymentMandatesDTO.identification) &&
        Objects.equals(this.merchantId, paymentMandatesDTO.merchantId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(iban, bic, type, dateOfSignature, identification, merchantId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMandatesDTO {\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dateOfSignature: ").append(toIndentedString(dateOfSignature)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    merchantId: ").append(toIndentedString(merchantId)).append("\n");
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

