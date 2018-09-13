package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.LoyaltyStoregroupsDTOStoresAddressComponents;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * LoyaltyDTOStore
 */
public class LoyaltyDTOStore {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("address_components")
  private List<LoyaltyStoregroupsDTOStoresAddressComponents> addressComponents = null;

  @SerializedName("address_formatted")
  private String addressFormatted = null;

  @SerializedName("geometry")
  private String geometry = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("name_raw")
  private String nameRaw = null;

  public LoyaltyDTOStore object(String object) {
    this.object = object;
    return this;
  }

   /**
   * LoyaltyDTOStore
   * @return object
  **/
  @ApiModelProperty(value = "LoyaltyDTOStore")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public LoyaltyDTOStore id(String id) {
    this.id = id;
    return this;
  }

   /**
   * LoyaltyDTOStore
   * @return id
  **/
  @ApiModelProperty(value = "LoyaltyDTOStore")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LoyaltyDTOStore addressComponents(List<LoyaltyStoregroupsDTOStoresAddressComponents> addressComponents) {
    this.addressComponents = addressComponents;
    return this;
  }

  public LoyaltyDTOStore addAddressComponentsItem(LoyaltyStoregroupsDTOStoresAddressComponents addressComponentsItem) {
    if (this.addressComponents == null) {
      this.addressComponents = new ArrayList<LoyaltyStoregroupsDTOStoresAddressComponents>();
    }
    this.addressComponents.add(addressComponentsItem);
    return this;
  }

   /**
   * LoyaltyDTOStore
   * @return addressComponents
  **/
  @ApiModelProperty(value = "LoyaltyDTOStore")
  public List<LoyaltyStoregroupsDTOStoresAddressComponents> getAddressComponents() {
    return addressComponents;
  }

  public void setAddressComponents(List<LoyaltyStoregroupsDTOStoresAddressComponents> addressComponents) {
    this.addressComponents = addressComponents;
  }

  public LoyaltyDTOStore addressFormatted(String addressFormatted) {
    this.addressFormatted = addressFormatted;
    return this;
  }

   /**
   * Address formatted
   * @return addressFormatted
  **/
  @ApiModelProperty(value = "Address formatted")
  public String getAddressFormatted() {
    return addressFormatted;
  }

  public void setAddressFormatted(String addressFormatted) {
    this.addressFormatted = addressFormatted;
  }

  public LoyaltyDTOStore geometry(String geometry) {
    this.geometry = geometry;
    return this;
  }

   /**
   * Geometry
   * @return geometry
  **/
  @ApiModelProperty(value = "Geometry")
  public String getGeometry() {
    return geometry;
  }

  public void setGeometry(String geometry) {
    this.geometry = geometry;
  }

  public LoyaltyDTOStore name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  @ApiModelProperty(value = "Name")
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public LoyaltyDTOStore nameRaw(String nameRaw) {
    this.nameRaw = nameRaw;
    return this;
  }

   /**
   * Raw name
   * @return nameRaw
  **/
  @ApiModelProperty(value = "Raw name")
  public String getNameRaw() {
    return nameRaw;
  }

  public void setNameRaw(String nameRaw) {
    this.nameRaw = nameRaw;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyDTOStore loyaltyDTOStore = (LoyaltyDTOStore) o;
    return Objects.equals(this.object, loyaltyDTOStore.object) &&
        Objects.equals(this.id, loyaltyDTOStore.id) &&
        Objects.equals(this.addressComponents, loyaltyDTOStore.addressComponents) &&
        Objects.equals(this.addressFormatted, loyaltyDTOStore.addressFormatted) &&
        Objects.equals(this.geometry, loyaltyDTOStore.geometry) &&
        Objects.equals(this.name, loyaltyDTOStore.name) &&
        Objects.equals(this.nameRaw, loyaltyDTOStore.nameRaw);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, addressComponents, addressFormatted, geometry, name, nameRaw);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyDTOStore {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    addressComponents: ").append(toIndentedString(addressComponents)).append("\n");
    sb.append("    addressFormatted: ").append(toIndentedString(addressFormatted)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameRaw: ").append(toIndentedString(nameRaw)).append("\n");
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

