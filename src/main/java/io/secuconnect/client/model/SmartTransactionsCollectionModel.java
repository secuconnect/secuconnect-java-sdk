package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.SmartTransactionsTimeSlot;
import java.util.Objects;

/**
 * SmartTransactionsCollectionModel
 */
public class SmartTransactionsCollectionModel implements OneOfSmartTransactionsDeliveryOptionsModel {
  @SerializedName("type")
  private String type = null;

  @SerializedName("scheduled_slot")
  private SmartTransactionsTimeSlot scheduledSlot = null;

  @SerializedName("store_id")
  private String storeId = null;

  @SerializedName("delivered_at")
  private String deliveredAt = null;

  @SerializedName("code")
  private String code = null;

  public SmartTransactionsCollectionModel type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of delivery option
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
   * Delivered at
   * @return deliveredAt
  **/
  public String getDeliveredAt() {
    return deliveredAt;
  }

  public void setDeliveredAt(String deliveredAt) {
    this.deliveredAt = deliveredAt;
  }

  public SmartTransactionsCollectionModel code(String code) {
    this.code = code;
    return this;
  }

   /**
   * confirmation code to pickup the collection
   * @return code
  **/
  public String getCode() {
    return code;
  }

  public void setCode(String code) {
    this.code = code;
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

