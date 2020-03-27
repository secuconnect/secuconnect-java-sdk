package io.secuconnect.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * SmartTransactionsIdent
 */
public class SmartTransactionsIdent {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("prefix")
  private String prefix = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("value")
  private String value = null;

  @SerializedName("valid")
  private Boolean valid = null;

  @SerializedName("merchantcard")
  private LoyaltyMerchantcardsProductModel merchantcard = null;

  public SmartTransactionsIdent object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of smart transaction ident
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public SmartTransactionsIdent id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of smart transaction ident
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public SmartTransactionsIdent prefix(String prefix) {
    this.prefix = prefix;
    return this;
  }

   /**
   * Prefix
   * @return prefix
  **/
  public String getPrefix() {
    return prefix;
  }

  public void setPrefix(String prefix) {
    this.prefix = prefix;
  }

  public SmartTransactionsIdent name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SmartTransactionsIdent type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public SmartTransactionsIdent value(String value) {
    this.value = value;
    return this;
  }

   /**
   * Value
   * @return value
  **/
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public SmartTransactionsIdent valid(Boolean valid) {
    this.valid = valid;
    return this;
  }

   /**
   * Valid
   * @return valid
  **/
  public Boolean isValid() {
    return valid;
  }

  public void setValid(Boolean valid) {
    this.valid = valid;
  }

  public SmartTransactionsIdent merchantcard(LoyaltyMerchantcardsProductModel merchantcard) {
    this.merchantcard = merchantcard;
    return this;
  }

   /**
   * Get merchantcard
   * @return merchantcard
  **/
  public LoyaltyMerchantcardsProductModel getMerchantcard() {
    return merchantcard;
  }

  public void setMerchantcard(LoyaltyMerchantcardsProductModel merchantcard) {
    this.merchantcard = merchantcard;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTransactionsIdent smartTransactionsIdent = (SmartTransactionsIdent) o;
    return Objects.equals(this.object, smartTransactionsIdent.object) &&
        Objects.equals(this.id, smartTransactionsIdent.id) &&
        Objects.equals(this.prefix, smartTransactionsIdent.prefix) &&
        Objects.equals(this.name, smartTransactionsIdent.name) &&
        Objects.equals(this.type, smartTransactionsIdent.type) &&
        Objects.equals(this.value, smartTransactionsIdent.value) &&
        Objects.equals(this.valid, smartTransactionsIdent.valid) &&
        Objects.equals(this.merchantcard, smartTransactionsIdent.merchantcard);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, prefix, name, type, value, valid, merchantcard);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTransactionsIdent {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    prefix: ").append(toIndentedString(prefix)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    value: ").append(toIndentedString(value)).append("\n");
    sb.append("    valid: ").append(toIndentedString(valid)).append("\n");
    sb.append("    merchantcard: ").append(toIndentedString(merchantcard)).append("\n");
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

