package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.ProductInstanceUID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * PaymentContractsProductModel
 */
public class PaymentContractsProductModel {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("parent")
  private ProductInstanceUID parent = null;

  @SerializedName("demo")
  private Boolean demo = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("updated")
  private String updated = null;

  public PaymentContractsProductModel object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of payment contract
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public PaymentContractsProductModel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of payment contract
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PaymentContractsProductModel parent(ProductInstanceUID parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Payment contract
   * @return parent
  **/
  public ProductInstanceUID getParent() {
    return parent;
  }

  public void setParent(ProductInstanceUID parent) {
    this.parent = parent;
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

  public PaymentContractsProductModel created(String created) {
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

  public PaymentContractsProductModel updated(String updated) {
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
    PaymentContractsProductModel paymentContractsProductModel = (PaymentContractsProductModel) o;
    return Objects.equals(this.object, paymentContractsProductModel.object) &&
        Objects.equals(this.id, paymentContractsProductModel.id) &&
        Objects.equals(this.parent, paymentContractsProductModel.parent) &&
        Objects.equals(this.demo, paymentContractsProductModel.demo) &&
        Objects.equals(this.created, paymentContractsProductModel.created) &&
        Objects.equals(this.updated, paymentContractsProductModel.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, parent, demo, created, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContractsProductModel {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    demo: ").append(toIndentedString(demo)).append("\n");
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

