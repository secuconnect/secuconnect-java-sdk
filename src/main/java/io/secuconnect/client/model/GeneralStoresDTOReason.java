package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * GeneralStoresDTOReason
 */
public class GeneralStoresDTOReason {
  @SerializedName("reason")
  private String reason = null;

  public GeneralStoresDTOReason reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Reason
   * @return reason
  **/
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralStoresDTOReason generalStoresDTOReason = (GeneralStoresDTOReason) o;
    return Objects.equals(this.reason, generalStoresDTOReason.reason);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralStoresDTOReason {\n");
    
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
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

