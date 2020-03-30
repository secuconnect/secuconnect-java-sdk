package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * SmartDeviceProductsEnabled
 */
public class SmartDeviceProductsEnabled {
  @SerializedName("enabled")
  private Boolean enabled = null;

  public SmartDeviceProductsEnabled enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Enabled
   * @return enabled
  **/
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDeviceProductsEnabled smartDeviceProductsEnabled = (SmartDeviceProductsEnabled) o;
    return Objects.equals(this.enabled, smartDeviceProductsEnabled.enabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDeviceProductsEnabled {\n");
    
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
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

