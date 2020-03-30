package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * SmartRoutingPriority
 */
public class SmartRoutingPriority {
  @SerializedName("priority")
  private Integer priority = null;

  public SmartRoutingPriority priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Priority
   * @return priority
  **/
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartRoutingPriority smartRoutingPriority = (SmartRoutingPriority) o;
    return Objects.equals(this.priority, smartRoutingPriority.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartRoutingPriority {\n");
    
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

