package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;
import com.secuconnect.client.model.AddressComponents;
import com.secuconnect.client.model.AssignedBy;
import com.secuconnect.client.model.BaseProductModel;
import com.secuconnect.client.model.GeoAddressGeometry;
import com.secuconnect.client.model.InvitedBy;
import com.secuconnect.client.model.OpenHours;
import com.secuconnect.client.model.ProductInstanceUID;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GeneralStoresProductModel
 */
public class GeneralStoresProductModel extends BaseProductModel {
  @SerializedName("id_old")
  private String idOld = null;

  @SerializedName("merchant")
  private ProductInstanceUID merchant = null;

  @SerializedName("store_name")
  private String storeName = null;

  @SerializedName("facebook_id")
  private String facebookId = null;

  @SerializedName("source")
  private String source = null;

  @SerializedName("key")
  private String key = null;

  @SerializedName("hash")
  private String hash = null;

  @SerializedName("address_components")
  private List<AddressComponents> addressComponents = null;

  @SerializedName("address_formatted")
  private String addressFormatted = null;

  @SerializedName("phone_number_formatted")
  private String phoneNumberFormatted = null;

  @SerializedName("geometry")
  private GeoAddressGeometry geometry = null;

  @SerializedName("name")
  private String name = null;

  @SerializedName("name_raw")
  private String nameRaw = null;

  @SerializedName("photo_main")
  private String photoMain = null;

  @SerializedName("photo")
  private List<String> photo = null;

  @SerializedName("category_main")
  private String categoryMain = null;

  @SerializedName("category")
  private List<String> category = null;

  @SerializedName("url_googleplus")
  private String urlGoogleplus = null;

  @SerializedName("url_website")
  private String urlWebsite = null;

  @SerializedName("open_hours")
  private List<OpenHours> openHours = null;

  @SerializedName("open_now")
  private Boolean openNow = null;

  @SerializedName("open_time")
  private String openTime = null;

  @SerializedName("utc_offset")
  private String utcOffset = null;

  @SerializedName("assigned_by")
  private List<AssignedBy> assignedBy = null;

  @SerializedName("invited_by")
  private List<InvitedBy> invitedBy = null;

  @SerializedName("has_beacon")
  private Boolean hasBeacon = null;

  @SerializedName("acceptance_point")
  private Boolean acceptancePoint = null;

  public GeneralStoresProductModel idOld(String idOld) {
    this.idOld = idOld;
    return this;
  }

   /**
   * Old id of general store
   * @return idOld
  **/
  public String getIdOld() {
    return idOld;
  }

  public void setIdOld(String idOld) {
    this.idOld = idOld;
  }

  public GeneralStoresProductModel merchant(ProductInstanceUID merchant) {
    this.merchant = merchant;
    return this;
  }

   /**
   * Get merchant
   * @return merchant
  **/
  public ProductInstanceUID getMerchant() {
    return merchant;
  }

  public void setMerchant(ProductInstanceUID merchant) {
    this.merchant = merchant;
  }

  public GeneralStoresProductModel storeName(String storeName) {
    this.storeName = storeName;
    return this;
  }

   /**
   * Store Name
   * @return storeName
  **/
  public String getStoreName() {
    return storeName;
  }

  public void setStoreName(String storeName) {
    this.storeName = storeName;
  }

  public GeneralStoresProductModel facebookId(String facebookId) {
    this.facebookId = facebookId;
    return this;
  }

   /**
   * Facebook id
   * @return facebookId
  **/
  public String getFacebookId() {
    return facebookId;
  }

  public void setFacebookId(String facebookId) {
    this.facebookId = facebookId;
  }

  public GeneralStoresProductModel source(String source) {
    this.source = source;
    return this;
  }

   /**
   * Source
   * @return source
  **/
  public String getSource() {
    return source;
  }

  public void setSource(String source) {
    this.source = source;
  }

  public GeneralStoresProductModel key(String key) {
    this.key = key;
    return this;
  }

   /**
   * Key
   * @return key
  **/
  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public GeneralStoresProductModel hash(String hash) {
    this.hash = hash;
    return this;
  }

   /**
   * Hash
   * @return hash
  **/
  public String getHash() {
    return hash;
  }

  public void setHash(String hash) {
    this.hash = hash;
  }

  public GeneralStoresProductModel addressComponents(List<AddressComponents> addressComponents) {
    this.addressComponents = addressComponents;
    return this;
  }

