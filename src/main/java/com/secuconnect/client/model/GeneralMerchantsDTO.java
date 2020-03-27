package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * GeneralMerchantsDTO
 */
public class GeneralMerchantsDTO {
    @SerializedName("salutation")
    private String salutation = null;

    @SerializedName("companyname")
    private String companyname = null;

    @SerializedName("forename")
    private String forename = null;

    @SerializedName("surname")
    private String surname = null;

    @SerializedName("dob")
    private String dob = null;

    @SerializedName("homepage")
    private String homepage = null;

    @SerializedName("email")
    private String email = null;

    @SerializedName("phone")
    private String phone = null;

    @SerializedName("address")
    private Address address = null;

    @SerializedName("payment_data")
    private PaymentInformation paymentData = null;

    @SerializedName("legal_details")
    private List<GeneralMerchantsLegalDetails> legalDetails = null;

    @SerializedName("checkout_options")
    private GeneralMerchantsCheckoutOptions checkoutOptions = null;

    @SerializedName("urls")
    private List<GeneralMerchantsUrls> urls = null;

    public GeneralMerchantsDTO salutation(String salutation) {
        this.salutation = salutation;
        return this;
    }

    /**
     * Salutation
     *
     * @return salutation
     **/
    public String getSalutation() {
        return salutation;
    }

    public void setSalutation(String salutation) {
        this.salutation = salutation;
    }

    public GeneralMerchantsDTO companyname(String companyname) {
        this.companyname = companyname;
        return this;
    }

    /**
     * companyname
     *
     * @return companyname
     **/
    public String getCompanyname() {
        return companyname;
    }

    public void setCompanyname(String companyname) {
        this.companyname = companyname;
    }

    public GeneralMerchantsDTO forename(String forename) {
        this.forename = forename;
        return this;
    }

    /**
     * forename
     *
     * @return forename
     **/
    public String getForename() {
        return forename;
    }

    public void setForename(String forename) {
        this.forename = forename;
    }

    public GeneralMerchantsDTO surname(String surname) {
        this.surname = surname;
        return this;
    }

    /**
     * surname
     *
     * @return surname
     **/
    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public GeneralMerchantsDTO dob(String dob) {
        this.dob = dob;
        return this;
    }

    /**
     * Date of birth
     *
     * @return dob
     **/
    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public GeneralMerchantsDTO homepage(String homepage) {
        this.homepage = homepage;
        return this;
    }

    /**
     * Merchant homepage url or shop url
     *
     * @return homepage
     **/
    public String getHomepage() {
        return homepage;
    }

    public void setHomepage(String homepage) {
        this.homepage = homepage;
    }

    public GeneralMerchantsDTO email(String email) {
        this.email = email;
        return this;
    }

    /**
     * Merchant email address
     *
     * @return email
     **/
    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public GeneralMerchantsDTO phone(String phone) {
        this.phone = phone;
        return this;
    }

    /**
     * Merchant phone number
     *
     * @return phone
     **/
    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public GeneralMerchantsDTO address(Address address) {
        this.address = address;
        return this;
    }

    /**
     * Get address
     *
     * @return address
     **/
    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }

    public GeneralMerchantsDTO paymentData(PaymentInformation paymentData) {
        this.paymentData = paymentData;
        return this;
    }

    /**
     * Get paymentData
     *
     * @return paymentData
     **/
    public PaymentInformation getPaymentData() {
        return paymentData;
    }

    public void setPaymentData(PaymentInformation paymentData) {
        this.paymentData = paymentData;
    }

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
     *
     * @return legalDetails
     **/
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
     * Get checkoutOptions
     *
     * @return checkoutOptions
     **/
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
     *
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
        GeneralMerchantsDTO generalMerchantsDTO = (GeneralMerchantsDTO) o;
        return Objects.equals(this.salutation, generalMerchantsDTO.salutation) &&
                Objects.equals(this.companyname, generalMerchantsDTO.companyname) &&
                Objects.equals(this.forename, generalMerchantsDTO.forename) &&
                Objects.equals(this.surname, generalMerchantsDTO.surname) &&
                Objects.equals(this.dob, generalMerchantsDTO.dob) &&
                Objects.equals(this.homepage, generalMerchantsDTO.homepage) &&
                Objects.equals(this.email, generalMerchantsDTO.email) &&
                Objects.equals(this.phone, generalMerchantsDTO.phone) &&
                Objects.equals(this.address, generalMerchantsDTO.address) &&
                Objects.equals(this.paymentData, generalMerchantsDTO.paymentData) &&
                Objects.equals(this.legalDetails, generalMerchantsDTO.legalDetails) &&
                Objects.equals(this.checkoutOptions, generalMerchantsDTO.checkoutOptions) &&
                Objects.equals(this.urls, generalMerchantsDTO.urls);
    }

    @Override
    public int hashCode() {
        return Objects.hash(salutation, companyname, forename, surname, dob, homepage, email, phone, address, paymentData, legalDetails, checkoutOptions, urls);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class GeneralMerchantsDTO {\n");

        sb.append("    salutation: ").append(toIndentedString(salutation)).append("\n");
        sb.append("    companyname: ").append(toIndentedString(companyname)).append("\n");
        sb.append("    forename: ").append(toIndentedString(forename)).append("\n");
        sb.append("    surname: ").append(toIndentedString(surname)).append("\n");
        sb.append("    dob: ").append(toIndentedString(dob)).append("\n");
        sb.append("    homepage: ").append(toIndentedString(homepage)).append("\n");
        sb.append("    email: ").append(toIndentedString(email)).append("\n");
        sb.append("    phone: ").append(toIndentedString(phone)).append("\n");
        sb.append("    address: ").append(toIndentedString(address)).append("\n");
        sb.append("    paymentData: ").append(toIndentedString(paymentData)).append("\n");
        sb.append("    legalDetails: ").append(toIndentedString(legalDetails)).append("\n");
        sb.append("    checkoutOptions: ").append(toIndentedString(checkoutOptions)).append("\n");
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

