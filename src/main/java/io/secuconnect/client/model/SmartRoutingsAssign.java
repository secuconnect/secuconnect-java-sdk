package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.util.Objects;

/**
 * SmartRoutingsAssign
 */
public class SmartRoutingsAssign {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("description")
  private String description = null;

  @SerializedName("priority")
  private Integer priority = null;

  public SmartRoutingsAssign object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of smart routing assign
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public SmartRoutingsAssign id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of smart routing assign
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SmartRoutingsAssign type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SmartRoutingsAssign description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SmartRoutingsAssign priority(Integer priority) {
    this.priority = priority;
    return this;
  }

   /**
   * Priority
   * @return priority
  **/
  public Integer getPriority() {
    return priority;
  }

  public void setPriority(Integer priority) {
    this.priority = priority;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartRoutingsAssign smartRoutingsAssign = (SmartRoutingsAssign) o;
    return Objects.equals(this.object, smartRoutingsAssign.object) &&
        Objects.equals(this.id, smartRoutingsAssign.id) &&
        Objects.equals(this.type, smartRoutingsAssign.type) &&
        Objects.equals(this.description, smartRoutingsAssign.description) &&
        Objects.equals(this.priority, smartRoutingsAssign.priority);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, type, description, priority);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartRoutingsAssign {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    priority: ").append(toIndentedString(priority)).append("\n");
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

