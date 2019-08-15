package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SmartDevicesSecubaseConfigLoggingFileNet
 */
public class SmartDevicesSecubaseConfigLoggingFileNet {
  @SerializedName("file")
  private List<String> file = null;

  @SerializedName("net")
  private List<String> net = null;

  public SmartDevicesSecubaseConfigLoggingFileNet file(List<String> file) {
    this.file = file;
    return this;
  }

  public SmartDevicesSecubaseConfigLoggingFileNet addFileItem(String fileItem) {
    if (this.file == null) {
      this.file = new ArrayList<String>();
    }
    this.file.add(fileItem);
    return this;
  }

   /**
   * File
   * @return file
  **/
  public List<String> getFile() {
    return file;
  }

  public void setFile(List<String> file) {
    this.file = file;
  }

  public SmartDevicesSecubaseConfigLoggingFileNet net(List<String> net) {
    this.net = net;
    return this;
  }

  public SmartDevicesSecubaseConfigLoggingFileNet addNetItem(String netItem) {
    if (this.net == null) {
      this.net = new ArrayList<String>();
    }
    this.net.add(netItem);
    return this;
  }

   /**
   * Net
   * @return net
  **/
  public List<String> getNet() {
    return net;
  }

  public void setNet(List<String> net) {
    this.net = net;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartDevicesSecubaseConfigLoggingFileNet smartDevicesSecubaseConfigLoggingFileNet = (SmartDevicesSecubaseConfigLoggingFileNet) o;
    return Objects.equals(this.file, smartDevicesSecubaseConfigLoggingFileNet.file) &&
        Objects.equals(this.net, smartDevicesSecubaseConfigLoggingFileNet.net);
  }

  @Override
  public int hashCode() {
    return Objects.hash(file, net);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartDevicesSecubaseConfigLoggingFileNet {\n");
    
    sb.append("    file: ").append(toIndentedString(file)).append("\n");
    sb.append("    net: ").append(toIndentedString(net)).append("\n");
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

