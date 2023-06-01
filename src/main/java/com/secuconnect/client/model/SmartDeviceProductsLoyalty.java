package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartDeviceProductsEnabledWithTid;
import com.secuconnect.client.model.SmartDeviceProductsWebterminalConfig;
import java.util.Objects;

/**
 * SmartDeviceProductsLoyalty
 */
public class SmartDeviceProductsLoyalty extends SmartDeviceProductsEnabledWithTid {
  @SerializedName("webterminal_config")
  protected SmartDeviceProductsWebterminalConfig webterminalConfig = null;

  public SmartDeviceProductsLoyalty webterminalConfig(SmartDeviceProductsWebterminalConfig webterminalConfig) {
    this.webterminalConfig = webterminalConfig;
    return this;
  }

   /**
   * Get webterminalConfig
   * @return webterminalConfig
  **/
  public SmartDeviceProductsWebterminalConfig getWebterminalConfig() {
    return webterminalConfig;
  }

  public void setWebterminalConfig(SmartDeviceProductsWebterminalConfig webterminalConfig) {
    this.webterminalConfig = webterminalConfig;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDeviceProductsLoyalty smartDeviceProductsLoyalty = (SmartDeviceProductsLoyalty) o;
    return Objects.equals(this.webterminalConfig, smartDeviceProductsLoyalty.webterminalConfig) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(webterminalConfig, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDeviceProductsLoyalty {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    webterminalConfig: ").append(toIndentedString(webterminalConfig)).append("\n");
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

