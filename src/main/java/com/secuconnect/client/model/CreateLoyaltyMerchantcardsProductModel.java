package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.LoyaltyCardgroupsProductModel;
import com.secuconnect.client.model.LoyaltyCardsProductModel;
import com.secuconnect.client.model.LoyaltyCustomersProductModel;
import com.secuconnect.client.model.LoyaltyMerchantcardsDTOPaymentContainer;
import com.secuconnect.client.model.LoyaltyMerchantcardsProductModel;
import com.secuconnect.client.model.ProductInstanceUID;
import java.util.Objects;

/**
 * CreateLoyaltyMerchantcardsProductModel
 */
public class CreateLoyaltyMerchantcardsProductModel extends LoyaltyMerchantcardsProductModel {
  @SerializedName("csc")
  protected String csc = null;

  public CreateLoyaltyMerchantcardsProductModel csc(String csc) {
    this.csc = csc;
    return this;
  }

   /**
   * The CSC associated to the physical card
   * @return csc
  **/
  public String getCsc() {
    return csc;
  }

  public void setCsc(String csc) {
    this.csc = csc;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    CreateLoyaltyMerchantcardsProductModel createLoyaltyMerchantcardsProductModel = (CreateLoyaltyMerchantcardsProductModel) o;
    return Objects.equals(this.csc, createLoyaltyMerchantcardsProductModel.csc) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(csc, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class CreateLoyaltyMerchantcardsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    csc: ").append(toIndentedString(csc)).append("\n");
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

