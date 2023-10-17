package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.GeneralMerchantsUserEmail;
import com.secuconnect.client.model.GeoAddress;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GeneralMerchantsUser
 */
public class GeneralMerchantsUser {
  @SerializedName("name")
  protected String name = null;

  @SerializedName("forename")
  protected String forename = null;

  @SerializedName("surname")
  protected String surname = null;

  @SerializedName("companyname")
  protected String companyname = null;

  @SerializedName("project_name")
  protected String projectName = null;

  @SerializedName("address")
  protected List<GeoAddress> address = null;

  @SerializedName("email")
  protected List<GeneralMerchantsUserEmail> email = null;

  public GeneralMerchantsUser name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Full name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GeneralMerchantsUser forename(String forename) {
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

  public GeneralMerchantsUser surname(String surname) {
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

  public GeneralMerchantsUser companyname(String companyname) {
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

  public GeneralMerchantsUser projectName(String projectName) {
    this.projectName = projectName;
    return this;
  }

   /**
   * Project name
   * @return projectName
  **/
  public String getProjectName() {
    return projectName;
  }

  public void setProjectName(String projectName) {
    this.projectName = projectName;
  }

  public GeneralMerchantsUser address(List<GeoAddress> address) {
    this.address = address;
    return this;
  }

  public GeneralMerchantsUser addAddressItem(GeoAddress addressItem) {
    if (this.address == null) {
      this.address = new ArrayList<GeoAddress>();
    }
    this.address.add(addressItem);
    return this;
  }

   /**
   * Address of General Merchant user
   * @return address
  **/
  public List<GeoAddress> getAddress() {
    return address;
  }

  public void setAddress(List<GeoAddress> address) {
    this.address = address;
  }

  public GeneralMerchantsUser email(List<GeneralMerchantsUserEmail> email) {
    this.email = email;
    return this;
  }

  public GeneralMerchantsUser addEmailItem(GeneralMerchantsUserEmail emailItem) {
    if (this.email == null) {
      this.email = new ArrayList<GeneralMerchantsUserEmail>();
    }
    this.email.add(emailItem);
    return this;
  }

   /**
   * Email addresses
   * @return email
  **/
  public List<GeneralMerchantsUserEmail> getEmail() {
    return email;
  }

  public void setEmail(List<GeneralMerchantsUserEmail> email) {
    this.email = email;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralMerchantsUser generalMerchantsUser = (GeneralMerchantsUser) o;
    return Objects.equals(this.name, generalMerchantsUser.name) &&
        Objects.equals(this.forename, generalMerchantsUser.forename) &&
        Objects.equals(this.surname, generalMerchantsUser.surname) &&
        Objects.equals(this.companyname, generalMerchantsUser.companyname) &&
        Objects.equals(this.projectName, generalMerchantsUser.projectName) &&
        Objects.equals(this.address, generalMerchantsUser.address) &&
        Objects.equals(this.email, generalMerchantsUser.email);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, forename, surname, companyname, projectName, address, email);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralMerchantsUser {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    forename: ").append(toIndentedString(forename)).append("\n");
    sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
    sb.append("    companyname: ").append(toIndentedString(companyname)).append("\n");
    sb.append("    projectName: ").append(toIndentedString(projectName)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    email: ").append(toIndentedString(email)).append("\n");
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

