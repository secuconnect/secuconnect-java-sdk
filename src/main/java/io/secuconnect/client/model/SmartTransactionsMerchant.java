package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * SmartTransactionsMerchant
 */
public class SmartTransactionsMerchant {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("companyname")
  private String companyname = null;

  public SmartTransactionsMerchant object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type of instance
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public SmartTransactionsMerchant id(String id) {
    this.id = id;
    return this;
  }

   /**
   * ID of instance
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SmartTransactionsMerchant companyname(String companyname) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsMerchant smartTransactionsMerchant = (SmartTransactionsMerchant) o;
    return Objects.equals(this.object, smartTransactionsMerchant.object) &&
        Objects.equals(this.id, smartTransactionsMerchant.id) &&
        Objects.equals(this.companyname, smartTransactionsMerchant.companyname);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, companyname);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsMerchant {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    companyname: ").append(toIndentedString(companyname)).append("\n");
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

