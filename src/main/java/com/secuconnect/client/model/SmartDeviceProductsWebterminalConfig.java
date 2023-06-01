package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartDeviceProductsWebterminalConfigAllowedActions;
import java.util.Objects;

/**
 * SmartDeviceProductsWebterminalConfig
 */
public class SmartDeviceProductsWebterminalConfig {
  @SerializedName("allowed_actions")
  protected SmartDeviceProductsWebterminalConfigAllowedActions allowedActions = null;

  @SerializedName("transactions_grid_enabled")
  protected Boolean transactionsGridEnabled = null;

  public SmartDeviceProductsWebterminalConfig allowedActions(SmartDeviceProductsWebterminalConfigAllowedActions allowedActions) {
    this.allowedActions = allowedActions;
    return this;
  }

   /**
   * Get allowedActions
   * @return allowedActions
  **/
  public SmartDeviceProductsWebterminalConfigAllowedActions getAllowedActions() {
    return allowedActions;
  }

  public void setAllowedActions(SmartDeviceProductsWebterminalConfigAllowedActions allowedActions) {
    this.allowedActions = allowedActions;
  }

  public SmartDeviceProductsWebterminalConfig transactionsGridEnabled(Boolean transactionsGridEnabled) {
    this.transactionsGridEnabled = transactionsGridEnabled;
    return this;
  }

   /**
   * Option enabled or disabled
   * @return transactionsGridEnabled
  **/
  public Boolean getTransactionsGridEnabled() {
    return transactionsGridEnabled;
  }

  public void setTransactionsGridEnabled(Boolean transactionsGridEnabled) {
    this.transactionsGridEnabled = transactionsGridEnabled;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDeviceProductsWebterminalConfig smartDeviceProductsWebterminalConfig = (SmartDeviceProductsWebterminalConfig) o;
    return Objects.equals(this.allowedActions, smartDeviceProductsWebterminalConfig.allowedActions) &&
        Objects.equals(this.transactionsGridEnabled, smartDeviceProductsWebterminalConfig.transactionsGridEnabled);
  }

  @Override
  public int hashCode() {
    return Objects.hash(allowedActions, transactionsGridEnabled);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDeviceProductsWebterminalConfig {\n");
    sb.append("    allowedActions: ").append(toIndentedString(allowedActions)).append("\n");
    sb.append("    transactionsGridEnabled: ").append(toIndentedString(transactionsGridEnabled)).append("\n");
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

