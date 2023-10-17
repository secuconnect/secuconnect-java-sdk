package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * Address component
 */
public class AddressComponents {
  @SerializedName("long_name")
  protected String longName = null;

  @SerializedName("short_name")
  protected String shortName = null;

  @SerializedName("types")
  protected List<String> types = null;

  public AddressComponents longName(String longName) {
    this.longName = longName;
    return this;
  }

   /**
   * Long name
   * @return longName
  **/
  public String getLongName() {
    return longName;
  }

  public void setLongName(String longName) {
    this.longName = longName;
  }

  public AddressComponents shortName(String shortName) {
    this.shortName = shortName;
    return this;
  }

   /**
   * Short name
   * @return shortName
  **/
  public String getShortName() {
    return shortName;
  }

  public void setShortName(String shortName) {
    this.shortName = shortName;
  }

  public AddressComponents types(List<String> types) {
    this.types = types;
    return this;
  }

  public AddressComponents addTypesItem(String typesItem) {
    if (this.types == null) {
      this.types = new ArrayList<String>();
    }
    this.types.add(typesItem);
    return this;
  }

   /**
   * Address component type:  - &#x60;route&#x60; (street long / short) - &#x60;street_number&#x60; - &#x60;locality&#x60; (city) - &#x60;country&#x60; (full / ISO two-letter code) - &#x60;postal_code&#x60; - &#x60;political&#x60; (accompanies &#x60;locality&#x60; and &#x60;company&#x60;)
   * @return types
  **/
  public List<String> getTypes() {
    return types;
  }

  public void setTypes(List<String> types) {
    this.types = types;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    AddressComponents addressComponents = (AddressComponents) o;
    return Objects.equals(this.longName, addressComponents.longName) &&
        Objects.equals(this.shortName, addressComponents.shortName) &&
        Objects.equals(this.types, addressComponents.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(longName, shortName, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class AddressComponents {\n");
    sb.append("    longName: ").append(toIndentedString(longName)).append("\n");
    sb.append("    shortName: ").append(toIndentedString(shortName)).append("\n");
    sb.append("    types: ").append(toIndentedString(types)).append("\n");
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

