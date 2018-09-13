package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.SmartDevicesProductModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SmartDevicesList
 */
public class SmartDevicesList {
  @SerializedName("count")
  private Integer count = null;

  @SerializedName("data")
  private List<SmartDevicesProductModel> data = null;

  public SmartDevicesList count(Integer count) {
    this.count = count;
    return this;
  }

   /**
   * Number of existing smart devices
   * @return count
  **/
  @ApiModelProperty(value = "Number of existing smart devices")
  public Integer getCount() {
    return count;
  }

  public void setCount(Integer count) {
    this.count = count;
  }

  public SmartDevicesList data(List<SmartDevicesProductModel> data) {
    this.data = data;
    return this;
  }

  public SmartDevicesList addDataItem(SmartDevicesProductModel dataItem) {
    if (this.data == null) {
      this.data = new ArrayList<SmartDevicesProductModel>();
    }
    this.data.add(dataItem);
    return this;
  }

   /**
   * GET Smart/Devices
   * @return data
  **/
  @ApiModelProperty(value = "GET Smart/Devices")
  public List<SmartDevicesProductModel> getData() {
    return data;
  }

  public void setData(List<SmartDevicesProductModel> data) {
    this.data = data;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDevicesList smartDevicesList = (SmartDevicesList) o;
    return Objects.equals(this.count, smartDevicesList.count) &&
        Objects.equals(this.data, smartDevicesList.data);
  }

  @Override
  public int hashCode() {
    return Objects.hash(count, data);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDevicesList {\n");
    
    sb.append("    count: ").append(toIndentedString(count)).append("\n");
    sb.append("    data: ").append(toIndentedString(data)).append("\n");
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