  public GeneralStoresProductModel addAddressComponentsItem(AddressComponents addressComponentsItem) {
    if (this.addressComponents == null) {
      this.addressComponents = new ArrayList<>();
    }
    this.addressComponents.add(addressComponentsItem);
    return this;
  }

   /**
   * Address components
   * @return addressComponents
  **/
  public List<AddressComponents> getAddressComponents() {
    return addressComponents;
  }

  public void setAddressComponents(List<AddressComponents> addressComponents) {
    this.addressComponents = addressComponents;
  }

  public GeneralStoresProductModel addressFormatted(String addressFormatted) {
    this.addressFormatted = addressFormatted;
    return this;
  }

   /**
   * General store formatted address
   * @return addressFormatted
  **/
  public String getAddressFormatted() {
    return addressFormatted;
  }

  public void setAddressFormatted(String addressFormatted) {
    this.addressFormatted = addressFormatted;
  }

  public GeneralStoresProductModel phoneNumberFormatted(String phoneNumberFormatted) {
    this.phoneNumberFormatted = phoneNumberFormatted;
    return this;
  }

   /**
   * General store formatted phone number
   * @return phoneNumberFormatted
  **/
  public String getPhoneNumberFormatted() {
    return phoneNumberFormatted;
  }

  public void setPhoneNumberFormatted(String phoneNumberFormatted) {
    this.phoneNumberFormatted = phoneNumberFormatted;
  }

  public GeneralStoresProductModel geometry(GeoAddressGeometry geometry) {
    this.geometry = geometry;
    return this;
  }

   /**
   * Get geometry
   * @return geometry
  **/
  public GeoAddressGeometry getGeometry() {
    return geometry;
  }

  public void setGeometry(GeoAddressGeometry geometry) {
    this.geometry = geometry;
  }

  public GeneralStoresProductModel name(String name) {
    this.name = name;
    return this;
  }

   /**
   * General store name
   * @return name
  **/
  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  public GeneralStoresProductModel nameRaw(String nameRaw) {
    this.nameRaw = nameRaw;
    return this;
  }

   /**
   * General store raw name
   * @return nameRaw
  **/
  public String getNameRaw() {
    return nameRaw;
  }

  public void setNameRaw(String nameRaw) {
    this.nameRaw = nameRaw;
  }

  public GeneralStoresProductModel photoMain(String photoMain) {
    this.photoMain = photoMain;
    return this;
  }

   /**
   * General store main photo
   * @return photoMain
  **/
  public String getPhotoMain() {
    return photoMain;
  }

  public void setPhotoMain(String photoMain) {
    this.photoMain = photoMain;
  }

  public GeneralStoresProductModel photo(List<String> photo) {
    this.photo = photo;
    return this;
  }

  public GeneralStoresProductModel addPhotoItem(String photoItem) {
    if (this.photo == null) {
      this.photo = new ArrayList<>();
    }
    this.photo.add(photoItem);
    return this;
  }

   /**
   * General store photos
   * @return photo
  **/
  public List<String> getPhoto() {
    return photo;
  }

  public void setPhoto(List<String> photo) {
    this.photo = photo;
  }

  public GeneralStoresProductModel categoryMain(String categoryMain) {
    this.categoryMain = categoryMain;
    return this;
  }

   /**
   * General store main category
   * @return categoryMain
  **/
  public String getCategoryMain() {
    return categoryMain;
  }

  public void setCategoryMain(String categoryMain) {
    this.categoryMain = categoryMain;
  }

  public GeneralStoresProductModel category(List<String> category) {
    this.category = category;
    return this;
  }

  public GeneralStoresProductModel addCategoryItem(String categoryItem) {
    if (this.category == null) {
      this.category = new ArrayList<>();
    }
    this.category.add(categoryItem);
    return this;
  }

   /**
   * General store category
   * @return category
  **/
  public List<String> getCategory() {
    return category;
  }

  public void setCategory(List<String> category) {
    this.category = category;
  }

  public GeneralStoresProductModel urlGoogleplus(String urlGoogleplus) {
    this.urlGoogleplus = urlGoogleplus;
    return this;
  }

   /**
   * Url to general store google plus
   * @return urlGoogleplus
  **/
  public String getUrlGoogleplus() {
    return urlGoogleplus;
  }

  public void setUrlGoogleplus(String urlGoogleplus) {
    this.urlGoogleplus = urlGoogleplus;
  }

  public GeneralStoresProductModel urlWebsite(String urlWebsite) {
    this.urlWebsite = urlWebsite;
    return this;
  }

