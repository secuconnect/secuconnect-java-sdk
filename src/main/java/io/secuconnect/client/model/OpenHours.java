package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.DayTime;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

/**
 * Open hours
 */
@ApiModel(description = "Open hours")
public class OpenHours {
  @SerializedName("open")
  private DayTime open = null;

  @SerializedName("close")
  private DayTime close = null;

  public OpenHours open(DayTime open) {
    this.open = open;
    return this;
  }

   /**
   * Open
   * @return open
  **/
  @ApiModelProperty(value = "Open")
  public DayTime getOpen() {
    return open;
  }

  public void setOpen(DayTime open) {
    this.open = open;
  }

  public OpenHours close(DayTime close) {
    this.close = close;
    return this;
  }

   /**
   * Close
   * @return close
  **/
  @ApiModelProperty(value = "Close")
  public DayTime getClose() {
    return close;
  }

  public void setClose(DayTime close) {
    this.close = close;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    OpenHours openHours = (OpenHours) o;
    return Objects.equals(this.open, openHours.open) &&
        Objects.equals(this.close, openHours.close);
  }

  @Override
  public int hashCode() {
    return Objects.hash(open, close);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class OpenHours {\n");
    
    sb.append("    open: ").append(toIndentedString(open)).append("\n");
    sb.append("    close: ").append(toIndentedString(close)).append("\n");
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

