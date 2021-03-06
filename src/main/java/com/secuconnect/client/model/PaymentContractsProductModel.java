package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.CreatedField;
import com.secuconnect.client.model.PaymentInformation;
import com.secuconnect.client.model.ProductInstanceUID;
import com.secuconnect.client.model.UpdatedField;
import java.util.Objects;

/**
 * PaymentContractsProductModel
 */
public class PaymentContractsProductModel extends BaseProductModel {
  @SerializedName("created")
  private String created = null;

  @SerializedName("updated")
  private String updated = null;

  @SerializedName("parent")
  private ProductInstanceUID parent = null;

  @SerializedName("pay_in_account")
  private PaymentInformation payInAccount = null;

  @SerializedName("demo")
  private Boolean demo = null;

  public PaymentContractsProductModel created(String created) {
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

  public PaymentContractsProductModel updated(String updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  public PaymentContractsProductModel parent(ProductInstanceUID parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  public ProductInstanceUID getParent() {
    return parent;
  }

  public void setParent(ProductInstanceUID parent) {
    this.parent = parent;
  }

  public PaymentContractsProductModel payInAccount(PaymentInformation payInAccount) {
    this.payInAccount = payInAccount;
    return this;
  }

   /**
   * Get payInAccount
   * @return payInAccount
  **/
  public PaymentInformation getPayInAccount() {
    return payInAccount;
  }

  public void setPayInAccount(PaymentInformation payInAccount) {
    this.payInAccount = payInAccount;
  }

  public PaymentContractsProductModel demo(Boolean demo) {
    this.demo = demo;
    return this;
  }

   /**
   * Is this a demo contract
   * @return demo
  **/
  public Boolean getDemo() {
    return demo;
  }

  public void setDemo(Boolean demo) {
    this.demo = demo;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContractsProductModel paymentContractsProductModel = (PaymentContractsProductModel) o;
    return Objects.equals(this.created, paymentContractsProductModel.created) &&
        Objects.equals(this.updated, paymentContractsProductModel.updated) &&
        Objects.equals(this.parent, paymentContractsProductModel.parent) &&
        Objects.equals(this.payInAccount, paymentContractsProductModel.payInAccount) &&
        Objects.equals(this.demo, paymentContractsProductModel.demo) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, updated, parent, payInAccount, demo, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContractsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    payInAccount: ").append(toIndentedString(payInAccount)).append("\n");
    sb.append("    demo: ").append(toIndentedString(demo)).append("\n");
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

