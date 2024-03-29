package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AggregationResult;
import com.secuconnect.client.model.AggregationTimeResult;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.CreatedField;
import com.secuconnect.client.model.SmartTemplatesComponentModel;
import com.secuconnect.client.model.UpdatedField;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * SmartTemplatesProductModel
 */
public class SmartTemplatesProductModel extends BaseProductModel {
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

  @SerializedName("name")
  protected String name = null;

  @SerializedName("description")
  protected String description = null;

  @SerializedName("default_language")
  protected String defaultLanguage = null;

  @SerializedName("header")
  protected List<SmartTemplatesComponentModel> header = null;

  @SerializedName("footer")
  protected List<SmartTemplatesComponentModel> footer = null;

  @SerializedName("pages")
  protected List<SmartTemplatesComponentModel> pages = null;

  public SmartTemplatesProductModel l(Integer l) {
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

  public SmartTemplatesProductModel k(Integer k) {
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

  public SmartTemplatesProductModel ks(String ks) {
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

  public SmartTemplatesProductModel c(Integer c) {
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

  public SmartTemplatesProductModel s(Integer s) {
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

  public SmartTemplatesProductModel t(AggregationTimeResult t) {
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

  public SmartTemplatesProductModel created(String created) {
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

  public SmartTemplatesProductModel updated(String updated) {
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

  public SmartTemplatesProductModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name of smart template
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public SmartTemplatesProductModel description(String description) {
    this.description = description;
    return this;
  }

   /**
   * Description of smart template
   * @return description
  **/
  public String getDescription() {
    return description;
  }

  public void setDescription(String description) {
    this.description = description;
  }

  public SmartTemplatesProductModel defaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
    return this;
  }

   /**
   * Default Language configured for this template
   * @return defaultLanguage
  **/
  public String getDefaultLanguage() {
    return defaultLanguage;
  }

  public void setDefaultLanguage(String defaultLanguage) {
    this.defaultLanguage = defaultLanguage;
  }

  public SmartTemplatesProductModel header(List<SmartTemplatesComponentModel> header) {
    this.header = header;
    return this;
  }

  public SmartTemplatesProductModel addHeaderItem(SmartTemplatesComponentModel headerItem) {
    if (this.header == null) {
      this.header = new ArrayList<SmartTemplatesComponentModel>();
    }
    this.header.add(headerItem);
    return this;
  }

   /**
   * Header definition of smart template
   * @return header
  **/
  public List<SmartTemplatesComponentModel> getHeader() {
    return header;
  }

  public void setHeader(List<SmartTemplatesComponentModel> header) {
    this.header = header;
  }

  public SmartTemplatesProductModel footer(List<SmartTemplatesComponentModel> footer) {
    this.footer = footer;
    return this;
  }

  public SmartTemplatesProductModel addFooterItem(SmartTemplatesComponentModel footerItem) {
    if (this.footer == null) {
      this.footer = new ArrayList<SmartTemplatesComponentModel>();
    }
    this.footer.add(footerItem);
    return this;
  }

   /**
   * Footer definition of smart template
   * @return footer
  **/
  public List<SmartTemplatesComponentModel> getFooter() {
    return footer;
  }

  public void setFooter(List<SmartTemplatesComponentModel> footer) {
    this.footer = footer;
  }

  public SmartTemplatesProductModel pages(List<SmartTemplatesComponentModel> pages) {
    this.pages = pages;
    return this;
  }

  public SmartTemplatesProductModel addPagesItem(SmartTemplatesComponentModel pagesItem) {
    if (this.pages == null) {
      this.pages = new ArrayList<SmartTemplatesComponentModel>();
    }
    this.pages.add(pagesItem);
    return this;
  }

   /**
   * Definition of different pages in smart template
   * @return pages
  **/
  public List<SmartTemplatesComponentModel> getPages() {
    return pages;
  }

  public void setPages(List<SmartTemplatesComponentModel> pages) {
    this.pages = pages;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    SmartTemplatesProductModel smartTemplatesProductModel = (SmartTemplatesProductModel) o;
    return Objects.equals(this.l, smartTemplatesProductModel.l) &&
        Objects.equals(this.k, smartTemplatesProductModel.k) &&
        Objects.equals(this.ks, smartTemplatesProductModel.ks) &&
        Objects.equals(this.c, smartTemplatesProductModel.c) &&
        Objects.equals(this.s, smartTemplatesProductModel.s) &&
        Objects.equals(this.t, smartTemplatesProductModel.t) &&
        Objects.equals(this.created, smartTemplatesProductModel.created) &&
        Objects.equals(this.updated, smartTemplatesProductModel.updated) &&
        Objects.equals(this.name, smartTemplatesProductModel.name) &&
        Objects.equals(this.description, smartTemplatesProductModel.description) &&
        Objects.equals(this.defaultLanguage, smartTemplatesProductModel.defaultLanguage) &&
        Objects.equals(this.header, smartTemplatesProductModel.header) &&
        Objects.equals(this.footer, smartTemplatesProductModel.footer) &&
        Objects.equals(this.pages, smartTemplatesProductModel.pages) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(l, k, ks, c, s, t, created, updated, name, description, defaultLanguage, header, footer, pages, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class SmartTemplatesProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    l: ").append(toIndentedString(l)).append("\n");
    sb.append("    k: ").append(toIndentedString(k)).append("\n");
    sb.append("    ks: ").append(toIndentedString(ks)).append("\n");
    sb.append("    c: ").append(toIndentedString(c)).append("\n");
    sb.append("    s: ").append(toIndentedString(s)).append("\n");
    sb.append("    t: ").append(toIndentedString(t)).append("\n");
    sb.append("    created: ").append(toIndentedString(created)).append("\n");
    sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    description: ").append(toIndentedString(description)).append("\n");
    sb.append("    defaultLanguage: ").append(toIndentedString(defaultLanguage)).append("\n");
    sb.append("    header: ").append(toIndentedString(header)).append("\n");
    sb.append("    footer: ").append(toIndentedString(footer)).append("\n");
    sb.append("    pages: ").append(toIndentedString(pages)).append("\n");
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

