package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyDTOMerchant
 */
public class LoyaltyDTOMerchant {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  public LoyaltyDTOMerchant object(String object) {
    this.object = object;
    return this;
  }

   /**
   * LoyaltyDTOMerchant
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public LoyaltyDTOMerchant id(String id) {
    this.id = id;
    return this;
  }

   /**
   * LoyaltyDTOMerchant
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyDTOMerchant loyaltyDTOMerchant = (LoyaltyDTOMerchant) o;
    return Objects.equals(this.object, loyaltyDTOMerchant.object) &&
        Objects.equals(this.id, loyaltyDTOMerchant.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyDTOMerchant {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
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

