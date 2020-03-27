package com.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.io.IOException;

/**
 * SmartTransactionsBasketText
 */
public class SmartTransactionsBasketText {
  @SerializedName("id")
  private Integer id = null;

  @SerializedName("parent")
  private Integer parent = null;

  @SerializedName("desc")
  private String desc = null;

  public SmartTransactionsBasketText id(Integer id) {
    this.id = id;
    return this;
  }

   /**
   * Text id
   * @return id
  **/
  public Integer getId() {
    return id;
  }

  public void setId(Integer id) {
    this.id = id;
  }

  public SmartTransactionsBasketText parent(Integer parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Parent
   * @return parent
  **/
  public Integer getParent() {
    return parent;
  }

  public void setParent(Integer parent) {
    this.parent = parent;
  }

  public SmartTransactionsBasketText desc(String desc) {
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsBasketText smartTransactionsBasketText = (SmartTransactionsBasketText) o;
    return Objects.equals(this.id, smartTransactionsBasketText.id) &&
        Objects.equals(this.parent, smartTransactionsBasketText.parent) &&
        Objects.equals(this.desc, smartTransactionsBasketText.desc);
  }

  @Override
  public int hashCode() {
    return Objects.hash(id, parent, desc);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsBasketText {\n");
    
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
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

