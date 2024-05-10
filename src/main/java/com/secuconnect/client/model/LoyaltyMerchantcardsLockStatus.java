package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyMerchantcardsGetLock
 */
public class LoyaltyMerchantcardsLockStatus {
  @SerializedName("lock_status")
  protected String lockStatus = null;

  @SerializedName("reason")
  protected Integer reason = null;

  @SerializedName("note")
  protected String note = null;

  public LoyaltyMerchantcardsLockStatus lockStatus(String lockStatus) {
    this.lockStatus = lockStatus;
    return this;
  }

   /**
   * Lock status:  - &#x60;\&quot;locked\&quot;&#x60; - &#x60;\&quot;unlocked\&quot;&#x60;
   * @return lockStatus
  **/
  public String getLockStatus() {
    return lockStatus;
  }

  public void setLockStatus(String lockStatus) {
    this.lockStatus = lockStatus;
  }

  public LoyaltyMerchantcardsLockStatus reason(Integer reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Lock reason:  - &#x60;1&#x60; &#x3D; Lost - &#x60;2&#x60; &#x3D; Defect - &#x60;3&#x60; &#x3D; Claims, - &#x60;6&#x60; &#x3D; Expired - &#x60;8&#x60; &#x3D; Not activated
   * @return reason
  **/
  public Integer getReason() {
    return reason;
  }

  public void setReason(Integer reason) {
    this.reason = reason;
  }

  public LoyaltyMerchantcardsLockStatus note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Human readable note
   * @return note
  **/
  public String getNote() {
    return note;
  }

  public void setNote(String note) {
    this.note = note;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyMerchantcardsLockStatus loyaltyMerchantcardsLockStatus = (LoyaltyMerchantcardsLockStatus) o;
    return Objects.equals(this.lockStatus, loyaltyMerchantcardsLockStatus.lockStatus) &&
        Objects.equals(this.reason, loyaltyMerchantcardsLockStatus.reason) &&
        Objects.equals(this.note, loyaltyMerchantcardsLockStatus.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lockStatus, reason, note);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsLockStatus {\n");
    sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
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

