package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/**
 * PaymentTransactionsProductModel
 */
@ApiModel(description = "PaymentTransactionsProductModel")
public class PaymentTransactionsProductModelCustomer {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("companyname")
  private String companyname = null;

  @SerializedName("salutation")
  private String salutation = null;

  @SerializedName("title")
  private String title = null;

  @SerializedName("forename")
  private String forename = null;

  @SerializedName("surname")
  private String surname = null;

  public PaymentTransactionsProductModelCustomer object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Customer type name
   * @return object
  **/
  @ApiModelProperty(value = "Customer type name")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public PaymentTransactionsProductModelCustomer id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of customer
   * @return id
  **/
  @ApiModelProperty(value = "Id of customer")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public PaymentTransactionsProductModelCustomer companyname(String companyname) {
    this.companyname = companyname;
    return this;
  }

   /**
   * Customer company name
   * @return companyname
  **/
  @ApiModelProperty(value = "Customer company name")
  public String getCompanyname() {
    return companyname;
  }

  public void setCompanyname(String companyname) {
    this.companyname = companyname;
  }

  public PaymentTransactionsProductModelCustomer salutation(String salutation) {
    this.salutation = salutation;
    return this;
  }

   /**
   * Customer salutation
   * @return salutation
  **/
  @ApiModelProperty(value = "Customer salutation")
  public String getSalutation() {
    return salutation;
  }

  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }

  public PaymentTransactionsProductModelCustomer title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Customer title
   * @return title
  **/
  @ApiModelProperty(value = "Customer title")
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public PaymentTransactionsProductModelCustomer forename(String forename) {
    this.forename = forename;
    return this;
  }

   /**
   * Customer forename
   * @return forename
  **/
  @ApiModelProperty(value = "Customer forename")
  public String getForename() {
    return forename;
  }

  public void setForename(String forename) {
    this.forename = forename;
  }

  public PaymentTransactionsProductModelCustomer surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * Customer surname
   * @return surname
  **/
  @ApiModelProperty(value = "Customer surname")
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransactionsProductModelCustomer paymentTransactionsProductModelCustomer = (PaymentTransactionsProductModelCustomer) o;
    return Objects.equals(this.object, paymentTransactionsProductModelCustomer.object) &&
        Objects.equals(this.id, paymentTransactionsProductModelCustomer.id) &&
        Objects.equals(this.companyname, paymentTransactionsProductModelCustomer.companyname) &&
        Objects.equals(this.salutation, paymentTransactionsProductModelCustomer.salutation) &&
        Objects.equals(this.title, paymentTransactionsProductModelCustomer.title) &&
        Objects.equals(this.forename, paymentTransactionsProductModelCustomer.forename) &&
        Objects.equals(this.surname, paymentTransactionsProductModelCustomer.surname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, companyname, salutation, title, forename, surname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransactionsProductModelCustomer {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyname: ").append(toIndentedString(companyname)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    forename: ").append(toIndentedString(forename)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
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

