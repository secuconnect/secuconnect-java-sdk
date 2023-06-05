package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Third-Party environment settings
 */
public class ThirdPartyEnvironmentSettings {
  @SerializedName("client_id")
  protected String clientId = null;

  public ThirdPartyEnvironmentSettings clientId(String clientId) {
    this.clientId = clientId;
    return this;
  }

   /**
   * Get clientId
   * @return clientId
  **/
  public String getClientId() {
    return clientId;
  }

  public void setClientId(String clientId) {
    this.clientId = clientId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThirdPartyEnvironmentSettings thirdPartyEnvironmentSettings = (ThirdPartyEnvironmentSettings) o;
    return Objects.equals(this.clientId, thirdPartyEnvironmentSettings.clientId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyEnvironmentSettings {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
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

