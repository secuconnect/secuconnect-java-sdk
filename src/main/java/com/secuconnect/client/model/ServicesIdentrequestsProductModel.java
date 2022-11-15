package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.CreatedField;
import com.secuconnect.client.model.IdentrequestPerson;
import com.secuconnect.client.model.IdentrequestRedirectUrls;
import com.secuconnect.client.model.ProductInstanceUID;
import com.secuconnect.client.model.UpdatedField;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;
import java.io.IOException;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/**
 * ServicesIdentrequestsProductModel
 */
public class ServicesIdentrequestsProductModel extends BaseProductModel {
  @SerializedName("created")
  private String created = null;

  @SerializedName("updated")
  private String updated = null;

  @SerializedName("contract")
  private ProductInstanceUID contract = null;

  /**
   * Third party identification provider
   */
  @JsonAdapter(ProviderEnum.Adapter.class)
  public enum ProviderEnum {
    POST_IDENT("post_ident"),
    BANK_IDENT("bank_ident"),
    WEBID("webid");

    private String value;

    ProviderEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static ProviderEnum fromValue(String text) {
      for (ProviderEnum b : ProviderEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<ProviderEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final ProviderEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public ProviderEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return ProviderEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("provider")
  private ProviderEnum provider = null;

  /**
   * Type
   */
  @JsonAdapter(TypeEnum.Adapter.class)
  public enum TypeEnum {
    PERSON("person");

    private String value;

    TypeEnum(String value) {
      this.value = value;
    }
    public String getValue() {
      return value;
    }

    @Override
    public String toString() {
      return String.valueOf(value);
    }
    public static TypeEnum fromValue(String text) {
      for (TypeEnum b : TypeEnum.values()) {
        if (String.valueOf(b.value).equals(text)) {
          return b;
        }
      }
      return null;
    }
    public static class Adapter extends TypeAdapter<TypeEnum> {
      @Override
      public void write(final JsonWriter jsonWriter, final TypeEnum enumeration) throws IOException {
        jsonWriter.value(enumeration.getValue());
      }

      @Override
      public TypeEnum read(final JsonReader jsonReader) throws IOException {
        Object value = jsonReader.nextString();
        return TypeEnum.fromValue(String.valueOf(value));
      }
    }
  }  @SerializedName("type")
  private TypeEnum type = null;

  @SerializedName("status")
  private String status = null;

  @SerializedName("demo")
  private Boolean demo = null;

  @SerializedName("person")
  private List<IdentrequestPerson> person = null;

  @SerializedName("owner_transaction_id")
  private String ownerTransactionId = null;

  @SerializedName("redirect_url")
  private IdentrequestRedirectUrls redirectUrl = null;

  @SerializedName("graduation_date")
  private String graduationDate = null;

  @SerializedName("treated")
  private Boolean treated = null;

  public ServicesIdentrequestsProductModel created(String created) {
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

  public ServicesIdentrequestsProductModel updated(String updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  public ServicesIdentrequestsProductModel contract(ProductInstanceUID contract) {
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

  public ServicesIdentrequestsProductModel provider(ProviderEnum provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Third party identification provider
   * @return provider
  **/
  public ProviderEnum getProvider() {
    return provider;
  }

  public void setProvider(ProviderEnum provider) {
    this.provider = provider;
  }

  public ServicesIdentrequestsProductModel type(TypeEnum type) {
    this.type = type;
    return this;
  }

   /**
   * Type
   * @return type
  **/
  public TypeEnum getType() {
    return type;
  }

  public void setType(TypeEnum type) {
    this.type = type;
  }

  public ServicesIdentrequestsProductModel status(String status) {
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

  public ServicesIdentrequestsProductModel demo(Boolean demo) {
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

  public ServicesIdentrequestsProductModel person(List<IdentrequestPerson> person) {
    this.person = person;
    return this;
  }

  public ServicesIdentrequestsProductModel addPersonItem(IdentrequestPerson personItem) {
    if (this.person == null) {
      this.person = new ArrayList<>();
    }
    this.person.add(personItem);
    return this;
  }

   /**
   * The person which should be identified by third party provider
   * @return person
  **/
  public List<IdentrequestPerson> getPerson() {
    return person;
  }

  public void setPerson(List<IdentrequestPerson> person) {
    this.person = person;
  }

  public ServicesIdentrequestsProductModel ownerTransactionId(String ownerTransactionId) {
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

  public ServicesIdentrequestsProductModel redirectUrl(IdentrequestRedirectUrls redirectUrl) {
    this.redirectUrl = redirectUrl;
    return this;
  }

   /**
   * Get redirectUrl
   * @return redirectUrl
  **/
  public IdentrequestRedirectUrls getRedirectUrl() {
    return redirectUrl;
  }

  public void setRedirectUrl(IdentrequestRedirectUrls redirectUrl) {
    this.redirectUrl = redirectUrl;
  }

  public ServicesIdentrequestsProductModel graduationDate(String graduationDate) {
    this.graduationDate = graduationDate;
    return this;
  }

   /**
   * Get graduationDate
   * @return graduationDate
  **/
  public String getGraduationDate() {
    return graduationDate;
  }

  public void setGraduationDate(String graduationDate) {
    this.graduationDate = graduationDate;
  }

   /**
   * Flag to identify if identrequest was internally processed by secupay
   * @return treated
  **/
  public Boolean getTreated() {
    return treated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicesIdentrequestsProductModel servicesIdentrequestsProductModel = (ServicesIdentrequestsProductModel) o;
    return Objects.equals(this.created, servicesIdentrequestsProductModel.created) &&
        Objects.equals(this.updated, servicesIdentrequestsProductModel.updated) &&
        Objects.equals(this.contract, servicesIdentrequestsProductModel.contract) &&
        Objects.equals(this.provider, servicesIdentrequestsProductModel.provider) &&
        Objects.equals(this.type, servicesIdentrequestsProductModel.type) &&
        Objects.equals(this.status, servicesIdentrequestsProductModel.status) &&
        Objects.equals(this.demo, servicesIdentrequestsProductModel.demo) &&
        Objects.equals(this.person, servicesIdentrequestsProductModel.person) &&
        Objects.equals(this.ownerTransactionId, servicesIdentrequestsProductModel.ownerTransactionId) &&
        Objects.equals(this.redirectUrl, servicesIdentrequestsProductModel.redirectUrl) &&
        Objects.equals(this.graduationDate, servicesIdentrequestsProductModel.graduationDate) &&
        Objects.equals(this.treated, servicesIdentrequestsProductModel.treated) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, updated, contract, provider, type, status, demo, person, ownerTransactionId, redirectUrl, graduationDate, treated, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicesIdentrequestsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    demo: ").append(toIndentedString(demo)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    ownerTransactionId: ").append(toIndentedString(ownerTransactionId)).append("\n");
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
    sb.append("    graduationDate: ").append(toIndentedString(graduationDate)).append("\n");
    sb.append("    treated: ").append(toIndentedString(treated)).append("\n");
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

