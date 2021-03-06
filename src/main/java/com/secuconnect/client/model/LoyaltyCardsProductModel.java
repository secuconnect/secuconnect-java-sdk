package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.CreatedField;
import com.secuconnect.client.model.LoyaltyCardsDTOAccount;
import java.util.Objects;

/**
 * LoyaltyCardsProductModel
 */
public class LoyaltyCardsProductModel extends BaseProductModel {
  @SerializedName("created")
  private String created = null;

  @SerializedName("account")
  private LoyaltyCardsDTOAccount account = null;

  @SerializedName("cardnumber")
  private String cardnumber = null;

  public LoyaltyCardsProductModel created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public LoyaltyCardsProductModel account(LoyaltyCardsDTOAccount account) {
    this.account = account;
    return this;
  }

   /**
   * Get account
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

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyCardsProductModel loyaltyCardsProductModel = (LoyaltyCardsProductModel) o;
    return Objects.equals(this.created, loyaltyCardsProductModel.created) &&
        Objects.equals(this.account, loyaltyCardsProductModel.account) &&
        Objects.equals(this.cardnumber, loyaltyCardsProductModel.cardnumber) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(created, account, cardnumber, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyCardsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    cardnumber: ").append(toIndentedString(cardnumber)).append("\n");
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

