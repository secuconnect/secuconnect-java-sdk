package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * UploadmandateProductModel
 */
public class UploadmandateProductModel {
  @SerializedName("service_issue_id")
  private Integer serviceIssueId = null;

  public UploadmandateProductModel serviceIssueId(Integer serviceIssueId) {
    this.serviceIssueId = serviceIssueId;
    return this;
  }

   /**
   * Newly created issue id
   * @return serviceIssueId
  **/
  public Integer getServiceIssueId() {
    return serviceIssueId;
  }

  public void setServiceIssueId(Integer serviceIssueId) {
    this.serviceIssueId = serviceIssueId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    UploadmandateProductModel uploadmandateProductModel = (UploadmandateProductModel) o;
    return Objects.equals(this.serviceIssueId, uploadmandateProductModel.serviceIssueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceIssueId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadmandateProductModel {\n");
    
    sb.append("    serviceIssueId: ").append(toIndentedString(serviceIssueId)).append("\n");
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

