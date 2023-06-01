package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.ValueField;
import java.util.Objects;

/**
 * UserAddressData
 */
public class UserAddressData {
  @SerializedName("street")
  protected ValueField street = null;

  @SerializedName("street_number")
  protected ValueField streetNumber = null;

  @SerializedName("city")
  protected ValueField city = null;

  @SerializedName("postal_code")
  protected ValueField postalCode = null;

  @SerializedName("country")
  protected ValueField country = null;

  public UserAddressData street(ValueField street) {
    this.street = street;
    return this;
  }

   /**
   * Get street
   * @return street
  **/
  public ValueField getStreet() {
    return street;
  }

  public void setStreet(ValueField street) {
    this.street = street;
  }

  public UserAddressData streetNumber(ValueField streetNumber) {
    this.streetNumber = streetNumber;
    return this;
  }

   /**
   * Get streetNumber
   * @return streetNumber
  **/
  public ValueField getStreetNumber() {
    return streetNumber;
  }

  public void setStreetNumber(ValueField streetNumber) {
    this.streetNumber = streetNumber;
  }

  public UserAddressData city(ValueField city) {
    this.city = city;
    return this;
  }

   /**
   * Get city
   * @return city
  **/
  public ValueField getCity() {
    return city;
  }

  public void setCity(ValueField city) {
    this.city = city;
  }

  public UserAddressData postalCode(ValueField postalCode) {
    this.postalCode = postalCode;
    return this;
  }

   /**
   * Get postalCode
   * @return postalCode
  **/
  public ValueField getPostalCode() {
    return postalCode;
  }

  public void setPostalCode(ValueField postalCode) {
    this.postalCode = postalCode;
  }

  public UserAddressData country(ValueField country) {
    this.country = country;
    return this;
  }

   /**
   * Get country
   * @return country
  **/
  public ValueField getCountry() {
    return country;
  }

  public void setCountry(ValueField country) {
    this.country = country;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UserAddressData userAddressData = (UserAddressData) o;
    return Objects.equals(this.street, userAddressData.street) &&
        Objects.equals(this.streetNumber, userAddressData.streetNumber) &&
        Objects.equals(this.city, userAddressData.city) &&
        Objects.equals(this.postalCode, userAddressData.postalCode) &&
        Objects.equals(this.country, userAddressData.country);
  }

  @Override
  public int hashCode() {
    return Objects.hash(street, streetNumber, city, postalCode, country);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserAddressData {\n");
    sb.append("    street: ").append(toIndentedString(street)).append("\n");
    sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
    sb.append("    city: ").append(toIndentedString(city)).append("\n");
    sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
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

