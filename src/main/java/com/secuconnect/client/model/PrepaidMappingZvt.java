package com.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import com.secuconnect.client.model.PrepaidMappingZvtItem;
import java.io.IOException;

/**
 * PrepaidMappingZvt
 */
public class PrepaidMappingZvt {
  @SerializedName("item")
  private PrepaidMappingZvtItem item = null;

  @SerializedName("vtc_id")
  private String vtcId = null;

  public PrepaidMappingZvt item(PrepaidMappingZvtItem item) {
    this.item = item;
    return this;
  }

   /**
   * Get item
   * @return item
  **/
  public PrepaidMappingZvtItem getItem() {
    return item;
  }

  public void setItem(PrepaidMappingZvtItem item) {
    this.item = item;
  }

  public PrepaidMappingZvt vtcId(String vtcId) {
    this.vtcId = vtcId;
    return this;
  }

   /**
   * Vtc id
   * @return vtcId
  **/
  public String getVtcId() {
    return vtcId;
  }

  public void setVtcId(String vtcId) {
    this.vtcId = vtcId;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PrepaidMappingZvt prepaidMappingZvt = (PrepaidMappingZvt) o;
    return Objects.equals(this.item, prepaidMappingZvt.item) &&
        Objects.equals(this.vtcId, prepaidMappingZvt.vtcId);
  }

  @Override
  public int hashCode() {
    return Objects.hash(item, vtcId);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PrepaidMappingZvt {\n");
    
    sb.append("    item: ").append(toIndentedString(item)).append("\n");
    sb.append("    vtcId: ").append(toIndentedString(vtcId)).append("\n");
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

