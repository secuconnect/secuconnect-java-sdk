package io.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import io.secuconnect.client.model.AssignedBy;
import io.secuconnect.client.model.BaseProductModel;
import io.secuconnect.client.model.GeneralMerchantsLegalDetails;
import io.secuconnect.client.model.GeneralMerchantsUrls;
import io.secuconnect.client.model.GeneralMerchantsUser;
import io.secuconnect.client.model.InvitedBy;
import io.secuconnect.client.model.ParentModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GeneralMerchantsProductModel
 */
public class GeneralMerchantsProductModel extends BaseProductModel {
  @SerializedName("id_old")
  private Integer idOld = null;

  @SerializedName("type")
  private String type = null;

  @SerializedName("user")
  private GeneralMerchantsUser user = null;

  @SerializedName("parent")
  private ParentModel parent = null;

  @SerializedName("assigned_by")
  private List<AssignedBy> assignedBy = null;

  @SerializedName("invited_by")
  private List<InvitedBy> invitedBy = null;

  @SerializedName("legal_details")
  private List<GeneralMerchantsLegalDetails> legalDetails = null;

  @SerializedName("urls")
  private List<GeneralMerchantsUrls> urls = null;

  @SerializedName("store_name")
  private String storeName = null;

   /**
   * ID in secupay Frontend
   * @return idOld
  **/
  public Integer getIdOld() {
    return idOld;
  }

  public GeneralMerchantsProductModel type(String type) {
    this.type = type;
    return this;
  }

   /**
   * User type ID - unverified shop (1); internet shop (11); kaufmännischer Netzbetrieb (KNB, 45); secucard merchant (46); App Center user (63), checkout provider (64)
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public GeneralMerchantsProductModel user(GeneralMerchantsUser user) {
    this.user = user;
    return this;
  }

   /**
   * Get user
   * @return user
  **/
  public GeneralMerchantsUser getUser() {
    return user;
  }

  public void setUser(GeneralMerchantsUser user) {
    this.user = user;
  }

  public GeneralMerchantsProductModel parent(ParentModel parent) {
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

  public GeneralMerchantsProductModel assignedBy(List<AssignedBy> assignedBy) {
    this.assignedBy = assignedBy;
    return this;
  }

  public GeneralMerchantsProductModel addAssignedByItem(AssignedBy assignedByItem) {
    if (this.assignedBy == null) {
      this.assignedBy = new ArrayList<AssignedBy>();
    }
    this.assignedBy.add(assignedByItem);
    return this;
  }

   /**
   * Assigned by
   * @return assignedBy
  **/
  public List<AssignedBy> getAssignedBy() {
    return assignedBy;
  }

  public void setAssignedBy(List<AssignedBy> assignedBy) {
    this.assignedBy = assignedBy;
  }

  public GeneralMerchantsProductModel invitedBy(List<InvitedBy> invitedBy) {
    this.invitedBy = invitedBy;
    return this;
  }

  public GeneralMerchantsProductModel addInvitedByItem(InvitedBy invitedByItem) {
    if (this.invitedBy == null) {
      this.invitedBy = new ArrayList<InvitedBy>();
    }
    this.invitedBy.add(invitedByItem);
    return this;
  }

   /**
   * Invited by
   * @return invitedBy
  **/
  public List<InvitedBy> getInvitedBy() {
    return invitedBy;
  }

  public void setInvitedBy(List<InvitedBy> invitedBy) {
    this.invitedBy = invitedBy;
  }

  public GeneralMerchantsProductModel legalDetails(List<GeneralMerchantsLegalDetails> legalDetails) {
    this.legalDetails = legalDetails;
    return this;
  }

  public GeneralMerchantsProductModel addLegalDetailsItem(GeneralMerchantsLegalDetails legalDetailsItem) {
    if (this.legalDetails == null) {
      this.legalDetails = new ArrayList<GeneralMerchantsLegalDetails>();
    }
    this.legalDetails.add(legalDetailsItem);
    return this;
  }

   /**
   * Legal details like terms of use, privacy policy, or imprint
   * @return legalDetails
  **/
  public List<GeneralMerchantsLegalDetails> getLegalDetails() {
    return legalDetails;
  }

  public void setLegalDetails(List<GeneralMerchantsLegalDetails> legalDetails) {
    this.legalDetails = legalDetails;
  }

  public GeneralMerchantsProductModel urls(List<GeneralMerchantsUrls> urls) {
    this.urls = urls;
    return this;
  }

  public GeneralMerchantsProductModel addUrlsItem(GeneralMerchantsUrls urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<GeneralMerchantsUrls>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * URLs
   * @return urls
  **/
  public List<GeneralMerchantsUrls> getUrls() {
    return urls;
  }

  public void setUrls(List<GeneralMerchantsUrls> urls) {
    this.urls = urls;
  }

  public GeneralMerchantsProductModel storeName(String storeName) {
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
    GeneralMerchantsProductModel generalMerchantsProductModel = (GeneralMerchantsProductModel) o;
    return Objects.equals(this.idOld, generalMerchantsProductModel.idOld) &&
        Objects.equals(this.type, generalMerchantsProductModel.type) &&
        Objects.equals(this.user, generalMerchantsProductModel.user) &&
        Objects.equals(this.parent, generalMerchantsProductModel.parent) &&
        Objects.equals(this.assignedBy, generalMerchantsProductModel.assignedBy) &&
        Objects.equals(this.invitedBy, generalMerchantsProductModel.invitedBy) &&
        Objects.equals(this.legalDetails, generalMerchantsProductModel.legalDetails) &&
        Objects.equals(this.urls, generalMerchantsProductModel.urls) &&
        Objects.equals(this.storeName, generalMerchantsProductModel.storeName) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idOld, type, user, parent, assignedBy, invitedBy, legalDetails, urls, storeName, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralMerchantsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    idOld: ").append(toIndentedString(idOld)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    assignedBy: ").append(toIndentedString(assignedBy)).append("\n");
    sb.append("    invitedBy: ").append(toIndentedString(invitedBy)).append("\n");
    sb.append("    legalDetails: ").append(toIndentedString(legalDetails)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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

