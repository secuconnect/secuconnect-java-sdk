package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.Contact;
import io.secuconnect.client.model.PaymentContractsDTOIFrameOpts;
import io.secuconnect.client.model.PaymentInformation;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.Objects;

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

  public PaymentContractsDTORequestId contact(Contact contact) {
    this.contact = contact;
    return this;
  }

   /**
   * Contact
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
   * Merchants bank account for the payout
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
   * IFrame opts
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
  public Boolean getPayinAccount() {
    return payinAccount;
  }

  public void setPayinAccount(Boolean payinAccount) {
    this.payinAccount = payinAccount;
  }

  @Override
  public boolean equals(java.lang.Object o) {
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
        Objects.equals(this.payinAccount, paymentContractsDTORequestId.payinAccount);
  }

  @Override
  public int hashCode() {
    return Objects.hash(contact, project, payoutAccount, iframeOpts, payinAccount);
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

