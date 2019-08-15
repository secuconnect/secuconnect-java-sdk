package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.ProductInstanceUID;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * SmartTransactionsPrepare
 */
public class SmartTransactionsPrepare {
  @SerializedName("customer")
  private ProductInstanceUID customer = null;

  @SerializedName("container")
  private ProductInstanceUID container = null;

  public SmartTransactionsPrepare customer(ProductInstanceUID customer) {
    this.customer = customer;
    return this;
  }

   /**
   * Customer
   * @return customer
  **/
  public ProductInstanceUID getCustomer() {
    return customer;
  }

  public void setCustomer(ProductInstanceUID customer) {
    this.customer = customer;
  }

  public SmartTransactionsPrepare container(ProductInstanceUID container) {
    this.container = container;
    return this;
  }

   /**
   * Container
   * @return container
  **/
  public ProductInstanceUID getContainer() {
    return container;
  }

  public void setContainer(ProductInstanceUID container) {
    this.container = container;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsPrepare smartTransactionsPrepare = (SmartTransactionsPrepare) o;
    return Objects.equals(this.customer, smartTransactionsPrepare.customer) &&
        Objects.equals(this.container, smartTransactionsPrepare.container);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customer, container);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsPrepare {\n");
    
    sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
    sb.append("    container: ").append(toIndentedString(container)).append("\n");
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

