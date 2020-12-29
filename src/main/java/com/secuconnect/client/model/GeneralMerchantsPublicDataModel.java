package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.GeneralMerchantsLegalDetails;
import com.secuconnect.client.model.GeneralMerchantsPublicDataCompany;
import com.secuconnect.client.model.GeneralMerchantsUrls;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GeneralMerchantsPublicDataModel
 */
public class GeneralMerchantsPublicDataModel extends BaseProductModel {
  @SerializedName("legal_details")
  private List<GeneralMerchantsLegalDetails> legalDetails = null;

  @SerializedName("company")
  private GeneralMerchantsPublicDataCompany company = null;

  @SerializedName("merchant_urls")
  private List<GeneralMerchantsUrls> merchantUrls = null;

  public GeneralMerchantsPublicDataModel legalDetails(List<GeneralMerchantsLegalDetails> legalDetails) {
    this.legalDetails = legalDetails;
    return this;
  }

  public GeneralMerchantsPublicDataModel addLegalDetailsItem(GeneralMerchantsLegalDetails legalDetailsItem) {
    if (this.legalDetails == null) {
      this.legalDetails = new ArrayList<>();
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

  public GeneralMerchantsPublicDataModel company(GeneralMerchantsPublicDataCompany company) {
    this.company = company;
    return this;
  }

   /**
   * Get company
   * @return company
  **/
  public GeneralMerchantsPublicDataCompany getCompany() {
    return company;
  }

  public void setCompany(GeneralMerchantsPublicDataCompany company) {
    this.company = company;
  }

  public GeneralMerchantsPublicDataModel merchantUrls(List<GeneralMerchantsUrls> merchantUrls) {
    this.merchantUrls = merchantUrls;
    return this;
  }

  public GeneralMerchantsPublicDataModel addMerchantUrlsItem(GeneralMerchantsUrls merchantUrlsItem) {
    if (this.merchantUrls == null) {
      this.merchantUrls = new ArrayList<>();
    }
    this.merchantUrls.add(merchantUrlsItem);
    return this;
  }

   /**
   * URLs
   * @return merchantUrls
  **/
  public List<GeneralMerchantsUrls> getMerchantUrls() {
    return merchantUrls;
  }

  public void setMerchantUrls(List<GeneralMerchantsUrls> merchantUrls) {
    this.merchantUrls = merchantUrls;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralMerchantsPublicDataModel generalMerchantsPublicDataModel = (GeneralMerchantsPublicDataModel) o;
    return Objects.equals(this.legalDetails, generalMerchantsPublicDataModel.legalDetails) &&
        Objects.equals(this.company, generalMerchantsPublicDataModel.company) &&
        Objects.equals(this.merchantUrls, generalMerchantsPublicDataModel.merchantUrls) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalDetails, company, merchantUrls, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralMerchantsPublicDataModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    legalDetails: ").append(toIndentedString(legalDetails)).append("\n");
    sb.append("    company: ").append(toIndentedString(company)).append("\n");
    sb.append("    merchantUrls: ").append(toIndentedString(merchantUrls)).append("\n");
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

