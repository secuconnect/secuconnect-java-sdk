package io.secuconnect.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * RawMerchantcardId
 */
public class RawMerchantcardId {
  @SerializedName("result")
  private String result = null;

  public RawMerchantcardId result(String result) {
    this.result = result;
    return this;
  }

   /**
   * Result contains raw merchant card id or null
   * @return result
  **/
  public String getResult() {
    return result;
  }

  public void setResult(String result) {
    this.result = result;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    RawMerchantcardId rawMerchantcardId = (RawMerchantcardId) o;
    return Objects.equals(this.result, rawMerchantcardId.result);
  }

  @Override
  public int hashCode() {
    return Objects.hash(result);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class RawMerchantcardId {\n");
    
    sb.append("    result: ").append(toIndentedString(result)).append("\n");
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

