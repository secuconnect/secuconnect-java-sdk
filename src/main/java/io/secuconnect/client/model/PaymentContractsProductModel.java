package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.BaseProductModel;
import io.secuconnect.client.model.ProductInstanceUID;

/**
 * PaymentContractsProductModel
 */
public class PaymentContractsProductModel extends BaseProductModel {
  @SerializedName("parent")
  private ProductInstanceUID parent = null;

  @SerializedName("demo")
  private Boolean demo = null;

  @SerializedName("created")
  private String created = null;

  @SerializedName("updated")
  private String updated = null;

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
    return Objects.equals(this.parent, paymentContractsProductModel.parent) &&
        Objects.equals(this.demo, paymentContractsProductModel.demo) &&
        Objects.equals(this.created, paymentContractsProductModel.created) &&
        Objects.equals(this.updated, paymentContractsProductModel.updated) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, demo, created, updated, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContractsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
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

