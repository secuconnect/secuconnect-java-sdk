package io.secuconnect.client.model;

import java.util.Objects;

import com.google.gson.annotations.SerializedName;

/**
 * PaymentContractsDTORequestId
 */
public class PaymentContractsDTORequestId {
  @SerializedName("contact")
  private Contact contact = null;

  @SerializedName("project")
  private String project = null;

  @SerializedName("payout_account")
  private PaymentInformation payoutAccount = null;

  @SerializedName("iframe_opts")
  private PaymentContractsDTOIFrameOpts iframeOpts = null;

  @SerializedName("payin_account")
  private Boolean payinAccount = false;

  @SerializedName("create_first_store")
  private Boolean createFirstStore = false;

  @SerializedName("store_name")
  private String storeName = null;

  public PaymentContractsDTORequestId contact(Contact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Get contact
   * @return contact
  **/
  public Contact getContact() {
    return contact;
  }

  public void setContact(Contact contact) {
    this.contact = contact;
  }

  public PaymentContractsDTORequestId project(String project) {
    this.project = project;
    return this;
  }

   /**
   * Name of the project (must be unique)
   * @return project
  **/
  public String getProject() {
    return project;
  }

  public void setProject(String project) {
    this.project = project;
  }

  public PaymentContractsDTORequestId payoutAccount(PaymentInformation payoutAccount) {
    this.payoutAccount = payoutAccount;
    return this;
  }

   /**
   * Get payoutAccount
   * @return payoutAccount
  **/
  public PaymentInformation getPayoutAccount() {
    return payoutAccount;
  }

  public void setPayoutAccount(PaymentInformation payoutAccount) {
    this.payoutAccount = payoutAccount;
  }

  public PaymentContractsDTORequestId iframeOpts(PaymentContractsDTOIFrameOpts iframeOpts) {
    this.iframeOpts = iframeOpts;
    return this;
  }

   /**
   * Get iframeOpts
   * @return iframeOpts
  **/
  public PaymentContractsDTOIFrameOpts getIframeOpts() {
    return iframeOpts;
  }

  public void setIframeOpts(PaymentContractsDTOIFrameOpts iframeOpts) {
    this.iframeOpts = iframeOpts;
  }

  public PaymentContractsDTORequestId payinAccount(Boolean payinAccount) {
    this.payinAccount = payinAccount;
    return this;
  }

   /**
   * Pay in account
   * @return payinAccount
  **/
  public Boolean isPayinAccount() {
    return payinAccount;
  }

  public void setPayinAccount(Boolean payinAccount) {
    this.payinAccount = payinAccount;
  }

  public PaymentContractsDTORequestId createFirstStore(Boolean createFirstStore) {
    this.createFirstStore = createFirstStore;
    return this;
  }

   /**
   * Create first store
   * @return createFirstStore
  **/
  public Boolean isCreateFirstStore() {
    return createFirstStore;
  }

  public void setCreateFirstStore(Boolean createFirstStore) {
    this.createFirstStore = createFirstStore;
  }

  public PaymentContractsDTORequestId storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

   /**
   * Store name
   * @return storeName
  **/
  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    PaymentContractsDTORequestId paymentContractsDTORequestId = (PaymentContractsDTORequestId) o;
    return Objects.equals(this.contact, paymentContractsDTORequestId.contact) &&
        Objects.equals(this.project, paymentContractsDTORequestId.project) &&
        Objects.equals(this.payoutAccount, paymentContractsDTORequestId.payoutAccount) &&
        Objects.equals(this.iframeOpts, paymentContractsDTORequestId.iframeOpts) &&
        Objects.equals(this.payinAccount, paymentContractsDTORequestId.payinAccount) &&
        Objects.equals(this.createFirstStore, paymentContractsDTORequestId.createFirstStore) &&
        Objects.equals(this.storeName, paymentContractsDTORequestId.storeName);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contact, project, payoutAccount, iframeOpts, payinAccount, createFirstStore, storeName);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContractsDTORequestId {\n");
    
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    payoutAccount: ").append(toIndentedString(payoutAccount)).append("\n");
    sb.append("    iframeOpts: ").append(toIndentedString(iframeOpts)).append("\n");
    sb.append("    payinAccount: ").append(toIndentedString(payinAccount)).append("\n");
    sb.append("    createFirstStore: ").append(toIndentedString(createFirstStore)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
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

