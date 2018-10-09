package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.LoyaltyCardsDTOAccount;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import org.joda.time.DateTime;
import java.util.Objects;

/**
 * LoyaltyCardsProductModel
 */
public class LoyaltyCardsProductModel {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("account")
  private LoyaltyCardsDTOAccount account = null;

  @SerializedName("cardnumber")
  private String cardnumber = null;

  @SerializedName("created")
  private DateTime created = null;

  public LoyaltyCardsProductModel object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of loyalty card
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public LoyaltyCardsProductModel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of loyalty card
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public LoyaltyCardsProductModel account(LoyaltyCardsDTOAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Loyalty card account
   * @return account
  **/
  public LoyaltyCardsDTOAccount getAccount() {
    return account;
  }

  public void setAccount(LoyaltyCardsDTOAccount account) {
    this.account = account;
  }

  public LoyaltyCardsProductModel cardnumber(String cardnumber) {
    this.cardnumber = cardnumber;
    return this;
  }

   /**
   * Loyalty card number
   * @return cardnumber
  **/
  public String getCardnumber() {
    return cardnumber;
  }

  public void setCardnumber(String cardnumber) {
    this.cardnumber = cardnumber;
  }

  public LoyaltyCardsProductModel created(DateTime created) {
    this.created = created;
    return this;
  }

   /**
   * Creation date
   * @return created
  **/
  public DateTime getCreated() {
    return created;
  }

  public void setCreated(DateTime created) {
    this.created = created;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyCardsProductModel loyaltyCardsProductModel = (LoyaltyCardsProductModel) o;
    return Objects.equals(this.object, loyaltyCardsProductModel.object) &&
        Objects.equals(this.id, loyaltyCardsProductModel.id) &&
        Objects.equals(this.account, loyaltyCardsProductModel.account) &&
        Objects.equals(this.cardnumber, loyaltyCardsProductModel.cardnumber) &&
        Objects.equals(this.created, loyaltyCardsProductModel.created);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, account, cardnumber, created);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyCardsProductModel {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    cardnumber: ").append(toIndentedString(cardnumber)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("}");
    return sb.toString();
  }

  /**
   * Convert the given object to string with each line indented by 4 spaces (except the first line).
   */
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

