package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyMerchantcardsDTOLock
 */
public class LoyaltyMerchantcardsDTOLock {
  @SerializedName("reason")
  protected Integer reason = null;

  @SerializedName("note")
  protected String note = null;

  @SerializedName("csc")
  protected String csc = null;

  public LoyaltyMerchantcardsDTOLock reason(Integer reason) {
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

  public LoyaltyMerchantcardsDTOLock note(String note) {
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

  public LoyaltyMerchantcardsDTOLock csc(String csc) {
    this.csc = csc;
    return this;
  }

   /**
   * Card Security Code (optional in the most cases)
   * @return csc
  **/
  public String getCsc() {
    return csc;
  }

  public void setCsc(String csc) {
    this.csc = csc;
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
    return Objects.equals(this.reason, loyaltyMerchantcardsDTOLock.reason) &&
        Objects.equals(this.note, loyaltyMerchantcardsDTOLock.note) &&
        Objects.equals(this.csc, loyaltyMerchantcardsDTOLock.csc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(reason, note, csc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsDTOLock {\n");
    sb.append("    reason: ").append(toIndentedString(reason)).append("\n");
    sb.append("    note: ").append(toIndentedString(note)).append("\n");
    sb.append("    csc: ").append(toIndentedString(csc)).append("\n");
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

