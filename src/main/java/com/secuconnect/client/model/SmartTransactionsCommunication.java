package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * Send an email with execution of the Smart Transaction; loyalty card only
 */
public class SmartTransactionsCommunication {
  @SerializedName("action_type")
  protected String actionType = null;

  @SerializedName("template_id")
  protected String templateId = null;

  public SmartTransactionsCommunication actionType(String actionType) {
    this.actionType = actionType;
    return this;
  }

   /**
   * On which action the email shall be sent
   * @return actionType
  **/
  public String getActionType() {
    return actionType;
  }

  public void setActionType(String actionType) {
    this.actionType = actionType;
  }

  public SmartTransactionsCommunication templateId(String templateId) {
    this.templateId = templateId;
    return this;
  }

   /**
   * Template ID
   * @return templateId
  **/
  public String getTemplateId() {
    return templateId;
  }

  public void setTemplateId(String templateId) {
    this.templateId = templateId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsCommunication smartTransactionsCommunication = (SmartTransactionsCommunication) o;
    return Objects.equals(this.actionType, smartTransactionsCommunication.actionType) &&
        Objects.equals(this.templateId, smartTransactionsCommunication.templateId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(actionType, templateId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsCommunication {\n");
    sb.append("    actionType: ").append(toIndentedString(actionType)).append("\n");
    sb.append("    templateId: ").append(toIndentedString(templateId)).append("\n");
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

