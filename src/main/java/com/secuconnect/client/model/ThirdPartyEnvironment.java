package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.ThirdPartyEnvironmentSettings;
import java.util.Objects;

/**
 * ThirdPartyEnvironment
 */
public class ThirdPartyEnvironment {
  @SerializedName("live")
  protected ThirdPartyEnvironmentSettings live = null;

  @SerializedName("sandbox")
  protected ThirdPartyEnvironmentSettings sandbox = null;

  public ThirdPartyEnvironment live(ThirdPartyEnvironmentSettings live) {
    this.live = live;
    return this;
  }

   /**
   * Get live
   * @return live
  **/
  public ThirdPartyEnvironmentSettings getLive() {
    return live;
  }

  public void setLive(ThirdPartyEnvironmentSettings live) {
    this.live = live;
  }

  public ThirdPartyEnvironment sandbox(ThirdPartyEnvironmentSettings sandbox) {
    this.sandbox = sandbox;
    return this;
  }

   /**
   * Get sandbox
   * @return sandbox
  **/
  public ThirdPartyEnvironmentSettings getSandbox() {
    return sandbox;
  }

  public void setSandbox(ThirdPartyEnvironmentSettings sandbox) {
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
    ThirdPartyEnvironment thirdPartyEnvironment = (ThirdPartyEnvironment) o;
    return Objects.equals(this.live, thirdPartyEnvironment.live) &&
        Objects.equals(this.sandbox, thirdPartyEnvironment.sandbox);
  }

  @Override
  public int hashCode() {
    return Objects.hash(live, sandbox);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ThirdPartyEnvironment {\n");
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

