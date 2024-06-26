package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.LoyaltyCardgroupsProductModel;
import com.secuconnect.client.model.LoyaltyCardsProductModel;
import com.secuconnect.client.model.LoyaltyCustomersProductModel;
import com.secuconnect.client.model.LoyaltyMerchantcardsDTOPaymentContainer;
import com.secuconnect.client.model.LoyaltyMerchantcardsProductModel;
import com.secuconnect.client.model.ProductInstanceUID;
import com.secuconnect.client.model.ReceiptType;
import com.secuconnect.client.model.ReceiptTypeValue;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * LoyaltyMerchantcardsProductWithReceiptModel
 */
public class LoyaltyMerchantcardsProductWithReceiptModel extends LoyaltyMerchantcardsProductModel {
  @SerializedName("receipt_header")
  protected List<ReceiptType> receiptHeader = null;

  @SerializedName("receipt")
  protected List<ReceiptTypeValue> receipt = null;

  @SerializedName("trans_id")
  protected Integer transId = null;

  @SerializedName("amount")
  protected Integer amount = null;

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

  public LoyaltyMerchantcardsProductWithReceiptModel transId(Integer transId) {
    this.transId = transId;
    return this;
  }

   /**
   * Transaction ID (TA code)
   * @return transId
  **/
  public Integer getTransId() {
    return transId;
  }

  public void setTransId(Integer transId) {
    this.transId = transId;
  }

  public LoyaltyMerchantcardsProductWithReceiptModel amount(Integer amount) {
    this.amount = amount;
    return this;
  }

   /**
   * Get amount
   * @return amount
  **/
  public Integer getAmount() {
    return amount;
  }

  public void setAmount(Integer amount) {
    this.amount = amount;
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
        Objects.equals(this.transId, loyaltyMerchantcardsProductWithReceiptModel.transId) &&
        Objects.equals(this.amount, loyaltyMerchantcardsProductWithReceiptModel.amount) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(receiptHeader, receipt, transId, amount, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class LoyaltyMerchantcardsProductWithReceiptModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    receiptHeader: ").append(toIndentedString(receiptHeader)).append("\n");
    sb.append("    receipt: ").append(toIndentedString(receipt)).append("\n");
    sb.append("    transId: ").append(toIndentedString(transId)).append("\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
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

