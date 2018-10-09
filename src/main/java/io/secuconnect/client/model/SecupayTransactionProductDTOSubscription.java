package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/**
 * Recurring payments
 */
@ApiModel(description = "Recurring payments")
public class SecupayTransactionProductDTOSubscription {
  @SerializedName("purpose")
  private String purpose = null;

  @SerializedName("id")
  private Integer id = null;

  public SecupayTransactionProductDTOSubscription purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * The purpose of the subscription
   * @return purpose
  **/
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public SecupayTransactionProductDTOSubscription id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Id of subscription, if exists
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayTransactionProductDTOSubscription secupayTransactionProductDTOSubscription = (SecupayTransactionProductDTOSubscription) o;
    return Objects.equals(this.purpose, secupayTransactionProductDTOSubscription.purpose) &&
        Objects.equals(this.id, secupayTransactionProductDTOSubscription.id);
  }

  @Override
  public int hashCode() {
    return Objects.hash(purpose, id);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayTransactionProductDTOSubscription {\n");
    
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

