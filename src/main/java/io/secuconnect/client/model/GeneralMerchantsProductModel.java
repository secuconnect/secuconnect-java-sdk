package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.AssignedBy;
import io.secuconnect.client.model.GeneralMerchantsCheckoutOptions;
import io.secuconnect.client.model.GeneralMerchantsLegalDetails;
import io.secuconnect.client.model.GeneralMerchantsUrls;
import io.secuconnect.client.model.GeneralMerchantsUser;
import io.secuconnect.client.model.InvitedBy;
import io.secuconnect.client.model.ParentModel;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GeneralMerchantsProductModel
 */
public class GeneralMerchantsProductModel {
  @SerializedName("object")
  private String object = null;

  @SerializedName("id")
  private String id = null;

  @SerializedName("id_old")
  private String idOld = null;

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
  private GeneralMerchantsLegalDetails legalDetails = null;

  @SerializedName("checkout_options")
  private GeneralMerchantsCheckoutOptions checkoutOptions = null;

  @SerializedName("urls")
  private GeneralMerchantsUrls urls = null;

  public GeneralMerchantsProductModel object(String object) {
    this.object = object;
    return this;
  }

   /**
   * Object of general merchant
   * @return object
  **/
  public String getObject() {
    return object;
  }

  public void setObject(String object) {
    this.object = object;
  }

  public GeneralMerchantsProductModel id(String id) {
    this.id = id;
    return this;
  }

   /**
   * Id of general merchant
   * @return id
  **/
  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public GeneralMerchantsProductModel idOld(String idOld) {
    this.idOld = idOld;
    return this;
  }

   /**
   * Old id of general merchant
   * @return idOld
  **/
  public String getIdOld() {
    return idOld;
  }

  public void setIdOld(String idOld) {
    this.idOld = idOld;
  }

  public GeneralMerchantsProductModel type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Type of general merchant
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
   * General merchant user
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
   * Parent of general merchant user
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

  public GeneralMerchantsProductModel legalDetails(GeneralMerchantsLegalDetails legalDetails) {
    this.legalDetails = legalDetails;
    return this;
  }

   /**
   * Legal details
   * @return legalDetails
  **/
  public GeneralMerchantsLegalDetails getLegalDetails() {
    return legalDetails;
  }

  public void setLegalDetails(GeneralMerchantsLegalDetails legalDetails) {
    this.legalDetails = legalDetails;
  }

  public GeneralMerchantsProductModel checkoutOptions(GeneralMerchantsCheckoutOptions checkoutOptions) {
    this.checkoutOptions = checkoutOptions;
    return this;
  }

   /**
   * Checkout options
   * @return checkoutOptions
  **/
  public GeneralMerchantsCheckoutOptions getCheckoutOptions() {
    return checkoutOptions;
  }

  public void setCheckoutOptions(GeneralMerchantsCheckoutOptions checkoutOptions) {
    this.checkoutOptions = checkoutOptions;
  }

  public GeneralMerchantsProductModel urls(GeneralMerchantsUrls urls) {
    this.urls = urls;
    return this;
  }

   /**
   * Urls
   * @return urls
  **/
  public GeneralMerchantsUrls getUrls() {
    return urls;
  }

  public void setUrls(GeneralMerchantsUrls urls) {
    this.urls = urls;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralMerchantsProductModel generalMerchantsProductModel = (GeneralMerchantsProductModel) o;
    return Objects.equals(this.object, generalMerchantsProductModel.object) &&
        Objects.equals(this.id, generalMerchantsProductModel.id) &&
        Objects.equals(this.idOld, generalMerchantsProductModel.idOld) &&
        Objects.equals(this.type, generalMerchantsProductModel.type) &&
        Objects.equals(this.user, generalMerchantsProductModel.user) &&
        Objects.equals(this.parent, generalMerchantsProductModel.parent) &&
        Objects.equals(this.assignedBy, generalMerchantsProductModel.assignedBy) &&
        Objects.equals(this.invitedBy, generalMerchantsProductModel.invitedBy) &&
        Objects.equals(this.legalDetails, generalMerchantsProductModel.legalDetails) &&
        Objects.equals(this.checkoutOptions, generalMerchantsProductModel.checkoutOptions) &&
        Objects.equals(this.urls, generalMerchantsProductModel.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(object, id, idOld, type, user, parent, assignedBy, invitedBy, legalDetails, checkoutOptions, urls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralMerchantsProductModel {\n");
    
    sb.append("    object: ").append(toIndentedString(object)).append("\n");
    sb.append("    id: ").append(toIndentedString(id)).append("\n");
    sb.append("    idOld: ").append(toIndentedString(idOld)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    assignedBy: ").append(toIndentedString(assignedBy)).append("\n");
    sb.append("    invitedBy: ").append(toIndentedString(invitedBy)).append("\n");
    sb.append("    legalDetails: ").append(toIndentedString(legalDetails)).append("\n");
    sb.append("    checkoutOptions: ").append(toIndentedString(checkoutOptions)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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

