package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.BankAccountDescriptor;
import io.secuconnect.client.model.PaymentContainerMandate;
import io.secuconnect.client.model.PaymentContractsProductModel;
import io.secuconnect.client.model.PaymentCustomersProductModel;
import io.secuconnect.client.model.ProductInstanceUID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * PaymentContainersProductModel
 */
public class PaymentContainersProductModel {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("contract")
  private PaymentContractsProductModel contract = null;

  @SerializedName("customer")
  private PaymentCustomersProductModel customer = null;

  @SerializedName("assign")
  private ProductInstanceUID assign = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("public")
  private BankAccountDescriptor _public = null;

  @SerializedName("private")
  private BankAccountDescriptor _private = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("updated")
  private String updated = null;

  @SerializedName("mandate")
  private PaymentContainerMandate mandate = null;

  public PaymentContainersProductModel object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of payment container
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public PaymentContainersProductModel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of payment container
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PaymentContainersProductModel contract(PaymentContractsProductModel contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Payment container contract
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
   * Payment container customer
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
   * Assign to
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

  public PaymentContainersProductModel _public(BankAccountDescriptor _public) {
    this._public = _public;
    return this;
  }

   /**
   * Public payment instrument data
   * @return _public
  **/
  public BankAccountDescriptor getPublic() {
    return _public;
  }

  public void setPublic(BankAccountDescriptor _public) {
    this._public = _public;
  }

  public PaymentContainersProductModel _private(BankAccountDescriptor _private) {
    this._private = _private;
    return this;
  }

   /**
   * Private payment instrument data
   * @return _private
  **/
  public BankAccountDescriptor getPrivate() {
    return _private;
  }

  public void setPrivate(BankAccountDescriptor _private) {
    this._private = _private;
  }

  public PaymentContainersProductModel created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Creation date
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
   * Last update date
   * @return updated
  **/
  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  public PaymentContainersProductModel mandate(PaymentContainerMandate mandate) {
    this.mandate = mandate;
    return this;
  }

   /**
   * Payment container mandate
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
    return Objects.equals(this.object, paymentContainersProductModel.object) &&
        Objects.equals(this.id, paymentContainersProductModel.id) &&
        Objects.equals(this.contract, paymentContainersProductModel.contract) &&
        Objects.equals(this.customer, paymentContainersProductModel.customer) &&
        Objects.equals(this.assign, paymentContainersProductModel.assign) &&
        Objects.equals(this.type, paymentContainersProductModel.type) &&
        Objects.equals(this._public, paymentContainersProductModel._public) &&
        Objects.equals(this._private, paymentContainersProductModel._private) &&
        Objects.equals(this.created, paymentContainersProductModel.created) &&
        Objects.equals(this.updated, paymentContainersProductModel.updated) &&
        Objects.equals(this.mandate, paymentContainersProductModel.mandate);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, contract, customer, assign, type, _public, _private, created, updated, mandate);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContainersProductModel {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    assign: ").append(toIndentedString(assign)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    _public: ").append(toIndentedString(_public)).append("\n");
    sb.append("    _private: ").append(toIndentedString(_private)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

