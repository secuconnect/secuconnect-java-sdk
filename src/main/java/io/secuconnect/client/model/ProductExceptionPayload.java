package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Payload of exceptions returned by the API
 */
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
   * Request status (always &#x27;error&#x27;)
   * @return status
  **/
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
  public String getSupportId() {
    return supportId;
  }

  public void setSupportId(String supportId) {
    this.supportId = supportId;
  }

  @Override
  public boolean equals(Object o) {
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
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

