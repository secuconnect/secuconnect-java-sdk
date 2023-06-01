package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AddressComponents;
import com.secuconnect.client.model.GeoAddressGeometry;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GeoAddress
 */
public class GeoAddress {
  @SerializedName("type")
  protected String type = null;

  @SerializedName("address_components")
  protected List<AddressComponents> addressComponents = null;

  @SerializedName("address_formatted")
  protected String addressFormatted = null;

  @SerializedName("geometry")
  protected GeoAddressGeometry geometry = null;

  public GeoAddress type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Address type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GeoAddress addressComponents(List<AddressComponents> addressComponents) {
    this.addressComponents = addressComponents;
    return this;
  }

  public GeoAddress addAddressComponentsItem(AddressComponents addressComponentsItem) {
    if (this.addressComponents == null) {
      this.addressComponents = new ArrayList<AddressComponents>();
    }
    this.addressComponents.add(addressComponentsItem);
    return this;
  }

   /**
   * Address components
   * @return addressComponents
  **/
  public List<AddressComponents> getAddressComponents() {
    return addressComponents;
  }

  public void setAddressComponents(List<AddressComponents> addressComponents) {
    this.addressComponents = addressComponents;
  }

  public GeoAddress addressFormatted(String addressFormatted) {
    this.addressFormatted = addressFormatted;
    return this;
  }

   /**
   * Address formatted
   * @return addressFormatted
  **/
  public String getAddressFormatted() {
    return addressFormatted;
  }

  public void setAddressFormatted(String addressFormatted) {
    this.addressFormatted = addressFormatted;
  }

  public GeoAddress geometry(GeoAddressGeometry geometry) {
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  public GeoAddressGeometry getGeometry() {
    return geometry;
  }

  public void setGeometry(GeoAddressGeometry geometry) {
    this.geometry = geometry;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeoAddress geoAddress = (GeoAddress) o;
    return Objects.equals(this.type, geoAddress.type) &&
        Objects.equals(this.addressComponents, geoAddress.addressComponents) &&
        Objects.equals(this.addressFormatted, geoAddress.addressFormatted) &&
        Objects.equals(this.geometry, geoAddress.geometry);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, addressComponents, addressFormatted, geometry);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeoAddress {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    addressComponents: ").append(toIndentedString(addressComponents)).append("\n");
    sb.append("    addressFormatted: ").append(toIndentedString(addressFormatted)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
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

