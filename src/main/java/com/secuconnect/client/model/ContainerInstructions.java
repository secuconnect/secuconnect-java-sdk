package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Instructions for additional actions of creditcard payment container
 */
public class ContainerInstructions {
  @SerializedName("request_token")
  protected Boolean requestToken = null;

  @SerializedName("notification_url")
  protected String notificationUrl = null;

  public ContainerInstructions requestToken(Boolean requestToken) {
    this.requestToken = requestToken;
    return this;
  }

   /**
   * Whether to create a network token for container or not
   * @return requestToken
  **/
  public Boolean getRequestToken() {
    return requestToken;
  }

  public void setRequestToken(Boolean requestToken) {
    this.requestToken = requestToken;
  }

  public ContainerInstructions notificationUrl(String notificationUrl) {
    this.notificationUrl = notificationUrl;
    return this;
  }

   /**
   * Shop URL for status pushes of updated payment container with network token (server-to-server callback)
   * @return notificationUrl
  **/
  public String getNotificationUrl() {
    return notificationUrl;
  }

  public void setNotificationUrl(String notificationUrl) {
    this.notificationUrl = notificationUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ContainerInstructions containerInstructions = (ContainerInstructions) o;
    return Objects.equals(this.requestToken, containerInstructions.requestToken) &&
        Objects.equals(this.notificationUrl, containerInstructions.notificationUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(requestToken, notificationUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ContainerInstructions {\n");
    sb.append("    requestToken: ").append(toIndentedString(requestToken)).append("\n");
    sb.append("    notificationUrl: ").append(toIndentedString(notificationUrl)).append("\n");
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

