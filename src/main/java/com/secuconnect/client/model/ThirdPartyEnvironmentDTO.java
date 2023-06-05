package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.ThirdPartyEnvironmentSettingsDTO;
import java.util.Objects;

/**
 * Third-Party environment settings
 */
public class ThirdPartyEnvironmentDTO {
  @SerializedName("live")
  protected ThirdPartyEnvironmentSettingsDTO live = null;

  @SerializedName("sandbox")
  protected ThirdPartyEnvironmentSettingsDTO sandbox = null;

  public ThirdPartyEnvironmentDTO live(ThirdPartyEnvironmentSettingsDTO live) {
    this.live = live;
    return this;
  }

   /**
   * Get live
   * @return live
  **/
  public ThirdPartyEnvironmentSettingsDTO getLive() {
    return live;
  }

  public void setLive(ThirdPartyEnvironmentSettingsDTO live) {
    this.live = live;
  }

  public ThirdPartyEnvironmentDTO sandbox(ThirdPartyEnvironmentSettingsDTO sandbox) {
    this.sandbox = sandbox;
    return this;
  }

   /**
   * Get sandbox
   * @return sandbox
  **/
  public ThirdPartyEnvironmentSettingsDTO getSandbox() {
    return sandbox;
  }

  public void setSandbox(ThirdPartyEnvironmentSettingsDTO sandbox) {
    this.sandbox = sandbox;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ThirdPartyEnvironmentDTO thirdPartyEnvironmentDTO = (ThirdPartyEnvironmentDTO) o;
    return Objects.equals(this.live, thirdPartyEnvironmentDTO.live) &&
        Objects.equals(this.sandbox, thirdPartyEnvironmentDTO.sandbox);
  }

  @Override
  public int hashCode() {
    return Objects.hash(live, sandbox);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyEnvironmentDTO {\n");
    sb.append("    live: ").append(toIndentedString(live)).append("\n");
    sb.append("    sandbox: ").append(toIndentedString(sandbox)).append("\n");
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

