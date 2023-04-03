package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.Address;
import com.secuconnect.client.model.OpenHours;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GeneralStoresDTO
 */
public class GeneralStoresDTO {
  @SerializedName("name")
  private String name = null;

  @SerializedName("merchant")
  private String merchant = null;

  @SerializedName("address")
  private Address address = null;

  @SerializedName("facebook_id")
  private String facebookId = null;

  @SerializedName("phone")
  private String phone = null;

  @SerializedName("url_website")
  private String urlWebsite = null;

  @SerializedName("photo_main")
  private String photoMain = null;

  @SerializedName("photo")
  private List<String> photo = null;

  @SerializedName("open_hours")
  private List<OpenHours> openHours = null;

  public GeneralStoresDTO name(String name) {
    this.name = name;
    return this;
  }

   /**
   * Name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GeneralStoresDTO merchant(String merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Merchant
   * @return merchant
  **/
  public String getMerchant() {
    return merchant;
  }

  public void setMerchant(String merchant) {
    this.merchant = merchant;
  }

  public GeneralStoresDTO address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * Get address
   * @return address
  **/
  public Address getAddress() {
    return address;
  }

  public void setAddress(Address address) {
    this.address = address;
  }

  public GeneralStoresDTO facebookId(String facebookId) {
    this.facebookId = facebookId;
    return this;
  }

   /**
   * New facebook ID
   * @return facebookId
  **/
  public String getFacebookId() {
    return facebookId;
  }

  public void setFacebookId(String facebookId) {
    this.facebookId = facebookId;
  }

  public GeneralStoresDTO phone(String phone) {
    this.phone = phone;
    return this;
  }

   /**
   * New phone number
   * @return phone
  **/
  public String getPhone() {
    return phone;
  }

  public void setPhone(String phone) {
    this.phone = phone;
  }

  public GeneralStoresDTO urlWebsite(String urlWebsite) {
    this.urlWebsite = urlWebsite;
    return this;
  }

   /**
   * New URL to general store website
   * @return urlWebsite
  **/
  public String getUrlWebsite() {
    return urlWebsite;
  }

  public void setUrlWebsite(String urlWebsite) {
    this.urlWebsite = urlWebsite;
  }

  public GeneralStoresDTO photoMain(String photoMain) {
    this.photoMain = photoMain;
    return this;
  }

   /**
   * New main photo
   * @return photoMain
  **/
  public String getPhotoMain() {
    return photoMain;
  }

  public void setPhotoMain(String photoMain) {
    this.photoMain = photoMain;
  }

  public GeneralStoresDTO photo(List<String> photo) {
    this.photo = photo;
    return this;
  }

  public GeneralStoresDTO addPhotoItem(String photoItem) {
    if (this.photo == null) {
      this.photo = new ArrayList<String>();
    }
    this.photo.add(photoItem);
    return this;
  }

   /**
   * New photos
   * @return photo
  **/
  public List<String> getPhoto() {
    return photo;
  }

  public void setPhoto(List<String> photo) {
    this.photo = photo;
  }

  public GeneralStoresDTO openHours(List<OpenHours> openHours) {
    this.openHours = openHours;
    return this;
  }

  public GeneralStoresDTO addOpenHoursItem(OpenHours openHoursItem) {
    if (this.openHours == null) {
      this.openHours = new ArrayList<OpenHours>();
    }
    this.openHours.add(openHoursItem);
    return this;
  }

   /**
   * Opening hours per weekday
   * @return openHours
  **/
  public List<OpenHours> getOpenHours() {
    return openHours;
  }

  public void setOpenHours(List<OpenHours> openHours) {
    this.openHours = openHours;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralStoresDTO generalStoresDTO = (GeneralStoresDTO) o;
    return Objects.equals(this.name, generalStoresDTO.name) &&
        Objects.equals(this.merchant, generalStoresDTO.merchant) &&
        Objects.equals(this.address, generalStoresDTO.address) &&
        Objects.equals(this.facebookId, generalStoresDTO.facebookId) &&
        Objects.equals(this.phone, generalStoresDTO.phone) &&
        Objects.equals(this.urlWebsite, generalStoresDTO.urlWebsite) &&
        Objects.equals(this.photoMain, generalStoresDTO.photoMain) &&
        Objects.equals(this.photo, generalStoresDTO.photo) &&
        Objects.equals(this.openHours, generalStoresDTO.openHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(name, merchant, address, facebookId, phone, urlWebsite, photoMain, photo, openHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralStoresDTO {\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    address: ").append(toIndentedString(address)).append("\n");
    sb.append("    facebookId: ").append(toIndentedString(facebookId)).append("\n");
    sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
    sb.append("    urlWebsite: ").append(toIndentedString(urlWebsite)).append("\n");
    sb.append("    photoMain: ").append(toIndentedString(photoMain)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    openHours: ").append(toIndentedString(openHours)).append("\n");
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

