package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.GeneralMerchantsCheckoutOptions;
import io.secuconnect.client.model.GeneralMerchantsLegalDetails;
import io.secuconnect.client.model.GeneralMerchantsUrls;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GeneralMerchantsDTO
 */
public class GeneralMerchantsDTO {
  @SerializedName("legal_details")
  private List<GeneralMerchantsLegalDetails> legalDetails = null;

  @SerializedName("checkout_options")
  private GeneralMerchantsCheckoutOptions checkoutOptions = null;

  @SerializedName("urls")
  private List<GeneralMerchantsUrls> urls = null;

  public GeneralMerchantsDTO legalDetails(List<GeneralMerchantsLegalDetails> legalDetails) {
    this.legalDetails = legalDetails;
    return this;
  }

  public GeneralMerchantsDTO addLegalDetailsItem(GeneralMerchantsLegalDetails legalDetailsItem) {
    if (this.legalDetails == null) {
      this.legalDetails = new ArrayList<GeneralMerchantsLegalDetails>();
    }
    this.legalDetails.add(legalDetailsItem);
    return this;
  }

   /**
   * Legal details
   * @return legalDetails
  **/
  @ApiModelProperty(value = "Legal details")
  public List<GeneralMerchantsLegalDetails> getLegalDetails() {
    return legalDetails;
  }

  public void setLegalDetails(List<GeneralMerchantsLegalDetails> legalDetails) {
    this.legalDetails = legalDetails;
  }

  public GeneralMerchantsDTO checkoutOptions(GeneralMerchantsCheckoutOptions checkoutOptions) {
    this.checkoutOptions = checkoutOptions;
    return this;
  }

   /**
   * Checkout options
   * @return checkoutOptions
  **/
  @ApiModelProperty(value = "Checkout options")
  public GeneralMerchantsCheckoutOptions getCheckoutOptions() {
    return checkoutOptions;
  }

  public void setCheckoutOptions(GeneralMerchantsCheckoutOptions checkoutOptions) {
    this.checkoutOptions = checkoutOptions;
  }

  public GeneralMerchantsDTO urls(List<GeneralMerchantsUrls> urls) {
    this.urls = urls;
    return this;
  }

  public GeneralMerchantsDTO addUrlsItem(GeneralMerchantsUrls urlsItem) {
    if (this.urls == null) {
      this.urls = new ArrayList<GeneralMerchantsUrls>();
    }
    this.urls.add(urlsItem);
    return this;
  }

   /**
   * Urls
   * @return urls
  **/
  @ApiModelProperty(value = "Urls")
  public List<GeneralMerchantsUrls> getUrls() {
    return urls;
  }

  public void setUrls(List<GeneralMerchantsUrls> urls) {
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
    GeneralMerchantsDTO generalMerchantsDTO = (GeneralMerchantsDTO) o;
    return Objects.equals(this.legalDetails, generalMerchantsDTO.legalDetails) &&
        Objects.equals(this.checkoutOptions, generalMerchantsDTO.checkoutOptions) &&
        Objects.equals(this.urls, generalMerchantsDTO.urls);
  }

  @Override
  public int hashCode() {
    return Objects.hash(legalDetails, checkoutOptions, urls);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralMerchantsDTO {\n");
    
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

