package io.secuconnect.client.model;

import com.google.gson.TypeAdapter;
import com.google.gson.annotations.JsonAdapter;
import com.google.gson.annotations.SerializedName;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import io.secuconnect.client.model.Address;
import io.secuconnect.client.model.OpenHours;
import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GeneralStoresDTO
 */
public class GeneralStoresDTO {
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

  public GeneralStoresDTO address(Address address) {
    this.address = address;
    return this;
  }

   /**
   * New address
   * @return address
  **/
  @ApiModelProperty(value = "New address")
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
   * New facebook id
   * @return facebookId
  **/
  @ApiModelProperty(value = "New facebook id")
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
  @ApiModelProperty(value = "New phone number")
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
   * New url to general store website
   * @return urlWebsite
  **/
  @ApiModelProperty(value = "New url to general store website")
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
  @ApiModelProperty(value = "New main photo")
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
  @ApiModelProperty(value = "New photos")
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
   * Open hours in every day
   * @return openHours
  **/
  @ApiModelProperty(value = "Open hours in every day")
  public List<OpenHours> getOpenHours() {
    return openHours;
  }

  public void setOpenHours(List<OpenHours> openHours) {
    this.openHours = openHours;
  }

  @Override
  public boolean equals(java.lang.Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralStoresDTO generalStoresDTO = (GeneralStoresDTO) o;
    return Objects.equals(this.address, generalStoresDTO.address) &&
        Objects.equals(this.facebookId, generalStoresDTO.facebookId) &&
        Objects.equals(this.phone, generalStoresDTO.phone) &&
        Objects.equals(this.urlWebsite, generalStoresDTO.urlWebsite) &&
        Objects.equals(this.photoMain, generalStoresDTO.photoMain) &&
        Objects.equals(this.photo, generalStoresDTO.photo) &&
        Objects.equals(this.openHours, generalStoresDTO.openHours);
  }

  @Override
  public int hashCode() {
    return Objects.hash(address, facebookId, phone, urlWebsite, photoMain, photo, openHours);
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralStoresDTO {\n");
    
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
  private String toIndentedString(java.lang.Object o) {
    if (o == null) {
      return "null";
    }
    return o.toString().replace("\n", "\n    ");
  }
}

