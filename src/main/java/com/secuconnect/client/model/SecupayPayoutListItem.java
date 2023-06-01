package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.BankAccountDescriptor;
import java.util.Objects;

/**
 * SecupayPayoutListItem
 */
public class SecupayPayoutListItem {
  @SerializedName("amount")
  protected Integer amount = null;

  @SerializedName("purpose")
  protected String purpose = null;

  @SerializedName("reference")
  protected String reference = null;

  @SerializedName("recipient")
  protected String recipient = null;

  @SerializedName("bank_account")
  protected BankAccountDescriptor bankAccount = null;

  @SerializedName("origin_transaction")
  protected Integer originTransaction = null;

  public SecupayPayoutListItem amount(Integer amount) {
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

  public SecupayPayoutListItem purpose(String purpose) {
    this.purpose = purpose;
    return this;
  }

   /**
   * The purpose of the payment. This is the later assignment of the payment is for example on the account statement of the buyer.
   * @return purpose
  **/
  public String getPurpose() {
    return purpose;
  }

  public void setPurpose(String purpose) {
    this.purpose = purpose;
  }

  public SecupayPayoutListItem reference(String reference) {
    this.reference = reference;
    return this;
  }

   /**
   * Reference ID - must be unique for the entire basket
   * @return reference
  **/
  public String getReference() {
    return reference;
  }

  public void setReference(String reference) {
    this.reference = reference;
  }

  public SecupayPayoutListItem recipient(String recipient) {
    this.recipient = recipient;
    return this;
  }

   /**
   * Merchant, store or user ID
   * @return recipient
  **/
  public String getRecipient() {
    return recipient;
  }

  public void setRecipient(String recipient) {
    this.recipient = recipient;
  }

  public SecupayPayoutListItem bankAccount(BankAccountDescriptor bankAccount) {
    this.bankAccount = bankAccount;
    return this;
  }

   /**
   * Get bankAccount
   * @return bankAccount
  **/
  public BankAccountDescriptor getBankAccount() {
    return bankAccount;
  }

  public void setBankAccount(BankAccountDescriptor bankAccount) {
    this.bankAccount = bankAccount;
  }

  public SecupayPayoutListItem originTransaction(Integer originTransaction) {
    this.originTransaction = originTransaction;
    return this;
  }

   /**
   * Transaction ID as alternative to the bank_account parameter
   * @return originTransaction
  **/
  public Integer getOriginTransaction() {
    return originTransaction;
  }

  public void setOriginTransaction(Integer originTransaction) {
    this.originTransaction = originTransaction;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SecupayPayoutListItem secupayPayoutListItem = (SecupayPayoutListItem) o;
    return Objects.equals(this.amount, secupayPayoutListItem.amount) &&
        Objects.equals(this.purpose, secupayPayoutListItem.purpose) &&
        Objects.equals(this.reference, secupayPayoutListItem.reference) &&
        Objects.equals(this.recipient, secupayPayoutListItem.recipient) &&
        Objects.equals(this.bankAccount, secupayPayoutListItem.bankAccount) &&
        Objects.equals(this.originTransaction, secupayPayoutListItem.originTransaction);
  }

  @Override
  public int hashCode() {
    return Objects.hash(amount, purpose, reference, recipient, bankAccount, originTransaction);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SecupayPayoutListItem {\n");
    sb.append("    amount: ").append(toIndentedString(amount)).append("\n");
    sb.append("    purpose: ").append(toIndentedString(purpose)).append("\n");
    sb.append("    reference: ").append(toIndentedString(reference)).append("\n");
    sb.append("    recipient: ").append(toIndentedString(recipient)).append("\n");
    sb.append("    bankAccount: ").append(toIndentedString(bankAccount)).append("\n");
    sb.append("    originTransaction: ").append(toIndentedString(originTransaction)).append("\n");
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

