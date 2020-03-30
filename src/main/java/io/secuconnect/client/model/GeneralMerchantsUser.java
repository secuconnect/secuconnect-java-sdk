package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.GeoAddress;
import java.util.ArrayList;
import java.util.List;

/**
 * GeneralMerchantsUser
 */
public class GeneralMerchantsUser {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("companyname")
  private String companyname = null;

  @SerializedName("address")
  private List<GeoAddress> address = null;

  public GeneralMerchantsUser object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of general merchant user
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public GeneralMerchantsUser id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of general merchant user
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GeneralMerchantsUser name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of general merchant user
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GeneralMerchantsUser companyname(String companyname) {
    this.companyname = companyname;
    return this;
  }

   /**
   * Company name of general merchant user
   * @return companyname
  **/
  public String getCompanyname() {
    return companyname;
  }

  public void setCompanyname(String companyname) {
    this.companyname = companyname;
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
   * Address of general merchant user
   * @return address
  **/
  public List<GeoAddress> getAddress() {
    return address;
  }

  public void setAddress(List<GeoAddress> address) {
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
    GeneralMerchantsUser generalMerchantsUser = (GeneralMerchantsUser) o;
    return Objects.equals(this.object, generalMerchantsUser.object) &&
        Objects.equals(this.id, generalMerchantsUser.id) &&
        Objects.equals(this.name, generalMerchantsUser.name) &&
        Objects.equals(this.companyname, generalMerchantsUser.companyname) &&
        Objects.equals(this.address, generalMerchantsUser.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, name, companyname, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralMerchantsUser {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    companyname: ").append(toIndentedString(companyname)).append("\n");
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

