package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.Contact;
import com.secuconnect.client.model.PaymentContractsDTOIFrameOpts;
import com.secuconnect.client.model.PaymentContractsDTORequestIdAdditionalData;
import com.secuconnect.client.model.PaymentInformation;
import java.util.Objects;

/**
 * PaymentContractsDTORequestId
 */
public class PaymentContractsDTORequestId {
  @SerializedName("contract_id")
  protected String contractId = null;

  @SerializedName("contact")
  protected Contact contact = null;

  @SerializedName("project")
  protected String project = null;

  @SerializedName("payout_account")
  protected PaymentInformation payoutAccount = null;

  @SerializedName("payment_data")
  protected PaymentInformation paymentData = null;

  @SerializedName("iframe_opts")
  protected PaymentContractsDTOIFrameOpts iframeOpts = null;

  @SerializedName("url_push")
  protected String urlPush = null;

  @SerializedName("payin_account")
  protected Boolean payinAccount = false;

  @SerializedName("create_first_store")
  protected Boolean createFirstStore = false;

  @SerializedName("store_name")
  protected String storeName = null;

  @SerializedName("payout_purpose")
  protected String payoutPurpose = null;

  @SerializedName("identrequest")
  protected String identrequest = null;

  @SerializedName("signed_contract")
  protected String signedContract = null;

  @SerializedName("additional_data")
  protected PaymentContractsDTORequestIdAdditionalData additionalData = null;

  @SerializedName("notes")
  protected String notes = null;

  @SerializedName("invoice_reference")
  protected String invoiceReference = null;

  @SerializedName("tid")
  protected String tid = null;

  @SerializedName("merchant_category")
  protected Integer merchantCategory = null;

  @SerializedName("account_statement_text")
  protected String accountStatementText = null;

  public PaymentContractsDTORequestId contractId(String contractId) {
    this.contractId = contractId;
    return this;
  }

   /**
   * General Contract ID of the parent contract
   * @return contractId
  **/
  public String getContractId() {
    return contractId;
  }

  public void setContractId(String contractId) {
    this.contractId = contractId;
  }

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
   * Project name (must be unique)
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

  public PaymentContractsDTORequestId paymentData(PaymentInformation paymentData) {
    this.paymentData = paymentData;
    return this;
  }

   /**
   * Get paymentData
   * @return paymentData
  **/
  public PaymentInformation getPaymentData() {
    return paymentData;
  }

