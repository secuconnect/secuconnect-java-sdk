package com.secuconnect.client.model;

import com.google.gson.annotations.SerializedName;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

/**
 * LoyaltyStoregroupsProductModel
 */
public class LoyaltyStoregroupsProductModel extends BaseProductModel {
    @SerializedName("merchant")
    private List<LoyaltyDTOMerchant> merchant = null;

    @SerializedName("stores")
    private List<LoyaltyDTOStore> stores = null;

    @SerializedName("created")
    private String created = null;

    @SerializedName("updated")
    private String updated = null;

    public LoyaltyStoregroupsProductModel merchant(List<LoyaltyDTOMerchant> merchant) {
        this.merchant = merchant;
        return this;
    }

    public LoyaltyStoregroupsProductModel addMerchantItem(LoyaltyDTOMerchant merchantItem) {
        if (this.merchant == null) {
            this.merchant = new ArrayList<LoyaltyDTOMerchant>();
        }
        this.merchant.add(merchantItem);
        return this;
    }

    /**
     * LoyaltyStoregroupsProductModel
     *
     * @return merchant
     **/
    public List<LoyaltyDTOMerchant> getMerchant() {
        return merchant;
    }

    public void setMerchant(List<LoyaltyDTOMerchant> merchant) {
        this.merchant = merchant;
    }

    public LoyaltyStoregroupsProductModel stores(List<LoyaltyDTOStore> stores) {
        this.stores = stores;
        return this;
    }

    public LoyaltyStoregroupsProductModel addStoresItem(LoyaltyDTOStore storesItem) {
        if (this.stores == null) {
            this.stores = new ArrayList<LoyaltyDTOStore>();
        }
        this.stores.add(storesItem);
        return this;
    }

    /**
     * LoyaltyStoregroupsProductModel
     *
     * @return stores
     **/
    public List<LoyaltyDTOStore> getStores() {
        return stores;
    }

    public void setStores(List<LoyaltyDTOStore> stores) {
        this.stores = stores;
    }

    public LoyaltyStoregroupsProductModel created(String created) {
        this.created = created;
        return this;
    }

    /**
     * Creation date
     *
     * @return created
     **/
    public String getCreated() {
        return created;
    }

    public void setCreated(String created) {
        this.created = created;
    }

    public LoyaltyStoregroupsProductModel updated(String updated) {
        this.updated = updated;
        return this;
    }

    /**
     * Update date
     *
     * @return updated
     **/
    public String getUpdated() {
        return updated;
    }

    public void setUpdated(String updated) {
        this.updated = updated;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) {
            return true;
        }
        if (o == null || getClass() != o.getClass()) {
            return false;
        }
        LoyaltyStoregroupsProductModel loyaltyStoregroupsProductModel = (LoyaltyStoregroupsProductModel) o;
        return Objects.equals(this.merchant, loyaltyStoregroupsProductModel.merchant) &&
                Objects.equals(this.stores, loyaltyStoregroupsProductModel.stores) &&
                Objects.equals(this.created, loyaltyStoregroupsProductModel.created) &&
                Objects.equals(this.updated, loyaltyStoregroupsProductModel.updated) &&
                super.equals(o);
    }

    @Override
    public int hashCode() {
        return Objects.hash(merchant, stores, created, updated, super.hashCode());
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("class LoyaltyStoregroupsProductModel {\n");
        sb.append("    ").append(toIndentedString(super.toString())).append("\n");
        sb.append("    merchant: ").append(toIndentedString(merchant)).append("\n");
        sb.append("    stores: ").append(toIndentedString(stores)).append("\n");
        sb.append("    created: ").append(toIndentedString(created)).append("\n");
        sb.append("    updated: ").append(toIndentedString(updated)).append("\n");
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

