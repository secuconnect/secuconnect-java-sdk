package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.SmartTransactionsTimeSlot;
import java.util.Objects;

/**
 * SmartTransactionsCollectionModel
 */
public class SmartTransactionsCollectionModel implements OneOfSmartTransactionsDeliveryOptionsModel {
  @SerializedName("type")
  protected String type = null;

  @SerializedName("scheduled_slot")
  protected SmartTransactionsTimeSlot scheduledSlot = null;

  @SerializedName("store_id")
  protected String storeId = null;

  @SerializedName("delivered_at")
  protected String deliveredAt = null;

  @SerializedName("code")
  protected String code = null;

  public SmartTransactionsCollectionModel type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Delivery type:  - &#x60;\&quot;shipping\&quot;&#x60; - &#x60;\&quot;collection\&quot;&#x60;
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SmartTransactionsCollectionModel scheduledSlot(SmartTransactionsTimeSlot scheduledSlot) {
    this.scheduledSlot = scheduledSlot;
    return this;
  }

   /**
   * Get scheduledSlot
   * @return scheduledSlot
  **/
  public SmartTransactionsTimeSlot getScheduledSlot() {
    return scheduledSlot;
  }

  public void setScheduledSlot(SmartTransactionsTimeSlot scheduledSlot) {
    this.scheduledSlot = scheduledSlot;
  }

  public SmartTransactionsCollectionModel storeId(String storeId) {
    this.storeId = storeId;
    return this;
  }

   /**
   * Store ID
   * @return storeId
  **/
  public String getStoreId() {
    return storeId;
  }

  public void setStoreId(String storeId) {
    this.storeId = storeId;
  }

  public SmartTransactionsCollectionModel deliveredAt(String deliveredAt) {
    this.deliveredAt = deliveredAt;
    return this;
  }

   /**
   * Delivered at (ISO 8601 date and time)
   * @return deliveredAt
  **/
  public String getDeliveredAt() {
    return deliveredAt;
  }

  public void setDeliveredAt(String deliveredAt) {
    this.deliveredAt = deliveredAt;
  }

   /**
   * Confirmation code for pickup
   * @return code
  **/
  public String getCode() {
    return code;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsCollectionModel smartTransactionsCollectionModel = (SmartTransactionsCollectionModel) o;
    return Objects.equals(this.type, smartTransactionsCollectionModel.type) &&
        Objects.equals(this.scheduledSlot, smartTransactionsCollectionModel.scheduledSlot) &&
        Objects.equals(this.storeId, smartTransactionsCollectionModel.storeId) &&
        Objects.equals(this.deliveredAt, smartTransactionsCollectionModel.deliveredAt) &&
        Objects.equals(this.code, smartTransactionsCollectionModel.code);
  }

  @Override
  public int hashCode() {
    return Objects.hash(type, scheduledSlot, storeId, deliveredAt, code);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsCollectionModel {\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    scheduledSlot: ").append(toIndentedString(scheduledSlot)).append("\n");
    sb.append("    storeId: ").append(toIndentedString(storeId)).append("\n");
    sb.append("    deliveredAt: ").append(toIndentedString(deliveredAt)).append("\n");
    sb.append("    code: ").append(toIndentedString(code)).append("\n");
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

