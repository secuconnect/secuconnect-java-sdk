package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyMerchantcardsLockReasons
 */
public class LoyaltyMerchantcardsLockReasons {
  @SerializedName("id")
  protected Integer id = null;

  @SerializedName("desc")
  protected String desc = null;

  public LoyaltyMerchantcardsLockReasons id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Get id
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public LoyaltyMerchantcardsLockReasons desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Lock reason (in German)
   * @return desc
  **/
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyMerchantcardsLockReasons loyaltyMerchantcardsLockReasons = (LoyaltyMerchantcardsLockReasons) o;
    return Objects.equals(this.id, loyaltyMerchantcardsLockReasons.id) &&
        Objects.equals(this.desc, loyaltyMerchantcardsLockReasons.desc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, desc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsLockReasons {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
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

