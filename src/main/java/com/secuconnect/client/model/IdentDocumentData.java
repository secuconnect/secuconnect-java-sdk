package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.ValueField;
import java.util.Objects;

/**
 * IdentDocumentData
 */
public class IdentDocumentData {
  @SerializedName("country")
  protected ValueField country = null;

  @SerializedName("dateissued")
  protected ValueField dateissued = null;

  @SerializedName("issuedby")
  protected ValueField issuedby = null;

  @SerializedName("number")
  protected ValueField number = null;

  @SerializedName("type")
  protected ValueField type = null;

  @SerializedName("validuntil")
  protected ValueField validuntil = null;

  public IdentDocumentData country(ValueField country) {
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

  public IdentDocumentData dateissued(ValueField dateissued) {
    this.dateissued = dateissued;
    return this;
  }

   /**
   * Get dateissued
   * @return dateissued
  **/
  public ValueField getDateissued() {
    return dateissued;
  }

  public void setDateissued(ValueField dateissued) {
    this.dateissued = dateissued;
  }

  public IdentDocumentData issuedby(ValueField issuedby) {
    this.issuedby = issuedby;
    return this;
  }

   /**
   * Get issuedby
   * @return issuedby
  **/
  public ValueField getIssuedby() {
    return issuedby;
  }

  public void setIssuedby(ValueField issuedby) {
    this.issuedby = issuedby;
  }

  public IdentDocumentData number(ValueField number) {
    this.number = number;
    return this;
  }

   /**
   * Get number
   * @return number
  **/
  public ValueField getNumber() {
    return number;
  }

  public void setNumber(ValueField number) {
    this.number = number;
  }

  public IdentDocumentData type(ValueField type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public ValueField getType() {
    return type;
  }

  public void setType(ValueField type) {
    this.type = type;
  }

  public IdentDocumentData validuntil(ValueField validuntil) {
    this.validuntil = validuntil;
    return this;
  }

   /**
   * Get validuntil
   * @return validuntil
  **/
  public ValueField getValiduntil() {
    return validuntil;
  }

  public void setValiduntil(ValueField validuntil) {
    this.validuntil = validuntil;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentDocumentData identDocumentData = (IdentDocumentData) o;
    return Objects.equals(this.country, identDocumentData.country) &&
        Objects.equals(this.dateissued, identDocumentData.dateissued) &&
        Objects.equals(this.issuedby, identDocumentData.issuedby) &&
        Objects.equals(this.number, identDocumentData.number) &&
        Objects.equals(this.type, identDocumentData.type) &&
        Objects.equals(this.validuntil, identDocumentData.validuntil);
  }

  @Override
  public int hashCode() {
    return Objects.hash(country, dateissued, issuedby, number, type, validuntil);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentDocumentData {\n");
    sb.append("    country: ").append(toIndentedString(country)).append("\n");
    sb.append("    dateissued: ").append(toIndentedString(dateissued)).append("\n");
    sb.append("    issuedby: ").append(toIndentedString(issuedby)).append("\n");
    sb.append("    number: ").append(toIndentedString(number)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    validuntil: ").append(toIndentedString(validuntil)).append("\n");
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

