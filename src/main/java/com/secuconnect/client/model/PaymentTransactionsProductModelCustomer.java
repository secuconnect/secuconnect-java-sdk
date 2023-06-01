package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * PaymentTransactionsProductModelCustomer
 */
public class PaymentTransactionsProductModelCustomer {
  @SerializedName("companyname")
  protected String companyname = null;

  @SerializedName("salutation")
  protected String salutation = null;

  @SerializedName("title")
  protected String title = null;

  @SerializedName("forename")
  protected String forename = null;

  @SerializedName("surname")
  protected String surname = null;

  public PaymentTransactionsProductModelCustomer companyname(String companyname) {
    this.companyname = companyname;
    return this;
  }

   /**
   * Customer company name
   * @return companyname
  **/
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
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentTransactionsProductModelCustomer paymentTransactionsProductModelCustomer = (PaymentTransactionsProductModelCustomer) o;
    return Objects.equals(this.companyname, paymentTransactionsProductModelCustomer.companyname) &&
        Objects.equals(this.salutation, paymentTransactionsProductModelCustomer.salutation) &&
        Objects.equals(this.title, paymentTransactionsProductModelCustomer.title) &&
        Objects.equals(this.forename, paymentTransactionsProductModelCustomer.forename) &&
        Objects.equals(this.surname, paymentTransactionsProductModelCustomer.surname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyname, salutation, title, forename, surname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentTransactionsProductModelCustomer {\n");
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

