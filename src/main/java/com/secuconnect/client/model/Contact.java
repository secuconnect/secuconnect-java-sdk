package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.Address;
import java.util.Objects;

/**
 * Contact details
 */
public class Contact {
  @SerializedName("name")
  protected String name = null;

  @SerializedName("forename")
  protected String forename = null;

  @SerializedName("surname")
  protected String surname = null;

  @SerializedName("companyname")
  protected String companyname = null;

  @SerializedName("salutation")
  protected String salutation = null;

  @SerializedName("gender")
  protected String gender = null;

  @SerializedName("title")
  protected String title = null;

  @SerializedName("email")
  protected String email = null;

  @SerializedName("phone")
  protected String phone = null;

  @SerializedName("mobile")
  protected String mobile = null;

  @SerializedName("fax")
  protected String fax = null;

  @SerializedName("dob")
  protected String dob = null;

  @SerializedName("picture")
  protected String picture = null;

  @SerializedName("url_website")
  protected String urlWebsite = null;

  @SerializedName("birthplace")
  protected String birthplace = null;

  @SerializedName("nationality")
  protected String nationality = null;

  @SerializedName("address")
  protected Address address = null;

  public Contact name(String name) {
    this.name = name;
    return this;
  }

   /**
   * First and last name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public Contact forename(String forename) {
    this.forename = forename;
    return this;
  }

   /**
   * First name
   * @return forename
  **/
  public String getForename() {
    return forename;
  }

  public void setForename(String forename) {
    this.forename = forename;
  }

  public Contact surname(String surname) {
    this.surname = surname;
    return this;
  }

   /**
   * Last name
   * @return surname
  **/
  public String getSurname() {
    return surname;
  }

  public void setSurname(String surname) {
    this.surname = surname;
  }

  public Contact companyname(String companyname) {
    this.companyname = companyname;
    return this;
  }

   /**
   * Company name
   * @return companyname
  **/
  public String getCompanyname() {
    return companyname;
  }

  public void setCompanyname(String companyname) {
    this.companyname = companyname;
  }

  public Contact salutation(String salutation) {
    this.salutation = salutation;
    return this;
  }

   /**
   * Salutation
   * @return salutation
  **/
  public String getSalutation() {
    return salutation;
  }

  public void setSalutation(String salutation) {
    this.salutation = salutation;
  }

  public Contact gender(String gender) {
    this.gender = gender;
    return this;
  }

   /**
   * Gender
   * @return gender
  **/
  public String getGender() {
    return gender;
  }

  public void setGender(String gender) {
    this.gender = gender;
  }

  public Contact title(String title) {
    this.title = title;
    return this;
  }

   /**
   * Title or academic degree
   * @return title
  **/
  public String getTitle() {
    return title;
  }

  public void setTitle(String title) {
    this.title = title;
  }

  public Contact email(String email) {
    this.email = email;
    return this;
  }

   /**
   * Email address
   * @return email
  **/
  public String getEmail() {
    return email;
  }

  public void setEmail(String email) {
    this.email = email;
  }

  public Contact phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * Landline number
   * @return phone
  **/
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public Contact mobile(String mobile) {
    this.mobile = mobile;
    return this;
  }

   /**
   * Mobile phone number
   * @return mobile
  **/
  public String getMobile() {
    return mobile;
  }

  public void setMobile(String mobile) {
    this.mobile = mobile;
  }

  public Contact fax(String fax) {
    this.fax = fax;
    return this;
  }

   /**
   * Fax number
   * @return fax
  **/
  public String getFax() {
    return fax;
  }

  public void setFax(String fax) {
    this.fax = fax;
  }

  public Contact dob(String dob) {
    this.dob = dob;
    return this;
  }

   /**
   * Date of birth, ISO 8601 formatted
   * @return dob
  **/
  public String getDob() {
    return dob;
  }

  public void setDob(String dob) {
    this.dob = dob;
  }

  public Contact picture(String picture) {
    this.picture = picture;
    return this;
  }

   /**
   * The document ID (or URL) of an user picture; s. Document service
   * @return picture
  **/
  public String getPicture() {
    return picture;
  }

  public void setPicture(String picture) {
    this.picture = picture;
  }

  public Contact urlWebsite(String urlWebsite) {
    this.urlWebsite = urlWebsite;
    return this;
  }

   /**
   * URL to company website
   * @return urlWebsite
  **/
  public String getUrlWebsite() {
    return urlWebsite;
  }

  public void setUrlWebsite(String urlWebsite) {
    this.urlWebsite = urlWebsite;
  }

  public Contact birthplace(String birthplace) {
    this.birthplace = birthplace;
    return this;
  }

   /**
   * Birthplace
   * @return birthplace
  **/
  public String getBirthplace() {
    return birthplace;
  }

  public void setBirthplace(String birthplace) {
    this.birthplace = birthplace;
  }

  public Contact nationality(String nationality) {
    this.nationality = nationality;
    return this;
  }

   /**
   * Get nationality
   * @return nationality
  **/
  public String getNationality() {
    return nationality;
  }

  public void setNationality(String nationality) {
    this.nationality = nationality;
  }

  public Contact address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
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
    Contact contact = (Contact) o;
    return Objects.equals(this.name, contact.name) &&
        Objects.equals(this.forename, contact.forename) &&
        Objects.equals(this.surname, contact.surname) &&
        Objects.equals(this.companyname, contact.companyname) &&
        Objects.equals(this.salutation, contact.salutation) &&
        Objects.equals(this.gender, contact.gender) &&
        Objects.equals(this.title, contact.title) &&
        Objects.equals(this.email, contact.email) &&
        Objects.equals(this.phone, contact.phone) &&
        Objects.equals(this.mobile, contact.mobile) &&
        Objects.equals(this.fax, contact.fax) &&
        Objects.equals(this.dob, contact.dob) &&
        Objects.equals(this.picture, contact.picture) &&
        Objects.equals(this.urlWebsite, contact.urlWebsite) &&
        Objects.equals(this.birthplace, contact.birthplace) &&
        Objects.equals(this.nationality, contact.nationality) &&
        Objects.equals(this.address, contact.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, forename, surname, companyname, salutation, gender, title, email, phone, mobile, fax, dob, picture, urlWebsite, birthplace, nationality, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Contact {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    forename: ").append(toIndentedString(forename)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    companyname: ").append(toIndentedString(companyname)).append("\n");
    sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
    sb.append("    gender: ").append(toIndentedString(gender)).append("\n");
    sb.append("    title: ").append(toIndentedString(title)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    mobile: ").append(toIndentedString(mobile)).append("\n");
    sb.append("    fax: ").append(toIndentedString(fax)).append("\n");
    sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
    sb.append("    picture: ").append(toIndentedString(picture)).append("\n");
    sb.append("    urlWebsite: ").append(toIndentedString(urlWebsite)).append("\n");
    sb.append("    birthplace: ").append(toIndentedString(birthplace)).append("\n");
    sb.append("    nationality: ").append(toIndentedString(nationality)).append("\n");
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

