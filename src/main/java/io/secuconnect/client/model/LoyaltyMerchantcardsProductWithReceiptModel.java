package io.secuconnect.client.model;

import java.util.Objects;
import java.util.Arrays;
import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.LoyaltyCardgroupsProductModel;
import io.secuconnect.client.model.LoyaltyCardsProductModel;
import io.secuconnect.client.model.LoyaltyCustomersProductModel;
import io.secuconnect.client.model.LoyaltyMerchantcardsDTOPaymentContainer;
import io.secuconnect.client.model.LoyaltyMerchantcardsProductModel;
import io.secuconnect.client.model.ProductInstanceUID;
import io.secuconnect.client.model.ReceiptType;
import io.secuconnect.client.model.ReceiptTypeValue;
import java.util.ArrayList;
import java.util.List;

/**
 * LoyaltyMerchantcardsProductWithReceiptModel
 */
public class LoyaltyMerchantcardsProductWithReceiptModel extends LoyaltyMerchantcardsProductModel {
  @SerializedName("receipt_header")
  private List<ReceiptType> receiptHeader = null;

  @SerializedName("receipt")
  private List<ReceiptTypeValue> receipt = null;

  public LoyaltyMerchantcardsProductWithReceiptModel receiptHeader(List<ReceiptType> receiptHeader) {
    this.receiptHeader = receiptHeader;
    return this;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel addReceiptHeaderItem(ReceiptType receiptHeaderItem) {
    if (this.receiptHeader == null) {
      this.receiptHeader = new ArrayList<ReceiptType>();
    }
    this.receiptHeader.add(receiptHeaderItem);
    return this;
  }

   /**
   * Receipt header
   * @return receiptHeader
  **/
  public List<ReceiptType> getReceiptHeader() {
    return receiptHeader;
  }

  public void setReceiptHeader(List<ReceiptType> receiptHeader) {
    this.receiptHeader = receiptHeader;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel receipt(List<ReceiptTypeValue> receipt) {
    this.receipt = receipt;
    return this;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel addReceiptItem(ReceiptTypeValue receiptItem) {
    if (this.receipt == null) {
      this.receipt = new ArrayList<ReceiptTypeValue>();
    }
    this.receipt.add(receiptItem);
    return this;
  }

   /**
   * Receipt
   * @return receipt
  **/
  public List<ReceiptTypeValue> getReceipt() {
    return receipt;
  }

  public void setReceipt(List<ReceiptTypeValue> receipt) {
    this.receipt = receipt;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    LoyaltyMerchantcardsProductWithReceiptModel loyaltyMerchantcardsProductWithReceiptModel = (LoyaltyMerchantcardsProductWithReceiptModel) o;
    return Objects.equals(this.receiptHeader, loyaltyMerchantcardsProductWithReceiptModel.receiptHeader) &&
        Objects.equals(this.receipt, loyaltyMerchantcardsProductWithReceiptModel.receipt) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(receiptHeader, receipt, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsProductWithReceiptModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    receiptHeader: ").append(toIndentedString(receiptHeader)).append("\n");
    sb.append("    receipt: ").append(toIndentedString(receipt)).append("\n");
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

