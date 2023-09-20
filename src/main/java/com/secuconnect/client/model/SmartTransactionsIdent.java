package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.LoyaltyMerchantcardsProductModel;
import java.util.Objects;

/**
 * secucard customer card or voucher, or request to create it
 */
public class SmartTransactionsIdent {
  @SerializedName("object")
  protected String object = null;

  @SerializedName("id")
  protected String id = null;

  @SerializedName("prefix")
  protected String prefix = null;

  @SerializedName("name")
  protected String name = null;

  @SerializedName("type")
  protected String type = null;

  @SerializedName("value")
  protected String value = null;

  @SerializedName("valid")
  protected Boolean valid = null;

  @SerializedName("merchantcard")
  protected LoyaltyMerchantcardsProductModel merchantcard = null;

  public SmartTransactionsIdent object(String object) {
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

  public SmartTransactionsIdent id(String id) {
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

   /**
   * Card number prefix
   * @return prefix
  **/
  public String getPrefix() {
    return prefix;
  }

   /**
   * Card group name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public SmartTransactionsIdent type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Ident type:  - &#x60;\&quot;card\&quot;&#x60; to use a card - &#x60;\&quot;create_card\&quot;&#x60; to create a card on-the-fly
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
   * Card number or Card Group ID  When you create a card on-the-fly, you must pass the Card Group ID (like &#x60;\&quot;CRG_TFRXSKL91C4UNYC4ND79P7ZBZBQ0MZ\&quot;&#x60;). When you use an existing card, you must pass its card number (like &#x60;\&quot;9276999999999999\&quot;&#x60;).
   * @return value
  **/
  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

   /**
   * Whether the card is valid for the merchant or acceptance point
   * @return valid
  **/
  public Boolean getValid() {
    return valid;
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

