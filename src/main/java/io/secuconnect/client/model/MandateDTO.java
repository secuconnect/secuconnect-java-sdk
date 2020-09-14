package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * MandateDTO
 */
public class MandateDTO {
  @SerializedName("customer_id")
  private String customerId = null;

  @SerializedName("type")
  private String type = null;

  public MandateDTO customerId(String customerId) {
    this.customerId = customerId;
    return this;
  }

   /**
   * Customer id
   * @return customerId
  **/
  public String getCustomerId() {
    return customerId;
  }

  public void setCustomerId(String customerId) {
    this.customerId = customerId;
  }

  public MandateDTO type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Mandate type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    MandateDTO mandateDTO = (MandateDTO) o;
    return Objects.equals(this.customerId, mandateDTO.customerId) &&
        Objects.equals(this.type, mandateDTO.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(customerId, type);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class MandateDTO {\n");
    
    sb.append("    customerId: ").append(toIndentedString(customerId)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
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

