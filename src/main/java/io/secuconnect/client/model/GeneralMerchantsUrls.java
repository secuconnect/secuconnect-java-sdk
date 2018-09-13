package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/**
 * GeneralMerchantsUrls
 */
public class GeneralMerchantsUrls {
  @SerializedName("type")
  private String type = null;

  @SerializedName("url")
  private String url = null;

  public GeneralMerchantsUrls type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of urls
   * @return type
  **/
  @ApiModelProperty(value = "Type of urls")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GeneralMerchantsUrls url(String url) {
    this.url = url;
    return this;
  }

   /**
   * Url
   * @return url
  **/
  @ApiModelProperty(value = "Url")
  public String getUrl() {
    return url;
  }

  public void setUrl(String url) {
    this.url = url;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralMerchantsUrls generalMerchantsUrls = (GeneralMerchantsUrls) o;
    return Objects.equals(this.type, generalMerchantsUrls.type) &&
        Objects.equals(this.url, generalMerchantsUrls.url);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, url);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralMerchantsUrls {\n");
    
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    url: ").append(toIndentedString(url)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

