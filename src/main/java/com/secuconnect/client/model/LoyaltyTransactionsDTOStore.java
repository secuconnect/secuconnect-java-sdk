package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * LoyaltyTransactionsDTOStore
 */
public class LoyaltyTransactionsDTOStore {
  @SerializedName("id")
  private String id = null;

  @SerializedName("name")
  private String name = null;

  public LoyaltyTransactionsDTOStore id(String id) {
    this.id = id;
    return this;
  }

   /**
   * General Store id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LoyaltyTransactionsDTOStore name(String name) {
    this.name = name;
    return this;
  }

   /**
   * General Store Name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyTransactionsDTOStore loyaltyTransactionsDTOStore = (LoyaltyTransactionsDTOStore) o;
    return Objects.equals(this.id, loyaltyTransactionsDTOStore.id) &&
        Objects.equals(this.name, loyaltyTransactionsDTOStore.name);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, name);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyTransactionsDTOStore {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
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

