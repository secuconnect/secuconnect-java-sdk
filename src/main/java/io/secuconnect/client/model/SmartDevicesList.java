package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.SmartDevicesProductModel;
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
   * SmartDevicesList
   * @return data
  **/
  public List<SmartDevicesProductModel> getData() {
    return data;
  }

  public void setData(List<SmartDevicesProductModel> data) {
    this.data = data;
  }

  @Override
  public boolean equals(Object o) {
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
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

