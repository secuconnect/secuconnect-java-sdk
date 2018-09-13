package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.ProductInstanceUID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;
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

  @SerializedName("allow_cloning")
  private Boolean allowCloning = null;

  @SerializedName("sepa_mandate_inform")
  private String sepaMandateInform = "never";

  @SerializedName("created")
  private DateTime created = null;

  @SerializedName("updated")
  private DateTime updated = null;

  public PaymentContractsProductModel object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of payment contract
   * @return object
  **/
  @ApiModelProperty(example = "payment.contracts", value = "Object of payment contract")
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
  @ApiModelProperty(example = "PCR_W8VVN3QCN2M7690ZR5GQGH5YJNVVAU", value = "Id of payment contract")
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
  @ApiModelProperty(value = "Payment contract")
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
  @ApiModelProperty(value = "Is this a demo contract")
  public Boolean getDemo() {
    return demo;
  }

  public void setDemo(Boolean demo) {
    this.demo = demo;
  }

  public PaymentContractsProductModel allowCloning(Boolean allowCloning) {
    this.allowCloning = allowCloning;
    return this;
  }

   /**
   * Allow to create sub-contracts
   * @return allowCloning
  **/
  @ApiModelProperty(value = "Allow to create sub-contracts")
  public Boolean getAllowCloning() {
    return allowCloning;
  }

  public void setAllowCloning(Boolean allowCloning) {
    this.allowCloning = allowCloning;
  }

  public PaymentContractsProductModel sepaMandateInform(String sepaMandateInform) {
    this.sepaMandateInform = sepaMandateInform;
    return this;
  }

   /**
   * Inform the customer about the created sepa mandate
   * @return sepaMandateInform
  **/
  @ApiModelProperty(example = "never", value = "Inform the customer about the created sepa mandate")
  public String getSepaMandateInform() {
    return sepaMandateInform;
  }

  public void setSepaMandateInform(String sepaMandateInform) {
    this.sepaMandateInform = sepaMandateInform;
  }

  public PaymentContractsProductModel created(DateTime created) {
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

  public PaymentContractsProductModel updated(DateTime updated) {
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
    PaymentContractsProductModel paymentContractsProductModel = (PaymentContractsProductModel) o;
    return Objects.equals(this.object, paymentContractsProductModel.object) &&
        Objects.equals(this.id, paymentContractsProductModel.id) &&
        Objects.equals(this.parent, paymentContractsProductModel.parent) &&
        Objects.equals(this.demo, paymentContractsProductModel.demo) &&
        Objects.equals(this.allowCloning, paymentContractsProductModel.allowCloning) &&
        Objects.equals(this.sepaMandateInform, paymentContractsProductModel.sepaMandateInform) &&
        Objects.equals(this.created, paymentContractsProductModel.created) &&
        Objects.equals(this.updated, paymentContractsProductModel.updated);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, parent, demo, allowCloning, sepaMandateInform, created, updated);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContractsProductModel {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    demo: ").append(toIndentedString(demo)).append("\n");
    sb.append("    allowCloning: ").append(toIndentedString(allowCloning)).append("\n");
    sb.append("    sepaMandateInform: ").append(toIndentedString(sepaMandateInform)).append("\n");
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