   /**
   * Url to general store website
   * @return urlWebsite
  **/
  public String getUrlWebsite() {
    return urlWebsite;
  }

  public void setUrlWebsite(String urlWebsite) {
    this.urlWebsite = urlWebsite;
  }

  public GeneralStoresProductModel openHours(List<OpenHours> openHours) {
    this.openHours = openHours;
    return this;
  }

  public GeneralStoresProductModel addOpenHoursItem(OpenHours openHoursItem) {
    if (this.openHours == null) {
      this.openHours = new ArrayList<>();
    }
    this.openHours.add(openHoursItem);
    return this;
  }

   /**
   * Open hours in every day
   * @return openHours
  **/
  public List<OpenHours> getOpenHours() {
    return openHours;
  }

  public void setOpenHours(List<OpenHours> openHours) {
    this.openHours = openHours;
  }

  public GeneralStoresProductModel openNow(Boolean openNow) {
    this.openNow = openNow;
    return this;
  }

   /**
   * Open now
   * @return openNow
  **/
  public Boolean getOpenNow() {
    return openNow;
  }

  public void setOpenNow(Boolean openNow) {
    this.openNow = openNow;
  }

  public GeneralStoresProductModel openTime(String openTime) {
    this.openTime = openTime;
    return this;
  }

   /**
   * Open time
   * @return openTime
  **/
  public String getOpenTime() {
    return openTime;
  }

  public void setOpenTime(String openTime) {
    this.openTime = openTime;
  }

  public GeneralStoresProductModel utcOffset(String utcOffset) {
    this.utcOffset = utcOffset;
    return this;
  }

   /**
   * Utc offset
   * @return utcOffset
  **/
  public String getUtcOffset() {
    return utcOffset;
  }

  public void setUtcOffset(String utcOffset) {
    this.utcOffset = utcOffset;
  }

  public GeneralStoresProductModel assignedBy(List<AssignedBy> assignedBy) {
    this.assignedBy = assignedBy;
    return this;
  }

