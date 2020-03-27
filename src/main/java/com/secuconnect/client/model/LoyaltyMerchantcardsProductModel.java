package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.Objects;

/**
 * Loyalty merchant card
 */
public class LoyaltyMerchantcardsProductModel extends BaseProductModel {
    @SerializedName("card")
    private LoyaltyCardsProductModel card = null;

    @SerializedName("merchant")
    private ProductInstanceUID merchant = null;

    @SerializedName("created_for_merchant")
    private ProductInstanceUID createdForMerchant = null;

    @SerializedName("created_for_store")
    private ProductInstanceUID createdForStore = null;

    @SerializedName("customer")
    private LoyaltyCustomersProductModel customer = null;

    @SerializedName("cardgroup")
    private LoyaltyCardgroupsProductModel cardgroup = null;

    @SerializedName("payment_container")
    private LoyaltyMerchantcardsDTOPaymentContainer paymentContainer = null;

    @SerializedName("balance")
    private Integer balance = null;

    @SerializedName("points")
    private Integer points = null;

    @SerializedName("bonus_balance")
    private Integer bonusBalance = null;

    @SerializedName("cash_balance")
    private Integer cashBalance = null;

    @SerializedName("stock_status")
    private String stockStatus = null;

    @SerializedName("lock_status")
    private String lockStatus = null;

    @SerializedName("last_usage")
    private String lastUsage = null;

    @SerializedName("last_charge")
    private String lastCharge = null;

    @SerializedName("is_base_card")
    private Boolean isBaseCard = null;

    @SerializedName("passcode")
    private Integer passcode = null;

    public LoyaltyMerchantcardsProductModel card(LoyaltyCardsProductModel card) {
        this.card = card;
        return this;
    }

    /**
     * Get card
     *
     * @return card
     **/
    public LoyaltyCardsProductModel getCard() {
        return card;
    }

    public void setCard(LoyaltyCardsProductModel card) {
        this.card = card;
    }

    public LoyaltyMerchantcardsProductModel merchant(ProductInstanceUID merchant) {
        this.merchant = merchant;
        return this;
    }

    /**
     * Get merchant
     *
     * @return merchant
     **/
    public ProductInstanceUID getMerchant() {
        return merchant;
    }

    public void setMerchant(ProductInstanceUID merchant) {
        this.merchant = merchant;
    }

    public LoyaltyMerchantcardsProductModel createdForMerchant(ProductInstanceUID createdForMerchant) {
        this.createdForMerchant = createdForMerchant;
        return this;
    }

    /**
     * Get createdForMerchant
     *
     * @return createdForMerchant
     **/
    public ProductInstanceUID getCreatedForMerchant() {
        return createdForMerchant;
    }

    public void setCreatedForMerchant(ProductInstanceUID createdForMerchant) {
        this.createdForMerchant = createdForMerchant;
    }

    public LoyaltyMerchantcardsProductModel createdForStore(ProductInstanceUID createdForStore) {
        this.createdForStore = createdForStore;
        return this;
    }

    /**
     * Get createdForStore
     *
     * @return createdForStore
     **/
    public ProductInstanceUID getCreatedForStore() {
        return createdForStore;
    }

    public void setCreatedForStore(ProductInstanceUID createdForStore) {
        this.createdForStore = createdForStore;
    }

    public LoyaltyMerchantcardsProductModel customer(LoyaltyCustomersProductModel customer) {
        this.customer = customer;
        return this;
    }

    /**
     * Get customer
     *
     * @return customer
     **/
    public LoyaltyCustomersProductModel getCustomer() {
        return customer;
    }

    public void setCustomer(LoyaltyCustomersProductModel customer) {
        this.customer = customer;
    }

    public LoyaltyMerchantcardsProductModel cardgroup(LoyaltyCardgroupsProductModel cardgroup) {
        this.cardgroup = cardgroup;
        return this;
    }

    /**
     * Get cardgroup
     *
     * @return cardgroup
     **/
    public LoyaltyCardgroupsProductModel getCardgroup() {
        return cardgroup;
    }

