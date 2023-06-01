package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.AssignedBy;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.GeneralMerchantsLegalDetails;
import com.secuconnect.client.model.GeneralMerchantsUrls;
import com.secuconnect.client.model.GeneralMerchantsUser;
import com.secuconnect.client.model.InvitedBy;
import com.secuconnect.client.model.ParentModel;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GeneralMerchantsProductModel
 */
public class GeneralMerchantsProductModel extends BaseProductModel {
  @SerializedName("l")
  protected Integer l = null;

  @SerializedName("k")
  protected Integer k = null;

  @SerializedName("ks")
  protected String ks = null;

  @SerializedName("c")
  protected Integer c = null;

  @SerializedName("s")
  protected Integer s = null;

  @SerializedName("t")
  protected AggregationTimeResult t = null;

  @SerializedName("id_old")
  protected Integer idOld = null;

  @SerializedName("type")
  protected String type = null;

  @SerializedName("user")
  protected GeneralMerchantsUser user = null;

  @SerializedName("parent")
  protected ParentModel parent = null;

  @SerializedName("assigned_by")
  protected List<AssignedBy> assignedBy = null;

  @SerializedName("invited_by")
  protected List<InvitedBy> invitedBy = null;

  @SerializedName("legal_details")
  protected List<GeneralMerchantsLegalDetails> legalDetails = null;

  @SerializedName("urls")
  protected List<GeneralMerchantsUrls> urls = null;

  @SerializedName("store_name")
  protected String storeName = null;

  @SerializedName("acceptance_points")
  protected List<BaseProductModel> acceptancePoints = null;

  @SerializedName("two_fa")
  protected String twoFa = null;

  public GeneralMerchantsProductModel l(Integer l) {
    this.l = l;
    return this;
  }

   /**
   * lookup index
   * @return l
  **/
  public Integer getL() {
    return l;
  }

  public void setL(Integer l) {
    this.l = l;
  }

  public GeneralMerchantsProductModel k(Integer k) {
    this.k = k;
    return this;
  }

   /**
   * key index
   * @return k
  **/
  public Integer getK() {
    return k;
  }

  public void setK(Integer k) {
    this.k = k;
  }

  public GeneralMerchantsProductModel ks(String ks) {
    this.ks = ks;
    return this;
  }

   /**
   * key name
   * @return ks
  **/
  public String getKs() {
    return ks;
  }

  public void setKs(String ks) {
    this.ks = ks;
  }

  public GeneralMerchantsProductModel c(Integer c) {
    this.c = c;
    return this;
  }

   /**
   * count (number of items)
   * @return c
  **/
  public Integer getC() {
    return c;
  }

  public void setC(Integer c) {
    this.c = c;
  }

  public GeneralMerchantsProductModel s(Integer s) {
    this.s = s;
    return this;
  }

   /**
   * sum
   * @return s
  **/
  public Integer getS() {
    return s;
  }

  public void setS(Integer s) {
    this.s = s;
  }

  public GeneralMerchantsProductModel t(AggregationTimeResult t) {
    this.t = t;
    return this;
  }

   /**
   * Get t
   * @return t
  **/
  public AggregationTimeResult getT() {
    return t;
  }

  public void setT(AggregationTimeResult t) {
    this.t = t;
  }

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

  public GeneralMerchantsProductModel acceptancePoints(List<BaseProductModel> acceptancePoints) {
    this.acceptancePoints = acceptancePoints;
    return this;
  }

  public GeneralMerchantsProductModel addAcceptancePointsItem(BaseProductModel acceptancePointsItem) {
    if (this.acceptancePoints == null) {
      this.acceptancePoints = new ArrayList<BaseProductModel>();
    }
    this.acceptancePoints.add(acceptancePointsItem);
    return this;
  }

   /**
   * Acceptance Points (partners)
   * @return acceptancePoints
  **/
  public List<BaseProductModel> getAcceptancePoints() {
    return acceptancePoints;
  }

  public void setAcceptancePoints(List<BaseProductModel> acceptancePoints) {
    this.acceptancePoints = acceptancePoints;
  }

  public GeneralMerchantsProductModel twoFa(String twoFa) {
    this.twoFa = twoFa;
    return this;
  }

   /**
   * two-factor authentication type
   * @return twoFa
  **/
  public String getTwoFa() {
    return twoFa;
  }

  public void setTwoFa(String twoFa) {
    this.twoFa = twoFa;
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
    return Objects.equals(this.l, generalMerchantsProductModel.l) &&
        Objects.equals(this.k, generalMerchantsProductModel.k) &&
        Objects.equals(this.ks, generalMerchantsProductModel.ks) &&
        Objects.equals(this.c, generalMerchantsProductModel.c) &&
        Objects.equals(this.s, generalMerchantsProductModel.s) &&
        Objects.equals(this.t, generalMerchantsProductModel.t) &&
        Objects.equals(this.idOld, generalMerchantsProductModel.idOld) &&
        Objects.equals(this.type, generalMerchantsProductModel.type) &&
        Objects.equals(this.user, generalMerchantsProductModel.user) &&
        Objects.equals(this.parent, generalMerchantsProductModel.parent) &&
        Objects.equals(this.assignedBy, generalMerchantsProductModel.assignedBy) &&
        Objects.equals(this.invitedBy, generalMerchantsProductModel.invitedBy) &&
        Objects.equals(this.legalDetails, generalMerchantsProductModel.legalDetails) &&
        Objects.equals(this.urls, generalMerchantsProductModel.urls) &&
        Objects.equals(this.storeName, generalMerchantsProductModel.storeName) &&
        Objects.equals(this.acceptancePoints, generalMerchantsProductModel.acceptancePoints) &&
        Objects.equals(this.twoFa, generalMerchantsProductModel.twoFa) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, idOld, type, user, parent, assignedBy, invitedBy, legalDetails, urls, storeName, acceptancePoints, twoFa, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralMerchantsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    l: ").append(toIndentedString(l)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    ks: ").append(toIndentedString(ks)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    idOld: ").append(toIndentedString(idOld)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    user: ").append(toIndentedString(user)).append("\n");
    sb.append("    parent: ").append(toIndentedString(parent)).append("\n");
    sb.append("    assignedBy: ").append(toIndentedString(assignedBy)).append("\n");
    sb.append("    invitedBy: ").append(toIndentedString(invitedBy)).append("\n");
    sb.append("    legalDetails: ").append(toIndentedString(legalDetails)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    acceptancePoints: ").append(toIndentedString(acceptancePoints)).append("\n");
    sb.append("    twoFa: ").append(toIndentedString(twoFa)).append("\n");
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

