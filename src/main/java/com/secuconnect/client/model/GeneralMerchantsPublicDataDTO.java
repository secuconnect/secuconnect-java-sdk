package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.GeneralMerchantsLegalDetailsDTO;
import com.secuconnect.client.model.GeneralMerchantsUrls;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GeneralMerchantsPublicDataDTO
 */
public class GeneralMerchantsPublicDataDTO {
  @SerializedName("legal_details")
  protected List<GeneralMerchantsLegalDetailsDTO> legalDetails = null;

  @SerializedName("urls")
  protected List<GeneralMerchantsUrls> urls = null;

  public GeneralMerchantsPublicDataDTO legalDetails(List<GeneralMerchantsLegalDetailsDTO> legalDetails) {
    this.legalDetails = legalDetails;
    return this;
  }

  public GeneralMerchantsPublicDataDTO addLegalDetailsItem(GeneralMerchantsLegalDetailsDTO legalDetailsItem) {
    if (this.legalDetails == null) {
      this.legalDetails = new ArrayList<GeneralMerchantsLegalDetailsDTO>();
    }
    this.legalDetails.add(legalDetailsItem);
    return this;
  }

   /**
   * Legal details like terms of use, privacy policy, or imprint
   * @return legalDetails
  **/
  public List<GeneralMerchantsLegalDetailsDTO> getLegalDetails() {
    return legalDetails;
  }

  public void setLegalDetails(List<GeneralMerchantsLegalDetailsDTO> legalDetails) {
    this.legalDetails = legalDetails;
  }

  public GeneralMerchantsPublicDataDTO urls(List<GeneralMerchantsUrls> urls) {
    this.urls = urls;
    return this;
  }

  public GeneralMerchantsPublicDataDTO addUrlsItem(GeneralMerchantsUrls urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<GeneralMerchantsUrls>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * Return URLs
   * @return urls
  **/
  public List<GeneralMerchantsUrls> getUrls() {
    return urls;
  }

  public void setUrls(List<GeneralMerchantsUrls> urls) {
    this.urls = urls;
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
        Objects.equals(this.urls, generalMerchantsPublicDataDTO.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalDetails, urls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralMerchantsPublicDataDTO {\n");
    sb.append("    legalDetails: ").append(toIndentedString(legalDetails)).append("\n");
    sb.append("    urls: ").append(toIndentedString(urls)).append("\n");
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