  public void setPaymentData(PaymentInformation paymentData) {
    this.paymentData = paymentData;
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

  public PaymentContractsDTORequestId urlPush(String urlPush) {
    this.urlPush = urlPush;
    return this;
  }

   /**
   * Default URL for push notifications; this is where your service listens for callbacks of the secuconnect service
   * @return urlPush
  **/
  public String getUrlPush() {
    return urlPush;
  }

  public void setUrlPush(String urlPush) {
    this.urlPush = urlPush;
  }

  public PaymentContractsDTORequestId payinAccount(Boolean payinAccount) {
    this.payinAccount = payinAccount;
    return this;
  }

   /**
   * Pay-in account
   * @return payinAccount
  **/
  public Boolean getPayinAccount() {
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
   * Whether to create a first store at the same location
   * @return createFirstStore
  **/
  public Boolean getCreateFirstStore() {
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
   * Store name of the first store
   * @return storeName
  **/
  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public PaymentContractsDTORequestId payoutPurpose(String payoutPurpose) {
    this.payoutPurpose = payoutPurpose;
    return this;
  }

   /**
   * Purpose for payouts that appears at the bank statement
   * @return payoutPurpose
  **/
  public String getPayoutPurpose() {
    return payoutPurpose;
  }

  public void setPayoutPurpose(String payoutPurpose) {
    this.payoutPurpose = payoutPurpose;
  }

  public PaymentContractsDTORequestId identrequest(String identrequest) {
    this.identrequest = identrequest;
    return this;
  }

   /**
   * Object ID of Services Identrequest (&#x60;SIR_...&#x60;)
   * @return identrequest
  **/
  public String getIdentrequest() {
    return identrequest;
  }

  public void setIdentrequest(String identrequest) {
    this.identrequest = identrequest;
  }

  public PaymentContractsDTORequestId signedContract(String signedContract) {
    this.signedContract = signedContract;
    return this;
  }

   /**
   * The document ID of of uploaded signed contract; s. Document service (&#x60;DUP_...&#x60;)
   * @return signedContract
  **/
  public String getSignedContract() {
    return signedContract;
  }

  public void setSignedContract(String signedContract) {
    this.signedContract = signedContract;
  }

  public PaymentContractsDTORequestId additionalData(PaymentContractsDTORequestIdAdditionalData additionalData) {
    this.additionalData = additionalData;
    return this;
  }

   /**
   * Get additionalData
   * @return additionalData
  **/
  public PaymentContractsDTORequestIdAdditionalData getAdditionalData() {
    return additionalData;
  }

  public void setAdditionalData(PaymentContractsDTORequestIdAdditionalData additionalData) {
    this.additionalData = additionalData;
  }

  public PaymentContractsDTORequestId notes(String notes) {
    this.notes = notes;
    return this;
  }

   /**
   * Additional notes
   * @return notes
  **/
  public String getNotes() {
    return notes;
  }

  public void setNotes(String notes) {
    this.notes = notes;
  }

  public PaymentContractsDTORequestId invoiceReference(String invoiceReference) {
    this.invoiceReference = invoiceReference;
    return this;
  }

   /**
   * Reference-Text from Inputfield
   * @return invoiceReference
  **/
  public String getInvoiceReference() {
    return invoiceReference;
  }

  public void setInvoiceReference(String invoiceReference) {
    this.invoiceReference = invoiceReference;
  }

  public PaymentContractsDTORequestId tid(String tid) {
    this.tid = tid;
    return this;
  }

   /**
   * Third party terminal ID
   * @return tid
  **/
  public String getTid() {
    return tid;
  }

  public void setTid(String tid) {
    this.tid = tid;
  }

  public PaymentContractsDTORequestId merchantCategory(Integer merchantCategory) {
    this.merchantCategory = merchantCategory;
    return this;
  }

   /**
   * Merchant category  This is _not_ the ISO Merchant Category Code (MCC). The list can be obtained at &#x60;GET /pai/v2/General/Merchants/me/MerchantCategories.
   * @return merchantCategory
  **/
  public Integer getMerchantCategory() {
    return merchantCategory;
  }

  public void setMerchantCategory(Integer merchantCategory) {
    this.merchantCategory = merchantCategory;
  }

  public PaymentContractsDTORequestId accountStatementText(String accountStatementText) {
    this.accountStatementText = accountStatementText;
    return this;
  }

   /**
   * Descriptor that appears at the credit card statements
   * @return accountStatementText
  **/
  public String getAccountStatementText() {
    return accountStatementText;
  }

  public void setAccountStatementText(String accountStatementText) {
    this.accountStatementText = accountStatementText;
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
    return Objects.equals(this.contractId, paymentContractsDTORequestId.contractId) &&
        Objects.equals(this.contact, paymentContractsDTORequestId.contact) &&
        Objects.equals(this.project, paymentContractsDTORequestId.project) &&
        Objects.equals(this.payoutAccount, paymentContractsDTORequestId.payoutAccount) &&
        Objects.equals(this.paymentData, paymentContractsDTORequestId.paymentData) &&
        Objects.equals(this.iframeOpts, paymentContractsDTORequestId.iframeOpts) &&
        Objects.equals(this.urlPush, paymentContractsDTORequestId.urlPush) &&
        Objects.equals(this.payinAccount, paymentContractsDTORequestId.payinAccount) &&
        Objects.equals(this.createFirstStore, paymentContractsDTORequestId.createFirstStore) &&
        Objects.equals(this.storeName, paymentContractsDTORequestId.storeName) &&
        Objects.equals(this.payoutPurpose, paymentContractsDTORequestId.payoutPurpose) &&
        Objects.equals(this.identrequest, paymentContractsDTORequestId.identrequest) &&
        Objects.equals(this.signedContract, paymentContractsDTORequestId.signedContract) &&
        Objects.equals(this.additionalData, paymentContractsDTORequestId.additionalData) &&
        Objects.equals(this.notes, paymentContractsDTORequestId.notes) &&
        Objects.equals(this.invoiceReference, paymentContractsDTORequestId.invoiceReference) &&
        Objects.equals(this.tid, paymentContractsDTORequestId.tid) &&
        Objects.equals(this.merchantCategory, paymentContractsDTORequestId.merchantCategory) &&
        Objects.equals(this.accountStatementText, paymentContractsDTORequestId.accountStatementText);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contractId, contact, project, payoutAccount, paymentData, iframeOpts, urlPush, payinAccount, createFirstStore, storeName, payoutPurpose, identrequest, signedContract, additionalData, notes, invoiceReference, tid, merchantCategory, accountStatementText);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class PaymentContractsDTORequestId {\n");
    sb.append("    contractId: ").append(toIndentedString(contractId)).append("\n");
    sb.append("    contact: ").append(toIndentedString(contact)).append("\n");
    sb.append("    project: ").append(toIndentedString(project)).append("\n");
    sb.append("    payoutAccount: ").append(toIndentedString(payoutAccount)).append("\n");
    sb.append("    paymentData: ").append(toIndentedString(paymentData)).append("\n");
    sb.append("    iframeOpts: ").append(toIndentedString(iframeOpts)).append("\n");
    sb.append("    urlPush: ").append(toIndentedString(urlPush)).append("\n");
    sb.append("    payinAccount: ").append(toIndentedString(payinAccount)).append("\n");
    sb.append("    createFirstStore: ").append(toIndentedString(createFirstStore)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    payoutPurpose: ").append(toIndentedString(payoutPurpose)).append("\n");
    sb.append("    identrequest: ").append(toIndentedString(identrequest)).append("\n");
    sb.append("    signedContract: ").append(toIndentedString(signedContract)).append("\n");
    sb.append("    additionalData: ").append(toIndentedString(additionalData)).append("\n");
    sb.append("    notes: ").append(toIndentedString(notes)).append("\n");
    sb.append("    invoiceReference: ").append(toIndentedString(invoiceReference)).append("\n");
    sb.append("    tid: ").append(toIndentedString(tid)).append("\n");
    sb.append("    merchantCategory: ").append(toIndentedString(merchantCategory)).append("\n");
    sb.append("    accountStatementText: ").append(toIndentedString(accountStatementText)).append("\n");
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

