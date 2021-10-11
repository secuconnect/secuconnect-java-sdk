package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.UserAddressData;
import com.secuconnect.client.model.ValueField;
import java.util.Objects;

/**
 * UserData
 */
public class UserData {
  @SerializedName("dob")
  private ValueField dob = null;

  @SerializedName("birthplace")
  private ValueField birthplace = null;

  @SerializedName("forename")
  private ValueField forename = null;

  @SerializedName("surname")
  private ValueField surname = null;

  @SerializedName("nationality")
  private ValueField nationality = null;

  @SerializedName("gender")
  private ValueField gender = null;

  @SerializedName("address")
  private UserAddressData address = null;

  public UserData dob(ValueField dob) {
    this.dob = dob;
    return this;
  }

   /**
   * Get dob
   * @return dob
  **/
  public ValueField getDob() {
    return dob;
  }

  public void setDob(ValueField dob) {
    this.dob = dob;
  }

  public UserData birthplace(ValueField birthplace) {
    this.birthplace = birthplace;
    return this;
  }

   /**
   * Get birthplace
   * @return birthplace
  **/
  public ValueField getBirthplace() {
    return birthplace;
  }

  public void setBirthplace(ValueField birthplace) {
    this.birthplace = birthplace;
  }

  public UserData forename(ValueField forename) {
    this.forename = forename;
    return this;
  }

   /**
   * Get forename
   * @return forename
  **/
  public ValueField getForename() {
    return forename;
  }

  public void setForename(ValueField forename) {
    this.forename = forename;
  }

  public UserData surname(ValueField surname) {
    this.surname = surname;
    return this;
  }

   /**
   * Get surname
   * @return surname
  **/
  public ValueField getSurname() {
    return surname;
  }

  public void setSurname(ValueField surname) {
    this.surname = surname;
  }

  public UserData nationality(ValueField nationality) {
    this.nationality = nationality;
    return this;
  }

   /**
   * Get nationality
   * @return nationality
  **/
  public ValueField getNationality() {
    return nationality;
  }

  public void setNationality(ValueField nationality) {
    this.nationality = nationality;
  }

  public UserData gender(ValueField gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Get gender
   * @return gender
  **/
  public ValueField getGender() {
    return gender;
  }

  public void setGender(ValueField gender) {
    this.gender = gender;
  }

  public UserData address(UserAddressData address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  public UserAddressData getAddress() {
    return address;
  }

  public void setAddress(UserAddressData address) {
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
    UserData userData = (UserData) o;
    return Objects.equals(this.dob, userData.dob) &&
        Objects.equals(this.birthplace, userData.birthplace) &&
        Objects.equals(this.forename, userData.forename) &&
        Objects.equals(this.surname, userData.surname) &&
        Objects.equals(this.nationality, userData.nationality) &&
        Objects.equals(this.gender, userData.gender) &&
        Objects.equals(this.address, userData.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(dob, birthplace, forename, surname, nationality, gender, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UserData {\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    birthplace: ").append(toIndentedString(birthplace)).append("\n");
    sb.append("    forename: ").append(toIndentedString(forename)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
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

