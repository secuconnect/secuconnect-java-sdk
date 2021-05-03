package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.GeoAddress;
import java.util.Objects;

/**
 * GeneralMerchantsPublicDataCompany
 */
public class GeneralMerchantsPublicDataCompany {
  @SerializedName("companyname")
  private String companyname = null;

  @SerializedName("address")
  private GeoAddress address = null;

  public GeneralMerchantsPublicDataCompany companyname(String companyname) {
    this.companyname = companyname;
    return this;
  }

   /**
   * Company name of General Merchant user
   * @return companyname
  **/
  public String getCompanyname() {
    return companyname;
  }

  public void setCompanyname(String companyname) {
    this.companyname = companyname;
  }

  public GeneralMerchantsPublicDataCompany address(GeoAddress address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  public GeoAddress getAddress() {
    return address;
  }

  public void setAddress(GeoAddress address) {
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
    GeneralMerchantsPublicDataCompany generalMerchantsPublicDataCompany = (GeneralMerchantsPublicDataCompany) o;
    return Objects.equals(this.companyname, generalMerchantsPublicDataCompany.companyname) &&
        Objects.equals(this.address, generalMerchantsPublicDataCompany.address);
  }

  @Override
  public int hashCode() {
    return Objects.hash(companyname, address);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralMerchantsPublicDataCompany {\n");
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

