package io.secuconnect.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * LoyaltyStoregroupsDTOStoresAddressComponents
 */
public class LoyaltyStoregroupsDTOStoresAddressComponents {
  @SerializedName("long_name")
  private String longName = null;

  @SerializedName("short_name")
  private String shortName = null;

  @SerializedName("types")
  private String types = null;

  public LoyaltyStoregroupsDTOStoresAddressComponents longName(String longName) {
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

  public LoyaltyStoregroupsDTOStoresAddressComponents shortName(String shortName) {
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

  public LoyaltyStoregroupsDTOStoresAddressComponents types(String types) {
    this.types = types;
    return this;
  }

   /**
   * Types
   * @return types
  **/
  public String getTypes() {
    return types;
  }

  public void setTypes(String types) {
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
    LoyaltyStoregroupsDTOStoresAddressComponents loyaltyStoregroupsDTOStoresAddressComponents = (LoyaltyStoregroupsDTOStoresAddressComponents) o;
    return Objects.equals(this.longName, loyaltyStoregroupsDTOStoresAddressComponents.longName) &&
        Objects.equals(this.shortName, loyaltyStoregroupsDTOStoresAddressComponents.shortName) &&
        Objects.equals(this.types, loyaltyStoregroupsDTOStoresAddressComponents.types);
  }

  @Override
  public int hashCode() {
    return Objects.hash(longName, shortName, types);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyStoregroupsDTOStoresAddressComponents {\n");
    
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

