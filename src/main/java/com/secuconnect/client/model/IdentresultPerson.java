package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.ContactData;
import com.secuconnect.client.model.IdentDocument;
import com.secuconnect.client.model.IdentDocumentData;
import com.secuconnect.client.model.IdentificationCustomData;
import com.secuconnect.client.model.IdentificationProcess;
import com.secuconnect.client.model.UserData;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * IdentresultPerson
 */
public class IdentresultPerson {
  @SerializedName("identificationprocess")
  private IdentificationProcess identificationprocess = null;

  @SerializedName("customdata")
  private IdentificationCustomData customdata = null;

  @SerializedName("contactdata")
  private ContactData contactdata = null;

  @SerializedName("userdata")
  private UserData userdata = null;

  @SerializedName("attachments")
  private List<IdentDocument> attachments = null;

  @SerializedName("identificationdocument")
  private IdentDocumentData identificationdocument = null;

  @SerializedName("video")
  private String video = null;

  public IdentresultPerson identificationprocess(IdentificationProcess identificationprocess) {
    this.identificationprocess = identificationprocess;
    return this;
  }

   /**
   * Get identificationprocess
   * @return identificationprocess
  **/
  public IdentificationProcess getIdentificationprocess() {
    return identificationprocess;
  }

  public void setIdentificationprocess(IdentificationProcess identificationprocess) {
    this.identificationprocess = identificationprocess;
  }

  public IdentresultPerson customdata(IdentificationCustomData customdata) {
    this.customdata = customdata;
    return this;
  }

   /**
   * Get customdata
   * @return customdata
  **/
  public IdentificationCustomData getCustomdata() {
    return customdata;
  }

  public void setCustomdata(IdentificationCustomData customdata) {
    this.customdata = customdata;
  }

  public IdentresultPerson contactdata(ContactData contactdata) {
    this.contactdata = contactdata;
    return this;
  }

   /**
   * Get contactdata
   * @return contactdata
  **/
  public ContactData getContactdata() {
    return contactdata;
  }

  public void setContactdata(ContactData contactdata) {
    this.contactdata = contactdata;
  }

  public IdentresultPerson userdata(UserData userdata) {
    this.userdata = userdata;
    return this;
  }

   /**
   * Get userdata
   * @return userdata
  **/
  public UserData getUserdata() {
    return userdata;
  }

  public void setUserdata(UserData userdata) {
    this.userdata = userdata;
  }

  public IdentresultPerson attachments(List<IdentDocument> attachments) {
    this.attachments = attachments;
    return this;
  }

  public IdentresultPerson addAttachmentsItem(IdentDocument attachmentsItem) {
    if (this.attachments == null) {
      this.attachments = new ArrayList<>();
    }
    this.attachments.add(attachmentsItem);
    return this;
  }

   /**
   * User Data submitted by provider
   * @return attachments
  **/
  public List<IdentDocument> getAttachments() {
    return attachments;
  }

  public void setAttachments(List<IdentDocument> attachments) {
    this.attachments = attachments;
  }

  public IdentresultPerson identificationdocument(IdentDocumentData identificationdocument) {
    this.identificationdocument = identificationdocument;
    return this;
  }

   /**
   * Get identificationdocument
   * @return identificationdocument
  **/
  public IdentDocumentData getIdentificationdocument() {
    return identificationdocument;
  }

  public void setIdentificationdocument(IdentDocumentData identificationdocument) {
    this.identificationdocument = identificationdocument;
  }

  public IdentresultPerson video(String video) {
    this.video = video;
    return this;
  }

   /**
   * The url to download the identification video
   * @return video
  **/
  public String getVideo() {
    return video;
  }

  public void setVideo(String video) {
    this.video = video;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    IdentresultPerson identresultPerson = (IdentresultPerson) o;
    return Objects.equals(this.identificationprocess, identresultPerson.identificationprocess) &&
        Objects.equals(this.customdata, identresultPerson.customdata) &&
        Objects.equals(this.contactdata, identresultPerson.contactdata) &&
        Objects.equals(this.userdata, identresultPerson.userdata) &&
        Objects.equals(this.attachments, identresultPerson.attachments) &&
        Objects.equals(this.identificationdocument, identresultPerson.identificationdocument) &&
        Objects.equals(this.video, identresultPerson.video);
  }

  @Override
  public int hashCode() {
    return Objects.hash(identificationprocess, customdata, contactdata, userdata, attachments, identificationdocument, video);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class IdentresultPerson {\n");
    sb.append("    identificationprocess: ").append(toIndentedString(identificationprocess)).append("\n");
    sb.append("    customdata: ").append(toIndentedString(customdata)).append("\n");
    sb.append("    contactdata: ").append(toIndentedString(contactdata)).append("\n");
    sb.append("    userdata: ").append(toIndentedString(userdata)).append("\n");
    sb.append("    attachments: ").append(toIndentedString(attachments)).append("\n");
    sb.append("    identificationdocument: ").append(toIndentedString(identificationdocument)).append("\n");
    sb.append("    video: ").append(toIndentedString(video)).append("\n");
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

