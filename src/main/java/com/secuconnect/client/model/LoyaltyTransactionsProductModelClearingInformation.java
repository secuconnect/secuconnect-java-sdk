package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyTransactionsProductModelClearingInformation
 */
public class LoyaltyTransactionsProductModelClearingInformation {
  @SerializedName("object")
  protected String object = null;

  @SerializedName("id")
  protected String id = null;

  @SerializedName("date")
  protected String date = null;

  public LoyaltyTransactionsProductModelClearingInformation object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object type
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public LoyaltyTransactionsProductModelClearingInformation id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Object ID
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LoyaltyTransactionsProductModelClearingInformation date(String date) {
    this.date = date;
    return this;
  }

   /**
   * Get date
   * @return date
  **/
  public String getDate() {
    return date;
  }

  public void setDate(String date) {
    this.date = date;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyTransactionsProductModelClearingInformation loyaltyTransactionsProductModelClearingInformation = (LoyaltyTransactionsProductModelClearingInformation) o;
    return Objects.equals(this.object, loyaltyTransactionsProductModelClearingInformation.object) &&
        Objects.equals(this.id, loyaltyTransactionsProductModelClearingInformation.id) &&
        Objects.equals(this.date, loyaltyTransactionsProductModelClearingInformation.date);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, date);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyTransactionsProductModelClearingInformation {\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    date: ").append(toIndentedString(date)).append("\n");
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

