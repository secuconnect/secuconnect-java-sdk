package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * LoyaltyCustomersContactDTO
 */
public class LoyaltyCustomersContactDTO {
    @SerializedName("forename")
    private String forename = null;

    @SerializedName("surname")
    private String surname = null;

    @SerializedName("name")
    private String name = null;

    @SerializedName("phone")
    private String phone = null;

    @SerializedName("address")
    private Address address = null;

    public LoyaltyCustomersContactDTO forename(String forename) {
        this.forename = forename;
        return this;
    }

    /**
     * Forename
     *
     * @return forename
     **/
    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public LoyaltyCustomersContactDTO surname(String surname) {
        this.surname = surname;
        return this;
    }

    /**
     * Surname
     *
     * @return surname
     **/
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public LoyaltyCustomersContactDTO name(String name) {
        this.name = name;
        return this;
    }

    /**
     * Name
     *
     * @return name
     **/
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public LoyaltyCustomersContactDTO phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Phone
     *
     * @return phone
     **/
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public LoyaltyCustomersContactDTO address(Address address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     *
     * @return address
     **/
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoyaltyCustomersContactDTO loyaltyCustomersContactDTO = (LoyaltyCustomersContactDTO) o;
        return Objects.equals(this.forename, loyaltyCustomersContactDTO.forename) &&
                Objects.equals(this.surname, loyaltyCustomersContactDTO.surname) &&
                Objects.equals(this.name, loyaltyCustomersContactDTO.name) &&
                Objects.equals(this.phone, loyaltyCustomersContactDTO.phone) &&
                Objects.equals(this.address, loyaltyCustomersContactDTO.address);
    }

    @Override
    public int hashCode() {
        return Objects.hash(forename, surname, name, phone, address);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoyaltyCustomersContactDTO {\n");

        sb.append("    forename: ").append(toIndentedString(forename)).append("\n");
        sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
        sb.append("    name: ").append(toIndentedString(name)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
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

