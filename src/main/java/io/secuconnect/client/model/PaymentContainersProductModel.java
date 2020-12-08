package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.BaseProductModel;
import io.secuconnect.client.model.CreatedField;
import io.secuconnect.client.model.OneOfPaymentContainersDTOModelPrivate;
import io.secuconnect.client.model.PaymentContainerMandate;
import io.secuconnect.client.model.PaymentContractsProductModel;
import io.secuconnect.client.model.PaymentCustomersProductModel;
import io.secuconnect.client.model.ProductInstanceUID;
import io.secuconnect.client.model.UpdatedField;
import java.util.Objects;

/**
 * PaymentContainersProductModel
 */
public class PaymentContainersProductModel extends BaseProductModel {
  @SerializedName("created")
  private String created = null;

  @SerializedName("updated")
  private String updated = null;

  @SerializedName("contract")
  private PaymentContractsProductModel contract = null;

  @SerializedName("customer")
  private PaymentCustomersProductModel customer = null;

  @SerializedName("assign")
  private ProductInstanceUID assign = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("public")
  private OneOfPaymentContainersDTOModelPrivate _public = null;

  @SerializedName("private")
  private OneOfPaymentContainersDTOModelPrivate _private = null;

  @SerializedName("mandate")
  private PaymentContainerMandate mandate = null;

  public PaymentContainersProductModel created(String created) {
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

  public PaymentContainersProductModel updated(String updated) {
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

  public PaymentContainersProductModel contract(PaymentContractsProductModel contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  public PaymentContractsProductModel getContract() {
    return contract;
  }

  public void setContract(PaymentContractsProductModel contract) {
    this.contract = contract;
  }

  public PaymentContainersProductModel customer(PaymentCustomersProductModel customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Get customer
   * @return customer
  **/
  public PaymentCustomersProductModel getCustomer() {
    return customer;
  }

  public void setCustomer(PaymentCustomersProductModel customer) {
    this.customer = customer;
  }

  public PaymentContainersProductModel assign(ProductInstanceUID assign) {
    this.assign = assign;
    return this;
  }

   /**
   * Get assign
   * @return assign
  **/
  public ProductInstanceUID getAssign() {
    return assign;
  }

  public void setAssign(ProductInstanceUID assign) {
    this.assign = assign;
  }

  public PaymentContainersProductModel type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of payment container
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public PaymentContainersProductModel _public(OneOfPaymentContainersDTOModelPrivate _public) {
    this._public = _public;
    return this;
  }

   /**
   * Get _public
   * @return _public
  **/
  public OneOfPaymentContainersDTOModelPrivate getPublic() {
    return _public;
  }

  public void setPublic(OneOfPaymentContainersDTOModelPrivate _public) {
    this._public = _public;
  }

  public PaymentContainersProductModel _private(OneOfPaymentContainersDTOModelPrivate _private) {
    this._private = _private;
    return this;
  }

   /**
   * Get _private
   * @return _private
  **/
  public OneOfPaymentContainersDTOModelPrivate getPrivate() {
    return _private;
  }

  public void setPrivate(OneOfPaymentContainersDTOModelPrivate _private) {
    this._private = _private;
  }

  public PaymentContainersProductModel mandate(PaymentContainerMandate mandate) {
    this.mandate = mandate;
    return this;
  }

   /**
   * Get mandate
   * @return mandate
  **/
  public PaymentContainerMandate getMandate() {
    return mandate;
  }

  public void setMandate(PaymentContainerMandate mandate) {
    this.mandate = mandate;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContainersProductModel paymentContainersProductModel = (PaymentContainersProductModel) o;
    return Objects.equals(this.created, paymentContainersProductModel.created) &&
        Objects.equals(this.updated, paymentContainersProductModel.updated) &&
        Objects.equals(this.contract, paymentContainersProductModel.contract) &&
        Objects.equals(this.customer, paymentContainersProductModel.customer) &&
        Objects.equals(this.assign, paymentContainersProductModel.assign) &&
        Objects.equals(this.type, paymentContainersProductModel.type) &&
        Objects.equals(this._public, paymentContainersProductModel._public) &&
        Objects.equals(this._private, paymentContainersProductModel._private) &&
        Objects.equals(this.mandate, paymentContainersProductModel.mandate) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, updated, contract, customer, assign, type, _public, _private, mandate, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContainersProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    assign: ").append(toIndentedString(assign)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    mandate: ").append(toIndentedString(mandate)).append("\n");
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

