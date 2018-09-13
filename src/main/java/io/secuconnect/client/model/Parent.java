/*
 * SecuConnect API
 * No description provided (generated by Swagger Codegen https://github.com/swagger-api/swagger-codegen)
 *
 * OpenAPI spec version: 2.0.0
 * 
 *
 * NOTE: This class is auto generated by the swagger code generator program.
 * https://github.com/swagger-api/swagger-codegen.git
 * Do not edit the class manually.
 */


package io.secuconnect.client.model;

import java.util.Objects;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;

/**
 * Parent
 */
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-16T14:16:54.610+02:00")
public class Parent {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("type")
  private String type = null;

  public Parent object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of parent
   * @return object
  **/
  @ApiModelProperty(value = "Object of parent")
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public Parent id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of parent
   * @return id
  **/
  @ApiModelProperty(value = "Id of parent")
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public Parent type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of parent
   * @return type
  **/
  @ApiModelProperty(value = "Type of parent")
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    Parent parent = (Parent) o;
    return Objects.equals(this.object, parent.object) &&
        Objects.equals(this.id, parent.id) &&
        Objects.equals(this.type, parent.type);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, type);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class Parent {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces
   * (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
  
}