    public void setCardgroup(LoyaltyCardgroupsProductModel cardgroup) {
        this.cardgroup = cardgroup;
    }

    public LoyaltyMerchantcardsProductModel paymentContainer(LoyaltyMerchantcardsDTOPaymentContainer paymentContainer) {
        this.paymentContainer = paymentContainer;
        return this;
    }

    /**
     * Get paymentContainer
     *
     * @return paymentContainer
     **/
    public LoyaltyMerchantcardsDTOPaymentContainer getPaymentContainer() {
        return paymentContainer;
    }

    public void setPaymentContainer(LoyaltyMerchantcardsDTOPaymentContainer paymentContainer) {
        this.paymentContainer = paymentContainer;
    }

    public LoyaltyMerchantcardsProductModel balance(Integer balance) {
        this.balance = balance;
        return this;
    }

    /**
     * Loyalty merchant card balance
     *
     * @return balance
     **/
    public Integer getBalance() {
        return balance;
    }

    public void setBalance(Integer balance) {
        this.balance = balance;
    }

    public LoyaltyMerchantcardsProductModel points(Integer points) {
        this.points = points;
        return this;
    }

    /**
     * Loyalty merchant card points
     *
     * @return points
     **/
    public Integer getPoints() {
        return points;
    }

    public void setPoints(Integer points) {
        this.points = points;
    }

    public LoyaltyMerchantcardsProductModel bonusBalance(Integer bonusBalance) {
        this.bonusBalance = bonusBalance;
        return this;
    }

    /**
     * Loyalty merchant card bonus balance
     *
     * @return bonusBalance
     **/
    public Integer getBonusBalance() {
        return bonusBalance;
    }

    public void setBonusBalance(Integer bonusBalance) {
        this.bonusBalance = bonusBalance;
    }

    public LoyaltyMerchantcardsProductModel cashBalance(Integer cashBalance) {
        this.cashBalance = cashBalance;
        return this;
    }

    /**
     * Loyalty merchant card cash balance
     *
     * @return cashBalance
     **/
    public Integer getCashBalance() {
        return cashBalance;
    }

    public void setCashBalance(Integer cashBalance) {
        this.cashBalance = cashBalance;
    }

