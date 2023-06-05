package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Third-Party environment settings
 */
public class ThirdPartyEnvironmentSettingsDTO {
  @SerializedName("client_id")
  protected String clientId = null;

  @SerializedName("client_secret")
  protected String clientSecret = null;

  public ThirdPartyEnvironmentSettingsDTO clientId(String clientId) {
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

  public ThirdPartyEnvironmentSettingsDTO clientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
    return this;
  }

   /**
   * Get clientSecret
   * @return clientSecret
  **/
  public String getClientSecret() {
    return clientSecret;
  }

  public void setClientSecret(String clientSecret) {
    this.clientSecret = clientSecret;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThirdPartyEnvironmentSettingsDTO thirdPartyEnvironmentSettingsDTO = (ThirdPartyEnvironmentSettingsDTO) o;
    return Objects.equals(this.clientId, thirdPartyEnvironmentSettingsDTO.clientId) &&
        Objects.equals(this.clientSecret, thirdPartyEnvironmentSettingsDTO.clientSecret);
  }

  @Override
  public int hashCode() {
    return Objects.hash(clientId, clientSecret);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyEnvironmentSettingsDTO {\n");
    sb.append("    clientId: ").append(toIndentedString(clientId)).append("\n");
    sb.append("    clientSecret: ").append(toIndentedString(clientSecret)).append("\n");
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