  public GeneralStoresProductModel addAssignedByItem(AssignedBy assignedByItem) {
    if (this.assignedBy == null) {
      this.assignedBy = new ArrayList<>();
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

  public GeneralStoresProductModel invitedBy(List<InvitedBy> invitedBy) {
    this.invitedBy = invitedBy;
    return this;
  }

  public GeneralStoresProductModel addInvitedByItem(InvitedBy invitedByItem) {
    if (this.invitedBy == null) {
      this.invitedBy = new ArrayList<>();
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

  public GeneralStoresProductModel hasBeacon(Boolean hasBeacon) {
    this.hasBeacon = hasBeacon;
    return this;
  }

   /**
   * Has beacon
   * @return hasBeacon
  **/
  public Boolean getHasBeacon() {
    return hasBeacon;
  }

  public void setHasBeacon(Boolean hasBeacon) {
    this.hasBeacon = hasBeacon;
  }

  public GeneralStoresProductModel acceptancePoint(Boolean acceptancePoint) {
    this.acceptancePoint = acceptancePoint;
    return this;
  }

   /**
   * Is Acceptance Point
   * @return acceptancePoint
  **/
  public Boolean getAcceptancePoint() {
    return acceptancePoint;
  }

  public void setAcceptancePoint(Boolean acceptancePoint) {
    this.acceptancePoint = acceptancePoint;
  }

  @Override
  public boolean equals(Object o) {
    if (this == o) {
      return true;
    }
    if (o == null || getClass() != o.getClass()) {
      return false;
    }
    GeneralStoresProductModel generalStoresProductModel = (GeneralStoresProductModel) o;
    return Objects.equals(this.idOld, generalStoresProductModel.idOld) &&
        Objects.equals(this.merchant, generalStoresProductModel.merchant) &&
        Objects.equals(this.storeName, generalStoresProductModel.storeName) &&
        Objects.equals(this.facebookId, generalStoresProductModel.facebookId) &&
        Objects.equals(this.source, generalStoresProductModel.source) &&
        Objects.equals(this.key, generalStoresProductModel.key) &&
        Objects.equals(this.hash, generalStoresProductModel.hash) &&
        Objects.equals(this.addressComponents, generalStoresProductModel.addressComponents) &&
        Objects.equals(this.addressFormatted, generalStoresProductModel.addressFormatted) &&
        Objects.equals(this.phoneNumberFormatted, generalStoresProductModel.phoneNumberFormatted) &&
        Objects.equals(this.geometry, generalStoresProductModel.geometry) &&
        Objects.equals(this.name, generalStoresProductModel.name) &&
        Objects.equals(this.nameRaw, generalStoresProductModel.nameRaw) &&
        Objects.equals(this.photoMain, generalStoresProductModel.photoMain) &&
        Objects.equals(this.photo, generalStoresProductModel.photo) &&
        Objects.equals(this.categoryMain, generalStoresProductModel.categoryMain) &&
        Objects.equals(this.category, generalStoresProductModel.category) &&
        Objects.equals(this.urlGoogleplus, generalStoresProductModel.urlGoogleplus) &&
        Objects.equals(this.urlWebsite, generalStoresProductModel.urlWebsite) &&
        Objects.equals(this.openHours, generalStoresProductModel.openHours) &&
        Objects.equals(this.openNow, generalStoresProductModel.openNow) &&
        Objects.equals(this.openTime, generalStoresProductModel.openTime) &&
        Objects.equals(this.utcOffset, generalStoresProductModel.utcOffset) &&
        Objects.equals(this.assignedBy, generalStoresProductModel.assignedBy) &&
        Objects.equals(this.invitedBy, generalStoresProductModel.invitedBy) &&
        Objects.equals(this.hasBeacon, generalStoresProductModel.hasBeacon) &&
        Objects.equals(this.acceptancePoint, generalStoresProductModel.acceptancePoint) &&
        super.equals(o);
  }

  @Override
  public int hashCode() {
    return Objects.hash(idOld, merchant, storeName, facebookId, source, key, hash, addressComponents, addressFormatted, phoneNumberFormatted, geometry, name, nameRaw, photoMain, photo, categoryMain, category, urlGoogleplus, urlWebsite, openHours, openNow, openTime, utcOffset, assignedBy, invitedBy, hasBeacon, acceptancePoint, super.hashCode());
  }

  @Override
  public String toString() {
    StringBuilder sb = new StringBuilder();
    sb.append("class GeneralStoresProductModel {\n");
    sb.append("    ").append(toIndentedString(super.toString())).append("\n");
    sb.append("    idOld: ").append(toIndentedString(idOld)).append("\n");
    sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
    sb.append("    storeName: ").append(toIndentedString(storeName)).append("\n");
    sb.append("    facebookId: ").append(toIndentedString(facebookId)).append("\n");
    sb.append("    source: ").append(toIndentedString(source)).append("\n");
    sb.append("    key: ").append(toIndentedString(key)).append("\n");
    sb.append("    hash: ").append(toIndentedString(hash)).append("\n");
    sb.append("    addressComponents: ").append(toIndentedString(addressComponents)).append("\n");
    sb.append("    addressFormatted: ").append(toIndentedString(addressFormatted)).append("\n");
    sb.append("    phoneNumberFormatted: ").append(toIndentedString(phoneNumberFormatted)).append("\n");
    sb.append("    geometry: ").append(toIndentedString(geometry)).append("\n");
    sb.append("    name: ").append(toIndentedString(name)).append("\n");
    sb.append("    nameRaw: ").append(toIndentedString(nameRaw)).append("\n");
    sb.append("    photoMain: ").append(toIndentedString(photoMain)).append("\n");
    sb.append("    photo: ").append(toIndentedString(photo)).append("\n");
    sb.append("    categoryMain: ").append(toIndentedString(categoryMain)).append("\n");
    sb.append("    category: ").append(toIndentedString(category)).append("\n");
    sb.append("    urlGoogleplus: ").append(toIndentedString(urlGoogleplus)).append("\n");
    sb.append("    urlWebsite: ").append(toIndentedString(urlWebsite)).append("\n");
    sb.append("    openHours: ").append(toIndentedString(openHours)).append("\n");
    sb.append("    openNow: ").append(toIndentedString(openNow)).append("\n");
    sb.append("    openTime: ").append(toIndentedString(openTime)).append("\n");
    sb.append("    utcOffset: ").append(toIndentedString(utcOffset)).append("\n");
    sb.append("    assignedBy: ").append(toIndentedString(assignedBy)).append("\n");
    sb.append("    invitedBy: ").append(toIndentedString(invitedBy)).append("\n");
    sb.append("    hasBeacon: ").append(toIndentedString(hasBeacon)).append("\n");
    sb.append("    acceptancePoint: ").append(toIndentedString(acceptancePoint)).append("\n");
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

