package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.GeneralMerchantsLegalDetails;
import com.secuconnect.client.model.GeneralMerchantsUrls;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GeneralMerchantsPublicDataDTO
 */
public class GeneralMerchantsPublicDataDTO {
  @SerializedName("legal_details")
  protected List<GeneralMerchantsLegalDetails> legalDetails = null;

  @SerializedName("merchant_urls")
  protected List<GeneralMerchantsUrls> merchantUrls = null;

  public GeneralMerchantsPublicDataDTO legalDetails(List<GeneralMerchantsLegalDetails> legalDetails) {
    this.legalDetails = legalDetails;
    return this;
  }

  public GeneralMerchantsPublicDataDTO addLegalDetailsItem(GeneralMerchantsLegalDetails legalDetailsItem) {
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

  public GeneralMerchantsPublicDataDTO merchantUrls(List<GeneralMerchantsUrls> merchantUrls) {
    this.merchantUrls = merchantUrls;
    return this;
  }

  public GeneralMerchantsPublicDataDTO addMerchantUrlsItem(GeneralMerchantsUrls merchantUrlsItem) {
    if (this.merchantUrls == null) {
      this.merchantUrls = new ArrayList<GeneralMerchantsUrls>();
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
    GeneralMerchantsPublicDataDTO generalMerchantsPublicDataDTO = (GeneralMerchantsPublicDataDTO) o;
    return Objects.equals(this.legalDetails, generalMerchantsPublicDataDTO.legalDetails) &&
        Objects.equals(this.merchantUrls, generalMerchantsPublicDataDTO.merchantUrls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalDetails, merchantUrls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralMerchantsPublicDataDTO {\n");
    sb.append("    legalDetails: ").append(toIndentedString(legalDetails)).append("\n");
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

