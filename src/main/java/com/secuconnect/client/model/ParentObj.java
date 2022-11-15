package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import java.util.Objects;

/**
 * ParentObj
 */
public class ParentObj {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("trans_id")
  private Integer transId = null;

  @SerializedName("ref_type_id")
  private Integer refTypeId = null;

  @SerializedName("ref_type_raw")
  private String refTypeRaw = null;

  @SerializedName("hierarchy")
  private String hierarchy = null;

  public ParentObj object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Parent object type
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public ParentObj id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Parent object ID
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public ParentObj transId(Integer transId) {
    this.transId = transId;
    return this;
  }

   /**
   * Transaction ID
   * @return transId
  **/
  public Integer getTransId() {
    return transId;
  }

  public void setTransId(Integer transId) {
    this.transId = transId;
  }

  public ParentObj refTypeId(Integer refTypeId) {
    this.refTypeId = refTypeId;
    return this;
  }

   /**
   * Ref type ID
   * @return refTypeId
  **/
  public Integer getRefTypeId() {
    return refTypeId;
  }

  public void setRefTypeId(Integer refTypeId) {
    this.refTypeId = refTypeId;
  }

  public ParentObj refTypeRaw(String refTypeRaw) {
    this.refTypeRaw = refTypeRaw;
    return this;
  }

   /**
   * Ref type name (DE)
   * @return refTypeRaw
  **/
  public String getRefTypeRaw() {
    return refTypeRaw;
  }

  public void setRefTypeRaw(String refTypeRaw) {
    this.refTypeRaw = refTypeRaw;
  }

  public ParentObj hierarchy(String hierarchy) {
    this.hierarchy = hierarchy;
    return this;
  }

   /**
   * Relation direction type (&#x27;child&#x27; or &#x27;parent&#x27;)
   * @return hierarchy
  **/
  public String getHierarchy() {
    return hierarchy;
  }

  public void setHierarchy(String hierarchy) {
    this.hierarchy = hierarchy;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ParentObj parentObj = (ParentObj) o;
    return Objects.equals(this.object, parentObj.object) &&
        Objects.equals(this.id, parentObj.id) &&
        Objects.equals(this.transId, parentObj.transId) &&
        Objects.equals(this.refTypeId, parentObj.refTypeId) &&
        Objects.equals(this.refTypeRaw, parentObj.refTypeRaw) &&
        Objects.equals(this.hierarchy, parentObj.hierarchy);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, transId, refTypeId, refTypeRaw, hierarchy);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ParentObj {\n");
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
    sb.append("    refTypeId: ").append(toIndentedString(refTypeId)).append("\n");
    sb.append("    refTypeRaw: ").append(toIndentedString(refTypeRaw)).append("\n");
    sb.append("    hierarchy: ").append(toIndentedString(hierarchy)).append("\n");
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

