package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * AvailableCountry
 */
public class AvailableCountry {
  @SerializedName("en")
  private String en = null;

  @SerializedName("iso_code")
  private String isoCode = null;

  @SerializedName("de")
  private String de = null;

  public AvailableCountry en(String en) {
    this.en = en;
    return this;
  }

   /**
   * English Translation for Country
   * @return en
  **/
  public String getEn() {
    return en;
  }

  public void setEn(String en) {
    this.en = en;
  }

  public AvailableCountry isoCode(String isoCode) {
    this.isoCode = isoCode;
    return this;
  }

   /**
   * The Iso Code for Country
   * @return isoCode
  **/
  public String getIsoCode() {
    return isoCode;
  }

  public void setIsoCode(String isoCode) {
    this.isoCode = isoCode;
  }

  public AvailableCountry de(String de) {
    this.de = de;
    return this;
  }

   /**
   * German Translation for Country
   * @return de
  **/
  public String getDe() {
    return de;
  }

  public void setDe(String de) {
    this.de = de;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AvailableCountry availableCountry = (AvailableCountry) o;
    return Objects.equals(this.en, availableCountry.en) &&
        Objects.equals(this.isoCode, availableCountry.isoCode) &&
        Objects.equals(this.de, availableCountry.de);
  }

  @Override
  public int hashCode() {
    return Objects.hash(en, isoCode, de);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AvailableCountry {\n");
    sb.append("    en: ").append(toIndentedString(en)).append("\n");
    sb.append("    isoCode: ").append(toIndentedString(isoCode)).append("\n");
    sb.append("    de: ").append(toIndentedString(de)).append("\n");
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

