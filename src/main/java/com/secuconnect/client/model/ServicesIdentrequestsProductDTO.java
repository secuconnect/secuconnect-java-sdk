package com.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.secuconnect.client.model.IdentrequestPersonDTO;
import com.secuconnect.client.model.IdentrequestRedirectUrls;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ServicesIdentrequestsProductDTO
 */
public class ServicesIdentrequestsProductDTO {
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

  @SerializedName("demo")
  private Boolean demo = null;

  @SerializedName("person")
  private List<IdentrequestPersonDTO> person = null;

  @SerializedName("owner_transaction_id")
  private String ownerTransactionId = null;

  @SerializedName("redirect_url")
  private IdentrequestRedirectUrls redirectUrl = null;

  public ServicesIdentrequestsProductDTO provider(ProviderEnum provider) {
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

  public ServicesIdentrequestsProductDTO type(TypeEnum type) {
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
      this.person = new ArrayList<>();
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

  public ServicesIdentrequestsProductDTO redirectUrl(IdentrequestRedirectUrls redirectUrl) {
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
        Objects.equals(this.redirectUrl, servicesIdentrequestsProductDTO.redirectUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(provider, type, demo, person, ownerTransactionId, redirectUrl);
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
    sb.append("    redirectUrl: ").append(toIndentedString(redirectUrl)).append("\n");
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

