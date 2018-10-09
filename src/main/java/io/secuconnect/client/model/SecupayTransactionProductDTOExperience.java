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
 * Customer experience score
 */
@ApiModel(description = "Customer experience score")
public class SecupayTransactionProductDTOExperience {
  @SerializedName("positive")
  private Integer positive = null;

  @SerializedName("negative")
  private Integer negative = null;

  public SecupayTransactionProductDTOExperience positive(Integer positive) {
    this.positive = positive;
    return this;
  }

   /**
   * Score of positive experience (paid orders)
   * @return positive
  **/
  public Integer getPositive() {
    return positive;
  }

  public void setPositive(Integer positive) {
    this.positive = positive;
  }

  public SecupayTransactionProductDTOExperience negative(Integer negative) {
    this.negative = negative;
    return this;
  }

   /**
   * Score of negative experience (open/unpaid orders)
   * @return negative
  **/
  public Integer getNegative() {
    return negative;
  }

  public void setNegative(Integer negative) {
    this.negative = negative;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayTransactionProductDTOExperience secupayTransactionProductDTOExperience = (SecupayTransactionProductDTOExperience) o;
    return Objects.equals(this.positive, secupayTransactionProductDTOExperience.positive) &&
        Objects.equals(this.negative, secupayTransactionProductDTOExperience.negative);
  }

  @Override
  public int hashCode() {
    return Objects.hash(positive, negative);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayTransactionProductDTOExperience {\n");
    
    sb.append("    positive: ").append(toIndentedString(positive)).append("\n");
    sb.append("    negative: ").append(toIndentedString(negative)).append("\n");
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

