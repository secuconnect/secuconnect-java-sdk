package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.CreatedField;
import com.secuconnect.client.model.IdentrequestPerson;
import com.secuconnect.client.model.IdentrequestRedirectUrls;
import com.secuconnect.client.model.UpdatedField;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * ServicesIdentrequestsProductModel
 */
public class ServicesIdentrequestsProductModel extends BaseProductModel {
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

  @SerializedName("created")
  protected String created = null;

  @SerializedName("updated")
  protected String updated = null;

  @SerializedName("contract")
  protected BaseProductModel contract = null;

  @SerializedName("identcase")
  protected BaseProductModel identcase = null;

  @SerializedName("assignment")
  protected List<BaseProductModel> assignment = null;

  @SerializedName("provider")
  protected String provider = null;

  @SerializedName("type")
  protected String type = null;

  @SerializedName("status")
  protected String status = null;

  @SerializedName("demo")
  protected Boolean demo = null;

  @SerializedName("person")
  protected List<IdentrequestPerson> person = null;

  @SerializedName("owner_transaction_id")
  protected String ownerTransactionId = null;

  @SerializedName("redirect_urls")
  protected IdentrequestRedirectUrls redirectUrls = null;

  @SerializedName("graduation_date")
  protected String graduationDate = null;

  @SerializedName("treated")
  protected Boolean treated = null;

