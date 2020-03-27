package io.secuconnect.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * GeneralContractsProductModel
 */
public class GeneralContractsProductModel extends BaseProductModel {
  @SerializedName("parent")
  private ParentModel parent = null;

  @SerializedName("merchant")
  private ProductInstanceUID merchant = null;

  @SerializedName("pay_in_advance_account")
  private BankAccountDescriptor payInAdvanceAccount = null;

  public GeneralContractsProductModel parent(ParentModel parent) {
    this.parent = parent;
    return this;
  }

   /**
   * Get parent
   * @return parent
  **/
  public ParentModel getParent() {
    return parent;
  }

  public void setParent(ParentModel parent) {
    this.parent = parent;
  }

  public GeneralContractsProductModel merchant(ProductInstanceUID merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  public ProductInstanceUID getMerchant() {
    return merchant;
  }

  public void setMerchant(ProductInstanceUID merchant) {
    this.merchant = merchant;
  }

  public GeneralContractsProductModel payInAdvanceAccount(BankAccountDescriptor payInAdvanceAccount) {
    this.payInAdvanceAccount = payInAdvanceAccount;
    return this;
  }

   /**
   * Get payInAdvanceAccount
   * @return payInAdvanceAccount
  **/
  public BankAccountDescriptor getPayInAdvanceAccount() {
    return payInAdvanceAccount;
  }

  public void setPayInAdvanceAccount(BankAccountDescriptor payInAdvanceAccount) {
    this.payInAdvanceAccount = payInAdvanceAccount;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralContractsProductModel generalContractsProductModel = (GeneralContractsProductModel) o;
    return Objects.equals(this.parent, generalContractsProductModel.parent) &&
        Objects.equals(this.merchant, generalContractsProductModel.merchant) &&
        Objects.equals(this.payInAdvanceAccount, generalContractsProductModel.payInAdvanceAccount) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(parent, merchant, payInAdvanceAccount, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralContractsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    payInAdvanceAccount: ").append(toIndentedString(payInAdvanceAccount)).append("\n");
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

