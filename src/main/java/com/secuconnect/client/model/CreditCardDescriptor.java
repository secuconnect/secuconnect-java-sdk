package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Credit card data like owner, iban, bic and bank name
 */
public class CreditCardDescriptor implements AnyOfPaymentContainersDTOModelPrivate {
    @SerializedName("owner")
    private String owner = null;

    @SerializedName("pan")
    private String pan = null;

    @SerializedName("expiration_date")
    private String expirationDate = null;

    @SerializedName("issuer")
    private String issuer = null;

    @SerializedName("transact_container")
    private String transactContainer = null;

    @SerializedName("transact_skey_pubkey")
    private String transactSkeyPubkey = null;

    @SerializedName("transact_skey_keyname")
    private String transactSkeyKeyname = null;

    @SerializedName("transact_hash")
    private String transactHash = null;

    public CreditCardDescriptor owner(String owner) {
        this.owner = owner;
        return this;
    }

    /**
     * Owner
     *
     * @return owner
     **/
    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public CreditCardDescriptor pan(String pan) {
        this.pan = pan;
        return this;
    }

    /**
     * truncated Primary Account Number (PAN)
     *
     * @return pan
     **/
    public String getPan() {
        return pan;
    }

    public void setPan(String pan) {
        this.pan = pan;
    }

    public CreditCardDescriptor expirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }

    /**
     * Expiration date
     *
     * @return expirationDate
     **/
    public String getExpirationDate() {
        return expirationDate;
    }

    public void setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
    }

    public CreditCardDescriptor issuer(String issuer) {
        this.issuer = issuer;
        return this;
    }

    /**
     * Card issuer
     *
     * @return issuer
     **/
    public String getIssuer() {
        return issuer;
    }

    public void setIssuer(String issuer) {
        this.issuer = issuer;
    }

    public CreditCardDescriptor transactContainer(String transactContainer) {
        this.transactContainer = transactContainer;
        return this;
    }

    /**
     * transact container
     *
     * @return transactContainer
     **/
    public String getTransactContainer() {
        return transactContainer;
    }

    public void setTransactContainer(String transactContainer) {
        this.transactContainer = transactContainer;
    }

    public CreditCardDescriptor transactSkeyPubkey(String transactSkeyPubkey) {
        this.transactSkeyPubkey = transactSkeyPubkey;
        return this;
    }

    /**
     * transact public key
     *
     * @return transactSkeyPubkey
     **/
    public String getTransactSkeyPubkey() {
        return transactSkeyPubkey;
    }

    public void setTransactSkeyPubkey(String transactSkeyPubkey) {
        this.transactSkeyPubkey = transactSkeyPubkey;
    }

    public CreditCardDescriptor transactSkeyKeyname(String transactSkeyKeyname) {
        this.transactSkeyKeyname = transactSkeyKeyname;
        return this;
    }

    /**
     * transact keyname
     *
     * @return transactSkeyKeyname
     **/
    public String getTransactSkeyKeyname() {
        return transactSkeyKeyname;
    }

    public void setTransactSkeyKeyname(String transactSkeyKeyname) {
        this.transactSkeyKeyname = transactSkeyKeyname;
    }

    public CreditCardDescriptor transactHash(String transactHash) {
        this.transactHash = transactHash;
        return this;
    }

    /**
     * transact hash
     *
     * @return transactHash
     **/
    public String getTransactHash() {
        return transactHash;
    }

    public void setTransactHash(String transactHash) {
        this.transactHash = transactHash;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        CreditCardDescriptor creditCardDescriptor = (CreditCardDescriptor) o;
        return Objects.equals(this.owner, creditCardDescriptor.owner) &&
                Objects.equals(this.pan, creditCardDescriptor.pan) &&
                Objects.equals(this.expirationDate, creditCardDescriptor.expirationDate) &&
                Objects.equals(this.issuer, creditCardDescriptor.issuer) &&
                Objects.equals(this.transactContainer, creditCardDescriptor.transactContainer) &&
                Objects.equals(this.transactSkeyPubkey, creditCardDescriptor.transactSkeyPubkey) &&
                Objects.equals(this.transactSkeyKeyname, creditCardDescriptor.transactSkeyKeyname) &&
                Objects.equals(this.transactHash, creditCardDescriptor.transactHash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(owner, pan, expirationDate, issuer, transactContainer, transactSkeyPubkey, transactSkeyKeyname, transactHash);
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class CreditCardDescriptor {\n");

        sb.append("    owner: ").append(toIndentedString(owner)).append("\n");
        sb.append("    pan: ").append(toIndentedString(pan)).append("\n");
        sb.append("    expirationDate: ").append(toIndentedString(expirationDate)).append("\n");
        sb.append("    issuer: ").append(toIndentedString(issuer)).append("\n");
        sb.append("    transactContainer: ").append(toIndentedString(transactContainer)).append("\n");
        sb.append("    transactSkeyPubkey: ").append(toIndentedString(transactSkeyPubkey)).append("\n");
        sb.append("    transactSkeyKeyname: ").append(toIndentedString(transactSkeyKeyname)).append("\n");
        sb.append("    transactHash: ").append(toIndentedString(transactHash)).append("\n");
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

