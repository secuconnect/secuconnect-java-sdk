package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * SmartTransactionsBasketProductGroup
 */
public class SmartTransactionsBasketProductGroup {
  @SerializedName("id")
  private String id = null;

  @SerializedName("desc")
  private String desc = null;

  @SerializedName("level")
  private Integer level = null;

  public SmartTransactionsBasketProductGroup id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Group id
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SmartTransactionsBasketProductGroup desc(String desc) {
    this.desc = desc;
    return this;
  }

   /**
   * Desc
   * @return desc
  **/
  public String getDesc() {
    return desc;
  }

  public void setDesc(String desc) {
    this.desc = desc;
  }

  public SmartTransactionsBasketProductGroup level(Integer level) {
    this.level = level;
    return this;
  }

   /**
   * Level
   * @return level
  **/
  public Integer getLevel() {
    return level;
  }

  public void setLevel(Integer level) {
    this.level = level;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsBasketProductGroup smartTransactionsBasketProductGroup = (SmartTransactionsBasketProductGroup) o;
    return Objects.equals(this.id, smartTransactionsBasketProductGroup.id) &&
        Objects.equals(this.desc, smartTransactionsBasketProductGroup.desc) &&
        Objects.equals(this.level, smartTransactionsBasketProductGroup.level);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, desc, level);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsBasketProductGroup {\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    desc: ").append(toIndentedString(desc)).append("\n");
    sb.append("    level: ").append(toIndentedString(level)).append("\n");
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

