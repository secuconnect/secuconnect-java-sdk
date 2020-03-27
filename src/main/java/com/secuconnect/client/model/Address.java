package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Address
 */
public class Address {
    @SerializedName("type")
    private String type = null;

    @SerializedName("street")
    private String street = null;

    @SerializedName("street_number")
    private String streetNumber = null;

    @SerializedName("city")
    private String city = null;

    @SerializedName("postal_code")
    private String postalCode = null;

    @SerializedName("country")
    private String country = null;

    @SerializedName("additional_address_data")
    private String additionalAddressData = null;

    public Address type(String type) {
        this.type = type;
        return this;
    }

    /**
     * Type
     *
     * @return type
     **/
    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Address street(String street) {
        this.street = street;
        return this;
    }

    /**
     * Street
     *
     * @return street
     **/
    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public Address streetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
        return this;
    }

    /**
     * Street number
     *
     * @return streetNumber
     **/
    public String getStreetNumber() {
        return streetNumber;
    }

    public void setStreetNumber(String streetNumber) {
        this.streetNumber = streetNumber;
    }

    public Address city(String city) {
        this.city = city;
        return this;
    }

    /**
     * City
     *
     * @return city
     **/
    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public Address postalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }

    /**
     * Postal code
     *
     * @return postalCode
     **/
    public String getPostalCode() {
        return postalCode;
    }

    public void setPostalCode(String postalCode) {
        this.postalCode = postalCode;
    }

    public Address country(String country) {
        this.country = country;
        return this;
    }

    /**
     * Country
     *
     * @return country
     **/
    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public Address additionalAddressData(String additionalAddressData) {
        this.additionalAddressData = additionalAddressData;
        return this;
    }

    /**
     * Additional address data
     *
     * @return additionalAddressData
     **/
    public String getAdditionalAddressData() {
        return additionalAddressData;
    }

    public void setAdditionalAddressData(String additionalAddressData) {
        this.additionalAddressData = additionalAddressData;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        Address address = (Address) o;
        return Objects.equals(this.type, address.type) &&
                Objects.equals(this.street, address.street) &&
                Objects.equals(this.streetNumber, address.streetNumber) &&
                Objects.equals(this.city, address.city) &&
                Objects.equals(this.postalCode, address.postalCode) &&
                Objects.equals(this.country, address.country) &&
                Objects.equals(this.additionalAddressData, address.additionalAddressData);
    }

    @Override
    public int hashCode() {
        return Objects.hash(type, street, streetNumber, city, postalCode, country, additionalAddressData);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class Address {\n");

        sb.append("    type: ").append(toIndentedString(type)).append("\n");
        sb.append("    street: ").append(toIndentedString(street)).append("\n");
        sb.append("    streetNumber: ").append(toIndentedString(streetNumber)).append("\n");
        sb.append("    city: ").append(toIndentedString(city)).append("\n");
        sb.append("    postalCode: ").append(toIndentedString(postalCode)).append("\n");
        sb.append("    country: ").append(toIndentedString(country)).append("\n");
        sb.append("    additionalAddressData: ").append(toIndentedString(additionalAddressData)).append("\n");
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

