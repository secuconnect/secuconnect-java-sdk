package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.BaseProductModel;
import io.secuconnect.client.model.LoyaltyCardsDTOAccount;

/**
 * LoyaltyCardsProductModel
 */
public class LoyaltyCardsProductModel extends BaseProductModel {
  @SerializedName("account")
  private LoyaltyCardsDTOAccount account = null;

  @SerializedName("cardnumber")
  private String cardnumber = null;

  @SerializedName("created")
  private String created = null;

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

  public LoyaltyCardsProductModel created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Creation date
   * @return created
  **/
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
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
    return Objects.equals(this.account, loyaltyCardsProductModel.account) &&
        Objects.equals(this.cardnumber, loyaltyCardsProductModel.cardnumber) &&
        Objects.equals(this.created, loyaltyCardsProductModel.created) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(account, cardnumber, created, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyCardsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    account: ").append(toIndentedString(account)).append("\n");
    sb.append("    cardnumber: ").append(toIndentedString(cardnumber)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
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

