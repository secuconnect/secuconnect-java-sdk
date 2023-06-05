package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.CheckoutConfigurationNotifications;
import java.util.Objects;

/**
 * General checkout settings
 */
public class CheckoutConfiguration {
  @SerializedName("notifications")
  protected CheckoutConfigurationNotifications notifications = null;

  public CheckoutConfiguration notifications(CheckoutConfigurationNotifications notifications) {
    this.notifications = notifications;
    return this;
  }

   /**
   * Get notifications
   * @return notifications
  **/
  public CheckoutConfigurationNotifications getNotifications() {
    return notifications;
  }

  public void setNotifications(CheckoutConfigurationNotifications notifications) {
    this.notifications = notifications;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CheckoutConfiguration checkoutConfiguration = (CheckoutConfiguration) o;
    return Objects.equals(this.notifications, checkoutConfiguration.notifications);
  }

  @Override
  public int hashCode() {
    return Objects.hash(notifications);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CheckoutConfiguration {\n");
    sb.append("    notifications: ").append(toIndentedString(notifications)).append("\n");
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