    public LoyaltyMerchantcardsProductModel stockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
        return this;
    }

    /**
     * Loyalty merchant card stock status
     *
     * @return stockStatus
     **/
    public String getStockStatus() {
        return stockStatus;
    }

    public void setStockStatus(String stockStatus) {
        this.stockStatus = stockStatus;
    }

    public LoyaltyMerchantcardsProductModel lockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
        return this;
    }

    /**
     * Loyalty merchant card lock status
     *
     * @return lockStatus
     **/
    public String getLockStatus() {
        return lockStatus;
    }

    public void setLockStatus(String lockStatus) {
        this.lockStatus = lockStatus;
    }

    public LoyaltyMerchantcardsProductModel lastUsage(String lastUsage) {
        this.lastUsage = lastUsage;
        return this;
    }

    /**
     * Loyalty merchant card last usage
     *
     * @return lastUsage
     **/
    public String getLastUsage() {
        return lastUsage;
    }

    public void setLastUsage(String lastUsage) {
        this.lastUsage = lastUsage;
    }

    public LoyaltyMerchantcardsProductModel lastCharge(String lastCharge) {
        this.lastCharge = lastCharge;
        return this;
    }

    /**
     * Loyalty merchant card last charge
     *
     * @return lastCharge
     **/
    public String getLastCharge() {
        return lastCharge;
    }

    public void setLastCharge(String lastCharge) {
        this.lastCharge = lastCharge;
    }

    public LoyaltyMerchantcardsProductModel isBaseCard(Boolean isBaseCard) {
        this.isBaseCard = isBaseCard;
        return this;
    }

    /**
     * Information whether loyalty merchant card is base card
     *
     * @return isBaseCard
     **/
    public Boolean isIsBaseCard() {
        return isBaseCard;
    }

    public void setIsBaseCard(Boolean isBaseCard) {
        this.isBaseCard = isBaseCard;
    }

    public LoyaltyMerchantcardsProductModel passcode(Integer passcode) {
        this.passcode = passcode;
        return this;
    }

    /**
     * Loyalty merchant card passcode
     *
     * @return passcode
     **/
    public Integer getPasscode() {
        return passcode;
    }

    public void setPasscode(Integer passcode) {
        this.passcode = passcode;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoyaltyMerchantcardsProductModel loyaltyMerchantcardsProductModel = (LoyaltyMerchantcardsProductModel) o;
        return Objects.equals(this.card, loyaltyMerchantcardsProductModel.card) &&
                Objects.equals(this.merchant, loyaltyMerchantcardsProductModel.merchant) &&
                Objects.equals(this.createdForMerchant, loyaltyMerchantcardsProductModel.createdForMerchant) &&
                Objects.equals(this.createdForStore, loyaltyMerchantcardsProductModel.createdForStore) &&
                Objects.equals(this.customer, loyaltyMerchantcardsProductModel.customer) &&
                Objects.equals(this.cardgroup, loyaltyMerchantcardsProductModel.cardgroup) &&
                Objects.equals(this.paymentContainer, loyaltyMerchantcardsProductModel.paymentContainer) &&
                Objects.equals(this.balance, loyaltyMerchantcardsProductModel.balance) &&
                Objects.equals(this.points, loyaltyMerchantcardsProductModel.points) &&
                Objects.equals(this.bonusBalance, loyaltyMerchantcardsProductModel.bonusBalance) &&
                Objects.equals(this.cashBalance, loyaltyMerchantcardsProductModel.cashBalance) &&
                Objects.equals(this.stockStatus, loyaltyMerchantcardsProductModel.stockStatus) &&
                Objects.equals(this.lockStatus, loyaltyMerchantcardsProductModel.lockStatus) &&
                Objects.equals(this.lastUsage, loyaltyMerchantcardsProductModel.lastUsage) &&
                Objects.equals(this.lastCharge, loyaltyMerchantcardsProductModel.lastCharge) &&
                Objects.equals(this.isBaseCard, loyaltyMerchantcardsProductModel.isBaseCard) &&
                Objects.equals(this.passcode, loyaltyMerchantcardsProductModel.passcode) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(card, merchant, createdForMerchant, createdForStore, customer, cardgroup, paymentContainer, balance, points, bonusBalance, cashBalance, stockStatus, lockStatus, lastUsage, lastCharge, isBaseCard, passcode, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoyaltyMerchantcardsProductModel {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    card: ").append(toIndentedString(card)).append("\n");
        sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
        sb.append("    createdForMerchant: ").append(toIndentedString(createdForMerchant)).append("\n");
        sb.append("    createdForStore: ").append(toIndentedString(createdForStore)).append("\n");
        sb.append("    customer: ").append(toIndentedString(customer)).append("\n");
        sb.append("    cardgroup: ").append(toIndentedString(cardgroup)).append("\n");
        sb.append("    paymentContainer: ").append(toIndentedString(paymentContainer)).append("\n");
        sb.append("    balance: ").append(toIndentedString(balance)).append("\n");
        sb.append("    points: ").append(toIndentedString(points)).append("\n");
        sb.append("    bonusBalance: ").append(toIndentedString(bonusBalance)).append("\n");
        sb.append("    cashBalance: ").append(toIndentedString(cashBalance)).append("\n");
        sb.append("    stockStatus: ").append(toIndentedString(stockStatus)).append("\n");
        sb.append("    lockStatus: ").append(toIndentedString(lockStatus)).append("\n");
        sb.append("    lastUsage: ").append(toIndentedString(lastUsage)).append("\n");
        sb.append("    lastCharge: ").append(toIndentedString(lastCharge)).append("\n");
        sb.append("    isBaseCard: ").append(toIndentedString(isBaseCard)).append("\n");
        sb.append("    passcode: ").append(toIndentedString(passcode)).append("\n");
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

