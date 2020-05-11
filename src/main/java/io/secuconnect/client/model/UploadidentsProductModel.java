package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * UploadidentsProductModel
 */
public class UploadidentsProductModel {
  @SerializedName("service_issue_id")
  private Integer serviceIssueId = null;

  public UploadidentsProductModel serviceIssueId(Integer serviceIssueId) {
    this.serviceIssueId = serviceIssueId;
    return this;
  }

   /**
   * Service issue id
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
    UploadidentsProductModel uploadidentsProductModel = (UploadidentsProductModel) o;
    return Objects.equals(this.serviceIssueId, uploadidentsProductModel.serviceIssueId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(serviceIssueId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class UploadidentsProductModel {\n");
    
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

