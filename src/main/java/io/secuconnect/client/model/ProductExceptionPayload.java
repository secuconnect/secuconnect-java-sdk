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
 * Payload of exceptions returned by API
 */
@ApiModel(description = "Payload of exceptions returned by API")
@javax.annotation.Generated(value = "io.swagger.codegen.languages.JavaClientCodegen", date = "2018-08-16T14:16:54.610+02:00")
public class ProductExceptionPayload {
  @SerializedName("status")
  private String status = null;

  @SerializedName("error")
  private String error = null;

  @SerializedName("error_details")
  private String errorDetails = null;

  @SerializedName("error_user")
  private String errorUser = null;

  @SerializedName("code")
  private String code = null;

  @SerializedName("supportId")
  private String supportId = null;

  public ProductExceptionPayload status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Request status (always equals to &#39;error&#39;)
   * @return status
  **/
  @ApiModelProperty(value = "Request status (always equals to 'error')")
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ProductExceptionPayload error(String error) {
    this.error = error;
    return this;
  }

   /**
   * Error type identifier
   * @return error
  **/
  @ApiModelProperty(value = "Error type identifier")
  public String getError() {
    return error;
  }

  public void setError(String error) {
    this.error = error;
  }

  public ProductExceptionPayload errorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
    return this;
  }

   /**
   * Error details
   * @return errorDetails
  **/
  @ApiModelProperty(value = "Error details")
  public String getErrorDetails() {
    return errorDetails;
  }

  public void setErrorDetails(String errorDetails) {
    this.errorDetails = errorDetails;
  }

  public ProductExceptionPayload errorUser(String errorUser) {
    this.errorUser = errorUser;
    return this;
  }

   /**
   * Error details in German
   * @return errorUser
  **/
  @ApiModelProperty(value = "Error details in German")
  public String getErrorUser() {
    return errorUser;
  }

  public void setErrorUser(String errorUser) {
    this.errorUser = errorUser;
  }

  public ProductExceptionPayload code(String code) {
    this.code = code;
    return this;
  }

   /**
   * HTTP code corresponding to error
   * @return code
  **/
  @ApiModelProperty(value = "HTTP code corresponding to error")
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
  }

  public ProductExceptionPayload supportId(String supportId) {
    this.supportId = supportId;
    return this;
  }

   /**
   * ID by which support team can relate error with action(s) that caused it
   * @return supportId
  **/
  @ApiModelProperty(value = "ID by which support team can relate error with action(s) that caused it")
  public String getSupportId() {
    return supportId;
  }

  public void setSupportId(String supportId) {
    this.supportId = supportId;
  }


  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ProductExceptionPayload productExceptionPayload = (ProductExceptionPayload) o;
    return Objects.equals(this.status, productExceptionPayload.status) &&
        Objects.equals(this.error, productExceptionPayload.error) &&
        Objects.equals(this.errorDetails, productExceptionPayload.errorDetails) &&
        Objects.equals(this.errorUser, productExceptionPayload.errorUser) &&
        Objects.equals(this.code, productExceptionPayload.code) &&
        Objects.equals(this.supportId, productExceptionPayload.supportId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(status, error, errorDetails, errorUser, code, supportId);
  }


  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ProductExceptionPayload {\n");
    
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    error: ").append(toIndentedString(error)).append("\n");
    sb.append("    errorDetails: ").append(toIndentedString(errorDetails)).append("\n");
    sb.append("    errorUser: ").append(toIndentedString(errorUser)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
    sb.append("    supportId: ").append(toIndentedString(supportId)).append("\n");
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

