package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * BackgroundImageOption
 */
public class BackgroundImageOption {
  @SerializedName("enabled")
  protected Boolean enabled = null;

  @SerializedName("image_url")
  protected String imageUrl = null;

  public BackgroundImageOption enabled(Boolean enabled) {
    this.enabled = enabled;
    return this;
  }

   /**
   * Indicator if background image for Payment Link is enabled
   * @return enabled
  **/
  public Boolean getEnabled() {
    return enabled;
  }

  public void setEnabled(Boolean enabled) {
    this.enabled = enabled;
  }

  public BackgroundImageOption imageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
    return this;
  }

   /**
   * The URL to background image for Payment Link
   * @return imageUrl
  **/
  public String getImageUrl() {
    return imageUrl;
  }

  public void setImageUrl(String imageUrl) {
    this.imageUrl = imageUrl;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    BackgroundImageOption backgroundImageOption = (BackgroundImageOption) o;
    return Objects.equals(this.enabled, backgroundImageOption.enabled) &&
        Objects.equals(this.imageUrl, backgroundImageOption.imageUrl);
  }

  @Override
  public int hashCode() {
    return Objects.hash(enabled, imageUrl);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class BackgroundImageOption {\n");
    sb.append("    enabled: ").append(toIndentedString(enabled)).append("\n");
    sb.append("    imageUrl: ").append(toIndentedString(imageUrl)).append("\n");
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