  public ServicesIdentrequestsProductModel l(Integer l) {
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

  public ServicesIdentrequestsProductModel k(Integer k) {
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

  public ServicesIdentrequestsProductModel ks(String ks) {
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

  public ServicesIdentrequestsProductModel c(Integer c) {
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

  public ServicesIdentrequestsProductModel s(Integer s) {
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

  public ServicesIdentrequestsProductModel t(AggregationTimeResult t) {
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

  public ServicesIdentrequestsProductModel created(String created) {
    this.created = created;
    return this;
  }

   /**
   * Get created
   * @return created
  **/
  public String getCreated() {
    return created;
  }

  public void setCreated(String created) {
    this.created = created;
  }

  public ServicesIdentrequestsProductModel updated(String updated) {
    this.updated = updated;
    return this;
  }

   /**
   * Get updated
   * @return updated
  **/
  public String getUpdated() {
    return updated;
  }

  public void setUpdated(String updated) {
    this.updated = updated;
  }

  public ServicesIdentrequestsProductModel contract(BaseProductModel contract) {
    this.contract = contract;
    return this;
  }

   /**
   * Get contract
   * @return contract
  **/
  public BaseProductModel getContract() {
    return contract;
  }

  public void setContract(BaseProductModel contract) {
    this.contract = contract;
  }

  public ServicesIdentrequestsProductModel identcase(BaseProductModel identcase) {
    this.identcase = identcase;
    return this;
  }

   /**
   * Get identcase
   * @return identcase
  **/
  public BaseProductModel getIdentcase() {
    return identcase;
  }

  public void setIdentcase(BaseProductModel identcase) {
    this.identcase = identcase;
  }

  public ServicesIdentrequestsProductModel assignment(List<BaseProductModel> assignment) {
    this.assignment = assignment;
    return this;
  }

  public ServicesIdentrequestsProductModel addAssignmentItem(BaseProductModel assignmentItem) {
    if (this.assignment == null) {
      this.assignment = new ArrayList<BaseProductModel>();
    }
    this.assignment.add(assignmentItem);
    return this;
  }

   /**
   * Get assignment
   * @return assignment
  **/
  public List<BaseProductModel> getAssignment() {
    return assignment;
  }

  public void setAssignment(List<BaseProductModel> assignment) {
    this.assignment = assignment;
  }

  public ServicesIdentrequestsProductModel provider(String provider) {
    this.provider = provider;
    return this;
  }

   /**
   * Get provider
   * @return provider
  **/
  public String getProvider() {
    return provider;
  }

  public void setProvider(String provider) {
    this.provider = provider;
  }

  public ServicesIdentrequestsProductModel type(String type) {
    this.type = type;
    return this;
  }

   /**
   * Get type
   * @return type
  **/
  public String getType() {
    return type;
  }

  public void setType(String type) {
    this.type = type;
  }

  public ServicesIdentrequestsProductModel status(String status) {
    this.status = status;
    return this;
  }

   /**
   * Ident Request status:  * &#x60;\&quot;requested\&quot;&#x60; * &#x60;\&quot;error\&quot;&#x60; * &#x60;\&quot;ok_preliminary\&quot;&#x60; * &#x60;\&quot;failed_preliminary\&quot;&#x60; * &#x60;\&quot;ok\&quot;&#x60; * &#x60;\&quot;failed\&quot;&#x60;
   * @return status
  **/
  public String getStatus() {
    return status;
  }

  public void setStatus(String status) {
    this.status = status;
  }

  public ServicesIdentrequestsProductModel demo(Boolean demo) {
    this.demo = demo;
    return this;
  }

   /**
   * Demo Flag
   * @return demo
  **/
  public Boolean getDemo() {
    return demo;
  }

  public void setDemo(Boolean demo) {
    this.demo = demo;
  }

  public ServicesIdentrequestsProductModel person(List<IdentrequestPerson> person) {
    this.person = person;
    return this;
  }

  public ServicesIdentrequestsProductModel addPersonItem(IdentrequestPerson personItem) {
    if (this.person == null) {
      this.person = new ArrayList<IdentrequestPerson>();
    }
    this.person.add(personItem);
    return this;
  }

   /**
   * Details of the person to be identified
   * @return person
  **/
  public List<IdentrequestPerson> getPerson() {
    return person;
  }

  public void setPerson(List<IdentrequestPerson> person) {
    this.person = person;
  }

  public ServicesIdentrequestsProductModel ownerTransactionId(String ownerTransactionId) {
    this.ownerTransactionId = ownerTransactionId;
    return this;
  }

   /**
   * Arbitrary ID to identify the Ident Request on the merchant&#x27;s site
   * @return ownerTransactionId
  **/
  public String getOwnerTransactionId() {
    return ownerTransactionId;
  }

  public void setOwnerTransactionId(String ownerTransactionId) {
    this.ownerTransactionId = ownerTransactionId;
  }

  public ServicesIdentrequestsProductModel redirectUrls(IdentrequestRedirectUrls redirectUrls) {
    this.redirectUrls = redirectUrls;
    return this;
  }

   /**
   * Get redirectUrls
   * @return redirectUrls
  **/
  public IdentrequestRedirectUrls getRedirectUrls() {
    return redirectUrls;
  }

  public void setRedirectUrls(IdentrequestRedirectUrls redirectUrls) {
    this.redirectUrls = redirectUrls;
  }

  public ServicesIdentrequestsProductModel graduationDate(String graduationDate) {
    this.graduationDate = graduationDate;
    return this;
  }

   /**
   * Get graduationDate
   * @return graduationDate
  **/
  public String getGraduationDate() {
    return graduationDate;
  }

  public void setGraduationDate(String graduationDate) {
    this.graduationDate = graduationDate;
  }

   /**
   * Flag to see if the Ident Request was processed by secupay
   * @return treated
  **/
  public Boolean getTreated() {
    return treated;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    ServicesIdentrequestsProductModel servicesIdentrequestsProductModel = (ServicesIdentrequestsProductModel) o;
    return Objects.equals(this.l, servicesIdentrequestsProductModel.l) &&
        Objects.equals(this.k, servicesIdentrequestsProductModel.k) &&
        Objects.equals(this.ks, servicesIdentrequestsProductModel.ks) &&
        Objects.equals(this.c, servicesIdentrequestsProductModel.c) &&
        Objects.equals(this.s, servicesIdentrequestsProductModel.s) &&
        Objects.equals(this.t, servicesIdentrequestsProductModel.t) &&
        Objects.equals(this.created, servicesIdentrequestsProductModel.created) &&
        Objects.equals(this.updated, servicesIdentrequestsProductModel.updated) &&
        Objects.equals(this.contract, servicesIdentrequestsProductModel.contract) &&
        Objects.equals(this.identcase, servicesIdentrequestsProductModel.identcase) &&
        Objects.equals(this.assignment, servicesIdentrequestsProductModel.assignment) &&
        Objects.equals(this.provider, servicesIdentrequestsProductModel.provider) &&
        Objects.equals(this.type, servicesIdentrequestsProductModel.type) &&
        Objects.equals(this.status, servicesIdentrequestsProductModel.status) &&
        Objects.equals(this.demo, servicesIdentrequestsProductModel.demo) &&
        Objects.equals(this.person, servicesIdentrequestsProductModel.person) &&
        Objects.equals(this.ownerTransactionId, servicesIdentrequestsProductModel.ownerTransactionId) &&
        Objects.equals(this.redirectUrls, servicesIdentrequestsProductModel.redirectUrls) &&
        Objects.equals(this.graduationDate, servicesIdentrequestsProductModel.graduationDate) &&
        Objects.equals(this.treated, servicesIdentrequestsProductModel.treated) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, created, updated, contract, identcase, assignment, provider, type, status, demo, person, ownerTransactionId, redirectUrls, graduationDate, treated, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class ServicesIdentrequestsProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    l: ").append(toIndentedString(l)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    ks: ").append(toIndentedString(ks)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    contract: ").append(toIndentedString(contract)).append("\n");
    sb.append("    identcase: ").append(toIndentedString(identcase)).append("\n");
    sb.append("    assignment: ").append(toIndentedString(assignment)).append("\n");
    sb.append("    provider: ").append(toIndentedString(provider)).append("\n");
    sb.append("    type: ").append(toIndentedString(type)).append("\n");
    sb.append("    status: ").append(toIndentedString(status)).append("\n");
    sb.append("    demo: ").append(toIndentedString(demo)).append("\n");
    sb.append("    person: ").append(toIndentedString(person)).append("\n");
    sb.append("    ownerTransactionId: ").append(toIndentedString(ownerTransactionId)).append("\n");
    sb.append("    redirectUrls: ").append(toIndentedString(redirectUrls)).append("\n");
    sb.append("    graduationDate: ").append(toIndentedString(graduationDate)).append("\n");
    sb.append("    treated: ").append(toIndentedString(treated)).append("\n");
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

