package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * LoyaltyMerchantcardsDTOLock
 */
public class LoyaltyMerchantcardsDTOLock {
  @SerializedName("lock_status")
  private String lockStatus = null;

  @SerializedName("reason")
  private String reason = null;

  @SerializedName("note")
  private String note = null;

  public LoyaltyMerchantcardsDTOLock lockStatus(String lockStatus) {
    this.lockStatus = lockStatus;
    return this;
  }

   /**
   * Lock status
   * @return lockStatus
  **/
  public String getLockStatus() {
    return lockStatus;
  }

  public void setLockStatus(String lockStatus) {
    this.lockStatus = lockStatus;
  }

  public LoyaltyMerchantcardsDTOLock reason(String reason) {
    this.reason = reason;
    return this;
  }

   /**
   * Lock reason
   * @return reason
  **/
  public String getReason() {
    return reason;
  }

  public void setReason(String reason) {
    this.reason = reason;
  }

  public LoyaltyMerchantcardsDTOLock note(String note) {
    this.note = note;
    return this;
  }

   /**
   * Lock note
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
    LoyaltyMerchantcardsDTOLock loyaltyMerchantcardsDTOLock = (LoyaltyMerchantcardsDTOLock) o;
    return Objects.equals(this.lockStatus, loyaltyMerchantcardsDTOLock.lockStatus) &&
        Objects.equals(this.reason, loyaltyMerchantcardsDTOLock.reason) &&
        Objects.equals(this.note, loyaltyMerchantcardsDTOLock.note);
  }

  @Override
  public int hashCode() {
    return Objects.hash(lockStatus, reason, note);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsDTOLock {\n");
    
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

