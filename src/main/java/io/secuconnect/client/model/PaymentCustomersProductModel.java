package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.Contact;
import io.secuconnect.client.model.ProductInstanceUID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;
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
  private DateTime created = null;

  @SerializedName("updated")
  private DateTime updated = null;

  public PaymentCustomersProductModel object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of payment customer
   * @return object
  **/
  @ApiModelProperty(value = "Object of payment customer")
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
  @ApiModelProperty(value = "Id of payment customer")
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
  @ApiModelProperty(value = "Payment contract")
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
  @ApiModelProperty(value = "Customer contact info")
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public PaymentCustomersProductModel created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Created at date
   * @return created
  **/
  @ApiModelProperty(value = "Created at date")
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  public PaymentCustomersProductModel updated(DateTime updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Updated at date
   * @return updated
  **/
  @ApiModelProperty(value = "Updated at date")
  public DateTime getUpdated() {
    return updated;
  }

  public void setUpdated(DateTime updated) {
    this.updated = updated;
  }

  @Override
  public boolean equals(java.lang.Object o) {
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

