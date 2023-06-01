package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.IdentrequestPersonDTO;
import com.secuconnect.client.model.IdentrequestRedirectUrls;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ServicesIdentrequestsProductDTO
 */
public class ServicesIdentrequestsProductDTO {
  @SerializedName("provider")
  protected String provider = null;

  @SerializedName("type")
  protected String type = null;

  @SerializedName("demo")
  protected Boolean demo = null;

  @SerializedName("person")
  protected List<IdentrequestPersonDTO> person = null;

  @SerializedName("owner_transaction_id")
  protected String ownerTransactionId = null;

  @SerializedName("redirect_urls")
  protected IdentrequestRedirectUrls redirectUrls = null;

  public ServicesIdentrequestsProductDTO provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public ServicesIdentrequestsProductDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ServicesIdentrequestsProductDTO demo(Boolean demo) {
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

  public ServicesIdentrequestsProductDTO person(List<IdentrequestPersonDTO> person) {
    this.person = person;
    return this;
  }

  public ServicesIdentrequestsProductDTO addPersonItem(IdentrequestPersonDTO personItem) {
    if (this.person == null) {
      this.person = new ArrayList<IdentrequestPersonDTO>();
    }
    this.person.add(personItem);
    return this;
  }

   /**
   * The person which should be identified by third party provider
   * @return person
  **/
  public List<IdentrequestPersonDTO> getPerson() {
    return person;
  }

  public void setPerson(List<IdentrequestPersonDTO> person) {
    this.person = person;
  }

  public ServicesIdentrequestsProductDTO ownerTransactionId(String ownerTransactionId) {
    this.ownerTransactionId = ownerTransactionId;
    return this;
  }

   /**
   * Arbitrary ID to identify identrequest on merchant
   * @return ownerTransactionId
  **/
  public String getOwnerTransactionId() {
    return ownerTransactionId;
  }

  public void setOwnerTransactionId(String ownerTransactionId) {
    this.ownerTransactionId = ownerTransactionId;
  }

  public ServicesIdentrequestsProductDTO redirectUrls(IdentrequestRedirectUrls redirectUrls) {
    this.redirectUrls = redirectUrls;
    return this;
  }

   /**
   * Get redirectUrls
   * @return redirectUrls
  **/
  public IdentrequestRedirectUrls getRedirectUrls() {
    return redirectUrls;
  }

  public void setRedirectUrls(IdentrequestRedirectUrls redirectUrls) {
    this.redirectUrls = redirectUrls;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicesIdentrequestsProductDTO servicesIdentrequestsProductDTO = (ServicesIdentrequestsProductDTO) o;
    return Objects.equals(this.provider, servicesIdentrequestsProductDTO.provider) &&
        Objects.equals(this.type, servicesIdentrequestsProductDTO.type) &&
        Objects.equals(this.demo, servicesIdentrequestsProductDTO.demo) &&
        Objects.equals(this.person, servicesIdentrequestsProductDTO.person) &&
        Objects.equals(this.ownerTransactionId, servicesIdentrequestsProductDTO.ownerTransactionId) &&
        Objects.equals(this.redirectUrls, servicesIdentrequestsProductDTO.redirectUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, type, demo, person, ownerTransactionId, redirectUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicesIdentrequestsProductDTO {\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    demo: ").append(toIndentedString(demo)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    ownerTransactionId: ").append(toIndentedString(ownerTransactionId)).append("\n");
    sb.append("    redirectUrls: ").append(toIndentedString(redirectUrls)).append("\n");
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

