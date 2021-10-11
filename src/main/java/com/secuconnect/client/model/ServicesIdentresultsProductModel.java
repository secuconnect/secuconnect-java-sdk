package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.CreatedField;
import com.secuconnect.client.model.IdentresultPerson;
import com.secuconnect.client.model.ProductInstanceUID;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ServicesIdentresultsProductModel
 */
public class ServicesIdentresultsProductModel extends BaseProductModel {
  @SerializedName("created")
  private String created = null;

  @SerializedName("request")
  private ProductInstanceUID request = null;

  @SerializedName("contract")
  private ProductInstanceUID contract = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("demo")
  private Boolean demo = null;

  @SerializedName("person")
  private List<IdentresultPerson> person = null;

  public ServicesIdentresultsProductModel created(String created) {
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

  public ServicesIdentresultsProductModel request(ProductInstanceUID request) {
    this.request = request;
    return this;
  }

   /**
   * Get request
   * @return request
  **/
  public ProductInstanceUID getRequest() {
    return request;
  }

  public void setRequest(ProductInstanceUID request) {
    this.request = request;
  }

  public ServicesIdentresultsProductModel contract(ProductInstanceUID contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  public ProductInstanceUID getContract() {
    return contract;
  }

  public void setContract(ProductInstanceUID contract) {
    this.contract = contract;
  }

  public ServicesIdentresultsProductModel status(String status) {
    this.status = status;
    return this;
  }

   /**
   * The status of the identrequest
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ServicesIdentresultsProductModel demo(Boolean demo) {
    this.demo = demo;
    return this;
  }

   /**
   * Demo Flag
   * @return demo
  **/
  public Boolean getDemo() {
    return demo;
  }

  public void setDemo(Boolean demo) {
    this.demo = demo;
  }

  public ServicesIdentresultsProductModel person(List<IdentresultPerson> person) {
    this.person = person;
    return this;
  }

  public ServicesIdentresultsProductModel addPersonItem(IdentresultPerson personItem) {
    if (this.person == null) {
      this.person = new ArrayList<>();
    }
    this.person.add(personItem);
    return this;
  }

   /**
   * The details from identification process about identified person
   * @return person
  **/
  public List<IdentresultPerson> getPerson() {
    return person;
  }

  public void setPerson(List<IdentresultPerson> person) {
    this.person = person;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicesIdentresultsProductModel servicesIdentresultsProductModel = (ServicesIdentresultsProductModel) o;
    return Objects.equals(this.created, servicesIdentresultsProductModel.created) &&
        Objects.equals(this.request, servicesIdentresultsProductModel.request) &&
        Objects.equals(this.contract, servicesIdentresultsProductModel.contract) &&
        Objects.equals(this.status, servicesIdentresultsProductModel.status) &&
        Objects.equals(this.demo, servicesIdentresultsProductModel.demo) &&
        Objects.equals(this.person, servicesIdentresultsProductModel.person) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, request, contract, status, demo, person, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicesIdentresultsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    request: ").append(toIndentedString(request)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    demo: ").append(toIndentedString(demo)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
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

