package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.Contact;
import io.secuconnect.client.model.ProductInstanceUID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * PaymentCustomersProductModel
 */
public class PaymentCustomersProductModel {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("contract")
  private ProductInstanceUID contract = null;

  @SerializedName("contact")
  private Contact contact = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("updated")
  private String updated = null;

  public PaymentCustomersProductModel object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of payment customer
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public PaymentCustomersProductModel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of payment customer
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PaymentCustomersProductModel contract(ProductInstanceUID contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Payment contract
   * @return contract
  **/
  public ProductInstanceUID getContract() {
    return contract;
  }

  public void setContract(ProductInstanceUID contract) {
    this.contract = contract;
  }

  public PaymentCustomersProductModel contact(Contact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Customer contact info
   * @return contact
  **/
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public PaymentCustomersProductModel created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Created at date
   * @return created
  **/
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public PaymentCustomersProductModel updated(String updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Updated at date
   * @return updated
  **/
  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentCustomersProductModel paymentCustomersProductModel = (PaymentCustomersProductModel) o;
    return Objects.equals(this.object, paymentCustomersProductModel.object) &&
        Objects.equals(this.id, paymentCustomersProductModel.id) &&
        Objects.equals(this.contract, paymentCustomersProductModel.contract) &&
        Objects.equals(this.contact, paymentCustomersProductModel.contact) &&
        Objects.equals(this.created, paymentCustomersProductModel.created) &&
        Objects.equals(this.updated, paymentCustomersProductModel.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, contract, contact, created, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentCustomersProductModel {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

