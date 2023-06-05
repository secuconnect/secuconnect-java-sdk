package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.CreatedField;
import com.secuconnect.client.model.GeneralMerchantsProductModel;
import java.util.Objects;

/**
 * PaymentMandatesProductModel
 */
public class PaymentMandatesProductModel extends BaseProductModel {
  @SerializedName("l")
  protected Integer l = null;

  @SerializedName("k")
  protected Integer k = null;

  @SerializedName("ks")
  protected String ks = null;

  @SerializedName("c")
  protected Integer c = null;

  @SerializedName("s")
  protected Integer s = null;

  @SerializedName("t")
  protected AggregationTimeResult t = null;

  @SerializedName("created")
  protected String created = null;

  @SerializedName("iban")
  protected String iban = null;

  @SerializedName("bic")
  protected String bic = null;

  @SerializedName("type")
  protected String type = null;

  @SerializedName("date_of_signature")
  protected String dateOfSignature = null;

  @SerializedName("status")
  protected Integer status = null;

  @SerializedName("identification")
  protected String identification = null;

  @SerializedName("merchant")
  protected GeneralMerchantsProductModel merchant = null;

  public PaymentMandatesProductModel l(Integer l) {
    this.l = l;
    return this;
  }

   /**
   * lookup index
   * @return l
  **/
  public Integer getL() {
    return l;
  }

  public void setL(Integer l) {
    this.l = l;
  }

  public PaymentMandatesProductModel k(Integer k) {
    this.k = k;
    return this;
  }

   /**
   * key index
   * @return k
  **/
  public Integer getK() {
    return k;
  }

  public void setK(Integer k) {
    this.k = k;
  }

  public PaymentMandatesProductModel ks(String ks) {
    this.ks = ks;
    return this;
  }

   /**
   * key name
   * @return ks
  **/
  public String getKs() {
    return ks;
  }

  public void setKs(String ks) {
    this.ks = ks;
  }

  public PaymentMandatesProductModel c(Integer c) {
    this.c = c;
    return this;
  }

   /**
   * count (number of items)
   * @return c
  **/
  public Integer getC() {
    return c;
  }

  public void setC(Integer c) {
    this.c = c;
  }

  public PaymentMandatesProductModel s(Integer s) {
    this.s = s;
    return this;
  }

   /**
   * sum
   * @return s
  **/
  public Integer getS() {
    return s;
  }

  public void setS(Integer s) {
    this.s = s;
  }

  public PaymentMandatesProductModel t(AggregationTimeResult t) {
    this.t = t;
    return this;
  }

   /**
   * Get t
   * @return t
  **/
  public AggregationTimeResult getT() {
    return t;
  }

  public void setT(AggregationTimeResult t) {
    this.t = t;
  }

  public PaymentMandatesProductModel created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public PaymentMandatesProductModel iban(String iban) {
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

  public PaymentMandatesProductModel bic(String bic) {
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

  public PaymentMandatesProductModel type(String type) {
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

  public PaymentMandatesProductModel dateOfSignature(String dateOfSignature) {
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

  public PaymentMandatesProductModel status(Integer status) {
    this.status = status;
    return this;
  }

   /**
   * Status [&#x60;10&#x60;: COR1 request, &#x60;11&#x60;: COR1 ok, &#x60;12&#x60;: COR1 cancelled, &#x60;20&#x60;: B2B request, &#x60;21&#x60;: B2B ok, &#x60;22&#x60;: B2B cancelled, ...]
   * @return status
  **/
  public Integer getStatus() {
    return status;
  }

  public void setStatus(Integer status) {
    this.status = status;
  }

  public PaymentMandatesProductModel identification(String identification) {
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

  public PaymentMandatesProductModel merchant(GeneralMerchantsProductModel merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  public GeneralMerchantsProductModel getMerchant() {
    return merchant;
  }

  public void setMerchant(GeneralMerchantsProductModel merchant) {
    this.merchant = merchant;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentMandatesProductModel paymentMandatesProductModel = (PaymentMandatesProductModel) o;
    return Objects.equals(this.l, paymentMandatesProductModel.l) &&
        Objects.equals(this.k, paymentMandatesProductModel.k) &&
        Objects.equals(this.ks, paymentMandatesProductModel.ks) &&
        Objects.equals(this.c, paymentMandatesProductModel.c) &&
        Objects.equals(this.s, paymentMandatesProductModel.s) &&
        Objects.equals(this.t, paymentMandatesProductModel.t) &&
        Objects.equals(this.created, paymentMandatesProductModel.created) &&
        Objects.equals(this.iban, paymentMandatesProductModel.iban) &&
        Objects.equals(this.bic, paymentMandatesProductModel.bic) &&
        Objects.equals(this.type, paymentMandatesProductModel.type) &&
        Objects.equals(this.dateOfSignature, paymentMandatesProductModel.dateOfSignature) &&
        Objects.equals(this.status, paymentMandatesProductModel.status) &&
        Objects.equals(this.identification, paymentMandatesProductModel.identification) &&
        Objects.equals(this.merchant, paymentMandatesProductModel.merchant) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, created, iban, bic, type, dateOfSignature, status, identification, merchant, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentMandatesProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    l: ").append(toIndentedString(l)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    ks: ").append(toIndentedString(ks)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    iban: ").append(toIndentedString(iban)).append("\n");
    sb.append("    bic: ").append(toIndentedString(bic)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    dateOfSignature: ").append(toIndentedString(dateOfSignature)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    identification: ").append(toIndentedString(identification)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
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

