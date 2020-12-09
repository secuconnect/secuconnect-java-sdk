package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * UploadMandateProductModel
 */
public class UploadMandateProductModel {
  @SerializedName("service_issue_id")
  private Integer serviceIssueId = null;

  public UploadMandateProductModel serviceIssueId(Integer serviceIssueId) {
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
    UploadMandateProductModel uploadMandateProductModel = (UploadMandateProductModel) o;
    return Objects.equals(this.serviceIssueId, uploadMandateProductModel.serviceIssueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceIssueId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadMandateProductModel {\n");
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

